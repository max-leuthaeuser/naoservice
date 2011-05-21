import bottle
import random
from bottle import view, static_file

app = bottle.Bottle()

name = 'NaoBatteryModule'
path = '/bat'
sub = ['/level_static', '/level_dynamic', '/info']

@app.route('/')
@app.route('/index.html')
@view('ref_list')
def index():
	return dict(name=name, path=path, subs=sub)

# we need libraries for visualization
# so we have to serve them statically
@app.route('/jscharts.js')
def send_static_jschart():
	return static_file('jscharts.js', root='./modules/js', mimetype='text/javascript')

@app.route('/highcharts.js')
def send_static_highchart():
	return static_file('highcharts.js', root='./modules/js', mimetype='text/javascript')

@app.route('/jquery.min.js')
def send_static_jquery():
	return static_file('jquery.min.js', root='./modules/js', mimetype='text/javascript')

# using some random values in this examples
# real application should retrieve the actual
# values from Nao python API
@app.route('/level_static')
@view('line_chart_static')
def bat_level_static():
	v = [[2,50],[4,42],[8,38],[16,25],[32,2]]
	d = 'Showing the last %s battery values:' % (str(len(v)))
	return dict(module=name, description=d, values=v, x_axis='time in min', y_axis='power in watt')

@app.route('/level_dynamic/data')
def data():
	random.seed()
	return str(random.randint(0,100))

@app.route('/level_dynamic')
@view('line_chart_dynamic')
def bat_level_dynamic():
	d = 'Showing live battery values:'
	# we use the method 'data()' here (under '/bat/level_dynamic/data' see above) for 'values'
	# to generate data with every GET request we retriev from view 'line_chart_dynamic'.
	return dict(module=name, description=d, values='/bat/level_dynamic/data', x_axis='time', y_axis='power in watt')
	
@app.route('/info')
def bat_info():
	return "some battery info"