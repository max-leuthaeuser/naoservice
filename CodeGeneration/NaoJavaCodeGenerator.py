# -*- coding: utf-8 -*-
"""
NaoJavaCodeGenerator is able to generate Java code to run
methods remotely with the Nao webservice (NaoService). All methods are
generated from the Nao API.

Copyright (c) 2011, Max Leuthaeuser
License: GPL (see LICENSE.txt for details)
"""

__author__ = 'Max Leuthaeuser'
__license__ = 'GPL'

from NaoCodeGenerator import NaoCodeGenerator
from modules.libs import CppHeaderParser 
from JavaMetaClass import JavaMetaClass
from UserString import MutableString
import fileinput

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
        for p in fileinput.input(['../modules/data/ALModules.txt']):
            proxies.append(p[:-1])
        return proxies
    
    def _get_methods(self, module):
        try:
            cppHeader = CppHeaderParser.CppHeader("../modules/data/proxies/" + module.lower() + "proxy.h")
        except CppHeaderParser.CppParseError:
            raise ValueError('Cannot parse the headerfile ' + module.lower() + "proxy.h")
        m = cppHeader.classes[module + "Proxy"]
        return m["methods"]["public"]
    
    def _get_doxygen_for_class(self, module):
        try:
            cppHeader = CppHeaderParser.CppHeader("../modules/data/proxies/" + module.lower() + "proxy.h")
        except CppHeaderParser.CppParseError:
            raise ValueError('Cannot parse the headerfile ' + module.lower() + "proxy.h")
        m = cppHeader.classes[module + "Proxy"]
        return m["doxygen"]
    
    def _get_doxygen_for_method(self, module, method, params):
        try:
            cppHeader = CppHeaderParser.CppHeader("../modules/data/proxies/" + module.lower() + "proxy.h")
        except CppHeaderParser.CppParseError:
            raise ValueError('Cannot parse the headerfile ' + module.lower() + "proxy.h")
        proxy = cppHeader.classes[module + "Proxy"]
        
        m = [x for x in proxy["methods"]["public"] if x["name"] == method]
        for meth in m:
            if meth["parameters"] == params:
                return meth["doxygen"]
        return ""
    
    def get_request_code(self):
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
        
    def generateCode(self):
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
* ALMemory almem = n.createALMemory();
* System.out.println(almem.getBrokerName());
* </pre></p>
*/
public class Nao {
    /** The IP address of the Nao. */
    protected String ip;

    /** The port where the Nao service is running. */
    protected int port;
    
    protected Nao nao;

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
            result = ""
            for a in args:
                type = self.translate(a["type"])
                if type.find("String") > -1:
                    result += "+\"+'\"+" + a["name".lower()].lower() + "+\"'\""
                else:
                    result += "+\"+\"+" + a["name".lower()].lower()
            return result
        
        modules = self._get_modules()
        
        # inner classes
        # walk through all modules
        for module in modules:
            #module = module.replace('\xef\xbb\xbf','')
            # create a new class
            cla = JavaMetaClass(module, [], [], [JavaMetaClass.Modifier.PRIVATE])
            
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
                    body = body.replace('/"+"+"', '/"')
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
    
imports = []
imports.append("java.io.BufferedReader")
imports.append("java.io.IOException")
imports.append("java.io.InputStreamReader")
imports.append("java.net.MalformedURLException")
imports.append("java.net.URL")
imports.append("java.net.URLConnection")
imports.append("org.json.JSONObject")
imports.append("org.json.JSONException")
    
print "starting code generation ..."
cg = NaoJavaCodeGenerator(imports)
cg.read_mapping("tojava.map")
f = open('Nao.java', 'w')
f.write(str(cg.generateCode()))
f.close()
print "finished"
