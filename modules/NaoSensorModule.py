import bottle
import fileinput
import random
from bottle import view, static_file
from naoqi import ALProxy

app = bottle.Bottle()

name = 'NaoSensorModule'
path = '/sensor'
sub = []

# This proxy is used to gain access to all
# sensor values of the Nao through NaoQi
memProxy = ALProxy("ALMemory", "localhost", 9559)

# Read all available sensor values once
# This is done here only for testing purposes.
# Later they should be loaded from the Nao API directly!
sensors = []
for line in memProxy.getDataListName():
	sensors.append(line)

#for line in fileinput.input(['./modules/data/nao-sensors.txt']):
#s	sensors.append(line[:-1]) 
	
# this are all available diagram representation types
types = ["area", "areaspline", "bar", "column", "line", "scatter", "spline"]

@app.route('/')
@app.route('/index.html')
@view('sensor_template')
def index():
	d = "All available sensor values provided by ALMemory are listed here. Select one and choose a appropriate graphical representation."
	return dict(module=name, description=d, values=sensors, types=types, value="/sensor/value", string="/sensor/string", check="/sensor/check")

@app.route('/check/:sensor#.+#')
def check(sensor=""):
	try:
		memProxy.getData(sensor)
		return "OK"
	except RuntimeError:
		return "ERROR"

@app.route('/value/:sensor#.+#')
def value(sensor=""):
	return str(memProxy.getData(sensor))

@app.route('/string/:sensor#.+#')
def string(sensor=""):
	try:
		return str(memProxy.getData(sensor))
	except RuntimeError,e:
		return "Unable to find sensor '%s'<br /><p><b>Stacktrace:</b><br /><i>%s</i></p>" % (sensor,e)
	#return "A random string as return from %s" % sensor
	
# we need libraries for visualization
# so we have to serve them statically
@app.route('/jquery.min.js')
def send_static_jquery():
	return static_file('jquery.min.js', root='./modules/js')

@app.route('/jquery.autocomplete.js')
def send_static_jquery_autocomplete():
	return static_file('jquery.autocomplete.js', root='./modules/js')

@app.route('/highcharts.js')
def send_static_highchart():
	return static_file('highcharts.js', root='./modules/js', mimetype='text/javascript')

# and we want to use css files here
@app.route('/simple_layout.css')
def send_static_css_layout():
	return static_file('simple_layout.css', root='./modules/css')

@app.route('/jquery.autocomplete.css')
def send_static_css_auto():
	return static_file('jquery.autocomplete.css', root='./modules/css')