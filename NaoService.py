# -*- coding: utf-8 -*-
"""
NaoService is a small webservice based on Bottle (http://bottlepy.org/)
It is possible to add modules to check the status of the Nao Robot
or generate any kind if information about it. 
See the example implementation for these modules in '/modules'

Copyright (c) 2011, Max Leuthaeuser
License: GPL (see LICENSE.txt for details)
"""

__author__ = 'Max Leuthaeuser'
__license__ = 'GPL'

import sys
import bottle
from bottle import mount, route, static_file #@UnresolvedImport
from bottle import run, view

module_list = []

@route('/')
@route('/index.html')
@view('index_list')
def index():
	return dict(modules=module_list)
	
@route('/header.jpg')
def send_header_image():
	return static_file('header.jpg', root='modules/data')
	
@route('/simple_layout.css')
def send_static_css_layout():
	return static_file('simple_layout.css', root='modules/css')

class NaoService:
	class Module:
		'''
		Small value class to hold important data
		about a module we want to use.
		'''
		def __init__(self, name, path, subpages, shutdown_hook=None):
			self._name = name
			self._path = path
			self._subpages = subpages
			self._shutdown_hook = shutdown_hook
			
		def get_name(self):
			return self._name
		
		def get_path(self):
			return self._path
		
		def get_subpages(self):
			return self._subpages	
		
		def get_shutdown_hook(self):
			return self._shutdown_hook
	
	def __init__(self, host='localhost', port=8080, server=None, develop=False, debug=False):
		self._host = host
		self._port = port
		self._develop = develop
		self._debug = debug
		self._server = server
				
	def add_module(self, module):
		m = __import__(name="modules." + module, fromlist=['modules'])
		mount(m.app, m.path)
		if hasattr(m, "shutdown_hook"):
			module_list.append(self.Module(module, m.path, m.sub, m.shutdown_hook))
		else:
			module_list.append(self.Module(module, m.path, m.sub))
						
	def run_shutdown_hooks(self):
		for m in module_list:
			f = m.get_shutdown_hook()
			if f is not None:
				f()
			
	def start(self):
		try:
			bottle.debug(self._debug)
			if self._server is None:
				run(host=self._host, port=self._port, reloader=self._develop)
			else:
				run(host=self._host, port=self._port, server=self._server, reloader=self._develop)
		except KeyboardInterrupt:
			print "Running shutdown hooks..."
			self.run_shutdown_hooks()
			print "Terminated."
			sys.exit(0)