# -*- coding: utf-8 -*-
"""
Copyright (c) 2011, Max Leuthaeuser
License: GPL (see LICENSE.txt for details)
"""

__author__ = 'Max Leuthaeuser'
__license__ = 'GPL'

from CodeGeneration.AbstractMetaModel.AbstractMetaClass import MethodInvocationNotAllowedError

class Modifier:
    '''
    Simple enumeration of available modifier in your language.
    '''
    
    def __init__(self):
        '''
        You cannot instantiate this class or any subclass.
        This is just meant to be used as an enumeration of modifier
        available in the language you want to use in code generation.
        '''
        raise MethodInvocationNotAllowedError("Instantiation of class Modifier or all subclasses is not allowed!")