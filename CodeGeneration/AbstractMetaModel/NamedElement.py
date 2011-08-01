# -*- coding: utf-8 -*-
"""
Copyright (c) 2011, Max Leuthaeuser
License: GPL (see LICENSE.txt for details)
"""

__author__ = 'Max Leuthaeuser'
__license__ = 'GPL'

from abc import ABCMeta

class NamedElement:
    '''
    NamedElement defines a simple meta class for all elements
    in a meta language based object oriented language.
    '''

    '''
    This class is an abstract base class. You cannot instantiate this class.
    Write subclasses and implement all methods marked with '@abstractmethod'.
    @see http://docs.python.org/library/abc.html
    '''
    __metaclass__ = ABCMeta
    
    _name = ""
    
    _modifier = []
    
    def __init__(self, name, modifier=[]):
        '''
        Constructor
        
        @param name: the name as string of this named element
        @param modifier: a list containing optional modifier  
        @raise ValueError: if name is None or empty  
        '''
        self.set_name(name)
        self.set_modifier(modifier)
    
    def set_name(self, name):
        '''
        Set a name for this named element.
        
        @precondition: name != None and name != ""
        @postcondition: self._name = name
        
        @param name: the name as string of this named element
        @raise ValueError: if name is None or empty  
        '''
        if name and name != "":
            self._name = name
        else:
            raise ValueError('The name should not be None or empty!')
        
    def get_name(self):
        '''
        @return: the name of this named element.
        '''
        return self._name
    
    
    def set_modifier(self, modifier):
        '''
        Set optional modifier for this named element.
        
        @precondition: modifier is a list of modifier
        @postcondition: self._modifier = modifier
        
        @param modifier: a list containing optional modifier 
        '''
        self._modifier = modifier