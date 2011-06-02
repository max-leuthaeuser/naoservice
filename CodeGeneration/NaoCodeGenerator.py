# -*- coding: utf-8 -*-
"""
NaoCodeGenerator is able to generate sourcecode for any language to run
methods remotely with the Nao webservice (NaoService). All methods are
generated from the Nao API.

Copyright (c) 2011, Max Leuthaeuser
License: GPL (see LICENSE.txt for details)
"""

__author__ = 'Max Leuthaeuser'
__license__ = 'GPL'

from abc import ABCMeta
from abc import abstractmethod

class NaoCodeGenerator:
	'''
	Abstract base class which defines all required methods to generate
	source code in your language of choice from the Nao API.
	'''
	
	'''
	This class is an abstract base class. You cannot instantiate this class.
	Write subclasses and implement all methods marked with '@abstractmethod'.
	@see http://docs.python.org/library/abc.html
	'''
	__metaclass__ = ABCMeta

	'''
	This variable stores the mapping from C++ tokens to the targeted language
	you want to generate. See the JavaNaoCodeGenerator which comes with the
	NaoService to get an example.
	'''
	_mapping = dict()
	
	'''
	Add all required imports here if your language needs them to run the
	generated code. See the JavaNaoCodeGenerator which comes with the
	NaoService to get an example. Leave it empty if no imports are needed. 
	'''
	_imports = []
	
	def __init__(self, imports=[]):
		'''
		Constructor for NaoCodeGenerator.
		
		@arg imports: a string containing all required imports here if your
		language needs them to run the generated code. This can be an empty.
		'''
		if imports:
			self._imports = imports
			
	def read_mapping(self, filename):
		'''
		Reads a mapping from file.
		
		@arg filename: path to the file where the mapping is in
		'''
		import fileinput
		for p in fileinput.input([filename]):
			k, v = p[:-1].split('=')
			self._mapping[k] = v	
	
	@abstractmethod
	def generateCode(self):
		'''
		Run the actual code generation. You need to implement this method
		in your specific code generator which inherits from this class.
		
		@return: the generated code a simple string
		'''
		pass
		
	@abstractmethod
	def get_request_code(self):
		'''
		Return the code statically which is responsible to trigger the
		actual request via web to the NaoService. You need to implement
		this method in your specific code generator which inherits
		from this class.
		
		@return: the code which is responsible to trigger the actual request
		via web to the NaoService
		'''
		pass
	
	def translate(self, token):
		'''
		Translates a given token to the targeted language.
		
		@arg token: token as string you want to translate
		@return: the translated token as string
		'''
		if token in self._mapping:
			return self._mapping[token]
		else:
			raise ValueError('This token cannot be translated because it is not in the mapping: ' + token)
		
	def set_mapping(self, mapping):
		'''
		Sets a new code-to-code mapping.
		
		@arg mapping: a dict with the actual mapping from code to code. It is
		not allowed to set an empty mapping or None.
		@raise ValueError: if the provided arg mapping is None or empty
		'''
		if mapping is None or len(mapping) == 0:
			raise ValueError('The mapping should not be None or empty!')
		self._mapping = mapping
		
