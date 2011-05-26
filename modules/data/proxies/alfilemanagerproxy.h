// Generated for ALFileManager version 1.10.22

#ifndef ALFILEMANAGERPROXY_H_
#define ALFILEMANAGERPROXY_H_
#include "alfilemanagerproxyposthandler.h"

namespace AL
{
class ALBroker;
class ALProxy;

class ALFileManagerProxyImpl;

/// <summary>ALFileManager manages the user files stored in a shared folder.</summary>
class ALFileManagerProxy
{
  private:
    ALPtr<ALFileManagerProxyImpl> fImpl;

  public:
    
    /// <summary>
    /// Local Constructor
    /// </summary>
    ALFileManagerProxy(ALPtr<ALBroker> pBroker);

    /// <summary>
    /// Remote Constructor
    /// </summary>
    ALFileManagerProxy(std::string pIP, int pPort);

    /// <summary>
    /// Implements thread wrappers around methods
    /// </summary>
    ALFileManagerProxyPostHandler post;

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
    /// Try to find if this file does exist on robot or not.
    /// </summary>
    /// <param name="fileName"> Name of the module associate to the preference. </param>
    /// <returns> True upon success </returns>
    bool dataFileExists(const std::string& fileName);

    /// <summary>
    /// Exits and unregisters the module.
    /// </summary>
    void exit();

    /// <summary>
    /// Try to find if this file does exist on robot or not.
    /// </summary>
    /// <param name="fileName"> Name of the module associate to the preference. </param>
    /// <returns> True upon success </returns>
    bool fileExists(const std::string& fileName);

    /// <summary>
    /// Gets the name of the parent broker.
    /// </summary>
    /// <returns> The name of the parent broker. </returns>
    std::string getBrokerName();

    /// <summary>
    /// Returns the complete path of the file if it does exist. Starts by looking in user's shared folder, then in system folder.
    /// </summary>
    /// <param name="prefs"> array reprenting the whole file. </param>
    /// <returns> True upon success </returns>
    std::string getFileCompletePath(const std::string& prefs);

    /// <summary>
    /// Returns the complete path of the file if it does exist. Starts by looking in user's shared folder, then in system folder.
    /// </summary>
    /// <param name="prefs"> array reprenting the whole file. </param>
    /// <returns> True upon success </returns>
    AL::ALValue getFileContents(const std::string& prefs);

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
    /// Get the current system shared folder path.
    /// </summary>
    /// <returns> System shared folder path string. </returns>
    std::string getSystemSharedFolderPath();

    /// <summary>
    /// Gets the method usage string. This summarise how to use the method.
    /// </summary>
    /// <param name="name"> The name of the method. </param>
    /// <returns> A string that summarises the usage of the method. </returns>
    std::string getUsage(const std::string& name);

    /// <summary>
    /// Get the current user shared folder path.
    /// </summary>
    /// <returns> User shared folder path string. </returns>
    std::string getUserSharedFolderPath();

    /// <summary>
    /// Just a ping. Always returns true
    /// </summary>
    /// <returns> returns true </returns>
    bool ping();

    /// <summary>
    /// Set a new value of the user shared folder path.
    /// </summary>
    /// <param name="fileName"> Name of the module associate to the preference. </param>
    void setUserSharedFolderPath(const std::string& fileName);

    /// <summary>
    /// Returns the version of the module.
    /// </summary>
    /// <returns> A string containing the version of the module. </returns>
    std::string version();

};

}
#endif // ALFILEMANAGERPROXY_H_
