// Generated for ALAudioDevice version 1.10.22

#ifndef ALAUDIODEVICEPROXY_H_
#define ALAUDIODEVICEPROXY_H_
#include "alaudiodeviceproxyposthandler.h"

namespace AL
{
class ALBroker;
class ALProxy;

class ALAudioDeviceProxyImpl;

/// <summary>The ALAudioDevice module allows other modules to access to the sound data of the nao's microphones, and to send sound toward its loudspeakers  The way to receive or send the audio data depends whether the modules are local (dynamic library) or remote (executable).</summary>
class ALAudioDeviceProxy
{
  private:
    ALPtr<ALAudioDeviceProxyImpl> fImpl;

  public:
    
    /// <summary>
    /// Local Constructor
    /// </summary>
    ALAudioDeviceProxy(ALPtr<ALBroker> pBroker);

    /// <summary>
    /// Remote Constructor
    /// </summary>
    ALAudioDeviceProxy(std::string pIP, int pPort);

    /// <summary>
    /// Implements thread wrappers around methods
    /// </summary>
    ALAudioDeviceProxyPostHandler post;

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
    /// Closes the audio device for capture. You can call this method if you want to have access to the alsa input buffers in another program than naoqi while naoqi is running (with a record for example)
    /// </summary>
    void closeAudioInputs();

    /// <summary>
    /// Closes the audio device for playback. close the audio device for capture. You can call this method if you want to send sound to alsa in another program than naoqi while naoqi is running (with aplay for example)
    /// </summary>
    void closeAudioOutputs();

    /// <summary>
    /// Disables the computation of the energy of each microphone signal
    /// </summary>
    void disableEnergyComputation();

    /// <summary>
    /// Enables the computation of the energy of each microphone signal
    /// </summary>
    void enableEnergyComputation();

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
    /// Returns the energy of the front microphone signal
    /// </summary>
    /// <returns> energy of the front microphone signal </returns>
    float getFrontMicEnergy();

    /// <summary>
    /// Returns the energy of the left microphone signal
    /// </summary>
    /// <returns> energy of the left microphone signal </returns>
    float getLeftMicEnergy();

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
    /// Gets the output sound level of the system.
    /// </summary>
    /// <returns> outputVolume of the system </returns>
    int getOutputVolume();

    /// <summary>
    /// This method returns the specified internal parameter ('outputSampleRate' or 'inputBufferSize'). The value -1 is returned if the specified parameter is not valid.
    /// </summary>
    /// <param name="pParamName"> Name of the parameter to get ('outputSampleRate' or 'inputBufferSize'). </param>
    /// <returns> value of the specified parameter </returns>
    int getParameter(const std::string& pParamName);

    /// <summary>
    /// Returns the energy of the rear microphone signal
    /// </summary>
    /// <returns> energy of the rear microphone signal </returns>
    float getRearMicEnergy();

    /// <summary>
    /// Returns the energy of the right microphone signal
    /// </summary>
    /// <returns> energy of the right microphone signal </returns>
    float getRightMicEnergy();

    /// <summary>
    /// Gets the method usage string. This summarise how to use the method.
    /// </summary>
    /// <param name="name"> The name of the method. </param>
    /// <returns> A string that summarises the usage of the method. </returns>
    std::string getUsage(const std::string& name);

    /// <summary>
    /// Opens the audio device for capture. If you closed the audio inputs with the closeAudioInputs method, you must call this method to be able to access to the sound data of the nao's microphones.
    /// </summary>
    void openAudioInputs();

    /// <summary>
    /// Opens the audio device for playback. If you closed the audio outputs with the closeAudioOutputs method, you must call this method to ear or send sound onto the nao's loudspeakers.
    /// </summary>
    void openAudioOutputs();

    /// <summary>
    /// Just a ping. Always returns true
    /// </summary>
    /// <returns> returns true </returns>
    bool ping();

    /// <summary>
    /// Play a sine wave which specified caracteristics.
    /// </summary>
    /// <param name="frequence"> Frequence in Hertz </param>
    /// <param name="gain"> Volume Gain between 0 and 100 </param>
    /// <param name="pan"> Stereo Pan set to either {-1,0,+1} </param>
    /// <param name="duration"> Duration of the sine wave in seconds </param>
    void playSine(const int& frequence, const int& gain, const int& pan, const int& duration);

    /// <summary>
    /// reset ALSA driver. Use this method only when no audio module is subscribed to ALAudioDevice
    /// </summary>
    void resetAudio();

    /// <summary>
    /// This function allows a local module to send sound onto the nao's loudpseakers
    /// </summary>
    /// <param name="nbOfFrames"> Number of 16 bits samples per channel to send. </param>
    /// <param name="pBuffer"> Buffer to send </param>
    /// <returns> True if the operation is successfull - False otherwise </returns>
    bool sendLocalBufferToOutput(const int& nbOfFrames, const int& pBuffer);

    /// <summary>
    /// This function allows a remote module to send sound onto the nao's loudpseakers
    /// </summary>
    /// <param name="nbOfFrames"> Number of 16 bits samples per channel to send. </param>
    /// <param name="pBuffer"> Buffer to send </param>
    /// <returns> True if the operation is successfull - False otherwise </returns>
    bool sendRemoteBufferToOutput(const int& nbOfFrames, const AL::ALValue& pBuffer);

    /// <summary>
    /// This method allows to send sound samples contained in a sound file at the input of ALAudioDevice, instead of the nao's microphones sound data                   The sound file must be a .wav file containing 16bits / 4 channels / interleaved samples. Once the file has been read, microphones sound data will again taken as input
    /// </summary>
    /// <param name="pFileName"> Name of the input file. </param>
    void setFileAsInput(const std::string& pFileName);

    /// <summary>
    /// Sets the output sound level of the system.
    /// </summary>
    /// <param name="volume"> Volume [0-100]. </param>
    void setOutputVolume(const int& volume);

    /// <summary>
    /// This method sets the specified internal parameter ('outputSampleRate' or 'inputBufferSize')
    /// </summary>
    /// <param name="pParamName"> Name of the parameter to set ('outputSampleRate' or 'inputBufferSize'). </param>
    /// <param name="pParamValue"> The value to which the specified parameter should be set. </param>
    void setParameter(const std::string& pParamName, const int& pParamValue);

    /// <summary>
    /// This method allows to record the signal collected on the nao's microphones. You can choose to record only the front microphone in a ogg file, or the 4 microphones in a wav file. In this last case the format of the file is 4 channels, 16 bits little endian, 48 KHz
    /// </summary>
    /// <param name="pFileName"> Name of the file where to record the sound. </param>
    void startMicrophonesRecording(const std::string& pFileName);

    /// <summary>
    /// This method calls a procedure to stop and clear the audio output buffers.
    /// </summary>
    void stopAudioOut();

    /// <summary>
    /// This method stops the recording of the sound collected by the microphones.
    /// </summary>
    void stopMicrophonesRecording();

    /// <summary>
    /// This function allows a remote module to subscribe to the ALAudioDevice module.
    /// </summary>
    /// <param name="pModule"> Name of the remote module </param>
    /// <returns> True if module has subscribed successfully - False otherwise </returns>
    bool subscribeRemoteModule(const std::string& pModule);

    /// <summary>
    /// This function unsubscribes a remote module (identified by its name) from the ALAudioDevice module
    /// </summary>
    /// <param name="pModule"> Name of the remote module to unsuscribe from ALAudioDevice </param>
    /// <returns> True if module has been unsubscribed successfully - False otherwise </returns>
    bool unSubscribeRemoteModule(const std::string& pModule);

    /// <summary>
    /// Returns the version of the module.
    /// </summary>
    /// <returns> A string containing the version of the module. </returns>
    std::string version();

};

}
#endif // ALAUDIODEVICEPROXY_H_
