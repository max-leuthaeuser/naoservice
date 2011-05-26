// Generated for DCM version 1.10.22

#ifndef DCMPROXY_H_
#define DCMPROXY_H_
#include "dcmproxyposthandler.h"

namespace AL
{
class ALBroker;
class ALProxy;

class DCMProxyImpl;

/// <summary>Manage link with devices (sensors and actuators). See specific documentation.</summary>
class DCMProxy
{
  private:
    ALPtr<DCMProxyImpl> fImpl;

  public:
    
    /// <summary>
    /// Local Constructor
    /// </summary>
    DCMProxy(ALPtr<ALBroker> pBroker);

    /// <summary>
    /// Remote Constructor
    /// </summary>
    DCMProxy(std::string pIP, int pPort);

    /// <summary>
    /// Implements thread wrappers around methods
    /// </summary>
    DCMProxyPostHandler post;

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
    /// Calibration of a joint
    /// </summary>
    /// <param name="calibrationInput"> Internal use only </param>
    void calibration(const AL::ALValue& calibrationInput);

    /// <summary>
    /// Create or change an alias (list of actuators)
    /// </summary>
    /// <param name="alias"> Alias name and description </param>
    /// <returns> Same as pParams, but with the name removed if the actuator is not found </returns>
    AL::ALValue createAlias(const AL::ALValue& alias);

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
    /// Return the STM base name
    /// </summary>
    /// <returns> the STM base name for all device/sensors (1st string in the array) and all devices (2nd string in the array) </returns>
    AL::ALValue getPrefix();

    /// <summary>
    /// Return the DCM time
    /// </summary>
    /// <param name="offset"> optional time in ms (signed) to add/remove </param>
    /// <returns> An integer (could be signed) with the DCM time </returns>
    int getTime(const int& offset);

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
    /// Save updated value from DCM in XML pref file
    /// </summary>
    /// <param name="action"> string : 'Save' 'Load' 'Add' </param>
    /// <param name="target"> string : 'Chest' 'Head' 'Main' 'All' </param>
    /// <param name="keyName"> The name of the key if action = 'Add'. </param>
    /// <param name="keyValue"> The ALVAlue of the key to add </param>
    /// <returns> Nothing </returns>
    int preferences(const std::string& action, const std::string& target, const std::string& keyName, const AL::ALValue& keyValue);

    /// <summary>
    /// Call this function to send a timed-command list to an actuator
    /// </summary>
    /// <param name="commands"> AL::ALValue with all data </param>
    void set(const AL::ALValue& commands);

    /// <summary>
    /// Call this function to send timed-command list to an alias (list of actuators)
    /// </summary>
    /// <param name="commands"> AL::ALValue with all data </param>
    void setAlias(const AL::ALValue& commands);

    /// <summary>
    /// Special DCM commands
    /// </summary>
    /// <param name="result"> one string and could be Reset, Version, Chain, Diagnostic, Config </param>
    void special(const std::string& result);

    /// <summary>
    /// Returns the version of the module.
    /// </summary>
    /// <returns> A string containing the version of the module. </returns>
    std::string version();

};

}
#endif // DCMPROXY_H_
