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

class AbstractMetaClass(NamedElement):
    '''
    Class defines a simple abstract meta class for classes known
    from object oriented language like Java or C++.
    Creation is characterized through the builder pattern.
                                    
    @warning: This class is an abstract base class. You cannot instantiate this class.
    Write subclasses and implement all methods marked with '@abstractmethod'.
    @see http://docs.python.org/library/abc.html
    '''
    __metaclass__ = ABCMeta
    
    _variables = []
    
    _methods = []
    
    _inner_classes = []
    
    _base_classes = []
    
    class Builder():
        '''
        The builder for class AbstractMetaClass. This makes creation
        with many optional params more readable.
        '''
        
        # required values - see NamedElement
        _name = ""
        _modifier = []
        
        # optional values - initialized to default values
        _variables = []
        _ms = []
        _inner = []
        _base = []
        
        def __init__(self, name, modifier):
            self._name = name
            self._modifier = modifier
    
        def variables(self, variables):
            '''
            Set a list of variables as class variables.
            
            @param variables: list of variables that should be used
            as class variables
            @return: self (see builder pattern)
            @raise ValueError: if the provided param is None 
            '''
            if variables is None:
                raise ValueError('The list of variables should not be None!')
            self._variables = variables
            return self
        
        def methods(self, methods):
            '''
            Set a list of methods.
            @param variables: list of methods
            
            @return: self (see builder pattern)
            @raise ValueError: if the provided param is None 
            '''
            if methods is None:
                raise ValueError('The list of methods should not be None!')
            self._ms = methods
            return self
        
        def inner_classes(self, inner):
            '''
            Set a list of inner classes.
            @param inner: list of inner classes
            
            @return: self (see builder pattern) 
            @raise ValueError: if the provided param is None
            '''
            if inner is None:
                raise ValueError('The list of inner classes should not be None!')
            self._inner = inner
            return self
        
        def base_classes(self, base):
            '''
            Set a list of base classes.
            @param base: list of base classes
            
            @return: self (see builder pattern) 
            @raise ValueError: if the provided param is None
            '''
            if base is None:
                raise ValueError('The base class should not be None!')
            self._base = base
            return self
        
        def build(self):
            raise MethodInvocationNotAllowedError("Calling this method is not allowed. Write your own Builder for your own MetaClass.")
        
    def __init__(self, builder):
        super(AbstractMetaClass, self).__init__(builder._name, builder._modifier)
        self._variables = builder._variables
        self._methods = builder._ms
        self._inner_classes = builder._inner
        self._base_classes = builder._base
                
    def add_method(self, method):
        '''
        Add a new method to the list of methods for this class if 
        it was not already added.
        
        @arg name: the method which should be added, must not be None
        @raise ValueError: if the provided arg method is None 
        '''
        if method is None:
            raise ValueError('The method you want to add should not be None!')
        
        if not method in self._methods:        
            self._methods.append(method)            
    
    def _check_inner_classes(self, ref=None):
        '''
        @raise ValueError: if a class in inner classes contains itself as
        inner class, either directly or recursively. 
        '''
        if ref is not None:
            if ref in self._inner_classes:
                raise ValueError("The class %s can not be inner class of itself. (rec.)");
        
        if self in self._inner_classes:
            l = [x._name for x in self._inner_classes]
            raise ValueError("The class %s can not be inner class of itself. %s" % (self._name, l))
        
        for c in self._inner_classes:
            c._check_inner_classes(self)
        
    @abstractmethod
    def string_repr(self, ident_level=0):
        '''
        Returns a string representation of the class. The return value
        must be a string object. You need to implement this method
        in your specific MetaClass which inherits from this class.
        
        @param ident_level: optional value for level of ident
        @return: a string representation of the class
        '''
        pass
    
    def __str__(self):
        '''
        @warning: if you need a specific ident level (e.g. for
        formatting the generated code) you need to call string_repr
        instead and provide your ident level there.
        
        @see: string_repr
        '''
        return str(self.string_repr())
    
    def __eq__(self, other):
        if isinstance(other, AbstractMetaClass):
            return self._name == other._name
        else:
            return False
    
class MethodInvocationNotAllowedError(StandardError):
    pass