// Generated for ALBluetooth version 1.10.22

#ifndef ALBLUETOOTHPROXY_H_
#define ALBLUETOOTHPROXY_H_
#include "albluetoothproxyposthandler.h"

namespace AL
{
class ALBroker;
class ALProxy;

class ALBluetoothProxyImpl;

/// <summary>This module handle one or several Aldebaran's bluetooth boards.</summary>
class ALBluetoothProxy
{
  private:
    ALPtr<ALBluetoothProxyImpl> fImpl;

  public:
    
    /// <summary>
    /// Local Constructor
    /// </summary>
    ALBluetoothProxy(ALPtr<ALBroker> pBroker);

    /// <summary>
    /// Remote Constructor
    /// </summary>
    ALBluetoothProxy(std::string pIP, int pPort);

    /// <summary>
    /// Implements thread wrappers around methods
    /// </summary>
    ALBluetoothProxyPostHandler post;

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
    /// Connect to all associated devices that we found.
    /// </summary>
    void connect();

    /// <summary>
    /// Connect to a specific device.
    /// </summary>
    /// <param name="devicename"> the device name, this will be used to refer to the device later </param>
    void connect(const std::string& devicename);

    /// <summary>
    /// Disconnect all bluetooth devices
    /// </summary>
    void disconnect();

    /// <summary>
    /// Disconnect a bluetooth device
    /// </summary>
    /// <param name="devicename"> the device name to disconnect </param>
    void disconnect(const std::string& devicename);

    /// <summary>
    /// Exits and unregisters the module.
    /// </summary>
    void exit();

    /// <summary>
    /// list all bluetooth devices that are associated with nao.
    /// </summary>
    /// <returns> a list of bluetooth device <name, address> </returns>
    AL::ALValue getAssociatedDeviceList();

    /// <summary>
    /// Gets the name of the parent broker.
    /// </summary>
    /// <returns> The name of the parent broker. </returns>
    std::string getBrokerName();

    /// <summary>
    /// list all connected bluetooth devices
    /// </summary>
    /// <returns> a list of connected bluetooth device <name> </returns>
    std::vector<std::string> getConnectedDeviceList();

    /// <summary>
    /// list all available bluetooth devices (need a scan before)
    /// </summary>
    /// <returns> a list of bluetooth device <name, address> </returns>
    AL::ALValue getDeviceList();

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
    /// Is a device connected?
    /// </summary>
    /// <param name="devicename"> the device name </param>
    /// <returns> return true is the device is connected </returns>
    bool isConnected(const std::string& devicename);

    /// <summary>
    /// Just a ping. Always returns true
    /// </summary>
    /// <returns> returns true </returns>
    bool ping();

    /// <summary>
    /// Scan for bluetooth devices, this may take up to 10 seconds
    /// </summary>
    /// <returns> a list of bluetooth devices <name, address> </returns>
    AL::ALValue scan();

    /// <summary>
    /// Send data to a bluetooth device, each value should be provided.
    /// </summary>
    /// <param name="devicename"> the device name </param>
    /// <param name="PWMs"> array of 4 signed short, should be between -32768 and 32768 (duty cycle ranging from -100% to 100%) </param>
    /// <param name="servos"> array of 2 unsigned short, should be between 500 and 2500 (pulse width in microsecond) </param>
    /// <param name="GPIOs"> array of 4 bool </param>
    void send(const std::string& devicename, const AL::ALValue& PWMs, const AL::ALValue& servos, const AL::ALValue& GPIOs);

    /// <summary>
    /// set the device list that nao should handle. Association will be persistent after reboot.
    /// </summary>
    /// <param name="deviceList"> list of bluetooth device <name, address> </param>
    void setAssociatedDeviceList(const AL::ALValue& deviceList);

    /// <summary>
    /// Returns the version of the module.
    /// </summary>
    /// <returns> A string containing the version of the module. </returns>
    std::string version();

};

}
#endif // ALBLUETOOTHPROXY_H_
