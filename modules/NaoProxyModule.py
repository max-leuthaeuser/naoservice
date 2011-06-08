import fileinput
from libs import CppHeaderParser
import bottle
from bottle import view, static_file
from naoqi import ALProxy
from modules.libs.CppHeaderToHtml import parseToHtml

app = bottle.Bottle()

name = 'NaoProxyModule'
path = '/proxy'
sub = []

bridge = ALProxy("ALPythonBridge", "localhost", 9559)

# Read all available proxies once
proxies = []
for p in fileinput.input(['modules/data/ALModules.txt']):
	proxies.append(p[:-1])
	
# we save all used proxies to
# create them lazy
proxy_cache = []

@app.route('/')
@app.route('/index.html')
@view('proxy_template')
def index():
	d = "All available ALModules provided by the NaoSDK are listed here. Select one and choose a method to run directly on the Nao."
	return dict(module=name, description=d, proxies=proxies, nargs="/proxy/nargs", interface="/proxy/interface", htmllist="/proxy/htmllist", list="/proxy/list", run="/proxy/run")

@app.route('/nargs/:proxyname/:method')
def nargs(proxyname="", method=""):
	'''
	Returns the number of arguments a method expects
	'''
	proxyname = proxyname.replace(" ", "")
	if not proxyname in proxies:
		return -1
	try:
		cppHeader = CppHeaderParser.CppHeader("modules/data/proxies/" + proxyname.lower() + "proxy.h")
	except CppHeaderParser.CppParseError:
		# error case, something is wrong with the header file
		return -1
	
	proxy = cppHeader.classes[proxyname + "Proxy"]
	m = [x for x in proxy["methods"]["public"] if x["name"] == method][0]
	return str(len(m["parameters"]))

@app.route('/htmllist/:proxyname')
def htmllist(proxyname=""):
	'''
	Returns a html formatted list of all method with their arguments
	for the given proxy
	'''
	proxyname = proxyname.replace(" ", "")
	if proxyname in proxies:
		filename = "modules/data/proxies/" + proxyname.lower() + "proxy.h"
		return parseToHtml(filename, proxyname)
	else:
		return "<b>This module is not available.</b>"
	
@app.route('/list/:proxyname')
def list(proxyname=""):
	'''
	Returns a comma separated list as string of all method with their arguments
	for the given proxy
	'''
	proxyname = proxyname.replace(" ", "")
	if not proxyname in proxies:
		return ""
	
	try:
		cppHeader = CppHeaderParser.CppHeader("modules/data/proxies/" + proxyname.lower() + "proxy.h")
	except CppHeaderParser.CppParseError:
		# error case, something is wrong with the header file
		return []
	proxy = cppHeader.classes[proxyname + "Proxy"]
	l = proxy["methods"]["public"]
	result = ""
	for s in l:
		result += s["name"] + ","
	return result[:-1]

@app.route('/run/:proxyname/:method/:params#.+#')
def run(proxyname="", method="", params=""):
	'''
	Runs a method with given parameters for a given proxy
	and returns a JSON string containing the return value, exceptions, std out and std err.
	
	@see: NaoSDK ALProxy.evalFull
	'''	
	proxyname = proxyname.replace(" ", "")
	if params != "()":
		params = params.replace('"', '\"')
		params = "(" + params.replace("&amp", " ") + ")"
		
	command = "%s.%s%s" % (proxyname.lower(), method, params)
	
	if not proxyname.lower() in proxy_cache:
		proxy_cache.append(proxyname.lower())
		new_proxy = "ALProxy('%s', 'localhost', 9559)" % proxyname
		bridge.eval(proxyname.lower() + "=" + new_proxy)		
						
	l = bridge.evalFull(command)
	
	return dict(returnvalue=l[0], exception=l[1], stdout=l[2], stderr=l[3])

@app.route('/interface/:proxyname/:method')
def interface(proxyname="", method=""):
	'''
	Builds an interface with input form elements
	for the given method for the given proxy.
	'''
	proxyname = proxyname.replace(" ", "")
	try:
		cppHeader = CppHeaderParser.CppHeader("modules/data/proxies/" + proxyname.lower() + "proxy.h")
	except CppHeaderParser.CppParseError:
		# error case, something is wrong with the header file
		return "Error while parsing the cpp header file"
	proxy = cppHeader.classes[proxyname.replace(" ", "") + "Proxy"]
	m = [x for x in proxy["methods"]["public"] if x["name"] == method][0]
	params = m["parameters"]
	result = "<b>%s.%s</b><br /><table border='0'>" % (proxyname, method)
	i = 1
	for p in params:	
		result += "<tr>"
		result += "<td>%s : <i>%s</i></td>" % (p["name"], p["type"])
		input = "input%i" % i
		result += "<td><input id='%s' type='text' /></td>" % input
		result += "<tr>"
		i = i + 1
	result += "</table>"
	return result	
		
# we need libraries for visualization
# so we have to serve them statically
@app.route('/jquery.min.js')
def send_static_jquery():
	return static_file('jquery.min.js', root='./modules/js')

@app.route('/jquery.autocomplete.js')
def send_static_jquery_autocomplete():
	return static_file('jquery.autocomplete.js', root='./modules/js')

# and we want to use css files here
@app.route('/simple_layout.css')
def send_static_css_layout():
	return static_file('simple_layout.css', root='./modules/css')

@app.route('/jquery.autocomplete.css')
def send_static_css_auto():
	return static_file('jquery.autocomplete.css', root='./modules/css')
