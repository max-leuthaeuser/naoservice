from NaoService import NaoService
from optparse import OptionParser

DEFAULT_HOST = "localhost"
DEFAULT_PORT = "8080"
DEFAULT_SERVER = None

def main():
	usage = "usage: %prog [options] arg"
	parser = OptionParser(usage)
	parser.add_option("-H", "--host", dest="host", help="set the host adress to HOST")
	parser.add_option("-p", "--port", dest="port", help="set the port to PORT")
	parser.add_option("-s", "--server", dest="server", help="set the server adapter that should be used. (e.g. 'cherrypy')")
	
	(options, args) = parser.parse_args()
	
	host = ''
	port = ''
	server = ''
	
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
		
	# create a new NaoService
	service = NaoService(host=host, port=port, server=server, debug=True)
	# add all modules you want to use
	service.add_module('NaoSensorModule')
	service.add_module('NaoBatteryModule')
	service.add_module('NaoMemoryModule')
	service.add_module('NaoProxyModule')
	# and run the service now
	service.start()

if __name__ == "__main__":
	main()
