import bottle
from bottle import view, static_file
from naoqi import ALProxy

app = bottle.Bottle()

name = 'NaoBatteryModule'
path = '/bat'
sub = ['/chargingRate']

# This proxy is used to gain access to all
# sensor values of the Nao through NaoQi
memProxy = ALProxy("ALMemory", "localhost", 9559)

@app.route('/')
@app.route('/index.html')
@view('ref_list')
def index():
	return dict(name=name, path=path, subs=sub)
	
@app.route('/header.jpg')
def send_header_image():
	return static_file('header.jpg', root='./modules/data')
	
@app.route('/simple_layout.css')
def send_static_css_layout():
	return static_file('simple_layout.css', root='./modules/css')

# we need libraries for visualization
# so we have to serve them statically
@app.route('/highcharts.js')
def send_static_highchart():
	return static_file('highcharts.js', root='./modules/js', mimetype='text/javascript')

@app.route('/jquery.min.js')
def send_static_jquery():
	return static_file('jquery.min.js', root='./modules/js', mimetype='text/javascript')

@app.route('/chargingRate')
@view('line_chart_dynamic')
def bat_level_dynamic():
	d = 'Current charging rate ((CellVoltageMin + CellVoltageMax) * 3 * currentAmparage)'
	# we use the method 'charging_data()' here (under '/bat/chargingRate/data' see above) for 'values'
	# to generate data with every GET request we retrieve from view 'line_chart_dynamic'.
	return dict(module=name, description=d, values='/bat/chargingRate/data', x_axis='time', y_axis='mW')

@app.route('/chargingRate/data')
def charging_data():
	voltMin = memProxy.getData("Device/SubDeviceList/Battery/Charge/Sensor/CellVoltageMin")
	voltMax = memProxy.getData("Device/SubDeviceList/Battery/Charge/Sensor/CellVoltageMax")
	amperage = memProxy.getData("Device/SubDeviceList/Battery/Current/Sensor/Value")
	return str(((voltMax+voltMin) * 3 * amperage))
