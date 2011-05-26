// Generated for ALSentinel version 1.10.22

#ifndef ALSENTINELPROXY_H_
#define ALSENTINELPROXY_H_
#include "alsentinelproxyposthandler.h"

namespace AL
{
class ALBroker;
class ALProxy;

class ALSentinelProxyImpl;

/// <summary>ALSentinel (ex-ALWatchDog) is a module that implements vital services for Nao:</summary>
class ALSentinelProxy
{
  private:
    ALPtr<ALSentinelProxyImpl> fImpl;

  public:
    
    /// <summary>
    /// Local Constructor
    /// </summary>
    ALSentinelProxy(ALPtr<ALBroker> pBroker);

    /// <summary>
    /// Remote Constructor
    /// </summary>
    ALSentinelProxy(std::string pIP, int pPort);

    /// <summary>
    /// Implements thread wrappers around methods
    /// </summary>
    ALSentinelProxyPostHandler post;

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
    /// callback for internal use.
    /// </summary>
    /// <param name="dataName"> Name of the modified data </param>
    /// <param name="data"> value of the data </param>
    /// <param name="message"> associate message. </param>
    void BatteryChargeCellVoltageMinChanged(const std::string& dataName, const AL::ALValue& data, const std::string& message);

    /// <summary>
    /// callback for internal use.
    /// </summary>
    /// <param name="dataName"> Name of the modified data </param>
    /// <param name="data"> value of the data </param>
    /// <param name="message"> associate message. </param>
    void BatteryChargeStatusChanged(const std::string& dataName, const AL::ALValue& data, const std::string& message);

    /// <summary>
    /// check the battery information, voltage and alarm flag
    /// </summary>
    /// <param name="enable"> true of false to respectively enable or disable (default: true) </param>
    void enableBatteryMeasure(const bool& enable);

    /// <summary>
    /// check the remaining physical memory
    /// </summary>
    /// <param name="enable"> true of false to respectively enable or disable (default: true) </param>
    void enableCheckRemainingRam(const bool& enable);

    /// <summary>
    /// enable or disable the \"ouch\" action after two pushes.
    /// </summary>
    /// <param name="enable"> true of false to respectively enable or disable </param>
    void enableDefaultActionDoubleClick(const bool& enable);

    /// <summary>
    /// enable or disable the \"hello, i'm nao...\" after one short push of the Power button. In both cases the ALMemory ALSentinel/SimpleClickOccured key will be set to true, so users can read/registerOnChange it, then reset to false after handling the event.
    /// </summary>
    /// <param name="enable"> true of false to respectively enable or disable </param>
    void enableDefaultActionSimpleClick(const bool& enable);

    /// <summary>
    /// enable or disable the \"restart naoqi\" action after three pushes.
    /// </summary>
    /// <param name="enable"> true of false to respectively enable or disable </param>
    void enableDefaultActionTripleClick(const bool& enable);

    /// <summary>
    /// Enable or Disable heat monitoring.
    /// </summary>
    /// <param name="enable"> true to enable, false to disable, default: true </param>
    void enableHeatMonitoring(const bool& enable);

    /// <summary>
    /// Enable or Disable power monitoring.
    /// </summary>
    /// <param name="enable"> true to enable, false to disable, default: true </param>
    void enablePowerMonitoring(const bool& enable);

    /// <summary>
    /// Exits and unregisters the module.
    /// </summary>
    void exit();

    /// <summary>
    /// exit naoqi (warning: it will really exit Naoqi)
    /// </summary>
    void exitNaoqi();

    /// <summary>
    /// Get the battery level (0..5) 5: full 0: totally empty (never reached).
    /// </summary>
    /// <returns> the battery level (0..5): 5: full 0: totally empty (never reached) </returns>
    int getBatteryLevel();

    /// <summary>
    /// Get a text presentation of the battery level ('My battery is...').
    /// </summary>
    /// <returns> the sentence describing the battery level </returns>
    std::string getBatteryLevelDesc();

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
    /// get the remaining physical memory value (one shot)
    /// </summary>
    /// <returns> the remaining RAM in kb </returns>
    int getRemainingRam();

    /// <summary>
    /// Gets the method usage string. This summarise how to use the method.
    /// </summary>
    /// <param name="name"> The name of the method. </param>
    /// <returns> A string that summarises the usage of the method. </returns>
    std::string getUsage(const std::string& name);

    /// <summary>
    /// callback for internal use.
    /// </summary>
    /// <param name="dataName"> Name of the modified data </param>
    /// <param name="data"> value of the data </param>
    /// <param name="message"> associate message. </param>
    void onAccX(const std::string& dataName, const AL::ALValue& data, const std::string& message);

    /// <summary>
    /// callback for internal use.
    /// </summary>
    /// <param name="dataName"> Name of the modified data </param>
    /// <param name="data"> value of the data </param>
    /// <param name="message"> associate message. </param>
    void onAccY(const std::string& dataName, const AL::ALValue& data, const std::string& message);

    /// <summary>
    /// callback for internal use.
    /// </summary>
    /// <param name="dataName"> Name of the modified data </param>
    /// <param name="data"> value of the data </param>
    /// <param name="message"> associate message. </param>
    void onAccZ(const std::string& dataName, const AL::ALValue& data, const std::string& message);

    /// <summary>
    /// callback for internal use.
    /// </summary>
    /// <param name="dataName"> Name of the modified data </param>
    /// <param name="data"> value of the data </param>
    /// <param name="message"> associate message. </param>
    void onBatteryMeasure(const std::string& dataName, const AL::ALValue& data, const std::string& message);

    /// <summary>
    /// callback for change in battery power level. (internal use).
    /// </summary>
    /// <param name="dataName"> Name of the modified data </param>
    /// <param name="data"> value of the data </param>
    /// <param name="message"> associate message. </param>
    void onMotorError(const std::string& dataName, const AL::ALValue& data, const std::string& message);

    /// <summary>
    /// callback for change in battery power level. (internal use).
    /// </summary>
    /// <param name="dataName"> Name of the modified data </param>
    /// <param name="data"> value of the data </param>
    /// <param name="message"> associate message. </param>
    void onTemperatureMeasure(const std::string& dataName, const AL::ALValue& data, const std::string& message);

    /// <summary>
    /// Just a ping. Always returns true
    /// </summary>
    /// <returns> returns true </returns>
    bool ping();

    /// <summary>
    /// callback when the power button is pressed. (internal use).
    /// </summary>
    /// <param name="dataName"> Name of the modified data </param>
    /// <param name="data"> value of the data </param>
    /// <param name="message"> associate message. </param>
    void powerButtonOnPress(const std::string& dataName, const AL::ALValue& data, const std::string& message);

    /// <summary>
    /// Launch a small presentation of Nao: name, ip, battery. It's the default behavior launched when user press on the chest
    /// </summary>
    /// <param name="enableFastCheckJoints"> if true, Nao will quickly check that his joints are moving properly. </param>
    void presentation(const bool& enableFastCheckJoints);

    /// <summary>
    /// Monitors buttons and Battery.
    /// </summary>
    void run();

    /// <summary>
    /// Change the power threshold; below it, Nao will sit down and remove power from his motors.
    /// </summary>
    /// <param name="powerLimit"> power limit in percent, default: 0.07; 0.00 to disable this feature. </param>
    void setPowerLimit(const float& powerLimit);

    /// <summary>
    /// Returns the version of the module.
    /// </summary>
    /// <returns> A string containing the version of the module. </returns>
    std::string version();

};

}
#endif // ALSENTINELPROXY_H_
