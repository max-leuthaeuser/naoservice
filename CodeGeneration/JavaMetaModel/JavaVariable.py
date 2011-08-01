# -*- coding: utf-8 -*-
"""
Copyright (c) 2011, Max Leuthaeuser
License: GPL (see LICENSE.txt for details)
"""

__author__ = 'Max Leuthaeuser'
__license__ = 'GPL'

from CodeGeneration.AbstractMetaModel.Variable import Variable

class JavaVariable(Variable):
    '''
    Class representing a Java variable.
    '''
    
    _javadoc = ""
    
    def __init__(self, name, type, modifier=[], value="", javadoc=""):
        super(JavaVariable, self).__init__(name, type, modifier=modifier, value=value)
        self._javadoc = javadoc
    
    def string_repr(self, ident_level = 0):
        s = super(JavaVariable, self).string_repr(ident_level) + ";"
        if self._javadoc != "":
            ident = "\t" * ident_level
            javadoc = self._javadoc.replace("\n", "\n" + ident)
            return ident + javadoc + "\n" + s
        else: 
            return s