# -*- coding: utf-8 -*-
"""
Copyright (c) 2011, Max Leuthaeuser
License: GPL (see LICENSE.txt for details)
"""

__author__ = 'Max Leuthaeuser'
__license__ = 'GPL'

from abc import ABCMeta
from abc import abstractmethod
from NamedElement import NamedElement

class Operation(NamedElement):
    '''
    Operation defines a simple meta class for operations like
    methods and functions.
    '''
    
    '''
    This class is an abstract base class. You cannot instantiate this class.
    Write subclasses and implement all methods marked with '@abstractmethod'.
    @see http://docs.python.org/library/abc.html
    '''
    __metaclass__ = ABCMeta
    
    _body = ""
    _arguments = []
    _return_type = None
    
    def __init__(self, name, body, return_type, modifier=[], arguments=[]):
        '''
        Constructor
        
        This implementation will call set_arguments, set_return_type and
        set_body (in this order) after calling the constructor of the base 
        class. So please be careful if you override them in you specific
        subclass. This may break something!
        
        @param name: the name for this named element
        @param body: the body as string for this operation, if empty this operation is abstract
        @param return_type: the return type for this operation
        @param arguments: an optional list of variables as arguments 
        @raise ValueError if a param is None
        '''
        super(Operation, self).__init__(name, modifier=modifier)
        self.set_arguments(arguments)
        self.set_return_type(return_type)
        self.set_body(body)
        
    def set_body(self, body):
        '''
        Set a new body for this operation.
        
        @precondition: body != None
        @postcondition: self._body = body
        
        @param body: the new body as string
        @raise ValueError: if body is None  
        '''
        if body is None:
            raise ValueError('The body should not be None!')
        self._body = body
        
    def get_body(self):
        '''
        @return: the body as string
        '''
        return self._body
    
    def set_return_type(self, return_type):
        '''
        Set a new return type for this operation.
        
        @precondition: return_type != None
        @postcondition: self._return_type = return_type
        
        @param body: the new return type
        @raise ValueError: if return_type is None  
        '''
        if return_type is None:
            raise ValueError('The return type should not be None!')
        self._return_type = return_type
        
    def get_return_type(self):
        '''
        @return: the return type
        '''
        return self._return_type
    
    def set_arguments(self, arguments):
        '''
        Set a new list of arguments for this operation.
        
        @precondition: arguments != None
        @postcondition: self._arguments = arguments
        
        @param arguments: a list of arguments
        '''
        self._arguments = arguments
        
    def get_arguments(self):
        '''
        @return: a list of variables as arguments
        '''
        return self._arguments
    
    @abstractmethod
    def string_repr(self, ident_level = 0):
        '''
        Returns a string representation of the operation. The return value
        must be a string object. You need to implement this method
        in your specific operation class which inherits from this class.
        
        @param ident_level: optional value for level of ident
        @return: a string representation of the operation
        '''
        pass