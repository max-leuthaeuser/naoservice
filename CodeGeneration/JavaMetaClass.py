# -*- coding: utf-8 -*-
"""
JavaMetaClass defines a simple meta class for Java classes.

Copyright (c) 2011, Max Leuthaeuser
License: GPL (see LICENSE.txt for details)
"""

__author__ = 'Max Leuthaeuser'
__license__ = 'GPL'

from AbstractMetaClass import AbstractMetaClass

class JavaMetaClass(AbstractMetaClass):
    '''
    JavaMetaClass defines a simple meta class (M2) for Java classes which allows you to
    create concrete Java classes from this (M1). Inheritance and inner classes are
    not supported yet.
    '''

    _modifier = []
    _javadoc = ""
    
    def __init__(self, name, variables=[], methods=[], modifier=[]):
        super(JavaMetaClass, self).__init__(name, variables, methods)
        self.set_modifier(modifier)
        
    def set_javadoc(self, doc):
        '''
        Sets the javadoc for this class as string.
        '''
        self._javadoc = doc
    
    def set_modifier(self, modifier):
        '''
        Sets a new list of modifier for this class.
        
        @arg name: the list of modifier of the class, must not be None
        @raise ValueError: if the provided arg modifier is None 
        '''
        if modifier is None:
            raise ValueError('The list of modifier should not be None!')
        self._modifier = modifier
            
    def __str__(self):
        doc = "\t/**\n\t" + self._javadoc.replace("///", "*") + "\n\t*/"
        result = doc + "\n"
        m = ""
        for s in self._modifier:
            m += s + " "
        result += "\t" + m + "class " + self._name + " {\n"
        
        # class variables
        for v in self._variables:
            result += "\t" + str(v) + "\n"
            
        result += "\n"

        # methods
        for m in self._methods:
            result += str(m) + "\n\n"
        
        result = result[:-1] + "\t}"
        return result
        
    class Modifier:
        '''
        Simple enumeration which holds available Java modifier.
        '''
        PUBLIC = "public"
        PRIVATE = "private"
        FINAL = "final"
        STATIC = "static"
        ABSTRACT = "abstract"
        PROTECTED = "protected"
        
    class JavaClassVariable:
        '''
        Class which represents a Java class variable.
        '''
        
        _modifier = []
        _name = ""
        _value = ""
        _type = ""
        
        def __init__(self, name, type, modifier=[], value=""):
            self._modifier = modifier
            self._name = name
            self._type = type
            self._value = value
            
        def __str__(self):
            m = ""
            for s in self._modifier:
                m += s + " "
            
            if self._value == "":
                return "\t" + m + self._name + ";"
            else:
                return "\t" + m + self._type + " " + self._name + " = " + self._value + ";"
            
    class JavaMethod:
        '''
        Class which represents a Java method.
        '''
        
        _modifier = []
        _name = ""
        _arguments = []
        _body = ""
        _returntype = ""
        _ident = "\t"
        _javadoc = ""
        
        def __init__(self, name, body, returntype, ident="\t", modifier=[], arguments=[]):
            self._modifier = modifier
            self._name = name
            self._returntype = returntype
            self._arguments = arguments
            self._body = body
            self._ident = ident
            
        def set_javadoc(self, doc):
            '''
            Sets the javadoc for this class as string.
            '''
            self._javadoc = doc
            
        def __eq__(self, other):
            return self._name == other._name and self._arguments == other._arguments
            
        def __str__(self):
            m = ""
            for s in self._modifier:
                m += s + " "
            a = ""
            for s in self._arguments:
                a += s + ", "
            a = a[:-2]
            if self._javadoc != "":
                # convert doxygen to javadoc
                doc = self._javadoc.replace("<returns>", "<br /><i>Actual SDK return value:</i>")
                doc = doc.replace("</returns>", "")
                doc = doc.replace("</param>", "")
                doc = doc.replace("<param name=\"", "@param ")
                doc = doc.replace("\">", " ")
                doc = doc.replace("///", self._ident + "*")
                
                doc = self._ident + "/**\n" + doc + "\n"
                doc += self._ident + """* @return JSONObject which contains the following values as strings:<br/ >
        * <ul><li>the actual return value (returnvalue)</li>
        *   <li>exceptions (exception)</li>
        *   <li>standard out (stdout)</li>
        *   <li>standard err (err)</li>
        * </ul>""" + "\n"
                doc += self._ident + "*/"
                return doc + "\n" + self._ident + m + self._returntype + " " + self._name + "(" + a + ") {\n\t" + self._ident + self._body + "\n" + self._ident + "}"
            else:
                return self._ident + m + self._returntype + " " + self._name + "(" + a + ") {\n\t" + self._ident + self._body + "\n" + self._ident + "}"
