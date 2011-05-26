// Generated for ALResourceManager version 1.10.22

#ifndef ALRESOURCEMANAGERPROXY_H_
#define ALRESOURCEMANAGERPROXY_H_
#include "alresourcemanagerproxyposthandler.h"

namespace AL
{
class ALBroker;
class ALProxy;

class ALResourceManagerProxyImpl;

/// <summary>Manage robot resources: Synchronize movement, led, sound. Run specific actions when another behavior wants your resources</summary>
class ALResourceManagerProxy
{
  private:
    ALPtr<ALResourceManagerProxyImpl> fImpl;

  public:
    
    /// <summary>
    /// Local Constructor
    /// </summary>
    ALResourceManagerProxy(ALPtr<ALBroker> pBroker);

    /// <summary>
    /// Remote Constructor
    /// </summary>
    ALResourceManagerProxy(std::string pIP, int pPort);

    /// <summary>
    /// Implements thread wrappers around methods
    /// </summary>
    ALResourceManagerProxyPostHandler post;

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
    /// True if resources free
    /// </summary>
    /// <param name="resourceNames"> Resource names </param>
    /// <returns> True if all the specify resources are free </returns>
    bool areResourcesFree(const std::vector<std::string>& resourceNames);

    /// <summary>
    /// True if all the specified resources are owned by the owner
    /// </summary>
    /// <param name="resourceNameList"> Resource name </param>
    /// <param name="ownerName"> Owner pointer with hierarchy </param>
    /// <returns> True if all the specify resources are owned by the owner </returns>
    bool areResourcesOwnedBy(const std::vector<std::string>& resourceNameList, const std::string& ownerName);

    /// <summary>
    /// Create a resource
    /// </summary>
    /// <param name="resourceName"> Resource name to create </param>
    /// <param name="parentResourceName"> Parent resource name or empty string for root resource </param>
    void createResource(const std::string& resourceName, const std::string& parentResourceName);

    /// <summary>
    /// Enable or disable a state resource
    /// </summary>
    /// <param name="resourceName"> The name of the resource that you wish enable of disable. e.g. Standing </param>
    /// <param name="enabled"> True to enable, false to disable </param>
    void enableStateResource(const std::string& resourceName, const bool& enabled);

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
    /// Release resource
    /// </summary>
    /// <param name="resourceName"> Resource name </param>
    /// <param name="ownerName"> Existing owner name </param>
    void releaseResource(const std::string& resourceName, const std::string& ownerName);

    /// <summary>
    /// Release  resources list
    /// </summary>
    /// <param name="resourceNames"> Resource names </param>
    /// <param name="ownerName"> Owner name </param>
    void releaseResources(const std::vector<std::string>& resourceNames, const std::string& ownerName);

    /// <summary>
    /// Returns the version of the module.
    /// </summary>
    /// <returns> A string containing the version of the module. </returns>
    std::string version();

    /// <summary>
    /// Wait resource
    /// </summary>
    /// <param name="ressourceName"> Resource name </param>
    /// <param name="ownerName"> Owner name </param>
    /// <param name="callbackName"> callback name </param>
    /// <param name="timeoutSeconds"> Timeout in seconds </param>
    void waitForResource(const std::string& ressourceName, const std::string& ownerName, const std::string& callbackName, const int& timeoutSeconds);

};

}
#endif // ALRESOURCEMANAGERPROXY_H_
