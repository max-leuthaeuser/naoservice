# -*- coding: utf-8 -*-
"""
Copyright (c) 2011, Max Leuthaeuser
License: GPL (see LICENSE.txt for details)
"""

__author__ = 'Max Leuthaeuser'
__license__ = 'GPL'

from CodeGeneration.AbstractMetaModel.Modifier import Modifier

class JavaModifier(Modifier):
    '''
    Simple enumeration of available modifier in Java.
    '''
    PUBLIC = "public"
    PRIVATE = "private"
    FINAL = "final"
    STATIC = "static"
    PROTECTED = "protected"
    VOLATILE = "volatile"
    # Only meant for use with classes!
    # If you need abstract methods use the class JavaAbstractMethod.
    ABSTRACT = "abstract"