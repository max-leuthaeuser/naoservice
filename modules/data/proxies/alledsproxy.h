// Generated for ALLeds version 1.10.22

#ifndef ALLEDSPROXY_H_
#define ALLEDSPROXY_H_
#include "alledsproxyposthandler.h"

namespace AL
{
class ALBroker;
class ALProxy;

class ALLedsProxyImpl;

/// <summary>ALLeds contains helper methods for controlling the Light Emiting Devices (LEDs).</summary>
class ALLedsProxy
{
  private:
    ALPtr<ALLedsProxyImpl> fImpl;

  public:
    
    /// <summary>
    /// Local Constructor
    /// </summary>
    ALLedsProxy(ALPtr<ALBroker> pBroker);

    /// <summary>
    /// Remote Constructor
    /// </summary>
    ALLedsProxy(std::string pIP, int pPort);

    /// <summary>
    /// Implements thread wrappers around methods
    /// </summary>
    ALLedsProxyPostHandler post;

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
    /// Makes a group name for ease of setting multiple LEDs.
    /// </summary>
    /// <param name="groupName"> The name of the group. </param>
    /// <param name="ledNames"> A vector of the names of the LEDs in the group. </param>
    void createGroup(const std::string& groupName, const std::vector<std::string>& ledNames);

    /// <summary>
    /// An animation to show a direction with the ears.
    /// </summary>
    /// <param name="degrees"> The angle you want to show in degrees (int). 0 is up, 90 is forwards, 180 is down and 270 is back. </param>
    /// <param name="duration"> The duration in seconds of the animation. </param>
    /// <param name="leaveOnAtEnd"> If true the last led is left on at the end of the animation. </param>
    void earLedsSetAngle(const int& degrees, const float& duration, const bool& leaveOnAtEnd);

    /// <summary>
    /// Exits and unregisters the module.
    /// </summary>
    void exit();

    /// <summary>
    /// Sets the intensity of a LED or Group of LEDs within a given time.
    /// </summary>
    /// <param name="name"> The name of the LED or Group. </param>
    /// <param name="intensity"> The intensity of the LED or Group (a value between 0 and 1). </param>
    /// <param name="duration"> The duration of the fade in seconds </param>
    void fade(const std::string& name, const float& intensity, const float& duration);

    /// <summary>
    /// Chain a list of color for a device, as the motion.doMove command.
    /// </summary>
    /// <param name="name"> The name of the LED or Group. </param>
    /// <param name="rgbList"> List of RGB led value, RGB as seen in hexa-decimal: 0x00RRGGBB. </param>
    /// <param name="timeList"> List of time to go to given intensity. </param>
    void fadeListRGB(const std::string& name, const AL::ALValue& rgbList, const AL::ALValue& timeList);

    /// <summary>
    /// Sets the intensity of a led. If the name matches an RGB led, all channels are set to the same value.
    /// </summary>
    /// <param name="name"> The name of the LED or Group. </param>
    /// <param name="rgb"> The RGB value led, RGB as seen in hexa-decimal: 0x00RRGGBB. </param>
    /// <param name="duration"> Time used to fade in seconds. </param>
    void fadeRGB(const std::string& name, const int& rgb, const float& duration);

    /// <summary>
    /// Gets the name of the parent broker.
    /// </summary>
    /// <returns> The name of the parent broker. </returns>
    std::string getBrokerName();

    /// <summary>
    /// Gets the intensity of a LED or device
    /// </summary>
    /// <param name="name"> The name of the LED or Group. </param>
    /// <returns> The intensity of the LED or Group. </returns>
    AL::ALValue getIntensity(const std::string& name);

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
    /// Lists the devices in the group.
    /// </summary>
    /// <param name="groupName"> The name of the Group. </param>
    /// <returns> A vector of string device names. </returns>
    std::vector<std::string> listGroup(const std::string& groupName);

    /// <summary>
    /// Lists available group names.
    /// </summary>
    /// <returns> A vector of group names. </returns>
    std::vector<std::string> listGroups();

    /// <summary>
    /// Lists the devices aliased by a short LED name.
    /// </summary>
    /// <param name="arg1"> arg </param>
    /// <returns> A vector of device names. </returns>
    std::vector<std::string> listLED(const std::string& arg1);

    /// <summary>
    /// Lists the short LED names.
    /// </summary>
    /// <returns> A vector of LED names. </returns>
    std::vector<std::string> listLEDs();

    /// <summary>
    /// Switch to a minimum intensity a LED or Group of LEDs.
    /// </summary>
    /// <param name="name"> The name of the LED or Group. </param>
    void off(const std::string& name);

    /// <summary>
    /// Switch to a maximum intensity a LED or Group of LEDs.
    /// </summary>
    /// <param name="name"> The name of the LED or Group. </param>
    void on(const std::string& name);

    /// <summary>
    /// Just a ping. Always returns true
    /// </summary>
    /// <returns> returns true </returns>
    bool ping();

    /// <summary>
    /// Launch a random animation in eyes
    /// </summary>
    /// <param name="duration"> Approximate duration of the animation in seconds. </param>
    void randomEyes(const float& duration);

    /// <summary>
    /// Launch a green/yellow/red rasta animation on all body.
    /// </summary>
    /// <param name="duration"> Approximate duration of the animation in seconds. </param>
    void rasta(const float& duration);

    /// <summary>
    /// Launch a rotation using the leds of the eyes.
    /// </summary>
    /// <param name="rgb"> the RGB value led, RGB as seen in hexa-decimal: 0x00RRGGBB. </param>
    /// <param name="timeForRotation"> Approximate time to make one turn. </param>
    /// <param name="totalDuration"> Approximate duration of the animation in seconds. </param>
    void rotateEyes(const int& rgb, const float& timeForRotation, const float& totalDuration);

    /// <summary>
    /// Sets the intensity of a LED or Group of LEDs.
    /// </summary>
    /// <param name="name"> The name of the LED or Group. </param>
    /// <param name="intensity"> The intensity of the LED or Group (a value between 0 and 1). </param>
    void setIntensity(const std::string& name, const float& intensity);

    /// <summary>
    /// Returns the version of the module.
    /// </summary>
    /// <returns> A string containing the version of the module. </returns>
    std::string version();

};

}
#endif // ALLEDSPROXY_H_
