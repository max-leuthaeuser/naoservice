# -*- coding: utf-8 -*-
"""
Copyright (c) 2011, Max Leuthaeuser
License: GPL (see LICENSE.txt for details)
"""

__author__ = 'Max Leuthaeuser'
__license__ = 'GPL'

class JavaTypes:
    '''
    Simple enumeration of available types in Java.
    @todo: still incomplete - more types were not required yet
    '''
    STRING = "String"
    STRINGARR = "String[]"
    VOID = "void"
    INT = "int"
    INT_BOXED = "Integer"
    FLOAT = "float"
    FLOAT_BOXED = "Float"
    BOOL = "boolean"
    BOOL_BOXED = "Boolean"
    OBJECT = "Object"
    # use NONE for constructors
    NONE = ""
    
    DEFAULT = VOID
