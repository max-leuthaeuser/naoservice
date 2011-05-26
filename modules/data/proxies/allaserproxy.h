// Generated for ALLaser version 1.10.22

#ifndef ALLASERPROXY_H_
#define ALLASERPROXY_H_
#include "allaserproxyposthandler.h"

namespace AL
{
class ALBroker;
class ALProxy;

class ALLaserProxyImpl;

/// <summary>Allow control over Hokuyo laser when available on Nao's head.</summary>
class ALLaserProxy
{
  private:
    ALPtr<ALLaserProxyImpl> fImpl;

  public:
    
    /// <summary>
    /// Local Constructor
    /// </summary>
    ALLaserProxy(ALPtr<ALBroker> pBroker);

    /// <summary>
    /// Remote Constructor
    /// </summary>
    ALLaserProxy(std::string pIP, int pPort);

    /// <summary>
    /// Implements thread wrappers around methods
    /// </summary>
    ALLaserProxyPostHandler post;

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
    /// Disable laser light
    /// </summary>
    void laserOFF();

    /// <summary>
    /// Enable laser light and sampling
    /// </summary>
    void laserON();

    /// <summary>
    /// Just a ping. Always returns true
    /// </summary>
    /// <returns> returns true </returns>
    bool ping();

    /// <summary>
    /// Set detection threshold of the laser
    /// </summary>
    /// <param name="length_min_l"> int containing the min length that the laser will detect(mm), this value must be upper than 20 mm </param>
    /// <param name="length_max_l"> int containing the max length that the laser will detect(mm), this value must be lower than 5600 mm </param>
    void setDetectingLength(const AL::ALValue& length_min_l, const AL::ALValue& length_max_l);

    /// <summary>
    /// Set openning angle of the laser
    /// </summary>
    /// <param name="angle_min_f"> float containing the min value in rad, this value must be upper than -2.35619449 </param>
    /// <param name="angle_max_f"> float containing the max value in rad, this value must be lower than 2.092349795 </param>
    void setOpeningAngle(const AL::ALValue& angle_min_f, const AL::ALValue& angle_max_f);

    /// <summary>
    /// Returns the version of the module.
    /// </summary>
    /// <returns> A string containing the version of the module. </returns>
    std::string version();

};

}
#endif // ALLASERPROXY_H_
