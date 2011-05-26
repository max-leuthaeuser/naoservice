// Generated for ALMemory version 1.10.22

#ifndef ALMEMORYPROXY_H_
#define ALMEMORYPROXY_H_
#include "almemoryproxyposthandler.h"

namespace AL
{
class ALBroker;
class ALProxy;

class ALMemoryProxyImpl;

/// <summary>ALMemory is a class that implements an event-based storage base.</summary>
class ALMemoryProxy
{
  private:
    ALPtr<ALMemoryProxyImpl> fImpl;

  public:
    
    /// <summary>
    /// Local Constructor
    /// </summary>
    ALMemoryProxy(ALPtr<ALBroker> pBroker);

    /// <summary>
    /// Remote Constructor
    /// </summary>
    ALMemoryProxy(std::string pIP, int pPort);

    /// <summary>
    /// Implements thread wrappers around methods
    /// </summary>
    ALMemoryProxyPostHandler post;

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
    /// Triggers a Synchronizer.
    /// </summary>
    /// <param name="dataName"> Name of the subscribed data. </param>
    /// <param name="data"> Value of the the subscribed data </param>
    /// <param name="message"> The message give when subscribing. </param>
    void dataChanged(const std::string& dataName, const AL::ALValue& data, const std::string& message);

    /// <summary>
    /// Declare event to allow subscribe on the event
    /// </summary>
    /// <param name="eventName"> Event name </param>
    /// <param name="name"> Name of extractor that create event </param>
    void declareEvent(const std::string& eventName, const std::string& name);

    /// <summary>
    /// Declare event to allow subscribe on the event
    /// </summary>
    /// <param name="eventName"> Event name </param>
    void declareEvent(const std::string& eventName);

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
    /// Allows programs and modules to get data stored in ALMemory.
    /// </summary>
    /// <param name="name"> Name of the data. </param>
    /// <param name="duration"> All the data stored for \"duration\" seconds will be returned. If 0 returns the lastest value. If -1 returns all stored values. </param>
    /// <returns> an array containing all the retrieved data </returns>
    AL::ALValue getData(const std::string& name, const int& duration);

    /// <summary>
    /// Allows programs and modules to get data stored in ALMemory.
    /// </summary>
    /// <param name="name"> Name of the data. </param>
    /// <returns> an array containing all the retrieved data </returns>
    AL::ALValue getData(const std::string& name);

    /// <summary>
    /// Allows programs to get an array containing all the data's name.
    /// </summary>
    /// <returns> return an array of data's string name. </returns>
    AL::ALValue getDataListName();

    /// <summary>
    /// Allows programs and modules to retrieve data stored in ALMemory, but waits until the data has changed.
    /// </summary>
    /// <param name="name"> Name of the data. </param>
    /// <param name="duration"> All the data stored for \"duration\" seconds will be returned. If 0 returns the lastest value. If -1 returns all stored values. </param>
    /// <returns> an array containing all the retrieved data </returns>
    AL::ALValue getDataOnChange(const std::string& name, const int& duration);

    /// <summary>
    /// get pointer on 32bits data. Carrefull dangerous function. It's an heavy call, make it only function at initialization, not at every cycle
    /// </summary>
    /// <param name="name"> Name of the data. </param>
    /// <returns> a pointer converted to int </returns>
    void * getDataPtr(const std::string& name);

    /// <summary>
    /// return all application event
    /// </summary>
    /// <returns> return an array of data's string name. </returns>
    std::vector<std::string> getEventList();

    /// <summary>
    /// Get event list generated by extractor
    /// </summary>
    /// <param name="name"> Name of extractor that create event </param>
    /// <returns> return an array of data's string name. </returns>
    std::vector<std::string> getExtractorEvent(const std::string& name);

    /// <summary>
    /// Allows programs and modules to retrieve multiple datas stored in ALMemory at the same time.
    /// </summary>
    /// <param name="name"> an array containing the datas' name and their durations. </param>
    /// <returns> an array containing all the retrieved values of requested data </returns>
    AL::ALValue getListData(const AL::ALValue& name);

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
    /// return all application event
    /// </summary>
    /// <returns> return an array of data's string name. </returns>
    std::vector<std::string> getMicroEventList();

    /// <summary>
    /// Retrieves the module's description.
    /// </summary>
    /// <returns> A structure describing the module. </returns>
    AL::ALValue getModuleHelp();

    /// <summary>
    /// Returns the names of subscribers
    /// </summary>
    /// <param name="name"> Name of the event or micro-event </param>
    /// <returns> List of subscriber names </returns>
    std::vector<std::string> getSubscribers(const std::string& name);

    /// <summary>
    /// Return variable type
    /// </summary>
    /// <param name="name"> Name of the variable </param>
    /// <returns> String type: Data, ShmData, Event, MicroEvent </returns>
    std::string getType(const std::string& name);

    /// <summary>
    /// Gets the method usage string. This summarise how to use the method.
    /// </summary>
    /// <param name="name"> The name of the method. </param>
    /// <returns> A string that summarises the usage of the method. </returns>
    std::string getUsage(const std::string& name);

    /// <summary>
    /// Allows any program to insert data into ALMemory. Overloaded method for 32bits type optimization
    /// </summary>
    /// <param name="name"> Name of the data to be inserted. </param>
    /// <param name="data"> Value of the data </param>
    void insertData(const std::string& name, const int& data);

    /// <summary>
    /// Allows any program to insert data into ALMemory. Overloaded method for type optimization
    /// </summary>
    /// <param name="name"> Name of the data to be inserted. </param>
    /// <param name="data"> Value of the data </param>
    void insertData(const std::string& name, const float& data);

    /// <summary>
    /// Allows any program to insert data into ALMemory.
    /// </summary>
    /// <param name="name"> Name of the data to be inserted. </param>
    /// <param name="data"> Value of the data </param>
    void insertData(const std::string& name, const std::string& data);

    /// <summary>
    /// Allows any program to insert data into ALMemory.
    /// </summary>
    /// <param name="name"> Name of the data to be inserted. </param>
    /// <param name="data"> Value of the data. Data type is an ALValue. Could be int, double, string, or an array of any of these types. </param>
    void insertData(const std::string& name, const AL::ALValue& data);

    /// <summary>
    /// Allows any program to insert a list of data into ALMemory.
    /// </summary>
    /// <param name="listOfInsertData"> list of [Name, Value, lifespan, waitforAnswer, group] for each data to be inserted. </param>
    void insertListData(const AL::ALValue& listOfInsertData);

    /// <summary>
    /// Insert object in ALMemory. Please use ALMemoryFastAccess
    /// </summary>
    /// <param name="name"> ALMemory data name </param>
    /// <param name="buffer"> buffer in ALValue </param>
    /// <param name="bufferSize"> buffer size </param>
    void insertObject(const std::string& name, const AL::ALValue& buffer, const int& bufferSize);

    /// <summary>
    /// Just a ping. Always returns true
    /// </summary>
    /// <returns> returns true </returns>
    bool ping();

    /// <summary>
    /// Raise an event, insert data associated to event. Call user callback
    /// </summary>
    /// <param name="name"> Name of the event to raise. </param>
    /// <param name="data"> Value of the data. could be int, double, string, or an array of any of these types. </param>
    void raiseEvent(const std::string& name, const AL::ALValue& data);

    /// <summary>
    /// Raise a micro-event, insert data associated to event. Call user callback
    /// </summary>
    /// <param name="name"> Name of the data to be inserted. </param>
    /// <param name="data"> Value of the data. could be int, double, string, or an array of any of these types. </param>
    void raiseMicroEvent(const std::string& name, const AL::ALValue& data);

    /// <summary>
    /// Allows programs and modules to retrieve data stored in ALMemory.
    /// </summary>
    /// <param name="name"> Name of the data to be remove. </param>
    void removeData(const std::string& name);

    /// <summary>
    /// Remove micro event from ALMemory. Unsubscribe subscribers.
    /// </summary>
    /// <param name="name"> Name of the data to remove. </param>
    void removeMicroEvent(const std::string& name);

    /// <summary>
    /// Subscribe to event and automaticaly launch module function that generate the event. WARNING THERE IS NO MESSAGE parameter
    /// </summary>
    /// <param name="name"> Event name </param>
    /// <param name="moduleName"> subscriber name </param>
    /// <param name="callback"> name of function to call when a data is changed </param>
    void subscribeToEvent(const std::string& name, const std::string& moduleName, const std::string& callback);

    /// <summary>
    /// Subscribe to event and automaticaly launch module function that generate the event. WARNING THERE IS NO MESSAGE parameter
    /// </summary>
    /// <param name="name"> Event name </param>
    /// <param name="moduleName"> subscriber name </param>
    /// <param name="message"> message to send with callback </param>
    /// <param name="callback"> name of function to call when a data is changed </param>
    void subscribeToEvent(const std::string& name, const std::string& moduleName, const std::string& message, const std::string& callback);

    /// <summary>
    /// Allows modules to subscribe to a piece of data, in order to get notified when the data changes. Subscribers are called whenever the data has been set, even if the new value is the same as the previous one.
    /// </summary>
    /// <param name="name"> Name of the data. </param>
    /// <param name="moduleName"> Name of the module. </param>
    /// <param name="message"> message passed to the module when a notification is sent. </param>
    /// <param name="callback"> name of function to call when a data is changed </param>
    void subscribeToMicroEvent(const std::string& name, const std::string& moduleName, const std::string& message, const std::string& callback);

    /// <summary>
    /// Informs ALMemory that a module doesn't exists anymore.
    /// </summary>
    /// <param name="name"> Name of the destructed module. </param>
    void unregisterModuleReference(const std::string& name);

    /// <summary>
    /// Allows modules to unsubscribe from a piece of data and stop getting notified when the data changes.
    /// </summary>
    /// <param name="name"> Name of the data. </param>
    /// <param name="moduleName"> Name of the module. </param>
    void unsubscribeOnDataChange(const std::string& name, const std::string& moduleName);

    /// <summary>
    /// Get event list generated by extractor
    /// </summary>
    /// <param name="name"> Event name </param>
    /// <param name="moduleName"> subscriber name </param>
    void unsubscribeToEvent(const std::string& name, const std::string& moduleName);

    /// <summary>
    /// Allows modules to unsubscribe from a piece of data, in order to stop getting notified when the data changes.
    /// </summary>
    /// <param name="name"> Name of the data. </param>
    /// <param name="moduleName"> Name of the module. </param>
    void unsubscribeToMicroEvent(const std::string& name, const std::string& moduleName);

    /// <summary>
    /// Returns the version of the module.
    /// </summary>
    /// <returns> A string containing the version of the module. </returns>
    std::string version();

    /// <summary>
    /// Allows modules to subscribe to a piece of data, in order to get notified when the data changes. Subscribers are called whenever the data has been set, even if the new value is the same as the previous one.
    /// </summary>
    /// <param name="dataName"> Name of the data. </param>
    /// <param name="condition"> message passed to the module when a notification is sent. </param>
    void waitOnCondition(const std::string& dataName, const std::string& condition);

    /// <summary>
    /// Waits for a condition to be triggered.
    /// </summary>
    /// <param name="name"> Condition name </param>
    void waitSynchronizer(const std::string& name);

};

}
#endif // ALMEMORYPROXY_H_
