import bottle
from bottle import view, static_file

app = bottle.Bottle()

name = 'NaoMemoryModule'
path = '/mem'
sub = ['/status']

@app.route('/')
@app.route('/index.html')
@view('ref_list')
def index():
	return dict(name=name, path=path, subs=sub)

# we need a library for visualization
# so we have to serve is statically
@app.route('/jscharts.js')
def send_static():
	return static_file('jscharts.js', root='./modules/js', mimetype='text/javascript')

@app.route('/status')
@view('pie_chart')
def bat_level():
	# using some random values here
	# real application should retrieve the actual
	# values from Nao python API
	v = [["'Free'", 80], ["'Used'", 5], ["'Cached'", 15]]
	d = 'Showing the current memory status:'
	return dict(module=name, description=d, values=v)
