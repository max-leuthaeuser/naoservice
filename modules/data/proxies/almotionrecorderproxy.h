// Generated for ALMotionRecorder version 1.10.22

#ifndef ALMOTIONRECORDERPROXY_H_
#define ALMOTIONRECORDERPROXY_H_
#include "almotionrecorderproxyposthandler.h"

namespace AL
{
class ALBroker;
class ALProxy;

class ALMotionRecorderProxyImpl;

/// <summary>ALMotionRecorder is a module giving the possibility to record Nao's motors poses. A first possibility is to record periodically, ie. a pose is stored every t seconds. Another possibility is to use an interactive mode where the user choses when a poses must be stored.</summary>
class ALMotionRecorderProxy
{
  private:
    ALPtr<ALMotionRecorderProxyImpl> fImpl;

  public:
    
    /// <summary>
    /// Local Constructor
    /// </summary>
    ALMotionRecorderProxy(ALPtr<ALBroker> pBroker);

    /// <summary>
    /// Remote Constructor
    /// </summary>
    ALMotionRecorderProxy(std::string pIP, int pPort);

    /// <summary>
    /// Implements thread wrappers around methods
    /// </summary>
    ALMotionRecorderProxyPostHandler post;

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
    /// Called by ALMemory when subcription data is updated.
    /// </summary>
    /// <param name="dataName"> Name of the subscribed data. </param>
    /// <param name="data"> Value of the the subscribed data </param>
    /// <param name="message"> The message give when subscribing. </param>
    void dataChanged(const std::string& dataName, const AL::ALValue& data, const std::string& message);

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
    /// Start recording the motion in an interactive mode
    /// </summary>
    /// <param name="jointsToRecord"> Names of joints that must be recorded </param>
    /// <param name="nbPoses"> Default number of poses to record </param>
    /// <param name="extensionAllowed"> Set to true to ignore nbPoses and keep recording new poses as long as record is not manually stopped </param>
    /// <param name="mode"> Indicates which interactive mode must be used. 1 : Use rigth bumper to enslave and left bumper to store the pose </param>
    void startInteractiveRecording(const std::vector<std::string>& jointsToRecord, const int& nbPoses, const bool& extensionAllowed, const int& mode);

    /// <summary>
    /// Start recording the motion in a periodic mode
    /// </summary>
    /// <param name="jointsToRecord"> Names of joints that must be recorded </param>
    /// <param name="nbPoses"> Default number of poses to record </param>
    /// <param name="extensionAllowed"> set to true to ignore nbPoses and keep recording new poses as long as record is not manually stopped </param>
    /// <param name="timeStep"> Time in seconds to wait between two poses </param>
    /// <param name="jointsToReplay"> Names of joints that must be replayed </param>
    /// <param name="replayData"> An ALValue holding data for replayed joints. It holds two ALValues. The first one is an AlValue where each line corresponds to a joint, and column elements are times of control points The second one is also an ALValue where each line corresponds to a joint, but column elements are arrays containing [float angle, Handle1, Handle2] elements, where Handle is [int InterpolationType, float dAngle, float dTime] describing the handle offsets relative to the angle and time of the point. The first bezier param describes the handle that controls the curve preceding the point, the second describes the curve following the point. </param>
    void startPeriodicRecording(const std::vector<std::string>& jointsToRecord, const int& nbPoses, const bool& extensionAllowed, const float& timeStep, const std::vector<std::string>& jointsToReplay, const AL::ALValue& replayData);

    /// <summary>
    /// Stop recording the motion and return data
    /// </summary>
    /// <returns> Returns the recorded data as an ALValue </returns>
    AL::ALValue stopAndGetRecording();

    /// <summary>
    /// Returns the version of the module.
    /// </summary>
    /// <returns> A string containing the version of the module. </returns>
    std::string version();

};

}
#endif // ALMOTIONRECORDERPROXY_H_
