def parseToHtml(filename, proxyname):
    '''
    Parses a cpp header file and returns a html formatted
    string containing public methods and their arguments
    
    @arg filename the path to the cpp header to parse
    @arg proxyname the name of the proxy to introspect
    @return: a html formatted string containing public methods and their arguments
    '''
    import CppHeaderParser
    try:
        cppHeader = CppHeaderParser.CppHeader(filename)
    except CppHeaderParser.CppParseError, e:
        return str(e)
    
    proxy = cppHeader.classes[proxyname + "Proxy"]
    pmethods = proxy["methods"]["public"]
    
    result = "<h3>Methods of <i>%s</i></h3>" % proxyname
    result += "<ul>"
    # iterating over all public methods
    for m in pmethods:
        result += "<li>"
        # return type
        result += "<i>%s</i> " % m["rtnType"].replace(" ", "")
        # name of method
        result += m["name"]
        # iterating over all arguments
        for a in m["parameters"]:
            result += "<ul>"
            # name of argument
            result += a["name"]
            # type of argument
            result += " (%s)" % a["type"]
            result += "</ul>"
        result += "</li>"
    result += "</ul>"
    return result
