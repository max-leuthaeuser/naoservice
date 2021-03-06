// Generated for ALTextToSpeech version 1.10.22

#ifndef ALTEXTTOSPEECHPROXY_H_
#define ALTEXTTOSPEECHPROXY_H_
#include "altexttospeechproxyposthandler.h"

namespace AL
{
class ALBroker;
class ALProxy;

class ALTextToSpeechProxyImpl;

/// <summary>This module handles the text to speech operations. It converts std::strings into a PCM signal and sends it into the two speakers. The voice parameters can be changed using the FX settings.</summary>
class ALTextToSpeechProxy
{
  private:
    ALPtr<ALTextToSpeechProxyImpl> fImpl;

  public:
    
    /// <summary>
    /// Local Constructor
    /// </summary>
    ALTextToSpeechProxy(ALPtr<ALBroker> pBroker);

    /// <summary>
    /// Remote Constructor
    /// </summary>
    ALTextToSpeechProxy(std::string pIP, int pPort);

    /// <summary>
    /// Implements thread wrappers around methods
    /// </summary>
    ALTextToSpeechProxyPostHandler post;

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
    /// Disables the notifications puted in ALMemory during the synthesis (TextStarted, TextDone, CurrentBookMark, CurrentWord, ...)
    /// </summary>
    void disableNotifications();

    /// <summary>
    /// Enables the notifications puted in ALMemory during the synthesis (TextStarted, TextDone, CurrentBookMark, CurrentWord, ...)
    /// </summary>
    void enableNotifications();

    /// <summary>
    /// Exits and unregisters the module.
    /// </summary>
    void exit();

    /// <summary>
    /// Outputs the languages installed on the system.
    /// </summary>
    /// <returns> Array of std::string that contains the languages installed on the system. </returns>
    std::vector<std::string> getAvailableLanguages();

    /// <summary>
    /// Outputs the available voices. The returned list contains the voice IDs.
    /// </summary>
    /// <returns> Array of std::string containing the voices installed on the system. </returns>
    std::vector<std::string> getAvailableVoices();

    /// <summary>
    /// Gets the name of the parent broker.
    /// </summary>
    /// <returns> The name of the parent broker. </returns>
    std::string getBrokerName();

    /// <summary>
    /// Returns the language currently used by the text-to-speech engine.
    /// </summary>
    /// <returns> Language of the current voice. </returns>
    std::string getLanguage();

    /// <summary>
    /// Returns the encoding that should be used with the specified language.
    /// </summary>
    /// <param name="pLanguage"> Language name (as a std::string). Must belong to the languages available in TTS. </param>
    /// <returns> Encoding of the specified language. </returns>
    std::string getLanguageEncoding(const std::string& pLanguage);

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
    /// Returns the value of one of the voice parameters. The available parameters are: \"pitchShift\", \"doubleVoice\",\"doubleVoiceLevel\" and \"doubleVoiceTimeShift\"
    /// </summary>
    /// <param name="pParameterName"> Name of the parameter. </param>
    /// <returns> Value of the specified parameter </returns>
    float getParameter(const std::string& pParameterName);

    /// <summary>
    /// Gets the method usage string. This summarise how to use the method.
    /// </summary>
    /// <param name="name"> The name of the method. </param>
    /// <returns> A string that summarises the usage of the method. </returns>
    std::string getUsage(const std::string& name);

    /// <summary>
    /// Returns the voice currently used by the text-to-speech engine.
    /// </summary>
    /// <returns> Name of the current voice </returns>
    std::string getVoice();

    /// <summary>
    /// Fetches the current volume the text to speech.
    /// </summary>
    /// <returns> Volume (integer between 0 and 100). </returns>
    float getVolume();

    /// <summary>
    /// Loads a set of voice parameters defined in a xml file contained in the preferences folder.The name of the xml file must begin with ALTextToSpeech_Voice_
    /// </summary>
    /// <param name="pPreferenceName"> Name of the voice preference. </param>
    void loadVoicePreference(const std::string& pPreferenceName);

    /// <summary>
    /// Just a ping. Always returns true
    /// </summary>
    /// <returns> returns true </returns>
    bool ping();

    /// <summary>
    /// Performs the text-to-speech operations : it takes a std::string as input and outputs a sound in both speakers. It logs an error if the std::string is empty. String encoding must be UTF8.. Asynchronous.
    /// </summary>
    /// <param name="stringToSay"> Text to say, encoded in UTF-8. </param>
    /// <returns> Id of the task. Can be used to interrupt it. </returns>
    int say(const std::string& stringToSay);

    /// <summary>
    /// Performs the text-to-speech operations: it takes a std::string as input and outputs the corresponding audio signal in the specified file.. Asynchronous.
    /// </summary>
    /// <param name="pStringToSay"> Text to say, encoded in UTF-8. </param>
    /// <param name="pFileName"> RAW file where to store the generated signal. The signal is encoded with a sample rate of 22050Hz, format S16_LE, 2 channels. </param>
    /// <returns> Id of the task. Can be used to interrupt it. </returns>
    int sayToFile(const std::string& pStringToSay, const std::string& pFileName);

    /// <summary>
    /// This method performs the text-to-speech operations: it takes a std::string, outputs the synthesis resulting audio signal in a file, and then plays the audio file. The file is deleted afterwards. It is useful when you want to perform a short synthesis, when few CPU is available. Do not use it if you want a low-latency synthesis or to synthesize a long std::string.. Asynchronous.
    /// </summary>
    /// <param name="pStringToSay"> Text to say, encoded in UTF-8. </param>
    /// <returns> Id of the task. Can be used to interrupt it. </returns>
    int sayToFileAndPlay(const std::string& pStringToSay);

    /// <summary>
    /// Changes the language used by the Text-to-Speech engine. It automatically changes the voice used since each of them is related to a unique language. If you want that change to take effect automatically after reboot of your robot, refer to the robot web page (setting page).
    /// </summary>
    /// <param name="pLanguage"> Language name. Must belong to the languages available in TTS (can be obtained with the getAvailableLanguages method).  It should be an identifier std::string. </param>
    void setLanguage(const std::string& pLanguage);

    /// <summary>
    /// Changes the parameters of the voice. The available parameters are:
    /// </summary>
    /// <param name="pEffectName"> Name of the parameter. </param>
    /// <param name="pEffectValue"> Value of the parameter. </param>
    void setParameter(const std::string& pEffectName, const float& pEffectValue);

    /// <summary>
    /// Changes the voice used by the text-to-speech engine. The voice identifier must belong to the installed voices, that can be listed using the 'getAvailableVoices' method. If the voice is not available, it remains unchanged. No exception is thrown in this case.
    /// </summary>
    /// <param name="pVoiceID"> The voice (as a std::string). </param>
    void setVoice(const std::string& pVoiceID);

    /// <summary>
    /// Sets the volume of text-to-speech output.
    /// </summary>
    /// <param name="volume"> Volume (between 0.0 and 1.0). </param>
    void setVolume(const float& volume);

    /// <summary>
    /// This method stops the current and all the pending tasks immediately.
    /// </summary>
    void stopAll();

    /// <summary>
    /// Returns the version of the module.
    /// </summary>
    /// <returns> A string containing the version of the module. </returns>
    std::string version();

};

}
#endif // ALTEXTTOSPEECHPROXY_H_
