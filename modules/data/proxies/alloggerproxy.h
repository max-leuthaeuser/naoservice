// Generated for ALLogger version 1.10.22

#ifndef ALLOGGERPROXY_H_
#define ALLOGGERPROXY_H_
#include "alloggerproxyposthandler.h"

namespace AL
{
class ALBroker;
class ALProxy;

class ALLoggerProxyImpl;

/// <summary>This module allows you log errors, warnings, and info to syslog, stdout or a file. The verbosity level and/or filter allow you to customize the output.</summary>
class ALLoggerProxy
{
  private:
    ALPtr<ALLoggerProxyImpl> fImpl;

  public:
    
    /// <summary>
    /// Local Constructor
    /// </summary>
    ALLoggerProxy(ALPtr<ALBroker> pBroker);

    /// <summary>
    /// Remote Constructor
    /// </summary>
    ALLoggerProxy(std::string pIP, int pPort);

    /// <summary>
    /// Implements thread wrappers around methods
    /// </summary>
    ALLoggerProxyPostHandler post;

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
    /// Log a debug message.
    /// </summary>
    /// <param name="moduleName"> Name of the module. </param>
    /// <param name="message"> Log Message. </param>
    void debug(const std::string& moduleName, const std::string& message);

    /// <summary>
    /// Log an error.
    /// </summary>
    /// <param name="moduleName"> Name of the module. </param>
    /// <param name="message"> Log Message. </param>
    void error(const std::string& moduleName, const std::string& message);

    /// <summary>
    /// Exits and unregisters the module.
    /// </summary>
    void exit();

    /// <summary>
    /// Log a fatal error.
    /// </summary>
    /// <param name="moduleName"> Name of the module. </param>
    /// <param name="message"> Log Message. </param>
    void fatal(const std::string& moduleName, const std::string& message);

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
    /// Log a info message.
    /// </summary>
    /// <param name="moduleName"> Name of the module. </param>
    /// <param name="message"> Log Message. </param>
    void info(const std::string& moduleName, const std::string& message);

    /// <summary>
    /// Allows the logger to store logs in a file. Warning: this is not recomended on Nao.
    /// </summary>
    /// <param name="fileName"> The fileName to use. Relative to the user naoqi folder. </param>
    void logInFile(const std::string& fileName);

    /// <summary>
    /// Publish logs to a Log Forwarder. Pass an empty string in order to use the default value:  \"tcp://localhost:50998\"
    /// </summary>
    /// <param name="inputAddress"> Desired input ZMQ address of the Log Forwarder. </param>
    void logInForwarder(const std::string& inputAddress);

    /// <summary>
    /// Allows the logger to output logs to the standard output.
    /// </summary>
    void logInStd();

    /// <summary>
    /// Allows the logger to output logs to the system log. (Linux only)
    /// </summary>
    void logInSys();

    /// <summary>
    /// DEPRECIATED: Log a low priority debug message. Use debug instead.
    /// </summary>
    /// <param name="moduleName"> Name of the module. </param>
    /// <param name="message"> Log Message. </param>
    void lowDebug(const std::string& moduleName, const std::string& message);

    /// <summary>
    /// DEPRECIATED: Log a low priority information message. Use info instead.
    /// </summary>
    /// <param name="moduleName"> Name of the module. </param>
    /// <param name="message"> Log Message. </param>
    void lowInfo(const std::string& moduleName, const std::string& message);

    /// <summary>
    /// Just a ping. Always returns true
    /// </summary>
    /// <returns> returns true </returns>
    bool ping();

    /// <summary>
    /// Unsubscribe specified id from connection list.
    /// </summary>
    /// <param name="id"> Id used to register the handler. </param>
    void removeHandler(const std::string& id);

    /// <summary>
    /// output a simple line separator
    /// </summary>
    void separator();

    /// <summary>
    /// Creates a filter. Only messages containing the string will be logged. Use an empty string to remove the filter.
    /// </summary>
    /// <param name="filter"> The string that defines the filter. </param>
    void setFilter(const std::string& filter);

    /// <summary>
    /// set verbosity: debug, info, warning, error, fatal, silent. Default is info
    /// </summary>
    /// <param name="verbosity"> verbosity value </param>
    void setVerbosity(const std::string& verbosity);

    /// <summary>
    /// Returns the version of the module.
    /// </summary>
    /// <returns> A string containing the version of the module. </returns>
    std::string version();

    /// <summary>
    /// Log a warning.
    /// </summary>
    /// <param name="moduleName"> Name of the module. </param>
    /// <param name="message"> Log Message. </param>
    void warn(const std::string& moduleName, const std::string& message);

};

}
#endif // ALLOGGERPROXY_H_
