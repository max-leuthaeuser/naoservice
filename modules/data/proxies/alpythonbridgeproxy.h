// Generated for ALPythonBridge version 1.10.22

#ifndef ALPYTHONBRIDGEPROXY_H_
#define ALPYTHONBRIDGEPROXY_H_
#include "alpythonbridgeproxyposthandler.h"

namespace AL
{
class ALBroker;
class ALProxy;

class ALPythonBridgeProxyImpl;

/// <summary>This module evaluates python commands on the fly.</summary>
class ALPythonBridgeProxy
{
  private:
    ALPtr<ALPythonBridgeProxyImpl> fImpl;

  public:
    
    /// <summary>
    /// Local Constructor
    /// </summary>
    ALPythonBridgeProxy(ALPtr<ALBroker> pBroker);

    /// <summary>
    /// Remote Constructor
    /// </summary>
    ALPythonBridgeProxy(std::string pIP, int pPort);

    /// <summary>
    /// Implements thread wrappers around methods
    /// </summary>
    ALPythonBridgeProxyPostHandler post;

    // --- methods from ALProxy ----

    /// <summary>
    /// Gets the underlying generic proxy
    /// </summary>
    ALPtr<ALProxy> getGenericProxy();

    /// <summary>
    /// Wait for the end of a long running method that was called using 'post'
    /// </summary>
    /// <param name="id">The ID of the method that was returned when calling the method using 'post'</param>
    /// <param name="timeoutPeriod">The timeout period in ms. To wait indefinately, use a timeoutPeriod of zero.</param>
    /// <returns>True if the timeout period terminated. False if the method returned.</returns>
    bool wait(const int& id, const int& timeoutPeriod);

    /// <summary>
    /// stop a long running method that was called using 'post'
    /// </summary>
    /// <param name="id">The ID of the method that was returned when calling the method using 'post'</param>
    /// <returns>True if if the method is currently running.</returns>
    void stop(const int& id);

    /// <summary>
    /// isRunning
    /// </summary>
    /// <param name="id">The ID of the method that was returned when calling the method using 'post'</param>
    /// <returns>True if if the method is currently running.</returns>
    bool isRunning(const int& id);

    // ------------------------------

    /// <summary>
    /// eval script
    /// </summary>
    /// <param name="stringToEvaluate"> string to eval </param>
    /// <returns> if the evaluation has gone wrong </returns>
    std::string eval(const std::string& stringToEvaluate);

    /// <summary>
    /// evaluates script and returns an informative array.
    /// </summary>
    /// <param name="stringToEvaluate"> string to eval </param>
    /// <returns> an array containing [return value, exceptions, stdout, stderr] </returns>
    AL::ALValue evalFull(const std::string& stringToEvaluate);

    /// <summary>
    /// eval script and return result. evalReturn(2+2) will return 4
    /// </summary>
    /// <param name="stringToEvaluate"> string to eval </param>
    /// <returns> the result of the evaluation </returns>
    AL::ALValue evalReturn(const std::string& stringToEvaluate);

    /// <summary>
    /// Exits and unregisters the module.
    /// </summary>
    void exit();

    /// <summary>
    /// Gets the name of the parent broker.
    /// </summary>
    /// <returns> The name of the parent broker. </returns>
    std::string getBrokerName();

    /// <summary>
    /// Retrieves a method's description.
    /// </summary>
    /// <param name="methodName"> The name of the method. </param>
    /// <returns> A structure containing the method's description. </returns>
    AL::ALValue getMethodHelp(const std::string& methodName);

    /// <summary>
    /// Retrieves the module's method list.
    /// </summary>
    /// <returns> An array of method names. </returns>
    std::vector<std::string> getMethodList();

    /// <summary>
    /// Retrieves the module's description.
    /// </summary>
    /// <returns> A structure describing the module. </returns>
    AL::ALValue getModuleHelp();

    /// <summary>
    /// Gets the method usage string. This summarise how to use the method.
    /// </summary>
    /// <param name="name"> The name of the method. </param>
    /// <returns> A string that summarises the usage of the method. </returns>
    std::string getUsage(const std::string& name);

    /// <summary>
    /// Just a ping. Always returns true
    /// </summary>
    /// <returns> returns true </returns>
    bool ping();

    /// <summary>
    /// Returns the version of the module.
    /// </summary>
    /// <returns> A string containing the version of the module. </returns>
    std::string version();

};

}
#endif // ALPYTHONBRIDGEPROXY_H_
