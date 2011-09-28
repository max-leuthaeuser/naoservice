import StringIO
import bottle
import base64
import vision_definitions
from PIL import Image
from bottle import view, static_file, auth_basic
from naoqi import ALProxy
from NaoService import check_auth

app = bottle.Bottle()

name = 'NaoStreamModule'
path = '/stream'
sub = ['/image_latest/1', '/image_stream_gui']

cam_proxy = None
# Register a Generic Video Module (G.V.M.) to the V.I.M.
resolution = vision_definitions.kQVGA  # 320 * 240
colorSpace = vision_definitions.kRGBColorSpace
# empty string means there is no cam, hence no subscription was done yet
cam_id = ""

@app.route('/')
@app.route('/index.html')
@view('ref_list')
@auth_basic(check_auth)
def index():
	return dict(name=name, path=path, subs=sub)
	
@app.route('/header.jpg')
def send_header_image():
	return static_file('header.jpg', root='./modules/data')

def unsubscribe():
	if cam_proxy:
		cam_proxy.unsubscribe(name)

shutdown_hook = unsubscribe

def _handle_binary_data(s):
	'''
	Small helper method to convert a string to base64 encoding
	if needed.
	
	@arg s: string to get converted
	@return: the string in base64 encoding if needed
	'''
	try:
		# try to decode it with utf8
		# if this is not possible we convert it to base64
		# e.g. to be able to transfer it with JSON
		s.decode('utf8')
	except UnicodeDecodeError:
		return base64.b64encode(s)
	else:
		return s

@app.route('/image_stream_gui')
@view('image_stream')
@auth_basic(check_auth)
def image_stream_gui():
	return dict(path="/stream/image_latest")

def image_stream(interval=1000): # interval in ms
	raise DeprecationWarning("Do not use this method. Use image_latest instead!")
	# i = int(interval) / 1000
	# while(1):
		# try:
			# yield image_latest("1")
			# image separator
			# yield "#"
			# time.sleep(i)
		# except:
			# print "streaming client is gone..."
			# break

#cam = Device(devnum=0)
#cam.setResolution(320, 240)

@app.get('/image_latest/:camera')
@auth_basic(check_auth)
def image_latest(camera):
	global cam_id
	global cam_proxy
	# we only register if this was not already done
	if cam_proxy == None:
		cam_proxy = ALProxy("ALVideoDevice", "localhost", 9559)
		# setting the camera device
		# id = 0 means top camera, id = 1 bottom camera
		cam_proxy.setParam(vision_definitions.kCameraSelectID, int(camera) - 1)	
	# we only subscribe if this was not already done
	if cam_id == "":
		cam_id = cam_proxy.subscribe(name, resolution, colorSpace, 5)
	# image is an array containing image information:
	# [0] : width;
	# [1] : height;
	# [2] : number of layers;
	# [3] : ColorSpace;
	# [4] : time stamp (highest 32 bits);
	# [5] : time stamp (lowest 32 bits);
	# [6] : array of size height * width * nblayers containing image data;
	# [7] : camera ID
	image = cam_proxy.getImageRemote(cam_id)
	# Create a PIL Image from the pixel array:
	im = Image.fromstring("RGB", (image[0], image[1]), image[6])
	f = StringIO.StringIO()
	im.save(f, "JPEG", quality=25)
	return _handle_binary_data(f.getvalue())

#	im = cam.getImage()
#	f = StringIO.StringIO()
#	im.save(f, "JPEG", quality=20)
#	return _handle_binary_data(f.getvalue())

# we need libraries for visualization
# so we have to serve them statically
@app.route('/jquery.min.js')
def send_static_jquery():
	return static_file('jquery.min.js', root='./modules/js')

# and we want to use css files here
@app.route('/simple_layout.css')
def send_static_css_layout():
	return static_file('simple_layout.css', root='./modules/css')

@app.route('/qualitune.png')
def send_image_a():
	return static_file('qualitune.png', root='./modules/data')

@app.route('/nao.png')
def send_image_b():
	return static_file('nao.png', root='./modules/data')
