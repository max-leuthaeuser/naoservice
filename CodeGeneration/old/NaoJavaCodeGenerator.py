# -*- coding: utf-8 -*-
"""
NaoJavaCodeGenerator is able to generate Java code to run
methods remotely with the Nao webservice (NaoService). All Java
code is generated from the Nao SDK/API.

Copyright (c) 2011, Max Leuthaeuser
License: GPL (see LICENSE.txt for details)
"""

__author__ = 'Max Leuthaeuser'
__license__ = 'GPL'

import fileinput
from NaoCodeGenerator import NaoCodeGenerator
from JavaMetaClass import JavaMetaClass
from UserString import MutableString
from modules.libs.CppHeaderParser import CppHeader
from modules.libs.CppHeaderParser import CppParseError

class NaoJavaCodeGenerator(NaoCodeGenerator):
    '''
    NaoJavaCodeGenerator is able to generate Java code to run
    methods remotely with the Nao webservice (NaoService). All methods are
    generated from the Nao API.
    '''
    
    def _get_modules(self):
        '''
        Returns a list of all available modules.
        '''
        proxies = []
        map(proxies.append, [x[:-1] for x in fileinput.input(['../modules/data/ALModules.txt'])])
        return proxies
    
    def _get_methods(self, module):
        '''
        Returns a list of all public methods of a given module.
        '''
        try:
            cppHeader = CppHeader("../modules/data/proxies/" + module.lower() + "proxy.h")
        except CppParseError:
            raise ValueError('Cannot parse the headerfile ' + module.lower() + "proxy.h")
        m = cppHeader.classes[module + "Proxy"]
        return m["methods"]["public"]
    
    def _get_doxygen_for_class(self, module):
        '''
        Returns a string containing the doxygen documentation
        for a given module.
        '''
        try:
            cppHeader = CppHeader("../modules/data/proxies/" + module.lower() + "proxy.h")
        except CppParseError:
            raise ValueError('Cannot parse the headerfile ' + module.lower() + "proxy.h")
        m = cppHeader.classes[module + "Proxy"]
        return m["doxygen"]
    
    def _get_doxygen_for_method(self, module, method, params):
        '''
        Returns a string containing the doxygen documentation
        for a given method of the given module.
        '''
        try:
            cppHeader = CppHeader("../modules/data/proxies/" + module.lower() + "proxy.h")
        except CppParseError:
            raise ValueError('Cannot parse the headerfile ' + module.lower() + "proxy.h")
        proxy = cppHeader.classes[module + "Proxy"]
        
        m = [x for x in proxy["methods"]["public"] if x["name"] == method]
        for meth in m:
            if meth["parameters"] == params:
                return meth["doxygen"]
        return ""
    
    def get_request_code(self):
        '''
        Returns a string containing the request code statically which
        is needed to perform a request to the Nao webservice.
        '''
        return '''
    /**
     * Internal helper method to send a request to the Nao web service.
     * 
     * @param action
     *            The request as a string. E.g.,
     *            <code>ALTextToSpeech/say/'Hello.'</code>.
     */
    protected JSONObject requestAction(String action) {
        try {
            action = action.replaceAll(" ", "%20");
    
            URL request = new URL("http://" + ip + ":" + port + "/proxy/run/"
                            + action);
            URLConnection response = request.openConnection();
            BufferedReader rd = new BufferedReader(new InputStreamReader(
                            response.getInputStream()));
            
            StringBuilder sb = new StringBuilder();
            int cp;
            while ((cp = rd.read()) != -1) {
              sb.append((char) cp);
            }
            
            JSONObject result = new JSONObject(sb.toString());
            rd.close();
            return result;
        }
        
        catch (MalformedURLException e) {
            throw new IllegalStateException("Cannot connect to the Nao.", e);
        }
        
        catch (IOException e) {
            throw new IllegalStateException("Cannot connect to the Nao.", e);
        }
        
        catch (JSONException e) {
            throw new IllegalStateException("Unable to create JSON object from request", e);
        }
    }
'''
        
    def generate_code(self):
        result = MutableString()
        
        # imports
        imports = ""
        for s in self._imports:
            imports += "import " + s + ";\n"
        result += imports
        
        # outer class
        result += '''
/**
* Java abstraction layer for Nao humanoid robot.
* <br />
* <b>This is automatically generated code. Do not modify it!</b>
* <p>
* Simple example how to use this:
* <pre>
* Nao n = new Nao("192.168.10.221", 8080);
* Nao.ALMemory almem = n.createALMemory();
* System.out.println(almem.getBrokerName());
* </pre></p>
*/
public class Nao {
    /** The IP address of the Nao. */
    protected String ip;

    /** The port where the Nao service is running. */
    protected int port;

    /**
    * Creates a new {@link Nao} for a given IP address and a given port.
    * 
    * @param ip
    *            The IP address of the Nao.
    * @param port
    *            The port where the Nao service is running.
    */
    public Nao(String ip, int port) {
       this.ip = ip;
       this.port = port;
    }
    
'''
        
        def arguments_to_string(args):
            '''
            Small helper method which returns a well formatted
            string out of a list of arguments of a method used below.
            '''
            result = ""
            for a in args:
                type = self.translate(a["type"])
                if type.find("String") > -1:
                    result += "+\"+'\"+" + a["name".lower()].lower() + "+\"'\""					
                else:
                    result += "+\",\"+" + a["name".lower()].lower()
            return result
        
        modules = self._get_modules()
        
        # inner classes
        # walk through all modules
        for module in modules:
            # create a new class
            cla = JavaMetaClass(module, [], [], [JavaMetaClass.Modifier.PUBLIC])
            
            # walk through all methods
            for m in self._get_methods(module):
                modifier = [JavaMetaClass.Modifier.PUBLIC]
                returntype = "JSONObject"
                name = m["name"]
                # arguments
                arguments = []
                args = m["parameters"]
                for a in args:
                    type = self.translate(a["type"])
                    s = type + " " + a["name"].lower()  
                    arguments.append(s)
                a = arguments_to_string(args)
                if a != "":
                    body = 'return requestAction("%s/%s/"%s);' % (module, m["name"], a)
                    # we replace wrongly placed '+' from the body
                    body = body.replace('/"+"+\'"', '/"+"\'"')
                    body = body.replace('/"+","', '/"')
                else:
                    body = 'return requestAction("%s/%s/()");' % (module, m["name"])
                # finally we can create the method
                method = JavaMetaClass.JavaMethod(name, body, returntype, "\t\t", modifier, arguments)
                method.set_javadoc(self._get_doxygen_for_method(module, name, args))
                cla.add_method(method)
            
            cla.set_javadoc(self._get_doxygen_for_class(module))
            result += str(cla) + "\n\n"
        
            # factory methods
            fname = "create%s" % module
            fmodifier = [JavaMetaClass.Modifier.PUBLIC]
            freturntype = module
            fbody = "return new %s();" % module
            fmethod = JavaMetaClass.JavaMethod(fname, fbody, freturntype, "\t", fmodifier, [])
            
            result += str(fmethod) + "\n\n"
        
        result += self.get_request_code() + "}"
        return result
    
# we need to provide all imports statically
imports = []
imports.append("java.io.BufferedReader")
imports.append("java.io.IOException")
imports.append("java.io.InputStreamReader")
imports.append("java.net.MalformedURLException")
imports.append("java.net.URL")
imports.append("java.net.URLConnection")
imports.append("org.json.JSONObject")
imports.append("org.json.JSONException")
    
# finally the code generation can be triggered and written
# down to a file.
print "starting code generation ..."
cg = NaoJavaCodeGenerator(imports)
cg.read_mapping("tojava.map")
f = open('Nao.java', 'w')
f.write(str(cg.generate_code()))
f.close()
print "finished"