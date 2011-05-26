// Generated for ALPreferences version 1.10.22

#ifndef ALPREFERENCESPROXY_H_
#define ALPREFERENCESPROXY_H_
#include "alpreferencesproxyposthandler.h"

namespace AL
{
class ALBroker;
class ALProxy;

class ALPreferencesProxyImpl;

/// <summary>ALPreferences allows access to xml preference files.</summary>
class ALPreferencesProxy
{
  private:
    ALPtr<ALPreferencesProxyImpl> fImpl;

  public:
    
    /// <summary>
    /// Local Constructor
    /// </summary>
    ALPreferencesProxy(ALPtr<ALBroker> pBroker);

    /// <summary>
    /// Remote Constructor
    /// </summary>
    ALPreferencesProxy(std::string pIP, int pPort);

    /// <summary>
    /// Implements thread wrappers around methods
    /// </summary>
    ALPreferencesProxyPostHandler post;

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
    /// Reads all preferences from an xml files and stores them in an ALValue.
    /// </summary>
    /// <param name="fileName"> Name of the module associate to the preference. </param>
    /// <param name="autoGenerateMemoryNames"> If true a memory name will be generated for each non-array preference. </param>
    /// <returns> array reprenting the whole file. </returns>
    AL::ALValue readPrefFile(const std::string& fileName, const bool& autoGenerateMemoryNames);

    /// <summary>
    /// Writes all preferences from ALValue to an xml file.
    /// </summary>
    /// <param name="prefs"> array reprenting the whole file. </param>
    /// <returns> True upon success. </returns>
    bool saveToMemory(const AL::ALValue& prefs);

    /// <summary>
    /// Returns the version of the module.
    /// </summary>
    /// <returns> A string containing the version of the module. </returns>
    std::string version();

    /// <summary>
    /// Writes all preferences from ALValue to an xml file.
    /// </summary>
    /// <param name="fileName"> Name of the module associate to the preference. </param>
    /// <param name="prefs"> array reprenting the whole file. </param>
    /// <param name="ignoreMemoryNames"> If true all memory names will be removed before saving. </param>
    void writePrefFile(const std::string& fileName, const AL::ALValue& prefs, const bool& ignoreMemoryNames);

};

}
#endif // ALPREFERENCESPROXY_H_
