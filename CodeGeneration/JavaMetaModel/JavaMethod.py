# -*- coding: utf-8 -*-
"""
Copyright (c) 2011, Max Leuthaeuser
License: GPL (see LICENSE.txt for details)
"""

__author__ = 'Max Leuthaeuser'
__license__ = 'GPL'

from JavaTypes import JavaTypes
from CodeGeneration.AbstractMetaModel.Operation import Operation

class JavaMethod(Operation):
    '''
    Class which defines a simple meta class for methods in Java.
    
    Usage example:
    javadoc = "/**\n * @return a string\n */"
    jv = JavaVariable("arg", JavaTypes.STRINGARR, modifier=[JavaModifier.FINAL])
    jm = JavaMethod("toString", "return \"test\"", JavaTypes.STRING, [JavaModifier.PUBLIC], [jv], javadoc)
    print jm.string_repr(0)
    '''    
    
    _javadoc = ""
    _throws = []
    
    def __init__(self, name, body, return_type, modifier=[], arguments=[], javadoc="", throws=[]):
        super(JavaMethod, self).__init__(name, body, return_type, modifier=modifier, arguments=arguments)
        self._javadoc = javadoc
        self._throws = throws
        
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
            if self._arguments[0].__class__ == str:
                args = ", ".join(self._arguments)
            else:
                args = ""
                for a in self._arguments:
                    s = a.string_repr().replace(";", ", ")
                    args += s
                args = args[:-2]
        else:
            args = ""
            
        i = ident + "\t"
            
        if self._body != "":
            body = self._body.replace("\n", "\n" + i)
        else:
            body = self._body

        result = ""
            
        # ident modifier type name (arguments) throws { \n ident body \n ident }  
        if self._return_type == JavaTypes.VOID:
            if body == "":
                if modifier == "":
                    result = ident + "%s %s(%s)%s {}" %(self._return_type, self._name, args, throws)
                else:
                    result = ident + "%s %s %s(%s)%s {}" %(modifier, self._return_type, self._name, args, throws)
            else:
                if modifier == "":
                    result = ident + "%s %s(%s)%s {\n%s%s\n" %(self._return_type, self._name, args, throws, i, body) + ident + "}"
                else:
                    result = ident + "%s %s %s(%s)%s {\n%s%s\n" %(modifier, self._return_type, self._name, args, throws, i, body) + ident + "}"
        else:
            if modifier == "":
                result = ident + "%s %s(%s)%s {\n%s%s\n" %(self._return_type, self._name, args, throws, i, body) + ident + "}"
            else:
                result = ident + "%s %s %s(%s)%s {\n%s%s\n" %(modifier, self._return_type, self._name, args, throws, i, body) + ident + "}"            
        return result.replace("  ", " ")
        
    def string_repr(self, ident_level = 0):
        ident = "\t" * ident_level
        if self._javadoc != "":
            javadoc = self._javadoc.replace("\n", "\n" + ident)
            return ident + javadoc + "\n" + self._to_string_helper(ident_level)
        else:
            return self._to_string_helper(ident_level)
    
    def __str__(self):
        return self.string_repr()
    
    def __eq__(self, other):
        if isinstance(other, JavaMethod):
            return self._name == other._name and self._arguments == other._arguments
        else:
            return False
        