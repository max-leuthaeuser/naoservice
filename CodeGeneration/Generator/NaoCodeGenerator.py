# -*- coding: utf-8 -*-
"""
Copyright (c) 2011, Max Leuthaeuser
License: GPL (see LICENSE.txt for details)
"""

__author__ = 'Max Leuthaeuser'
__license__ = 'GPL'

import fileinput
from abc import ABCMeta
from abc import abstractmethod
from UserString import MutableString

class NaoCodeGenerator:
	'''
	Subclass NaoCodeGenerator to generate source code for any language to run
	methods remotely with the Nao web service (NaoService). All code will be
	generated from the Nao SDK/API.
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
	_mapping = {}
	
	def __init__(self, mapping_path=None):
		if mapping_path is not None:
			self.set_mapping(self.read_mapping(mapping_path))
				
	def read_mapping(self, filename):
		'''
		Reads a mapping from file.
		Mapping should look like this:
		C++-Token=Java-Token
		
		@arg filename: path to the file where the mapping is in
		@return: a dict containing the mapping
		'''
		mapping = {}
		for p in fileinput.input([filename]):
			k, v = p[:-1].split('=')
			mapping[k] = v
		return mapping
	
	def read_from_file(self, path):
		'''
		Returns a string out of a file at the given path.
		This method should be used to fill gaps in the code
		generation.
		
		@see: Generator Gap Pattern (IBM)
		@param path: the path to the file to read 
		@return: a string out of the file at the given path
		@raise ValueError: if path is empty or None 
		'''
		def _list_to_string(list):
			'''
			Small helper method which transforms a list
			to a string object
			
			@param list: the list to transform
			@return: a string object build out of the list 
			'''
			result = MutableString()
			result += "\n".join(list)
			return str(result)
		
		if path != "" and path is not None:
			content = []
			map(content.append, [x[:-1] for x in fileinput.input([path])])
			return _list_to_string(content)
		else:
			raise ValueError("Path must not be empty or None!")
	
	@abstractmethod
	def generate_code(self):
		'''
		Run the actual code generation. You need to implement this method
		in your specific code generator which inherits from this class.
		
		@return: the generated code as list
		'''
		pass
			
	def translate(self, token):
		'''
		Translates a given token to the targeted language.
		
		@arg token: token as string you want to translate
		@return: the translated token as string
		@raise ValueError: if the requested token was not found or it is None
		'''
		if token is None:
			raise ValueError('The token must not be None!')
		
		if token in self._mapping:
			return self._mapping[token]
		else:
			raise ValueError('This token cannot be translated because it is not in the mapping: ' + token)
		
	def set_mapping(self, mapping):
		'''
		Sets a new code-to-code mapping.
		
		@arg mapping: a dict with the actual mapping from code to code. It is
		not allowed to set None as mapping.
		@raise ValueError: if the provided arg mapping is None
		'''
		if mapping is None:
			raise ValueError('The mapping should not be None!')
		self._mapping = mapping