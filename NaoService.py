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

import bottle
from bottle import mount, route
from bottle import run, view

module_list = []

@route('/')
@route('/index.html')
@view('index_list')
def index():
	return dict(modules=module_list)

class NaoService:
	class Module:
		'''
		Small value class to hold important data
		about a module we want to use.
		'''
		def __init__(self, name, path, subpages):
			self._name = name
			self._path = path
			self._subpages = subpages
			
		def get_name(self):
			return self._name
		
		def get_path(self):
			return self._path
		
		def get_subpages(self):
			return self._subpages	
	
	def __init__(self, host='localhost', port=8080, server=None, develop=False, debug=False):
		self._host = host
		self._port = port
		self._develop = develop
		self._debug = debug
		self._server = server
				
	def add_module(self, module):
		m = __import__(name="modules." + module, fromlist=['modules'])
		mount(m.app, m.path)
		module_list.append(self.Module(module, m.path, m.sub))
						
	def start(self):
		bottle.debug(self._debug)
		if self._server is None:
			run(host=self._host, port=self._port, reloader=self._develop)
		else:
			run(host=self._host, port=self._port, server=self._server, reloader=self._develop)
