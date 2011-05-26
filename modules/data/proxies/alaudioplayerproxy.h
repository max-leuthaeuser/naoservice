// Generated for ALAudioPlayer version 1.10.22

#ifndef ALAUDIOPLAYERPROXY_H_
#define ALAUDIOPLAYERPROXY_H_
#include "alaudioplayerproxyposthandler.h"

namespace AL
{
class ALBroker;
class ALProxy;

class ALAudioPlayerProxyImpl;

/// <summary>This module allows to play wav and mp3 files on NAO</summary>
class ALAudioPlayerProxy
{
  private:
    ALPtr<ALAudioPlayerProxyImpl> fImpl;

  public:
    
    /// <summary>
    /// Local Constructor
    /// </summary>
    ALAudioPlayerProxy(ALPtr<ALBroker> pBroker);

    /// <summary>
    /// Remote Constructor
    /// </summary>
    ALAudioPlayerProxy(std::string pIP, int pPort);

    /// <summary>
    /// Implements thread wrappers around methods
    /// </summary>
    ALAudioPlayerProxyPostHandler post;

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
    /// Returns the master volume of the player
    /// </summary>
    /// <returns> Volume of the master - range 0.0 to 1.0. </returns>
    float getMasterVolume();

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
    /// Returns the volume of the player
    /// </summary>
    /// <returns> Volume of the player - range 0.0 to 1.0. </returns>
    float getVolume();

    /// <summary>
    /// Goes to a given position in a file which is playing.
    /// </summary>
    /// <param name="playId"> Id of the process which is playing the file </param>
    /// <param name="position"> Position in the file (in second) </param>
    void goTo(const int& playId, const float& position);

    /// <summary>
    /// Loads a file for ulterior playback
    /// </summary>
    /// <param name="fileName"> Path of the sound file (either mp3 or wav) </param>
    /// <returns> Id of the file which has been loaded. This file can then be played with the play function </returns>
    int loadFile(const std::string& fileName);

    /// <summary>
    /// Pause a play back
    /// </summary>
    /// <param name="id"> Id of the process that is playing the file you want to put in pause </param>
    void pause(const int& id);

    /// <summary>
    /// Just a ping. Always returns true
    /// </summary>
    /// <returns> returns true </returns>
    bool ping();

    /// <summary>
    /// Starts the playback of a file preloaded with the loadFile function.. Asynchronous.
    /// </summary>
    /// <param name="id"> Id returned by the loadFile function </param>
    /// <returns> Id of the task. Can be used to interrupt it. </returns>
    int play(const int& id);

    /// <summary>
    /// Starts the playback of a file preloaded with the loadFile function, with specific volume and audio balance. Asynchronous.
    /// </summary>
    /// <param name="id"> Id returned by the loadFile function </param>
    /// <param name="volume"> volume of the sound file (must be between 0.0 and 1.0) </param>
    /// <param name="pan"> audio balance of the sound file (-1.0 : left / 1.0 : right) </param>
    /// <returns> Id of the task. Can be used to interrupt it. </returns>
    int play(const int& id, const float& volume, const float& pan);

    /// <summary>
    /// Plays a wav or mp3 file. Asynchronous.
    /// </summary>
    /// <param name="fileName"> Path of the sound file </param>
    /// <returns> Id of the task. Can be used to interrupt it. </returns>
    int playFile(const std::string& fileName);

    /// <summary>
    /// Plays a wav or mp3 file, with specific volume and audio balance. Asynchronous.
    /// </summary>
    /// <param name="fileName"> Path of the sound file </param>
    /// <param name="volume"> volume of the sound file (must be between 0.0 and 1.0) </param>
    /// <param name="pan"> audio balance of the sound file (-1.0 : left / 1.0 : right / 0.0 : centered) </param>
    /// <returns> Id of the task. Can be used to interrupt it. </returns>
    int playFile(const std::string& fileName, const float& volume, const float& pan);

    /// <summary>
    /// Plays a wav or mp3 file from a given position in the file.. Asynchronous.
    /// </summary>
    /// <param name="fileName"> Name of the sound file </param>
    /// <param name="position"> Position in second where the playing has to begin </param>
    /// <returns> Id of the task. Can be used to interrupt it. </returns>
    int playFileFromPosition(const std::string& fileName, const float& position);

    /// <summary>
    /// Plays a wav or mp3 file from a given position in the file, with specific volume and audio balance. Asynchronous.
    /// </summary>
    /// <param name="fileName"> Name of the sound file </param>
    /// <param name="position"> Position in second where the playing has to begin </param>
    /// <param name="volume"> volume of the sound file (must be between 0.0 and 1.0) </param>
    /// <param name="pan"> audio balance of the sound file (-1.0 : left / 1.0 : right) </param>
    /// <returns> Id of the task. Can be used to interrupt it. </returns>
    int playFileFromPosition(const std::string& fileName, const float& position, const float& volume, const float& pan);

    /// <summary>
    /// Plays a wav or mp3 file in loop. Asynchronous.
    /// </summary>
    /// <param name="fileName"> Path of the sound file </param>
    /// <returns> Id of the task. Can be used to interrupt it. </returns>
    int playFileInLoop(const std::string& fileName);

    /// <summary>
    /// Plays a wav or mp3 file in loop, with specific volume and audio balance. Asynchronous.
    /// </summary>
    /// <param name="fileName"> Path of the sound file </param>
    /// <param name="volume"> volume of the sound file (must be between 0.0 and 1.0) </param>
    /// <param name="pan"> audio balance of the sound file (-1.0 : left / 1.0 : right) </param>
    /// <returns> Id of the task. Can be used to interrupt it. </returns>
    int playFileInLoop(const std::string& fileName, const float& volume, const float& pan);

    /// <summary>
    /// Starts the playback in loop of a file preloaded with the loadFile function. Asynchronous.
    /// </summary>
    /// <param name="fileName"> Path of the sound file </param>
    /// <returns> Id of the task. Can be used to interrupt it. </returns>
    int playInLoop(const int& fileName);

    /// <summary>
    /// Plays a wav or mp3 file in loop, with specific volume and audio balance. Asynchronous.
    /// </summary>
    /// <param name="fileName"> Path of the sound file </param>
    /// <param name="volume"> volume of the sound file (must be between 0.0 and 1.0) </param>
    /// <param name="pan"> audio balance of the sound file (-1.0 : left / 1.0 : right) </param>
    /// <returns> Id of the task. Can be used to interrupt it. </returns>
    int playInLoop(const int& fileName, const float& volume, const float& pan);

    /// <summary>
    /// Sets the master volume of the player
    /// </summary>
    /// <param name="volume"> Volume - range 0.0 to 1.0 </param>
    void setMasterVolume(const float& volume);

    /// <summary>
    /// sets the audio panorama : -1 for left speaker / 1 for right speaker
    /// </summary>
    /// <param name="arg1"> arg </param>
    void setPanorama(const float& arg1);

    /// <summary>
    /// Sets the volume of the player
    /// </summary>
    /// <param name="id"> Id of the process that is playing the file you want to put louder or less loud </param>
    /// <param name="volume"> Volume - range 0.0 to 1.0 </param>
    void setVolume(const int& id, const float& volume);

    /// <summary>
    /// Stops all the files that are currently playing.
    /// </summary>
    void stopAll();

    /// <summary>
    /// unloads all the files already loaded.
    /// </summary>
    void unloadAllFiles();

    /// <summary>
    /// unloads a file previously loaded with the loadFile function
    /// </summary>
    /// <param name="id"> Id returned by the loadFile function </param>
    void unloadFile(const int& id);

    /// <summary>
    /// Returns the version of the module.
    /// </summary>
    /// <returns> A string containing the version of the module. </returns>
    std::string version();

};

}
#endif // ALAUDIOPLAYERPROXY_H_
