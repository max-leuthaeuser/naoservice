// Generated for ALMotion version 1.10.22

#ifndef ALMOTIONPROXY_H_
#define ALMOTIONPROXY_H_
#include "almotionproxyposthandler.h"

namespace AL
{
class ALBroker;
class ALProxy;

class ALMotionProxyImpl;

/// <summary>ALMotion provides methods that help make Nao move. It contains commands for manipulating joint angles, joint stiffness, and a higher level API for controling walks.</summary>
class ALMotionProxy
{
  private:
    ALPtr<ALMotionProxyImpl> fImpl;

  public:
    
    /// <summary>
    /// Local Constructor
    /// </summary>
    ALMotionProxy(ALPtr<ALBroker> pBroker);

    /// <summary>
    /// Remote Constructor
    /// </summary>
    ALMotionProxy(std::string pIP, int pPort);

    /// <summary>
    /// Implements thread wrappers around methods
    /// </summary>
    ALMotionProxyPostHandler post;

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
    /// Interpolates one or multiple joints to a target angle or along timed trajectories. This is a blocking call.
    /// </summary>
    /// <param name="names"> Name or names of joints, chains, \"Body\", \"BodyJoints\" or \"BodyActuators\". </param>
    /// <param name="angleLists"> An angle, list of angles or list of list of angles in radians </param>
    /// <param name="timeLists"> A time, list of times or list of list of times in seconds </param>
    /// <param name="isAbsolute"> If true, the movement is described in absolute angles, else the angles are relative to the current angle. </param>
    void angleInterpolation(const AL::ALValue& names, const AL::ALValue& angleLists, const AL::ALValue& timeLists, const bool& isAbsolute);

    /// <summary>
    /// Interpolates a sequence of timed angles for several motors using bezier control points. This is a blocking call.
    /// </summary>
    /// <param name="jointNames"> A vector of joint names </param>
    /// <param name="times"> An ragged ALValue matrix of floats. Each line corresponding to a motor, and column element to a control point. </param>
    /// <param name="controlPoints"> An ALValue array of arrays each containing [float angle, Handle1, Handle2], where Handle is [int InterpolationType, float dAngle, float dTime] descibing the handle offsets relative to the angle and time of the point. The first bezier param describes the handle that controls the curve preceeding the point, the second describes the curve following the point. </param>
    void angleInterpolationBezier(const std::vector<std::string>& jointNames, const AL::ALValue& times, const AL::ALValue& controlPoints);

    /// <summary>
    /// Interpolates one or multiple joints to a target angle, using a fraction of max speed. Only one target angle is allowed for each joint. This is a blocking call.
    /// </summary>
    /// <param name="names"> Name or names of joints, chains, \"Body\", \"BodyJoints\" or \"BodyActuators\". </param>
    /// <param name="targetAngles"> An angle, or list of angles in radians </param>
    /// <param name="maxSpeedFraction"> A fraction. </param>
    void angleInterpolationWithSpeed(const AL::ALValue& names, const AL::ALValue& targetAngles, const float& maxSpeedFraction);

    /// <summary>
    /// Returns true if the resources are available.
    /// </summary>
    /// <param name="resourceNames"> A vector of resource names such as joints </param>
    /// <returns> True if the resources are available </returns>
    bool areResourcesAvailable(const std::vector<std::string>& resourceNames);

    /// <summary>
    /// Changes Angles. This is a non-blocking call.
    /// </summary>
    /// <param name="names"> The name or names of joints, chains, \"Body\", \"BodyJoints\" or \"BodyActuators\". </param>
    /// <param name="changes"> One or more changes in radians </param>
    /// <param name="fractionMaxSpeed"> The fraction of maximum speed to use </param>
    void changeAngles(const AL::ALValue& names, const AL::ALValue& changes, const float& fractionMaxSpeed);

    /// <summary>
    /// Creates a move of an end effector in cartesian space. This is a non-blocking call.
    /// </summary>
    /// <param name="effectorName"> Name of the effector. </param>
    /// <param name="space"> Task space {SPACE_TORSO = 0, SPACE_WORLD = 1, SPACE_NAO = 2}. </param>
    /// <param name="positionChange"> 6D position change array (xd, yd, zd, wxd, wyd, wzd) in meters and radians </param>
    /// <param name="fractionMaxSpeed"> The fraction of maximum speed to use </param>
    /// <param name="axisMask"> Axis mask. True for axes that you wish to control. e.g. 7 for position only, 56 for rotation only and 63 for both </param>
    void changePosition(const std::string& effectorName, const int& space, const std::vector<float>& positionChange, const float& fractionMaxSpeed, const int& axisMask);

    /// <summary>
    /// Moves an end-effector to the given position and orientation transform. This is a non-blocking call.
    /// </summary>
    /// <param name="chainName"> Name of the chain. Could be: \"Head\", \"LArm\",\"RArm\", \"LLeg\", \"RLeg\", \"Torso\" </param>
    /// <param name="space"> Task space {SPACE_TORSO = 0, SPACE_WORLD = 1, SPACE_NAO = 2}. </param>
    /// <param name="transform"> ALTransform arrays </param>
    /// <param name="fractionMaxSpeed"> The fraction of maximum speed to use </param>
    /// <param name="axisMask"> Axis mask. True for axes that you wish to control. e.g. 7 for position only, 56 for rotation only and 63 for both </param>
    void changeTransform(const std::string& chainName, const int& space, const std::vector<float>& transform, const float& fractionMaxSpeed, const int& axisMask);

    /// <summary>
    /// Closes the hand, then cuts motor current to conserve energy. This is a blocking call.
    /// </summary>
    /// <param name="handName"> The name of the hand. Could be: \"RHand\" or \"LHand\" </param>
    void closeHand(const std::string& handName);

    /// <summary>
    /// Exits and unregisters the module.
    /// </summary>
    void exit();

    /// <summary>
    /// Gets the angles of the joints
    /// </summary>
    /// <param name="names"> Names the joints, chains, \"Body\", \"BodyJoints\" or \"BodyActuators\". </param>
    /// <param name="useSensors"> If true, sensor angles will be returned </param>
    /// <returns> Joint angles in radians. </returns>
    std::vector<float> getAngles(const AL::ALValue& names, const bool& useSensors);

    /// <summary>
    /// Gets the name of the parent broker.
    /// </summary>
    /// <returns> The name of the parent broker. </returns>
    std::string getBrokerName();

    /// <summary>
    /// Gets the COM of a joint, chain, \"Body\" or \"BodyJoints\".
    /// </summary>
    /// <param name="pName"> Name of the body which we want the mass. In chain name case, this function give the com of the chain. </param>
    /// <param name="pSpace"> Task space {SPACE_TORSO = 0, SPACE_WORLD = 1, SPACE_NAO = 2}. </param>
    /// <param name="pUseSensorValues"> If true, the sensor values will be used to determine the position. </param>
    /// <returns> The COM position (meter). </returns>
    std::vector<float> getCOM(const std::string& pName, const int& pSpace, const bool& pUseSensorValues);

    /// <summary>
    /// Gets the names of all the joints in the collection.
    /// </summary>
    /// <param name="name"> Name of a chain, \"Body\", \"BodyJoints\" or \"BodyActuators\". </param>
    /// <returns> Vector of strings, one for each joint in the collection </returns>
    std::vector<std::string> getJointNames(const std::string& name);

    /// <summary>
    /// Get the minAngle, maxAngle, and maxChangePerCycle for a given chain in the body.
    /// </summary>
    /// <param name="name"> Name of a joint, chain, \"Body\", \"BodyJoints\" or \"BodyActuators\". </param>
    /// <returns> Array of ALValue arrays containing the minAngle, maxAngle and maxChangePerCycle for all the joints specified. </returns>
    AL::ALValue getLimits(const std::string& name);

    /// <summary>
    /// Gets the mass of a joint, chain, \"Body\" or \"BodyJoints\".
    /// </summary>
    /// <param name="pName"> Name of the body which we want the mass. \"Body\", \"BodyJoints\" and \"Com\" give the total mass of nao. For the chain, it gives the total mass of the chain. </param>
    /// <returns> The mass in kg. </returns>
    float getMass(const std::string& pName);

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
    /// Gets a Position relative to the TASK_SPACE.
    /// </summary>
    /// <param name="name"> Name of the item. Could be: Head, LArm, RArm, LLeg, RLeg, Torso, CameraTop, CameraBottom, MicroFront, MicroRear, MicroLeft, MicroRight, Accelerometer, Gyrometer, Laser, LFsrFR, LFsrFL, LFsrRR, LFsrRL, RFsrFR, RFsrFL, RFsrRR, RFsrRL, USSensor1, USSensor2, USSensor3, USSensor4. </param>
    /// <param name="space"> Task space {SPACE_TORSO = 0, SPACE_WORLD = 1, SPACE_NAO = 2}. </param>
    /// <param name="useSensorValues"> If true, the sensor values will be used to determine the position. </param>
    /// <returns> Vector containing the Position6D using meters and radians (x, y, z, wx, wy, wz) </returns>
    std::vector<float> getPosition(const std::string& name, const int& space, const bool& useSensorValues);

    /// <summary>
    /// Get the robot configuration.
    /// </summary>
    /// <returns> ALValue arrays containing the robot parameter names and the robot parameter values. </returns>
    AL::ALValue getRobotConfig();

    /// <summary>
    /// Gets the World Absolute Robot Position.
    /// </summary>
    /// <param name="useSensors"> If true, use the sensor values </param>
    /// <returns> A vector containing the World Absolute Robot Position. (Absolute Position X, Absolute Position Y, Absolute Angle Z) </returns>
    std::vector<float> getRobotPosition(const bool& useSensors);

    /// <summary>
    /// Gets the World Absolute Robot Velocity.
    /// </summary>
    /// <returns> A vector containing the World Absolute Robot Velocity. (Absolute Velocity Translation X, Absolute Velocity Translation Y, Absolute Velocity Rotation WZ) </returns>
    std::vector<float> getRobotVelocity();

    /// <summary>
    /// Gets stiffness of a joint or group of joints
    /// </summary>
    /// <param name="jointName"> Name of the joints, chains, \"Body\", \"BodyJoints\" or \"BodyActuators\". </param>
    /// <returns> One or more stiffnesses. 1.0 indicates maximum stiffness. 0.0 indicated minimum stiffness </returns>
    std::vector<float> getStiffnesses(const AL::ALValue& jointName);

    /// <summary>
    /// Returns a string representation of the Model's state
    /// </summary>
    /// <returns> A formated string </returns>
    std::string getSummary();

    /// <summary>
    /// Gets an ALValue structure describing the tasks in the Task List
    /// </summary>
    /// <returns> An ALValue containing an ALValue for each task. The inner ALValue contains: Name, MotionID, BrokerID, Priority, Resources </returns>
    AL::ALValue getTaskList();

    /// <summary>
    /// Gets an Homogenous Transform relative to the TASK_SPACE.
    /// </summary>
    /// <param name="name"> Name of the item. Could be: any joint or chain or sensor (Head, LArm, RArm, LLeg, RLeg, Torso, HeadYaw, ..., CameraTop, CameraBottom, MicroFront, MicroRear, MicroLeft, MicroRight, Accelerometer, Gyrometer, Laser, LFsrFR, LFsrFL, LFsrRR, LFsrRL, RFsrFR, RFsrFL, RFsrRR, RFsrRL, USSensor1, USSensor2, USSensor3, USSensor4. </param>
    /// <param name="space"> Task space {SPACE_TORSO = 0, SPACE_WORLD = 1, SPACE_NAO = 2}. </param>
    /// <param name="useSensorValues"> If true, the sensor values will be used to determine the position. </param>
    /// <returns> Vector of 16 floats corresponding to the values of the matrix, line by line. </returns>
    std::vector<float> getTransform(const std::string& name, const int& space, const bool& useSensorValues);

    /// <summary>
    /// Gets the method usage string. This summarise how to use the method.
    /// </summary>
    /// <param name="name"> The name of the method. </param>
    /// <returns> A string that summarises the usage of the method. </returns>
    std::string getUsage(const std::string& name);

    /// <summary>
    /// Gets if Arms Motions are enabled during the Walk Process.
    /// </summary>
    /// <returns> True Arm Motions are controlled by the Walk Task. </returns>
    AL::ALValue getWalkArmsEnable();

    /// <summary>
    /// Kills all tasks.
    /// </summary>
    void killAll();

    /// <summary>
    /// Kills a motion task.
    /// </summary>
    /// <param name="motionTaskID"> TaskID of the motion task you want to kill. </param>
    /// <returns> Return true if the specified motionTaskId has been killed. </returns>
    bool killTask(const int& motionTaskID);

    /// <summary>
    /// Kills all tasks that use any of the resources given.
    /// </summary>
    /// <param name="resourceNames"> A vector of resource joint names </param>
    void killTasksUsingResources(const std::vector<std::string>& resourceNames);

    /// <summary>
    /// Emergency Stop on Walk task: This method will end the walk task brutally, without attempting to return to a balanced state. If Nao has one foot in the air, he could easily fall.
    /// </summary>
    void killWalk();

    /// <summary>
    /// Opens the hand, then cuts motor current to conserve energy. This is a blocking call.
    /// </summary>
    /// <param name="handName"> The name of the hand. Could be: \"RHand or \"LHand\" </param>
    void openHand(const std::string& handName);

    /// <summary>
    /// Just a ping. Always returns true
    /// </summary>
    /// <returns> returns true </returns>
    bool ping();

    /// <summary>
    /// Moves an end-effector to the given position and orientation over time. This is a blocking call.
    /// </summary>
    /// <param name="chainName"> Name of the chain. Could be: \"Head\", \"LArm\", \"RArm\", \"LLeg\", \"RLeg\", \"Torso\" </param>
    /// <param name="space"> Task space {SPACE_TORSO = 0, SPACE_WORLD = 1, SPACE_NAO = 2}. </param>
    /// <param name="path"> Vector of 6D position arrays (x,y,z,wx,wy,wz) in meters and radians </param>
    /// <param name="axisMask"> Axis mask. True for axes that you wish to control. e.g. 7 for position only, 56 for rotation only and 63 for both </param>
    /// <param name="durations"> Vector of times in seconds corresponding to the path points </param>
    /// <param name="isAbsolute"> If true, the movement is absolute else relative </param>
    void positionInterpolation(const std::string& chainName, const int& space, const AL::ALValue& path, const int& axisMask, const AL::ALValue& durations, const bool& isAbsolute);

    /// <summary>
    /// Sets angles. This is a non-blocking call.
    /// </summary>
    /// <param name="names"> The name or names of joints, chains, \"Body\", \"BodyJoints\" or \"BodyActuators\". </param>
    /// <param name="angles"> One or more angles in radians </param>
    /// <param name="fractionMaxSpeed"> The fraction of maximum speed to use </param>
    void setAngles(const AL::ALValue& names, const AL::ALValue& angles, const float& fractionMaxSpeed);

    /// <summary>
    /// Internal Use.
    /// </summary>
    /// <param name="config"> Internal: An array of ALValues [i][0]: name, [i][1]: value </param>
    void setMotionConfig(const AL::ALValue& config);

    /// <summary>
    /// Moves an end-effector to the given position and orientation. This is a non-blocking call.
    /// </summary>
    /// <param name="chainName"> Name of the chain. Could be: \"Head\", \"LArm\",\"RArm\", \"LLeg\", \"RLeg\", \"Torso\" </param>
    /// <param name="space"> Task space {SPACE_TORSO = 0, SPACE_WORLD = 1, SPACE_NAO = 2}. </param>
    /// <param name="position"> 6D position array (x,y,z,wx,wy,wz) in meters and radians </param>
    /// <param name="fractionMaxSpeed"> The fraction of maximum speed to use </param>
    /// <param name="axisMask"> Axis mask. True for axes that you wish to control. e.g. 7 for position only, 56 for rotation only and 63 for both </param>
    void setPosition(const std::string& chainName, const int& space, const std::vector<float>& position, const float& fractionMaxSpeed, const int& axisMask);

    /// <summary>
    /// Sets the stiffness of one or more joints. This is a non-blocking call.
    /// </summary>
    /// <param name="names"> Names of joints, chains, \"Body\", \"BodyJoints\" or \"BodyActuators\". </param>
    /// <param name="stiffnesses"> One or more stiffnesses between zero and one. </param>
    void setStiffnesses(const AL::ALValue& names, const AL::ALValue& stiffnesses);

    /// <summary>
    /// Moves an end-effector to the given position and orientation transform. This is a non-blocking call.
    /// </summary>
    /// <param name="chainName"> Name of the chain. Could be: \"Head\", \"LArm\",\"RArm\", \"LLeg\", \"RLeg\", \"Torso\" </param>
    /// <param name="space"> Task space {SPACE_TORSO = 0, SPACE_WORLD = 1, SPACE_NAO = 2}. </param>
    /// <param name="transform"> ALTransform arrays </param>
    /// <param name="fractionMaxSpeed"> The fraction of maximum speed to use </param>
    /// <param name="axisMask"> Axis mask. True for axes that you wish to control. e.g. 7 for position only, 56 for rotation only and 63 for both </param>
    void setTransform(const std::string& chainName, const int& space, const std::vector<float>& transform, const float& fractionMaxSpeed, const int& axisMask);

    /// <summary>
    /// Sets if Arms Motions are enabled during the Walk Process.
    /// </summary>
    /// <param name="leftArmEnable"> if true Left Arm motions are controlled by the Walk Task </param>
    /// <param name="rightArmEnable"> if true Right Arm mMotions are controlled by the Walk Task </param>
    void setWalkArmsEnable(const bool& leftArmEnable, const bool& rightArmEnable);

    /// <summary>
    /// Makes Nao walk at the given velocity. This is a non-blocking call.
    /// </summary>
    /// <param name="x"> Fraction of MaxStepX. Use negative for backwards. [-1.0 to 1.0] </param>
    /// <param name="y"> Fraction of MaxStepY. Use negative for right. [-1.0 to 1.0] </param>
    /// <param name="theta"> Fraction of MaxStepTheta. Use negative for clockwise [-1.0 to 1.0] </param>
    /// <param name="frequency"> Fraction of MaxStepFrequency [0.0 to 1.0] </param>
    void setWalkTargetVelocity(const float& x, const float& y, const float& theta, const float& frequency);

    /// <summary>
    /// Makes Nao do a single step. This is a blocking call.
    /// </summary>
    /// <param name="legName"> name of the leg to move('LLeg'or 'RLeg') </param>
    /// <param name="x"> Position along X axis of the leg relative to the other Leg in meters. Must be less than MaxStepX </param>
    /// <param name="y"> Position along Y axis of the leg relative to the other Leg in meters. Must be less than MaxStepY </param>
    /// <param name="theta"> Orientation round Z axis of the leg relative to the other leg in radians. Must be less than MaxStepX </param>
    void stepTo(const std::string& legName, const float& x, const float& y, const float& theta);

    /// <summary>
    /// Interpolates one or multiple joints to a target stiffness or along timed trajectories of stiffness. This is a blocking call.
    /// </summary>
    /// <param name="names"> Name or names of joints, chains, \"Body\", \"BodyJoints\" or \"BodyActuators\". </param>
    /// <param name="stiffnessLists"> An stiffness, list of stiffnesses or list of list of stiffnesses </param>
    /// <param name="timeLists"> A time, list of times or list of list of times. </param>
    void stiffnessInterpolation(const AL::ALValue& names, const AL::ALValue& stiffnessLists, const AL::ALValue& timeLists);

    /// <summary>
    /// Moves an end-effector to the given position and orientation over time using homogenous transforms to describe the positions or changes. This is a blocking call.
    /// </summary>
    /// <param name="chainName"> Name of the chain. Could be: \"Head\", \"LArm\",\"RArm\", \"LLeg\", \"RLeg\", \"Torso\" </param>
    /// <param name="space"> Task space {SPACE_TORSO = 0, SPACE_WORLD = 1, SPACE_NAO = 2}. </param>
    /// <param name="path"> Vector of ALTransform arrays </param>
    /// <param name="axisMask"> Axis mask. True for axes that you wish to control. e.g. 7 for position only, 56 for rotation only and 63 for both </param>
    /// <param name="duration"> Vector of times in seconds corresponding to the path points </param>
    /// <param name="isAbsolute"> If true, the movement is absolute else relative </param>
    void transformInterpolation(const std::string& chainName, const int& space, const AL::ALValue& path, const int& axisMask, const AL::ALValue& duration, const bool& isAbsolute);

    /// <summary>
    /// Update the target to follow by the head of NAO.
    /// </summary>
    /// <param name="pTargetPositionWy"> The target position wy in SPACE_NAO </param>
    /// <param name="pTargetPositionWz"> The target position wz in  SPACE_NAO </param>
    /// <param name="pTimeSinceDetectionMs"> The time in Ms since the target was detected </param>
    /// <param name="pUseOfWholeBody"> If true, the target is follow in cartesian space by the Head with whole Body constraints. </param>
    void updateTrackerTarget(const float& pTargetPositionWy, const float& pTargetPositionWz, const int& pTimeSinceDetectionMs, const bool& pUseOfWholeBody);

    /// <summary>
    /// Returns the version of the module.
    /// </summary>
    /// <returns> A string containing the version of the module. </returns>
    std::string version();

    /// <summary>
    /// Waits until the WalkTask is finished: This method can be used to block your script/code execution until the walk task is totally finished.
    /// </summary>
    void waitUntilWalkIsFinished();

    /// <summary>
    /// Return True if Walk is Active.
    /// </summary>
    /// <returns> True Arm Motions are controlled by the Walk Task. </returns>
    bool walkIsActive();

    /// <summary>
    /// Makes Nao walk to the given relative Position. This is a blocking call.
    /// </summary>
    /// <param name="x"> Distance along the X axis in meters. </param>
    /// <param name="y"> Distance along the Y axis in meters. </param>
    /// <param name="theta"> Rotation around the Z axis in radians [-3.1415 to 3.1415]. </param>
    void walkTo(const float& x, const float& y, const float& theta);

    /// <summary>
    /// UserFriendly Whole Body API: enable Whole Body Balancer. It's a Generalized Inverse Kinematics which deals with cartesian control, balance, redundancy and task priority. The main goal is to generate and stabilized consistent motions without precomputed trajectories and adapt nao's behaviour to the situation. The generalized inverse kinematic problem takes in account equality constraints (keep foot fix), inequality constraints (joint limits, balance, ...) and quadratic minimization (cartesian / articular desired trajectories). We solve each step a quadratic programming on the robot.
    /// </summary>
    /// <param name="isEnabled"> Active / Disactive Whole Body Balancer. </param>
    void wbEnable(const bool& isEnabled);

    /// <summary>
    /// UserFriendly Whole Body API: enable to keep balance in support polygon.
    /// </summary>
    /// <param name="isEnable"> Enable Nao to keep balance. </param>
    /// <param name="supportLeg"> Name of the support leg: \"Legs\", \"LLeg\", \"RLeg\". </param>
    void wbEnableBalanceConstraint(const bool& isEnable, const std::string& supportLeg);

    /// <summary>
    /// UserFriendly Whole Body API: enable whole body cartesian control of an effector.
    /// </summary>
    /// <param name="effectorName"> Name of the effector : \"Head\", \"LArm\" or \"RArm\". Nao goes to posture init. He manages his balance and keep foot fix. \"Head\" is controlled in rotation. \"LArm\" and \"RArm\" are controlled in position. </param>
    /// <param name="isEnabled"> Active / Disactive Effector Control. </param>
    void wbEnableEffectorControl(const std::string& effectorName, const bool& isEnabled);

    /// <summary>
    /// UserFriendly Whole Body API: set the foot state: fixed foot, constrained in a plane or free.
    /// </summary>
    /// <param name="stateName"> Name of the foot state. \"Fixed\" set the foot fixed. \"Plane\" constrained the Foot in the plane. \"Free\" set the foot free. </param>
    /// <param name="supportLeg"> Name of the foot. \"LLeg\", \"RLeg\" or \"Legs\". </param>
    void wbFootState(const std::string& stateName, const std::string& supportLeg);

    /// <summary>
    /// UserFriendly Whole Body API: set new target for controlled effector. This is a non-blocking call.
    /// </summary>
    /// <param name="effectorName"> Name of the effector : \"Head\", \"LArm\" or \"RArm\". Nao goes to posture init. He manages his balance and keep foot fix. \"Head\" is controlled in rotation. \"LArm\" and \"RArm\" are controlled in position. </param>
    /// <param name="targetCoordinate"> \"Head\" is controlled in rotation (WX, WY, WZ). \"LArm\" and \"RArm\" are controlled in position (X, Y, Z). TargetCoordinate must be absolute and expressed in SPACE_NAO. If the desired position/orientation is unfeasible, target is resize to the nearest feasible motion. </param>
    void wbSetEffectorControl(const std::string& effectorName, const AL::ALValue& targetCoordinate);

};

}
#endif // ALMOTIONPROXY_H_
