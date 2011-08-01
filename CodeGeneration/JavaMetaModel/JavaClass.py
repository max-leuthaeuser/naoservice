# -*- coding: utf-8 -*-
"""
Copyright (c) 2011, Max Leuthaeuser
License: GPL (see LICENSE.txt for details)
"""

__author__ = 'Max Leuthaeuser'
__license__ = 'GPL'

from UserString import MutableString
from CodeGeneration.AbstractMetaModel.AbstractMetaClass import AbstractMetaClass

class ClassType:
    '''
    Simple enumeration of available class types in Java
    and their inheritance keyword.
    '''
    CLASS = "class"
    INTERFACE = "interface"

class JavaClass(AbstractMetaClass):
    '''
    JavaMetaClass defines a simple meta class (M2) for Java classes which
    allows you to create concrete Java classes from this (M1).
    '''
    class JavaBuilder(AbstractMetaClass.Builder):
        '''
        We just extend the standard Builder with a field
        to specify if the class is actually a Java class or
        an interface and a field for the javadoc.
        '''
        _class_type = ClassType.CLASS
        _javadoc = ""
        
        def class_type(self, class_type):
            self._class_type = class_type
            return self
        
        def javadoc(self, javadoc):
            self._javadoc = javadoc
            return self
                        
        def build(self):
            return JavaClass(self, self._class_type, javadoc=self._javadoc)
    
    _javadoc = ""
    _class_type = ClassType.CLASS
    
    def __init__(self, builder, class_type, javadoc=""):
        super(JavaClass, self).__init__(builder)
        self._class_type = class_type
        self._javadoc = javadoc
    
    def set_javadoc(self, javadoc):
        self._javadoc = javadoc
    
    def string_repr(self, ident_level=0):
        def _all_interfaces():
            '''
            Helper method which checks if all classes
            in self._base_classes are interfaces or not.
			
			@return: true if all classes are interfaces
            '''
            result = True
            for i in self._base_classes:
                if i._class_type == ClassType.CLASS:
                    return False
            return result
        
        def _get_first_class():
            '''
            Helper methods which return the first class
            out of self._base_classes because Java only
            supports single inheritance.
			
			@return: the first class which is of class
			type CLASS
            '''
            for c in self._base_classes:
                if c._class_type == ClassType.CLASS:
                    return c
                
        def _get_all_interfaces():
            '''
            Returns a list of interfaces out of
            self._base_classes.
			
			@return: a list of all classes which is
			of class type INTERFACE
            '''
            return [x for x in self._base_classes if x._class_type == ClassType.INTERFACE]
        
        ident = "\t" * ident_level
        
        javadoc = self._javadoc.replace("\n", "\n" + ident)
        
        result = MutableString()
        # javadoc
        if javadoc != "":
            result += ident + javadoc + "\n"
        result += ident
        
        # modifier
        if self._modifier != []:
            modifier = " ".join(self._modifier)
            result += modifier + " "
        
        # class name
        result += "class " + self._name
        
        # base classes
        if self._base_classes != []:
            if _all_interfaces():
                interfaces = ", ".join([x._name for x in self._base_classes])
                result += " implements " + interfaces
            else:
                result += " extends " + _get_first_class()._name
                # are there still any interfaces?
                interfaces = _get_all_interfaces() 
                if interfaces != []:
                    interf = ", ".join([x._name for x in interfaces])
                    result += " implements " + interf
                    
        result += " {\n"
        
        # class variables
        if self._variables != []:
            for vars in self._variables:
                result += vars.string_repr(ident_level + 1) + "\n"
            result += "\n"
        
        # inner classes
        if self._inner_classes != []:
            for inner in self._inner_classes:
                result += inner.string_repr(ident_level + 1) + "\n\n"
            result += "\n"
        
        # methods
        if self._methods != []:
            for methods in self._methods:
                result += methods.string_repr(ident_level + 1) + "\n\n"
            result = result[:-1]
        result += ident + "}"
        
        # finally we are done
        return result