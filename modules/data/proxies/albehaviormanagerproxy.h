// Generated for ALBehaviorManager version 1.10.22

#ifndef ALBEHAVIORMANAGERPROXY_H_
#define ALBEHAVIORMANAGERPROXY_H_
#include "albehaviormanagerproxyposthandler.h"

namespace AL
{
class ALBroker;
class ALProxy;

class ALBehaviorManagerProxyImpl;

/// <summary>This module is intended to manage behaviors.</summary>
class ALBehaviorManagerProxy
{
  private:
    ALPtr<ALBehaviorManagerProxyImpl> fImpl;

  public:
    
    /// <summary>
    /// Local Constructor
    /// </summary>
    ALBehaviorManagerProxy(ALPtr<ALBroker> pBroker);

    /// <summary>
    /// Remote Constructor
    /// </summary>
    ALBehaviorManagerProxy(std::string pIP, int pPort);

    /// <summary>
    /// Implements thread wrappers around methods
    /// </summary>
    ALBehaviorManagerProxyPostHandler post;

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
    /// Set the given behavior as default
    /// </summary>
    /// <param name="name"> The behavior name </param>
    void addDefaultBehavior(const std::string& name);

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
    /// Get default behaviors
    /// </summary>
    /// <returns> Return default behaviors </returns>
    std::vector<std::string> getDefaultBehaviors();

    /// <summary>
    /// Get installed behaviors names
    /// </summary>
    /// <returns> Returns the behaviors list. </returns>
    std::vector<std::string> getInstalledBehaviors();

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
    /// Get running behaviors
    /// </summary>
    /// <returns> Return running behaviors </returns>
    std::vector<std::string> getRunningBehaviors();

    /// <summary>
    /// Gets the method usage string. This summarise how to use the method.
    /// </summary>
    /// <param name="name"> The name of the method. </param>
    /// <returns> A string that summarises the usage of the method. </returns>
    std::string getUsage(const std::string& name);

    /// <summary>
    /// Tell if supplied name corresponds to a valid behavior
    /// </summary>
    /// <param name="name"> The behavior directory name </param>
    /// <returns> Returns true if it is a valid behavior </returns>
    bool isBehaviorInstalled(const std::string& name);

    /// <summary>
    /// Tell if supplied name corresponds to a running behavior
    /// </summary>
    /// <param name="name"> The behavior directory name </param>
    /// <returns> Returns true if it is a running behavior </returns>
    bool isBehaviorRunning(const std::string& name);

    /// <summary>
    /// Just a ping. Always returns true
    /// </summary>
    /// <returns> returns true </returns>
    bool ping();

    /// <summary>
    /// Play default behaviors
    /// </summary>
    void playDefaultProject();

    /// <summary>
    /// Load a behavior from its directory name
    /// </summary>
    /// <param name="name"> The behavior directory name </param>
    /// <returns> Returns true if it was successfully loaded. </returns>
    bool preloadBehavior(const std::string& name);

    /// <summary>
    /// Remove a behavior from the filesystem
    /// </summary>
    /// <param name="name"> The behavior directory name </param>
    /// <returns> Return true if succeeded, else false </returns>
    bool removeBehavior(const std::string& name);

    /// <summary>
    /// Remove the given behavior from the default behaviors
    /// </summary>
    /// <param name="name"> The behavior directory name </param>
    void removeDefaultBehavior(const std::string& name);

    /// <summary>
    /// Run a behavior
    /// </summary>
    /// <param name="name"> The behavior directory name </param>
    void runBehavior(const std::string& name);

    /// <summary>
    /// Stop all behaviors
    /// </summary>
    void stopAllBehaviors();

    /// <summary>
    /// Stop a behavior
    /// </summary>
    /// <param name="name"> The behavior directory name </param>
    void stopBehavior(const std::string& name);

    /// <summary>
    /// Returns the version of the module.
    /// </summary>
    /// <returns> A string containing the version of the module. </returns>
    std::string version();

};

}
#endif // ALBEHAVIORMANAGERPROXY_H_
