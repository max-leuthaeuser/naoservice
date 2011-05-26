// Generated for ALVideoDevice version 1.10.22

#ifndef ALVIDEODEVICEPROXY_H_
#define ALVIDEODEVICEPROXY_H_
#include "alvideodeviceproxyposthandler.h"

namespace AL
{
class ALBroker;
class ALProxy;

class ALVideoDeviceProxyImpl;

/// <summary>ALVideoDevice, formerly called Video Input Module (V.I.M.), is architectured in order to provide every module related to vision, called Generic Video Module (G.V.M.), a direct access to raw images from video source, or an access to images transformed in the requested format.</summary>
class ALVideoDeviceProxy
{
  private:
    ALPtr<ALVideoDeviceProxyImpl> fImpl;

  public:
    
    /// <summary>
    /// Local Constructor
    /// </summary>
    ALVideoDeviceProxy(ALPtr<ALBroker> pBroker);

    /// <summary>
    /// Remote Constructor
    /// </summary>
    ALVideoDeviceProxy(std::string pIP, int pPort);

    /// <summary>
    /// Implements thread wrappers around methods
    /// </summary>
    ALVideoDeviceProxyPostHandler post;

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
    /// Get the active camera
    /// </summary>
    /// <returns> 0: top camera - 1: bottom camera </returns>
    int getActiveCamera();

    /// <summary>
    /// Returns angles relative to camera axis given a normalized position in the image.
    /// </summary>
    /// <param name="imgPos"> normalized position in the image [0.0 - 1.0] </param>
    /// <returns> corresponding angles values in radians. </returns>
    std::vector<float> getAngPosFromImgPos(const std::vector<float>& imgPos);

    /// <summary>
    /// Returns angles relative to camera axis given a normalized position in the image.
    /// </summary>
    /// <param name="imgSize"> normalized position in the image [0.0 - 1.0] </param>
    /// <returns> corresponding angles values in radians. </returns>
    std::vector<float> getAngSizeFromImgSize(const std::vector<float>& imgSize);

    /// <summary>
    /// Gets the name of the parent broker.
    /// </summary>
    /// <returns> The name of the parent broker. </returns>
    std::string getBrokerName();

    /// <summary>
    /// Returns a pointer to a locked ALImage, with data array pointing directly to raw data. No format conversion and no copy of the raw buffer.
    /// </summary>
    /// <param name="id"> Name under which the G.V.M. is known from ALVideoDevice. </param>
    /// <returns> Pointer to the locked image buffer, NULL if error.   Warning, image pointer is valid only for C++ dynamic library. </returns>
    void * getDirectRawImageLocal(const std::string& id);

    /// <summary>
    /// Fills pFrameOut with data coming directly from raw buffer (no format conversion).
    /// </summary>
    /// <param name="id"> Name under which the G.V.M. is known from ALVideoDevice. </param>
    /// <returns> Array containing image informations : </returns>
    AL::ALValue getDirectRawImageRemote(const std::string& id);

    /// <summary>
    /// Get the color space of the requested G.V.M.
    /// </summary>
    /// <param name="id"> Name under which the G.V.M. is known from ALVideoDevice. </param>
    /// <returns> { 0 = kYuv, 9 = kYUV422, 10 = kYUV, 11 = kRGB, 12 = kHSY, 13 = kBGR } -1: can't access video source </returns>
    int getGVMColorSpace(const std::string& id);

    /// <summary>
    /// Get the frame rate of the requested G.V.M.
    /// </summary>
    /// <param name="id"> Name under which the G.V.M. is known from ALVideoDevice. </param>
    /// <returns> { 5, 10, 15, 30 }  -1: can't access video source </returns>
    int getGVMFrameRate(const std::string& id);

    /// <summary>
    /// Get the resolution of the requested G.V.M.
    /// </summary>
    /// <param name="id"> Name under which the G.V.M. is known from ALVideoDevice. </param>
    /// <returns> { 0 = kQQVGA, 1 = kQVGA, 2 = kVGA }  -1: can't access video source </returns>
    int getGVMResolution(const std::string& id);

    /// <summary>
    /// Applies transformations to the last image from video source and returns a pointer to a locked ALImage.
    /// </summary>
    /// <param name="id"> Name under which the G.V.M. is known from ALVideoDevice (formerly called V.I.M.) </param>
    /// <returns> Pointer of the locked image buffer, NULL if error.Warning, image pointer is valid only for C++ dynamic library. </returns>
    void * getImageLocal(const std::string& id);

    /// <summary>
    /// Applies transformations to the last image from video source and fills pFrameOut.
    /// </summary>
    /// <param name="id"> Name under which the G.V.M. is known from ALVideoDevice. </param>
    /// <returns> Array containing image informations : </returns>
    AL::ALValue getImageRemote(const std::string& id);

    /// <summary>
    /// Returns normalized image info from angles info in radians (as returned by vision extractors).
    /// </summary>
    /// <param name="angles"> camera angle values in radians. </param>
    /// <returns> corresponding normalized position info. </returns>
    std::vector<float> getImgInfoFromAngInfo(const std::vector<float>& angles);

    /// <summary>
    /// Returns image info from angles info in radians (as returned by vision extractors). Express image info in the requested resolution.
    /// </summary>
    /// <param name="angInfo"> camera angle values in radians. </param>
    /// <param name="arg2"> arg </param>
    /// <returns> corresponding position info. </returns>
    std::vector<float> getImgInfoFromAngInfoWithRes(const std::vector<float>& angInfo, const int& arg2);

    /// <summary>
    /// Returns normalized image position from camera angles in radians.
    /// </summary>
    /// <param name="angPos"> camera angle values in radians. </param>
    /// <returns> corresponding normalized position in the image [0.0 - 1.0] </returns>
    std::vector<float> getImgPosFromAngPos(const std::vector<float>& angPos);

    /// <summary>
    /// Returns normalized image position from camera angles in radians.
    /// </summary>
    /// <param name="angSize"> camera angle values in radians. </param>
    /// <returns> corresponding normalized position in the image [0.0 - 1.0] </returns>
    std::vector<float> getImgSizeFromAngSize(const std::vector<float>& angSize);

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
    /// Get the value of a video source specific parameter.
    /// </summary>
    /// <param name="pParam"> Parameter's reference among kCameraBrightnessID, </param>
    /// <returns> Parameter's value. </returns>
    int getParam(const int& pParam);

    /// <summary>
    /// Gets the method usage string. This summarise how to use the method.
    /// </summary>
    /// <param name="name"> The name of the method. </param>
    /// <returns> A string that summarises the usage of the method. </returns>
    std::string getUsage(const std::string& name);

    /// <summary>
    /// Get the color space of the video source image.
    /// </summary>
    /// <returns> { 0 = kYuv, 9 = kYUV422, 10 = kYUV, 11 = kRGB, 12 = kHSY, 13 = kBGR }  -1 can't access video source </returns>
    int getVIMColorSpace();

    /// <summary>
    /// Get the frame rate of the video source image.
    /// </summary>
    /// <returns> { 5, 10, 15, 30 }   -1: can't access video source </returns>
    int getVIMFrameRate();

    /// <summary>
    /// Get the resolution of the video source image.
    /// </summary>
    /// <returns> { 0 = kQQVGA, 1 = kQVGA, 2 = kVGA }  -1: can't access video source </returns>
    int getVIMResolution();

    /// <summary>
    /// Advanced method that asks if the framegrabber is off.
    /// </summary>
    /// <returns> true if off </returns>
    int isFrameGrabberOff();

    /// <summary>
    /// Callback when client is disconnected
    /// </summary>
    /// <param name="eventName"> The echoed event name </param>
    /// <param name="eventContents"> The name of the client that has disconnected </param>
    /// <param name="message"> The message give when subscribing. </param>
    void onClientDisconnected(const std::string& eventName, const AL::ALValue& eventContents, const std::string& message);

    /// <summary>
    /// Just a ping. Always returns true
    /// </summary>
    /// <returns> returns true </returns>
    bool ping();

    /// <summary>
    /// BETA - background record of an .arv raw format video from the images processed by a G.V.M.
    /// </summary>
    /// <param name="id"> Name under which the G.V.M. is known from the V.I.M. </param>
    /// <param name="path"> path/name of the video to be recorded </param>
    /// <param name="totalNumber"> number of images to be recorded. 0xFFFFFFFF for \"unlimited\" </param>
    /// <param name="period"> one image recorded every pPeriod images </param>
    /// <returns> true if success </returns>
    bool recordVideo(const std::string& id, const std::string& path, const int& totalNumber, const int& period);

    /// <summary>
    /// Release image buffer locked by getDirectRawImageLocal().
    /// </summary>
    /// <param name="id"> Name under which the G.V.M. is known from the V.I.M. </param>
    /// <returns> true if success </returns>
    int releaseDirectRawImage(const std::string& id);

    /// <summary>
    /// Release image buffer locked by getImageLocal().
    /// </summary>
    /// <param name="id"> Name under which the G.V.M. is known from ALVideoDevice. </param>
    /// <returns> true if success </returns>
    int releaseImage(const std::string& id);

    /// <summary>
    /// return the width and the height of a resolution
    /// </summary>
    /// <param name="resolution"> { 0 = kQQVGA, 1 = kQVGA, 2 = kVGA } </param>
    /// <returns> array of sizes: (return [-1;-1] if the format is invalid) </returns>
    AL::ALValue resolutionToSizes(const int& resolution);

    /// <summary>
    /// Set the colorspace of the output image.
    /// </summary>
    /// <param name="id"> Name under which the G.V.M. is known from ALVideoDevice. </param>
    /// <param name="colorSpace"> { 0 = kYuv, 9 = kYUV422, 10 = kYUV, 11 = kRGB, 12 = kHSY, 13 = kBGR } </param>
    /// <returns> true if success </returns>
    bool setColorSpace(const std::string& id, const int& colorSpace);

    /// <summary>
    /// Set the required frame rate.
    /// </summary>
    /// <param name="id"> Name under which the G.V.M. is known from ALVideoDevice. </param>
    /// <param name="frameRate"> images per seconds { 5, 10, 15, 30 } </param>
    /// <returns> true if success </returns>
    bool setFrameRate(const std::string& id, const int& frameRate);

    /// <summary>
    /// Sets the value of a specific parameter for the video source.
    /// </summary>
    /// <param name="param"> Parameter's reference among: </param>
    /// <param name="newValue"> Parameter's new value. </param>
    void setParam(const int& param, const int& newValue);

    /// <summary>
    /// Sets a specific parameter for the video source at its default value.
    /// </summary>
    /// <param name="param"> Parameter's reference. </param>
    void setParamDefault(const int& param);

    /// <summary>
    /// Set the size of the output image.
    /// </summary>
    /// <param name="id"> Name under which the G.V.M. is known from ALVideoDevice. </param>
    /// <param name="size"> { 0 = kQQVGA, 1 = kQVGA, 2 = kVGA } </param>
    /// <returns> true if success </returns>
    bool setResolution(const std::string& id, const int& size);

    /// <summary>
    /// return the resolution from sizes
    /// </summary>
    /// <param name="width"> width of the image </param>
    /// <param name="height"> height of the image </param>
    /// <returns> { 0 = kQQVGA, 1 = kQVGA, 2 = kVGA }  or -1 if the inputs are invalid </returns>
    int sizesToResolution(const int& width, const int& height);

    /// <summary>
    /// Advanced method that opens and initialize video source device if it was not before.
    /// </summary>
    /// <returns> true if success </returns>
    int startFrameGrabber();

    /// <summary>
    /// Advanced method that close video source device.
    /// </summary>
    /// <returns> true if success </returns>
    int stopFrameGrabber();

    /// <summary>
    /// BETA - stop writing the video sequence
    /// </summary>
    /// <param name="id"> Name under which the G.V.M. is known from ALVideoDevice. </param>
    /// <returns> true if success </returns>
    bool stopVideo(const std::string& id);

    /// <summary>
    /// Register to ALVideoDevice (formerly Video Input Module/V.I.M.). When a General Video Module(G.V.M.) registers to ALVideoDevice, a buffer of the requested image format is added to the buffers list.
    /// </summary>
    /// <param name="gvmName"> Name of the registering G.V.M. </param>
    /// <param name="resolution"> Resolution requested. { 0 = kQQVGA, 1 = kQVGA, 2 = kVGA } </param>
    /// <param name="colorSpace"> Colorspace requested. { 0 = kYuv, 9 = kYUV422, 10 = kYUV, 11 = kRGB, 12 = kHSY, 13 = kBGR } </param>
    /// <param name="fps"> Fps (frames per second) requested. { 5, 10, 15, 30 } </param>
    /// <returns> Name under which the G.V.M. is known from ALVideoDevice, 0 if failed. </returns>
    std::string subscribe(const std::string& gvmName, const int& resolution, const int& colorSpace, const int& fps);

    /// <summary>
    /// Used to unregister a G.V.M. from ALVideoDevice.
    /// </summary>
    /// <param name="id"> Name under which the G.V.M. is known from ALVideoDevice. </param>
    void unsubscribe(const std::string& id);

    /// <summary>
    /// Returns the version of the module.
    /// </summary>
    /// <returns> A string containing the version of the module. </returns>
    std::string version();

};

}
#endif // ALVIDEODEVICEPROXY_H_
