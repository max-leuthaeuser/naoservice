from NaoService import NaoService
from optparse import OptionParser

DEFAULT_HOST = "localhost"
DEFAULT_PORT = "8080"
DEFAULT_SERVER = None
DEFAULT_LOGIN = "12dea96fec20593566ab75692c9949596833adc9", "5baa61e4c9b93f3f0682250b6cf8331b7ee68fd8"

def main():
	usage = "usage: %prog [options] arg"
	parser = OptionParser(usage)
	parser.add_option("-H", "--host", dest="host", help="set the host adress to HOST")
	parser.add_option("-p", "--port", dest="port", help="set the port to PORT")
	parser.add_option("-s", "--server", dest="server", help="set the server adapter that should be used. (e.g. 'cherrypy')")
	parser.add_option("-l", "--login", dest="login", help="specify the login tuple separated with ':' (e.g. user:pass) Use 'None' if you do not want authentication.")
	
	(options, args) = parser.parse_args() #@UnusedVariable
	
	host = ''
	port = ''
	server = ''
	login = None
	
	if not options.host:
		print "Using default host (%s)" % DEFAULT_HOST
		host = DEFAULT_HOST
	else:
		print "Using host '%s'" % options.host
		host = options.host
		
	if not options.port:
		print "Using default port (%s)" % DEFAULT_PORT
		port = DEFAULT_PORT
	else:
		print "Using port '%s'" % options.port
		port = options.port
		
	if not options.server:
		print "Using default server"
		server = DEFAULT_SERVER
	else:
		print "Using server '%s'" % options.server
		server = options.server
		
	if not options.login:
		print "Using default login"
		login = DEFAULT_LOGIN
	else:
		if options.login == "None":
			print "Warning: Authentication disabled!"
			login = None
		else:
			print "Authentication enabled"
			login = options.login.split(":")
		
	# create a new NaoService
	service = NaoService(host=host, port=port, server=server, login=login)
	# add all modules you want to use
	service.add_module('NaoSensorModule')
	service.add_module('NaoBatteryModule')
	service.add_module('NaoProxyModule')
	service.add_module('NaoStreamModule')
	service.add_module('NaoProfilingModule')
	# and run the service now
	service.start()

if __name__ == "__main__":
	main()
