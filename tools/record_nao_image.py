import sys
import os
import time
import vision_definitions
from PIL import Image
from naoqi import ALProxy
from optparse import OptionParser

DEFAULT_HOST = "192.168.0.139"
DEFAULT_PORT = "9559"
DEFAULT_CAMERA = 0
DEFAULT_RESOLUTION = vision_definitions.kQVGA  # 320 * 240
DEFAULT_FRAMERATE = 10
AVAILABLE_CAMERAS = ("top", "bottom")
AVAILABLE_RESOLUTIONS = ("160*120", "320*240", "640*480")

DEFAULT_QUALITY = 25

verbose = False

videoproxy = None
imgclient = None

def save_image(path):
	# image is an array containing image information:
	# [0] : width;
	# [1] : height;
	# [2] : number of layers;
	# [3] : ColorSpace;
	# [4] : time stamp (highest 32 bits);
	# [5] : time stamp (lowest 32 bits);
	# [6] : array of size height * width * nblayers containing image data;
	# [7] : camera ID
	image = videoproxy.getImageRemote(imgclient)
	# Create a PIL Image from the pixel array:
	im = Image.fromstring("RGB", (image[0], image[1]), image[6])
	filename = "/%.6f.jpeg" % time.time()
	im.save(path + filename, "JPEG", quality=DEFAULT_QUALITY)
	if verbose:
		print "Image saved: %s" % filename

def start_saving_images(host, port, camera, resolution, framerate, path):
	# we need to register
	register_image_client(host, port, camera, resolution, framerate)	
	try:
		# now we can start
		print "Starting... (stop with Ctrl + C)"
		last_time = time.time()
		while(1):
			save_image(path)
			new_time = time.time()
			sleep_time = ((1000.0 / int(framerate)) - (new_time - last_time)) / 1000.0
			if sleep_time > 0:
				time.sleep(sleep_time)
			last_time = new_time
	except KeyboardInterrupt:
		print "Stopping..."
		unregister_image_client()
		print "Terminated."
		sys.exit(0)
	
def register_image_client(host, port, camera, resolution, framerate):
	global videoproxy
	global imgclient
	videoproxy = ALProxy("ALVideoDevice", host, int(port))
	colorspace = vision_definitions.kRGBColorSpace
	imgclient = videoproxy.subscribe("_client", resolution, colorspace, framerate)
	videoproxy.setParam(vision_definitions.kCameraSelectID, camera)

def unregister_image_client():
	videoproxy.unsubscribe(imgclient)
	
def simulate_remote(host, port, path, file, framerate):
	fileproxy = ALProxy("ALFileManager", host, int(port))
	if not fileproxy.fileExists(file):
		print "File '%s' could not be found on the Nao!" % file
		sys.exit(2)
	else:
		image = fileproxy.getFileContents(file)
		# Create a PIL Image from the pixel array:
		im = Image.fromstring("RGB", (image[0], image[1]), image[6])
		try:
			# now we can start
			print "Starting... (stop with Ctrl + C)"
			last_time = time.time()
			while(1):
				filename = "/%.6f.jpeg" % time.time()
				im.save(path + filename, "JPEG", quality=DEFAULT_QUALITY)
				if verbose:
					print "Image saved: %s" % filename
				new_time = time.time()
				sleep_time = ((1000.0 / int(framerate)) - (new_time - last_time)) / 1000.0
				if sleep_time > 0:
					time.sleep(sleep_time)
				last_time = new_time
		except KeyboardInterrupt:
			print "Stopping..."
			print "Terminated."
			sys.exit(0)	


def simulate_local(path, file, framerate):
	if not os.path.exists(file):
		print "File '%s' could not be found locally!" % file
		sys.exit(2)
	else:
		image = Image.open(file)
		try:
			# now we can start
			print "Starting... (stop with Ctrl + C)"
			last_time = time.time()
			while(1):
				filename = "/%.6f.jpeg" % time.time()
				image.save(path + filename, "JPEG", quality=DEFAULT_QUALITY)
				if verbose:
					print "Image saved: %s" % filename
				new_time = time.time()
				sleep_time = ((1000.0 / int(framerate)) - (new_time - last_time)) / 1000.0
				if sleep_time > 0:
					time.sleep(sleep_time)
				last_time = new_time
		except KeyboardInterrupt:
			print "Stopping..."
			print "Terminated."
			sys.exit(0)	

def handle_options(options):
	host = DEFAULT_HOST
	port = DEFAULT_PORT
	camera = DEFAULT_CAMERA
	resolution = DEFAULT_RESOLUTION
	framerate = DEFAULT_FRAMERATE
	path = ''

	if not options.host:
		print "Using default host (%s)" % DEFAULT_HOST
	else:
		print "Using host '%s'" % options.host
		host = options.host
		
	if not options.port:
		print "Using default port (%s)" % DEFAULT_PORT
	else:
		print "Using port '%s'" % options.port
		port = options.port
		
	if not options.camera:
		print "Using default camera (%s)" % AVAILABLE_CAMERAS[DEFAULT_CAMERA]
	else:
		print "Using camera '%s'" % AVAILABLE_CAMERAS[options.camera]
		camera = options.camera
		
	if not options.resolution:
		print "Using default resolution (%s)" % AVAILABLE_RESOLUTIONS[DEFAULT_RESOLUTION]
	else:
		print "Using resolution '%s'" % AVAILABLE_RESOLUTIONS[options.camera]
		resolution = options.resolution
		
	if not options.framerate:
		print "Using default framerate (%s)" % DEFAULT_FRAMERATE
	else:
		print "Using framerate '%s'" % options.framerate
		framerate = options.framerate
		
	if not options.target:
		print "You need to provide a path to safe the files somewhere! (use --target)"
		print "For help use --help"
		sys.exit(2)
	else:
		if os.path.isdir(options.target):
			print "Using path '%s'" % options.target
			path = options.target
		else:
			print "You need to provide an existing path to a directory! (use --target)"
			print "For help use --help"
			sys.exit(2)
			
	if options.verbose:
		global verbose
		verbose = True
			
	if options.simulateremote:
		print "Using remote simulation mode with file '%s'" % options.simulateremote
		simulate_remote(host, port, path, options.simulateremote, framerate)
		return
	
	if options.simulatelocal:
		print "Using local simulation mode with file '%s'" % options.simulatelocal
		simulate_local(path, options.simulatelocal, framerate)
		return
			
	start_saving_images(host, port, camera, resolution, framerate, path)
	
def optional_arg(arg_default="None"):
	def func(option, opt_str, value, parser):
		if parser.rargs and not parser.rargs[0].startswith('-'):
			val = parser.rargs[0]
			parser.rargs.pop(0)
		else:
			val = arg_default
		setattr(parser.values, option.dest, val)
	return func

def main():
	usage = "usage: %prog [options] args"
	parser = OptionParser(usage)
	parser.add_option("-H", "--host", dest="host", help="set the host IP adress")
	parser.add_option("-P", "--port", dest="port", help="set the port")
	parser.add_option("-c", "--camera", dest="camera", help="set the camera number (0 = top or 1 = bottom)")
	parser.add_option("-f", "--framerate", dest="framerate", help="set the frame rate")
	parser.add_option("-r", "--resultion", dest="resolution", help="set the resolution (0 = 160*120, 1 = 320*240, 2 = 640*480)")
	parser.add_option("-t", "--target", dest="target", help="set target path to save the images in it")
	parser.add_option("--sr", dest="simulateremote", help="set a file to save instead of using the camera (remote)")
	parser.add_option("--sl", dest="simulatelocal", help="set a file to save instead of using the camera (local)")
	parser.add_option("-v", "--verbose", dest="verbose", action='callback', callback=optional_arg(), help="print a status update every time a file is saved.")
	
	(options, args) = parser.parse_args() #@UnusedVariable
	
	handle_options(options)

if __name__ == "__main__":
	main()
