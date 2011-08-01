# -*- coding: utf-8 -*-
"""
Copyright (c) 2011, Max Leuthaeuser
License: GPL (see LICENSE.txt for details)
"""

__author__ = 'Max Leuthaeuser'
__license__ = 'GPL'

from JavaMethod import JavaMethod
from CodeGeneration.AbstractMetaModel.AbstractMetaClass import MethodInvocationNotAllowedError

class JavaAbstractMethod(JavaMethod):
    '''
    Class which defines a simple meta class for abstract methods in Java.
    '''
    
    def __init__(self, name, return_type, modifier=[], arguments=[], javadoc="", throws=[]):
        super(JavaAbstractMethod, self).__init__(name, "", return_type, modifier=modifier, arguments=arguments, javadoc=javadoc, throws=throws)
        
    def set_body(self, body):
        if body != "" and body is not None:
            raise MethodInvocationNotAllowedError("You cannot set a body for an abstract method!")
    
    def get_body(self):
        raise MethodInvocationNotAllowedError("There is no body for an abstract method!")
    
    def _to_string_helper(self, ident_level):
        ident = "\t" * ident_level
        
        if self._modifier != []:
            modifier = " ".join(self._modifier)
        else:
            modifier = ""
            
        if self._throws != []:
            throws = " throws " + ", ".join(self._throws)
        else:
            throws = ""
        
        if self._arguments != []:
            args = ""
            for a in self._arguments:
                s = a.string_repr().replace(";", ", ")
                args += s
            args = args[:-2]
        else:
            args = ""
        
        # ident modifier abstract type name (arguments);
        if modifier == "":
            return ident + "abstract %s %s(%s)%s;" %(self._return_type, self._name, args, throws)
        else:
            return ident + "%s abstract %s %s(%s)%s;" %(modifier, self._return_type, self._name, args, throws)