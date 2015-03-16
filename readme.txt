How to start NaoService:
------------------------

Simply start the script 'NaoServiceApp.py' with python.
e.g.: 'python NaoServiceApp.py'

The following arguments are supported:
-h : show the help
-H : specify the host IP the service should run on (e.g. Nao: 191.168.0.139)
-p : specify the port (e.g. 8080)
-s : specify the server which should be used (e.g. cherrypy - fast, stable, written in C)
-l : specify the login tuple separated with ':' (e.g. user:pass). Use 'None' if you do not want authentication.
	 (If you dont use -l the standard login "user:password" is used.)

How to add own modules:
-----------------------

If you want to write own modules take a look at the
examples in /modules and add them as descripted in NaoServiceApp.py.
