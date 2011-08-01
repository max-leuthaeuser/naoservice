# -*- coding: utf-8 -*-
"""
Copyright (c) 2011, Max Leuthaeuser
License: GPL (see LICENSE.txt for details)
"""

__author__ = 'Max Leuthaeuser'
__license__ = 'GPL'

import datetime
import fileinput
from CodeGeneration.JavaMetaModel.JavaVariable import JavaVariable
from CodeGeneration.JavaMetaModel.JavaTypes import JavaTypes
from CodeGeneration.JavaMetaModel.JavaModifier import JavaModifier
from CodeGeneration.JavaMetaModel.JavaMethod import JavaMethod
from CodeGeneration.JavaMetaModel.JavaClass import JavaClass
from CodeGeneration.Generator.NaoCodeGenerator import NaoCodeGenerator
from CodeGeneration.Generator.CppHeaderHelper import CppHeaderHelper

class JavaNaoCodeGenerator(NaoCodeGenerator):
    '''
    JavaNaoCodeGenerator is able to generate Java code to run
    methods remotely with the Nao web service (NaoService).
    '''

    _imports = []
    
    PATH = "../JavaCodeGeneration/resources/"
    NAO_CLASS_DOC = PATH + "naoclassdoc.rsc"
    LICENSE_HEADER = PATH + "license_header.rsc"
    REQUEST_BODY = PATH + "requestbody.rsc"
    REQUEST_DOC = PATH + "requestdoc.rsc" 
    
    def __init__(self, mapping_path=None, import_path=None):
        super(JavaNaoCodeGenerator, self).__init__(mapping_path=mapping_path)
        if import_path is not None:
            self.set_imports(self.read_imports(import_path))
        
    def set_imports(self, imports):
        '''
        Set a list of imports.
        
        @raise ValueError: if imports is None 
        '''
        if imports is not None:
            self._imports = imports
        else:
            raise ValueError("imports must not be None!")
        
    def read_imports(self, import_path):
        '''
        Read the imports from file.
        
        @arg import_path: path to the file where the imports are stored in
        @return: a list containing the imports
        '''
    
        if import_path != "" and import_path is not None:
            imports = []
            map(imports.append, [x[:-1] for x in fileinput.input([import_path])])
            return imports
        else:
            raise ValueError("import_path must not be None or emptpy!")
        
    def _doxygen2javadoc(self, doxygen):
        '''
        Internal helper method.
        
        Takes a doxygen comment as string and "converts" it to
        javadoc. That means it replaces typical tokens from doxygen
        to tokens known from javadoc.
        
        @param doxygen: the doxygen as string to convert
        @return: the translated doxygen comment as javadoc string
        @raise ValueError: if the param doxygen is empty or None 
        '''
        if doxygen is None or doxygen == "":
            raise ValueError("Param doxygen must not be empty or None!")
        
        doc = doxygen
        doc = doc.replace("<returns>", "<br /><i>Actual SDK return value:</i>")
        doc = doc.replace("</returns>", "")
        doc = doc.replace("</param>", "")
        doc = doc.replace("<param name=\"", "@param ")
        doc = doc.replace("\">", " ")
        doc = doc.replace("///", " *")
        
        doc = "/**\n" + doc + "\n"
        doc += (" * @return JSONObject which contains the following values as strings:<br/ >\n"
                + " * <ul><li>the actual return value (returnvalue)</li>\n"
                + " *   <li>exceptions (exception)</li>\n"
                + " *   <li>standard out (stdout)</li>\n"
                + " *   <li>standard err (err)</li>\n * </ul>" + "\n */")
        return doc
    
    def _build_almodule_class(self):
        '''
        Internal helper method.
        
        Build the almodule super class out of the C++ header.
        @return: the almodule super class (abstract JavaClass)
        '''
        # some variables
        doc = "/** The IP address of the Nao. */"
        c_ip = JavaVariable("ip", 
                            JavaTypes.STRING,
                            modifier=[JavaModifier.PRIVATE, JavaModifier.FINAL],
                            javadoc=doc)
        
        doc = "/** The port where the Nao service is running. */"
        c_port = JavaVariable("port", 
                            JavaTypes.INT,
                            modifier=[JavaModifier.PRIVATE, JavaModifier.FINAL],
                            javadoc=doc)

        arg_ip = JavaVariable("ip",
                              JavaTypes.STRING,
                              modifier=[JavaModifier.FINAL])
        
        arg_port = JavaVariable("port",
                              JavaTypes.INT,
                              modifier=[JavaModifier.FINAL])
        
        # constructor
        body = "this.ip = ip;\nthis.port = port;"
        constructor = JavaMethod("ALModule",
                                 body,
                                 JavaTypes.NONE,
                                 modifier=[JavaModifier.PUBLIC],
                                 arguments=[arg_ip, arg_port])
        
        # methods
        ms = [constructor, self._build_request_method()]
        classname = "\"+this.getClass().getSimpleName()+\""
        for m in CppHeaderHelper.get_methods("ALModule"):
                ms.append(self._build_module_method("ALModule", m, opt=classname))
        
        doc = "/**\n * Abstract base class for all proxy modules.\n */"
        return (JavaClass.JavaBuilder("ALModule",
                            [JavaModifier.PRIVATE, JavaModifier.STATIC, JavaModifier.ABSTRACT])
                            .javadoc(doc)
                            .variables([c_ip, c_port])
                            .methods(ms)
                            .build())
    
    def _build_nao_class(self):
        '''
        Internal helper method.
        
        Build the Nao abstraction layer class.
        @return: the Nao class (concrete JavaClass)
        '''
        
        doc = self.read_from_file(self.NAO_CLASS_DOC)
        nao = (JavaClass.JavaBuilder("Nao", [JavaModifier.PUBLIC, JavaModifier.ABSTRACT])
                            .javadoc(doc)
                            .build())
        return nao
    
    def _build_factory_method(self, module):
        '''
        Internal helper method.
        
        @param module: the name of the class the factory method should create
        @return: a JavaMethod which represents the factory method for the
        given module 
        '''
        arg_ip = JavaVariable("ip",
                              JavaTypes.STRING,
                              modifier=[JavaModifier.FINAL])
        
        arg_port = JavaVariable("port",
                              JavaTypes.INT,
                              modifier=[JavaModifier.FINAL])
        fname = "create%s" % module
        fmodifier = [JavaModifier.PUBLIC, JavaModifier.STATIC]
        freturntype = module
        fbody = "return new %s(ip, port);" % module
        doc = ("/**\n * Factory method for creating a new instance of the\n"
             + " * Nao module {@link Nao.%s}.\n *\n" % module
             + " * @param ip The IP address of the Nao.\n"
             + " * @param port The port where the Nao service is running.\n"
             + " * @return a new instance of {@link Nao.%s}\n */" % module)
        return JavaMethod(fname, fbody, freturntype,
                          arguments=[arg_ip, arg_port],
                          modifier=fmodifier, javadoc=doc)
    
    def _build_module_method(self, module, m, opt=""):
        '''
        Internal helper method.
        
        @param module: the name of the class the method will be placed 
        @param m: the C++ method to build the java method for
        @return: a JavaMethod build out of the C++ header method declaration
        '''
        modifier = [JavaModifier.PUBLIC]
        returntype = "JSONObject"
        name = m["name"]
        # arguments
        arguments = []
        args = m["parameters"]
        for a in args:
            type = self.translate(a["type"])
            s = type + " " + a["name"].lower()  
            arguments.append(s)
        a = self._arguments_to_string(args)
        if a != "":
            if opt == "":
                body = 'return requestAction("%s/%s/"%s);' % (module, m["name"], a)
            else:
                body = 'return requestAction("%s/%s/"%s);' % (opt, m["name"], a)
            # we replace wrongly placed '+' from the body
            body = body.replace('/"+"+\'"', '/"+"\'"')
            body = body.replace('/"+","', '/"')
        else:
            if opt == "":
                body = 'return requestAction("%s/%s/()");' % (module, m["name"])
            else:
                body = 'return requestAction("%s/%s/()");' % (opt, m["name"])
        # finally we can create the method
        doc = self._doxygen2javadoc(CppHeaderHelper.get_doxygen_for_method(module, name, args)) 
        return JavaMethod(name,
                            body,
                            returntype,
                            modifier=modifier,
                            arguments=arguments,
                            javadoc=doc)
        
    def _build_request_method(self):
        '''
        Internal helper method.
        
        @return: a JavaMethod which represents the request method for the 
        Nao abstraction layer which communicates to the web service.
        '''
        doc = self.read_from_file(self.REQUEST_DOC)
        returntype = "JSONObject"
        body = self.read_from_file(self.REQUEST_BODY)
        arg = JavaVariable("action", JavaTypes.STRING, modifier=[JavaModifier.FINAL])
        return JavaMethod("requestAction",
                             body,
                             returntype,
                             modifier=[JavaModifier.PROTECTED], arguments=[arg],
                             javadoc=doc)
    
    def _arguments_to_string(self, args):
            '''
            Internal helper method.
            
            @param args: list of arguments (string) 
            @return: a well formatted string out of a list
            of arguments of a method created during the code generation.
            '''
            result = ""
            for a in args:
                type = self.translate(a["type"])
                if type.find("String") > -1:
                    result += "+\"+'\"+" + a["name"].lower() + "+\"'\""                    
                else:
                    result += "+\",\"+" + a["name"].lower()
            return result
        
    def generate_code(self):
        result = []
        
        # license header
        result.append(self.read_from_file(self.LICENSE_HEADER) + "\n")

        gen_info = "/* The following code was generated by %s on %s. */" % (
                    "JavaNaoCodeGenerator", datetime.datetime.now().strftime("%d/%m/%y %H:%M"))
        gen_warning = "/* WARNING: This is generated code. DO *NOT* MODIFY IT! */"
        
        result.append(gen_info + "\n")
        result.append(gen_warning + "\n\n")
        
        # imports
        if self._imports != []:
            for s in self._imports:
                result.append("import " + s + ";\n")
            result.append("\n")
                
        # nao class
        nao = self._build_nao_class()
        
        # inner classes
        almodule = self._build_almodule_class()
        # walk through all modules
        m_classes = [almodule]
        for module in CppHeaderHelper.get_modules():
            arg_ip = JavaVariable("ip",
                              JavaTypes.STRING,
                              modifier=[JavaModifier.FINAL])
            
            arg_port = JavaVariable("port",
                                  JavaTypes.INT,
                                  modifier=[JavaModifier.FINAL])
            
            body = "super(ip, port);"
            constructor = JavaMethod(module,
                                     body,
                                     JavaTypes.NONE,
                                     modifier=[JavaModifier.PUBLIC],
                                     arguments=[arg_ip, arg_port])
        
            cla = (JavaClass.JavaBuilder(module,
                    [JavaModifier.PUBLIC, JavaModifier.STATIC, JavaModifier.FINAL])
                    .base_classes([almodule])
                    .build())
            
            # walk through all methods
            ms = [constructor]
            forbidden = [x["name"] for x in CppHeaderHelper.get_methods("ALModule")]
            for m in CppHeaderHelper.get_methods(module):
                new_module = self._build_module_method(module, m)
                if not new_module in ms and not m["name"] in forbidden:
                    ms.append(new_module)
            cla._methods = ms
        
            docx = CppHeaderHelper.get_doxygen_for_class(module)
            docx = docx.replace("<summary>", "").replace("</summary>", "")
            docx = "/**\n" + docx.replace("///", " *") + "\n */"
            cla.set_javadoc(docx)

            m_classes.append(cla)
            nao.add_method(self._build_factory_method(module))
        
        nao._inner_classes = m_classes
               
        # finally we are done
        result.append(str(nao))
        return [str(x) for x in result]

if __name__ == '__main__':
    FILENAME = "Nao.java"
    # finally the code generation can be triggered and written
    # down to a file.
    print "starting code generation ..."
    cg = JavaNaoCodeGenerator(mapping_path="../JavaCodeGeneration/resources/tojava.map",
                              import_path="../JavaCodeGeneration/resources/imports.rsc");
    f = open(FILENAME, 'w')
    result = cg.generate_code()
    print "start writing result to file '%s' ..." % FILENAME
    f.writelines(result)
    f.close()
    print "... finished."