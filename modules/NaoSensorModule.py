import bottle
import time
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
# using the ALMemory from the ALProxy.
sensors = []
for line in memProxy.getDataListName():
	sensors.append(line)

# this are all available diagram representation types
types = ["area", "areaspline", "bar", "column", "line", "scatter", "spline"]

@app.route('/')
@app.route('/index.html')
@view('sensor_template')
def index():
	d = "All available sensor values provided by ALMemory are listed here. Select one and choose a appropriate graphical representation."
	return dict(module=name, description=d, values=sensors, types=types, value="/sensor/value", multiple="/sensor/multiple", string="/sensor/string", check="/sensor/check")

@app.route('/check/:sensor#.+#')
def check(sensor=""):
	'''
	This functions validates the incoming GET request
	(which is a sensortype name). If ALMemory knows
	it "OK" is returned, "ERROR" otherwise
	
	@arg sensor="" the sensortype name to validate with ALMemory
	@returns "OK" if ALMemory knows this sensortyp, "ERROR" otherwise
	'''
	try:
		memProxy.getData(sensor)
		return "OK"
	except RuntimeError:
		return "ERROR"

@app.route('/value/:sensor#.+#')
def value(sensor=""):
	'''
	Takes a sensortype name and returns it value from ALMemory.
	WARNING: it is recommended to call check(sensor) first. See above.
	
	@arg sensor="" : the sensortype name from which the value should be returned
	@returns a string representation of the sensortype name value from ALMemory
	'''
	return str(memProxy.getData(sensor))

@app.route('/string/:sensor#.+#')
def string(sensor=""):
	'''
	Takes a sensortype name and returns it value from ALMemory.
	WARNING: this is basically the same as value(sensor) from above
	but does the checking by itself.
	
	@arg sensor="" : the sensortype name from which the value should be returned
	@returns a string representation of the sensortype name value from ALMemory
	'''
	try:
		return str(memProxy.getData(sensor))
	except RuntimeError, e:
		return "Unable to find sensor '%s'<br /><p><b>Stacktrace:</b><br /><i>%s</i></p>" % (sensor, e)

@app.route('/multiple/:arr')
def multiple(arr=""):
	'''
	Takes a array of sensor names (as ID) and return their values from ALMemory.
	
	@arg sensors="" : an array of sensor names (as ID) from which the values should be returned
	@returns a json object (as dict here) of the sensor values from ALMemory + a timestamp
	'''
	ids = arr.split("+")
	result = dict()
	for v in ids:
		value = sensors[int(v)]
		result[value] = string(value)
	result['timestamp'] = "%.6f" % time.time()
	return result
	
# we need libraries for visualization
# so we have to serve them statically
@app.route('/jquery.min.js')
def send_static_jquery():
	return static_file('jquery.min.js', root='./modules/js')

@app.route('/jquery.autocomplete.js')
def send_static_jquery_autocomplete():
	return static_file('jquery.autocomplete.js', root='./modules/js')

@app.route('/jquery.dualListBox-1.3.min.js')
def send_static_jquery_list():
	return static_file('jquery.dualListBox-1.3.min.js', root='./modules/js')

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
