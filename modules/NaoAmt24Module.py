import bottle
from modules.libs.WSDLWrapper import AuthWSDLWrapper
from bottle import view, static_file, auth_basic
from NaoService import check_auth

app = bottle.Bottle()

name = 'NaoAmt24Module'
path = '/amt24'
sub = []

wsdl = None

@app.route('/')
@app.route('/index.html')
@view('amt24')
@auth_basic(check_auth)
def index():
	return dict(path="/amt24/keyword")

@app.route('/keyword/:keyword#.+#')
@auth_basic(check_auth)
def keyword(keyword=""):
#	return "Hello world"
	global wsdl
	if wsdl is None:
		wsdl = AuthWSDLWrapper("amt24_wstest_sk", "ZnzaoWkS")
	return wsdl.get_for_keyword("https://zf3.egov.sachsen.de/auth-ws/zfinder-core-ws/common?wsdl", keyword)

# we need libraries for visualization
# so we have to serve them statically
@app.route('/jquery.min.js')
def send_static_jquery():
	return static_file('jquery.min.js', root='./modules/js')

@app.route('/jquery.corner.js')
def send_static_jquery_corner():
	return static_file('jquery.corner.js', root='./modules/js')

# and we want to use css files here
@app.route('/simple_layout.css')
def send_static_css_layout():
	return static_file('simple_layout.css',	 root='./modules/css')

@app.route('/amt24.png')
def send_image_a():
	return static_file('amt24.png', root='./modules/data')

@app.route('/nao.png')
def send_image_b():
	return static_file('nao.png', root='./modules/data')
