# -*- coding: utf-8 -*-
"""
Copyright (c) 2011, Max Leuthaeuser
License: GPL (see LICENSE.txt for details)
"""

__author__ = 'Max Leuthaeuser'
__license__ = 'GPL'

from abc import ABCMeta
from NamedElement import NamedElement

class Variable(NamedElement):
    '''
    Variable defines a simple meta class for variables known
    from object oriented language like Java or C++.
    '''
    
    '''
    This class is an abstract base class. You cannot instantiate this class.
    Write subclasses and implement all methods marked with '@abstractmethod'.
    @see http://docs.python.org/library/abc.html
    '''
    __metaclass__ = ABCMeta
    
    _type = None
    _value = ""
    
    def __init__(self, name, type, modifier=[], value=""):
        '''
        Constructor
        
        @param name: name of this named element. @see: NamedElement
        @param type: type if this variable
        @param value: optional value of this variable 
        @raise ValueException: if type or name is None or empty, or value is None 
        '''
        super(Variable, self).__init__(name, modifier=modifier)
        self.set_type(type)
        self.set_value(value)
        
    def set_type(self, type):
        '''
        Sets a new type for this variable
        
        @precondition: type != None
        @postcondition: self._type = type
        
        @param type: the new type for this variable, must not be None
        @raise ValueError: if the provided param is None 
        '''
        if not type:
            raise ValueError('The type should not be None!')
        self._type = type
        
    def get_type(self):
        '''
        @return: the type of this variable
        '''
        return self._type
    
    def get_value(self):
        '''
        @return: the value of this variable
        '''
        return self._value
    
    def set_value(self, value):
        '''
        Sets a new value for this variable
        
        @precondition: value != None
        @postcondition: self._value = value
        
        @param type: the new value for this variable, must not be None
        @raise ValueError: if the provided param is None 
        '''
        if value is None:
            raise ValueError('The value should not be None!')
        self._value = value
        
    def string_repr(self, ident_level = 0):
        ident = "\t" * ident_level
        if self._modifier != []:
            modifier = " ".join(self._modifier) + " "
        else:
            modifier = ""
        if self._value != "":
            return ident + "%s%s %s = %s" %(modifier, self._type, self._name, self._value)
        else:
            return ident + "%s%s %s" %(modifier, self._type, self._name)
        
    def __str__(self):
        '''
        @warning: if you need a specific ident level (e.g. for
        formatting the generated code) you need to call string_repr
        instead and provide your ident level there.
        
        @see: string_repr
        '''
        return self.string_repr()