# -*- coding: utf-8 -*-
"""
AbstractMetaClass defines a simple meta class for classes known
from object oriented language like Java or C++.

Copyright (c) 2011, Max Leuthaeuser
License: GPL (see LICENSE.txt for details)
"""

__author__ = 'Max Leuthaeuser'
__license__ = 'GPL'

from abc import ABCMeta
from abc import abstractmethod

class AbstractMetaClass:
    '''
    AbstractMetaClass defines a simple meta class for classes known
    from object oriented language like Java or C++.
    '''

    '''
    This class is an abstract base class. You cannot instantiate this class.
    Write subclasses and implement all methods marked with '@abstractmethod'.
    @see http://docs.python.org/library/abc.html
    '''
    __metaclass__ = ABCMeta
    
    _name = ""
    
    _variables = []
    
    _methods = []

    def __init__(self, name, variables=[], methods=[]):
        '''
        Constructor
        
        @arg name: the name of the class, must not be None or empty
        @arg variables: a list of variables for the class, might be empty
        @arg methods: a list of methods for the class, might be empty
        @raise ValueError: if the provided arg name is None or empty
        @raise ValueError: if the provided arg variables is None
        @raise ValueError: if the provided arg methods is None  
        '''
        self.set_name(name)
        self.set_variables(variables)
        self.set_methods(methods)
        
    def set_name(self, name):
        '''
        Sets a new name for this class.
        
        @arg name: the name of the class, must not be None or empty
        @raise ValueError: if the provided arg name is None or empty 
        '''
        if name is None or name == "":
            raise ValueError('The name should not be None or empty!')
        self._name = name
        
    def set_variables(self, variables):
        '''
        Sets a new list of variables for this class.
        
        @arg name: the list of variables of the class, must not be None
        @raise ValueError: if the provided arg variables is None 
        '''
        if variables is None:
            raise ValueError('The list of variables should not be None!')
        self._variables = variables
        
    def add_variable(self, variable):
        '''
        Add a new variable to the list of variables for this class.
        
        @arg name: the variable which should be added, must not be None
        @raise ValueError: if the provided arg variable is None 
        '''
        if variable is None:
            raise ValueError('The variable you want to should not be None!')
        self._variables.append(variable)
        
    def set_methods(self, methods):
        '''
        Sets a new list of methods for this class.
        
        @arg name: the list of methods of the class, must not be None
        @raise ValueError: if the provided arg methods is None 
        '''
        if methods is None:
            raise ValueError('The list of methods should not be None!')
        self._methods = methods
        
    def add_method(self, method):
        '''
        Add a new method to the list of methods for this class.
        
        @arg name: the method which should be added, must not be None
        @raise ValueError: if the provided arg method is None 
        '''
        if method is None:
            raise ValueError('The method you want to should not be None!')
        
        if not method in self._methods:        
            self._methods.append(method)
        
    @abstractmethod
    def __str__(self):
        '''
        Returns a string representation of the class. The return value
        must be a string object. You need to implement this method
        in your specific MetaClass which inherits from this class.
        
        @return: a string representation of the class
        '''
        pass