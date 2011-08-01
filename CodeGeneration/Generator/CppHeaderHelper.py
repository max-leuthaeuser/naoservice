# -*- coding: utf-8 -*-
"""
Copyright (c) 2011, Max Leuthaeuser
License: GPL (see LICENSE.txt for details)
"""

__author__ = 'Max Leuthaeuser'
__license__ = 'GPL'

import fileinput
from modules.libs.CppHeaderParser import CppHeader
from modules.libs.CppHeaderParser import CppParseError
from CodeGeneration.AbstractMetaModel.AbstractMetaClass import MethodInvocationNotAllowedError

AL_MODULES = "../../modules/data/ALModules.txt"
AL_PROXIES = "../../modules/data/proxies/"
    
class CppHeaderHelper:
    '''
    Small collection of utility methods to extract important data out of 
    C++ header files using the CppHeaderParser.
    '''

    def __init__(self):
        '''
        You cannot instantiate this class or any subclass.
        This class is just meant to hold static methods which
        make it easier to work with the CppHeaderParser while
        the code generation.
        '''
        raise MethodInvocationNotAllowedError("Instantiation of this class or all subclasses is not allowed!")
    
    @staticmethod
    def get_modules():
        '''
        @return: a list of all available modules.
        '''
        proxies = []
        map(proxies.append, [x[:-1] for x in fileinput.input([AL_MODULES])])
        return proxies
    
    @staticmethod
    def get_methods(module):
        '''
        Returns a list of all public methods of a given module.
        
        @param module: the name of the module as string
        @return: a list of all puplic methods of the given module header file
        '''
        try:
            cppHeader = CppHeader(AL_PROXIES + module.lower() + "proxy.h")
        except CppParseError:
            raise ValueError('Cannot parse the headerfile ' + module.lower() + "proxy.h")
        m = cppHeader.classes[module + "Proxy"]
        return m["methods"]["public"]
    
    @staticmethod
    def get_doxygen_for_class(module):
        '''
        @return: a string containing the doxygen documentation
        for a given module.
        @param module: the name of the module as string
        '''
        try:
            cppHeader = CppHeader(AL_PROXIES + module.lower() + "proxy.h")
        except CppParseError:
            raise ValueError('Cannot parse the headerfile ' + module.lower() + "proxy.h")
        m = cppHeader.classes[module + "Proxy"]
        return m["doxygen"]
    
    @staticmethod
    def get_doxygen_for_method(module, method, params):
        '''
        @param module: the name of the module the method belongs to as string
        @param method: the name of the method as string
        @param params: the params of the method as string
        @return: a string containing the doxygen documentation
        for a given method of the given module.
        '''
        try:
            cppHeader = CppHeader(AL_PROXIES + module.lower() + "proxy.h")
        except CppParseError:
            raise ValueError('Cannot parse the headerfile ' + module.lower() + "proxy.h")
        proxy = cppHeader.classes[module + "Proxy"]
        
        m = [x for x in proxy["methods"]["public"] if x["name"] == method]
        for meth in m:
            if meth["parameters"] == params:
                return meth["doxygen"]
        return ""