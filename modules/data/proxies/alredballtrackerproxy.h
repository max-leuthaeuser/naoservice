// Generated for ALRedBallTracker version 1.10.22

#ifndef ALREDBALLTRACKERPROXY_H_
#define ALREDBALLTRACKERPROXY_H_
#include "alredballtrackerproxyposthandler.h"

namespace AL
{
class ALBroker;
class ALProxy;

class ALRedBallTrackerProxyImpl;

/// <summary>This module is dedicated to Track a Red Ball expressed in NAO_SPACE.</summary>
class ALRedBallTrackerProxy
{
  private:
    ALPtr<ALRedBallTrackerProxyImpl> fImpl;

  public:
    
    /// <summary>
    /// Local Constructor
    /// </summary>
    ALRedBallTrackerProxy(ALPtr<ALBroker> pBroker);

    /// <summary>
    /// Remote Constructor
    /// </summary>
    ALRedBallTrackerProxy(std::string pIP, int pPort);

    /// <summary>
    /// Implements thread wrappers around methods
    /// </summary>
    ALRedBallTrackerProxyPostHandler post;

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
    /// Return the position of the red ball in NAO_SPACE.
    /// </summary>
    /// <returns> An Array containing the red ball position [x, y, z]. </returns>
    std::vector<float> getPosition();

    /// <summary>
    /// Gets the method usage string. This summarise how to use the method.
    /// </summary>
    /// <param name="name"> The name of the method. </param>
    /// <returns> A string that summarises the usage of the method. </returns>
    std::string getUsage(const std::string& name);

    /// <summary>
    /// Return true if the red Ball Tracker is running.
    /// </summary>
    /// <returns> true if the red Ball Tracker is running. </returns>
    bool isActive();

    /// <summary>
    /// Return true if a new Red Ball was detected since the last getPosition().
    /// </summary>
    /// <returns> true if a new Red Ball was detected since the last getPosition(). </returns>
    bool isNewData();

    /// <summary>
    /// Just a ping. Always returns true
    /// </summary>
    /// <returns> returns true </returns>
    bool ping();

    /// <summary>
    /// if true, the tracking will be through a Whole Body Process.
    /// </summary>
    /// <param name="pWholeBodyOn"> The whole Body state </param>
    void setWholeBodyOn(const bool& pWholeBodyOn);

    /// <summary>
    /// Start the tracker by Subscribing to Event redBallDetected from ALRedBallDetection module.
    /// </summary>
    void startTracker();

    /// <summary>
    /// Start the tracker by Unsubscribing to Event redBallDetected from ALRedBallDetection module.
    /// </summary>
    void stopTracker();

    /// <summary>
    /// Returns the version of the module.
    /// </summary>
    /// <returns> A string containing the version of the module. </returns>
    std::string version();

};

}
#endif // ALREDBALLTRACKERPROXY_H_
