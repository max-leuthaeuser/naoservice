// Generated for ALInfrared version 1.10.22

#ifndef ALINFRAREDPROXY_H_
#define ALINFRAREDPROXY_H_
#include "alinfraredproxyposthandler.h"

namespace AL
{
class ALBroker;
class ALProxy;

class ALInfraredProxyImpl;

/// <summary>This module works with Linux Infrared Remote Control (LIRC) in order to emit/receive IR remotes keys or to emit/receive IR information to/from an other Nao.</summary>
class ALInfraredProxy
{
  private:
    ALPtr<ALInfraredProxyImpl> fImpl;

  public:
    
    /// <summary>
    /// Local Constructor
    /// </summary>
    ALInfraredProxy(ALPtr<ALBroker> pBroker);

    /// <summary>
    /// Remote Constructor
    /// </summary>
    ALInfraredProxy(std::string pIP, int pPort);

    /// <summary>
    /// Implements thread wrappers around methods
    /// </summary>
    ALInfraredProxyPostHandler post;

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
    /// Called during polling in order to update further information.
    /// </summary>
    /// <param name="Keyname"> Name of the next remote control key to reccord. </param>
    /// <returns> Returns the last message given by irrecord (LIRC program to record IR remote controls). </returns>
    std::string confRemoteRecordAddKey(const std::string& Keyname);

    /// <summary>
    /// Kill irrecord (LIRC program to record IR remote controls).
    /// </summary>
    /// <returns> Returns \"#BEGIN#\" to tell the web page to start from the beginning. </returns>
    std::string confRemoteRecordCancel();

    /// <summary>
    /// Called when the user validate a new key name.
    /// </summary>
    /// <returns> Returns the last message given by irrecord (LIRC program to record IR remote controls). </returns>
    std::string confRemoteRecordGetStatus();

    /// <summary>
    /// Called when the user click on NEXT.
    /// </summary>
    /// <returns> Returns the last message given by irrecord (lirc program to record IR remote control). </returns>
    std::string confRemoteRecordNext();

    /// <summary>
    /// Rewrite the LIRC daemon configuration file (lircd.conf) with everyremotes configuration concatenated, and reload it in LIRC daemons
    /// </summary>
    void confRemoteRecordSave();

    /// <summary>
    /// Start remote record process.
    /// </summary>
    /// <param name="Rm_name"> Name of the remote control to reccord. </param>
    void confRemoteRecordStart(const std::string& Rm_name);

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
    /// Init IR reception (connect as a client to the LIRC daemon).
    /// </summary>
    /// <param name="RepeatThreshold"> Give the keep-pressing threshold after which the repetition of a key is taken into consideration. </param>
    void initReception(const int& RepeatThreshold);

    /// <summary>
    /// Just a ping. Always returns true
    /// </summary>
    /// <returns> returns true </returns>
    bool ping();

    /// <summary>
    /// Send 4 octets by IR.
    /// </summary>
    /// <param name="Data_IR"> 4 octets to send through IR. </param>
    void send32(const std::string& Data_IR);

    /// <summary>
    /// Send 4 octets by IR.
    /// </summary>
    /// <param name="Octet1"> Octet 1 to send through IR. </param>
    /// <param name="Octet2"> Octet 2 to send through IR. </param>
    /// <param name="Octet3"> Octet 3 to send through IR. </param>
    /// <param name="Octet4"> Octet 4 to send through IR. </param>
    void send32(const int& Octet1, const int& Octet2, const int& Octet3, const int& Octet4);

    /// <summary>
    /// Send 1 octet by IR.
    /// </summary>
    /// <param name="Octet"> octet to send through IR. </param>
    void send8(const int& Octet);

    /// <summary>
    /// Send an IP by IR.
    /// </summary>
    /// <param name="IP"> IP adress to send through IR. </param>
    void sendIpAddress(const std::string& IP);

    /// <summary>
    /// Simulate a remote control (Nao as a remote control).
    /// </summary>
    /// <param name="Remote"> IR remote control name. </param>
    /// <param name="Key"> IR remote control key name. </param>
    void sendRemoteKey(const std::string& Remote, const std::string& Key);

    /// <summary>
    /// Returns the version of the module.
    /// </summary>
    /// <returns> A string containing the version of the module. </returns>
    std::string version();

};

}
#endif // ALINFRAREDPROXY_H_
