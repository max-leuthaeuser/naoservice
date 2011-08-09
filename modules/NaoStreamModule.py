import sys
sys.path.append('modules/libs/gevent')
sys.path.append('modules/libs/greenlet')
from gevent import monkey; monkey.patch_all()

import StringIO
import bottle
import time
import base64
import vision_definitions
from PIL import Image
from bottle import view, get, static_file #@UnresolvedImport
from naoqi import ALProxy

app = bottle.Bottle()

name = 'NaoStreamModule'
path = '/stream'
sub = ['/image_stream/1000', '/image_latest/1', '/image_stream_gui']

cam_proxy = ALProxy("ALVideoDevice", "localhost", 9559)
# Register a Generic Video Module (G.V.M.) to the V.I.M.
resolution = vision_definitions.kQVGA  # 320 * 240
colorSpace = vision_definitions.kRGBColorSpace
# empty string means there is no cam, hence no subscription was done yet
cam_id = ""

@app.route('/')
@app.route('/index.html')
@view('ref_list')
def index():
	return dict(name=name, path=path, subs=sub)
	
@app.route('/header.jpg')
def send_header_image():
	return static_file('header.jpg', root='./modules/data')

def unsubscribe():
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
def image_stream_gui():
	return dict(path="http://192.168.0.139:8070/stream/image_latest")
	# return dict(path="http://localhost:8080/stream/image_latest")

@app.route('/image_stream/:interval')
def image_stream(interval=1000): # interval in ms
	i = int(interval) / 1000
	while(1):
		try:
			yield image_latest("0")
			# image separator
			yield "#"
			time.sleep(i)
		except:
			print "streaming client is gone..."
			break
		
@app.get('/image_latest/:camera')
def image_latest(camera):
	global cam_id
	# we only subscribe if this was not already done
	if cam_id == "":
		cam_id = cam_proxy.subscribe(name, resolution, colorSpace, 5)
	# setting the camera device
	# id = 0 means top camera, id = 1 bottom camera
	cam_proxy.setParam(vision_definitions.kCameraSelectID, int(camera) - 1)
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
	im.save(f, "JPEG", quality=20)
	return _handle_binary_data(f.getvalue())
	
#	for testing with webcam locally
#	cam = Device(devnum=0)
#	cam.setResolution(320, 240)
#	print "Taking image"
#	im = cam.getImage()
#	print "sending to client"
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
