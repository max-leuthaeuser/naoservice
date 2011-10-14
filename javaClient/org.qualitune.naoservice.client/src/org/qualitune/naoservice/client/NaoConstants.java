package org.qualitune.naoservice.client;

import java.util.List;

/**
 * Provides constants used by the {@link NaoUtil} class.
 * 
 * @author Claas Wilke
 */
public interface NaoConstants {

	/** Id of sensor for maximum voltage at battery cells of a Nao (in mV). */
	public static final String SENSOR_NAME_BATTERY_CELL_VOLTAGE_MAX = "Device/SubDeviceList/Battery/Charge/Sensor/CellVoltageMax";

	/** Id of sensor for minimum voltage at battery cells of a Nao (in mV). */
	public static final String SENSOR_NAME_BATTERY_CELL_VOLTAGE_MIN = "Device/SubDeviceList/Battery/Charge/Sensor/CellVoltageMin";

	/**
	 * Id of sensor for approximated remaining capacity of the battery cells of
	 * a Nao (in <code>Ah</code>).
	 */
	public static final String SENSOR_NAME_BATTERY_REMAINING_CAPACITY = "Device/SubDeviceList/Battery/Charge/Sensor/RemainingCapacity";

	/** Id of sensor for the status at the battery cells of a Nao. */
	public static final String SENSOR_NAME_BATTERY_STATUS = "Device/SubDeviceList/Battery/Charge/Sensor/Status";

	/** Id of sensor for the current at the battery cells of a Nao (in mA). */
	public static final String SENSOR_NAME_BATTERY_CURRENT = "Device/SubDeviceList/Battery/Current/Sensor/Value";

	/** Id for a time stamp value in a sensor value message. */
	public static final String TIME_STAMP = "timestamp";

	/** Id for a time stamp value in a sensor value message. */
	public static final int TIME_STAMP_ID = -42;

	/** TODO Generate id constants for all provided sensors. */

	/**
	 * Id of the sensor ALAudioSourceLocalization/SoundLocated as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_ALAUDIOSOURCELOCALIZATION_SOUNDLOCATED = -2;

	/**
	 * Id of the sensor ALSentinel/BatteryLevel as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_ALSENTINEL_BATTERYLEVEL = -1;

	/**
	 * Id of the sensor ALSentinel/DoubleClickOccured as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_ALSENTINEL_DOUBLECLICKOCCURED = 0;

	/**
	 * Id of the sensor ALSentinel/FallManaging as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_ALSENTINEL_FALLMANAGING = 1;

	/**
	 * Id of the sensor ALSentinel/MemoryLow as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_ALSENTINEL_MEMORYLOW = 2;

	/**
	 * Id of the sensor ALSentinel/SimpleClickOccured as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_ALSENTINEL_SIMPLECLICKOCCURED = 3;

	/**
	 * Id of the sensor ALSentinel/TripleClickOccured as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_ALSENTINEL_TRIPLECLICKOCCURED = 4;

	/**
	 * Id of the sensor ALTextToSpeech/CurrentBookMark as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_ALTEXTTOSPEECH_CURRENTBOOKMARK = 5;

	/**
	 * Id of the sensor ALTextToSpeech/CurrentWord as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_ALTEXTTOSPEECH_CURRENTWORD = 6;

	/**
	 * Id of the sensor ALTextToSpeech/PositionOfCurrentWord as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_ALTEXTTOSPEECH_POSITIONOFCURRENTWORD = 7;

	/**
	 * Id of the sensor ALTextToSpeech/TextDone as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_ALTEXTTOSPEECH_TEXTDONE = 8;

	/**
	 * Id of the sensor ALTextToSpeech/TextStarted as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_ALTEXTTOSPEECH_TEXTSTARTED = 9;

	/**
	 * Id of the sensor ALTextToSpeech_SayProcessing as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_ALTEXTTOSPEECH_SAYPROCESSING = 10;

	/**
	 * Id of the sensor AsynchronousIndex as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_ASYNCHRONOUSINDEX = 11;

	/**
	 * Id of the sensor BatteryChargeCellVoltageMinChanged as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_BATTERYCHARGECELLVOLTAGEMINCHANGED = 12;

	/**
	 * Id of the sensor BatteryChargeStatusChanged as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_BATTERYCHARGESTATUSCHANGED = 13;

	/**
	 * Id of the sensor BatteryLowDetected as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_BATTERYLOWDETECTED = 14;

	/**
	 * Id of the sensor BatteryValueChanged as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_BATTERYVALUECHANGED = 15;

	/**
	 * Id of the sensor BehaviorsRun as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_BEHAVIORSRUN = 16;

	/**
	 * Id of the sensor BodyStiffnessChanged as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_BODYSTIFFNESSCHANGED = 17;

	/**
	 * Id of the sensor ChestButtonPressed as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_CHESTBUTTONPRESSED = 18;

	/**
	 * Id of the sensor ClientConnected as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_CLIENTCONNECTED = 19;

	/**
	 * Id of the sensor ClientDisconnected as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_CLIENTDISCONNECTED = 20;

	/**
	 * Id of the sensor DCM/CycleTime as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DCM_CYCLETIME = 21;

	/**
	 * Id of the sensor DCM/CycleTimeWarning as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DCM_CYCLETIMEWARNING = 22;

	/**
	 * Id of the sensor DCM/HeatLogPath as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DCM_HEATLOGPATH = 23;

	/**
	 * Id of the sensor DCM/I2Cpath as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DCM_I2CPATH = 24;

	/**
	 * Id of the sensor DCM/Realtime as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DCM_REALTIME = 25;

	/**
	 * Id of the sensor DCM/RealtimePriority as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DCM_REALTIMEPRIORITY = 26;

	/**
	 * Id of the sensor DCM/Simulation as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DCM_SIMULATION = 27;

	/**
	 * Id of the sensor DCM/TargetCycleMinWait as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DCM_TARGETCYCLEMINWAIT = 28;

	/**
	 * Id of the sensor DCM/TargetCycleTime as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DCM_TARGETCYCLETIME = 29;

	/**
	 * Id of the sensor DCM/Time as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DCM_TIME = 30;

	/**
	 * Id of the sensor DCM/hardnessMode as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DCM_HARDNESSMODE = 31;

	/**
	 * Id of the sensor Device/DeviceList/Battery/Ack as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_BATTERY_ACK = 32;

	/**
	 * Id of the sensor Device/DeviceList/Battery/Address as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_BATTERY_ADDRESS = 33;

	/**
	 * Id of the sensor Device/DeviceList/Battery/Bus as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_BATTERY_BUS = 34;

	/**
	 * Id of the sensor Device/DeviceList/Battery/DeviceName as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_BATTERY_DEVICENAME = 35;

	/**
	 * Id of the sensor Device/DeviceList/Battery/Error as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_BATTERY_ERROR = 36;

	/**
	 * Id of the sensor Device/DeviceList/Battery/FirmwareVersion as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_BATTERY_FIRMWAREVERSION = 37;

	/**
	 * Id of the sensor Device/DeviceList/Battery/Manufactor as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_BATTERY_MANUFACTOR = 38;

	/**
	 * Id of the sensor Device/DeviceList/Battery/ManufactureDate as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_BATTERY_MANUFACTUREDATE = 39;

	/**
	 * Id of the sensor Device/DeviceList/Battery/Nack as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_BATTERY_NACK = 40;

	/**
	 * Id of the sensor Device/DeviceList/Battery/SerialNumber as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_BATTERY_SERIALNUMBER = 41;

	/**
	 * Id of the sensor Device/DeviceList/Battery/Type as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_BATTERY_TYPE = 42;

	/**
	 * Id of the sensor Device/DeviceList/Chest-Eeprom/Ack as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_CHEST_EEPROM_ACK = 43;

	/**
	 * Id of the sensor Device/DeviceList/Chest-Eeprom/Address as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_CHEST_EEPROM_ADDRESS = 44;

	/**
	 * Id of the sensor Device/DeviceList/Chest-Eeprom/Bus as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_CHEST_EEPROM_BUS = 45;

	/**
	 * Id of the sensor Device/DeviceList/Chest-Eeprom/Error as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_CHEST_EEPROM_ERROR = 46;

	/**
	 * Id of the sensor Device/DeviceList/Chest-Eeprom/Nack as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_CHEST_EEPROM_NACK = 47;

	/**
	 * Id of the sensor Device/DeviceList/Chest-Eeprom/Type as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_CHEST_EEPROM_TYPE = 48;

	/**
	 * Id of the sensor Device/DeviceList/ChestBoard/Ack as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_CHESTBOARD_ACK = 49;

	/**
	 * Id of the sensor Device/DeviceList/ChestBoard/Address as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_CHESTBOARD_ADDRESS = 50;

	/**
	 * Id of the sensor Device/DeviceList/ChestBoard/BodyId as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_CHESTBOARD_BODYID = 51;

	/**
	 * Id of the sensor Device/DeviceList/ChestBoard/BodyNickName as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_CHESTBOARD_BODYNICKNAME = 52;

	/**
	 * Id of the sensor Device/DeviceList/ChestBoard/Bus as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_CHESTBOARD_BUS = 53;

	/**
	 * Id of the sensor Device/DeviceList/ChestBoard/ChainResult as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_CHESTBOARD_CHAINRESULT = 54;

	/**
	 * Id of the sensor Device/DeviceList/ChestBoard/Error as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_CHESTBOARD_ERROR = 55;

	/**
	 * Id of the sensor Device/DeviceList/ChestBoard/Nack as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_CHESTBOARD_NACK = 56;

	/**
	 * Id of the sensor Device/DeviceList/ChestBoard/ProgVersion as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_CHESTBOARD_PROGVERSION = 57;

	/**
	 * Id of the sensor Device/DeviceList/ChestBoard/Type as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_CHESTBOARD_TYPE = 58;

	/**
	 * Id of the sensor Device/DeviceList/EarLeds/Ack as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_EARLEDS_ACK = 59;

	/**
	 * Id of the sensor Device/DeviceList/EarLeds/Address as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_EARLEDS_ADDRESS = 60;

	/**
	 * Id of the sensor Device/DeviceList/EarLeds/Bus as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_EARLEDS_BUS = 61;

	/**
	 * Id of the sensor Device/DeviceList/EarLeds/Error as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_EARLEDS_ERROR = 62;

	/**
	 * Id of the sensor Device/DeviceList/EarLeds/Nack as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_EARLEDS_NACK = 63;

	/**
	 * Id of the sensor Device/DeviceList/EarLeds/Type as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_EARLEDS_TYPE = 64;

	/**
	 * Id of the sensor Device/DeviceList/FaceBoard/Ack as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_FACEBOARD_ACK = 65;

	/**
	 * Id of the sensor Device/DeviceList/FaceBoard/Address as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_FACEBOARD_ADDRESS = 66;

	/**
	 * Id of the sensor Device/DeviceList/FaceBoard/Bus as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_FACEBOARD_BUS = 67;

	/**
	 * Id of the sensor Device/DeviceList/FaceBoard/Error as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_FACEBOARD_ERROR = 68;

	/**
	 * Id of the sensor Device/DeviceList/FaceBoard/Nack as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_FACEBOARD_NACK = 69;

	/**
	 * Id of the sensor Device/DeviceList/FaceBoard/Type as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_FACEBOARD_TYPE = 70;

	/**
	 * Id of the sensor Device/DeviceList/HeadBoard/Ack as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_HEADBOARD_ACK = 71;

	/**
	 * Id of the sensor Device/DeviceList/HeadBoard/Address as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_HEADBOARD_ADDRESS = 72;

	/**
	 * Id of the sensor Device/DeviceList/HeadBoard/Bid as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_HEADBOARD_BID = 73;

	/**
	 * Id of the sensor Device/DeviceList/HeadBoard/BoardId as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_HEADBOARD_BOARDID = 74;

	/**
	 * Id of the sensor Device/DeviceList/HeadBoard/BoardId2 as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_HEADBOARD_BOARDID2 = 75;

	/**
	 * Id of the sensor Device/DeviceList/HeadBoard/BootLoaderVersion as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_HEADBOARD_BOOTLOADERVERSION = 76;

	/**
	 * Id of the sensor Device/DeviceList/HeadBoard/Bus as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_HEADBOARD_BUS = 77;

	/**
	 * Id of the sensor Device/DeviceList/HeadBoard/Error as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_HEADBOARD_ERROR = 78;

	/**
	 * Id of the sensor Device/DeviceList/HeadBoard/Nack as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_HEADBOARD_NACK = 79;

	/**
	 * Id of the sensor Device/DeviceList/HeadBoard/ProgVersion as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_HEADBOARD_PROGVERSION = 80;

	/**
	 * Id of the sensor Device/DeviceList/HeadBoard/StructVersion as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_HEADBOARD_STRUCTVERSION = 81;

	/**
	 * Id of the sensor Device/DeviceList/HeadBoard/Type as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_HEADBOARD_TYPE = 82;

	/**
	 * Id of the sensor
	 * Device/DeviceList/HeadBoard/currentCalibrationResultMotor1 as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_HEADBOARD_CURRENTCALIBRATIONRESULTMOTOR1 = 83;

	/**
	 * Id of the sensor
	 * Device/DeviceList/HeadBoard/currentCalibrationResultMotor2 as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_HEADBOARD_CURRENTCALIBRATIONRESULTMOTOR2 = 84;

	/**
	 * Id of the sensor Device/DeviceList/InertialSensor/Ack as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_INERTIALSENSOR_ACK = 85;

	/**
	 * Id of the sensor Device/DeviceList/InertialSensor/Address as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_INERTIALSENSOR_ADDRESS = 86;

	/**
	 * Id of the sensor Device/DeviceList/InertialSensor/Bus as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_INERTIALSENSOR_BUS = 87;

	/**
	 * Id of the sensor Device/DeviceList/InertialSensor/Error as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_INERTIALSENSOR_ERROR = 88;

	/**
	 * Id of the sensor Device/DeviceList/InertialSensor/Nack as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_INERTIALSENSOR_NACK = 89;

	/**
	 * Id of the sensor Device/DeviceList/InertialSensor/Type as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_INERTIALSENSOR_TYPE = 90;

	/**
	 * Id of the sensor Device/DeviceList/LeftArmBoard/Ack as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTARMBOARD_ACK = 91;

	/**
	 * Id of the sensor Device/DeviceList/LeftArmBoard/Address as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTARMBOARD_ADDRESS = 92;

	/**
	 * Id of the sensor Device/DeviceList/LeftArmBoard/Bid as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTARMBOARD_BID = 93;

	/**
	 * Id of the sensor Device/DeviceList/LeftArmBoard/BoardId as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTARMBOARD_BOARDID = 94;

	/**
	 * Id of the sensor Device/DeviceList/LeftArmBoard/BoardId2 as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTARMBOARD_BOARDID2 = 95;

	/**
	 * Id of the sensor Device/DeviceList/LeftArmBoard/BootLoaderVersion as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTARMBOARD_BOOTLOADERVERSION = 96;

	/**
	 * Id of the sensor Device/DeviceList/LeftArmBoard/Bus as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTARMBOARD_BUS = 97;

	/**
	 * Id of the sensor Device/DeviceList/LeftArmBoard/Error as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTARMBOARD_ERROR = 98;

	/**
	 * Id of the sensor Device/DeviceList/LeftArmBoard/Nack as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTARMBOARD_NACK = 99;

	/**
	 * Id of the sensor Device/DeviceList/LeftArmBoard/ProgVersion as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTARMBOARD_PROGVERSION = 100;

	/**
	 * Id of the sensor Device/DeviceList/LeftArmBoard/StructVersion as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTARMBOARD_STRUCTVERSION = 101;

	/**
	 * Id of the sensor Device/DeviceList/LeftArmBoard/Type as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTARMBOARD_TYPE = 102;

	/**
	 * Id of the sensor
	 * Device/DeviceList/LeftArmBoard/currentCalibrationResultMotor1 as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTARMBOARD_CURRENTCALIBRATIONRESULTMOTOR1 = 103;

	/**
	 * Id of the sensor
	 * Device/DeviceList/LeftArmBoard/currentCalibrationResultMotor2 as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTARMBOARD_CURRENTCALIBRATIONRESULTMOTOR2 = 104;

	/**
	 * Id of the sensor Device/DeviceList/LeftFootBoard/Ack as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTFOOTBOARD_ACK = 105;

	/**
	 * Id of the sensor Device/DeviceList/LeftFootBoard/Address as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTFOOTBOARD_ADDRESS = 106;

	/**
	 * Id of the sensor Device/DeviceList/LeftFootBoard/Bid as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTFOOTBOARD_BID = 107;

	/**
	 * Id of the sensor Device/DeviceList/LeftFootBoard/BoardId as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTFOOTBOARD_BOARDID = 108;

	/**
	 * Id of the sensor Device/DeviceList/LeftFootBoard/BoardId2 as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTFOOTBOARD_BOARDID2 = 109;

	/**
	 * Id of the sensor Device/DeviceList/LeftFootBoard/BootLoaderVersion as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTFOOTBOARD_BOOTLOADERVERSION = 110;

	/**
	 * Id of the sensor Device/DeviceList/LeftFootBoard/Bus as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTFOOTBOARD_BUS = 111;

	/**
	 * Id of the sensor Device/DeviceList/LeftFootBoard/Error as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTFOOTBOARD_ERROR = 112;

	/**
	 * Id of the sensor Device/DeviceList/LeftFootBoard/Nack as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTFOOTBOARD_NACK = 113;

	/**
	 * Id of the sensor Device/DeviceList/LeftFootBoard/ProgVersion as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTFOOTBOARD_PROGVERSION = 114;

	/**
	 * Id of the sensor Device/DeviceList/LeftFootBoard/StructVersion as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTFOOTBOARD_STRUCTVERSION = 115;

	/**
	 * Id of the sensor Device/DeviceList/LeftFootBoard/Type as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTFOOTBOARD_TYPE = 116;

	/**
	 * Id of the sensor
	 * Device/DeviceList/LeftFootBoard/currentCalibrationResultMotor1 as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTFOOTBOARD_CURRENTCALIBRATIONRESULTMOTOR1 = 117;

	/**
	 * Id of the sensor
	 * Device/DeviceList/LeftFootBoard/currentCalibrationResultMotor2 as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTFOOTBOARD_CURRENTCALIBRATIONRESULTMOTOR2 = 118;

	/**
	 * Id of the sensor Device/DeviceList/LeftHandBoard/Ack as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTHANDBOARD_ACK = 119;

	/**
	 * Id of the sensor Device/DeviceList/LeftHandBoard/Address as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTHANDBOARD_ADDRESS = 120;

	/**
	 * Id of the sensor Device/DeviceList/LeftHandBoard/BoardId as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTHANDBOARD_BOARDID = 121;

	/**
	 * Id of the sensor Device/DeviceList/LeftHandBoard/BoardId2 as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTHANDBOARD_BOARDID2 = 122;

	/**
	 * Id of the sensor Device/DeviceList/LeftHandBoard/BootLoaderVersion as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTHANDBOARD_BOOTLOADERVERSION = 123;

	/**
	 * Id of the sensor Device/DeviceList/LeftHandBoard/Bus as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTHANDBOARD_BUS = 124;

	/**
	 * Id of the sensor Device/DeviceList/LeftHandBoard/Error as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTHANDBOARD_ERROR = 125;

	/**
	 * Id of the sensor Device/DeviceList/LeftHandBoard/Nack as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTHANDBOARD_NACK = 126;

	/**
	 * Id of the sensor Device/DeviceList/LeftHandBoard/ProgVersion as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTHANDBOARD_PROGVERSION = 127;

	/**
	 * Id of the sensor Device/DeviceList/LeftHandBoard/StructVersion as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTHANDBOARD_STRUCTVERSION = 128;

	/**
	 * Id of the sensor Device/DeviceList/LeftHandBoard/Type as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTHANDBOARD_TYPE = 129;

	/**
	 * Id of the sensor Device/DeviceList/LeftHipBoard/Ack as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTHIPBOARD_ACK = 130;

	/**
	 * Id of the sensor Device/DeviceList/LeftHipBoard/Address as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTHIPBOARD_ADDRESS = 131;

	/**
	 * Id of the sensor Device/DeviceList/LeftHipBoard/Bid as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTHIPBOARD_BID = 132;

	/**
	 * Id of the sensor Device/DeviceList/LeftHipBoard/BoardId as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTHIPBOARD_BOARDID = 133;

	/**
	 * Id of the sensor Device/DeviceList/LeftHipBoard/BoardId2 as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTHIPBOARD_BOARDID2 = 134;

	/**
	 * Id of the sensor Device/DeviceList/LeftHipBoard/BootLoaderVersion as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTHIPBOARD_BOOTLOADERVERSION = 135;

	/**
	 * Id of the sensor Device/DeviceList/LeftHipBoard/Bus as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTHIPBOARD_BUS = 136;

	/**
	 * Id of the sensor Device/DeviceList/LeftHipBoard/Error as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTHIPBOARD_ERROR = 137;

	/**
	 * Id of the sensor Device/DeviceList/LeftHipBoard/Nack as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTHIPBOARD_NACK = 138;

	/**
	 * Id of the sensor Device/DeviceList/LeftHipBoard/ProgVersion as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTHIPBOARD_PROGVERSION = 139;

	/**
	 * Id of the sensor Device/DeviceList/LeftHipBoard/StructVersion as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTHIPBOARD_STRUCTVERSION = 140;

	/**
	 * Id of the sensor Device/DeviceList/LeftHipBoard/Type as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTHIPBOARD_TYPE = 141;

	/**
	 * Id of the sensor
	 * Device/DeviceList/LeftHipBoard/currentCalibrationResultMotor1 as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTHIPBOARD_CURRENTCALIBRATIONRESULTMOTOR1 = 142;

	/**
	 * Id of the sensor
	 * Device/DeviceList/LeftHipBoard/currentCalibrationResultMotor2 as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTHIPBOARD_CURRENTCALIBRATIONRESULTMOTOR2 = 143;

	/**
	 * Id of the sensor Device/DeviceList/LeftShinBoard/Ack as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTSHINBOARD_ACK = 144;

	/**
	 * Id of the sensor Device/DeviceList/LeftShinBoard/Address as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTSHINBOARD_ADDRESS = 145;

	/**
	 * Id of the sensor Device/DeviceList/LeftShinBoard/Bid as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTSHINBOARD_BID = 146;

	/**
	 * Id of the sensor Device/DeviceList/LeftShinBoard/BoardId as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTSHINBOARD_BOARDID = 147;

	/**
	 * Id of the sensor Device/DeviceList/LeftShinBoard/BoardId2 as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTSHINBOARD_BOARDID2 = 148;

	/**
	 * Id of the sensor Device/DeviceList/LeftShinBoard/BootLoaderVersion as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTSHINBOARD_BOOTLOADERVERSION = 149;

	/**
	 * Id of the sensor Device/DeviceList/LeftShinBoard/Bus as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTSHINBOARD_BUS = 150;

	/**
	 * Id of the sensor Device/DeviceList/LeftShinBoard/Error as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTSHINBOARD_ERROR = 151;

	/**
	 * Id of the sensor Device/DeviceList/LeftShinBoard/Nack as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTSHINBOARD_NACK = 152;

	/**
	 * Id of the sensor Device/DeviceList/LeftShinBoard/ProgVersion as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTSHINBOARD_PROGVERSION = 153;

	/**
	 * Id of the sensor Device/DeviceList/LeftShinBoard/StructVersion as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTSHINBOARD_STRUCTVERSION = 154;

	/**
	 * Id of the sensor Device/DeviceList/LeftShinBoard/Type as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTSHINBOARD_TYPE = 155;

	/**
	 * Id of the sensor
	 * Device/DeviceList/LeftShinBoard/currentCalibrationResultMotor1 as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTSHINBOARD_CURRENTCALIBRATIONRESULTMOTOR1 = 156;

	/**
	 * Id of the sensor
	 * Device/DeviceList/LeftShinBoard/currentCalibrationResultMotor2 as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTSHINBOARD_CURRENTCALIBRATIONRESULTMOTOR2 = 157;

	/**
	 * Id of the sensor Device/DeviceList/LeftShoulderBoard/Ack as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTSHOULDERBOARD_ACK = 158;

	/**
	 * Id of the sensor Device/DeviceList/LeftShoulderBoard/Address as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTSHOULDERBOARD_ADDRESS = 159;

	/**
	 * Id of the sensor Device/DeviceList/LeftShoulderBoard/Bid as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTSHOULDERBOARD_BID = 160;

	/**
	 * Id of the sensor Device/DeviceList/LeftShoulderBoard/BoardId as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTSHOULDERBOARD_BOARDID = 161;

	/**
	 * Id of the sensor Device/DeviceList/LeftShoulderBoard/BoardId2 as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTSHOULDERBOARD_BOARDID2 = 162;

	/**
	 * Id of the sensor Device/DeviceList/LeftShoulderBoard/BootLoaderVersion as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTSHOULDERBOARD_BOOTLOADERVERSION = 163;

	/**
	 * Id of the sensor Device/DeviceList/LeftShoulderBoard/Bus as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTSHOULDERBOARD_BUS = 164;

	/**
	 * Id of the sensor Device/DeviceList/LeftShoulderBoard/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTSHOULDERBOARD_ERROR = 165;

	/**
	 * Id of the sensor Device/DeviceList/LeftShoulderBoard/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTSHOULDERBOARD_NACK = 166;

	/**
	 * Id of the sensor Device/DeviceList/LeftShoulderBoard/ProgVersion as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTSHOULDERBOARD_PROGVERSION = 167;

	/**
	 * Id of the sensor Device/DeviceList/LeftShoulderBoard/StructVersion as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTSHOULDERBOARD_STRUCTVERSION = 168;

	/**
	 * Id of the sensor Device/DeviceList/LeftShoulderBoard/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTSHOULDERBOARD_TYPE = 169;

	/**
	 * Id of the sensor
	 * Device/DeviceList/LeftShoulderBoard/currentCalibrationResultMotor1 as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTSHOULDERBOARD_CURRENTCALIBRATIONRESULTMOTOR1 = 170;

	/**
	 * Id of the sensor
	 * Device/DeviceList/LeftShoulderBoard/currentCalibrationResultMotor2 as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTSHOULDERBOARD_CURRENTCALIBRATIONRESULTMOTOR2 = 171;

	/**
	 * Id of the sensor Device/DeviceList/LeftThighBoard/Ack as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTTHIGHBOARD_ACK = 172;

	/**
	 * Id of the sensor Device/DeviceList/LeftThighBoard/Address as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTTHIGHBOARD_ADDRESS = 173;

	/**
	 * Id of the sensor Device/DeviceList/LeftThighBoard/Bid as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTTHIGHBOARD_BID = 174;

	/**
	 * Id of the sensor Device/DeviceList/LeftThighBoard/BoardId as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTTHIGHBOARD_BOARDID = 175;

	/**
	 * Id of the sensor Device/DeviceList/LeftThighBoard/BoardId2 as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTTHIGHBOARD_BOARDID2 = 176;

	/**
	 * Id of the sensor Device/DeviceList/LeftThighBoard/BootLoaderVersion as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTTHIGHBOARD_BOOTLOADERVERSION = 177;

	/**
	 * Id of the sensor Device/DeviceList/LeftThighBoard/Bus as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTTHIGHBOARD_BUS = 178;

	/**
	 * Id of the sensor Device/DeviceList/LeftThighBoard/Error as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTTHIGHBOARD_ERROR = 179;

	/**
	 * Id of the sensor Device/DeviceList/LeftThighBoard/Nack as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTTHIGHBOARD_NACK = 180;

	/**
	 * Id of the sensor Device/DeviceList/LeftThighBoard/ProgVersion as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTTHIGHBOARD_PROGVERSION = 181;

	/**
	 * Id of the sensor Device/DeviceList/LeftThighBoard/StructVersion as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTTHIGHBOARD_STRUCTVERSION = 182;

	/**
	 * Id of the sensor Device/DeviceList/LeftThighBoard/Type as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTTHIGHBOARD_TYPE = 183;

	/**
	 * Id of the sensor
	 * Device/DeviceList/LeftThighBoard/currentCalibrationResultMotor1 as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTTHIGHBOARD_CURRENTCALIBRATIONRESULTMOTOR1 = 184;

	/**
	 * Id of the sensor
	 * Device/DeviceList/LeftThighBoard/currentCalibrationResultMotor2 as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_LEFTTHIGHBOARD_CURRENTCALIBRATIONRESULTMOTOR2 = 185;

	/**
	 * Id of the sensor Device/DeviceList/RightArmBoard/Ack as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTARMBOARD_ACK = 186;

	/**
	 * Id of the sensor Device/DeviceList/RightArmBoard/Address as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTARMBOARD_ADDRESS = 187;

	/**
	 * Id of the sensor Device/DeviceList/RightArmBoard/Bid as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTARMBOARD_BID = 188;

	/**
	 * Id of the sensor Device/DeviceList/RightArmBoard/BoardId as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTARMBOARD_BOARDID = 189;

	/**
	 * Id of the sensor Device/DeviceList/RightArmBoard/BoardId2 as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTARMBOARD_BOARDID2 = 190;

	/**
	 * Id of the sensor Device/DeviceList/RightArmBoard/BootLoaderVersion as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTARMBOARD_BOOTLOADERVERSION = 191;

	/**
	 * Id of the sensor Device/DeviceList/RightArmBoard/Bus as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTARMBOARD_BUS = 192;

	/**
	 * Id of the sensor Device/DeviceList/RightArmBoard/Error as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTARMBOARD_ERROR = 193;

	/**
	 * Id of the sensor Device/DeviceList/RightArmBoard/Nack as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTARMBOARD_NACK = 194;

	/**
	 * Id of the sensor Device/DeviceList/RightArmBoard/ProgVersion as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTARMBOARD_PROGVERSION = 195;

	/**
	 * Id of the sensor Device/DeviceList/RightArmBoard/StructVersion as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTARMBOARD_STRUCTVERSION = 196;

	/**
	 * Id of the sensor Device/DeviceList/RightArmBoard/Type as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTARMBOARD_TYPE = 197;

	/**
	 * Id of the sensor
	 * Device/DeviceList/RightArmBoard/currentCalibrationResultMotor1 as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTARMBOARD_CURRENTCALIBRATIONRESULTMOTOR1 = 198;

	/**
	 * Id of the sensor
	 * Device/DeviceList/RightArmBoard/currentCalibrationResultMotor2 as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTARMBOARD_CURRENTCALIBRATIONRESULTMOTOR2 = 199;

	/**
	 * Id of the sensor Device/DeviceList/RightFootBoard/Ack as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTFOOTBOARD_ACK = 200;

	/**
	 * Id of the sensor Device/DeviceList/RightFootBoard/Address as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTFOOTBOARD_ADDRESS = 201;

	/**
	 * Id of the sensor Device/DeviceList/RightFootBoard/Bid as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTFOOTBOARD_BID = 202;

	/**
	 * Id of the sensor Device/DeviceList/RightFootBoard/BoardId as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTFOOTBOARD_BOARDID = 203;

	/**
	 * Id of the sensor Device/DeviceList/RightFootBoard/BoardId2 as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTFOOTBOARD_BOARDID2 = 204;

	/**
	 * Id of the sensor Device/DeviceList/RightFootBoard/BootLoaderVersion as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTFOOTBOARD_BOOTLOADERVERSION = 205;

	/**
	 * Id of the sensor Device/DeviceList/RightFootBoard/Bus as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTFOOTBOARD_BUS = 206;

	/**
	 * Id of the sensor Device/DeviceList/RightFootBoard/Error as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTFOOTBOARD_ERROR = 207;

	/**
	 * Id of the sensor Device/DeviceList/RightFootBoard/Nack as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTFOOTBOARD_NACK = 208;

	/**
	 * Id of the sensor Device/DeviceList/RightFootBoard/ProgVersion as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTFOOTBOARD_PROGVERSION = 209;

	/**
	 * Id of the sensor Device/DeviceList/RightFootBoard/StructVersion as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTFOOTBOARD_STRUCTVERSION = 210;

	/**
	 * Id of the sensor Device/DeviceList/RightFootBoard/Type as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTFOOTBOARD_TYPE = 211;

	/**
	 * Id of the sensor
	 * Device/DeviceList/RightFootBoard/currentCalibrationResultMotor1 as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTFOOTBOARD_CURRENTCALIBRATIONRESULTMOTOR1 = 212;

	/**
	 * Id of the sensor
	 * Device/DeviceList/RightFootBoard/currentCalibrationResultMotor2 as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTFOOTBOARD_CURRENTCALIBRATIONRESULTMOTOR2 = 213;

	/**
	 * Id of the sensor Device/DeviceList/RightHandBoard/Ack as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTHANDBOARD_ACK = 214;

	/**
	 * Id of the sensor Device/DeviceList/RightHandBoard/Address as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTHANDBOARD_ADDRESS = 215;

	/**
	 * Id of the sensor Device/DeviceList/RightHandBoard/BoardId as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTHANDBOARD_BOARDID = 216;

	/**
	 * Id of the sensor Device/DeviceList/RightHandBoard/BoardId2 as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTHANDBOARD_BOARDID2 = 217;

	/**
	 * Id of the sensor Device/DeviceList/RightHandBoard/BootLoaderVersion as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTHANDBOARD_BOOTLOADERVERSION = 218;

	/**
	 * Id of the sensor Device/DeviceList/RightHandBoard/Bus as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTHANDBOARD_BUS = 219;

	/**
	 * Id of the sensor Device/DeviceList/RightHandBoard/Error as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTHANDBOARD_ERROR = 220;

	/**
	 * Id of the sensor Device/DeviceList/RightHandBoard/Nack as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTHANDBOARD_NACK = 221;

	/**
	 * Id of the sensor Device/DeviceList/RightHandBoard/ProgVersion as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTHANDBOARD_PROGVERSION = 222;

	/**
	 * Id of the sensor Device/DeviceList/RightHandBoard/StructVersion as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTHANDBOARD_STRUCTVERSION = 223;

	/**
	 * Id of the sensor Device/DeviceList/RightHandBoard/Type as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTHANDBOARD_TYPE = 224;

	/**
	 * Id of the sensor Device/DeviceList/RightHipBoard/Ack as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTHIPBOARD_ACK = 225;

	/**
	 * Id of the sensor Device/DeviceList/RightHipBoard/Address as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTHIPBOARD_ADDRESS = 226;

	/**
	 * Id of the sensor Device/DeviceList/RightHipBoard/Bid as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTHIPBOARD_BID = 227;

	/**
	 * Id of the sensor Device/DeviceList/RightHipBoard/BoardId as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTHIPBOARD_BOARDID = 228;

	/**
	 * Id of the sensor Device/DeviceList/RightHipBoard/BoardId2 as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTHIPBOARD_BOARDID2 = 229;

	/**
	 * Id of the sensor Device/DeviceList/RightHipBoard/BootLoaderVersion as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTHIPBOARD_BOOTLOADERVERSION = 230;

	/**
	 * Id of the sensor Device/DeviceList/RightHipBoard/Bus as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTHIPBOARD_BUS = 231;

	/**
	 * Id of the sensor Device/DeviceList/RightHipBoard/Error as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTHIPBOARD_ERROR = 232;

	/**
	 * Id of the sensor Device/DeviceList/RightHipBoard/Nack as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTHIPBOARD_NACK = 233;

	/**
	 * Id of the sensor Device/DeviceList/RightHipBoard/ProgVersion as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTHIPBOARD_PROGVERSION = 234;

	/**
	 * Id of the sensor Device/DeviceList/RightHipBoard/StructVersion as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTHIPBOARD_STRUCTVERSION = 235;

	/**
	 * Id of the sensor Device/DeviceList/RightHipBoard/Type as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTHIPBOARD_TYPE = 236;

	/**
	 * Id of the sensor
	 * Device/DeviceList/RightHipBoard/currentCalibrationResultMotor1 as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTHIPBOARD_CURRENTCALIBRATIONRESULTMOTOR1 = 237;

	/**
	 * Id of the sensor
	 * Device/DeviceList/RightHipBoard/currentCalibrationResultMotor2 as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTHIPBOARD_CURRENTCALIBRATIONRESULTMOTOR2 = 238;

	/**
	 * Id of the sensor Device/DeviceList/RightShinBoard/Ack as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTSHINBOARD_ACK = 239;

	/**
	 * Id of the sensor Device/DeviceList/RightShinBoard/Address as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTSHINBOARD_ADDRESS = 240;

	/**
	 * Id of the sensor Device/DeviceList/RightShinBoard/Bid as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTSHINBOARD_BID = 241;

	/**
	 * Id of the sensor Device/DeviceList/RightShinBoard/BoardId as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTSHINBOARD_BOARDID = 242;

	/**
	 * Id of the sensor Device/DeviceList/RightShinBoard/BoardId2 as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTSHINBOARD_BOARDID2 = 243;

	/**
	 * Id of the sensor Device/DeviceList/RightShinBoard/BootLoaderVersion as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTSHINBOARD_BOOTLOADERVERSION = 244;

	/**
	 * Id of the sensor Device/DeviceList/RightShinBoard/Bus as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTSHINBOARD_BUS = 245;

	/**
	 * Id of the sensor Device/DeviceList/RightShinBoard/Error as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTSHINBOARD_ERROR = 246;

	/**
	 * Id of the sensor Device/DeviceList/RightShinBoard/Nack as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTSHINBOARD_NACK = 247;

	/**
	 * Id of the sensor Device/DeviceList/RightShinBoard/ProgVersion as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTSHINBOARD_PROGVERSION = 248;

	/**
	 * Id of the sensor Device/DeviceList/RightShinBoard/StructVersion as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTSHINBOARD_STRUCTVERSION = 249;

	/**
	 * Id of the sensor Device/DeviceList/RightShinBoard/Type as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTSHINBOARD_TYPE = 250;

	/**
	 * Id of the sensor
	 * Device/DeviceList/RightShinBoard/currentCalibrationResultMotor1 as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTSHINBOARD_CURRENTCALIBRATIONRESULTMOTOR1 = 251;

	/**
	 * Id of the sensor
	 * Device/DeviceList/RightShinBoard/currentCalibrationResultMotor2 as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTSHINBOARD_CURRENTCALIBRATIONRESULTMOTOR2 = 252;

	/**
	 * Id of the sensor Device/DeviceList/RightShoulderBoard/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTSHOULDERBOARD_ACK = 253;

	/**
	 * Id of the sensor Device/DeviceList/RightShoulderBoard/Address as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTSHOULDERBOARD_ADDRESS = 254;

	/**
	 * Id of the sensor Device/DeviceList/RightShoulderBoard/Bid as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTSHOULDERBOARD_BID = 255;

	/**
	 * Id of the sensor Device/DeviceList/RightShoulderBoard/BoardId as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTSHOULDERBOARD_BOARDID = 256;

	/**
	 * Id of the sensor Device/DeviceList/RightShoulderBoard/BoardId2 as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTSHOULDERBOARD_BOARDID2 = 257;

	/**
	 * Id of the sensor Device/DeviceList/RightShoulderBoard/BootLoaderVersion
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTSHOULDERBOARD_BOOTLOADERVERSION = 258;

	/**
	 * Id of the sensor Device/DeviceList/RightShoulderBoard/Bus as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTSHOULDERBOARD_BUS = 259;

	/**
	 * Id of the sensor Device/DeviceList/RightShoulderBoard/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTSHOULDERBOARD_ERROR = 260;

	/**
	 * Id of the sensor Device/DeviceList/RightShoulderBoard/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTSHOULDERBOARD_NACK = 261;

	/**
	 * Id of the sensor Device/DeviceList/RightShoulderBoard/ProgVersion as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTSHOULDERBOARD_PROGVERSION = 262;

	/**
	 * Id of the sensor Device/DeviceList/RightShoulderBoard/StructVersion as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTSHOULDERBOARD_STRUCTVERSION = 263;

	/**
	 * Id of the sensor Device/DeviceList/RightShoulderBoard/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTSHOULDERBOARD_TYPE = 264;

	/**
	 * Id of the sensor
	 * Device/DeviceList/RightShoulderBoard/currentCalibrationResultMotor1 as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTSHOULDERBOARD_CURRENTCALIBRATIONRESULTMOTOR1 = 265;

	/**
	 * Id of the sensor
	 * Device/DeviceList/RightShoulderBoard/currentCalibrationResultMotor2 as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTSHOULDERBOARD_CURRENTCALIBRATIONRESULTMOTOR2 = 266;

	/**
	 * Id of the sensor Device/DeviceList/RightThighBoard/Ack as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTTHIGHBOARD_ACK = 267;

	/**
	 * Id of the sensor Device/DeviceList/RightThighBoard/Address as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTTHIGHBOARD_ADDRESS = 268;

	/**
	 * Id of the sensor Device/DeviceList/RightThighBoard/Bid as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTTHIGHBOARD_BID = 269;

	/**
	 * Id of the sensor Device/DeviceList/RightThighBoard/BoardId as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTTHIGHBOARD_BOARDID = 270;

	/**
	 * Id of the sensor Device/DeviceList/RightThighBoard/BoardId2 as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTTHIGHBOARD_BOARDID2 = 271;

	/**
	 * Id of the sensor Device/DeviceList/RightThighBoard/BootLoaderVersion as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTTHIGHBOARD_BOOTLOADERVERSION = 272;

	/**
	 * Id of the sensor Device/DeviceList/RightThighBoard/Bus as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTTHIGHBOARD_BUS = 273;

	/**
	 * Id of the sensor Device/DeviceList/RightThighBoard/Error as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTTHIGHBOARD_ERROR = 274;

	/**
	 * Id of the sensor Device/DeviceList/RightThighBoard/Nack as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTTHIGHBOARD_NACK = 275;

	/**
	 * Id of the sensor Device/DeviceList/RightThighBoard/ProgVersion as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTTHIGHBOARD_PROGVERSION = 276;

	/**
	 * Id of the sensor Device/DeviceList/RightThighBoard/StructVersion as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTTHIGHBOARD_STRUCTVERSION = 277;

	/**
	 * Id of the sensor Device/DeviceList/RightThighBoard/Type as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTTHIGHBOARD_TYPE = 278;

	/**
	 * Id of the sensor
	 * Device/DeviceList/RightThighBoard/currentCalibrationResultMotor1 as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTTHIGHBOARD_CURRENTCALIBRATIONRESULTMOTOR1 = 279;

	/**
	 * Id of the sensor
	 * Device/DeviceList/RightThighBoard/currentCalibrationResultMotor2 as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_RIGHTTHIGHBOARD_CURRENTCALIBRATIONRESULTMOTOR2 = 280;

	/**
	 * Id of the sensor Device/DeviceList/TouchBoard/Ack as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_TOUCHBOARD_ACK = 281;

	/**
	 * Id of the sensor Device/DeviceList/TouchBoard/Address as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_TOUCHBOARD_ADDRESS = 282;

	/**
	 * Id of the sensor Device/DeviceList/TouchBoard/BoardId as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_TOUCHBOARD_BOARDID = 283;

	/**
	 * Id of the sensor Device/DeviceList/TouchBoard/BoardId2 as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_TOUCHBOARD_BOARDID2 = 284;

	/**
	 * Id of the sensor Device/DeviceList/TouchBoard/BootLoaderVersion as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_TOUCHBOARD_BOOTLOADERVERSION = 285;

	/**
	 * Id of the sensor Device/DeviceList/TouchBoard/Bus as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_TOUCHBOARD_BUS = 286;

	/**
	 * Id of the sensor Device/DeviceList/TouchBoard/Error as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_TOUCHBOARD_ERROR = 287;

	/**
	 * Id of the sensor Device/DeviceList/TouchBoard/Nack as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_TOUCHBOARD_NACK = 288;

	/**
	 * Id of the sensor Device/DeviceList/TouchBoard/ProgVersion as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_TOUCHBOARD_PROGVERSION = 289;

	/**
	 * Id of the sensor Device/DeviceList/TouchBoard/StructVersion as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_TOUCHBOARD_STRUCTVERSION = 290;

	/**
	 * Id of the sensor Device/DeviceList/TouchBoard/Type as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_TOUCHBOARD_TYPE = 291;

	/**
	 * Id of the sensor Device/DeviceList/USBoard/Ack as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_USBOARD_ACK = 292;

	/**
	 * Id of the sensor Device/DeviceList/USBoard/Address as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_USBOARD_ADDRESS = 293;

	/**
	 * Id of the sensor Device/DeviceList/USBoard/Bus as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_USBOARD_BUS = 294;

	/**
	 * Id of the sensor Device/DeviceList/USBoard/Error as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_USBOARD_ERROR = 295;

	/**
	 * Id of the sensor Device/DeviceList/USBoard/Nack as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_USBOARD_NACK = 296;

	/**
	 * Id of the sensor Device/DeviceList/USBoard/ProgVersion as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_USBOARD_PROGVERSION = 297;

	/**
	 * Id of the sensor Device/DeviceList/USBoard/Type as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_DEVICELIST_USBOARD_TYPE = 298;

	/**
	 * Id of the sensor Device/SubDeviceList/Battery/Charge/Sensor/AccuLearn as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CHARGE_SENSOR_ACCULEARN = 299;

	/**
	 * Id of the sensor Device/SubDeviceList/Battery/Charge/Sensor/Ack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CHARGE_SENSOR_ACK = 300;

	/**
	 * Id of the sensor Device/SubDeviceList/Battery/Charge/Sensor/Age as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CHARGE_SENSOR_AGE = 301;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Battery/Charge/Sensor/BatteryVoltageAfterLearning as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CHARGE_SENSOR_BATTERYVOLTAGEAFTERLEARNING = 302;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Battery/Charge/Sensor/CellVoltageMax as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CHARGE_SENSOR_CELLVOLTAGEMAX = 303;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Battery/Charge/Sensor/CellVoltageMin as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CHARGE_SENSOR_CELLVOLTAGEMIN = 304;

	/**
	 * Id of the sensor Device/SubDeviceList/Battery/Charge/Sensor/Charge as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CHARGE_SENSOR_CHARGE = 305;

	/**
	 * Id of the sensor Device/SubDeviceList/Battery/Charge/Sensor/ChargeFETOn
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CHARGE_SENSOR_CHARGEFETON = 306;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Battery/Charge/Sensor/ChargeOverCurrentAlarm as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CHARGE_SENSOR_CHARGEOVERCURRENTALARM = 307;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Battery/Charge/Sensor/ChargeTemperatureAlarm as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CHARGE_SENSOR_CHARGETEMPERATUREALARM = 308;

	/**
	 * Id of the sensor Device/SubDeviceList/Battery/Charge/Sensor/
	 * CountOfCycleAfterLastLearning as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CHARGE_SENSOR_COUNTOFCYCLEAFTERLASTLEARNING = 309;

	/**
	 * Id of the sensor Device/SubDeviceList/Battery/Charge/Sensor/CycleCounts
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CHARGE_SENSOR_CYCLECOUNTS = 310;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Battery/Charge/Sensor/DelayForDischargeErrorReset as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CHARGE_SENSOR_DELAYFORDISCHARGEERRORRESET = 311;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Battery/Charge/Sensor/DesignCapacity as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CHARGE_SENSOR_DESIGNCAPACITY = 312;

	/**
	 * Id of the sensor Device/SubDeviceList/Battery/Charge/Sensor/DesignVoltage
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CHARGE_SENSOR_DESIGNVOLTAGE = 313;

	/**
	 * Id of the sensor Device/SubDeviceList/Battery/Charge/Sensor/Device as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CHARGE_SENSOR_DEVICE = 314;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Battery/Charge/Sensor/DischargeAlarm as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CHARGE_SENSOR_DISCHARGEALARM = 315;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Battery/Charge/Sensor/DischargeFETOn as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CHARGE_SENSOR_DISCHARGEFETON = 316;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Battery/Charge/Sensor/DischargeOverCurrentAlarm14A
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CHARGE_SENSOR_DISCHARGEOVERCURRENTALARM14A = 317;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Battery/Charge/Sensor/DischargeOverCurrentAlarm6A as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CHARGE_SENSOR_DISCHARGEOVERCURRENTALARM6A = 318;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Battery/Charge/Sensor/DischargeTemperatureAlarm as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CHARGE_SENSOR_DISCHARGETEMPERATUREALARM = 319;

	/**
	 * Id of the sensor Device/SubDeviceList/Battery/Charge/Sensor/Discharging
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CHARGE_SENSOR_DISCHARGING = 320;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Battery/Charge/Sensor/EndOffDischarge as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CHARGE_SENSOR_ENDOFFDISCHARGE = 321;

	/**
	 * Id of the sensor Device/SubDeviceList/Battery/Charge/Sensor/Error as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CHARGE_SENSOR_ERROR = 322;

	/**
	 * Id of the sensor Device/SubDeviceList/Battery/Charge/Sensor/FullCharge as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CHARGE_SENSOR_FULLCHARGE = 323;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Battery/Charge/Sensor/FullChargeCapacity as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CHARGE_SENSOR_FULLCHARGECAPACITY = 324;

	/**
	 * Id of the sensor Device/SubDeviceList/Battery/Charge/Sensor/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CHARGE_SENSOR_GAIN = 325;

	/**
	 * Id of the sensor Device/SubDeviceList/Battery/Charge/Sensor/Max as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CHARGE_SENSOR_MAX = 326;

	/**
	 * Id of the sensor Device/SubDeviceList/Battery/Charge/Sensor/Min as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CHARGE_SENSOR_MIN = 327;

	/**
	 * Id of the sensor Device/SubDeviceList/Battery/Charge/Sensor/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CHARGE_SENSOR_NACK = 328;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Battery/Charge/Sensor/NearEndOffDischarge as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CHARGE_SENSOR_NEARENDOFFDISCHARGE = 329;

	/**
	 * Id of the sensor Device/SubDeviceList/Battery/Charge/Sensor/Offset as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CHARGE_SENSOR_OFFSET = 330;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Battery/Charge/Sensor/OverChargeAlarm as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CHARGE_SENSOR_OVERCHARGEALARM = 331;

	/**
	 * Id of the sensor Device/SubDeviceList/Battery/Charge/Sensor/
	 * PowerSupplyForChargingPresent as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CHARGE_SENSOR_POWERSUPPLYFORCHARGINGPRESENT = 332;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Battery/Charge/Sensor/RemainingCapacity as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CHARGE_SENSOR_REMAININGCAPACITY = 333;

	/**
	 * Id of the sensor Device/SubDeviceList/Battery/Charge/Sensor/Status as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CHARGE_SENSOR_STATUS = 334;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Battery/Charge/Sensor/SubDeviceNumber as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CHARGE_SENSOR_SUBDEVICENUMBER = 335;

	/**
	 * Id of the sensor Device/SubDeviceList/Battery/Charge/Sensor/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CHARGE_SENSOR_TYPE = 336;

	/**
	 * Id of the sensor Device/SubDeviceList/Battery/Charge/Sensor/Value as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CHARGE_SENSOR_VALUE = 337;

	/**
	 * Id of the sensor Device/SubDeviceList/Battery/Current/Sensor/Ack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CURRENT_SENSOR_ACK = 338;

	/**
	 * Id of the sensor Device/SubDeviceList/Battery/Current/Sensor/Device as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CURRENT_SENSOR_DEVICE = 339;

	/**
	 * Id of the sensor Device/SubDeviceList/Battery/Current/Sensor/Error as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CURRENT_SENSOR_ERROR = 340;

	/**
	 * Id of the sensor Device/SubDeviceList/Battery/Current/Sensor/Gain as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CURRENT_SENSOR_GAIN = 341;

	/**
	 * Id of the sensor Device/SubDeviceList/Battery/Current/Sensor/Max as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CURRENT_SENSOR_MAX = 342;

	/**
	 * Id of the sensor Device/SubDeviceList/Battery/Current/Sensor/Min as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CURRENT_SENSOR_MIN = 343;

	/**
	 * Id of the sensor Device/SubDeviceList/Battery/Current/Sensor/Nack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CURRENT_SENSOR_NACK = 344;

	/**
	 * Id of the sensor Device/SubDeviceList/Battery/Current/Sensor/Offset as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CURRENT_SENSOR_OFFSET = 345;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Battery/Current/Sensor/SubDeviceNumber as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CURRENT_SENSOR_SUBDEVICENUMBER = 346;

	/**
	 * Id of the sensor Device/SubDeviceList/Battery/Current/Sensor/Type as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CURRENT_SENSOR_TYPE = 347;

	/**
	 * Id of the sensor Device/SubDeviceList/Battery/Current/Sensor/Value as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_CURRENT_SENSOR_VALUE = 348;

	/**
	 * Id of the sensor Device/SubDeviceList/Battery/Temperature/Sensor/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_TEMPERATURE_SENSOR_ACK = 349;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Battery/Temperature/Sensor/CellValue as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_TEMPERATURE_SENSOR_CELLVALUE = 350;

	/**
	 * Id of the sensor Device/SubDeviceList/Battery/Temperature/Sensor/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_TEMPERATURE_SENSOR_DEVICE = 351;

	/**
	 * Id of the sensor Device/SubDeviceList/Battery/Temperature/Sensor/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_TEMPERATURE_SENSOR_ERROR = 352;

	/**
	 * Id of the sensor Device/SubDeviceList/Battery/Temperature/Sensor/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_TEMPERATURE_SENSOR_GAIN = 353;

	/**
	 * Id of the sensor Device/SubDeviceList/Battery/Temperature/Sensor/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_TEMPERATURE_SENSOR_MAX = 354;

	/**
	 * Id of the sensor Device/SubDeviceList/Battery/Temperature/Sensor/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_TEMPERATURE_SENSOR_MIN = 355;

	/**
	 * Id of the sensor Device/SubDeviceList/Battery/Temperature/Sensor/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_TEMPERATURE_SENSOR_NACK = 356;

	/**
	 * Id of the sensor Device/SubDeviceList/Battery/Temperature/Sensor/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_TEMPERATURE_SENSOR_OFFSET = 357;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Battery/Temperature/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_TEMPERATURE_SENSOR_SUBDEVICENUMBER = 358;

	/**
	 * Id of the sensor Device/SubDeviceList/Battery/Temperature/Sensor/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_TEMPERATURE_SENSOR_TYPE = 359;

	/**
	 * Id of the sensor Device/SubDeviceList/Battery/Temperature/Sensor/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_BATTERY_TEMPERATURE_SENSOR_VALUE = 360;

	/**
	 * Id of the sensor Device/SubDeviceList/ChestBoard/Button/Sensor/Ack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_BUTTON_SENSOR_ACK = 361;

	/**
	 * Id of the sensor Device/SubDeviceList/ChestBoard/Button/Sensor/Device as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_BUTTON_SENSOR_DEVICE = 362;

	/**
	 * Id of the sensor Device/SubDeviceList/ChestBoard/Button/Sensor/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_BUTTON_SENSOR_ERROR = 363;

	/**
	 * Id of the sensor Device/SubDeviceList/ChestBoard/Button/Sensor/Gain as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_BUTTON_SENSOR_GAIN = 364;

	/**
	 * Id of the sensor Device/SubDeviceList/ChestBoard/Button/Sensor/Max as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_BUTTON_SENSOR_MAX = 365;

	/**
	 * Id of the sensor Device/SubDeviceList/ChestBoard/Button/Sensor/Min as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_BUTTON_SENSOR_MIN = 366;

	/**
	 * Id of the sensor Device/SubDeviceList/ChestBoard/Button/Sensor/Nack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_BUTTON_SENSOR_NACK = 367;

	/**
	 * Id of the sensor Device/SubDeviceList/ChestBoard/Button/Sensor/Offset as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_BUTTON_SENSOR_OFFSET = 368;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/ChestBoard/Button/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_BUTTON_SENSOR_SUBDEVICENUMBER = 369;

	/**
	 * Id of the sensor Device/SubDeviceList/ChestBoard/Button/Sensor/Type as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_BUTTON_SENSOR_TYPE = 370;

	/**
	 * Id of the sensor Device/SubDeviceList/ChestBoard/Button/Sensor/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_BUTTON_SENSOR_VALUE = 371;

	/**
	 * Id of the sensor Device/SubDeviceList/ChestBoard/Led/Blue/Actuator/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_LED_BLUE_ACTUATOR_ACK = 372;

	/**
	 * Id of the sensor Device/SubDeviceList/ChestBoard/Led/Blue/Actuator/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_LED_BLUE_ACTUATOR_DEVICE = 373;

	/**
	 * Id of the sensor Device/SubDeviceList/ChestBoard/Led/Blue/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_LED_BLUE_ACTUATOR_ERROR = 374;

	/**
	 * Id of the sensor Device/SubDeviceList/ChestBoard/Led/Blue/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_LED_BLUE_ACTUATOR_GAIN = 375;

	/**
	 * Id of the sensor Device/SubDeviceList/ChestBoard/Led/Blue/Actuator/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_LED_BLUE_ACTUATOR_MAX = 376;

	/**
	 * Id of the sensor Device/SubDeviceList/ChestBoard/Led/Blue/Actuator/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_LED_BLUE_ACTUATOR_MIN = 377;

	/**
	 * Id of the sensor Device/SubDeviceList/ChestBoard/Led/Blue/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_LED_BLUE_ACTUATOR_NACK = 378;

	/**
	 * Id of the sensor Device/SubDeviceList/ChestBoard/Led/Blue/Actuator/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_LED_BLUE_ACTUATOR_OFFSET = 379;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/ChestBoard/Led/Blue/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_LED_BLUE_ACTUATOR_SUBDEVICENUMBER = 380;

	/**
	 * Id of the sensor Device/SubDeviceList/ChestBoard/Led/Blue/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_LED_BLUE_ACTUATOR_TYPE = 381;

	/**
	 * Id of the sensor Device/SubDeviceList/ChestBoard/Led/Blue/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_LED_BLUE_ACTUATOR_VALUE = 382;

	/**
	 * Id of the sensor Device/SubDeviceList/ChestBoard/Led/Green/Actuator/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_LED_GREEN_ACTUATOR_ACK = 383;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/ChestBoard/Led/Green/Actuator/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_LED_GREEN_ACTUATOR_DEVICE = 384;

	/**
	 * Id of the sensor Device/SubDeviceList/ChestBoard/Led/Green/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_LED_GREEN_ACTUATOR_ERROR = 385;

	/**
	 * Id of the sensor Device/SubDeviceList/ChestBoard/Led/Green/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_LED_GREEN_ACTUATOR_GAIN = 386;

	/**
	 * Id of the sensor Device/SubDeviceList/ChestBoard/Led/Green/Actuator/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_LED_GREEN_ACTUATOR_MAX = 387;

	/**
	 * Id of the sensor Device/SubDeviceList/ChestBoard/Led/Green/Actuator/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_LED_GREEN_ACTUATOR_MIN = 388;

	/**
	 * Id of the sensor Device/SubDeviceList/ChestBoard/Led/Green/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_LED_GREEN_ACTUATOR_NACK = 389;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/ChestBoard/Led/Green/Actuator/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_LED_GREEN_ACTUATOR_OFFSET = 390;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/ChestBoard/Led/Green/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_LED_GREEN_ACTUATOR_SUBDEVICENUMBER = 391;

	/**
	 * Id of the sensor Device/SubDeviceList/ChestBoard/Led/Green/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_LED_GREEN_ACTUATOR_TYPE = 392;

	/**
	 * Id of the sensor Device/SubDeviceList/ChestBoard/Led/Green/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_LED_GREEN_ACTUATOR_VALUE = 393;

	/**
	 * Id of the sensor Device/SubDeviceList/ChestBoard/Led/Red/Actuator/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_LED_RED_ACTUATOR_ACK = 394;

	/**
	 * Id of the sensor Device/SubDeviceList/ChestBoard/Led/Red/Actuator/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_LED_RED_ACTUATOR_DEVICE = 395;

	/**
	 * Id of the sensor Device/SubDeviceList/ChestBoard/Led/Red/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_LED_RED_ACTUATOR_ERROR = 396;

	/**
	 * Id of the sensor Device/SubDeviceList/ChestBoard/Led/Red/Actuator/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_LED_RED_ACTUATOR_GAIN = 397;

	/**
	 * Id of the sensor Device/SubDeviceList/ChestBoard/Led/Red/Actuator/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_LED_RED_ACTUATOR_MAX = 398;

	/**
	 * Id of the sensor Device/SubDeviceList/ChestBoard/Led/Red/Actuator/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_LED_RED_ACTUATOR_MIN = 399;

	/**
	 * Id of the sensor Device/SubDeviceList/ChestBoard/Led/Red/Actuator/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_LED_RED_ACTUATOR_NACK = 400;

	/**
	 * Id of the sensor Device/SubDeviceList/ChestBoard/Led/Red/Actuator/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_LED_RED_ACTUATOR_OFFSET = 401;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/ChestBoard/Led/Red/Actuator/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_LED_RED_ACTUATOR_SUBDEVICENUMBER = 402;

	/**
	 * Id of the sensor Device/SubDeviceList/ChestBoard/Led/Red/Actuator/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_LED_RED_ACTUATOR_TYPE = 403;

	/**
	 * Id of the sensor Device/SubDeviceList/ChestBoard/Led/Red/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_CHESTBOARD_LED_RED_ACTUATOR_VALUE = 404;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/0Deg/Actuator/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_0DEG_ACTUATOR_ACK = 405;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/0Deg/Actuator/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_0DEG_ACTUATOR_DEVICE = 406;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/0Deg/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_0DEG_ACTUATOR_ERROR = 407;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/0Deg/Actuator/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_0DEG_ACTUATOR_GAIN = 408;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/0Deg/Actuator/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_0DEG_ACTUATOR_MAX = 409;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/0Deg/Actuator/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_0DEG_ACTUATOR_MIN = 410;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/0Deg/Actuator/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_0DEG_ACTUATOR_NACK = 411;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/0Deg/Actuator/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_0DEG_ACTUATOR_OFFSET = 412;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Left/0Deg/Actuator/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_0DEG_ACTUATOR_SUBDEVICENUMBER = 413;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/0Deg/Actuator/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_0DEG_ACTUATOR_TYPE = 414;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/0Deg/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_0DEG_ACTUATOR_VALUE = 415;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/108Deg/Actuator/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_108DEG_ACTUATOR_ACK = 416;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Left/108Deg/Actuator/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_108DEG_ACTUATOR_DEVICE = 417;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/108Deg/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_108DEG_ACTUATOR_ERROR = 418;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/108Deg/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_108DEG_ACTUATOR_GAIN = 419;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/108Deg/Actuator/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_108DEG_ACTUATOR_MAX = 420;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/108Deg/Actuator/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_108DEG_ACTUATOR_MIN = 421;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/108Deg/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_108DEG_ACTUATOR_NACK = 422;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Left/108Deg/Actuator/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_108DEG_ACTUATOR_OFFSET = 423;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Left/108Deg/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_108DEG_ACTUATOR_SUBDEVICENUMBER = 424;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/108Deg/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_108DEG_ACTUATOR_TYPE = 425;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/108Deg/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_108DEG_ACTUATOR_VALUE = 426;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/144Deg/Actuator/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_144DEG_ACTUATOR_ACK = 427;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Left/144Deg/Actuator/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_144DEG_ACTUATOR_DEVICE = 428;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/144Deg/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_144DEG_ACTUATOR_ERROR = 429;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/144Deg/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_144DEG_ACTUATOR_GAIN = 430;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/144Deg/Actuator/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_144DEG_ACTUATOR_MAX = 431;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/144Deg/Actuator/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_144DEG_ACTUATOR_MIN = 432;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/144Deg/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_144DEG_ACTUATOR_NACK = 433;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Left/144Deg/Actuator/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_144DEG_ACTUATOR_OFFSET = 434;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Left/144Deg/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_144DEG_ACTUATOR_SUBDEVICENUMBER = 435;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/144Deg/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_144DEG_ACTUATOR_TYPE = 436;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/144Deg/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_144DEG_ACTUATOR_VALUE = 437;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/180Deg/Actuator/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_180DEG_ACTUATOR_ACK = 438;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Left/180Deg/Actuator/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_180DEG_ACTUATOR_DEVICE = 439;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/180Deg/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_180DEG_ACTUATOR_ERROR = 440;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/180Deg/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_180DEG_ACTUATOR_GAIN = 441;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/180Deg/Actuator/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_180DEG_ACTUATOR_MAX = 442;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/180Deg/Actuator/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_180DEG_ACTUATOR_MIN = 443;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/180Deg/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_180DEG_ACTUATOR_NACK = 444;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Left/180Deg/Actuator/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_180DEG_ACTUATOR_OFFSET = 445;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Left/180Deg/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_180DEG_ACTUATOR_SUBDEVICENUMBER = 446;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/180Deg/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_180DEG_ACTUATOR_TYPE = 447;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/180Deg/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_180DEG_ACTUATOR_VALUE = 448;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/216Deg/Actuator/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_216DEG_ACTUATOR_ACK = 449;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Left/216Deg/Actuator/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_216DEG_ACTUATOR_DEVICE = 450;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/216Deg/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_216DEG_ACTUATOR_ERROR = 451;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/216Deg/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_216DEG_ACTUATOR_GAIN = 452;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/216Deg/Actuator/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_216DEG_ACTUATOR_MAX = 453;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/216Deg/Actuator/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_216DEG_ACTUATOR_MIN = 454;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/216Deg/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_216DEG_ACTUATOR_NACK = 455;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Left/216Deg/Actuator/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_216DEG_ACTUATOR_OFFSET = 456;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Left/216Deg/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_216DEG_ACTUATOR_SUBDEVICENUMBER = 457;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/216Deg/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_216DEG_ACTUATOR_TYPE = 458;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/216Deg/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_216DEG_ACTUATOR_VALUE = 459;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/252Deg/Actuator/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_252DEG_ACTUATOR_ACK = 460;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Left/252Deg/Actuator/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_252DEG_ACTUATOR_DEVICE = 461;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/252Deg/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_252DEG_ACTUATOR_ERROR = 462;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/252Deg/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_252DEG_ACTUATOR_GAIN = 463;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/252Deg/Actuator/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_252DEG_ACTUATOR_MAX = 464;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/252Deg/Actuator/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_252DEG_ACTUATOR_MIN = 465;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/252Deg/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_252DEG_ACTUATOR_NACK = 466;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Left/252Deg/Actuator/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_252DEG_ACTUATOR_OFFSET = 467;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Left/252Deg/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_252DEG_ACTUATOR_SUBDEVICENUMBER = 468;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/252Deg/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_252DEG_ACTUATOR_TYPE = 469;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/252Deg/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_252DEG_ACTUATOR_VALUE = 470;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/288Deg/Actuator/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_288DEG_ACTUATOR_ACK = 471;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Left/288Deg/Actuator/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_288DEG_ACTUATOR_DEVICE = 472;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/288Deg/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_288DEG_ACTUATOR_ERROR = 473;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/288Deg/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_288DEG_ACTUATOR_GAIN = 474;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/288Deg/Actuator/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_288DEG_ACTUATOR_MAX = 475;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/288Deg/Actuator/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_288DEG_ACTUATOR_MIN = 476;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/288Deg/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_288DEG_ACTUATOR_NACK = 477;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Left/288Deg/Actuator/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_288DEG_ACTUATOR_OFFSET = 478;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Left/288Deg/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_288DEG_ACTUATOR_SUBDEVICENUMBER = 479;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/288Deg/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_288DEG_ACTUATOR_TYPE = 480;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/288Deg/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_288DEG_ACTUATOR_VALUE = 481;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/324Deg/Actuator/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_324DEG_ACTUATOR_ACK = 482;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Left/324Deg/Actuator/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_324DEG_ACTUATOR_DEVICE = 483;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/324Deg/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_324DEG_ACTUATOR_ERROR = 484;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/324Deg/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_324DEG_ACTUATOR_GAIN = 485;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/324Deg/Actuator/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_324DEG_ACTUATOR_MAX = 486;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/324Deg/Actuator/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_324DEG_ACTUATOR_MIN = 487;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/324Deg/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_324DEG_ACTUATOR_NACK = 488;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Left/324Deg/Actuator/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_324DEG_ACTUATOR_OFFSET = 489;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Left/324Deg/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_324DEG_ACTUATOR_SUBDEVICENUMBER = 490;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/324Deg/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_324DEG_ACTUATOR_TYPE = 491;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/324Deg/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_324DEG_ACTUATOR_VALUE = 492;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/36Deg/Actuator/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_36DEG_ACTUATOR_ACK = 493;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/36Deg/Actuator/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_36DEG_ACTUATOR_DEVICE = 494;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/36Deg/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_36DEG_ACTUATOR_ERROR = 495;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/36Deg/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_36DEG_ACTUATOR_GAIN = 496;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/36Deg/Actuator/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_36DEG_ACTUATOR_MAX = 497;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/36Deg/Actuator/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_36DEG_ACTUATOR_MIN = 498;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/36Deg/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_36DEG_ACTUATOR_NACK = 499;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/36Deg/Actuator/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_36DEG_ACTUATOR_OFFSET = 500;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Left/36Deg/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_36DEG_ACTUATOR_SUBDEVICENUMBER = 501;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/36Deg/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_36DEG_ACTUATOR_TYPE = 502;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/36Deg/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_36DEG_ACTUATOR_VALUE = 503;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/72Deg/Actuator/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_72DEG_ACTUATOR_ACK = 504;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/72Deg/Actuator/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_72DEG_ACTUATOR_DEVICE = 505;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/72Deg/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_72DEG_ACTUATOR_ERROR = 506;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/72Deg/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_72DEG_ACTUATOR_GAIN = 507;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/72Deg/Actuator/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_72DEG_ACTUATOR_MAX = 508;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/72Deg/Actuator/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_72DEG_ACTUATOR_MIN = 509;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/72Deg/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_72DEG_ACTUATOR_NACK = 510;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/72Deg/Actuator/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_72DEG_ACTUATOR_OFFSET = 511;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Left/72Deg/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_72DEG_ACTUATOR_SUBDEVICENUMBER = 512;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/72Deg/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_72DEG_ACTUATOR_TYPE = 513;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Left/72Deg/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_LEFT_72DEG_ACTUATOR_VALUE = 514;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/0Deg/Actuator/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_0DEG_ACTUATOR_ACK = 515;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/0Deg/Actuator/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_0DEG_ACTUATOR_DEVICE = 516;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/0Deg/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_0DEG_ACTUATOR_ERROR = 517;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/0Deg/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_0DEG_ACTUATOR_GAIN = 518;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/0Deg/Actuator/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_0DEG_ACTUATOR_MAX = 519;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/0Deg/Actuator/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_0DEG_ACTUATOR_MIN = 520;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/0Deg/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_0DEG_ACTUATOR_NACK = 521;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/0Deg/Actuator/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_0DEG_ACTUATOR_OFFSET = 522;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Right/0Deg/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_0DEG_ACTUATOR_SUBDEVICENUMBER = 523;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/0Deg/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_0DEG_ACTUATOR_TYPE = 524;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/0Deg/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_0DEG_ACTUATOR_VALUE = 525;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/108Deg/Actuator/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_108DEG_ACTUATOR_ACK = 526;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Right/108Deg/Actuator/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_108DEG_ACTUATOR_DEVICE = 527;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Right/108Deg/Actuator/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_108DEG_ACTUATOR_ERROR = 528;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/108Deg/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_108DEG_ACTUATOR_GAIN = 529;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/108Deg/Actuator/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_108DEG_ACTUATOR_MAX = 530;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/108Deg/Actuator/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_108DEG_ACTUATOR_MIN = 531;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/108Deg/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_108DEG_ACTUATOR_NACK = 532;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Right/108Deg/Actuator/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_108DEG_ACTUATOR_OFFSET = 533;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Right/108Deg/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_108DEG_ACTUATOR_SUBDEVICENUMBER = 534;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/108Deg/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_108DEG_ACTUATOR_TYPE = 535;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Right/108Deg/Actuator/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_108DEG_ACTUATOR_VALUE = 536;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/144Deg/Actuator/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_144DEG_ACTUATOR_ACK = 537;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Right/144Deg/Actuator/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_144DEG_ACTUATOR_DEVICE = 538;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Right/144Deg/Actuator/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_144DEG_ACTUATOR_ERROR = 539;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/144Deg/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_144DEG_ACTUATOR_GAIN = 540;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/144Deg/Actuator/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_144DEG_ACTUATOR_MAX = 541;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/144Deg/Actuator/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_144DEG_ACTUATOR_MIN = 542;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/144Deg/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_144DEG_ACTUATOR_NACK = 543;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Right/144Deg/Actuator/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_144DEG_ACTUATOR_OFFSET = 544;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Right/144Deg/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_144DEG_ACTUATOR_SUBDEVICENUMBER = 545;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/144Deg/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_144DEG_ACTUATOR_TYPE = 546;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Right/144Deg/Actuator/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_144DEG_ACTUATOR_VALUE = 547;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/180Deg/Actuator/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_180DEG_ACTUATOR_ACK = 548;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Right/180Deg/Actuator/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_180DEG_ACTUATOR_DEVICE = 549;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Right/180Deg/Actuator/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_180DEG_ACTUATOR_ERROR = 550;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/180Deg/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_180DEG_ACTUATOR_GAIN = 551;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/180Deg/Actuator/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_180DEG_ACTUATOR_MAX = 552;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/180Deg/Actuator/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_180DEG_ACTUATOR_MIN = 553;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/180Deg/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_180DEG_ACTUATOR_NACK = 554;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Right/180Deg/Actuator/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_180DEG_ACTUATOR_OFFSET = 555;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Right/180Deg/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_180DEG_ACTUATOR_SUBDEVICENUMBER = 556;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/180Deg/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_180DEG_ACTUATOR_TYPE = 557;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Right/180Deg/Actuator/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_180DEG_ACTUATOR_VALUE = 558;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/216Deg/Actuator/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_216DEG_ACTUATOR_ACK = 559;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Right/216Deg/Actuator/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_216DEG_ACTUATOR_DEVICE = 560;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Right/216Deg/Actuator/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_216DEG_ACTUATOR_ERROR = 561;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/216Deg/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_216DEG_ACTUATOR_GAIN = 562;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/216Deg/Actuator/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_216DEG_ACTUATOR_MAX = 563;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/216Deg/Actuator/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_216DEG_ACTUATOR_MIN = 564;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/216Deg/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_216DEG_ACTUATOR_NACK = 565;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Right/216Deg/Actuator/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_216DEG_ACTUATOR_OFFSET = 566;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Right/216Deg/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_216DEG_ACTUATOR_SUBDEVICENUMBER = 567;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/216Deg/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_216DEG_ACTUATOR_TYPE = 568;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Right/216Deg/Actuator/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_216DEG_ACTUATOR_VALUE = 569;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/252Deg/Actuator/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_252DEG_ACTUATOR_ACK = 570;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Right/252Deg/Actuator/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_252DEG_ACTUATOR_DEVICE = 571;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Right/252Deg/Actuator/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_252DEG_ACTUATOR_ERROR = 572;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/252Deg/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_252DEG_ACTUATOR_GAIN = 573;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/252Deg/Actuator/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_252DEG_ACTUATOR_MAX = 574;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/252Deg/Actuator/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_252DEG_ACTUATOR_MIN = 575;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/252Deg/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_252DEG_ACTUATOR_NACK = 576;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Right/252Deg/Actuator/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_252DEG_ACTUATOR_OFFSET = 577;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Right/252Deg/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_252DEG_ACTUATOR_SUBDEVICENUMBER = 578;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/252Deg/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_252DEG_ACTUATOR_TYPE = 579;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Right/252Deg/Actuator/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_252DEG_ACTUATOR_VALUE = 580;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/288Deg/Actuator/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_288DEG_ACTUATOR_ACK = 581;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Right/288Deg/Actuator/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_288DEG_ACTUATOR_DEVICE = 582;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Right/288Deg/Actuator/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_288DEG_ACTUATOR_ERROR = 583;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/288Deg/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_288DEG_ACTUATOR_GAIN = 584;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/288Deg/Actuator/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_288DEG_ACTUATOR_MAX = 585;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/288Deg/Actuator/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_288DEG_ACTUATOR_MIN = 586;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/288Deg/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_288DEG_ACTUATOR_NACK = 587;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Right/288Deg/Actuator/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_288DEG_ACTUATOR_OFFSET = 588;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Right/288Deg/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_288DEG_ACTUATOR_SUBDEVICENUMBER = 589;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/288Deg/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_288DEG_ACTUATOR_TYPE = 590;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Right/288Deg/Actuator/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_288DEG_ACTUATOR_VALUE = 591;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/324Deg/Actuator/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_324DEG_ACTUATOR_ACK = 592;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Right/324Deg/Actuator/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_324DEG_ACTUATOR_DEVICE = 593;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Right/324Deg/Actuator/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_324DEG_ACTUATOR_ERROR = 594;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/324Deg/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_324DEG_ACTUATOR_GAIN = 595;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/324Deg/Actuator/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_324DEG_ACTUATOR_MAX = 596;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/324Deg/Actuator/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_324DEG_ACTUATOR_MIN = 597;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/324Deg/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_324DEG_ACTUATOR_NACK = 598;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Right/324Deg/Actuator/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_324DEG_ACTUATOR_OFFSET = 599;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Right/324Deg/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_324DEG_ACTUATOR_SUBDEVICENUMBER = 600;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/324Deg/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_324DEG_ACTUATOR_TYPE = 601;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Right/324Deg/Actuator/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_324DEG_ACTUATOR_VALUE = 602;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/36Deg/Actuator/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_36DEG_ACTUATOR_ACK = 603;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Right/36Deg/Actuator/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_36DEG_ACTUATOR_DEVICE = 604;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/36Deg/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_36DEG_ACTUATOR_ERROR = 605;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/36Deg/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_36DEG_ACTUATOR_GAIN = 606;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/36Deg/Actuator/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_36DEG_ACTUATOR_MAX = 607;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/36Deg/Actuator/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_36DEG_ACTUATOR_MIN = 608;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/36Deg/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_36DEG_ACTUATOR_NACK = 609;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Right/36Deg/Actuator/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_36DEG_ACTUATOR_OFFSET = 610;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Right/36Deg/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_36DEG_ACTUATOR_SUBDEVICENUMBER = 611;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/36Deg/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_36DEG_ACTUATOR_TYPE = 612;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/36Deg/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_36DEG_ACTUATOR_VALUE = 613;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/72Deg/Actuator/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_72DEG_ACTUATOR_ACK = 614;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Right/72Deg/Actuator/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_72DEG_ACTUATOR_DEVICE = 615;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/72Deg/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_72DEG_ACTUATOR_ERROR = 616;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/72Deg/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_72DEG_ACTUATOR_GAIN = 617;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/72Deg/Actuator/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_72DEG_ACTUATOR_MAX = 618;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/72Deg/Actuator/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_72DEG_ACTUATOR_MIN = 619;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/72Deg/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_72DEG_ACTUATOR_NACK = 620;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Right/72Deg/Actuator/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_72DEG_ACTUATOR_OFFSET = 621;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Ears/Led/Right/72Deg/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_72DEG_ACTUATOR_SUBDEVICENUMBER = 622;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/72Deg/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_72DEG_ACTUATOR_TYPE = 623;

	/**
	 * Id of the sensor Device/SubDeviceList/Ears/Led/Right/72Deg/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_EARS_LED_RIGHT_72DEG_ACTUATOR_VALUE = 624;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/0Deg/Actuator/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_0DEG_ACTUATOR_ACK = 625;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/0Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_0DEG_ACTUATOR_DEVICE = 626;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/0Deg/Actuator/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_0DEG_ACTUATOR_ERROR = 627;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/0Deg/Actuator/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_0DEG_ACTUATOR_GAIN = 628;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/0Deg/Actuator/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_0DEG_ACTUATOR_MAX = 629;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/0Deg/Actuator/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_0DEG_ACTUATOR_MIN = 630;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/0Deg/Actuator/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_0DEG_ACTUATOR_NACK = 631;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/0Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_0DEG_ACTUATOR_OFFSET = 632;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/0Deg/Actuator/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_0DEG_ACTUATOR_SUBDEVICENUMBER = 633;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/0Deg/Actuator/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_0DEG_ACTUATOR_TYPE = 634;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/0Deg/Actuator/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_0DEG_ACTUATOR_VALUE = 635;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/135Deg/Actuator/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_135DEG_ACTUATOR_ACK = 636;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/135Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_135DEG_ACTUATOR_DEVICE = 637;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/135Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_135DEG_ACTUATOR_ERROR = 638;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/135Deg/Actuator/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_135DEG_ACTUATOR_GAIN = 639;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/135Deg/Actuator/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_135DEG_ACTUATOR_MAX = 640;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/135Deg/Actuator/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_135DEG_ACTUATOR_MIN = 641;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/135Deg/Actuator/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_135DEG_ACTUATOR_NACK = 642;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/135Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_135DEG_ACTUATOR_OFFSET = 643;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/135Deg/Actuator/SubDeviceNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_135DEG_ACTUATOR_SUBDEVICENUMBER = 644;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/135Deg/Actuator/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_135DEG_ACTUATOR_TYPE = 645;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/135Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_135DEG_ACTUATOR_VALUE = 646;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/180Deg/Actuator/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_180DEG_ACTUATOR_ACK = 647;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/180Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_180DEG_ACTUATOR_DEVICE = 648;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/180Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_180DEG_ACTUATOR_ERROR = 649;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/180Deg/Actuator/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_180DEG_ACTUATOR_GAIN = 650;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/180Deg/Actuator/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_180DEG_ACTUATOR_MAX = 651;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/180Deg/Actuator/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_180DEG_ACTUATOR_MIN = 652;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/180Deg/Actuator/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_180DEG_ACTUATOR_NACK = 653;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/180Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_180DEG_ACTUATOR_OFFSET = 654;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/180Deg/Actuator/SubDeviceNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_180DEG_ACTUATOR_SUBDEVICENUMBER = 655;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/180Deg/Actuator/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_180DEG_ACTUATOR_TYPE = 656;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/180Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_180DEG_ACTUATOR_VALUE = 657;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/225Deg/Actuator/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_225DEG_ACTUATOR_ACK = 658;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/225Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_225DEG_ACTUATOR_DEVICE = 659;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/225Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_225DEG_ACTUATOR_ERROR = 660;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/225Deg/Actuator/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_225DEG_ACTUATOR_GAIN = 661;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/225Deg/Actuator/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_225DEG_ACTUATOR_MAX = 662;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/225Deg/Actuator/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_225DEG_ACTUATOR_MIN = 663;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/225Deg/Actuator/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_225DEG_ACTUATOR_NACK = 664;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/225Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_225DEG_ACTUATOR_OFFSET = 665;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/225Deg/Actuator/SubDeviceNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_225DEG_ACTUATOR_SUBDEVICENUMBER = 666;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/225Deg/Actuator/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_225DEG_ACTUATOR_TYPE = 667;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/225Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_225DEG_ACTUATOR_VALUE = 668;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/270Deg/Actuator/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_270DEG_ACTUATOR_ACK = 669;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/270Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_270DEG_ACTUATOR_DEVICE = 670;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/270Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_270DEG_ACTUATOR_ERROR = 671;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/270Deg/Actuator/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_270DEG_ACTUATOR_GAIN = 672;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/270Deg/Actuator/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_270DEG_ACTUATOR_MAX = 673;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/270Deg/Actuator/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_270DEG_ACTUATOR_MIN = 674;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/270Deg/Actuator/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_270DEG_ACTUATOR_NACK = 675;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/270Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_270DEG_ACTUATOR_OFFSET = 676;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/270Deg/Actuator/SubDeviceNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_270DEG_ACTUATOR_SUBDEVICENUMBER = 677;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/270Deg/Actuator/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_270DEG_ACTUATOR_TYPE = 678;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/270Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_270DEG_ACTUATOR_VALUE = 679;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/315Deg/Actuator/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_315DEG_ACTUATOR_ACK = 680;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/315Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_315DEG_ACTUATOR_DEVICE = 681;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/315Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_315DEG_ACTUATOR_ERROR = 682;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/315Deg/Actuator/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_315DEG_ACTUATOR_GAIN = 683;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/315Deg/Actuator/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_315DEG_ACTUATOR_MAX = 684;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/315Deg/Actuator/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_315DEG_ACTUATOR_MIN = 685;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/315Deg/Actuator/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_315DEG_ACTUATOR_NACK = 686;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/315Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_315DEG_ACTUATOR_OFFSET = 687;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/315Deg/Actuator/SubDeviceNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_315DEG_ACTUATOR_SUBDEVICENUMBER = 688;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/315Deg/Actuator/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_315DEG_ACTUATOR_TYPE = 689;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/315Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_315DEG_ACTUATOR_VALUE = 690;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/45Deg/Actuator/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_45DEG_ACTUATOR_ACK = 691;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/45Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_45DEG_ACTUATOR_DEVICE = 692;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/45Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_45DEG_ACTUATOR_ERROR = 693;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/45Deg/Actuator/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_45DEG_ACTUATOR_GAIN = 694;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/45Deg/Actuator/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_45DEG_ACTUATOR_MAX = 695;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/45Deg/Actuator/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_45DEG_ACTUATOR_MIN = 696;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/45Deg/Actuator/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_45DEG_ACTUATOR_NACK = 697;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/45Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_45DEG_ACTUATOR_OFFSET = 698;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/45Deg/Actuator/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_45DEG_ACTUATOR_SUBDEVICENUMBER = 699;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/45Deg/Actuator/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_45DEG_ACTUATOR_TYPE = 700;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/45Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_45DEG_ACTUATOR_VALUE = 701;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/90Deg/Actuator/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_90DEG_ACTUATOR_ACK = 702;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/90Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_90DEG_ACTUATOR_DEVICE = 703;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/90Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_90DEG_ACTUATOR_ERROR = 704;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/90Deg/Actuator/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_90DEG_ACTUATOR_GAIN = 705;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/90Deg/Actuator/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_90DEG_ACTUATOR_MAX = 706;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/90Deg/Actuator/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_90DEG_ACTUATOR_MIN = 707;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/90Deg/Actuator/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_90DEG_ACTUATOR_NACK = 708;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/90Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_90DEG_ACTUATOR_OFFSET = 709;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/90Deg/Actuator/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_90DEG_ACTUATOR_SUBDEVICENUMBER = 710;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/90Deg/Actuator/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_90DEG_ACTUATOR_TYPE = 711;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Left/90Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_LEFT_90DEG_ACTUATOR_VALUE = 712;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/0Deg/Actuator/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_0DEG_ACTUATOR_ACK = 713;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/0Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_0DEG_ACTUATOR_DEVICE = 714;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/0Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_0DEG_ACTUATOR_ERROR = 715;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/0Deg/Actuator/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_0DEG_ACTUATOR_GAIN = 716;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/0Deg/Actuator/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_0DEG_ACTUATOR_MAX = 717;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/0Deg/Actuator/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_0DEG_ACTUATOR_MIN = 718;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/0Deg/Actuator/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_0DEG_ACTUATOR_NACK = 719;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/0Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_0DEG_ACTUATOR_OFFSET = 720;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/0Deg/Actuator/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_0DEG_ACTUATOR_SUBDEVICENUMBER = 721;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/0Deg/Actuator/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_0DEG_ACTUATOR_TYPE = 722;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/0Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_0DEG_ACTUATOR_VALUE = 723;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/135Deg/Actuator/Ack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_135DEG_ACTUATOR_ACK = 724;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/135Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_135DEG_ACTUATOR_DEVICE = 725;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/135Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_135DEG_ACTUATOR_ERROR = 726;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/135Deg/Actuator/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_135DEG_ACTUATOR_GAIN = 727;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/135Deg/Actuator/Max as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_135DEG_ACTUATOR_MAX = 728;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/135Deg/Actuator/Min as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_135DEG_ACTUATOR_MIN = 729;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/135Deg/Actuator/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_135DEG_ACTUATOR_NACK = 730;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/135Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_135DEG_ACTUATOR_OFFSET = 731;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/135Deg/Actuator/SubDeviceNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_135DEG_ACTUATOR_SUBDEVICENUMBER = 732;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/135Deg/Actuator/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_135DEG_ACTUATOR_TYPE = 733;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/135Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_135DEG_ACTUATOR_VALUE = 734;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/180Deg/Actuator/Ack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_180DEG_ACTUATOR_ACK = 735;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/180Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_180DEG_ACTUATOR_DEVICE = 736;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/180Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_180DEG_ACTUATOR_ERROR = 737;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/180Deg/Actuator/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_180DEG_ACTUATOR_GAIN = 738;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/180Deg/Actuator/Max as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_180DEG_ACTUATOR_MAX = 739;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/180Deg/Actuator/Min as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_180DEG_ACTUATOR_MIN = 740;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/180Deg/Actuator/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_180DEG_ACTUATOR_NACK = 741;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/180Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_180DEG_ACTUATOR_OFFSET = 742;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/180Deg/Actuator/SubDeviceNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_180DEG_ACTUATOR_SUBDEVICENUMBER = 743;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/180Deg/Actuator/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_180DEG_ACTUATOR_TYPE = 744;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/180Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_180DEG_ACTUATOR_VALUE = 745;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/225Deg/Actuator/Ack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_225DEG_ACTUATOR_ACK = 746;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/225Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_225DEG_ACTUATOR_DEVICE = 747;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/225Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_225DEG_ACTUATOR_ERROR = 748;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/225Deg/Actuator/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_225DEG_ACTUATOR_GAIN = 749;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/225Deg/Actuator/Max as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_225DEG_ACTUATOR_MAX = 750;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/225Deg/Actuator/Min as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_225DEG_ACTUATOR_MIN = 751;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/225Deg/Actuator/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_225DEG_ACTUATOR_NACK = 752;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/225Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_225DEG_ACTUATOR_OFFSET = 753;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/225Deg/Actuator/SubDeviceNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_225DEG_ACTUATOR_SUBDEVICENUMBER = 754;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/225Deg/Actuator/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_225DEG_ACTUATOR_TYPE = 755;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/225Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_225DEG_ACTUATOR_VALUE = 756;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/270Deg/Actuator/Ack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_270DEG_ACTUATOR_ACK = 757;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/270Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_270DEG_ACTUATOR_DEVICE = 758;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/270Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_270DEG_ACTUATOR_ERROR = 759;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/270Deg/Actuator/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_270DEG_ACTUATOR_GAIN = 760;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/270Deg/Actuator/Max as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_270DEG_ACTUATOR_MAX = 761;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/270Deg/Actuator/Min as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_270DEG_ACTUATOR_MIN = 762;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/270Deg/Actuator/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_270DEG_ACTUATOR_NACK = 763;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/270Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_270DEG_ACTUATOR_OFFSET = 764;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/270Deg/Actuator/SubDeviceNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_270DEG_ACTUATOR_SUBDEVICENUMBER = 765;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/270Deg/Actuator/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_270DEG_ACTUATOR_TYPE = 766;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/270Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_270DEG_ACTUATOR_VALUE = 767;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/315Deg/Actuator/Ack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_315DEG_ACTUATOR_ACK = 768;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/315Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_315DEG_ACTUATOR_DEVICE = 769;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/315Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_315DEG_ACTUATOR_ERROR = 770;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/315Deg/Actuator/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_315DEG_ACTUATOR_GAIN = 771;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/315Deg/Actuator/Max as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_315DEG_ACTUATOR_MAX = 772;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/315Deg/Actuator/Min as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_315DEG_ACTUATOR_MIN = 773;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/315Deg/Actuator/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_315DEG_ACTUATOR_NACK = 774;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/315Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_315DEG_ACTUATOR_OFFSET = 775;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/315Deg/Actuator/SubDeviceNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_315DEG_ACTUATOR_SUBDEVICENUMBER = 776;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/315Deg/Actuator/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_315DEG_ACTUATOR_TYPE = 777;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/315Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_315DEG_ACTUATOR_VALUE = 778;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/45Deg/Actuator/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_45DEG_ACTUATOR_ACK = 779;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/45Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_45DEG_ACTUATOR_DEVICE = 780;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/45Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_45DEG_ACTUATOR_ERROR = 781;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/45Deg/Actuator/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_45DEG_ACTUATOR_GAIN = 782;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/45Deg/Actuator/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_45DEG_ACTUATOR_MAX = 783;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/45Deg/Actuator/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_45DEG_ACTUATOR_MIN = 784;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/45Deg/Actuator/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_45DEG_ACTUATOR_NACK = 785;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/45Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_45DEG_ACTUATOR_OFFSET = 786;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/45Deg/Actuator/SubDeviceNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_45DEG_ACTUATOR_SUBDEVICENUMBER = 787;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/45Deg/Actuator/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_45DEG_ACTUATOR_TYPE = 788;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/45Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_45DEG_ACTUATOR_VALUE = 789;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/90Deg/Actuator/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_90DEG_ACTUATOR_ACK = 790;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/90Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_90DEG_ACTUATOR_DEVICE = 791;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/90Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_90DEG_ACTUATOR_ERROR = 792;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/90Deg/Actuator/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_90DEG_ACTUATOR_GAIN = 793;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/90Deg/Actuator/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_90DEG_ACTUATOR_MAX = 794;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/90Deg/Actuator/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_90DEG_ACTUATOR_MIN = 795;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/90Deg/Actuator/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_90DEG_ACTUATOR_NACK = 796;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/90Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_90DEG_ACTUATOR_OFFSET = 797;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/90Deg/Actuator/SubDeviceNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_90DEG_ACTUATOR_SUBDEVICENUMBER = 798;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/90Deg/Actuator/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_90DEG_ACTUATOR_TYPE = 799;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Blue/Right/90Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_BLUE_RIGHT_90DEG_ACTUATOR_VALUE = 800;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/0Deg/Actuator/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_0DEG_ACTUATOR_ACK = 801;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/0Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_0DEG_ACTUATOR_DEVICE = 802;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/0Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_0DEG_ACTUATOR_ERROR = 803;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/0Deg/Actuator/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_0DEG_ACTUATOR_GAIN = 804;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/0Deg/Actuator/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_0DEG_ACTUATOR_MAX = 805;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/0Deg/Actuator/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_0DEG_ACTUATOR_MIN = 806;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/0Deg/Actuator/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_0DEG_ACTUATOR_NACK = 807;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/0Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_0DEG_ACTUATOR_OFFSET = 808;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/0Deg/Actuator/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_0DEG_ACTUATOR_SUBDEVICENUMBER = 809;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/0Deg/Actuator/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_0DEG_ACTUATOR_TYPE = 810;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/0Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_0DEG_ACTUATOR_VALUE = 811;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/135Deg/Actuator/Ack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_135DEG_ACTUATOR_ACK = 812;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/135Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_135DEG_ACTUATOR_DEVICE = 813;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/135Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_135DEG_ACTUATOR_ERROR = 814;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/135Deg/Actuator/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_135DEG_ACTUATOR_GAIN = 815;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/135Deg/Actuator/Max as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_135DEG_ACTUATOR_MAX = 816;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/135Deg/Actuator/Min as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_135DEG_ACTUATOR_MIN = 817;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/135Deg/Actuator/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_135DEG_ACTUATOR_NACK = 818;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/135Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_135DEG_ACTUATOR_OFFSET = 819;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/135Deg/Actuator/SubDeviceNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_135DEG_ACTUATOR_SUBDEVICENUMBER = 820;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/135Deg/Actuator/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_135DEG_ACTUATOR_TYPE = 821;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/135Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_135DEG_ACTUATOR_VALUE = 822;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/180Deg/Actuator/Ack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_180DEG_ACTUATOR_ACK = 823;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/180Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_180DEG_ACTUATOR_DEVICE = 824;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/180Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_180DEG_ACTUATOR_ERROR = 825;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/180Deg/Actuator/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_180DEG_ACTUATOR_GAIN = 826;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/180Deg/Actuator/Max as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_180DEG_ACTUATOR_MAX = 827;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/180Deg/Actuator/Min as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_180DEG_ACTUATOR_MIN = 828;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/180Deg/Actuator/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_180DEG_ACTUATOR_NACK = 829;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/180Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_180DEG_ACTUATOR_OFFSET = 830;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/180Deg/Actuator/SubDeviceNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_180DEG_ACTUATOR_SUBDEVICENUMBER = 831;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/180Deg/Actuator/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_180DEG_ACTUATOR_TYPE = 832;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/180Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_180DEG_ACTUATOR_VALUE = 833;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/225Deg/Actuator/Ack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_225DEG_ACTUATOR_ACK = 834;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/225Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_225DEG_ACTUATOR_DEVICE = 835;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/225Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_225DEG_ACTUATOR_ERROR = 836;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/225Deg/Actuator/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_225DEG_ACTUATOR_GAIN = 837;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/225Deg/Actuator/Max as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_225DEG_ACTUATOR_MAX = 838;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/225Deg/Actuator/Min as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_225DEG_ACTUATOR_MIN = 839;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/225Deg/Actuator/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_225DEG_ACTUATOR_NACK = 840;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/225Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_225DEG_ACTUATOR_OFFSET = 841;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/225Deg/Actuator/SubDeviceNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_225DEG_ACTUATOR_SUBDEVICENUMBER = 842;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/225Deg/Actuator/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_225DEG_ACTUATOR_TYPE = 843;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/225Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_225DEG_ACTUATOR_VALUE = 844;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/270Deg/Actuator/Ack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_270DEG_ACTUATOR_ACK = 845;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/270Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_270DEG_ACTUATOR_DEVICE = 846;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/270Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_270DEG_ACTUATOR_ERROR = 847;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/270Deg/Actuator/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_270DEG_ACTUATOR_GAIN = 848;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/270Deg/Actuator/Max as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_270DEG_ACTUATOR_MAX = 849;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/270Deg/Actuator/Min as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_270DEG_ACTUATOR_MIN = 850;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/270Deg/Actuator/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_270DEG_ACTUATOR_NACK = 851;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/270Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_270DEG_ACTUATOR_OFFSET = 852;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/270Deg/Actuator/SubDeviceNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_270DEG_ACTUATOR_SUBDEVICENUMBER = 853;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/270Deg/Actuator/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_270DEG_ACTUATOR_TYPE = 854;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/270Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_270DEG_ACTUATOR_VALUE = 855;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/315Deg/Actuator/Ack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_315DEG_ACTUATOR_ACK = 856;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/315Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_315DEG_ACTUATOR_DEVICE = 857;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/315Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_315DEG_ACTUATOR_ERROR = 858;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/315Deg/Actuator/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_315DEG_ACTUATOR_GAIN = 859;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/315Deg/Actuator/Max as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_315DEG_ACTUATOR_MAX = 860;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/315Deg/Actuator/Min as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_315DEG_ACTUATOR_MIN = 861;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/315Deg/Actuator/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_315DEG_ACTUATOR_NACK = 862;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/315Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_315DEG_ACTUATOR_OFFSET = 863;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/315Deg/Actuator/SubDeviceNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_315DEG_ACTUATOR_SUBDEVICENUMBER = 864;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/315Deg/Actuator/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_315DEG_ACTUATOR_TYPE = 865;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/315Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_315DEG_ACTUATOR_VALUE = 866;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/45Deg/Actuator/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_45DEG_ACTUATOR_ACK = 867;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/45Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_45DEG_ACTUATOR_DEVICE = 868;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/45Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_45DEG_ACTUATOR_ERROR = 869;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/45Deg/Actuator/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_45DEG_ACTUATOR_GAIN = 870;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/45Deg/Actuator/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_45DEG_ACTUATOR_MAX = 871;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/45Deg/Actuator/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_45DEG_ACTUATOR_MIN = 872;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/45Deg/Actuator/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_45DEG_ACTUATOR_NACK = 873;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/45Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_45DEG_ACTUATOR_OFFSET = 874;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/45Deg/Actuator/SubDeviceNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_45DEG_ACTUATOR_SUBDEVICENUMBER = 875;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/45Deg/Actuator/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_45DEG_ACTUATOR_TYPE = 876;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/45Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_45DEG_ACTUATOR_VALUE = 877;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/90Deg/Actuator/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_90DEG_ACTUATOR_ACK = 878;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/90Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_90DEG_ACTUATOR_DEVICE = 879;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/90Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_90DEG_ACTUATOR_ERROR = 880;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/90Deg/Actuator/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_90DEG_ACTUATOR_GAIN = 881;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/90Deg/Actuator/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_90DEG_ACTUATOR_MAX = 882;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/90Deg/Actuator/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_90DEG_ACTUATOR_MIN = 883;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/90Deg/Actuator/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_90DEG_ACTUATOR_NACK = 884;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/90Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_90DEG_ACTUATOR_OFFSET = 885;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/90Deg/Actuator/SubDeviceNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_90DEG_ACTUATOR_SUBDEVICENUMBER = 886;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/90Deg/Actuator/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_90DEG_ACTUATOR_TYPE = 887;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Left/90Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_LEFT_90DEG_ACTUATOR_VALUE = 888;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/0Deg/Actuator/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_0DEG_ACTUATOR_ACK = 889;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/0Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_0DEG_ACTUATOR_DEVICE = 890;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/0Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_0DEG_ACTUATOR_ERROR = 891;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/0Deg/Actuator/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_0DEG_ACTUATOR_GAIN = 892;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/0Deg/Actuator/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_0DEG_ACTUATOR_MAX = 893;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/0Deg/Actuator/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_0DEG_ACTUATOR_MIN = 894;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/0Deg/Actuator/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_0DEG_ACTUATOR_NACK = 895;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/0Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_0DEG_ACTUATOR_OFFSET = 896;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/0Deg/Actuator/SubDeviceNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_0DEG_ACTUATOR_SUBDEVICENUMBER = 897;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/0Deg/Actuator/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_0DEG_ACTUATOR_TYPE = 898;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/0Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_0DEG_ACTUATOR_VALUE = 899;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/135Deg/Actuator/Ack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_135DEG_ACTUATOR_ACK = 900;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/135Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_135DEG_ACTUATOR_DEVICE = 901;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/135Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_135DEG_ACTUATOR_ERROR = 902;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/135Deg/Actuator/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_135DEG_ACTUATOR_GAIN = 903;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/135Deg/Actuator/Max as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_135DEG_ACTUATOR_MAX = 904;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/135Deg/Actuator/Min as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_135DEG_ACTUATOR_MIN = 905;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/135Deg/Actuator/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_135DEG_ACTUATOR_NACK = 906;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/135Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_135DEG_ACTUATOR_OFFSET = 907;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/135Deg/Actuator/SubDeviceNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_135DEG_ACTUATOR_SUBDEVICENUMBER = 908;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/135Deg/Actuator/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_135DEG_ACTUATOR_TYPE = 909;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/135Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_135DEG_ACTUATOR_VALUE = 910;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/180Deg/Actuator/Ack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_180DEG_ACTUATOR_ACK = 911;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/180Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_180DEG_ACTUATOR_DEVICE = 912;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/180Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_180DEG_ACTUATOR_ERROR = 913;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/180Deg/Actuator/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_180DEG_ACTUATOR_GAIN = 914;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/180Deg/Actuator/Max as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_180DEG_ACTUATOR_MAX = 915;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/180Deg/Actuator/Min as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_180DEG_ACTUATOR_MIN = 916;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/180Deg/Actuator/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_180DEG_ACTUATOR_NACK = 917;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/180Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_180DEG_ACTUATOR_OFFSET = 918;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/180Deg/Actuator/SubDeviceNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_180DEG_ACTUATOR_SUBDEVICENUMBER = 919;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/180Deg/Actuator/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_180DEG_ACTUATOR_TYPE = 920;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/180Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_180DEG_ACTUATOR_VALUE = 921;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/225Deg/Actuator/Ack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_225DEG_ACTUATOR_ACK = 922;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/225Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_225DEG_ACTUATOR_DEVICE = 923;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/225Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_225DEG_ACTUATOR_ERROR = 924;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/225Deg/Actuator/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_225DEG_ACTUATOR_GAIN = 925;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/225Deg/Actuator/Max as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_225DEG_ACTUATOR_MAX = 926;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/225Deg/Actuator/Min as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_225DEG_ACTUATOR_MIN = 927;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/225Deg/Actuator/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_225DEG_ACTUATOR_NACK = 928;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/225Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_225DEG_ACTUATOR_OFFSET = 929;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/225Deg/Actuator/SubDeviceNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_225DEG_ACTUATOR_SUBDEVICENUMBER = 930;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/225Deg/Actuator/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_225DEG_ACTUATOR_TYPE = 931;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/225Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_225DEG_ACTUATOR_VALUE = 932;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/270Deg/Actuator/Ack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_270DEG_ACTUATOR_ACK = 933;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/270Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_270DEG_ACTUATOR_DEVICE = 934;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/270Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_270DEG_ACTUATOR_ERROR = 935;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/270Deg/Actuator/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_270DEG_ACTUATOR_GAIN = 936;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/270Deg/Actuator/Max as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_270DEG_ACTUATOR_MAX = 937;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/270Deg/Actuator/Min as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_270DEG_ACTUATOR_MIN = 938;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/270Deg/Actuator/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_270DEG_ACTUATOR_NACK = 939;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/270Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_270DEG_ACTUATOR_OFFSET = 940;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/270Deg/Actuator/SubDeviceNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_270DEG_ACTUATOR_SUBDEVICENUMBER = 941;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/270Deg/Actuator/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_270DEG_ACTUATOR_TYPE = 942;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/270Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_270DEG_ACTUATOR_VALUE = 943;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/315Deg/Actuator/Ack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_315DEG_ACTUATOR_ACK = 944;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/315Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_315DEG_ACTUATOR_DEVICE = 945;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/315Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_315DEG_ACTUATOR_ERROR = 946;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/315Deg/Actuator/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_315DEG_ACTUATOR_GAIN = 947;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/315Deg/Actuator/Max as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_315DEG_ACTUATOR_MAX = 948;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/315Deg/Actuator/Min as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_315DEG_ACTUATOR_MIN = 949;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/315Deg/Actuator/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_315DEG_ACTUATOR_NACK = 950;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/315Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_315DEG_ACTUATOR_OFFSET = 951;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/315Deg/Actuator/SubDeviceNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_315DEG_ACTUATOR_SUBDEVICENUMBER = 952;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/315Deg/Actuator/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_315DEG_ACTUATOR_TYPE = 953;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/315Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_315DEG_ACTUATOR_VALUE = 954;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/45Deg/Actuator/Ack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_45DEG_ACTUATOR_ACK = 955;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/45Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_45DEG_ACTUATOR_DEVICE = 956;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/45Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_45DEG_ACTUATOR_ERROR = 957;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/45Deg/Actuator/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_45DEG_ACTUATOR_GAIN = 958;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/45Deg/Actuator/Max as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_45DEG_ACTUATOR_MAX = 959;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/45Deg/Actuator/Min as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_45DEG_ACTUATOR_MIN = 960;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/45Deg/Actuator/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_45DEG_ACTUATOR_NACK = 961;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/45Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_45DEG_ACTUATOR_OFFSET = 962;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/45Deg/Actuator/SubDeviceNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_45DEG_ACTUATOR_SUBDEVICENUMBER = 963;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/45Deg/Actuator/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_45DEG_ACTUATOR_TYPE = 964;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/45Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_45DEG_ACTUATOR_VALUE = 965;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/90Deg/Actuator/Ack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_90DEG_ACTUATOR_ACK = 966;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/90Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_90DEG_ACTUATOR_DEVICE = 967;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/90Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_90DEG_ACTUATOR_ERROR = 968;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/90Deg/Actuator/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_90DEG_ACTUATOR_GAIN = 969;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/90Deg/Actuator/Max as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_90DEG_ACTUATOR_MAX = 970;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/90Deg/Actuator/Min as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_90DEG_ACTUATOR_MIN = 971;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/90Deg/Actuator/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_90DEG_ACTUATOR_NACK = 972;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/90Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_90DEG_ACTUATOR_OFFSET = 973;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/90Deg/Actuator/SubDeviceNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_90DEG_ACTUATOR_SUBDEVICENUMBER = 974;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/90Deg/Actuator/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_90DEG_ACTUATOR_TYPE = 975;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Green/Right/90Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_GREEN_RIGHT_90DEG_ACTUATOR_VALUE = 976;

	/**
	 * Id of the sensor Device/SubDeviceList/Face/Led/Red/Left/0Deg/Actuator/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_0DEG_ACTUATOR_ACK = 977;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/0Deg/Actuator/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_0DEG_ACTUATOR_DEVICE = 978;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/0Deg/Actuator/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_0DEG_ACTUATOR_ERROR = 979;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/0Deg/Actuator/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_0DEG_ACTUATOR_GAIN = 980;

	/**
	 * Id of the sensor Device/SubDeviceList/Face/Led/Red/Left/0Deg/Actuator/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_0DEG_ACTUATOR_MAX = 981;

	/**
	 * Id of the sensor Device/SubDeviceList/Face/Led/Red/Left/0Deg/Actuator/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_0DEG_ACTUATOR_MIN = 982;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/0Deg/Actuator/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_0DEG_ACTUATOR_NACK = 983;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/0Deg/Actuator/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_0DEG_ACTUATOR_OFFSET = 984;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/0Deg/Actuator/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_0DEG_ACTUATOR_SUBDEVICENUMBER = 985;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/0Deg/Actuator/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_0DEG_ACTUATOR_TYPE = 986;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/0Deg/Actuator/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_0DEG_ACTUATOR_VALUE = 987;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/135Deg/Actuator/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_135DEG_ACTUATOR_ACK = 988;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/135Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_135DEG_ACTUATOR_DEVICE = 989;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/135Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_135DEG_ACTUATOR_ERROR = 990;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/135Deg/Actuator/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_135DEG_ACTUATOR_GAIN = 991;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/135Deg/Actuator/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_135DEG_ACTUATOR_MAX = 992;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/135Deg/Actuator/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_135DEG_ACTUATOR_MIN = 993;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/135Deg/Actuator/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_135DEG_ACTUATOR_NACK = 994;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/135Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_135DEG_ACTUATOR_OFFSET = 995;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/135Deg/Actuator/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_135DEG_ACTUATOR_SUBDEVICENUMBER = 996;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/135Deg/Actuator/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_135DEG_ACTUATOR_TYPE = 997;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/135Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_135DEG_ACTUATOR_VALUE = 998;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/180Deg/Actuator/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_180DEG_ACTUATOR_ACK = 999;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/180Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_180DEG_ACTUATOR_DEVICE = 1000;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/180Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_180DEG_ACTUATOR_ERROR = 1001;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/180Deg/Actuator/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_180DEG_ACTUATOR_GAIN = 1002;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/180Deg/Actuator/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_180DEG_ACTUATOR_MAX = 1003;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/180Deg/Actuator/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_180DEG_ACTUATOR_MIN = 1004;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/180Deg/Actuator/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_180DEG_ACTUATOR_NACK = 1005;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/180Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_180DEG_ACTUATOR_OFFSET = 1006;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/180Deg/Actuator/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_180DEG_ACTUATOR_SUBDEVICENUMBER = 1007;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/180Deg/Actuator/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_180DEG_ACTUATOR_TYPE = 1008;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/180Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_180DEG_ACTUATOR_VALUE = 1009;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/225Deg/Actuator/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_225DEG_ACTUATOR_ACK = 1010;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/225Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_225DEG_ACTUATOR_DEVICE = 1011;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/225Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_225DEG_ACTUATOR_ERROR = 1012;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/225Deg/Actuator/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_225DEG_ACTUATOR_GAIN = 1013;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/225Deg/Actuator/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_225DEG_ACTUATOR_MAX = 1014;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/225Deg/Actuator/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_225DEG_ACTUATOR_MIN = 1015;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/225Deg/Actuator/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_225DEG_ACTUATOR_NACK = 1016;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/225Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_225DEG_ACTUATOR_OFFSET = 1017;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/225Deg/Actuator/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_225DEG_ACTUATOR_SUBDEVICENUMBER = 1018;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/225Deg/Actuator/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_225DEG_ACTUATOR_TYPE = 1019;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/225Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_225DEG_ACTUATOR_VALUE = 1020;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/270Deg/Actuator/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_270DEG_ACTUATOR_ACK = 1021;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/270Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_270DEG_ACTUATOR_DEVICE = 1022;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/270Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_270DEG_ACTUATOR_ERROR = 1023;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/270Deg/Actuator/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_270DEG_ACTUATOR_GAIN = 1024;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/270Deg/Actuator/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_270DEG_ACTUATOR_MAX = 1025;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/270Deg/Actuator/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_270DEG_ACTUATOR_MIN = 1026;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/270Deg/Actuator/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_270DEG_ACTUATOR_NACK = 1027;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/270Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_270DEG_ACTUATOR_OFFSET = 1028;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/270Deg/Actuator/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_270DEG_ACTUATOR_SUBDEVICENUMBER = 1029;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/270Deg/Actuator/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_270DEG_ACTUATOR_TYPE = 1030;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/270Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_270DEG_ACTUATOR_VALUE = 1031;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/315Deg/Actuator/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_315DEG_ACTUATOR_ACK = 1032;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/315Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_315DEG_ACTUATOR_DEVICE = 1033;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/315Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_315DEG_ACTUATOR_ERROR = 1034;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/315Deg/Actuator/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_315DEG_ACTUATOR_GAIN = 1035;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/315Deg/Actuator/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_315DEG_ACTUATOR_MAX = 1036;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/315Deg/Actuator/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_315DEG_ACTUATOR_MIN = 1037;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/315Deg/Actuator/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_315DEG_ACTUATOR_NACK = 1038;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/315Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_315DEG_ACTUATOR_OFFSET = 1039;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/315Deg/Actuator/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_315DEG_ACTUATOR_SUBDEVICENUMBER = 1040;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/315Deg/Actuator/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_315DEG_ACTUATOR_TYPE = 1041;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/315Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_315DEG_ACTUATOR_VALUE = 1042;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/45Deg/Actuator/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_45DEG_ACTUATOR_ACK = 1043;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/45Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_45DEG_ACTUATOR_DEVICE = 1044;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/45Deg/Actuator/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_45DEG_ACTUATOR_ERROR = 1045;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/45Deg/Actuator/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_45DEG_ACTUATOR_GAIN = 1046;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/45Deg/Actuator/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_45DEG_ACTUATOR_MAX = 1047;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/45Deg/Actuator/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_45DEG_ACTUATOR_MIN = 1048;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/45Deg/Actuator/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_45DEG_ACTUATOR_NACK = 1049;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/45Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_45DEG_ACTUATOR_OFFSET = 1050;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/45Deg/Actuator/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_45DEG_ACTUATOR_SUBDEVICENUMBER = 1051;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/45Deg/Actuator/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_45DEG_ACTUATOR_TYPE = 1052;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/45Deg/Actuator/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_45DEG_ACTUATOR_VALUE = 1053;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/90Deg/Actuator/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_90DEG_ACTUATOR_ACK = 1054;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/90Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_90DEG_ACTUATOR_DEVICE = 1055;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/90Deg/Actuator/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_90DEG_ACTUATOR_ERROR = 1056;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/90Deg/Actuator/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_90DEG_ACTUATOR_GAIN = 1057;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/90Deg/Actuator/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_90DEG_ACTUATOR_MAX = 1058;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/90Deg/Actuator/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_90DEG_ACTUATOR_MIN = 1059;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/90Deg/Actuator/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_90DEG_ACTUATOR_NACK = 1060;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/90Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_90DEG_ACTUATOR_OFFSET = 1061;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/90Deg/Actuator/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_90DEG_ACTUATOR_SUBDEVICENUMBER = 1062;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/90Deg/Actuator/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_90DEG_ACTUATOR_TYPE = 1063;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Left/90Deg/Actuator/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_LEFT_90DEG_ACTUATOR_VALUE = 1064;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/0Deg/Actuator/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_0DEG_ACTUATOR_ACK = 1065;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/0Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_0DEG_ACTUATOR_DEVICE = 1066;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/0Deg/Actuator/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_0DEG_ACTUATOR_ERROR = 1067;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/0Deg/Actuator/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_0DEG_ACTUATOR_GAIN = 1068;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/0Deg/Actuator/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_0DEG_ACTUATOR_MAX = 1069;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/0Deg/Actuator/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_0DEG_ACTUATOR_MIN = 1070;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/0Deg/Actuator/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_0DEG_ACTUATOR_NACK = 1071;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/0Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_0DEG_ACTUATOR_OFFSET = 1072;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/0Deg/Actuator/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_0DEG_ACTUATOR_SUBDEVICENUMBER = 1073;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/0Deg/Actuator/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_0DEG_ACTUATOR_TYPE = 1074;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/0Deg/Actuator/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_0DEG_ACTUATOR_VALUE = 1075;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/135Deg/Actuator/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_135DEG_ACTUATOR_ACK = 1076;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/135Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_135DEG_ACTUATOR_DEVICE = 1077;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/135Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_135DEG_ACTUATOR_ERROR = 1078;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/135Deg/Actuator/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_135DEG_ACTUATOR_GAIN = 1079;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/135Deg/Actuator/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_135DEG_ACTUATOR_MAX = 1080;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/135Deg/Actuator/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_135DEG_ACTUATOR_MIN = 1081;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/135Deg/Actuator/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_135DEG_ACTUATOR_NACK = 1082;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/135Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_135DEG_ACTUATOR_OFFSET = 1083;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/135Deg/Actuator/SubDeviceNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_135DEG_ACTUATOR_SUBDEVICENUMBER = 1084;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/135Deg/Actuator/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_135DEG_ACTUATOR_TYPE = 1085;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/135Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_135DEG_ACTUATOR_VALUE = 1086;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/180Deg/Actuator/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_180DEG_ACTUATOR_ACK = 1087;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/180Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_180DEG_ACTUATOR_DEVICE = 1088;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/180Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_180DEG_ACTUATOR_ERROR = 1089;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/180Deg/Actuator/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_180DEG_ACTUATOR_GAIN = 1090;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/180Deg/Actuator/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_180DEG_ACTUATOR_MAX = 1091;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/180Deg/Actuator/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_180DEG_ACTUATOR_MIN = 1092;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/180Deg/Actuator/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_180DEG_ACTUATOR_NACK = 1093;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/180Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_180DEG_ACTUATOR_OFFSET = 1094;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/180Deg/Actuator/SubDeviceNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_180DEG_ACTUATOR_SUBDEVICENUMBER = 1095;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/180Deg/Actuator/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_180DEG_ACTUATOR_TYPE = 1096;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/180Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_180DEG_ACTUATOR_VALUE = 1097;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/225Deg/Actuator/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_225DEG_ACTUATOR_ACK = 1098;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/225Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_225DEG_ACTUATOR_DEVICE = 1099;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/225Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_225DEG_ACTUATOR_ERROR = 1100;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/225Deg/Actuator/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_225DEG_ACTUATOR_GAIN = 1101;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/225Deg/Actuator/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_225DEG_ACTUATOR_MAX = 1102;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/225Deg/Actuator/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_225DEG_ACTUATOR_MIN = 1103;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/225Deg/Actuator/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_225DEG_ACTUATOR_NACK = 1104;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/225Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_225DEG_ACTUATOR_OFFSET = 1105;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/225Deg/Actuator/SubDeviceNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_225DEG_ACTUATOR_SUBDEVICENUMBER = 1106;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/225Deg/Actuator/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_225DEG_ACTUATOR_TYPE = 1107;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/225Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_225DEG_ACTUATOR_VALUE = 1108;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/270Deg/Actuator/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_270DEG_ACTUATOR_ACK = 1109;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/270Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_270DEG_ACTUATOR_DEVICE = 1110;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/270Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_270DEG_ACTUATOR_ERROR = 1111;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/270Deg/Actuator/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_270DEG_ACTUATOR_GAIN = 1112;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/270Deg/Actuator/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_270DEG_ACTUATOR_MAX = 1113;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/270Deg/Actuator/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_270DEG_ACTUATOR_MIN = 1114;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/270Deg/Actuator/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_270DEG_ACTUATOR_NACK = 1115;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/270Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_270DEG_ACTUATOR_OFFSET = 1116;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/270Deg/Actuator/SubDeviceNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_270DEG_ACTUATOR_SUBDEVICENUMBER = 1117;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/270Deg/Actuator/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_270DEG_ACTUATOR_TYPE = 1118;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/270Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_270DEG_ACTUATOR_VALUE = 1119;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/315Deg/Actuator/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_315DEG_ACTUATOR_ACK = 1120;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/315Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_315DEG_ACTUATOR_DEVICE = 1121;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/315Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_315DEG_ACTUATOR_ERROR = 1122;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/315Deg/Actuator/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_315DEG_ACTUATOR_GAIN = 1123;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/315Deg/Actuator/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_315DEG_ACTUATOR_MAX = 1124;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/315Deg/Actuator/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_315DEG_ACTUATOR_MIN = 1125;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/315Deg/Actuator/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_315DEG_ACTUATOR_NACK = 1126;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/315Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_315DEG_ACTUATOR_OFFSET = 1127;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/315Deg/Actuator/SubDeviceNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_315DEG_ACTUATOR_SUBDEVICENUMBER = 1128;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/315Deg/Actuator/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_315DEG_ACTUATOR_TYPE = 1129;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/315Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_315DEG_ACTUATOR_VALUE = 1130;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/45Deg/Actuator/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_45DEG_ACTUATOR_ACK = 1131;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/45Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_45DEG_ACTUATOR_DEVICE = 1132;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/45Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_45DEG_ACTUATOR_ERROR = 1133;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/45Deg/Actuator/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_45DEG_ACTUATOR_GAIN = 1134;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/45Deg/Actuator/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_45DEG_ACTUATOR_MAX = 1135;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/45Deg/Actuator/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_45DEG_ACTUATOR_MIN = 1136;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/45Deg/Actuator/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_45DEG_ACTUATOR_NACK = 1137;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/45Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_45DEG_ACTUATOR_OFFSET = 1138;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/45Deg/Actuator/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_45DEG_ACTUATOR_SUBDEVICENUMBER = 1139;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/45Deg/Actuator/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_45DEG_ACTUATOR_TYPE = 1140;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/45Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_45DEG_ACTUATOR_VALUE = 1141;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/90Deg/Actuator/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_90DEG_ACTUATOR_ACK = 1142;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/90Deg/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_90DEG_ACTUATOR_DEVICE = 1143;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/90Deg/Actuator/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_90DEG_ACTUATOR_ERROR = 1144;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/90Deg/Actuator/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_90DEG_ACTUATOR_GAIN = 1145;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/90Deg/Actuator/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_90DEG_ACTUATOR_MAX = 1146;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/90Deg/Actuator/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_90DEG_ACTUATOR_MIN = 1147;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/90Deg/Actuator/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_90DEG_ACTUATOR_NACK = 1148;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/90Deg/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_90DEG_ACTUATOR_OFFSET = 1149;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/90Deg/Actuator/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_90DEG_ACTUATOR_SUBDEVICENUMBER = 1150;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/90Deg/Actuator/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_90DEG_ACTUATOR_TYPE = 1151;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Face/Led/Red/Right/90Deg/Actuator/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_FACE_LED_RED_RIGHT_90DEG_ACTUATOR_VALUE = 1152;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Front/Left/0/Actuator/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_LEFT_0_ACTUATOR_ACK = 1153;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Front/Left/0/Actuator/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_LEFT_0_ACTUATOR_DEVICE = 1154;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Front/Left/0/Actuator/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_LEFT_0_ACTUATOR_ERROR = 1155;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Front/Left/0/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_LEFT_0_ACTUATOR_GAIN = 1156;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Front/Left/0/Actuator/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_LEFT_0_ACTUATOR_MAX = 1157;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Front/Left/0/Actuator/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_LEFT_0_ACTUATOR_MIN = 1158;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Front/Left/0/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_LEFT_0_ACTUATOR_NACK = 1159;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Front/Left/0/Actuator/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_LEFT_0_ACTUATOR_OFFSET = 1160;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Front/Left/0/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_LEFT_0_ACTUATOR_SUBDEVICENUMBER = 1161;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Front/Left/0/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_LEFT_0_ACTUATOR_TYPE = 1162;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Front/Left/0/Actuator/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_LEFT_0_ACTUATOR_VALUE = 1163;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Front/Left/1/Actuator/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_LEFT_1_ACTUATOR_ACK = 1164;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Front/Left/1/Actuator/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_LEFT_1_ACTUATOR_DEVICE = 1165;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Front/Left/1/Actuator/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_LEFT_1_ACTUATOR_ERROR = 1166;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Front/Left/1/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_LEFT_1_ACTUATOR_GAIN = 1167;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Front/Left/1/Actuator/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_LEFT_1_ACTUATOR_MAX = 1168;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Front/Left/1/Actuator/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_LEFT_1_ACTUATOR_MIN = 1169;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Front/Left/1/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_LEFT_1_ACTUATOR_NACK = 1170;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Front/Left/1/Actuator/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_LEFT_1_ACTUATOR_OFFSET = 1171;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Front/Left/1/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_LEFT_1_ACTUATOR_SUBDEVICENUMBER = 1172;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Front/Left/1/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_LEFT_1_ACTUATOR_TYPE = 1173;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Front/Left/1/Actuator/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_LEFT_1_ACTUATOR_VALUE = 1174;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Front/Right/0/Actuator/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_RIGHT_0_ACTUATOR_ACK = 1175;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Front/Right/0/Actuator/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_RIGHT_0_ACTUATOR_DEVICE = 1176;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Front/Right/0/Actuator/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_RIGHT_0_ACTUATOR_ERROR = 1177;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Front/Right/0/Actuator/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_RIGHT_0_ACTUATOR_GAIN = 1178;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Front/Right/0/Actuator/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_RIGHT_0_ACTUATOR_MAX = 1179;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Front/Right/0/Actuator/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_RIGHT_0_ACTUATOR_MIN = 1180;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Front/Right/0/Actuator/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_RIGHT_0_ACTUATOR_NACK = 1181;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Front/Right/0/Actuator/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_RIGHT_0_ACTUATOR_OFFSET = 1182;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Front/Right/0/Actuator/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_RIGHT_0_ACTUATOR_SUBDEVICENUMBER = 1183;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Front/Right/0/Actuator/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_RIGHT_0_ACTUATOR_TYPE = 1184;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Front/Right/0/Actuator/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_RIGHT_0_ACTUATOR_VALUE = 1185;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Front/Right/1/Actuator/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_RIGHT_1_ACTUATOR_ACK = 1186;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Front/Right/1/Actuator/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_RIGHT_1_ACTUATOR_DEVICE = 1187;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Front/Right/1/Actuator/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_RIGHT_1_ACTUATOR_ERROR = 1188;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Front/Right/1/Actuator/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_RIGHT_1_ACTUATOR_GAIN = 1189;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Front/Right/1/Actuator/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_RIGHT_1_ACTUATOR_MAX = 1190;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Front/Right/1/Actuator/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_RIGHT_1_ACTUATOR_MIN = 1191;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Front/Right/1/Actuator/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_RIGHT_1_ACTUATOR_NACK = 1192;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Front/Right/1/Actuator/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_RIGHT_1_ACTUATOR_OFFSET = 1193;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Front/Right/1/Actuator/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_RIGHT_1_ACTUATOR_SUBDEVICENUMBER = 1194;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Front/Right/1/Actuator/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_RIGHT_1_ACTUATOR_TYPE = 1195;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Front/Right/1/Actuator/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_FRONT_RIGHT_1_ACTUATOR_VALUE = 1196;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Middle/Left/0/Actuator/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_MIDDLE_LEFT_0_ACTUATOR_ACK = 1197;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Middle/Left/0/Actuator/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_MIDDLE_LEFT_0_ACTUATOR_DEVICE = 1198;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Middle/Left/0/Actuator/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_MIDDLE_LEFT_0_ACTUATOR_ERROR = 1199;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Middle/Left/0/Actuator/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_MIDDLE_LEFT_0_ACTUATOR_GAIN = 1200;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Middle/Left/0/Actuator/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_MIDDLE_LEFT_0_ACTUATOR_MAX = 1201;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Middle/Left/0/Actuator/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_MIDDLE_LEFT_0_ACTUATOR_MIN = 1202;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Middle/Left/0/Actuator/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_MIDDLE_LEFT_0_ACTUATOR_NACK = 1203;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Middle/Left/0/Actuator/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_MIDDLE_LEFT_0_ACTUATOR_OFFSET = 1204;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Middle/Left/0/Actuator/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_MIDDLE_LEFT_0_ACTUATOR_SUBDEVICENUMBER = 1205;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Middle/Left/0/Actuator/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_MIDDLE_LEFT_0_ACTUATOR_TYPE = 1206;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Middle/Left/0/Actuator/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_MIDDLE_LEFT_0_ACTUATOR_VALUE = 1207;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Middle/Right/0/Actuator/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_MIDDLE_RIGHT_0_ACTUATOR_ACK = 1208;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Middle/Right/0/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_MIDDLE_RIGHT_0_ACTUATOR_DEVICE = 1209;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Middle/Right/0/Actuator/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_MIDDLE_RIGHT_0_ACTUATOR_ERROR = 1210;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Middle/Right/0/Actuator/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_MIDDLE_RIGHT_0_ACTUATOR_GAIN = 1211;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Middle/Right/0/Actuator/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_MIDDLE_RIGHT_0_ACTUATOR_MAX = 1212;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Middle/Right/0/Actuator/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_MIDDLE_RIGHT_0_ACTUATOR_MIN = 1213;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Middle/Right/0/Actuator/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_MIDDLE_RIGHT_0_ACTUATOR_NACK = 1214;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Middle/Right/0/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_MIDDLE_RIGHT_0_ACTUATOR_OFFSET = 1215;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Middle/Right/0/Actuator/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_MIDDLE_RIGHT_0_ACTUATOR_SUBDEVICENUMBER = 1216;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Middle/Right/0/Actuator/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_MIDDLE_RIGHT_0_ACTUATOR_TYPE = 1217;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Middle/Right/0/Actuator/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_MIDDLE_RIGHT_0_ACTUATOR_VALUE = 1218;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Rear/Left/0/Actuator/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_LEFT_0_ACTUATOR_ACK = 1219;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Rear/Left/0/Actuator/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_LEFT_0_ACTUATOR_DEVICE = 1220;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Rear/Left/0/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_LEFT_0_ACTUATOR_ERROR = 1221;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Rear/Left/0/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_LEFT_0_ACTUATOR_GAIN = 1222;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Rear/Left/0/Actuator/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_LEFT_0_ACTUATOR_MAX = 1223;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Rear/Left/0/Actuator/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_LEFT_0_ACTUATOR_MIN = 1224;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Rear/Left/0/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_LEFT_0_ACTUATOR_NACK = 1225;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Rear/Left/0/Actuator/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_LEFT_0_ACTUATOR_OFFSET = 1226;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Rear/Left/0/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_LEFT_0_ACTUATOR_SUBDEVICENUMBER = 1227;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Rear/Left/0/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_LEFT_0_ACTUATOR_TYPE = 1228;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Rear/Left/0/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_LEFT_0_ACTUATOR_VALUE = 1229;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Rear/Left/1/Actuator/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_LEFT_1_ACTUATOR_ACK = 1230;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Rear/Left/1/Actuator/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_LEFT_1_ACTUATOR_DEVICE = 1231;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Rear/Left/1/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_LEFT_1_ACTUATOR_ERROR = 1232;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Rear/Left/1/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_LEFT_1_ACTUATOR_GAIN = 1233;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Rear/Left/1/Actuator/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_LEFT_1_ACTUATOR_MAX = 1234;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Rear/Left/1/Actuator/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_LEFT_1_ACTUATOR_MIN = 1235;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Rear/Left/1/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_LEFT_1_ACTUATOR_NACK = 1236;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Rear/Left/1/Actuator/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_LEFT_1_ACTUATOR_OFFSET = 1237;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Rear/Left/1/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_LEFT_1_ACTUATOR_SUBDEVICENUMBER = 1238;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Rear/Left/1/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_LEFT_1_ACTUATOR_TYPE = 1239;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Rear/Left/1/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_LEFT_1_ACTUATOR_VALUE = 1240;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Rear/Left/2/Actuator/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_LEFT_2_ACTUATOR_ACK = 1241;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Rear/Left/2/Actuator/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_LEFT_2_ACTUATOR_DEVICE = 1242;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Rear/Left/2/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_LEFT_2_ACTUATOR_ERROR = 1243;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Rear/Left/2/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_LEFT_2_ACTUATOR_GAIN = 1244;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Rear/Left/2/Actuator/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_LEFT_2_ACTUATOR_MAX = 1245;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Rear/Left/2/Actuator/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_LEFT_2_ACTUATOR_MIN = 1246;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Rear/Left/2/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_LEFT_2_ACTUATOR_NACK = 1247;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Rear/Left/2/Actuator/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_LEFT_2_ACTUATOR_OFFSET = 1248;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Rear/Left/2/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_LEFT_2_ACTUATOR_SUBDEVICENUMBER = 1249;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Rear/Left/2/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_LEFT_2_ACTUATOR_TYPE = 1250;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Rear/Left/2/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_LEFT_2_ACTUATOR_VALUE = 1251;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Rear/Right/0/Actuator/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_RIGHT_0_ACTUATOR_ACK = 1252;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Rear/Right/0/Actuator/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_RIGHT_0_ACTUATOR_DEVICE = 1253;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Rear/Right/0/Actuator/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_RIGHT_0_ACTUATOR_ERROR = 1254;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Rear/Right/0/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_RIGHT_0_ACTUATOR_GAIN = 1255;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Rear/Right/0/Actuator/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_RIGHT_0_ACTUATOR_MAX = 1256;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Rear/Right/0/Actuator/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_RIGHT_0_ACTUATOR_MIN = 1257;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Rear/Right/0/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_RIGHT_0_ACTUATOR_NACK = 1258;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Rear/Right/0/Actuator/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_RIGHT_0_ACTUATOR_OFFSET = 1259;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Rear/Right/0/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_RIGHT_0_ACTUATOR_SUBDEVICENUMBER = 1260;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Rear/Right/0/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_RIGHT_0_ACTUATOR_TYPE = 1261;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Rear/Right/0/Actuator/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_RIGHT_0_ACTUATOR_VALUE = 1262;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Rear/Right/1/Actuator/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_RIGHT_1_ACTUATOR_ACK = 1263;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Rear/Right/1/Actuator/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_RIGHT_1_ACTUATOR_DEVICE = 1264;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Rear/Right/1/Actuator/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_RIGHT_1_ACTUATOR_ERROR = 1265;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Rear/Right/1/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_RIGHT_1_ACTUATOR_GAIN = 1266;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Rear/Right/1/Actuator/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_RIGHT_1_ACTUATOR_MAX = 1267;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Rear/Right/1/Actuator/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_RIGHT_1_ACTUATOR_MIN = 1268;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Rear/Right/1/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_RIGHT_1_ACTUATOR_NACK = 1269;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Rear/Right/1/Actuator/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_RIGHT_1_ACTUATOR_OFFSET = 1270;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Rear/Right/1/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_RIGHT_1_ACTUATOR_SUBDEVICENUMBER = 1271;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Rear/Right/1/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_RIGHT_1_ACTUATOR_TYPE = 1272;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Rear/Right/1/Actuator/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_RIGHT_1_ACTUATOR_VALUE = 1273;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Rear/Right/2/Actuator/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_RIGHT_2_ACTUATOR_ACK = 1274;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Rear/Right/2/Actuator/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_RIGHT_2_ACTUATOR_DEVICE = 1275;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Rear/Right/2/Actuator/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_RIGHT_2_ACTUATOR_ERROR = 1276;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Rear/Right/2/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_RIGHT_2_ACTUATOR_GAIN = 1277;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Rear/Right/2/Actuator/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_RIGHT_2_ACTUATOR_MAX = 1278;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Rear/Right/2/Actuator/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_RIGHT_2_ACTUATOR_MIN = 1279;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Rear/Right/2/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_RIGHT_2_ACTUATOR_NACK = 1280;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Rear/Right/2/Actuator/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_RIGHT_2_ACTUATOR_OFFSET = 1281;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Rear/Right/2/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_RIGHT_2_ACTUATOR_SUBDEVICENUMBER = 1282;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Led/Rear/Right/2/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_RIGHT_2_ACTUATOR_TYPE = 1283;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Led/Rear/Right/2/Actuator/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_LED_REAR_RIGHT_2_ACTUATOR_VALUE = 1284;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Touch/Front/Sensor/Ack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_TOUCH_FRONT_SENSOR_ACK = 1285;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Touch/Front/Sensor/Device as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_TOUCH_FRONT_SENSOR_DEVICE = 1286;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Touch/Front/Sensor/Error as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_TOUCH_FRONT_SENSOR_ERROR = 1287;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Touch/Front/Sensor/Gain as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_TOUCH_FRONT_SENSOR_GAIN = 1288;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Touch/Front/Sensor/Max as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_TOUCH_FRONT_SENSOR_MAX = 1289;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Touch/Front/Sensor/Min as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_TOUCH_FRONT_SENSOR_MIN = 1290;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Touch/Front/Sensor/Nack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_TOUCH_FRONT_SENSOR_NACK = 1291;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Touch/Front/Sensor/Offset as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_TOUCH_FRONT_SENSOR_OFFSET = 1292;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Touch/Front/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_TOUCH_FRONT_SENSOR_SUBDEVICENUMBER = 1293;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Touch/Front/Sensor/Type as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_TOUCH_FRONT_SENSOR_TYPE = 1294;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Touch/Front/Sensor/Value as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_TOUCH_FRONT_SENSOR_VALUE = 1295;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Touch/Middle/Sensor/Ack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_TOUCH_MIDDLE_SENSOR_ACK = 1296;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Touch/Middle/Sensor/Device as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_TOUCH_MIDDLE_SENSOR_DEVICE = 1297;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Touch/Middle/Sensor/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_TOUCH_MIDDLE_SENSOR_ERROR = 1298;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Touch/Middle/Sensor/Gain as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_TOUCH_MIDDLE_SENSOR_GAIN = 1299;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Touch/Middle/Sensor/Max as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_TOUCH_MIDDLE_SENSOR_MAX = 1300;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Touch/Middle/Sensor/Min as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_TOUCH_MIDDLE_SENSOR_MIN = 1301;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Touch/Middle/Sensor/Nack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_TOUCH_MIDDLE_SENSOR_NACK = 1302;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Touch/Middle/Sensor/Offset as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_TOUCH_MIDDLE_SENSOR_OFFSET = 1303;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Touch/Middle/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_TOUCH_MIDDLE_SENSOR_SUBDEVICENUMBER = 1304;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Touch/Middle/Sensor/Type as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_TOUCH_MIDDLE_SENSOR_TYPE = 1305;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Touch/Middle/Sensor/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_TOUCH_MIDDLE_SENSOR_VALUE = 1306;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Touch/Rear/Sensor/Ack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_TOUCH_REAR_SENSOR_ACK = 1307;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Touch/Rear/Sensor/Device as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_TOUCH_REAR_SENSOR_DEVICE = 1308;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Touch/Rear/Sensor/Error as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_TOUCH_REAR_SENSOR_ERROR = 1309;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Touch/Rear/Sensor/Gain as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_TOUCH_REAR_SENSOR_GAIN = 1310;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Touch/Rear/Sensor/Max as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_TOUCH_REAR_SENSOR_MAX = 1311;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Touch/Rear/Sensor/Min as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_TOUCH_REAR_SENSOR_MIN = 1312;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Touch/Rear/Sensor/Nack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_TOUCH_REAR_SENSOR_NACK = 1313;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Touch/Rear/Sensor/Offset as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_TOUCH_REAR_SENSOR_OFFSET = 1314;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/Head/Touch/Rear/Sensor/SubDeviceNumber as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_TOUCH_REAR_SENSOR_SUBDEVICENUMBER = 1315;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Touch/Rear/Sensor/Type as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_TOUCH_REAR_SENSOR_TYPE = 1316;

	/**
	 * Id of the sensor Device/SubDeviceList/Head/Touch/Rear/Sensor/Value as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEAD_TOUCH_REAR_SENSOR_VALUE = 1317;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadPitch/ElectricCurrent/Sensor/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_ELECTRICCURRENT_SENSOR_ACK = 1318;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadPitch/ElectricCurrent/Sensor/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_ELECTRICCURRENT_SENSOR_DEVICE = 1319;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadPitch/ElectricCurrent/Sensor/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_ELECTRICCURRENT_SENSOR_ERROR = 1320;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadPitch/ElectricCurrent/Sensor/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_ELECTRICCURRENT_SENSOR_GAIN = 1321;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadPitch/ElectricCurrent/Sensor/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_ELECTRICCURRENT_SENSOR_MAX = 1322;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadPitch/ElectricCurrent/Sensor/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_ELECTRICCURRENT_SENSOR_MIN = 1323;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadPitch/ElectricCurrent/Sensor/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_ELECTRICCURRENT_SENSOR_NACK = 1324;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadPitch/ElectricCurrent/Sensor/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_ELECTRICCURRENT_SENSOR_OFFSET = 1325;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadPitch/ElectricCurrent/Sensor/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_ELECTRICCURRENT_SENSOR_SUBDEVICENUMBER = 1326;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadPitch/ElectricCurrent/Sensor/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_ELECTRICCURRENT_SENSOR_TYPE = 1327;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadPitch/ElectricCurrent/Sensor/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_ELECTRICCURRENT_SENSOR_VALUE = 1328;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Hardness/Actuator/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_HARDNESS_ACTUATOR_ACK = 1329;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Hardness/Actuator/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_HARDNESS_ACTUATOR_DEVICE = 1330;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Hardness/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_HARDNESS_ACTUATOR_ERROR = 1331;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Hardness/Actuator/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_HARDNESS_ACTUATOR_GAIN = 1332;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Hardness/Actuator/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_HARDNESS_ACTUATOR_MAX = 1333;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Hardness/Actuator/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_HARDNESS_ACTUATOR_MIN = 1334;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Hardness/Actuator/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_HARDNESS_ACTUATOR_NACK = 1335;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Hardness/Actuator/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_HARDNESS_ACTUATOR_OFFSET = 1336;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadPitch/Hardness/Actuator/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_HARDNESS_ACTUATOR_SUBDEVICENUMBER = 1337;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Hardness/Actuator/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_HARDNESS_ACTUATOR_TYPE = 1338;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Hardness/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_HARDNESS_ACTUATOR_VALUE = 1339;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Position/Actuator/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_POSITION_ACTUATOR_ACK = 1340;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Position/Actuator/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_POSITION_ACTUATOR_DEVICE = 1341;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Position/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_POSITION_ACTUATOR_ERROR = 1342;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Position/Actuator/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_POSITION_ACTUATOR_GAIN = 1343;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Position/Actuator/IMax as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_POSITION_ACTUATOR_IMAX = 1344;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadPitch/Position/Actuator/InvertControlDirection
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_POSITION_ACTUATOR_INVERTCONTROLDIRECTION = 1345;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Position/Actuator/Kd as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_POSITION_ACTUATOR_KD = 1346;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Position/Actuator/Ki as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_POSITION_ACTUATOR_KI = 1347;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Position/Actuator/Kp as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_POSITION_ACTUATOR_KP = 1348;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Position/Actuator/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_POSITION_ACTUATOR_MAX = 1349;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Position/Actuator/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_POSITION_ACTUATOR_MIN = 1350;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadPitch/Position/Actuator/MotorNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_POSITION_ACTUATOR_MOTORNUMBER = 1351;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Position/Actuator/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_POSITION_ACTUATOR_NACK = 1352;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Position/Actuator/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_POSITION_ACTUATOR_OFFSET = 1353;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadPitch/Position/Actuator/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_POSITION_ACTUATOR_SUBDEVICENUMBER = 1354;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Position/Actuator/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_POSITION_ACTUATOR_TYPE = 1355;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Position/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_POSITION_ACTUATOR_VALUE = 1356;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Position/Sensor/Ack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_POSITION_SENSOR_ACK = 1357;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Position/Sensor/Device as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_POSITION_SENSOR_DEVICE = 1358;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Position/Sensor/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_POSITION_SENSOR_ERROR = 1359;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Position/Sensor/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_POSITION_SENSOR_GAIN = 1360;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Position/Sensor/GearRatio
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_POSITION_SENSOR_GEARRATIO = 1361;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Position/Sensor/Limit as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_POSITION_SENSOR_LIMIT = 1362;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Position/Sensor/Max as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_POSITION_SENSOR_MAX = 1363;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Position/Sensor/Min as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_POSITION_SENSOR_MIN = 1364;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Position/Sensor/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_POSITION_SENSOR_NACK = 1365;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Position/Sensor/Offset as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_POSITION_SENSOR_OFFSET = 1366;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadPitch/Position/Sensor/SensorType as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_POSITION_SENSOR_SENSORTYPE = 1367;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadPitch/Position/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_POSITION_SENSOR_SUBDEVICENUMBER = 1368;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Position/Sensor/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_POSITION_SENSOR_TYPE = 1369;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Position/Sensor/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_POSITION_SENSOR_VALUE = 1370;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadPitch/Position/Sensor/jointZeroPosition as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_POSITION_SENSOR_JOINTZEROPOSITION = 1371;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadPitch/Position/Sensor/positionChainMREJoint as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_POSITION_SENSOR_POSITIONCHAINMREJOINT = 1372;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadPitch/Position/Sensor/positionChainMREMotor as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_POSITION_SENSOR_POSITIONCHAINMREMOTOR = 1373;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Temperature/Sensor/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_TEMPERATURE_SENSOR_ACK = 1374;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadPitch/Temperature/Sensor/AmbientTemperature as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_TEMPERATURE_SENSOR_AMBIENTTEMPERATURE = 1375;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Temperature/Sensor/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_TEMPERATURE_SENSOR_DEVICE = 1376;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Temperature/Sensor/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_TEMPERATURE_SENSOR_ERROR = 1377;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Temperature/Sensor/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_TEMPERATURE_SENSOR_GAIN = 1378;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Temperature/Sensor/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_TEMPERATURE_SENSOR_MAX = 1379;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Temperature/Sensor/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_TEMPERATURE_SENSOR_MIN = 1380;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Temperature/Sensor/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_TEMPERATURE_SENSOR_NACK = 1381;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Temperature/Sensor/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_TEMPERATURE_SENSOR_OFFSET = 1382;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Temperature/Sensor/
	 * OtherMotorTransmission as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_TEMPERATURE_SENSOR_OTHERMOTORTRANSMISSION = 1383;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadPitch/Temperature/Sensor/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_TEMPERATURE_SENSOR_SUBDEVICENUMBER = 1384;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadPitch/Temperature/Sensor/ThermalResistance as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_TEMPERATURE_SENSOR_THERMALRESISTANCE = 1385;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadPitch/Temperature/Sensor/ThermalTimeConstant as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_TEMPERATURE_SENSOR_THERMALTIMECONSTANT = 1386;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Temperature/Sensor/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_TEMPERATURE_SENSOR_TYPE = 1387;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadPitch/Temperature/Sensor/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_TEMPERATURE_SENSOR_VALUE = 1388;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadPitch/Temperature/Sensor/motorModel as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_TEMPERATURE_SENSOR_MOTORMODEL = 1389;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/ElectricCurrent/Sensor/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_ELECTRICCURRENT_SENSOR_ACK = 1390;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadYaw/ElectricCurrent/Sensor/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_ELECTRICCURRENT_SENSOR_DEVICE = 1391;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadYaw/ElectricCurrent/Sensor/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_ELECTRICCURRENT_SENSOR_ERROR = 1392;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/ElectricCurrent/Sensor/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_ELECTRICCURRENT_SENSOR_GAIN = 1393;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/ElectricCurrent/Sensor/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_ELECTRICCURRENT_SENSOR_MAX = 1394;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/ElectricCurrent/Sensor/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_ELECTRICCURRENT_SENSOR_MIN = 1395;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/ElectricCurrent/Sensor/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_ELECTRICCURRENT_SENSOR_NACK = 1396;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadYaw/ElectricCurrent/Sensor/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_ELECTRICCURRENT_SENSOR_OFFSET = 1397;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadYaw/ElectricCurrent/Sensor/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_ELECTRICCURRENT_SENSOR_SUBDEVICENUMBER = 1398;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/ElectricCurrent/Sensor/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_ELECTRICCURRENT_SENSOR_TYPE = 1399;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadYaw/ElectricCurrent/Sensor/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_ELECTRICCURRENT_SENSOR_VALUE = 1400;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Hardness/Actuator/Ack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_HARDNESS_ACTUATOR_ACK = 1401;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Hardness/Actuator/Device as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_HARDNESS_ACTUATOR_DEVICE = 1402;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Hardness/Actuator/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_HARDNESS_ACTUATOR_ERROR = 1403;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Hardness/Actuator/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_HARDNESS_ACTUATOR_GAIN = 1404;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Hardness/Actuator/Max as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_HARDNESS_ACTUATOR_MAX = 1405;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Hardness/Actuator/Min as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_HARDNESS_ACTUATOR_MIN = 1406;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Hardness/Actuator/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_HARDNESS_ACTUATOR_NACK = 1407;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Hardness/Actuator/Offset as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_HARDNESS_ACTUATOR_OFFSET = 1408;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadYaw/Hardness/Actuator/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_HARDNESS_ACTUATOR_SUBDEVICENUMBER = 1409;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Hardness/Actuator/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_HARDNESS_ACTUATOR_TYPE = 1410;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Hardness/Actuator/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_HARDNESS_ACTUATOR_VALUE = 1411;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Position/Actuator/Ack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_POSITION_ACTUATOR_ACK = 1412;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Position/Actuator/Device as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_POSITION_ACTUATOR_DEVICE = 1413;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Position/Actuator/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_POSITION_ACTUATOR_ERROR = 1414;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Position/Actuator/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_POSITION_ACTUATOR_GAIN = 1415;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Position/Actuator/IMax as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_POSITION_ACTUATOR_IMAX = 1416;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadYaw/Position/Actuator/InvertControlDirection as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_POSITION_ACTUATOR_INVERTCONTROLDIRECTION = 1417;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Position/Actuator/Kd as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_POSITION_ACTUATOR_KD = 1418;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Position/Actuator/Ki as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_POSITION_ACTUATOR_KI = 1419;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Position/Actuator/Kp as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_POSITION_ACTUATOR_KP = 1420;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Position/Actuator/Max as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_POSITION_ACTUATOR_MAX = 1421;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Position/Actuator/Min as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_POSITION_ACTUATOR_MIN = 1422;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadYaw/Position/Actuator/MotorNumber as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_POSITION_ACTUATOR_MOTORNUMBER = 1423;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Position/Actuator/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_POSITION_ACTUATOR_NACK = 1424;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Position/Actuator/Offset as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_POSITION_ACTUATOR_OFFSET = 1425;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadYaw/Position/Actuator/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_POSITION_ACTUATOR_SUBDEVICENUMBER = 1426;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Position/Actuator/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_POSITION_ACTUATOR_TYPE = 1427;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Position/Actuator/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_POSITION_ACTUATOR_VALUE = 1428;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Position/Sensor/Ack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_POSITION_SENSOR_ACK = 1429;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Position/Sensor/Device as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_POSITION_SENSOR_DEVICE = 1430;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Position/Sensor/Error as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_POSITION_SENSOR_ERROR = 1431;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Position/Sensor/Gain as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_POSITION_SENSOR_GAIN = 1432;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Position/Sensor/GearRatio
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_POSITION_SENSOR_GEARRATIO = 1433;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Position/Sensor/Limit as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_POSITION_SENSOR_LIMIT = 1434;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Position/Sensor/Max as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_POSITION_SENSOR_MAX = 1435;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Position/Sensor/Min as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_POSITION_SENSOR_MIN = 1436;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Position/Sensor/Nack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_POSITION_SENSOR_NACK = 1437;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Position/Sensor/Offset as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_POSITION_SENSOR_OFFSET = 1438;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Position/Sensor/SensorType
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_POSITION_SENSOR_SENSORTYPE = 1439;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadYaw/Position/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_POSITION_SENSOR_SUBDEVICENUMBER = 1440;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Position/Sensor/Type as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_POSITION_SENSOR_TYPE = 1441;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Position/Sensor/Value as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_POSITION_SENSOR_VALUE = 1442;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadYaw/Position/Sensor/jointZeroPosition as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_POSITION_SENSOR_JOINTZEROPOSITION = 1443;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadYaw/Position/Sensor/positionChainMREJoint as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_POSITION_SENSOR_POSITIONCHAINMREJOINT = 1444;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadYaw/Position/Sensor/positionChainMREMotor as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_POSITION_SENSOR_POSITIONCHAINMREMOTOR = 1445;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Temperature/Sensor/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_TEMPERATURE_SENSOR_ACK = 1446;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadYaw/Temperature/Sensor/AmbientTemperature as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_TEMPERATURE_SENSOR_AMBIENTTEMPERATURE = 1447;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Temperature/Sensor/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_TEMPERATURE_SENSOR_DEVICE = 1448;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Temperature/Sensor/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_TEMPERATURE_SENSOR_ERROR = 1449;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Temperature/Sensor/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_TEMPERATURE_SENSOR_GAIN = 1450;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Temperature/Sensor/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_TEMPERATURE_SENSOR_MAX = 1451;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Temperature/Sensor/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_TEMPERATURE_SENSOR_MIN = 1452;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Temperature/Sensor/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_TEMPERATURE_SENSOR_NACK = 1453;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Temperature/Sensor/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_TEMPERATURE_SENSOR_OFFSET = 1454;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadYaw/Temperature/Sensor/OtherMotorTransmission as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_TEMPERATURE_SENSOR_OTHERMOTORTRANSMISSION = 1455;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadYaw/Temperature/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_TEMPERATURE_SENSOR_SUBDEVICENUMBER = 1456;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadYaw/Temperature/Sensor/ThermalResistance as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_TEMPERATURE_SENSOR_THERMALRESISTANCE = 1457;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadYaw/Temperature/Sensor/ThermalTimeConstant as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_TEMPERATURE_SENSOR_THERMALTIMECONSTANT = 1458;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Temperature/Sensor/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_TEMPERATURE_SENSOR_TYPE = 1459;

	/**
	 * Id of the sensor Device/SubDeviceList/HeadYaw/Temperature/Sensor/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_TEMPERATURE_SENSOR_VALUE = 1460;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/HeadYaw/Temperature/Sensor/motorModel as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_TEMPERATURE_SENSOR_MOTORMODEL = 1461;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AccX/Sensor/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ACCX_SENSOR_ACK = 1462;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AccX/Sensor/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ACCX_SENSOR_DEVICE = 1463;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AccX/Sensor/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ACCX_SENSOR_ERROR = 1464;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AccX/Sensor/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ACCX_SENSOR_GAIN = 1465;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AccX/Sensor/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ACCX_SENSOR_MAX = 1466;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AccX/Sensor/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ACCX_SENSOR_MIN = 1467;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AccX/Sensor/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ACCX_SENSOR_NACK = 1468;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AccX/Sensor/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ACCX_SENSOR_OFFSET = 1469;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/InertialSensor/AccX/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ACCX_SENSOR_SUBDEVICENUMBER = 1470;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AccX/Sensor/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ACCX_SENSOR_TYPE = 1471;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AccX/Sensor/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ACCX_SENSOR_VALUE = 1472;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AccY/Sensor/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ACCY_SENSOR_ACK = 1473;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AccY/Sensor/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ACCY_SENSOR_DEVICE = 1474;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AccY/Sensor/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ACCY_SENSOR_ERROR = 1475;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AccY/Sensor/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ACCY_SENSOR_GAIN = 1476;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AccY/Sensor/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ACCY_SENSOR_MAX = 1477;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AccY/Sensor/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ACCY_SENSOR_MIN = 1478;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AccY/Sensor/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ACCY_SENSOR_NACK = 1479;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AccY/Sensor/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ACCY_SENSOR_OFFSET = 1480;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/InertialSensor/AccY/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ACCY_SENSOR_SUBDEVICENUMBER = 1481;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AccY/Sensor/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ACCY_SENSOR_TYPE = 1482;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AccY/Sensor/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ACCY_SENSOR_VALUE = 1483;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AccZ/Sensor/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ACCZ_SENSOR_ACK = 1484;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AccZ/Sensor/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ACCZ_SENSOR_DEVICE = 1485;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AccZ/Sensor/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ACCZ_SENSOR_ERROR = 1486;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AccZ/Sensor/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ACCZ_SENSOR_GAIN = 1487;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AccZ/Sensor/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ACCZ_SENSOR_MAX = 1488;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AccZ/Sensor/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ACCZ_SENSOR_MIN = 1489;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AccZ/Sensor/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ACCZ_SENSOR_NACK = 1490;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AccZ/Sensor/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ACCZ_SENSOR_OFFSET = 1491;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/InertialSensor/AccZ/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ACCZ_SENSOR_SUBDEVICENUMBER = 1492;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AccZ/Sensor/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ACCZ_SENSOR_TYPE = 1493;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AccZ/Sensor/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ACCZ_SENSOR_VALUE = 1494;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AngleX/Sensor/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ANGLEX_SENSOR_ACK = 1495;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AngleX/Sensor/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ANGLEX_SENSOR_DEVICE = 1496;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AngleX/Sensor/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ANGLEX_SENSOR_ERROR = 1497;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AngleX/Sensor/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ANGLEX_SENSOR_GAIN = 1498;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AngleX/Sensor/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ANGLEX_SENSOR_MAX = 1499;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AngleX/Sensor/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ANGLEX_SENSOR_MIN = 1500;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AngleX/Sensor/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ANGLEX_SENSOR_NACK = 1501;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AngleX/Sensor/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ANGLEX_SENSOR_OFFSET = 1502;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/InertialSensor/AngleX/Sensor/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ANGLEX_SENSOR_SUBDEVICENUMBER = 1503;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AngleX/Sensor/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ANGLEX_SENSOR_TYPE = 1504;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AngleX/Sensor/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ANGLEX_SENSOR_VALUE = 1505;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AngleY/Sensor/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ANGLEY_SENSOR_ACK = 1506;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AngleY/Sensor/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ANGLEY_SENSOR_DEVICE = 1507;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AngleY/Sensor/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ANGLEY_SENSOR_ERROR = 1508;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AngleY/Sensor/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ANGLEY_SENSOR_GAIN = 1509;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AngleY/Sensor/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ANGLEY_SENSOR_MAX = 1510;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AngleY/Sensor/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ANGLEY_SENSOR_MIN = 1511;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AngleY/Sensor/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ANGLEY_SENSOR_NACK = 1512;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AngleY/Sensor/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ANGLEY_SENSOR_OFFSET = 1513;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/InertialSensor/AngleY/Sensor/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ANGLEY_SENSOR_SUBDEVICENUMBER = 1514;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AngleY/Sensor/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ANGLEY_SENSOR_TYPE = 1515;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/AngleY/Sensor/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_ANGLEY_SENSOR_VALUE = 1516;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/GyrRef/Sensor/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_GYRREF_SENSOR_ACK = 1517;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/GyrRef/Sensor/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_GYRREF_SENSOR_DEVICE = 1518;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/GyrRef/Sensor/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_GYRREF_SENSOR_ERROR = 1519;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/GyrRef/Sensor/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_GYRREF_SENSOR_GAIN = 1520;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/GyrRef/Sensor/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_GYRREF_SENSOR_MAX = 1521;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/GyrRef/Sensor/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_GYRREF_SENSOR_MIN = 1522;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/GyrRef/Sensor/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_GYRREF_SENSOR_NACK = 1523;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/GyrRef/Sensor/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_GYRREF_SENSOR_OFFSET = 1524;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/InertialSensor/GyrRef/Sensor/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_GYRREF_SENSOR_SUBDEVICENUMBER = 1525;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/GyrRef/Sensor/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_GYRREF_SENSOR_TYPE = 1526;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/GyrRef/Sensor/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_GYRREF_SENSOR_VALUE = 1527;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/GyrX/Sensor/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_GYRX_SENSOR_ACK = 1528;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/GyrX/Sensor/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_GYRX_SENSOR_DEVICE = 1529;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/GyrX/Sensor/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_GYRX_SENSOR_ERROR = 1530;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/GyrX/Sensor/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_GYRX_SENSOR_GAIN = 1531;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/GyrX/Sensor/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_GYRX_SENSOR_MAX = 1532;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/GyrX/Sensor/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_GYRX_SENSOR_MIN = 1533;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/GyrX/Sensor/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_GYRX_SENSOR_NACK = 1534;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/GyrX/Sensor/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_GYRX_SENSOR_OFFSET = 1535;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/InertialSensor/GyrX/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_GYRX_SENSOR_SUBDEVICENUMBER = 1536;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/GyrX/Sensor/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_GYRX_SENSOR_TYPE = 1537;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/GyrX/Sensor/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_GYRX_SENSOR_VALUE = 1538;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/GyrY/Sensor/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_GYRY_SENSOR_ACK = 1539;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/GyrY/Sensor/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_GYRY_SENSOR_DEVICE = 1540;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/GyrY/Sensor/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_GYRY_SENSOR_ERROR = 1541;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/GyrY/Sensor/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_GYRY_SENSOR_GAIN = 1542;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/GyrY/Sensor/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_GYRY_SENSOR_MAX = 1543;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/GyrY/Sensor/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_GYRY_SENSOR_MIN = 1544;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/GyrY/Sensor/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_GYRY_SENSOR_NACK = 1545;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/GyrY/Sensor/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_GYRY_SENSOR_OFFSET = 1546;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/InertialSensor/GyrY/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_GYRY_SENSOR_SUBDEVICENUMBER = 1547;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/GyrY/Sensor/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_GYRY_SENSOR_TYPE = 1548;

	/**
	 * Id of the sensor Device/SubDeviceList/InertialSensor/GyrY/Sensor/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_INERTIALSENSOR_GYRY_SENSOR_VALUE = 1549;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnklePitch/ElectricCurrent/Sensor/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_ELECTRICCURRENT_SENSOR_ACK = 1550;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnklePitch/ElectricCurrent/Sensor/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_ELECTRICCURRENT_SENSOR_DEVICE = 1551;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnklePitch/ElectricCurrent/Sensor/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_ELECTRICCURRENT_SENSOR_ERROR = 1552;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnklePitch/ElectricCurrent/Sensor/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_ELECTRICCURRENT_SENSOR_GAIN = 1553;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnklePitch/ElectricCurrent/Sensor/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_ELECTRICCURRENT_SENSOR_MAX = 1554;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnklePitch/ElectricCurrent/Sensor/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_ELECTRICCURRENT_SENSOR_MIN = 1555;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnklePitch/ElectricCurrent/Sensor/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_ELECTRICCURRENT_SENSOR_NACK = 1556;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnklePitch/ElectricCurrent/Sensor/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_ELECTRICCURRENT_SENSOR_OFFSET = 1557;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnklePitch/ElectricCurrent/Sensor/SubDeviceNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_ELECTRICCURRENT_SENSOR_SUBDEVICENUMBER = 1558;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnklePitch/ElectricCurrent/Sensor/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_ELECTRICCURRENT_SENSOR_TYPE = 1559;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnklePitch/ElectricCurrent/Sensor/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_ELECTRICCURRENT_SENSOR_VALUE = 1560;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnklePitch/Hardness/Actuator/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_HARDNESS_ACTUATOR_ACK = 1561;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnklePitch/Hardness/Actuator/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_HARDNESS_ACTUATOR_DEVICE = 1562;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnklePitch/Hardness/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_HARDNESS_ACTUATOR_ERROR = 1563;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnklePitch/Hardness/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_HARDNESS_ACTUATOR_GAIN = 1564;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnklePitch/Hardness/Actuator/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_HARDNESS_ACTUATOR_MAX = 1565;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnklePitch/Hardness/Actuator/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_HARDNESS_ACTUATOR_MIN = 1566;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnklePitch/Hardness/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_HARDNESS_ACTUATOR_NACK = 1567;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnklePitch/Hardness/Actuator/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_HARDNESS_ACTUATOR_OFFSET = 1568;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnklePitch/Hardness/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_HARDNESS_ACTUATOR_SUBDEVICENUMBER = 1569;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnklePitch/Hardness/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_HARDNESS_ACTUATOR_TYPE = 1570;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnklePitch/Hardness/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_HARDNESS_ACTUATOR_VALUE = 1571;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnklePitch/Position/Actuator/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_POSITION_ACTUATOR_ACK = 1572;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnklePitch/Position/Actuator/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_POSITION_ACTUATOR_DEVICE = 1573;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnklePitch/Position/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_POSITION_ACTUATOR_ERROR = 1574;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnklePitch/Position/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_POSITION_ACTUATOR_GAIN = 1575;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnklePitch/Position/Actuator/IMax
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_POSITION_ACTUATOR_IMAX = 1576;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnklePitch/Position/Actuator/
	 * InvertControlDirection as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_POSITION_ACTUATOR_INVERTCONTROLDIRECTION = 1577;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnklePitch/Position/Actuator/Kd as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_POSITION_ACTUATOR_KD = 1578;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnklePitch/Position/Actuator/Ki as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_POSITION_ACTUATOR_KI = 1579;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnklePitch/Position/Actuator/Kp as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_POSITION_ACTUATOR_KP = 1580;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnklePitch/Position/Actuator/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_POSITION_ACTUATOR_MAX = 1581;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnklePitch/Position/Actuator/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_POSITION_ACTUATOR_MIN = 1582;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnklePitch/Position/Actuator/MotorNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_POSITION_ACTUATOR_MOTORNUMBER = 1583;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnklePitch/Position/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_POSITION_ACTUATOR_NACK = 1584;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnklePitch/Position/Actuator/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_POSITION_ACTUATOR_OFFSET = 1585;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnklePitch/Position/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_POSITION_ACTUATOR_SUBDEVICENUMBER = 1586;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnklePitch/Position/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_POSITION_ACTUATOR_TYPE = 1587;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnklePitch/Position/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_POSITION_ACTUATOR_VALUE = 1588;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnklePitch/Position/Sensor/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_POSITION_SENSOR_ACK = 1589;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnklePitch/Position/Sensor/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_POSITION_SENSOR_DEVICE = 1590;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnklePitch/Position/Sensor/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_POSITION_SENSOR_ERROR = 1591;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnklePitch/Position/Sensor/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_POSITION_SENSOR_GAIN = 1592;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnklePitch/Position/Sensor/GearRatio as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_POSITION_SENSOR_GEARRATIO = 1593;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnklePitch/Position/Sensor/Limit
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_POSITION_SENSOR_LIMIT = 1594;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnklePitch/Position/Sensor/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_POSITION_SENSOR_MAX = 1595;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnklePitch/Position/Sensor/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_POSITION_SENSOR_MIN = 1596;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnklePitch/Position/Sensor/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_POSITION_SENSOR_NACK = 1597;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnklePitch/Position/Sensor/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_POSITION_SENSOR_OFFSET = 1598;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnklePitch/Position/Sensor/SensorType as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_POSITION_SENSOR_SENSORTYPE = 1599;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnklePitch/Position/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_POSITION_SENSOR_SUBDEVICENUMBER = 1600;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnklePitch/Position/Sensor/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_POSITION_SENSOR_TYPE = 1601;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnklePitch/Position/Sensor/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_POSITION_SENSOR_VALUE = 1602;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnklePitch/Position/Sensor/jointZeroPosition as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_POSITION_SENSOR_JOINTZEROPOSITION = 1603;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnklePitch/Position/Sensor/positionChainMREJoint as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_POSITION_SENSOR_POSITIONCHAINMREJOINT = 1604;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnklePitch/Position/Sensor/positionChainMREMotor as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_POSITION_SENSOR_POSITIONCHAINMREMOTOR = 1605;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnklePitch/Temperature/Sensor/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_TEMPERATURE_SENSOR_ACK = 1606;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnklePitch/Temperature/Sensor/AmbientTemperature as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_TEMPERATURE_SENSOR_AMBIENTTEMPERATURE = 1607;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnklePitch/Temperature/Sensor/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_TEMPERATURE_SENSOR_DEVICE = 1608;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnklePitch/Temperature/Sensor/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_TEMPERATURE_SENSOR_ERROR = 1609;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnklePitch/Temperature/Sensor/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_TEMPERATURE_SENSOR_GAIN = 1610;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnklePitch/Temperature/Sensor/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_TEMPERATURE_SENSOR_MAX = 1611;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnklePitch/Temperature/Sensor/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_TEMPERATURE_SENSOR_MIN = 1612;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnklePitch/Temperature/Sensor/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_TEMPERATURE_SENSOR_NACK = 1613;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnklePitch/Temperature/Sensor/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_TEMPERATURE_SENSOR_OFFSET = 1614;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnklePitch/Temperature/Sensor/
	 * OtherMotorTransmission as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_TEMPERATURE_SENSOR_OTHERMOTORTRANSMISSION = 1615;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnklePitch/Temperature/Sensor/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_TEMPERATURE_SENSOR_SUBDEVICENUMBER = 1616;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnklePitch/Temperature/Sensor/ThermalResistance as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_TEMPERATURE_SENSOR_THERMALRESISTANCE = 1617;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnklePitch/Temperature/Sensor/ThermalTimeConstant
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_TEMPERATURE_SENSOR_THERMALTIMECONSTANT = 1618;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnklePitch/Temperature/Sensor/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_TEMPERATURE_SENSOR_TYPE = 1619;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnklePitch/Temperature/Sensor/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_TEMPERATURE_SENSOR_VALUE = 1620;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnklePitch/Temperature/Sensor/motorModel as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_TEMPERATURE_SENSOR_MOTORMODEL = 1621;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnkleRoll/ElectricCurrent/Sensor/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_ELECTRICCURRENT_SENSOR_ACK = 1622;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnkleRoll/ElectricCurrent/Sensor/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_ELECTRICCURRENT_SENSOR_DEVICE = 1623;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnkleRoll/ElectricCurrent/Sensor/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_ELECTRICCURRENT_SENSOR_ERROR = 1624;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnkleRoll/ElectricCurrent/Sensor/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_ELECTRICCURRENT_SENSOR_GAIN = 1625;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnkleRoll/ElectricCurrent/Sensor/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_ELECTRICCURRENT_SENSOR_MAX = 1626;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnkleRoll/ElectricCurrent/Sensor/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_ELECTRICCURRENT_SENSOR_MIN = 1627;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnkleRoll/ElectricCurrent/Sensor/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_ELECTRICCURRENT_SENSOR_NACK = 1628;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnkleRoll/ElectricCurrent/Sensor/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_ELECTRICCURRENT_SENSOR_OFFSET = 1629;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnkleRoll/ElectricCurrent/Sensor/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_ELECTRICCURRENT_SENSOR_SUBDEVICENUMBER = 1630;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnkleRoll/ElectricCurrent/Sensor/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_ELECTRICCURRENT_SENSOR_TYPE = 1631;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnkleRoll/ElectricCurrent/Sensor/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_ELECTRICCURRENT_SENSOR_VALUE = 1632;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Hardness/Actuator/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_HARDNESS_ACTUATOR_ACK = 1633;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Hardness/Actuator/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_HARDNESS_ACTUATOR_DEVICE = 1634;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Hardness/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_HARDNESS_ACTUATOR_ERROR = 1635;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Hardness/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_HARDNESS_ACTUATOR_GAIN = 1636;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Hardness/Actuator/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_HARDNESS_ACTUATOR_MAX = 1637;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Hardness/Actuator/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_HARDNESS_ACTUATOR_MIN = 1638;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Hardness/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_HARDNESS_ACTUATOR_NACK = 1639;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Hardness/Actuator/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_HARDNESS_ACTUATOR_OFFSET = 1640;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnkleRoll/Hardness/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_HARDNESS_ACTUATOR_SUBDEVICENUMBER = 1641;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Hardness/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_HARDNESS_ACTUATOR_TYPE = 1642;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Hardness/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_HARDNESS_ACTUATOR_VALUE = 1643;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Position/Actuator/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_POSITION_ACTUATOR_ACK = 1644;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Position/Actuator/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_POSITION_ACTUATOR_DEVICE = 1645;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Position/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_POSITION_ACTUATOR_ERROR = 1646;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Position/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_POSITION_ACTUATOR_GAIN = 1647;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Position/Actuator/IMax
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_POSITION_ACTUATOR_IMAX = 1648;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Position/Actuator/
	 * InvertControlDirection as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_POSITION_ACTUATOR_INVERTCONTROLDIRECTION = 1649;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Position/Actuator/Kd as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_POSITION_ACTUATOR_KD = 1650;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Position/Actuator/Ki as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_POSITION_ACTUATOR_KI = 1651;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Position/Actuator/Kp as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_POSITION_ACTUATOR_KP = 1652;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Position/Actuator/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_POSITION_ACTUATOR_MAX = 1653;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Position/Actuator/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_POSITION_ACTUATOR_MIN = 1654;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnkleRoll/Position/Actuator/MotorNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_POSITION_ACTUATOR_MOTORNUMBER = 1655;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Position/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_POSITION_ACTUATOR_NACK = 1656;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Position/Actuator/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_POSITION_ACTUATOR_OFFSET = 1657;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnkleRoll/Position/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_POSITION_ACTUATOR_SUBDEVICENUMBER = 1658;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Position/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_POSITION_ACTUATOR_TYPE = 1659;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Position/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_POSITION_ACTUATOR_VALUE = 1660;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Position/Sensor/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_POSITION_SENSOR_ACK = 1661;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Position/Sensor/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_POSITION_SENSOR_DEVICE = 1662;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Position/Sensor/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_POSITION_SENSOR_ERROR = 1663;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Position/Sensor/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_POSITION_SENSOR_GAIN = 1664;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnkleRoll/Position/Sensor/GearRatio as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_POSITION_SENSOR_GEARRATIO = 1665;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Position/Sensor/Limit as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_POSITION_SENSOR_LIMIT = 1666;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Position/Sensor/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_POSITION_SENSOR_MAX = 1667;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Position/Sensor/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_POSITION_SENSOR_MIN = 1668;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Position/Sensor/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_POSITION_SENSOR_NACK = 1669;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Position/Sensor/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_POSITION_SENSOR_OFFSET = 1670;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnkleRoll/Position/Sensor/SensorType as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_POSITION_SENSOR_SENSORTYPE = 1671;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnkleRoll/Position/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_POSITION_SENSOR_SUBDEVICENUMBER = 1672;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Position/Sensor/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_POSITION_SENSOR_TYPE = 1673;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Position/Sensor/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_POSITION_SENSOR_VALUE = 1674;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnkleRoll/Position/Sensor/jointZeroPosition as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_POSITION_SENSOR_JOINTZEROPOSITION = 1675;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnkleRoll/Position/Sensor/positionChainMREJoint as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_POSITION_SENSOR_POSITIONCHAINMREJOINT = 1676;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnkleRoll/Position/Sensor/positionChainMREMotor as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_POSITION_SENSOR_POSITIONCHAINMREMOTOR = 1677;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Temperature/Sensor/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_TEMPERATURE_SENSOR_ACK = 1678;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnkleRoll/Temperature/Sensor/AmbientTemperature as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_TEMPERATURE_SENSOR_AMBIENTTEMPERATURE = 1679;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnkleRoll/Temperature/Sensor/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_TEMPERATURE_SENSOR_DEVICE = 1680;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Temperature/Sensor/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_TEMPERATURE_SENSOR_ERROR = 1681;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Temperature/Sensor/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_TEMPERATURE_SENSOR_GAIN = 1682;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Temperature/Sensor/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_TEMPERATURE_SENSOR_MAX = 1683;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Temperature/Sensor/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_TEMPERATURE_SENSOR_MIN = 1684;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Temperature/Sensor/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_TEMPERATURE_SENSOR_NACK = 1685;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnkleRoll/Temperature/Sensor/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_TEMPERATURE_SENSOR_OFFSET = 1686;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Temperature/Sensor/
	 * OtherMotorTransmission as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_TEMPERATURE_SENSOR_OTHERMOTORTRANSMISSION = 1687;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnkleRoll/Temperature/Sensor/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_TEMPERATURE_SENSOR_SUBDEVICENUMBER = 1688;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnkleRoll/Temperature/Sensor/ThermalResistance as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_TEMPERATURE_SENSOR_THERMALRESISTANCE = 1689;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnkleRoll/Temperature/Sensor/ThermalTimeConstant as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_TEMPERATURE_SENSOR_THERMALTIMECONSTANT = 1690;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Temperature/Sensor/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_TEMPERATURE_SENSOR_TYPE = 1691;

	/**
	 * Id of the sensor Device/SubDeviceList/LAnkleRoll/Temperature/Sensor/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_TEMPERATURE_SENSOR_VALUE = 1692;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LAnkleRoll/Temperature/Sensor/motorModel as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_TEMPERATURE_SENSOR_MOTORMODEL = 1693;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowRoll/ElectricCurrent/Sensor/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_ELECTRICCURRENT_SENSOR_ACK = 1694;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowRoll/ElectricCurrent/Sensor/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_ELECTRICCURRENT_SENSOR_DEVICE = 1695;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowRoll/ElectricCurrent/Sensor/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_ELECTRICCURRENT_SENSOR_ERROR = 1696;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowRoll/ElectricCurrent/Sensor/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_ELECTRICCURRENT_SENSOR_GAIN = 1697;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowRoll/ElectricCurrent/Sensor/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_ELECTRICCURRENT_SENSOR_MAX = 1698;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowRoll/ElectricCurrent/Sensor/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_ELECTRICCURRENT_SENSOR_MIN = 1699;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowRoll/ElectricCurrent/Sensor/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_ELECTRICCURRENT_SENSOR_NACK = 1700;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowRoll/ElectricCurrent/Sensor/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_ELECTRICCURRENT_SENSOR_OFFSET = 1701;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowRoll/ElectricCurrent/Sensor/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_ELECTRICCURRENT_SENSOR_SUBDEVICENUMBER = 1702;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowRoll/ElectricCurrent/Sensor/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_ELECTRICCURRENT_SENSOR_TYPE = 1703;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowRoll/ElectricCurrent/Sensor/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_ELECTRICCURRENT_SENSOR_VALUE = 1704;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Hardness/Actuator/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_HARDNESS_ACTUATOR_ACK = 1705;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Hardness/Actuator/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_HARDNESS_ACTUATOR_DEVICE = 1706;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Hardness/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_HARDNESS_ACTUATOR_ERROR = 1707;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Hardness/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_HARDNESS_ACTUATOR_GAIN = 1708;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Hardness/Actuator/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_HARDNESS_ACTUATOR_MAX = 1709;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Hardness/Actuator/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_HARDNESS_ACTUATOR_MIN = 1710;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Hardness/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_HARDNESS_ACTUATOR_NACK = 1711;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Hardness/Actuator/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_HARDNESS_ACTUATOR_OFFSET = 1712;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowRoll/Hardness/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_HARDNESS_ACTUATOR_SUBDEVICENUMBER = 1713;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Hardness/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_HARDNESS_ACTUATOR_TYPE = 1714;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Hardness/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_HARDNESS_ACTUATOR_VALUE = 1715;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Position/Actuator/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_POSITION_ACTUATOR_ACK = 1716;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Position/Actuator/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_POSITION_ACTUATOR_DEVICE = 1717;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Position/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_POSITION_ACTUATOR_ERROR = 1718;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Position/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_POSITION_ACTUATOR_GAIN = 1719;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Position/Actuator/IMax
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_POSITION_ACTUATOR_IMAX = 1720;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Position/Actuator/
	 * InvertControlDirection as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_POSITION_ACTUATOR_INVERTCONTROLDIRECTION = 1721;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Position/Actuator/Kd as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_POSITION_ACTUATOR_KD = 1722;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Position/Actuator/Ki as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_POSITION_ACTUATOR_KI = 1723;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Position/Actuator/Kp as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_POSITION_ACTUATOR_KP = 1724;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Position/Actuator/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_POSITION_ACTUATOR_MAX = 1725;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Position/Actuator/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_POSITION_ACTUATOR_MIN = 1726;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowRoll/Position/Actuator/MotorNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_POSITION_ACTUATOR_MOTORNUMBER = 1727;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Position/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_POSITION_ACTUATOR_NACK = 1728;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Position/Actuator/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_POSITION_ACTUATOR_OFFSET = 1729;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowRoll/Position/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_POSITION_ACTUATOR_SUBDEVICENUMBER = 1730;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Position/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_POSITION_ACTUATOR_TYPE = 1731;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Position/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_POSITION_ACTUATOR_VALUE = 1732;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Position/Sensor/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_POSITION_SENSOR_ACK = 1733;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Position/Sensor/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_POSITION_SENSOR_DEVICE = 1734;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Position/Sensor/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_POSITION_SENSOR_ERROR = 1735;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Position/Sensor/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_POSITION_SENSOR_GAIN = 1736;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowRoll/Position/Sensor/GearRatio as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_POSITION_SENSOR_GEARRATIO = 1737;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Position/Sensor/Limit as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_POSITION_SENSOR_LIMIT = 1738;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Position/Sensor/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_POSITION_SENSOR_MAX = 1739;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Position/Sensor/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_POSITION_SENSOR_MIN = 1740;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Position/Sensor/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_POSITION_SENSOR_NACK = 1741;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Position/Sensor/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_POSITION_SENSOR_OFFSET = 1742;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowRoll/Position/Sensor/SensorType as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_POSITION_SENSOR_SENSORTYPE = 1743;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowRoll/Position/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_POSITION_SENSOR_SUBDEVICENUMBER = 1744;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Position/Sensor/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_POSITION_SENSOR_TYPE = 1745;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Position/Sensor/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_POSITION_SENSOR_VALUE = 1746;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowRoll/Position/Sensor/jointZeroPosition as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_POSITION_SENSOR_JOINTZEROPOSITION = 1747;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowRoll/Position/Sensor/positionChainMREJoint as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_POSITION_SENSOR_POSITIONCHAINMREJOINT = 1748;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowRoll/Position/Sensor/positionChainMREMotor as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_POSITION_SENSOR_POSITIONCHAINMREMOTOR = 1749;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Temperature/Sensor/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_TEMPERATURE_SENSOR_ACK = 1750;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowRoll/Temperature/Sensor/AmbientTemperature as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_TEMPERATURE_SENSOR_AMBIENTTEMPERATURE = 1751;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowRoll/Temperature/Sensor/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_TEMPERATURE_SENSOR_DEVICE = 1752;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Temperature/Sensor/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_TEMPERATURE_SENSOR_ERROR = 1753;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Temperature/Sensor/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_TEMPERATURE_SENSOR_GAIN = 1754;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Temperature/Sensor/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_TEMPERATURE_SENSOR_MAX = 1755;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Temperature/Sensor/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_TEMPERATURE_SENSOR_MIN = 1756;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Temperature/Sensor/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_TEMPERATURE_SENSOR_NACK = 1757;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowRoll/Temperature/Sensor/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_TEMPERATURE_SENSOR_OFFSET = 1758;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Temperature/Sensor/
	 * OtherMotorTransmission as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_TEMPERATURE_SENSOR_OTHERMOTORTRANSMISSION = 1759;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowRoll/Temperature/Sensor/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_TEMPERATURE_SENSOR_SUBDEVICENUMBER = 1760;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowRoll/Temperature/Sensor/ThermalResistance as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_TEMPERATURE_SENSOR_THERMALRESISTANCE = 1761;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowRoll/Temperature/Sensor/ThermalTimeConstant as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_TEMPERATURE_SENSOR_THERMALTIMECONSTANT = 1762;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Temperature/Sensor/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_TEMPERATURE_SENSOR_TYPE = 1763;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowRoll/Temperature/Sensor/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_TEMPERATURE_SENSOR_VALUE = 1764;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowRoll/Temperature/Sensor/motorModel as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_TEMPERATURE_SENSOR_MOTORMODEL = 1765;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowYaw/ElectricCurrent/Sensor/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_ELECTRICCURRENT_SENSOR_ACK = 1766;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowYaw/ElectricCurrent/Sensor/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_ELECTRICCURRENT_SENSOR_DEVICE = 1767;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowYaw/ElectricCurrent/Sensor/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_ELECTRICCURRENT_SENSOR_ERROR = 1768;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowYaw/ElectricCurrent/Sensor/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_ELECTRICCURRENT_SENSOR_GAIN = 1769;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowYaw/ElectricCurrent/Sensor/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_ELECTRICCURRENT_SENSOR_MAX = 1770;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowYaw/ElectricCurrent/Sensor/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_ELECTRICCURRENT_SENSOR_MIN = 1771;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowYaw/ElectricCurrent/Sensor/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_ELECTRICCURRENT_SENSOR_NACK = 1772;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowYaw/ElectricCurrent/Sensor/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_ELECTRICCURRENT_SENSOR_OFFSET = 1773;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowYaw/ElectricCurrent/Sensor/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_ELECTRICCURRENT_SENSOR_SUBDEVICENUMBER = 1774;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowYaw/ElectricCurrent/Sensor/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_ELECTRICCURRENT_SENSOR_TYPE = 1775;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowYaw/ElectricCurrent/Sensor/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_ELECTRICCURRENT_SENSOR_VALUE = 1776;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Hardness/Actuator/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_HARDNESS_ACTUATOR_ACK = 1777;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Hardness/Actuator/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_HARDNESS_ACTUATOR_DEVICE = 1778;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Hardness/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_HARDNESS_ACTUATOR_ERROR = 1779;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Hardness/Actuator/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_HARDNESS_ACTUATOR_GAIN = 1780;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Hardness/Actuator/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_HARDNESS_ACTUATOR_MAX = 1781;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Hardness/Actuator/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_HARDNESS_ACTUATOR_MIN = 1782;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Hardness/Actuator/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_HARDNESS_ACTUATOR_NACK = 1783;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Hardness/Actuator/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_HARDNESS_ACTUATOR_OFFSET = 1784;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowYaw/Hardness/Actuator/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_HARDNESS_ACTUATOR_SUBDEVICENUMBER = 1785;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Hardness/Actuator/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_HARDNESS_ACTUATOR_TYPE = 1786;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Hardness/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_HARDNESS_ACTUATOR_VALUE = 1787;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Position/Actuator/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_POSITION_ACTUATOR_ACK = 1788;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Position/Actuator/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_POSITION_ACTUATOR_DEVICE = 1789;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Position/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_POSITION_ACTUATOR_ERROR = 1790;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Position/Actuator/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_POSITION_ACTUATOR_GAIN = 1791;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Position/Actuator/IMax as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_POSITION_ACTUATOR_IMAX = 1792;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowYaw/Position/Actuator/InvertControlDirection
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_POSITION_ACTUATOR_INVERTCONTROLDIRECTION = 1793;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Position/Actuator/Kd as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_POSITION_ACTUATOR_KD = 1794;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Position/Actuator/Ki as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_POSITION_ACTUATOR_KI = 1795;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Position/Actuator/Kp as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_POSITION_ACTUATOR_KP = 1796;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Position/Actuator/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_POSITION_ACTUATOR_MAX = 1797;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Position/Actuator/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_POSITION_ACTUATOR_MIN = 1798;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowYaw/Position/Actuator/MotorNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_POSITION_ACTUATOR_MOTORNUMBER = 1799;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Position/Actuator/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_POSITION_ACTUATOR_NACK = 1800;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Position/Actuator/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_POSITION_ACTUATOR_OFFSET = 1801;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowYaw/Position/Actuator/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_POSITION_ACTUATOR_SUBDEVICENUMBER = 1802;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Position/Actuator/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_POSITION_ACTUATOR_TYPE = 1803;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Position/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_POSITION_ACTUATOR_VALUE = 1804;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Position/Sensor/Ack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_POSITION_SENSOR_ACK = 1805;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Position/Sensor/Device as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_POSITION_SENSOR_DEVICE = 1806;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Position/Sensor/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_POSITION_SENSOR_ERROR = 1807;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Position/Sensor/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_POSITION_SENSOR_GAIN = 1808;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Position/Sensor/GearRatio
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_POSITION_SENSOR_GEARRATIO = 1809;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Position/Sensor/Limit as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_POSITION_SENSOR_LIMIT = 1810;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Position/Sensor/Max as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_POSITION_SENSOR_MAX = 1811;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Position/Sensor/Min as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_POSITION_SENSOR_MIN = 1812;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Position/Sensor/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_POSITION_SENSOR_NACK = 1813;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Position/Sensor/Offset as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_POSITION_SENSOR_OFFSET = 1814;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowYaw/Position/Sensor/SensorType as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_POSITION_SENSOR_SENSORTYPE = 1815;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowYaw/Position/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_POSITION_SENSOR_SUBDEVICENUMBER = 1816;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Position/Sensor/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_POSITION_SENSOR_TYPE = 1817;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Position/Sensor/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_POSITION_SENSOR_VALUE = 1818;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowYaw/Position/Sensor/jointZeroPosition as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_POSITION_SENSOR_JOINTZEROPOSITION = 1819;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowYaw/Position/Sensor/positionChainMREJoint as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_POSITION_SENSOR_POSITIONCHAINMREJOINT = 1820;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowYaw/Position/Sensor/positionChainMREMotor as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_POSITION_SENSOR_POSITIONCHAINMREMOTOR = 1821;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Temperature/Sensor/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_TEMPERATURE_SENSOR_ACK = 1822;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowYaw/Temperature/Sensor/AmbientTemperature as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_TEMPERATURE_SENSOR_AMBIENTTEMPERATURE = 1823;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Temperature/Sensor/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_TEMPERATURE_SENSOR_DEVICE = 1824;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Temperature/Sensor/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_TEMPERATURE_SENSOR_ERROR = 1825;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Temperature/Sensor/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_TEMPERATURE_SENSOR_GAIN = 1826;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Temperature/Sensor/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_TEMPERATURE_SENSOR_MAX = 1827;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Temperature/Sensor/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_TEMPERATURE_SENSOR_MIN = 1828;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Temperature/Sensor/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_TEMPERATURE_SENSOR_NACK = 1829;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Temperature/Sensor/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_TEMPERATURE_SENSOR_OFFSET = 1830;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Temperature/Sensor/
	 * OtherMotorTransmission as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_TEMPERATURE_SENSOR_OTHERMOTORTRANSMISSION = 1831;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowYaw/Temperature/Sensor/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_TEMPERATURE_SENSOR_SUBDEVICENUMBER = 1832;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowYaw/Temperature/Sensor/ThermalResistance as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_TEMPERATURE_SENSOR_THERMALRESISTANCE = 1833;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowYaw/Temperature/Sensor/ThermalTimeConstant as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_TEMPERATURE_SENSOR_THERMALTIMECONSTANT = 1834;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Temperature/Sensor/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_TEMPERATURE_SENSOR_TYPE = 1835;

	/**
	 * Id of the sensor Device/SubDeviceList/LElbowYaw/Temperature/Sensor/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_TEMPERATURE_SENSOR_VALUE = 1836;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LElbowYaw/Temperature/Sensor/motorModel as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_TEMPERATURE_SENSOR_MOTORMODEL = 1837;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Bumper/Left/Sensor/Ack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_BUMPER_LEFT_SENSOR_ACK = 1838;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Bumper/Left/Sensor/Device as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_BUMPER_LEFT_SENSOR_DEVICE = 1839;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Bumper/Left/Sensor/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_BUMPER_LEFT_SENSOR_ERROR = 1840;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Bumper/Left/Sensor/Gain as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_BUMPER_LEFT_SENSOR_GAIN = 1841;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Bumper/Left/Sensor/Max as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_BUMPER_LEFT_SENSOR_MAX = 1842;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Bumper/Left/Sensor/Min as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_BUMPER_LEFT_SENSOR_MIN = 1843;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Bumper/Left/Sensor/Nack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_BUMPER_LEFT_SENSOR_NACK = 1844;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Bumper/Left/Sensor/Offset as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_BUMPER_LEFT_SENSOR_OFFSET = 1845;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LFoot/Bumper/Left/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_BUMPER_LEFT_SENSOR_SUBDEVICENUMBER = 1846;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Bumper/Left/Sensor/Type as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_BUMPER_LEFT_SENSOR_TYPE = 1847;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Bumper/Left/Sensor/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_BUMPER_LEFT_SENSOR_VALUE = 1848;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Bumper/Right/Sensor/Ack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_BUMPER_RIGHT_SENSOR_ACK = 1849;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Bumper/Right/Sensor/Device as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_BUMPER_RIGHT_SENSOR_DEVICE = 1850;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Bumper/Right/Sensor/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_BUMPER_RIGHT_SENSOR_ERROR = 1851;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Bumper/Right/Sensor/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_BUMPER_RIGHT_SENSOR_GAIN = 1852;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Bumper/Right/Sensor/Max as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_BUMPER_RIGHT_SENSOR_MAX = 1853;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Bumper/Right/Sensor/Min as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_BUMPER_RIGHT_SENSOR_MIN = 1854;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Bumper/Right/Sensor/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_BUMPER_RIGHT_SENSOR_NACK = 1855;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Bumper/Right/Sensor/Offset as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_BUMPER_RIGHT_SENSOR_OFFSET = 1856;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LFoot/Bumper/Right/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_BUMPER_RIGHT_SENSOR_SUBDEVICENUMBER = 1857;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Bumper/Right/Sensor/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_BUMPER_RIGHT_SENSOR_TYPE = 1858;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Bumper/Right/Sensor/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_BUMPER_RIGHT_SENSOR_VALUE = 1859;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LFoot/FSR/CenterOfPressure/X/Sensor/Ack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_CENTEROFPRESSURE_X_SENSOR_ACK = 1860;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LFoot/FSR/CenterOfPressure/X/Sensor/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_CENTEROFPRESSURE_X_SENSOR_DEVICE = 1861;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LFoot/FSR/CenterOfPressure/X/Sensor/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_CENTEROFPRESSURE_X_SENSOR_ERROR = 1862;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LFoot/FSR/CenterOfPressure/X/Sensor/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_CENTEROFPRESSURE_X_SENSOR_GAIN = 1863;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LFoot/FSR/CenterOfPressure/X/Sensor/Max as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_CENTEROFPRESSURE_X_SENSOR_MAX = 1864;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LFoot/FSR/CenterOfPressure/X/Sensor/Min as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_CENTEROFPRESSURE_X_SENSOR_MIN = 1865;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LFoot/FSR/CenterOfPressure/X/Sensor/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_CENTEROFPRESSURE_X_SENSOR_NACK = 1866;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LFoot/FSR/CenterOfPressure/X/Sensor/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_CENTEROFPRESSURE_X_SENSOR_OFFSET = 1867;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LFoot/FSR/CenterOfPressure/X/Sensor/SubDeviceNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_CENTEROFPRESSURE_X_SENSOR_SUBDEVICENUMBER = 1868;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LFoot/FSR/CenterOfPressure/X/Sensor/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_CENTEROFPRESSURE_X_SENSOR_TYPE = 1869;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LFoot/FSR/CenterOfPressure/X/Sensor/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_CENTEROFPRESSURE_X_SENSOR_VALUE = 1870;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LFoot/FSR/CenterOfPressure/Y/Sensor/Ack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_CENTEROFPRESSURE_Y_SENSOR_ACK = 1871;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LFoot/FSR/CenterOfPressure/Y/Sensor/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_CENTEROFPRESSURE_Y_SENSOR_DEVICE = 1872;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LFoot/FSR/CenterOfPressure/Y/Sensor/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_CENTEROFPRESSURE_Y_SENSOR_ERROR = 1873;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LFoot/FSR/CenterOfPressure/Y/Sensor/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_CENTEROFPRESSURE_Y_SENSOR_GAIN = 1874;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LFoot/FSR/CenterOfPressure/Y/Sensor/Max as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_CENTEROFPRESSURE_Y_SENSOR_MAX = 1875;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LFoot/FSR/CenterOfPressure/Y/Sensor/Min as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_CENTEROFPRESSURE_Y_SENSOR_MIN = 1876;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LFoot/FSR/CenterOfPressure/Y/Sensor/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_CENTEROFPRESSURE_Y_SENSOR_NACK = 1877;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LFoot/FSR/CenterOfPressure/Y/Sensor/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_CENTEROFPRESSURE_Y_SENSOR_OFFSET = 1878;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LFoot/FSR/CenterOfPressure/Y/Sensor/SubDeviceNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_CENTEROFPRESSURE_Y_SENSOR_SUBDEVICENUMBER = 1879;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LFoot/FSR/CenterOfPressure/Y/Sensor/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_CENTEROFPRESSURE_Y_SENSOR_TYPE = 1880;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LFoot/FSR/CenterOfPressure/Y/Sensor/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_CENTEROFPRESSURE_Y_SENSOR_VALUE = 1881;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/FrontLeft/Sensor/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_FRONTLEFT_SENSOR_ACK = 1882;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/FrontLeft/Sensor/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_FRONTLEFT_SENSOR_DEVICE = 1883;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/FrontLeft/Sensor/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_FRONTLEFT_SENSOR_ERROR = 1884;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/FrontLeft/Sensor/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_FRONTLEFT_SENSOR_GAIN = 1885;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/FrontLeft/Sensor/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_FRONTLEFT_SENSOR_MAX = 1886;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/FrontLeft/Sensor/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_FRONTLEFT_SENSOR_MIN = 1887;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/FrontLeft/Sensor/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_FRONTLEFT_SENSOR_NACK = 1888;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/FrontLeft/Sensor/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_FRONTLEFT_SENSOR_OFFSET = 1889;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LFoot/FSR/FrontLeft/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_FRONTLEFT_SENSOR_SUBDEVICENUMBER = 1890;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/FrontLeft/Sensor/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_FRONTLEFT_SENSOR_TYPE = 1891;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/FrontLeft/Sensor/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_FRONTLEFT_SENSOR_VALUE = 1892;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LFoot/FSR/FrontLeft/Sensor/XPosition as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_FRONTLEFT_SENSOR_XPOSITION = 1893;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LFoot/FSR/FrontLeft/Sensor/YPosition as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_FRONTLEFT_SENSOR_YPOSITION = 1894;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/FrontRight/Sensor/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_FRONTRIGHT_SENSOR_ACK = 1895;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/FrontRight/Sensor/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_FRONTRIGHT_SENSOR_DEVICE = 1896;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/FrontRight/Sensor/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_FRONTRIGHT_SENSOR_ERROR = 1897;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/FrontRight/Sensor/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_FRONTRIGHT_SENSOR_GAIN = 1898;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/FrontRight/Sensor/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_FRONTRIGHT_SENSOR_MAX = 1899;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/FrontRight/Sensor/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_FRONTRIGHT_SENSOR_MIN = 1900;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/FrontRight/Sensor/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_FRONTRIGHT_SENSOR_NACK = 1901;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/FrontRight/Sensor/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_FRONTRIGHT_SENSOR_OFFSET = 1902;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LFoot/FSR/FrontRight/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_FRONTRIGHT_SENSOR_SUBDEVICENUMBER = 1903;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/FrontRight/Sensor/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_FRONTRIGHT_SENSOR_TYPE = 1904;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/FrontRight/Sensor/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_FRONTRIGHT_SENSOR_VALUE = 1905;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LFoot/FSR/FrontRight/Sensor/XPosition as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_FRONTRIGHT_SENSOR_XPOSITION = 1906;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LFoot/FSR/FrontRight/Sensor/YPosition as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_FRONTRIGHT_SENSOR_YPOSITION = 1907;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/RearLeft/Sensor/Ack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_REARLEFT_SENSOR_ACK = 1908;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/RearLeft/Sensor/Device as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_REARLEFT_SENSOR_DEVICE = 1909;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/RearLeft/Sensor/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_REARLEFT_SENSOR_ERROR = 1910;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/RearLeft/Sensor/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_REARLEFT_SENSOR_GAIN = 1911;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/RearLeft/Sensor/Max as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_REARLEFT_SENSOR_MAX = 1912;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/RearLeft/Sensor/Min as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_REARLEFT_SENSOR_MIN = 1913;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/RearLeft/Sensor/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_REARLEFT_SENSOR_NACK = 1914;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/RearLeft/Sensor/Offset as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_REARLEFT_SENSOR_OFFSET = 1915;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LFoot/FSR/RearLeft/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_REARLEFT_SENSOR_SUBDEVICENUMBER = 1916;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/RearLeft/Sensor/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_REARLEFT_SENSOR_TYPE = 1917;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/RearLeft/Sensor/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_REARLEFT_SENSOR_VALUE = 1918;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/RearLeft/Sensor/XPosition
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_REARLEFT_SENSOR_XPOSITION = 1919;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/RearLeft/Sensor/YPosition
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_REARLEFT_SENSOR_YPOSITION = 1920;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/RearRight/Sensor/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_REARRIGHT_SENSOR_ACK = 1921;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/RearRight/Sensor/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_REARRIGHT_SENSOR_DEVICE = 1922;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/RearRight/Sensor/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_REARRIGHT_SENSOR_ERROR = 1923;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/RearRight/Sensor/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_REARRIGHT_SENSOR_GAIN = 1924;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/RearRight/Sensor/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_REARRIGHT_SENSOR_MAX = 1925;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/RearRight/Sensor/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_REARRIGHT_SENSOR_MIN = 1926;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/RearRight/Sensor/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_REARRIGHT_SENSOR_NACK = 1927;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/RearRight/Sensor/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_REARRIGHT_SENSOR_OFFSET = 1928;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LFoot/FSR/RearRight/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_REARRIGHT_SENSOR_SUBDEVICENUMBER = 1929;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/RearRight/Sensor/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_REARRIGHT_SENSOR_TYPE = 1930;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/RearRight/Sensor/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_REARRIGHT_SENSOR_VALUE = 1931;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LFoot/FSR/RearRight/Sensor/XPosition as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_REARRIGHT_SENSOR_XPOSITION = 1932;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LFoot/FSR/RearRight/Sensor/YPosition as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_REARRIGHT_SENSOR_YPOSITION = 1933;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/TotalWeight/Sensor/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_TOTALWEIGHT_SENSOR_ACK = 1934;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/TotalWeight/Sensor/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_TOTALWEIGHT_SENSOR_DEVICE = 1935;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/TotalWeight/Sensor/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_TOTALWEIGHT_SENSOR_ERROR = 1936;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/TotalWeight/Sensor/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_TOTALWEIGHT_SENSOR_GAIN = 1937;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/TotalWeight/Sensor/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_TOTALWEIGHT_SENSOR_MAX = 1938;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/TotalWeight/Sensor/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_TOTALWEIGHT_SENSOR_MIN = 1939;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/TotalWeight/Sensor/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_TOTALWEIGHT_SENSOR_NACK = 1940;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/TotalWeight/Sensor/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_TOTALWEIGHT_SENSOR_OFFSET = 1941;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LFoot/FSR/TotalWeight/Sensor/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_TOTALWEIGHT_SENSOR_SUBDEVICENUMBER = 1942;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/TotalWeight/Sensor/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_TOTALWEIGHT_SENSOR_TYPE = 1943;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/FSR/TotalWeight/Sensor/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_FSR_TOTALWEIGHT_SENSOR_VALUE = 1944;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Led/Blue/Actuator/Ack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_LED_BLUE_ACTUATOR_ACK = 1945;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Led/Blue/Actuator/Device as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_LED_BLUE_ACTUATOR_DEVICE = 1946;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Led/Blue/Actuator/Error as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_LED_BLUE_ACTUATOR_ERROR = 1947;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Led/Blue/Actuator/Gain as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_LED_BLUE_ACTUATOR_GAIN = 1948;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Led/Blue/Actuator/Max as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_LED_BLUE_ACTUATOR_MAX = 1949;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Led/Blue/Actuator/Min as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_LED_BLUE_ACTUATOR_MIN = 1950;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Led/Blue/Actuator/Nack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_LED_BLUE_ACTUATOR_NACK = 1951;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Led/Blue/Actuator/Offset as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_LED_BLUE_ACTUATOR_OFFSET = 1952;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LFoot/Led/Blue/Actuator/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_LED_BLUE_ACTUATOR_SUBDEVICENUMBER = 1953;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Led/Blue/Actuator/Type as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_LED_BLUE_ACTUATOR_TYPE = 1954;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Led/Blue/Actuator/Value as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_LED_BLUE_ACTUATOR_VALUE = 1955;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Led/Green/Actuator/Ack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_LED_GREEN_ACTUATOR_ACK = 1956;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Led/Green/Actuator/Device as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_LED_GREEN_ACTUATOR_DEVICE = 1957;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Led/Green/Actuator/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_LED_GREEN_ACTUATOR_ERROR = 1958;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Led/Green/Actuator/Gain as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_LED_GREEN_ACTUATOR_GAIN = 1959;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Led/Green/Actuator/Max as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_LED_GREEN_ACTUATOR_MAX = 1960;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Led/Green/Actuator/Min as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_LED_GREEN_ACTUATOR_MIN = 1961;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Led/Green/Actuator/Nack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_LED_GREEN_ACTUATOR_NACK = 1962;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Led/Green/Actuator/Offset as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_LED_GREEN_ACTUATOR_OFFSET = 1963;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LFoot/Led/Green/Actuator/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_LED_GREEN_ACTUATOR_SUBDEVICENUMBER = 1964;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Led/Green/Actuator/Type as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_LED_GREEN_ACTUATOR_TYPE = 1965;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Led/Green/Actuator/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_LED_GREEN_ACTUATOR_VALUE = 1966;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Led/Red/Actuator/Ack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_LED_RED_ACTUATOR_ACK = 1967;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Led/Red/Actuator/Device as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_LED_RED_ACTUATOR_DEVICE = 1968;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Led/Red/Actuator/Error as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_LED_RED_ACTUATOR_ERROR = 1969;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Led/Red/Actuator/Gain as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_LED_RED_ACTUATOR_GAIN = 1970;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Led/Red/Actuator/Max as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_LED_RED_ACTUATOR_MAX = 1971;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Led/Red/Actuator/Min as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_LED_RED_ACTUATOR_MIN = 1972;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Led/Red/Actuator/Nack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_LED_RED_ACTUATOR_NACK = 1973;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Led/Red/Actuator/Offset as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_LED_RED_ACTUATOR_OFFSET = 1974;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LFoot/Led/Red/Actuator/SubDeviceNumber as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_LED_RED_ACTUATOR_SUBDEVICENUMBER = 1975;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Led/Red/Actuator/Type as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_LED_RED_ACTUATOR_TYPE = 1976;

	/**
	 * Id of the sensor Device/SubDeviceList/LFoot/Led/Red/Actuator/Value as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LFOOT_LED_RED_ACTUATOR_VALUE = 1977;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/ElectricCurrent/Sensor/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_ELECTRICCURRENT_SENSOR_ACK = 1978;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/ElectricCurrent/Sensor/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_ELECTRICCURRENT_SENSOR_DEVICE = 1979;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/ElectricCurrent/Sensor/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_ELECTRICCURRENT_SENSOR_ERROR = 1980;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/ElectricCurrent/Sensor/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_ELECTRICCURRENT_SENSOR_GAIN = 1981;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/ElectricCurrent/Sensor/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_ELECTRICCURRENT_SENSOR_MAX = 1982;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/ElectricCurrent/Sensor/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_ELECTRICCURRENT_SENSOR_MIN = 1983;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/ElectricCurrent/Sensor/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_ELECTRICCURRENT_SENSOR_NACK = 1984;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/ElectricCurrent/Sensor/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_ELECTRICCURRENT_SENSOR_OFFSET = 1985;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHand/ElectricCurrent/Sensor/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_ELECTRICCURRENT_SENSOR_SUBDEVICENUMBER = 1986;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/ElectricCurrent/Sensor/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_ELECTRICCURRENT_SENSOR_TYPE = 1987;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/ElectricCurrent/Sensor/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_ELECTRICCURRENT_SENSOR_VALUE = 1988;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Hardness/Actuator/Ack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_HARDNESS_ACTUATOR_ACK = 1989;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Hardness/Actuator/Device as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_HARDNESS_ACTUATOR_DEVICE = 1990;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Hardness/Actuator/Error as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_HARDNESS_ACTUATOR_ERROR = 1991;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Hardness/Actuator/Gain as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_HARDNESS_ACTUATOR_GAIN = 1992;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Hardness/Actuator/Max as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_HARDNESS_ACTUATOR_MAX = 1993;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Hardness/Actuator/Min as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_HARDNESS_ACTUATOR_MIN = 1994;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Hardness/Actuator/Nack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_HARDNESS_ACTUATOR_NACK = 1995;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Hardness/Actuator/Offset as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_HARDNESS_ACTUATOR_OFFSET = 1996;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHand/Hardness/Actuator/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_HARDNESS_ACTUATOR_SUBDEVICENUMBER = 1997;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Hardness/Actuator/Type as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_HARDNESS_ACTUATOR_TYPE = 1998;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Hardness/Actuator/Value as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_HARDNESS_ACTUATOR_VALUE = 1999;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Position/Actuator/Ack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_POSITION_ACTUATOR_ACK = 2000;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Position/Actuator/Device as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_POSITION_ACTUATOR_DEVICE = 2001;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Position/Actuator/Error as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_POSITION_ACTUATOR_ERROR = 2002;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Position/Actuator/Gain as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_POSITION_ACTUATOR_GAIN = 2003;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Position/Actuator/IMax as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_POSITION_ACTUATOR_IMAX = 2004;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHand/Position/Actuator/InvertControlDirection as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_POSITION_ACTUATOR_INVERTCONTROLDIRECTION = 2005;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Position/Actuator/Kd as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_POSITION_ACTUATOR_KD = 2006;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Position/Actuator/Ki as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_POSITION_ACTUATOR_KI = 2007;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Position/Actuator/Kp as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_POSITION_ACTUATOR_KP = 2008;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Position/Actuator/Max as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_POSITION_ACTUATOR_MAX = 2009;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Position/Actuator/Min as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_POSITION_ACTUATOR_MIN = 2010;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Position/Actuator/MotorNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_POSITION_ACTUATOR_MOTORNUMBER = 2011;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Position/Actuator/Nack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_POSITION_ACTUATOR_NACK = 2012;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Position/Actuator/Offset as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_POSITION_ACTUATOR_OFFSET = 2013;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHand/Position/Actuator/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_POSITION_ACTUATOR_SUBDEVICENUMBER = 2014;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Position/Actuator/Type as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_POSITION_ACTUATOR_TYPE = 2015;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Position/Actuator/Value as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_POSITION_ACTUATOR_VALUE = 2016;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Position/Sensor/Ack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_POSITION_SENSOR_ACK = 2017;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Position/Sensor/Device as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_POSITION_SENSOR_DEVICE = 2018;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Position/Sensor/Error as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_POSITION_SENSOR_ERROR = 2019;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Position/Sensor/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_POSITION_SENSOR_GAIN = 2020;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Position/Sensor/GearRatio as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_POSITION_SENSOR_GEARRATIO = 2021;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Position/Sensor/Limit as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_POSITION_SENSOR_LIMIT = 2022;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Position/Sensor/Max as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_POSITION_SENSOR_MAX = 2023;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Position/Sensor/Min as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_POSITION_SENSOR_MIN = 2024;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Position/Sensor/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_POSITION_SENSOR_NACK = 2025;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Position/Sensor/Offset as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_POSITION_SENSOR_OFFSET = 2026;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Position/Sensor/SensorType as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_POSITION_SENSOR_SENSORTYPE = 2027;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHand/Position/Sensor/SubDeviceNumber as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_POSITION_SENSOR_SUBDEVICENUMBER = 2028;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Position/Sensor/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_POSITION_SENSOR_TYPE = 2029;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Position/Sensor/Value as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_POSITION_SENSOR_VALUE = 2030;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHand/Position/Sensor/jointZeroPosition as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_POSITION_SENSOR_JOINTZEROPOSITION = 2031;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHand/Position/Sensor/positionChainMREJoint as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_POSITION_SENSOR_POSITIONCHAINMREJOINT = 2032;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHand/Position/Sensor/positionChainMREMotor as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_POSITION_SENSOR_POSITIONCHAINMREMOTOR = 2033;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Temperature/Sensor/Ack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TEMPERATURE_SENSOR_ACK = 2034;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHand/Temperature/Sensor/AmbientTemperature as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TEMPERATURE_SENSOR_AMBIENTTEMPERATURE = 2035;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Temperature/Sensor/Device as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TEMPERATURE_SENSOR_DEVICE = 2036;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Temperature/Sensor/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TEMPERATURE_SENSOR_ERROR = 2037;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Temperature/Sensor/Gain as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TEMPERATURE_SENSOR_GAIN = 2038;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Temperature/Sensor/Max as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TEMPERATURE_SENSOR_MAX = 2039;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Temperature/Sensor/Min as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TEMPERATURE_SENSOR_MIN = 2040;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Temperature/Sensor/Nack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TEMPERATURE_SENSOR_NACK = 2041;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Temperature/Sensor/Offset as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TEMPERATURE_SENSOR_OFFSET = 2042;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHand/Temperature/Sensor/OtherMotorTransmission as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TEMPERATURE_SENSOR_OTHERMOTORTRANSMISSION = 2043;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHand/Temperature/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TEMPERATURE_SENSOR_SUBDEVICENUMBER = 2044;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHand/Temperature/Sensor/ThermalResistance as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TEMPERATURE_SENSOR_THERMALRESISTANCE = 2045;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHand/Temperature/Sensor/ThermalTimeConstant as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TEMPERATURE_SENSOR_THERMALTIMECONSTANT = 2046;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Temperature/Sensor/Type as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TEMPERATURE_SENSOR_TYPE = 2047;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Temperature/Sensor/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TEMPERATURE_SENSOR_VALUE = 2048;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Temperature/Sensor/motorModel
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TEMPERATURE_SENSOR_MOTORMODEL = 2049;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Touch/Back/Sensor/Ack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TOUCH_BACK_SENSOR_ACK = 2050;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Touch/Back/Sensor/Device as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TOUCH_BACK_SENSOR_DEVICE = 2051;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Touch/Back/Sensor/Error as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TOUCH_BACK_SENSOR_ERROR = 2052;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Touch/Back/Sensor/Gain as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TOUCH_BACK_SENSOR_GAIN = 2053;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Touch/Back/Sensor/Max as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TOUCH_BACK_SENSOR_MAX = 2054;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Touch/Back/Sensor/Min as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TOUCH_BACK_SENSOR_MIN = 2055;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Touch/Back/Sensor/Nack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TOUCH_BACK_SENSOR_NACK = 2056;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Touch/Back/Sensor/Offset as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TOUCH_BACK_SENSOR_OFFSET = 2057;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHand/Touch/Back/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TOUCH_BACK_SENSOR_SUBDEVICENUMBER = 2058;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Touch/Back/Sensor/Type as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TOUCH_BACK_SENSOR_TYPE = 2059;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Touch/Back/Sensor/Value as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TOUCH_BACK_SENSOR_VALUE = 2060;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Touch/Left/Sensor/Ack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TOUCH_LEFT_SENSOR_ACK = 2061;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Touch/Left/Sensor/Device as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TOUCH_LEFT_SENSOR_DEVICE = 2062;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Touch/Left/Sensor/Error as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TOUCH_LEFT_SENSOR_ERROR = 2063;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Touch/Left/Sensor/Gain as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TOUCH_LEFT_SENSOR_GAIN = 2064;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Touch/Left/Sensor/Max as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TOUCH_LEFT_SENSOR_MAX = 2065;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Touch/Left/Sensor/Min as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TOUCH_LEFT_SENSOR_MIN = 2066;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Touch/Left/Sensor/Nack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TOUCH_LEFT_SENSOR_NACK = 2067;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Touch/Left/Sensor/Offset as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TOUCH_LEFT_SENSOR_OFFSET = 2068;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHand/Touch/Left/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TOUCH_LEFT_SENSOR_SUBDEVICENUMBER = 2069;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Touch/Left/Sensor/Type as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TOUCH_LEFT_SENSOR_TYPE = 2070;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Touch/Left/Sensor/Value as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TOUCH_LEFT_SENSOR_VALUE = 2071;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Touch/Right/Sensor/Ack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TOUCH_RIGHT_SENSOR_ACK = 2072;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Touch/Right/Sensor/Device as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TOUCH_RIGHT_SENSOR_DEVICE = 2073;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Touch/Right/Sensor/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TOUCH_RIGHT_SENSOR_ERROR = 2074;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Touch/Right/Sensor/Gain as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TOUCH_RIGHT_SENSOR_GAIN = 2075;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Touch/Right/Sensor/Max as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TOUCH_RIGHT_SENSOR_MAX = 2076;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Touch/Right/Sensor/Min as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TOUCH_RIGHT_SENSOR_MIN = 2077;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Touch/Right/Sensor/Nack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TOUCH_RIGHT_SENSOR_NACK = 2078;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Touch/Right/Sensor/Offset as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TOUCH_RIGHT_SENSOR_OFFSET = 2079;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHand/Touch/Right/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TOUCH_RIGHT_SENSOR_SUBDEVICENUMBER = 2080;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Touch/Right/Sensor/Type as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TOUCH_RIGHT_SENSOR_TYPE = 2081;

	/**
	 * Id of the sensor Device/SubDeviceList/LHand/Touch/Right/Sensor/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHAND_TOUCH_RIGHT_SENSOR_VALUE = 2082;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipPitch/ElectricCurrent/Sensor/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_ELECTRICCURRENT_SENSOR_ACK = 2083;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipPitch/ElectricCurrent/Sensor/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_ELECTRICCURRENT_SENSOR_DEVICE = 2084;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipPitch/ElectricCurrent/Sensor/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_ELECTRICCURRENT_SENSOR_ERROR = 2085;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipPitch/ElectricCurrent/Sensor/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_ELECTRICCURRENT_SENSOR_GAIN = 2086;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipPitch/ElectricCurrent/Sensor/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_ELECTRICCURRENT_SENSOR_MAX = 2087;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipPitch/ElectricCurrent/Sensor/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_ELECTRICCURRENT_SENSOR_MIN = 2088;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipPitch/ElectricCurrent/Sensor/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_ELECTRICCURRENT_SENSOR_NACK = 2089;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipPitch/ElectricCurrent/Sensor/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_ELECTRICCURRENT_SENSOR_OFFSET = 2090;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipPitch/ElectricCurrent/Sensor/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_ELECTRICCURRENT_SENSOR_SUBDEVICENUMBER = 2091;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipPitch/ElectricCurrent/Sensor/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_ELECTRICCURRENT_SENSOR_TYPE = 2092;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipPitch/ElectricCurrent/Sensor/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_ELECTRICCURRENT_SENSOR_VALUE = 2093;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Hardness/Actuator/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_HARDNESS_ACTUATOR_ACK = 2094;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Hardness/Actuator/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_HARDNESS_ACTUATOR_DEVICE = 2095;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Hardness/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_HARDNESS_ACTUATOR_ERROR = 2096;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Hardness/Actuator/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_HARDNESS_ACTUATOR_GAIN = 2097;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Hardness/Actuator/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_HARDNESS_ACTUATOR_MAX = 2098;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Hardness/Actuator/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_HARDNESS_ACTUATOR_MIN = 2099;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Hardness/Actuator/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_HARDNESS_ACTUATOR_NACK = 2100;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Hardness/Actuator/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_HARDNESS_ACTUATOR_OFFSET = 2101;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipPitch/Hardness/Actuator/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_HARDNESS_ACTUATOR_SUBDEVICENUMBER = 2102;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Hardness/Actuator/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_HARDNESS_ACTUATOR_TYPE = 2103;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Hardness/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_HARDNESS_ACTUATOR_VALUE = 2104;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Position/Actuator/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_POSITION_ACTUATOR_ACK = 2105;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Position/Actuator/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_POSITION_ACTUATOR_DEVICE = 2106;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Position/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_POSITION_ACTUATOR_ERROR = 2107;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Position/Actuator/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_POSITION_ACTUATOR_GAIN = 2108;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Position/Actuator/IMax as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_POSITION_ACTUATOR_IMAX = 2109;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipPitch/Position/Actuator/InvertControlDirection
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_POSITION_ACTUATOR_INVERTCONTROLDIRECTION = 2110;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Position/Actuator/Kd as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_POSITION_ACTUATOR_KD = 2111;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Position/Actuator/Ki as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_POSITION_ACTUATOR_KI = 2112;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Position/Actuator/Kp as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_POSITION_ACTUATOR_KP = 2113;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Position/Actuator/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_POSITION_ACTUATOR_MAX = 2114;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Position/Actuator/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_POSITION_ACTUATOR_MIN = 2115;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipPitch/Position/Actuator/MotorNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_POSITION_ACTUATOR_MOTORNUMBER = 2116;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Position/Actuator/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_POSITION_ACTUATOR_NACK = 2117;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Position/Actuator/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_POSITION_ACTUATOR_OFFSET = 2118;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipPitch/Position/Actuator/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_POSITION_ACTUATOR_SUBDEVICENUMBER = 2119;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Position/Actuator/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_POSITION_ACTUATOR_TYPE = 2120;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Position/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_POSITION_ACTUATOR_VALUE = 2121;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Position/Sensor/Ack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_POSITION_SENSOR_ACK = 2122;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Position/Sensor/Device as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_POSITION_SENSOR_DEVICE = 2123;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Position/Sensor/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_POSITION_SENSOR_ERROR = 2124;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Position/Sensor/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_POSITION_SENSOR_GAIN = 2125;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Position/Sensor/GearRatio
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_POSITION_SENSOR_GEARRATIO = 2126;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Position/Sensor/Limit as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_POSITION_SENSOR_LIMIT = 2127;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Position/Sensor/Max as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_POSITION_SENSOR_MAX = 2128;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Position/Sensor/Min as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_POSITION_SENSOR_MIN = 2129;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Position/Sensor/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_POSITION_SENSOR_NACK = 2130;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Position/Sensor/Offset as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_POSITION_SENSOR_OFFSET = 2131;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipPitch/Position/Sensor/SensorType as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_POSITION_SENSOR_SENSORTYPE = 2132;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipPitch/Position/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_POSITION_SENSOR_SUBDEVICENUMBER = 2133;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Position/Sensor/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_POSITION_SENSOR_TYPE = 2134;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Position/Sensor/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_POSITION_SENSOR_VALUE = 2135;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipPitch/Position/Sensor/jointZeroPosition as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_POSITION_SENSOR_JOINTZEROPOSITION = 2136;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipPitch/Position/Sensor/positionChainMREJoint as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_POSITION_SENSOR_POSITIONCHAINMREJOINT = 2137;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipPitch/Position/Sensor/positionChainMREMotor as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_POSITION_SENSOR_POSITIONCHAINMREMOTOR = 2138;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Temperature/Sensor/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_TEMPERATURE_SENSOR_ACK = 2139;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipPitch/Temperature/Sensor/AmbientTemperature as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_TEMPERATURE_SENSOR_AMBIENTTEMPERATURE = 2140;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Temperature/Sensor/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_TEMPERATURE_SENSOR_DEVICE = 2141;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Temperature/Sensor/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_TEMPERATURE_SENSOR_ERROR = 2142;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Temperature/Sensor/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_TEMPERATURE_SENSOR_GAIN = 2143;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Temperature/Sensor/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_TEMPERATURE_SENSOR_MAX = 2144;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Temperature/Sensor/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_TEMPERATURE_SENSOR_MIN = 2145;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Temperature/Sensor/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_TEMPERATURE_SENSOR_NACK = 2146;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Temperature/Sensor/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_TEMPERATURE_SENSOR_OFFSET = 2147;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Temperature/Sensor/
	 * OtherMotorTransmission as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_TEMPERATURE_SENSOR_OTHERMOTORTRANSMISSION = 2148;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipPitch/Temperature/Sensor/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_TEMPERATURE_SENSOR_SUBDEVICENUMBER = 2149;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipPitch/Temperature/Sensor/ThermalResistance as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_TEMPERATURE_SENSOR_THERMALRESISTANCE = 2150;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipPitch/Temperature/Sensor/ThermalTimeConstant as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_TEMPERATURE_SENSOR_THERMALTIMECONSTANT = 2151;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Temperature/Sensor/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_TEMPERATURE_SENSOR_TYPE = 2152;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipPitch/Temperature/Sensor/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_TEMPERATURE_SENSOR_VALUE = 2153;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipPitch/Temperature/Sensor/motorModel as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_TEMPERATURE_SENSOR_MOTORMODEL = 2154;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/ElectricCurrent/Sensor/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_ELECTRICCURRENT_SENSOR_ACK = 2155;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipRoll/ElectricCurrent/Sensor/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_ELECTRICCURRENT_SENSOR_DEVICE = 2156;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipRoll/ElectricCurrent/Sensor/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_ELECTRICCURRENT_SENSOR_ERROR = 2157;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipRoll/ElectricCurrent/Sensor/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_ELECTRICCURRENT_SENSOR_GAIN = 2158;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/ElectricCurrent/Sensor/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_ELECTRICCURRENT_SENSOR_MAX = 2159;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/ElectricCurrent/Sensor/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_ELECTRICCURRENT_SENSOR_MIN = 2160;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipRoll/ElectricCurrent/Sensor/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_ELECTRICCURRENT_SENSOR_NACK = 2161;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipRoll/ElectricCurrent/Sensor/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_ELECTRICCURRENT_SENSOR_OFFSET = 2162;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipRoll/ElectricCurrent/Sensor/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_ELECTRICCURRENT_SENSOR_SUBDEVICENUMBER = 2163;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipRoll/ElectricCurrent/Sensor/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_ELECTRICCURRENT_SENSOR_TYPE = 2164;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipRoll/ElectricCurrent/Sensor/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_ELECTRICCURRENT_SENSOR_VALUE = 2165;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Hardness/Actuator/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_HARDNESS_ACTUATOR_ACK = 2166;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Hardness/Actuator/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_HARDNESS_ACTUATOR_DEVICE = 2167;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Hardness/Actuator/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_HARDNESS_ACTUATOR_ERROR = 2168;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Hardness/Actuator/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_HARDNESS_ACTUATOR_GAIN = 2169;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Hardness/Actuator/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_HARDNESS_ACTUATOR_MAX = 2170;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Hardness/Actuator/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_HARDNESS_ACTUATOR_MIN = 2171;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Hardness/Actuator/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_HARDNESS_ACTUATOR_NACK = 2172;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Hardness/Actuator/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_HARDNESS_ACTUATOR_OFFSET = 2173;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipRoll/Hardness/Actuator/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_HARDNESS_ACTUATOR_SUBDEVICENUMBER = 2174;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Hardness/Actuator/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_HARDNESS_ACTUATOR_TYPE = 2175;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Hardness/Actuator/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_HARDNESS_ACTUATOR_VALUE = 2176;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Position/Actuator/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_POSITION_ACTUATOR_ACK = 2177;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Position/Actuator/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_POSITION_ACTUATOR_DEVICE = 2178;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Position/Actuator/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_POSITION_ACTUATOR_ERROR = 2179;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Position/Actuator/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_POSITION_ACTUATOR_GAIN = 2180;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Position/Actuator/IMax as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_POSITION_ACTUATOR_IMAX = 2181;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipRoll/Position/Actuator/InvertControlDirection as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_POSITION_ACTUATOR_INVERTCONTROLDIRECTION = 2182;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Position/Actuator/Kd as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_POSITION_ACTUATOR_KD = 2183;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Position/Actuator/Ki as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_POSITION_ACTUATOR_KI = 2184;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Position/Actuator/Kp as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_POSITION_ACTUATOR_KP = 2185;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Position/Actuator/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_POSITION_ACTUATOR_MAX = 2186;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Position/Actuator/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_POSITION_ACTUATOR_MIN = 2187;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipRoll/Position/Actuator/MotorNumber as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_POSITION_ACTUATOR_MOTORNUMBER = 2188;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Position/Actuator/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_POSITION_ACTUATOR_NACK = 2189;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Position/Actuator/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_POSITION_ACTUATOR_OFFSET = 2190;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipRoll/Position/Actuator/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_POSITION_ACTUATOR_SUBDEVICENUMBER = 2191;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Position/Actuator/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_POSITION_ACTUATOR_TYPE = 2192;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Position/Actuator/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_POSITION_ACTUATOR_VALUE = 2193;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Position/Sensor/Ack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_POSITION_SENSOR_ACK = 2194;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Position/Sensor/Device as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_POSITION_SENSOR_DEVICE = 2195;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Position/Sensor/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_POSITION_SENSOR_ERROR = 2196;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Position/Sensor/Gain as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_POSITION_SENSOR_GAIN = 2197;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Position/Sensor/GearRatio
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_POSITION_SENSOR_GEARRATIO = 2198;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Position/Sensor/Limit as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_POSITION_SENSOR_LIMIT = 2199;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Position/Sensor/Max as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_POSITION_SENSOR_MAX = 2200;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Position/Sensor/Min as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_POSITION_SENSOR_MIN = 2201;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Position/Sensor/Nack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_POSITION_SENSOR_NACK = 2202;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Position/Sensor/Offset as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_POSITION_SENSOR_OFFSET = 2203;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Position/Sensor/SensorType
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_POSITION_SENSOR_SENSORTYPE = 2204;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipRoll/Position/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_POSITION_SENSOR_SUBDEVICENUMBER = 2205;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Position/Sensor/Type as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_POSITION_SENSOR_TYPE = 2206;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Position/Sensor/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_POSITION_SENSOR_VALUE = 2207;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipRoll/Position/Sensor/jointZeroPosition as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_POSITION_SENSOR_JOINTZEROPOSITION = 2208;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipRoll/Position/Sensor/positionChainMREJoint as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_POSITION_SENSOR_POSITIONCHAINMREJOINT = 2209;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipRoll/Position/Sensor/positionChainMREMotor as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_POSITION_SENSOR_POSITIONCHAINMREMOTOR = 2210;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Temperature/Sensor/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_TEMPERATURE_SENSOR_ACK = 2211;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipRoll/Temperature/Sensor/AmbientTemperature as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_TEMPERATURE_SENSOR_AMBIENTTEMPERATURE = 2212;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Temperature/Sensor/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_TEMPERATURE_SENSOR_DEVICE = 2213;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Temperature/Sensor/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_TEMPERATURE_SENSOR_ERROR = 2214;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Temperature/Sensor/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_TEMPERATURE_SENSOR_GAIN = 2215;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Temperature/Sensor/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_TEMPERATURE_SENSOR_MAX = 2216;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Temperature/Sensor/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_TEMPERATURE_SENSOR_MIN = 2217;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Temperature/Sensor/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_TEMPERATURE_SENSOR_NACK = 2218;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Temperature/Sensor/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_TEMPERATURE_SENSOR_OFFSET = 2219;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipRoll/Temperature/Sensor/OtherMotorTransmission
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_TEMPERATURE_SENSOR_OTHERMOTORTRANSMISSION = 2220;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipRoll/Temperature/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_TEMPERATURE_SENSOR_SUBDEVICENUMBER = 2221;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipRoll/Temperature/Sensor/ThermalResistance as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_TEMPERATURE_SENSOR_THERMALRESISTANCE = 2222;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipRoll/Temperature/Sensor/ThermalTimeConstant as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_TEMPERATURE_SENSOR_THERMALTIMECONSTANT = 2223;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Temperature/Sensor/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_TEMPERATURE_SENSOR_TYPE = 2224;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipRoll/Temperature/Sensor/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_TEMPERATURE_SENSOR_VALUE = 2225;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipRoll/Temperature/Sensor/motorModel as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_TEMPERATURE_SENSOR_MOTORMODEL = 2226;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipYawPitch/ElectricCurrent/Sensor/Ack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_ELECTRICCURRENT_SENSOR_ACK = 2227;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipYawPitch/ElectricCurrent/Sensor/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_ELECTRICCURRENT_SENSOR_DEVICE = 2228;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipYawPitch/ElectricCurrent/Sensor/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_ELECTRICCURRENT_SENSOR_ERROR = 2229;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipYawPitch/ElectricCurrent/Sensor/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_ELECTRICCURRENT_SENSOR_GAIN = 2230;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipYawPitch/ElectricCurrent/Sensor/Max as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_ELECTRICCURRENT_SENSOR_MAX = 2231;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipYawPitch/ElectricCurrent/Sensor/Min as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_ELECTRICCURRENT_SENSOR_MIN = 2232;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipYawPitch/ElectricCurrent/Sensor/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_ELECTRICCURRENT_SENSOR_NACK = 2233;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipYawPitch/ElectricCurrent/Sensor/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_ELECTRICCURRENT_SENSOR_OFFSET = 2234;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipYawPitch/ElectricCurrent/Sensor/SubDeviceNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_ELECTRICCURRENT_SENSOR_SUBDEVICENUMBER = 2235;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipYawPitch/ElectricCurrent/Sensor/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_ELECTRICCURRENT_SENSOR_TYPE = 2236;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipYawPitch/ElectricCurrent/Sensor/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_ELECTRICCURRENT_SENSOR_VALUE = 2237;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipYawPitch/Hardness/Actuator/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_HARDNESS_ACTUATOR_ACK = 2238;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipYawPitch/Hardness/Actuator/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_HARDNESS_ACTUATOR_DEVICE = 2239;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipYawPitch/Hardness/Actuator/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_HARDNESS_ACTUATOR_ERROR = 2240;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipYawPitch/Hardness/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_HARDNESS_ACTUATOR_GAIN = 2241;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipYawPitch/Hardness/Actuator/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_HARDNESS_ACTUATOR_MAX = 2242;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipYawPitch/Hardness/Actuator/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_HARDNESS_ACTUATOR_MIN = 2243;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipYawPitch/Hardness/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_HARDNESS_ACTUATOR_NACK = 2244;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipYawPitch/Hardness/Actuator/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_HARDNESS_ACTUATOR_OFFSET = 2245;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipYawPitch/Hardness/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_HARDNESS_ACTUATOR_SUBDEVICENUMBER = 2246;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipYawPitch/Hardness/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_HARDNESS_ACTUATOR_TYPE = 2247;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipYawPitch/Hardness/Actuator/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_HARDNESS_ACTUATOR_VALUE = 2248;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipYawPitch/Position/Actuator/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_POSITION_ACTUATOR_ACK = 2249;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipYawPitch/Position/Actuator/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_POSITION_ACTUATOR_DEVICE = 2250;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipYawPitch/Position/Actuator/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_POSITION_ACTUATOR_ERROR = 2251;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipYawPitch/Position/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_POSITION_ACTUATOR_GAIN = 2252;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipYawPitch/Position/Actuator/IMax
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_POSITION_ACTUATOR_IMAX = 2253;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipYawPitch/Position/Actuator/
	 * InvertControlDirection as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_POSITION_ACTUATOR_INVERTCONTROLDIRECTION = 2254;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipYawPitch/Position/Actuator/Kd
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_POSITION_ACTUATOR_KD = 2255;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipYawPitch/Position/Actuator/Ki
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_POSITION_ACTUATOR_KI = 2256;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipYawPitch/Position/Actuator/Kp
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_POSITION_ACTUATOR_KP = 2257;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipYawPitch/Position/Actuator/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_POSITION_ACTUATOR_MAX = 2258;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipYawPitch/Position/Actuator/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_POSITION_ACTUATOR_MIN = 2259;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipYawPitch/Position/Actuator/MotorNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_POSITION_ACTUATOR_MOTORNUMBER = 2260;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipYawPitch/Position/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_POSITION_ACTUATOR_NACK = 2261;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipYawPitch/Position/Actuator/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_POSITION_ACTUATOR_OFFSET = 2262;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipYawPitch/Position/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_POSITION_ACTUATOR_SUBDEVICENUMBER = 2263;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipYawPitch/Position/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_POSITION_ACTUATOR_TYPE = 2264;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipYawPitch/Position/Actuator/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_POSITION_ACTUATOR_VALUE = 2265;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipYawPitch/Position/Sensor/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_POSITION_SENSOR_ACK = 2266;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipYawPitch/Position/Sensor/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_POSITION_SENSOR_DEVICE = 2267;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipYawPitch/Position/Sensor/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_POSITION_SENSOR_ERROR = 2268;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipYawPitch/Position/Sensor/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_POSITION_SENSOR_GAIN = 2269;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipYawPitch/Position/Sensor/GearRatio as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_POSITION_SENSOR_GEARRATIO = 2270;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipYawPitch/Position/Sensor/Limit
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_POSITION_SENSOR_LIMIT = 2271;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipYawPitch/Position/Sensor/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_POSITION_SENSOR_MAX = 2272;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipYawPitch/Position/Sensor/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_POSITION_SENSOR_MIN = 2273;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipYawPitch/Position/Sensor/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_POSITION_SENSOR_NACK = 2274;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipYawPitch/Position/Sensor/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_POSITION_SENSOR_OFFSET = 2275;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipYawPitch/Position/Sensor/SensorType as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_POSITION_SENSOR_SENSORTYPE = 2276;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipYawPitch/Position/Sensor/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_POSITION_SENSOR_SUBDEVICENUMBER = 2277;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipYawPitch/Position/Sensor/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_POSITION_SENSOR_TYPE = 2278;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipYawPitch/Position/Sensor/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_POSITION_SENSOR_VALUE = 2279;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipYawPitch/Position/Sensor/jointZeroPosition as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_POSITION_SENSOR_JOINTZEROPOSITION = 2280;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipYawPitch/Position/Sensor/positionChainMREJoint
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_POSITION_SENSOR_POSITIONCHAINMREJOINT = 2281;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipYawPitch/Position/Sensor/positionChainMREMotor
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_POSITION_SENSOR_POSITIONCHAINMREMOTOR = 2282;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipYawPitch/Temperature/Sensor/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_TEMPERATURE_SENSOR_ACK = 2283;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipYawPitch/Temperature/Sensor/AmbientTemperature
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_TEMPERATURE_SENSOR_AMBIENTTEMPERATURE = 2284;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipYawPitch/Temperature/Sensor/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_TEMPERATURE_SENSOR_DEVICE = 2285;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipYawPitch/Temperature/Sensor/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_TEMPERATURE_SENSOR_ERROR = 2286;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipYawPitch/Temperature/Sensor/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_TEMPERATURE_SENSOR_GAIN = 2287;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipYawPitch/Temperature/Sensor/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_TEMPERATURE_SENSOR_MAX = 2288;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipYawPitch/Temperature/Sensor/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_TEMPERATURE_SENSOR_MIN = 2289;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipYawPitch/Temperature/Sensor/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_TEMPERATURE_SENSOR_NACK = 2290;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipYawPitch/Temperature/Sensor/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_TEMPERATURE_SENSOR_OFFSET = 2291;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipYawPitch/Temperature/Sensor/
	 * OtherMotorTransmission as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_TEMPERATURE_SENSOR_OTHERMOTORTRANSMISSION = 2292;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipYawPitch/Temperature/Sensor/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_TEMPERATURE_SENSOR_SUBDEVICENUMBER = 2293;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipYawPitch/Temperature/Sensor/ThermalResistance as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_TEMPERATURE_SENSOR_THERMALRESISTANCE = 2294;

	/**
	 * Id of the sensor Device/SubDeviceList/LHipYawPitch/Temperature/Sensor/
	 * ThermalTimeConstant as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_TEMPERATURE_SENSOR_THERMALTIMECONSTANT = 2295;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipYawPitch/Temperature/Sensor/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_TEMPERATURE_SENSOR_TYPE = 2296;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipYawPitch/Temperature/Sensor/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_TEMPERATURE_SENSOR_VALUE = 2297;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LHipYawPitch/Temperature/Sensor/motorModel as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_TEMPERATURE_SENSOR_MOTORMODEL = 2298;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LKneePitch/ElectricCurrent/Sensor/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_ELECTRICCURRENT_SENSOR_ACK = 2299;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LKneePitch/ElectricCurrent/Sensor/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_ELECTRICCURRENT_SENSOR_DEVICE = 2300;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LKneePitch/ElectricCurrent/Sensor/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_ELECTRICCURRENT_SENSOR_ERROR = 2301;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LKneePitch/ElectricCurrent/Sensor/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_ELECTRICCURRENT_SENSOR_GAIN = 2302;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LKneePitch/ElectricCurrent/Sensor/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_ELECTRICCURRENT_SENSOR_MAX = 2303;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LKneePitch/ElectricCurrent/Sensor/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_ELECTRICCURRENT_SENSOR_MIN = 2304;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LKneePitch/ElectricCurrent/Sensor/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_ELECTRICCURRENT_SENSOR_NACK = 2305;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LKneePitch/ElectricCurrent/Sensor/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_ELECTRICCURRENT_SENSOR_OFFSET = 2306;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LKneePitch/ElectricCurrent/Sensor/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_ELECTRICCURRENT_SENSOR_SUBDEVICENUMBER = 2307;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LKneePitch/ElectricCurrent/Sensor/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_ELECTRICCURRENT_SENSOR_TYPE = 2308;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LKneePitch/ElectricCurrent/Sensor/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_ELECTRICCURRENT_SENSOR_VALUE = 2309;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Hardness/Actuator/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_HARDNESS_ACTUATOR_ACK = 2310;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Hardness/Actuator/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_HARDNESS_ACTUATOR_DEVICE = 2311;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Hardness/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_HARDNESS_ACTUATOR_ERROR = 2312;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Hardness/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_HARDNESS_ACTUATOR_GAIN = 2313;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Hardness/Actuator/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_HARDNESS_ACTUATOR_MAX = 2314;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Hardness/Actuator/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_HARDNESS_ACTUATOR_MIN = 2315;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Hardness/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_HARDNESS_ACTUATOR_NACK = 2316;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Hardness/Actuator/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_HARDNESS_ACTUATOR_OFFSET = 2317;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LKneePitch/Hardness/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_HARDNESS_ACTUATOR_SUBDEVICENUMBER = 2318;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Hardness/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_HARDNESS_ACTUATOR_TYPE = 2319;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Hardness/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_HARDNESS_ACTUATOR_VALUE = 2320;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Position/Actuator/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_POSITION_ACTUATOR_ACK = 2321;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Position/Actuator/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_POSITION_ACTUATOR_DEVICE = 2322;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Position/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_POSITION_ACTUATOR_ERROR = 2323;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Position/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_POSITION_ACTUATOR_GAIN = 2324;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Position/Actuator/IMax
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_POSITION_ACTUATOR_IMAX = 2325;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Position/Actuator/
	 * InvertControlDirection as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_POSITION_ACTUATOR_INVERTCONTROLDIRECTION = 2326;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Position/Actuator/Kd as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_POSITION_ACTUATOR_KD = 2327;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Position/Actuator/Ki as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_POSITION_ACTUATOR_KI = 2328;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Position/Actuator/Kp as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_POSITION_ACTUATOR_KP = 2329;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Position/Actuator/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_POSITION_ACTUATOR_MAX = 2330;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Position/Actuator/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_POSITION_ACTUATOR_MIN = 2331;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LKneePitch/Position/Actuator/MotorNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_POSITION_ACTUATOR_MOTORNUMBER = 2332;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Position/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_POSITION_ACTUATOR_NACK = 2333;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Position/Actuator/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_POSITION_ACTUATOR_OFFSET = 2334;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LKneePitch/Position/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_POSITION_ACTUATOR_SUBDEVICENUMBER = 2335;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Position/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_POSITION_ACTUATOR_TYPE = 2336;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Position/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_POSITION_ACTUATOR_VALUE = 2337;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Position/Sensor/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_POSITION_SENSOR_ACK = 2338;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Position/Sensor/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_POSITION_SENSOR_DEVICE = 2339;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Position/Sensor/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_POSITION_SENSOR_ERROR = 2340;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Position/Sensor/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_POSITION_SENSOR_GAIN = 2341;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LKneePitch/Position/Sensor/GearRatio as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_POSITION_SENSOR_GEARRATIO = 2342;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Position/Sensor/Limit as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_POSITION_SENSOR_LIMIT = 2343;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Position/Sensor/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_POSITION_SENSOR_MAX = 2344;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Position/Sensor/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_POSITION_SENSOR_MIN = 2345;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Position/Sensor/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_POSITION_SENSOR_NACK = 2346;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Position/Sensor/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_POSITION_SENSOR_OFFSET = 2347;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LKneePitch/Position/Sensor/SensorType as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_POSITION_SENSOR_SENSORTYPE = 2348;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LKneePitch/Position/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_POSITION_SENSOR_SUBDEVICENUMBER = 2349;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Position/Sensor/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_POSITION_SENSOR_TYPE = 2350;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Position/Sensor/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_POSITION_SENSOR_VALUE = 2351;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LKneePitch/Position/Sensor/jointZeroPosition as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_POSITION_SENSOR_JOINTZEROPOSITION = 2352;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LKneePitch/Position/Sensor/positionChainMREJoint as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_POSITION_SENSOR_POSITIONCHAINMREJOINT = 2353;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LKneePitch/Position/Sensor/positionChainMREMotor as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_POSITION_SENSOR_POSITIONCHAINMREMOTOR = 2354;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Temperature/Sensor/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_TEMPERATURE_SENSOR_ACK = 2355;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LKneePitch/Temperature/Sensor/AmbientTemperature as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_TEMPERATURE_SENSOR_AMBIENTTEMPERATURE = 2356;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LKneePitch/Temperature/Sensor/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_TEMPERATURE_SENSOR_DEVICE = 2357;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Temperature/Sensor/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_TEMPERATURE_SENSOR_ERROR = 2358;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Temperature/Sensor/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_TEMPERATURE_SENSOR_GAIN = 2359;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Temperature/Sensor/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_TEMPERATURE_SENSOR_MAX = 2360;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Temperature/Sensor/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_TEMPERATURE_SENSOR_MIN = 2361;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Temperature/Sensor/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_TEMPERATURE_SENSOR_NACK = 2362;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LKneePitch/Temperature/Sensor/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_TEMPERATURE_SENSOR_OFFSET = 2363;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Temperature/Sensor/
	 * OtherMotorTransmission as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_TEMPERATURE_SENSOR_OTHERMOTORTRANSMISSION = 2364;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LKneePitch/Temperature/Sensor/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_TEMPERATURE_SENSOR_SUBDEVICENUMBER = 2365;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LKneePitch/Temperature/Sensor/ThermalResistance as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_TEMPERATURE_SENSOR_THERMALRESISTANCE = 2366;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LKneePitch/Temperature/Sensor/ThermalTimeConstant as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_TEMPERATURE_SENSOR_THERMALTIMECONSTANT = 2367;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Temperature/Sensor/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_TEMPERATURE_SENSOR_TYPE = 2368;

	/**
	 * Id of the sensor Device/SubDeviceList/LKneePitch/Temperature/Sensor/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_TEMPERATURE_SENSOR_VALUE = 2369;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LKneePitch/Temperature/Sensor/motorModel as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_TEMPERATURE_SENSOR_MOTORMODEL = 2370;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/ElectricCurrent/Sensor/Ack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_ELECTRICCURRENT_SENSOR_ACK = 2371;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/ElectricCurrent/Sensor/Device as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_ELECTRICCURRENT_SENSOR_DEVICE = 2372;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/ElectricCurrent/Sensor/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_ELECTRICCURRENT_SENSOR_ERROR = 2373;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/ElectricCurrent/Sensor/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_ELECTRICCURRENT_SENSOR_GAIN = 2374;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/ElectricCurrent/Sensor/Max as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_ELECTRICCURRENT_SENSOR_MAX = 2375;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/ElectricCurrent/Sensor/Min as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_ELECTRICCURRENT_SENSOR_MIN = 2376;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/ElectricCurrent/Sensor/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_ELECTRICCURRENT_SENSOR_NACK = 2377;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/ElectricCurrent/Sensor/Offset as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_ELECTRICCURRENT_SENSOR_OFFSET = 2378;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/ElectricCurrent/Sensor
	 * /SubDeviceNumber as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_ELECTRICCURRENT_SENSOR_SUBDEVICENUMBER = 2379;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/ElectricCurrent/Sensor/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_ELECTRICCURRENT_SENSOR_TYPE = 2380;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/ElectricCurrent/Sensor/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_ELECTRICCURRENT_SENSOR_VALUE = 2381;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Hardness/Actuator/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_HARDNESS_ACTUATOR_ACK = 2382;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Hardness/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_HARDNESS_ACTUATOR_DEVICE = 2383;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Hardness/Actuator/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_HARDNESS_ACTUATOR_ERROR = 2384;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Hardness/Actuator/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_HARDNESS_ACTUATOR_GAIN = 2385;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Hardness/Actuator/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_HARDNESS_ACTUATOR_MAX = 2386;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Hardness/Actuator/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_HARDNESS_ACTUATOR_MIN = 2387;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Hardness/Actuator/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_HARDNESS_ACTUATOR_NACK = 2388;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Hardness/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_HARDNESS_ACTUATOR_OFFSET = 2389;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Hardness/Actuator/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_HARDNESS_ACTUATOR_SUBDEVICENUMBER = 2390;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Hardness/Actuator/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_HARDNESS_ACTUATOR_TYPE = 2391;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Hardness/Actuator/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_HARDNESS_ACTUATOR_VALUE = 2392;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Position/Actuator/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_POSITION_ACTUATOR_ACK = 2393;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Position/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_POSITION_ACTUATOR_DEVICE = 2394;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Position/Actuator/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_POSITION_ACTUATOR_ERROR = 2395;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Position/Actuator/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_POSITION_ACTUATOR_GAIN = 2396;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Position/Actuator/IMax as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_POSITION_ACTUATOR_IMAX = 2397;

	/**
	 * Id of the sensor Device/SubDeviceList/LShoulderPitch/Position/Actuator/
	 * InvertControlDirection as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_POSITION_ACTUATOR_INVERTCONTROLDIRECTION = 2398;

	/**
	 * Id of the sensor Device/SubDeviceList/LShoulderPitch/Position/Actuator/Kd
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_POSITION_ACTUATOR_KD = 2399;

	/**
	 * Id of the sensor Device/SubDeviceList/LShoulderPitch/Position/Actuator/Ki
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_POSITION_ACTUATOR_KI = 2400;

	/**
	 * Id of the sensor Device/SubDeviceList/LShoulderPitch/Position/Actuator/Kp
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_POSITION_ACTUATOR_KP = 2401;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Position/Actuator/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_POSITION_ACTUATOR_MAX = 2402;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Position/Actuator/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_POSITION_ACTUATOR_MIN = 2403;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Position/Actuator/MotorNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_POSITION_ACTUATOR_MOTORNUMBER = 2404;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Position/Actuator/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_POSITION_ACTUATOR_NACK = 2405;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Position/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_POSITION_ACTUATOR_OFFSET = 2406;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Position/Actuator/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_POSITION_ACTUATOR_SUBDEVICENUMBER = 2407;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Position/Actuator/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_POSITION_ACTUATOR_TYPE = 2408;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Position/Actuator/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_POSITION_ACTUATOR_VALUE = 2409;

	/**
	 * Id of the sensor Device/SubDeviceList/LShoulderPitch/Position/Sensor/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_POSITION_SENSOR_ACK = 2410;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Position/Sensor/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_POSITION_SENSOR_DEVICE = 2411;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Position/Sensor/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_POSITION_SENSOR_ERROR = 2412;

	/**
	 * Id of the sensor Device/SubDeviceList/LShoulderPitch/Position/Sensor/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_POSITION_SENSOR_GAIN = 2413;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Position/Sensor/GearRatio as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_POSITION_SENSOR_GEARRATIO = 2414;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Position/Sensor/Limit as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_POSITION_SENSOR_LIMIT = 2415;

	/**
	 * Id of the sensor Device/SubDeviceList/LShoulderPitch/Position/Sensor/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_POSITION_SENSOR_MAX = 2416;

	/**
	 * Id of the sensor Device/SubDeviceList/LShoulderPitch/Position/Sensor/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_POSITION_SENSOR_MIN = 2417;

	/**
	 * Id of the sensor Device/SubDeviceList/LShoulderPitch/Position/Sensor/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_POSITION_SENSOR_NACK = 2418;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Position/Sensor/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_POSITION_SENSOR_OFFSET = 2419;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Position/Sensor/SensorType as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_POSITION_SENSOR_SENSORTYPE = 2420;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Position/Sensor/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_POSITION_SENSOR_SUBDEVICENUMBER = 2421;

	/**
	 * Id of the sensor Device/SubDeviceList/LShoulderPitch/Position/Sensor/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_POSITION_SENSOR_TYPE = 2422;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Position/Sensor/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_POSITION_SENSOR_VALUE = 2423;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Position/Sensor/jointZeroPosition as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_POSITION_SENSOR_JOINTZEROPOSITION = 2424;

	/**
	 * Id of the sensor Device/SubDeviceList/LShoulderPitch/Position/Sensor/
	 * positionChainMREJoint as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_POSITION_SENSOR_POSITIONCHAINMREJOINT = 2425;

	/**
	 * Id of the sensor Device/SubDeviceList/LShoulderPitch/Position/Sensor/
	 * positionChainMREMotor as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_POSITION_SENSOR_POSITIONCHAINMREMOTOR = 2426;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Temperature/Sensor/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_TEMPERATURE_SENSOR_ACK = 2427;

	/**
	 * Id of the sensor Device/SubDeviceList/LShoulderPitch/Temperature/Sensor/
	 * AmbientTemperature as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_TEMPERATURE_SENSOR_AMBIENTTEMPERATURE = 2428;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Temperature/Sensor/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_TEMPERATURE_SENSOR_DEVICE = 2429;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Temperature/Sensor/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_TEMPERATURE_SENSOR_ERROR = 2430;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Temperature/Sensor/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_TEMPERATURE_SENSOR_GAIN = 2431;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Temperature/Sensor/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_TEMPERATURE_SENSOR_MAX = 2432;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Temperature/Sensor/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_TEMPERATURE_SENSOR_MIN = 2433;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Temperature/Sensor/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_TEMPERATURE_SENSOR_NACK = 2434;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Temperature/Sensor/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_TEMPERATURE_SENSOR_OFFSET = 2435;

	/**
	 * Id of the sensor Device/SubDeviceList/LShoulderPitch/Temperature/Sensor/
	 * OtherMotorTransmission as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_TEMPERATURE_SENSOR_OTHERMOTORTRANSMISSION = 2436;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Temperature/Sensor/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_TEMPERATURE_SENSOR_SUBDEVICENUMBER = 2437;

	/**
	 * Id of the sensor Device/SubDeviceList/LShoulderPitch/Temperature/Sensor/
	 * ThermalResistance as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_TEMPERATURE_SENSOR_THERMALRESISTANCE = 2438;

	/**
	 * Id of the sensor Device/SubDeviceList/LShoulderPitch/Temperature/Sensor/
	 * ThermalTimeConstant as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_TEMPERATURE_SENSOR_THERMALTIMECONSTANT = 2439;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Temperature/Sensor/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_TEMPERATURE_SENSOR_TYPE = 2440;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Temperature/Sensor/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_TEMPERATURE_SENSOR_VALUE = 2441;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderPitch/Temperature/Sensor/motorModel as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_TEMPERATURE_SENSOR_MOTORMODEL = 2442;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/ElectricCurrent/Sensor/Ack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_ELECTRICCURRENT_SENSOR_ACK = 2443;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/ElectricCurrent/Sensor/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_ELECTRICCURRENT_SENSOR_DEVICE = 2444;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/ElectricCurrent/Sensor/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_ELECTRICCURRENT_SENSOR_ERROR = 2445;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/ElectricCurrent/Sensor/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_ELECTRICCURRENT_SENSOR_GAIN = 2446;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/ElectricCurrent/Sensor/Max as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_ELECTRICCURRENT_SENSOR_MAX = 2447;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/ElectricCurrent/Sensor/Min as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_ELECTRICCURRENT_SENSOR_MIN = 2448;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/ElectricCurrent/Sensor/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_ELECTRICCURRENT_SENSOR_NACK = 2449;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/ElectricCurrent/Sensor/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_ELECTRICCURRENT_SENSOR_OFFSET = 2450;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/ElectricCurrent/Sensor/SubDeviceNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_ELECTRICCURRENT_SENSOR_SUBDEVICENUMBER = 2451;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/ElectricCurrent/Sensor/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_ELECTRICCURRENT_SENSOR_TYPE = 2452;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/ElectricCurrent/Sensor/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_ELECTRICCURRENT_SENSOR_VALUE = 2453;

	/**
	 * Id of the sensor Device/SubDeviceList/LShoulderRoll/Hardness/Actuator/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_HARDNESS_ACTUATOR_ACK = 2454;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/Hardness/Actuator/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_HARDNESS_ACTUATOR_DEVICE = 2455;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/Hardness/Actuator/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_HARDNESS_ACTUATOR_ERROR = 2456;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/Hardness/Actuator/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_HARDNESS_ACTUATOR_GAIN = 2457;

	/**
	 * Id of the sensor Device/SubDeviceList/LShoulderRoll/Hardness/Actuator/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_HARDNESS_ACTUATOR_MAX = 2458;

	/**
	 * Id of the sensor Device/SubDeviceList/LShoulderRoll/Hardness/Actuator/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_HARDNESS_ACTUATOR_MIN = 2459;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/Hardness/Actuator/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_HARDNESS_ACTUATOR_NACK = 2460;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/Hardness/Actuator/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_HARDNESS_ACTUATOR_OFFSET = 2461;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/Hardness/Actuator/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_HARDNESS_ACTUATOR_SUBDEVICENUMBER = 2462;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/Hardness/Actuator/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_HARDNESS_ACTUATOR_TYPE = 2463;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/Hardness/Actuator/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_HARDNESS_ACTUATOR_VALUE = 2464;

	/**
	 * Id of the sensor Device/SubDeviceList/LShoulderRoll/Position/Actuator/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_POSITION_ACTUATOR_ACK = 2465;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/Position/Actuator/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_POSITION_ACTUATOR_DEVICE = 2466;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/Position/Actuator/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_POSITION_ACTUATOR_ERROR = 2467;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/Position/Actuator/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_POSITION_ACTUATOR_GAIN = 2468;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/Position/Actuator/IMax as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_POSITION_ACTUATOR_IMAX = 2469;

	/**
	 * Id of the sensor Device/SubDeviceList/LShoulderRoll/Position/Actuator/
	 * InvertControlDirection as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_POSITION_ACTUATOR_INVERTCONTROLDIRECTION = 2470;

	/**
	 * Id of the sensor Device/SubDeviceList/LShoulderRoll/Position/Actuator/Kd
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_POSITION_ACTUATOR_KD = 2471;

	/**
	 * Id of the sensor Device/SubDeviceList/LShoulderRoll/Position/Actuator/Ki
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_POSITION_ACTUATOR_KI = 2472;

	/**
	 * Id of the sensor Device/SubDeviceList/LShoulderRoll/Position/Actuator/Kp
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_POSITION_ACTUATOR_KP = 2473;

	/**
	 * Id of the sensor Device/SubDeviceList/LShoulderRoll/Position/Actuator/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_POSITION_ACTUATOR_MAX = 2474;

	/**
	 * Id of the sensor Device/SubDeviceList/LShoulderRoll/Position/Actuator/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_POSITION_ACTUATOR_MIN = 2475;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/Position/Actuator/MotorNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_POSITION_ACTUATOR_MOTORNUMBER = 2476;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/Position/Actuator/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_POSITION_ACTUATOR_NACK = 2477;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/Position/Actuator/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_POSITION_ACTUATOR_OFFSET = 2478;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/Position/Actuator/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_POSITION_ACTUATOR_SUBDEVICENUMBER = 2479;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/Position/Actuator/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_POSITION_ACTUATOR_TYPE = 2480;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/Position/Actuator/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_POSITION_ACTUATOR_VALUE = 2481;

	/**
	 * Id of the sensor Device/SubDeviceList/LShoulderRoll/Position/Sensor/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_POSITION_SENSOR_ACK = 2482;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/Position/Sensor/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_POSITION_SENSOR_DEVICE = 2483;

	/**
	 * Id of the sensor Device/SubDeviceList/LShoulderRoll/Position/Sensor/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_POSITION_SENSOR_ERROR = 2484;

	/**
	 * Id of the sensor Device/SubDeviceList/LShoulderRoll/Position/Sensor/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_POSITION_SENSOR_GAIN = 2485;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/Position/Sensor/GearRatio as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_POSITION_SENSOR_GEARRATIO = 2486;

	/**
	 * Id of the sensor Device/SubDeviceList/LShoulderRoll/Position/Sensor/Limit
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_POSITION_SENSOR_LIMIT = 2487;

	/**
	 * Id of the sensor Device/SubDeviceList/LShoulderRoll/Position/Sensor/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_POSITION_SENSOR_MAX = 2488;

	/**
	 * Id of the sensor Device/SubDeviceList/LShoulderRoll/Position/Sensor/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_POSITION_SENSOR_MIN = 2489;

	/**
	 * Id of the sensor Device/SubDeviceList/LShoulderRoll/Position/Sensor/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_POSITION_SENSOR_NACK = 2490;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/Position/Sensor/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_POSITION_SENSOR_OFFSET = 2491;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/Position/Sensor/SensorType as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_POSITION_SENSOR_SENSORTYPE = 2492;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/Position/Sensor/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_POSITION_SENSOR_SUBDEVICENUMBER = 2493;

	/**
	 * Id of the sensor Device/SubDeviceList/LShoulderRoll/Position/Sensor/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_POSITION_SENSOR_TYPE = 2494;

	/**
	 * Id of the sensor Device/SubDeviceList/LShoulderRoll/Position/Sensor/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_POSITION_SENSOR_VALUE = 2495;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/Position/Sensor/jointZeroPosition as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_POSITION_SENSOR_JOINTZEROPOSITION = 2496;

	/**
	 * Id of the sensor Device/SubDeviceList/LShoulderRoll/Position/Sensor/
	 * positionChainMREJoint as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_POSITION_SENSOR_POSITIONCHAINMREJOINT = 2497;

	/**
	 * Id of the sensor Device/SubDeviceList/LShoulderRoll/Position/Sensor/
	 * positionChainMREMotor as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_POSITION_SENSOR_POSITIONCHAINMREMOTOR = 2498;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/Temperature/Sensor/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_TEMPERATURE_SENSOR_ACK = 2499;

	/**
	 * Id of the sensor Device/SubDeviceList/LShoulderRoll/Temperature/Sensor/
	 * AmbientTemperature as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_TEMPERATURE_SENSOR_AMBIENTTEMPERATURE = 2500;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/Temperature/Sensor/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_TEMPERATURE_SENSOR_DEVICE = 2501;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/Temperature/Sensor/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_TEMPERATURE_SENSOR_ERROR = 2502;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/Temperature/Sensor/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_TEMPERATURE_SENSOR_GAIN = 2503;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/Temperature/Sensor/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_TEMPERATURE_SENSOR_MAX = 2504;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/Temperature/Sensor/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_TEMPERATURE_SENSOR_MIN = 2505;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/Temperature/Sensor/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_TEMPERATURE_SENSOR_NACK = 2506;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/Temperature/Sensor/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_TEMPERATURE_SENSOR_OFFSET = 2507;

	/**
	 * Id of the sensor Device/SubDeviceList/LShoulderRoll/Temperature/Sensor/
	 * OtherMotorTransmission as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_TEMPERATURE_SENSOR_OTHERMOTORTRANSMISSION = 2508;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/Temperature/Sensor/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_TEMPERATURE_SENSOR_SUBDEVICENUMBER = 2509;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/Temperature/Sensor/ThermalResistance
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_TEMPERATURE_SENSOR_THERMALRESISTANCE = 2510;

	/**
	 * Id of the sensor Device/SubDeviceList/LShoulderRoll/Temperature/Sensor/
	 * ThermalTimeConstant as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_TEMPERATURE_SENSOR_THERMALTIMECONSTANT = 2511;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/Temperature/Sensor/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_TEMPERATURE_SENSOR_TYPE = 2512;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/Temperature/Sensor/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_TEMPERATURE_SENSOR_VALUE = 2513;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LShoulderRoll/Temperature/Sensor/motorModel as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_TEMPERATURE_SENSOR_MOTORMODEL = 2514;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LWristYaw/ElectricCurrent/Sensor/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_ELECTRICCURRENT_SENSOR_ACK = 2515;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LWristYaw/ElectricCurrent/Sensor/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_ELECTRICCURRENT_SENSOR_DEVICE = 2516;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LWristYaw/ElectricCurrent/Sensor/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_ELECTRICCURRENT_SENSOR_ERROR = 2517;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LWristYaw/ElectricCurrent/Sensor/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_ELECTRICCURRENT_SENSOR_GAIN = 2518;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LWristYaw/ElectricCurrent/Sensor/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_ELECTRICCURRENT_SENSOR_MAX = 2519;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LWristYaw/ElectricCurrent/Sensor/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_ELECTRICCURRENT_SENSOR_MIN = 2520;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LWristYaw/ElectricCurrent/Sensor/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_ELECTRICCURRENT_SENSOR_NACK = 2521;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LWristYaw/ElectricCurrent/Sensor/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_ELECTRICCURRENT_SENSOR_OFFSET = 2522;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LWristYaw/ElectricCurrent/Sensor/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_ELECTRICCURRENT_SENSOR_SUBDEVICENUMBER = 2523;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LWristYaw/ElectricCurrent/Sensor/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_ELECTRICCURRENT_SENSOR_TYPE = 2524;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LWristYaw/ElectricCurrent/Sensor/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_ELECTRICCURRENT_SENSOR_VALUE = 2525;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Hardness/Actuator/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_HARDNESS_ACTUATOR_ACK = 2526;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Hardness/Actuator/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_HARDNESS_ACTUATOR_DEVICE = 2527;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Hardness/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_HARDNESS_ACTUATOR_ERROR = 2528;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Hardness/Actuator/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_HARDNESS_ACTUATOR_GAIN = 2529;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Hardness/Actuator/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_HARDNESS_ACTUATOR_MAX = 2530;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Hardness/Actuator/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_HARDNESS_ACTUATOR_MIN = 2531;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Hardness/Actuator/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_HARDNESS_ACTUATOR_NACK = 2532;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Hardness/Actuator/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_HARDNESS_ACTUATOR_OFFSET = 2533;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LWristYaw/Hardness/Actuator/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_HARDNESS_ACTUATOR_SUBDEVICENUMBER = 2534;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Hardness/Actuator/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_HARDNESS_ACTUATOR_TYPE = 2535;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Hardness/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_HARDNESS_ACTUATOR_VALUE = 2536;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Position/Actuator/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_POSITION_ACTUATOR_ACK = 2537;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Position/Actuator/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_POSITION_ACTUATOR_DEVICE = 2538;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Position/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_POSITION_ACTUATOR_ERROR = 2539;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Position/Actuator/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_POSITION_ACTUATOR_GAIN = 2540;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Position/Actuator/IMax as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_POSITION_ACTUATOR_IMAX = 2541;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LWristYaw/Position/Actuator/InvertControlDirection
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_POSITION_ACTUATOR_INVERTCONTROLDIRECTION = 2542;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Position/Actuator/Kd as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_POSITION_ACTUATOR_KD = 2543;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Position/Actuator/Ki as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_POSITION_ACTUATOR_KI = 2544;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Position/Actuator/Kp as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_POSITION_ACTUATOR_KP = 2545;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Position/Actuator/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_POSITION_ACTUATOR_MAX = 2546;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Position/Actuator/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_POSITION_ACTUATOR_MIN = 2547;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LWristYaw/Position/Actuator/MotorNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_POSITION_ACTUATOR_MOTORNUMBER = 2548;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Position/Actuator/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_POSITION_ACTUATOR_NACK = 2549;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Position/Actuator/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_POSITION_ACTUATOR_OFFSET = 2550;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LWristYaw/Position/Actuator/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_POSITION_ACTUATOR_SUBDEVICENUMBER = 2551;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Position/Actuator/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_POSITION_ACTUATOR_TYPE = 2552;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Position/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_POSITION_ACTUATOR_VALUE = 2553;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Position/Sensor/Ack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_POSITION_SENSOR_ACK = 2554;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Position/Sensor/Device as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_POSITION_SENSOR_DEVICE = 2555;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Position/Sensor/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_POSITION_SENSOR_ERROR = 2556;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Position/Sensor/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_POSITION_SENSOR_GAIN = 2557;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Position/Sensor/GearRatio
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_POSITION_SENSOR_GEARRATIO = 2558;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Position/Sensor/Limit as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_POSITION_SENSOR_LIMIT = 2559;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Position/Sensor/Max as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_POSITION_SENSOR_MAX = 2560;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Position/Sensor/Min as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_POSITION_SENSOR_MIN = 2561;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Position/Sensor/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_POSITION_SENSOR_NACK = 2562;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Position/Sensor/Offset as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_POSITION_SENSOR_OFFSET = 2563;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LWristYaw/Position/Sensor/SensorType as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_POSITION_SENSOR_SENSORTYPE = 2564;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LWristYaw/Position/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_POSITION_SENSOR_SUBDEVICENUMBER = 2565;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Position/Sensor/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_POSITION_SENSOR_TYPE = 2566;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Position/Sensor/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_POSITION_SENSOR_VALUE = 2567;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LWristYaw/Position/Sensor/jointZeroPosition as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_POSITION_SENSOR_JOINTZEROPOSITION = 2568;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LWristYaw/Position/Sensor/positionChainMREJoint as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_POSITION_SENSOR_POSITIONCHAINMREJOINT = 2569;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LWristYaw/Position/Sensor/positionChainMREMotor as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_POSITION_SENSOR_POSITIONCHAINMREMOTOR = 2570;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Temperature/Sensor/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_TEMPERATURE_SENSOR_ACK = 2571;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LWristYaw/Temperature/Sensor/AmbientTemperature as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_TEMPERATURE_SENSOR_AMBIENTTEMPERATURE = 2572;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Temperature/Sensor/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_TEMPERATURE_SENSOR_DEVICE = 2573;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Temperature/Sensor/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_TEMPERATURE_SENSOR_ERROR = 2574;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Temperature/Sensor/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_TEMPERATURE_SENSOR_GAIN = 2575;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Temperature/Sensor/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_TEMPERATURE_SENSOR_MAX = 2576;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Temperature/Sensor/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_TEMPERATURE_SENSOR_MIN = 2577;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Temperature/Sensor/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_TEMPERATURE_SENSOR_NACK = 2578;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Temperature/Sensor/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_TEMPERATURE_SENSOR_OFFSET = 2579;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Temperature/Sensor/
	 * OtherMotorTransmission as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_TEMPERATURE_SENSOR_OTHERMOTORTRANSMISSION = 2580;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LWristYaw/Temperature/Sensor/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_TEMPERATURE_SENSOR_SUBDEVICENUMBER = 2581;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LWristYaw/Temperature/Sensor/ThermalResistance as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_TEMPERATURE_SENSOR_THERMALRESISTANCE = 2582;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LWristYaw/Temperature/Sensor/ThermalTimeConstant as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_TEMPERATURE_SENSOR_THERMALTIMECONSTANT = 2583;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Temperature/Sensor/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_TEMPERATURE_SENSOR_TYPE = 2584;

	/**
	 * Id of the sensor Device/SubDeviceList/LWristYaw/Temperature/Sensor/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_TEMPERATURE_SENSOR_VALUE = 2585;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/LWristYaw/Temperature/Sensor/motorModel as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_LWRISTYAW_TEMPERATURE_SENSOR_MOTORMODEL = 2586;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnklePitch/ElectricCurrent/Sensor/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_ELECTRICCURRENT_SENSOR_ACK = 2587;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnklePitch/ElectricCurrent/Sensor/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_ELECTRICCURRENT_SENSOR_DEVICE = 2588;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnklePitch/ElectricCurrent/Sensor/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_ELECTRICCURRENT_SENSOR_ERROR = 2589;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnklePitch/ElectricCurrent/Sensor/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_ELECTRICCURRENT_SENSOR_GAIN = 2590;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnklePitch/ElectricCurrent/Sensor/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_ELECTRICCURRENT_SENSOR_MAX = 2591;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnklePitch/ElectricCurrent/Sensor/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_ELECTRICCURRENT_SENSOR_MIN = 2592;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnklePitch/ElectricCurrent/Sensor/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_ELECTRICCURRENT_SENSOR_NACK = 2593;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnklePitch/ElectricCurrent/Sensor/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_ELECTRICCURRENT_SENSOR_OFFSET = 2594;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnklePitch/ElectricCurrent/Sensor/SubDeviceNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_ELECTRICCURRENT_SENSOR_SUBDEVICENUMBER = 2595;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnklePitch/ElectricCurrent/Sensor/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_ELECTRICCURRENT_SENSOR_TYPE = 2596;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnklePitch/ElectricCurrent/Sensor/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_ELECTRICCURRENT_SENSOR_VALUE = 2597;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnklePitch/Hardness/Actuator/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_HARDNESS_ACTUATOR_ACK = 2598;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnklePitch/Hardness/Actuator/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_HARDNESS_ACTUATOR_DEVICE = 2599;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnklePitch/Hardness/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_HARDNESS_ACTUATOR_ERROR = 2600;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnklePitch/Hardness/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_HARDNESS_ACTUATOR_GAIN = 2601;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnklePitch/Hardness/Actuator/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_HARDNESS_ACTUATOR_MAX = 2602;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnklePitch/Hardness/Actuator/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_HARDNESS_ACTUATOR_MIN = 2603;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnklePitch/Hardness/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_HARDNESS_ACTUATOR_NACK = 2604;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnklePitch/Hardness/Actuator/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_HARDNESS_ACTUATOR_OFFSET = 2605;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnklePitch/Hardness/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_HARDNESS_ACTUATOR_SUBDEVICENUMBER = 2606;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnklePitch/Hardness/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_HARDNESS_ACTUATOR_TYPE = 2607;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnklePitch/Hardness/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_HARDNESS_ACTUATOR_VALUE = 2608;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnklePitch/Position/Actuator/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_POSITION_ACTUATOR_ACK = 2609;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnklePitch/Position/Actuator/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_POSITION_ACTUATOR_DEVICE = 2610;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnklePitch/Position/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_POSITION_ACTUATOR_ERROR = 2611;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnklePitch/Position/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_POSITION_ACTUATOR_GAIN = 2612;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnklePitch/Position/Actuator/IMax
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_POSITION_ACTUATOR_IMAX = 2613;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnklePitch/Position/Actuator/
	 * InvertControlDirection as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_POSITION_ACTUATOR_INVERTCONTROLDIRECTION = 2614;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnklePitch/Position/Actuator/Kd as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_POSITION_ACTUATOR_KD = 2615;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnklePitch/Position/Actuator/Ki as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_POSITION_ACTUATOR_KI = 2616;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnklePitch/Position/Actuator/Kp as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_POSITION_ACTUATOR_KP = 2617;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnklePitch/Position/Actuator/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_POSITION_ACTUATOR_MAX = 2618;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnklePitch/Position/Actuator/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_POSITION_ACTUATOR_MIN = 2619;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnklePitch/Position/Actuator/MotorNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_POSITION_ACTUATOR_MOTORNUMBER = 2620;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnklePitch/Position/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_POSITION_ACTUATOR_NACK = 2621;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnklePitch/Position/Actuator/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_POSITION_ACTUATOR_OFFSET = 2622;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnklePitch/Position/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_POSITION_ACTUATOR_SUBDEVICENUMBER = 2623;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnklePitch/Position/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_POSITION_ACTUATOR_TYPE = 2624;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnklePitch/Position/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_POSITION_ACTUATOR_VALUE = 2625;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnklePitch/Position/Sensor/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_POSITION_SENSOR_ACK = 2626;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnklePitch/Position/Sensor/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_POSITION_SENSOR_DEVICE = 2627;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnklePitch/Position/Sensor/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_POSITION_SENSOR_ERROR = 2628;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnklePitch/Position/Sensor/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_POSITION_SENSOR_GAIN = 2629;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnklePitch/Position/Sensor/GearRatio as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_POSITION_SENSOR_GEARRATIO = 2630;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnklePitch/Position/Sensor/Limit
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_POSITION_SENSOR_LIMIT = 2631;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnklePitch/Position/Sensor/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_POSITION_SENSOR_MAX = 2632;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnklePitch/Position/Sensor/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_POSITION_SENSOR_MIN = 2633;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnklePitch/Position/Sensor/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_POSITION_SENSOR_NACK = 2634;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnklePitch/Position/Sensor/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_POSITION_SENSOR_OFFSET = 2635;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnklePitch/Position/Sensor/SensorType as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_POSITION_SENSOR_SENSORTYPE = 2636;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnklePitch/Position/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_POSITION_SENSOR_SUBDEVICENUMBER = 2637;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnklePitch/Position/Sensor/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_POSITION_SENSOR_TYPE = 2638;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnklePitch/Position/Sensor/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_POSITION_SENSOR_VALUE = 2639;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnklePitch/Position/Sensor/jointZeroPosition as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_POSITION_SENSOR_JOINTZEROPOSITION = 2640;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnklePitch/Position/Sensor/positionChainMREJoint as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_POSITION_SENSOR_POSITIONCHAINMREJOINT = 2641;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnklePitch/Position/Sensor/positionChainMREMotor as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_POSITION_SENSOR_POSITIONCHAINMREMOTOR = 2642;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnklePitch/Temperature/Sensor/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_TEMPERATURE_SENSOR_ACK = 2643;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnklePitch/Temperature/Sensor/AmbientTemperature as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_TEMPERATURE_SENSOR_AMBIENTTEMPERATURE = 2644;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnklePitch/Temperature/Sensor/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_TEMPERATURE_SENSOR_DEVICE = 2645;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnklePitch/Temperature/Sensor/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_TEMPERATURE_SENSOR_ERROR = 2646;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnklePitch/Temperature/Sensor/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_TEMPERATURE_SENSOR_GAIN = 2647;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnklePitch/Temperature/Sensor/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_TEMPERATURE_SENSOR_MAX = 2648;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnklePitch/Temperature/Sensor/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_TEMPERATURE_SENSOR_MIN = 2649;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnklePitch/Temperature/Sensor/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_TEMPERATURE_SENSOR_NACK = 2650;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnklePitch/Temperature/Sensor/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_TEMPERATURE_SENSOR_OFFSET = 2651;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnklePitch/Temperature/Sensor/
	 * OtherMotorTransmission as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_TEMPERATURE_SENSOR_OTHERMOTORTRANSMISSION = 2652;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnklePitch/Temperature/Sensor/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_TEMPERATURE_SENSOR_SUBDEVICENUMBER = 2653;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnklePitch/Temperature/Sensor/ThermalResistance as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_TEMPERATURE_SENSOR_THERMALRESISTANCE = 2654;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnklePitch/Temperature/Sensor/ThermalTimeConstant
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_TEMPERATURE_SENSOR_THERMALTIMECONSTANT = 2655;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnklePitch/Temperature/Sensor/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_TEMPERATURE_SENSOR_TYPE = 2656;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnklePitch/Temperature/Sensor/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_TEMPERATURE_SENSOR_VALUE = 2657;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnklePitch/Temperature/Sensor/motorModel as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_TEMPERATURE_SENSOR_MOTORMODEL = 2658;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnkleRoll/ElectricCurrent/Sensor/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_ELECTRICCURRENT_SENSOR_ACK = 2659;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnkleRoll/ElectricCurrent/Sensor/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_ELECTRICCURRENT_SENSOR_DEVICE = 2660;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnkleRoll/ElectricCurrent/Sensor/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_ELECTRICCURRENT_SENSOR_ERROR = 2661;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnkleRoll/ElectricCurrent/Sensor/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_ELECTRICCURRENT_SENSOR_GAIN = 2662;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnkleRoll/ElectricCurrent/Sensor/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_ELECTRICCURRENT_SENSOR_MAX = 2663;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnkleRoll/ElectricCurrent/Sensor/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_ELECTRICCURRENT_SENSOR_MIN = 2664;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnkleRoll/ElectricCurrent/Sensor/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_ELECTRICCURRENT_SENSOR_NACK = 2665;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnkleRoll/ElectricCurrent/Sensor/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_ELECTRICCURRENT_SENSOR_OFFSET = 2666;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnkleRoll/ElectricCurrent/Sensor/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_ELECTRICCURRENT_SENSOR_SUBDEVICENUMBER = 2667;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnkleRoll/ElectricCurrent/Sensor/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_ELECTRICCURRENT_SENSOR_TYPE = 2668;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnkleRoll/ElectricCurrent/Sensor/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_ELECTRICCURRENT_SENSOR_VALUE = 2669;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Hardness/Actuator/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_HARDNESS_ACTUATOR_ACK = 2670;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Hardness/Actuator/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_HARDNESS_ACTUATOR_DEVICE = 2671;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Hardness/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_HARDNESS_ACTUATOR_ERROR = 2672;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Hardness/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_HARDNESS_ACTUATOR_GAIN = 2673;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Hardness/Actuator/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_HARDNESS_ACTUATOR_MAX = 2674;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Hardness/Actuator/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_HARDNESS_ACTUATOR_MIN = 2675;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Hardness/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_HARDNESS_ACTUATOR_NACK = 2676;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Hardness/Actuator/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_HARDNESS_ACTUATOR_OFFSET = 2677;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnkleRoll/Hardness/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_HARDNESS_ACTUATOR_SUBDEVICENUMBER = 2678;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Hardness/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_HARDNESS_ACTUATOR_TYPE = 2679;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Hardness/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_HARDNESS_ACTUATOR_VALUE = 2680;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Position/Actuator/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_POSITION_ACTUATOR_ACK = 2681;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Position/Actuator/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_POSITION_ACTUATOR_DEVICE = 2682;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Position/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_POSITION_ACTUATOR_ERROR = 2683;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Position/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_POSITION_ACTUATOR_GAIN = 2684;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Position/Actuator/IMax
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_POSITION_ACTUATOR_IMAX = 2685;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Position/Actuator/
	 * InvertControlDirection as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_POSITION_ACTUATOR_INVERTCONTROLDIRECTION = 2686;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Position/Actuator/Kd as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_POSITION_ACTUATOR_KD = 2687;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Position/Actuator/Ki as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_POSITION_ACTUATOR_KI = 2688;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Position/Actuator/Kp as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_POSITION_ACTUATOR_KP = 2689;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Position/Actuator/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_POSITION_ACTUATOR_MAX = 2690;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Position/Actuator/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_POSITION_ACTUATOR_MIN = 2691;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnkleRoll/Position/Actuator/MotorNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_POSITION_ACTUATOR_MOTORNUMBER = 2692;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Position/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_POSITION_ACTUATOR_NACK = 2693;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Position/Actuator/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_POSITION_ACTUATOR_OFFSET = 2694;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnkleRoll/Position/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_POSITION_ACTUATOR_SUBDEVICENUMBER = 2695;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Position/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_POSITION_ACTUATOR_TYPE = 2696;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Position/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_POSITION_ACTUATOR_VALUE = 2697;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Position/Sensor/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_POSITION_SENSOR_ACK = 2698;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Position/Sensor/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_POSITION_SENSOR_DEVICE = 2699;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Position/Sensor/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_POSITION_SENSOR_ERROR = 2700;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Position/Sensor/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_POSITION_SENSOR_GAIN = 2701;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnkleRoll/Position/Sensor/GearRatio as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_POSITION_SENSOR_GEARRATIO = 2702;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Position/Sensor/Limit as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_POSITION_SENSOR_LIMIT = 2703;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Position/Sensor/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_POSITION_SENSOR_MAX = 2704;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Position/Sensor/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_POSITION_SENSOR_MIN = 2705;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Position/Sensor/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_POSITION_SENSOR_NACK = 2706;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Position/Sensor/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_POSITION_SENSOR_OFFSET = 2707;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnkleRoll/Position/Sensor/SensorType as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_POSITION_SENSOR_SENSORTYPE = 2708;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnkleRoll/Position/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_POSITION_SENSOR_SUBDEVICENUMBER = 2709;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Position/Sensor/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_POSITION_SENSOR_TYPE = 2710;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Position/Sensor/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_POSITION_SENSOR_VALUE = 2711;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnkleRoll/Position/Sensor/jointZeroPosition as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_POSITION_SENSOR_JOINTZEROPOSITION = 2712;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnkleRoll/Position/Sensor/positionChainMREJoint as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_POSITION_SENSOR_POSITIONCHAINMREJOINT = 2713;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnkleRoll/Position/Sensor/positionChainMREMotor as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_POSITION_SENSOR_POSITIONCHAINMREMOTOR = 2714;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Temperature/Sensor/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_TEMPERATURE_SENSOR_ACK = 2715;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnkleRoll/Temperature/Sensor/AmbientTemperature as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_TEMPERATURE_SENSOR_AMBIENTTEMPERATURE = 2716;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnkleRoll/Temperature/Sensor/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_TEMPERATURE_SENSOR_DEVICE = 2717;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Temperature/Sensor/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_TEMPERATURE_SENSOR_ERROR = 2718;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Temperature/Sensor/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_TEMPERATURE_SENSOR_GAIN = 2719;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Temperature/Sensor/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_TEMPERATURE_SENSOR_MAX = 2720;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Temperature/Sensor/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_TEMPERATURE_SENSOR_MIN = 2721;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Temperature/Sensor/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_TEMPERATURE_SENSOR_NACK = 2722;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnkleRoll/Temperature/Sensor/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_TEMPERATURE_SENSOR_OFFSET = 2723;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Temperature/Sensor/
	 * OtherMotorTransmission as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_TEMPERATURE_SENSOR_OTHERMOTORTRANSMISSION = 2724;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnkleRoll/Temperature/Sensor/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_TEMPERATURE_SENSOR_SUBDEVICENUMBER = 2725;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnkleRoll/Temperature/Sensor/ThermalResistance as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_TEMPERATURE_SENSOR_THERMALRESISTANCE = 2726;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnkleRoll/Temperature/Sensor/ThermalTimeConstant as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_TEMPERATURE_SENSOR_THERMALTIMECONSTANT = 2727;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Temperature/Sensor/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_TEMPERATURE_SENSOR_TYPE = 2728;

	/**
	 * Id of the sensor Device/SubDeviceList/RAnkleRoll/Temperature/Sensor/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_TEMPERATURE_SENSOR_VALUE = 2729;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RAnkleRoll/Temperature/Sensor/motorModel as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_TEMPERATURE_SENSOR_MOTORMODEL = 2730;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowRoll/ElectricCurrent/Sensor/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_ELECTRICCURRENT_SENSOR_ACK = 2731;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowRoll/ElectricCurrent/Sensor/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_ELECTRICCURRENT_SENSOR_DEVICE = 2732;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowRoll/ElectricCurrent/Sensor/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_ELECTRICCURRENT_SENSOR_ERROR = 2733;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowRoll/ElectricCurrent/Sensor/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_ELECTRICCURRENT_SENSOR_GAIN = 2734;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowRoll/ElectricCurrent/Sensor/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_ELECTRICCURRENT_SENSOR_MAX = 2735;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowRoll/ElectricCurrent/Sensor/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_ELECTRICCURRENT_SENSOR_MIN = 2736;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowRoll/ElectricCurrent/Sensor/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_ELECTRICCURRENT_SENSOR_NACK = 2737;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowRoll/ElectricCurrent/Sensor/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_ELECTRICCURRENT_SENSOR_OFFSET = 2738;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowRoll/ElectricCurrent/Sensor/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_ELECTRICCURRENT_SENSOR_SUBDEVICENUMBER = 2739;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowRoll/ElectricCurrent/Sensor/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_ELECTRICCURRENT_SENSOR_TYPE = 2740;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowRoll/ElectricCurrent/Sensor/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_ELECTRICCURRENT_SENSOR_VALUE = 2741;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Hardness/Actuator/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_HARDNESS_ACTUATOR_ACK = 2742;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Hardness/Actuator/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_HARDNESS_ACTUATOR_DEVICE = 2743;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Hardness/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_HARDNESS_ACTUATOR_ERROR = 2744;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Hardness/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_HARDNESS_ACTUATOR_GAIN = 2745;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Hardness/Actuator/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_HARDNESS_ACTUATOR_MAX = 2746;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Hardness/Actuator/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_HARDNESS_ACTUATOR_MIN = 2747;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Hardness/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_HARDNESS_ACTUATOR_NACK = 2748;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Hardness/Actuator/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_HARDNESS_ACTUATOR_OFFSET = 2749;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowRoll/Hardness/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_HARDNESS_ACTUATOR_SUBDEVICENUMBER = 2750;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Hardness/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_HARDNESS_ACTUATOR_TYPE = 2751;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Hardness/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_HARDNESS_ACTUATOR_VALUE = 2752;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Position/Actuator/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_POSITION_ACTUATOR_ACK = 2753;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Position/Actuator/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_POSITION_ACTUATOR_DEVICE = 2754;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Position/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_POSITION_ACTUATOR_ERROR = 2755;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Position/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_POSITION_ACTUATOR_GAIN = 2756;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Position/Actuator/IMax
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_POSITION_ACTUATOR_IMAX = 2757;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Position/Actuator/
	 * InvertControlDirection as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_POSITION_ACTUATOR_INVERTCONTROLDIRECTION = 2758;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Position/Actuator/Kd as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_POSITION_ACTUATOR_KD = 2759;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Position/Actuator/Ki as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_POSITION_ACTUATOR_KI = 2760;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Position/Actuator/Kp as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_POSITION_ACTUATOR_KP = 2761;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Position/Actuator/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_POSITION_ACTUATOR_MAX = 2762;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Position/Actuator/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_POSITION_ACTUATOR_MIN = 2763;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowRoll/Position/Actuator/MotorNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_POSITION_ACTUATOR_MOTORNUMBER = 2764;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Position/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_POSITION_ACTUATOR_NACK = 2765;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Position/Actuator/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_POSITION_ACTUATOR_OFFSET = 2766;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowRoll/Position/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_POSITION_ACTUATOR_SUBDEVICENUMBER = 2767;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Position/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_POSITION_ACTUATOR_TYPE = 2768;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Position/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_POSITION_ACTUATOR_VALUE = 2769;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Position/Sensor/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_POSITION_SENSOR_ACK = 2770;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Position/Sensor/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_POSITION_SENSOR_DEVICE = 2771;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Position/Sensor/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_POSITION_SENSOR_ERROR = 2772;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Position/Sensor/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_POSITION_SENSOR_GAIN = 2773;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowRoll/Position/Sensor/GearRatio as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_POSITION_SENSOR_GEARRATIO = 2774;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Position/Sensor/Limit as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_POSITION_SENSOR_LIMIT = 2775;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Position/Sensor/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_POSITION_SENSOR_MAX = 2776;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Position/Sensor/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_POSITION_SENSOR_MIN = 2777;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Position/Sensor/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_POSITION_SENSOR_NACK = 2778;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Position/Sensor/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_POSITION_SENSOR_OFFSET = 2779;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowRoll/Position/Sensor/SensorType as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_POSITION_SENSOR_SENSORTYPE = 2780;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowRoll/Position/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_POSITION_SENSOR_SUBDEVICENUMBER = 2781;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Position/Sensor/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_POSITION_SENSOR_TYPE = 2782;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Position/Sensor/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_POSITION_SENSOR_VALUE = 2783;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowRoll/Position/Sensor/jointZeroPosition as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_POSITION_SENSOR_JOINTZEROPOSITION = 2784;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowRoll/Position/Sensor/positionChainMREJoint as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_POSITION_SENSOR_POSITIONCHAINMREJOINT = 2785;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowRoll/Position/Sensor/positionChainMREMotor as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_POSITION_SENSOR_POSITIONCHAINMREMOTOR = 2786;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Temperature/Sensor/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_TEMPERATURE_SENSOR_ACK = 2787;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowRoll/Temperature/Sensor/AmbientTemperature as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_TEMPERATURE_SENSOR_AMBIENTTEMPERATURE = 2788;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowRoll/Temperature/Sensor/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_TEMPERATURE_SENSOR_DEVICE = 2789;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Temperature/Sensor/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_TEMPERATURE_SENSOR_ERROR = 2790;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Temperature/Sensor/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_TEMPERATURE_SENSOR_GAIN = 2791;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Temperature/Sensor/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_TEMPERATURE_SENSOR_MAX = 2792;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Temperature/Sensor/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_TEMPERATURE_SENSOR_MIN = 2793;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Temperature/Sensor/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_TEMPERATURE_SENSOR_NACK = 2794;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowRoll/Temperature/Sensor/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_TEMPERATURE_SENSOR_OFFSET = 2795;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Temperature/Sensor/
	 * OtherMotorTransmission as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_TEMPERATURE_SENSOR_OTHERMOTORTRANSMISSION = 2796;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowRoll/Temperature/Sensor/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_TEMPERATURE_SENSOR_SUBDEVICENUMBER = 2797;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowRoll/Temperature/Sensor/ThermalResistance as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_TEMPERATURE_SENSOR_THERMALRESISTANCE = 2798;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowRoll/Temperature/Sensor/ThermalTimeConstant as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_TEMPERATURE_SENSOR_THERMALTIMECONSTANT = 2799;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Temperature/Sensor/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_TEMPERATURE_SENSOR_TYPE = 2800;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowRoll/Temperature/Sensor/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_TEMPERATURE_SENSOR_VALUE = 2801;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowRoll/Temperature/Sensor/motorModel as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_TEMPERATURE_SENSOR_MOTORMODEL = 2802;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowYaw/ElectricCurrent/Sensor/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_ELECTRICCURRENT_SENSOR_ACK = 2803;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowYaw/ElectricCurrent/Sensor/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_ELECTRICCURRENT_SENSOR_DEVICE = 2804;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowYaw/ElectricCurrent/Sensor/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_ELECTRICCURRENT_SENSOR_ERROR = 2805;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowYaw/ElectricCurrent/Sensor/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_ELECTRICCURRENT_SENSOR_GAIN = 2806;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowYaw/ElectricCurrent/Sensor/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_ELECTRICCURRENT_SENSOR_MAX = 2807;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowYaw/ElectricCurrent/Sensor/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_ELECTRICCURRENT_SENSOR_MIN = 2808;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowYaw/ElectricCurrent/Sensor/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_ELECTRICCURRENT_SENSOR_NACK = 2809;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowYaw/ElectricCurrent/Sensor/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_ELECTRICCURRENT_SENSOR_OFFSET = 2810;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowYaw/ElectricCurrent/Sensor/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_ELECTRICCURRENT_SENSOR_SUBDEVICENUMBER = 2811;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowYaw/ElectricCurrent/Sensor/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_ELECTRICCURRENT_SENSOR_TYPE = 2812;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowYaw/ElectricCurrent/Sensor/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_ELECTRICCURRENT_SENSOR_VALUE = 2813;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Hardness/Actuator/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_HARDNESS_ACTUATOR_ACK = 2814;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Hardness/Actuator/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_HARDNESS_ACTUATOR_DEVICE = 2815;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Hardness/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_HARDNESS_ACTUATOR_ERROR = 2816;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Hardness/Actuator/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_HARDNESS_ACTUATOR_GAIN = 2817;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Hardness/Actuator/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_HARDNESS_ACTUATOR_MAX = 2818;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Hardness/Actuator/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_HARDNESS_ACTUATOR_MIN = 2819;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Hardness/Actuator/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_HARDNESS_ACTUATOR_NACK = 2820;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Hardness/Actuator/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_HARDNESS_ACTUATOR_OFFSET = 2821;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowYaw/Hardness/Actuator/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_HARDNESS_ACTUATOR_SUBDEVICENUMBER = 2822;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Hardness/Actuator/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_HARDNESS_ACTUATOR_TYPE = 2823;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Hardness/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_HARDNESS_ACTUATOR_VALUE = 2824;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Position/Actuator/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_POSITION_ACTUATOR_ACK = 2825;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Position/Actuator/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_POSITION_ACTUATOR_DEVICE = 2826;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Position/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_POSITION_ACTUATOR_ERROR = 2827;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Position/Actuator/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_POSITION_ACTUATOR_GAIN = 2828;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Position/Actuator/IMax as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_POSITION_ACTUATOR_IMAX = 2829;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowYaw/Position/Actuator/InvertControlDirection
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_POSITION_ACTUATOR_INVERTCONTROLDIRECTION = 2830;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Position/Actuator/Kd as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_POSITION_ACTUATOR_KD = 2831;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Position/Actuator/Ki as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_POSITION_ACTUATOR_KI = 2832;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Position/Actuator/Kp as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_POSITION_ACTUATOR_KP = 2833;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Position/Actuator/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_POSITION_ACTUATOR_MAX = 2834;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Position/Actuator/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_POSITION_ACTUATOR_MIN = 2835;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowYaw/Position/Actuator/MotorNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_POSITION_ACTUATOR_MOTORNUMBER = 2836;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Position/Actuator/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_POSITION_ACTUATOR_NACK = 2837;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Position/Actuator/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_POSITION_ACTUATOR_OFFSET = 2838;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowYaw/Position/Actuator/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_POSITION_ACTUATOR_SUBDEVICENUMBER = 2839;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Position/Actuator/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_POSITION_ACTUATOR_TYPE = 2840;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Position/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_POSITION_ACTUATOR_VALUE = 2841;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Position/Sensor/Ack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_POSITION_SENSOR_ACK = 2842;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Position/Sensor/Device as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_POSITION_SENSOR_DEVICE = 2843;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Position/Sensor/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_POSITION_SENSOR_ERROR = 2844;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Position/Sensor/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_POSITION_SENSOR_GAIN = 2845;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Position/Sensor/GearRatio
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_POSITION_SENSOR_GEARRATIO = 2846;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Position/Sensor/Limit as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_POSITION_SENSOR_LIMIT = 2847;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Position/Sensor/Max as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_POSITION_SENSOR_MAX = 2848;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Position/Sensor/Min as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_POSITION_SENSOR_MIN = 2849;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Position/Sensor/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_POSITION_SENSOR_NACK = 2850;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Position/Sensor/Offset as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_POSITION_SENSOR_OFFSET = 2851;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowYaw/Position/Sensor/SensorType as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_POSITION_SENSOR_SENSORTYPE = 2852;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowYaw/Position/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_POSITION_SENSOR_SUBDEVICENUMBER = 2853;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Position/Sensor/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_POSITION_SENSOR_TYPE = 2854;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Position/Sensor/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_POSITION_SENSOR_VALUE = 2855;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowYaw/Position/Sensor/jointZeroPosition as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_POSITION_SENSOR_JOINTZEROPOSITION = 2856;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowYaw/Position/Sensor/positionChainMREJoint as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_POSITION_SENSOR_POSITIONCHAINMREJOINT = 2857;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowYaw/Position/Sensor/positionChainMREMotor as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_POSITION_SENSOR_POSITIONCHAINMREMOTOR = 2858;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Temperature/Sensor/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_TEMPERATURE_SENSOR_ACK = 2859;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowYaw/Temperature/Sensor/AmbientTemperature as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_TEMPERATURE_SENSOR_AMBIENTTEMPERATURE = 2860;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Temperature/Sensor/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_TEMPERATURE_SENSOR_DEVICE = 2861;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Temperature/Sensor/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_TEMPERATURE_SENSOR_ERROR = 2862;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Temperature/Sensor/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_TEMPERATURE_SENSOR_GAIN = 2863;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Temperature/Sensor/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_TEMPERATURE_SENSOR_MAX = 2864;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Temperature/Sensor/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_TEMPERATURE_SENSOR_MIN = 2865;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Temperature/Sensor/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_TEMPERATURE_SENSOR_NACK = 2866;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Temperature/Sensor/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_TEMPERATURE_SENSOR_OFFSET = 2867;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Temperature/Sensor/
	 * OtherMotorTransmission as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_TEMPERATURE_SENSOR_OTHERMOTORTRANSMISSION = 2868;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowYaw/Temperature/Sensor/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_TEMPERATURE_SENSOR_SUBDEVICENUMBER = 2869;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowYaw/Temperature/Sensor/ThermalResistance as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_TEMPERATURE_SENSOR_THERMALRESISTANCE = 2870;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowYaw/Temperature/Sensor/ThermalTimeConstant as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_TEMPERATURE_SENSOR_THERMALTIMECONSTANT = 2871;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Temperature/Sensor/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_TEMPERATURE_SENSOR_TYPE = 2872;

	/**
	 * Id of the sensor Device/SubDeviceList/RElbowYaw/Temperature/Sensor/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_TEMPERATURE_SENSOR_VALUE = 2873;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RElbowYaw/Temperature/Sensor/motorModel as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_TEMPERATURE_SENSOR_MOTORMODEL = 2874;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Bumper/Left/Sensor/Ack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_BUMPER_LEFT_SENSOR_ACK = 2875;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Bumper/Left/Sensor/Device as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_BUMPER_LEFT_SENSOR_DEVICE = 2876;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Bumper/Left/Sensor/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_BUMPER_LEFT_SENSOR_ERROR = 2877;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Bumper/Left/Sensor/Gain as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_BUMPER_LEFT_SENSOR_GAIN = 2878;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Bumper/Left/Sensor/Max as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_BUMPER_LEFT_SENSOR_MAX = 2879;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Bumper/Left/Sensor/Min as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_BUMPER_LEFT_SENSOR_MIN = 2880;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Bumper/Left/Sensor/Nack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_BUMPER_LEFT_SENSOR_NACK = 2881;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Bumper/Left/Sensor/Offset as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_BUMPER_LEFT_SENSOR_OFFSET = 2882;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RFoot/Bumper/Left/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_BUMPER_LEFT_SENSOR_SUBDEVICENUMBER = 2883;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Bumper/Left/Sensor/Type as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_BUMPER_LEFT_SENSOR_TYPE = 2884;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Bumper/Left/Sensor/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_BUMPER_LEFT_SENSOR_VALUE = 2885;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Bumper/Right/Sensor/Ack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_BUMPER_RIGHT_SENSOR_ACK = 2886;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Bumper/Right/Sensor/Device as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_BUMPER_RIGHT_SENSOR_DEVICE = 2887;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Bumper/Right/Sensor/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_BUMPER_RIGHT_SENSOR_ERROR = 2888;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Bumper/Right/Sensor/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_BUMPER_RIGHT_SENSOR_GAIN = 2889;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Bumper/Right/Sensor/Max as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_BUMPER_RIGHT_SENSOR_MAX = 2890;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Bumper/Right/Sensor/Min as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_BUMPER_RIGHT_SENSOR_MIN = 2891;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Bumper/Right/Sensor/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_BUMPER_RIGHT_SENSOR_NACK = 2892;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Bumper/Right/Sensor/Offset as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_BUMPER_RIGHT_SENSOR_OFFSET = 2893;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RFoot/Bumper/Right/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_BUMPER_RIGHT_SENSOR_SUBDEVICENUMBER = 2894;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Bumper/Right/Sensor/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_BUMPER_RIGHT_SENSOR_TYPE = 2895;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Bumper/Right/Sensor/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_BUMPER_RIGHT_SENSOR_VALUE = 2896;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RFoot/FSR/CenterOfPressure/X/Sensor/Ack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_CENTEROFPRESSURE_X_SENSOR_ACK = 2897;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RFoot/FSR/CenterOfPressure/X/Sensor/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_CENTEROFPRESSURE_X_SENSOR_DEVICE = 2898;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RFoot/FSR/CenterOfPressure/X/Sensor/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_CENTEROFPRESSURE_X_SENSOR_ERROR = 2899;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RFoot/FSR/CenterOfPressure/X/Sensor/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_CENTEROFPRESSURE_X_SENSOR_GAIN = 2900;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RFoot/FSR/CenterOfPressure/X/Sensor/Max as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_CENTEROFPRESSURE_X_SENSOR_MAX = 2901;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RFoot/FSR/CenterOfPressure/X/Sensor/Min as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_CENTEROFPRESSURE_X_SENSOR_MIN = 2902;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RFoot/FSR/CenterOfPressure/X/Sensor/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_CENTEROFPRESSURE_X_SENSOR_NACK = 2903;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RFoot/FSR/CenterOfPressure/X/Sensor/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_CENTEROFPRESSURE_X_SENSOR_OFFSET = 2904;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RFoot/FSR/CenterOfPressure/X/Sensor/SubDeviceNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_CENTEROFPRESSURE_X_SENSOR_SUBDEVICENUMBER = 2905;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RFoot/FSR/CenterOfPressure/X/Sensor/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_CENTEROFPRESSURE_X_SENSOR_TYPE = 2906;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RFoot/FSR/CenterOfPressure/X/Sensor/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_CENTEROFPRESSURE_X_SENSOR_VALUE = 2907;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RFoot/FSR/CenterOfPressure/Y/Sensor/Ack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_CENTEROFPRESSURE_Y_SENSOR_ACK = 2908;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RFoot/FSR/CenterOfPressure/Y/Sensor/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_CENTEROFPRESSURE_Y_SENSOR_DEVICE = 2909;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RFoot/FSR/CenterOfPressure/Y/Sensor/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_CENTEROFPRESSURE_Y_SENSOR_ERROR = 2910;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RFoot/FSR/CenterOfPressure/Y/Sensor/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_CENTEROFPRESSURE_Y_SENSOR_GAIN = 2911;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RFoot/FSR/CenterOfPressure/Y/Sensor/Max as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_CENTEROFPRESSURE_Y_SENSOR_MAX = 2912;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RFoot/FSR/CenterOfPressure/Y/Sensor/Min as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_CENTEROFPRESSURE_Y_SENSOR_MIN = 2913;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RFoot/FSR/CenterOfPressure/Y/Sensor/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_CENTEROFPRESSURE_Y_SENSOR_NACK = 2914;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RFoot/FSR/CenterOfPressure/Y/Sensor/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_CENTEROFPRESSURE_Y_SENSOR_OFFSET = 2915;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RFoot/FSR/CenterOfPressure/Y/Sensor/SubDeviceNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_CENTEROFPRESSURE_Y_SENSOR_SUBDEVICENUMBER = 2916;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RFoot/FSR/CenterOfPressure/Y/Sensor/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_CENTEROFPRESSURE_Y_SENSOR_TYPE = 2917;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RFoot/FSR/CenterOfPressure/Y/Sensor/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_CENTEROFPRESSURE_Y_SENSOR_VALUE = 2918;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/FrontLeft/Sensor/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_FRONTLEFT_SENSOR_ACK = 2919;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/FrontLeft/Sensor/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_FRONTLEFT_SENSOR_DEVICE = 2920;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/FrontLeft/Sensor/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_FRONTLEFT_SENSOR_ERROR = 2921;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/FrontLeft/Sensor/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_FRONTLEFT_SENSOR_GAIN = 2922;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/FrontLeft/Sensor/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_FRONTLEFT_SENSOR_MAX = 2923;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/FrontLeft/Sensor/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_FRONTLEFT_SENSOR_MIN = 2924;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/FrontLeft/Sensor/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_FRONTLEFT_SENSOR_NACK = 2925;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/FrontLeft/Sensor/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_FRONTLEFT_SENSOR_OFFSET = 2926;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RFoot/FSR/FrontLeft/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_FRONTLEFT_SENSOR_SUBDEVICENUMBER = 2927;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/FrontLeft/Sensor/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_FRONTLEFT_SENSOR_TYPE = 2928;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/FrontLeft/Sensor/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_FRONTLEFT_SENSOR_VALUE = 2929;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RFoot/FSR/FrontLeft/Sensor/XPosition as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_FRONTLEFT_SENSOR_XPOSITION = 2930;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RFoot/FSR/FrontLeft/Sensor/YPosition as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_FRONTLEFT_SENSOR_YPOSITION = 2931;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/FrontRight/Sensor/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_FRONTRIGHT_SENSOR_ACK = 2932;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/FrontRight/Sensor/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_FRONTRIGHT_SENSOR_DEVICE = 2933;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/FrontRight/Sensor/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_FRONTRIGHT_SENSOR_ERROR = 2934;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/FrontRight/Sensor/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_FRONTRIGHT_SENSOR_GAIN = 2935;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/FrontRight/Sensor/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_FRONTRIGHT_SENSOR_MAX = 2936;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/FrontRight/Sensor/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_FRONTRIGHT_SENSOR_MIN = 2937;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/FrontRight/Sensor/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_FRONTRIGHT_SENSOR_NACK = 2938;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/FrontRight/Sensor/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_FRONTRIGHT_SENSOR_OFFSET = 2939;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RFoot/FSR/FrontRight/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_FRONTRIGHT_SENSOR_SUBDEVICENUMBER = 2940;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/FrontRight/Sensor/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_FRONTRIGHT_SENSOR_TYPE = 2941;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/FrontRight/Sensor/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_FRONTRIGHT_SENSOR_VALUE = 2942;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RFoot/FSR/FrontRight/Sensor/XPosition as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_FRONTRIGHT_SENSOR_XPOSITION = 2943;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RFoot/FSR/FrontRight/Sensor/YPosition as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_FRONTRIGHT_SENSOR_YPOSITION = 2944;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/RearLeft/Sensor/Ack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_REARLEFT_SENSOR_ACK = 2945;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/RearLeft/Sensor/Device as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_REARLEFT_SENSOR_DEVICE = 2946;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/RearLeft/Sensor/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_REARLEFT_SENSOR_ERROR = 2947;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/RearLeft/Sensor/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_REARLEFT_SENSOR_GAIN = 2948;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/RearLeft/Sensor/Max as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_REARLEFT_SENSOR_MAX = 2949;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/RearLeft/Sensor/Min as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_REARLEFT_SENSOR_MIN = 2950;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/RearLeft/Sensor/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_REARLEFT_SENSOR_NACK = 2951;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/RearLeft/Sensor/Offset as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_REARLEFT_SENSOR_OFFSET = 2952;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RFoot/FSR/RearLeft/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_REARLEFT_SENSOR_SUBDEVICENUMBER = 2953;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/RearLeft/Sensor/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_REARLEFT_SENSOR_TYPE = 2954;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/RearLeft/Sensor/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_REARLEFT_SENSOR_VALUE = 2955;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/RearLeft/Sensor/XPosition
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_REARLEFT_SENSOR_XPOSITION = 2956;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/RearLeft/Sensor/YPosition
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_REARLEFT_SENSOR_YPOSITION = 2957;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/RearRight/Sensor/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_REARRIGHT_SENSOR_ACK = 2958;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/RearRight/Sensor/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_REARRIGHT_SENSOR_DEVICE = 2959;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/RearRight/Sensor/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_REARRIGHT_SENSOR_ERROR = 2960;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/RearRight/Sensor/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_REARRIGHT_SENSOR_GAIN = 2961;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/RearRight/Sensor/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_REARRIGHT_SENSOR_MAX = 2962;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/RearRight/Sensor/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_REARRIGHT_SENSOR_MIN = 2963;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/RearRight/Sensor/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_REARRIGHT_SENSOR_NACK = 2964;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/RearRight/Sensor/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_REARRIGHT_SENSOR_OFFSET = 2965;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RFoot/FSR/RearRight/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_REARRIGHT_SENSOR_SUBDEVICENUMBER = 2966;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/RearRight/Sensor/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_REARRIGHT_SENSOR_TYPE = 2967;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/RearRight/Sensor/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_REARRIGHT_SENSOR_VALUE = 2968;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RFoot/FSR/RearRight/Sensor/XPosition as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_REARRIGHT_SENSOR_XPOSITION = 2969;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RFoot/FSR/RearRight/Sensor/YPosition as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_REARRIGHT_SENSOR_YPOSITION = 2970;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/TotalWeight/Sensor/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_TOTALWEIGHT_SENSOR_ACK = 2971;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/TotalWeight/Sensor/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_TOTALWEIGHT_SENSOR_DEVICE = 2972;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/TotalWeight/Sensor/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_TOTALWEIGHT_SENSOR_ERROR = 2973;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/TotalWeight/Sensor/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_TOTALWEIGHT_SENSOR_GAIN = 2974;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/TotalWeight/Sensor/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_TOTALWEIGHT_SENSOR_MAX = 2975;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/TotalWeight/Sensor/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_TOTALWEIGHT_SENSOR_MIN = 2976;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/TotalWeight/Sensor/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_TOTALWEIGHT_SENSOR_NACK = 2977;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/TotalWeight/Sensor/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_TOTALWEIGHT_SENSOR_OFFSET = 2978;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RFoot/FSR/TotalWeight/Sensor/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_TOTALWEIGHT_SENSOR_SUBDEVICENUMBER = 2979;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/TotalWeight/Sensor/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_TOTALWEIGHT_SENSOR_TYPE = 2980;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/FSR/TotalWeight/Sensor/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_FSR_TOTALWEIGHT_SENSOR_VALUE = 2981;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Led/Blue/Actuator/Ack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_LED_BLUE_ACTUATOR_ACK = 2982;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Led/Blue/Actuator/Device as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_LED_BLUE_ACTUATOR_DEVICE = 2983;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Led/Blue/Actuator/Error as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_LED_BLUE_ACTUATOR_ERROR = 2984;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Led/Blue/Actuator/Gain as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_LED_BLUE_ACTUATOR_GAIN = 2985;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Led/Blue/Actuator/Max as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_LED_BLUE_ACTUATOR_MAX = 2986;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Led/Blue/Actuator/Min as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_LED_BLUE_ACTUATOR_MIN = 2987;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Led/Blue/Actuator/Nack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_LED_BLUE_ACTUATOR_NACK = 2988;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Led/Blue/Actuator/Offset as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_LED_BLUE_ACTUATOR_OFFSET = 2989;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RFoot/Led/Blue/Actuator/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_LED_BLUE_ACTUATOR_SUBDEVICENUMBER = 2990;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Led/Blue/Actuator/Type as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_LED_BLUE_ACTUATOR_TYPE = 2991;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Led/Blue/Actuator/Value as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_LED_BLUE_ACTUATOR_VALUE = 2992;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Led/Green/Actuator/Ack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_LED_GREEN_ACTUATOR_ACK = 2993;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Led/Green/Actuator/Device as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_LED_GREEN_ACTUATOR_DEVICE = 2994;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Led/Green/Actuator/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_LED_GREEN_ACTUATOR_ERROR = 2995;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Led/Green/Actuator/Gain as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_LED_GREEN_ACTUATOR_GAIN = 2996;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Led/Green/Actuator/Max as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_LED_GREEN_ACTUATOR_MAX = 2997;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Led/Green/Actuator/Min as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_LED_GREEN_ACTUATOR_MIN = 2998;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Led/Green/Actuator/Nack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_LED_GREEN_ACTUATOR_NACK = 2999;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Led/Green/Actuator/Offset as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_LED_GREEN_ACTUATOR_OFFSET = 3000;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RFoot/Led/Green/Actuator/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_LED_GREEN_ACTUATOR_SUBDEVICENUMBER = 3001;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Led/Green/Actuator/Type as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_LED_GREEN_ACTUATOR_TYPE = 3002;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Led/Green/Actuator/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_LED_GREEN_ACTUATOR_VALUE = 3003;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Led/Red/Actuator/Ack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_LED_RED_ACTUATOR_ACK = 3004;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Led/Red/Actuator/Device as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_LED_RED_ACTUATOR_DEVICE = 3005;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Led/Red/Actuator/Error as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_LED_RED_ACTUATOR_ERROR = 3006;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Led/Red/Actuator/Gain as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_LED_RED_ACTUATOR_GAIN = 3007;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Led/Red/Actuator/Max as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_LED_RED_ACTUATOR_MAX = 3008;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Led/Red/Actuator/Min as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_LED_RED_ACTUATOR_MIN = 3009;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Led/Red/Actuator/Nack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_LED_RED_ACTUATOR_NACK = 3010;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Led/Red/Actuator/Offset as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_LED_RED_ACTUATOR_OFFSET = 3011;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RFoot/Led/Red/Actuator/SubDeviceNumber as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_LED_RED_ACTUATOR_SUBDEVICENUMBER = 3012;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Led/Red/Actuator/Type as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_LED_RED_ACTUATOR_TYPE = 3013;

	/**
	 * Id of the sensor Device/SubDeviceList/RFoot/Led/Red/Actuator/Value as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RFOOT_LED_RED_ACTUATOR_VALUE = 3014;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/ElectricCurrent/Sensor/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_ELECTRICCURRENT_SENSOR_ACK = 3015;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/ElectricCurrent/Sensor/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_ELECTRICCURRENT_SENSOR_DEVICE = 3016;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/ElectricCurrent/Sensor/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_ELECTRICCURRENT_SENSOR_ERROR = 3017;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/ElectricCurrent/Sensor/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_ELECTRICCURRENT_SENSOR_GAIN = 3018;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/ElectricCurrent/Sensor/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_ELECTRICCURRENT_SENSOR_MAX = 3019;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/ElectricCurrent/Sensor/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_ELECTRICCURRENT_SENSOR_MIN = 3020;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/ElectricCurrent/Sensor/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_ELECTRICCURRENT_SENSOR_NACK = 3021;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/ElectricCurrent/Sensor/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_ELECTRICCURRENT_SENSOR_OFFSET = 3022;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHand/ElectricCurrent/Sensor/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_ELECTRICCURRENT_SENSOR_SUBDEVICENUMBER = 3023;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/ElectricCurrent/Sensor/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_ELECTRICCURRENT_SENSOR_TYPE = 3024;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/ElectricCurrent/Sensor/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_ELECTRICCURRENT_SENSOR_VALUE = 3025;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Hardness/Actuator/Ack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_HARDNESS_ACTUATOR_ACK = 3026;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Hardness/Actuator/Device as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_HARDNESS_ACTUATOR_DEVICE = 3027;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Hardness/Actuator/Error as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_HARDNESS_ACTUATOR_ERROR = 3028;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Hardness/Actuator/Gain as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_HARDNESS_ACTUATOR_GAIN = 3029;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Hardness/Actuator/Max as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_HARDNESS_ACTUATOR_MAX = 3030;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Hardness/Actuator/Min as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_HARDNESS_ACTUATOR_MIN = 3031;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Hardness/Actuator/Nack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_HARDNESS_ACTUATOR_NACK = 3032;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Hardness/Actuator/Offset as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_HARDNESS_ACTUATOR_OFFSET = 3033;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHand/Hardness/Actuator/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_HARDNESS_ACTUATOR_SUBDEVICENUMBER = 3034;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Hardness/Actuator/Type as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_HARDNESS_ACTUATOR_TYPE = 3035;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Hardness/Actuator/Value as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_HARDNESS_ACTUATOR_VALUE = 3036;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Position/Actuator/Ack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_POSITION_ACTUATOR_ACK = 3037;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Position/Actuator/Device as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_POSITION_ACTUATOR_DEVICE = 3038;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Position/Actuator/Error as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_POSITION_ACTUATOR_ERROR = 3039;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Position/Actuator/Gain as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_POSITION_ACTUATOR_GAIN = 3040;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Position/Actuator/IMax as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_POSITION_ACTUATOR_IMAX = 3041;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHand/Position/Actuator/InvertControlDirection as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_POSITION_ACTUATOR_INVERTCONTROLDIRECTION = 3042;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Position/Actuator/Kd as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_POSITION_ACTUATOR_KD = 3043;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Position/Actuator/Ki as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_POSITION_ACTUATOR_KI = 3044;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Position/Actuator/Kp as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_POSITION_ACTUATOR_KP = 3045;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Position/Actuator/Max as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_POSITION_ACTUATOR_MAX = 3046;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Position/Actuator/Min as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_POSITION_ACTUATOR_MIN = 3047;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Position/Actuator/MotorNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_POSITION_ACTUATOR_MOTORNUMBER = 3048;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Position/Actuator/Nack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_POSITION_ACTUATOR_NACK = 3049;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Position/Actuator/Offset as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_POSITION_ACTUATOR_OFFSET = 3050;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHand/Position/Actuator/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_POSITION_ACTUATOR_SUBDEVICENUMBER = 3051;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Position/Actuator/Type as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_POSITION_ACTUATOR_TYPE = 3052;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Position/Actuator/Value as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_POSITION_ACTUATOR_VALUE = 3053;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Position/Sensor/Ack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_POSITION_SENSOR_ACK = 3054;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Position/Sensor/Device as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_POSITION_SENSOR_DEVICE = 3055;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Position/Sensor/Error as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_POSITION_SENSOR_ERROR = 3056;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Position/Sensor/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_POSITION_SENSOR_GAIN = 3057;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Position/Sensor/GearRatio as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_POSITION_SENSOR_GEARRATIO = 3058;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Position/Sensor/Limit as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_POSITION_SENSOR_LIMIT = 3059;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Position/Sensor/Max as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_POSITION_SENSOR_MAX = 3060;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Position/Sensor/Min as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_POSITION_SENSOR_MIN = 3061;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Position/Sensor/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_POSITION_SENSOR_NACK = 3062;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Position/Sensor/Offset as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_POSITION_SENSOR_OFFSET = 3063;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Position/Sensor/SensorType as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_POSITION_SENSOR_SENSORTYPE = 3064;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHand/Position/Sensor/SubDeviceNumber as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_POSITION_SENSOR_SUBDEVICENUMBER = 3065;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Position/Sensor/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_POSITION_SENSOR_TYPE = 3066;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Position/Sensor/Value as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_POSITION_SENSOR_VALUE = 3067;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHand/Position/Sensor/jointZeroPosition as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_POSITION_SENSOR_JOINTZEROPOSITION = 3068;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHand/Position/Sensor/positionChainMREJoint as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_POSITION_SENSOR_POSITIONCHAINMREJOINT = 3069;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHand/Position/Sensor/positionChainMREMotor as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_POSITION_SENSOR_POSITIONCHAINMREMOTOR = 3070;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Temperature/Sensor/Ack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TEMPERATURE_SENSOR_ACK = 3071;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHand/Temperature/Sensor/AmbientTemperature as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TEMPERATURE_SENSOR_AMBIENTTEMPERATURE = 3072;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Temperature/Sensor/Device as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TEMPERATURE_SENSOR_DEVICE = 3073;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Temperature/Sensor/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TEMPERATURE_SENSOR_ERROR = 3074;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Temperature/Sensor/Gain as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TEMPERATURE_SENSOR_GAIN = 3075;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Temperature/Sensor/Max as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TEMPERATURE_SENSOR_MAX = 3076;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Temperature/Sensor/Min as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TEMPERATURE_SENSOR_MIN = 3077;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Temperature/Sensor/Nack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TEMPERATURE_SENSOR_NACK = 3078;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Temperature/Sensor/Offset as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TEMPERATURE_SENSOR_OFFSET = 3079;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHand/Temperature/Sensor/OtherMotorTransmission as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TEMPERATURE_SENSOR_OTHERMOTORTRANSMISSION = 3080;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHand/Temperature/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TEMPERATURE_SENSOR_SUBDEVICENUMBER = 3081;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHand/Temperature/Sensor/ThermalResistance as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TEMPERATURE_SENSOR_THERMALRESISTANCE = 3082;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHand/Temperature/Sensor/ThermalTimeConstant as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TEMPERATURE_SENSOR_THERMALTIMECONSTANT = 3083;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Temperature/Sensor/Type as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TEMPERATURE_SENSOR_TYPE = 3084;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Temperature/Sensor/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TEMPERATURE_SENSOR_VALUE = 3085;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Temperature/Sensor/motorModel
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TEMPERATURE_SENSOR_MOTORMODEL = 3086;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Touch/Back/Sensor/Ack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TOUCH_BACK_SENSOR_ACK = 3087;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Touch/Back/Sensor/Device as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TOUCH_BACK_SENSOR_DEVICE = 3088;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Touch/Back/Sensor/Error as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TOUCH_BACK_SENSOR_ERROR = 3089;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Touch/Back/Sensor/Gain as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TOUCH_BACK_SENSOR_GAIN = 3090;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Touch/Back/Sensor/Max as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TOUCH_BACK_SENSOR_MAX = 3091;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Touch/Back/Sensor/Min as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TOUCH_BACK_SENSOR_MIN = 3092;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Touch/Back/Sensor/Nack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TOUCH_BACK_SENSOR_NACK = 3093;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Touch/Back/Sensor/Offset as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TOUCH_BACK_SENSOR_OFFSET = 3094;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHand/Touch/Back/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TOUCH_BACK_SENSOR_SUBDEVICENUMBER = 3095;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Touch/Back/Sensor/Type as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TOUCH_BACK_SENSOR_TYPE = 3096;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Touch/Back/Sensor/Value as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TOUCH_BACK_SENSOR_VALUE = 3097;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Touch/Left/Sensor/Ack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TOUCH_LEFT_SENSOR_ACK = 3098;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Touch/Left/Sensor/Device as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TOUCH_LEFT_SENSOR_DEVICE = 3099;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Touch/Left/Sensor/Error as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TOUCH_LEFT_SENSOR_ERROR = 3100;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Touch/Left/Sensor/Gain as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TOUCH_LEFT_SENSOR_GAIN = 3101;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Touch/Left/Sensor/Max as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TOUCH_LEFT_SENSOR_MAX = 3102;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Touch/Left/Sensor/Min as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TOUCH_LEFT_SENSOR_MIN = 3103;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Touch/Left/Sensor/Nack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TOUCH_LEFT_SENSOR_NACK = 3104;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Touch/Left/Sensor/Offset as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TOUCH_LEFT_SENSOR_OFFSET = 3105;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHand/Touch/Left/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TOUCH_LEFT_SENSOR_SUBDEVICENUMBER = 3106;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Touch/Left/Sensor/Type as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TOUCH_LEFT_SENSOR_TYPE = 3107;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Touch/Left/Sensor/Value as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TOUCH_LEFT_SENSOR_VALUE = 3108;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Touch/Right/Sensor/Ack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TOUCH_RIGHT_SENSOR_ACK = 3109;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Touch/Right/Sensor/Device as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TOUCH_RIGHT_SENSOR_DEVICE = 3110;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Touch/Right/Sensor/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TOUCH_RIGHT_SENSOR_ERROR = 3111;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Touch/Right/Sensor/Gain as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TOUCH_RIGHT_SENSOR_GAIN = 3112;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Touch/Right/Sensor/Max as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TOUCH_RIGHT_SENSOR_MAX = 3113;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Touch/Right/Sensor/Min as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TOUCH_RIGHT_SENSOR_MIN = 3114;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Touch/Right/Sensor/Nack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TOUCH_RIGHT_SENSOR_NACK = 3115;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Touch/Right/Sensor/Offset as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TOUCH_RIGHT_SENSOR_OFFSET = 3116;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHand/Touch/Right/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TOUCH_RIGHT_SENSOR_SUBDEVICENUMBER = 3117;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Touch/Right/Sensor/Type as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TOUCH_RIGHT_SENSOR_TYPE = 3118;

	/**
	 * Id of the sensor Device/SubDeviceList/RHand/Touch/Right/Sensor/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHAND_TOUCH_RIGHT_SENSOR_VALUE = 3119;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipPitch/ElectricCurrent/Sensor/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_ELECTRICCURRENT_SENSOR_ACK = 3120;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipPitch/ElectricCurrent/Sensor/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_ELECTRICCURRENT_SENSOR_DEVICE = 3121;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipPitch/ElectricCurrent/Sensor/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_ELECTRICCURRENT_SENSOR_ERROR = 3122;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipPitch/ElectricCurrent/Sensor/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_ELECTRICCURRENT_SENSOR_GAIN = 3123;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipPitch/ElectricCurrent/Sensor/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_ELECTRICCURRENT_SENSOR_MAX = 3124;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipPitch/ElectricCurrent/Sensor/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_ELECTRICCURRENT_SENSOR_MIN = 3125;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipPitch/ElectricCurrent/Sensor/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_ELECTRICCURRENT_SENSOR_NACK = 3126;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipPitch/ElectricCurrent/Sensor/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_ELECTRICCURRENT_SENSOR_OFFSET = 3127;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipPitch/ElectricCurrent/Sensor/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_ELECTRICCURRENT_SENSOR_SUBDEVICENUMBER = 3128;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipPitch/ElectricCurrent/Sensor/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_ELECTRICCURRENT_SENSOR_TYPE = 3129;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipPitch/ElectricCurrent/Sensor/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_ELECTRICCURRENT_SENSOR_VALUE = 3130;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Hardness/Actuator/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_HARDNESS_ACTUATOR_ACK = 3131;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Hardness/Actuator/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_HARDNESS_ACTUATOR_DEVICE = 3132;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Hardness/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_HARDNESS_ACTUATOR_ERROR = 3133;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Hardness/Actuator/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_HARDNESS_ACTUATOR_GAIN = 3134;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Hardness/Actuator/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_HARDNESS_ACTUATOR_MAX = 3135;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Hardness/Actuator/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_HARDNESS_ACTUATOR_MIN = 3136;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Hardness/Actuator/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_HARDNESS_ACTUATOR_NACK = 3137;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Hardness/Actuator/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_HARDNESS_ACTUATOR_OFFSET = 3138;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipPitch/Hardness/Actuator/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_HARDNESS_ACTUATOR_SUBDEVICENUMBER = 3139;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Hardness/Actuator/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_HARDNESS_ACTUATOR_TYPE = 3140;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Hardness/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_HARDNESS_ACTUATOR_VALUE = 3141;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Position/Actuator/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_POSITION_ACTUATOR_ACK = 3142;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Position/Actuator/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_POSITION_ACTUATOR_DEVICE = 3143;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Position/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_POSITION_ACTUATOR_ERROR = 3144;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Position/Actuator/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_POSITION_ACTUATOR_GAIN = 3145;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Position/Actuator/IMax as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_POSITION_ACTUATOR_IMAX = 3146;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipPitch/Position/Actuator/InvertControlDirection
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_POSITION_ACTUATOR_INVERTCONTROLDIRECTION = 3147;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Position/Actuator/Kd as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_POSITION_ACTUATOR_KD = 3148;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Position/Actuator/Ki as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_POSITION_ACTUATOR_KI = 3149;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Position/Actuator/Kp as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_POSITION_ACTUATOR_KP = 3150;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Position/Actuator/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_POSITION_ACTUATOR_MAX = 3151;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Position/Actuator/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_POSITION_ACTUATOR_MIN = 3152;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipPitch/Position/Actuator/MotorNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_POSITION_ACTUATOR_MOTORNUMBER = 3153;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Position/Actuator/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_POSITION_ACTUATOR_NACK = 3154;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Position/Actuator/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_POSITION_ACTUATOR_OFFSET = 3155;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipPitch/Position/Actuator/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_POSITION_ACTUATOR_SUBDEVICENUMBER = 3156;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Position/Actuator/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_POSITION_ACTUATOR_TYPE = 3157;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Position/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_POSITION_ACTUATOR_VALUE = 3158;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Position/Sensor/Ack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_POSITION_SENSOR_ACK = 3159;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Position/Sensor/Device as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_POSITION_SENSOR_DEVICE = 3160;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Position/Sensor/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_POSITION_SENSOR_ERROR = 3161;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Position/Sensor/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_POSITION_SENSOR_GAIN = 3162;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Position/Sensor/GearRatio
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_POSITION_SENSOR_GEARRATIO = 3163;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Position/Sensor/Limit as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_POSITION_SENSOR_LIMIT = 3164;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Position/Sensor/Max as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_POSITION_SENSOR_MAX = 3165;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Position/Sensor/Min as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_POSITION_SENSOR_MIN = 3166;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Position/Sensor/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_POSITION_SENSOR_NACK = 3167;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Position/Sensor/Offset as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_POSITION_SENSOR_OFFSET = 3168;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipPitch/Position/Sensor/SensorType as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_POSITION_SENSOR_SENSORTYPE = 3169;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipPitch/Position/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_POSITION_SENSOR_SUBDEVICENUMBER = 3170;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Position/Sensor/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_POSITION_SENSOR_TYPE = 3171;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Position/Sensor/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_POSITION_SENSOR_VALUE = 3172;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipPitch/Position/Sensor/jointZeroPosition as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_POSITION_SENSOR_JOINTZEROPOSITION = 3173;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipPitch/Position/Sensor/positionChainMREJoint as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_POSITION_SENSOR_POSITIONCHAINMREJOINT = 3174;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipPitch/Position/Sensor/positionChainMREMotor as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_POSITION_SENSOR_POSITIONCHAINMREMOTOR = 3175;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Temperature/Sensor/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_TEMPERATURE_SENSOR_ACK = 3176;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipPitch/Temperature/Sensor/AmbientTemperature as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_TEMPERATURE_SENSOR_AMBIENTTEMPERATURE = 3177;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Temperature/Sensor/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_TEMPERATURE_SENSOR_DEVICE = 3178;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Temperature/Sensor/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_TEMPERATURE_SENSOR_ERROR = 3179;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Temperature/Sensor/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_TEMPERATURE_SENSOR_GAIN = 3180;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Temperature/Sensor/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_TEMPERATURE_SENSOR_MAX = 3181;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Temperature/Sensor/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_TEMPERATURE_SENSOR_MIN = 3182;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Temperature/Sensor/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_TEMPERATURE_SENSOR_NACK = 3183;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Temperature/Sensor/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_TEMPERATURE_SENSOR_OFFSET = 3184;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Temperature/Sensor/
	 * OtherMotorTransmission as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_TEMPERATURE_SENSOR_OTHERMOTORTRANSMISSION = 3185;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipPitch/Temperature/Sensor/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_TEMPERATURE_SENSOR_SUBDEVICENUMBER = 3186;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipPitch/Temperature/Sensor/ThermalResistance as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_TEMPERATURE_SENSOR_THERMALRESISTANCE = 3187;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipPitch/Temperature/Sensor/ThermalTimeConstant as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_TEMPERATURE_SENSOR_THERMALTIMECONSTANT = 3188;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Temperature/Sensor/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_TEMPERATURE_SENSOR_TYPE = 3189;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipPitch/Temperature/Sensor/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_TEMPERATURE_SENSOR_VALUE = 3190;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipPitch/Temperature/Sensor/motorModel as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_TEMPERATURE_SENSOR_MOTORMODEL = 3191;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/ElectricCurrent/Sensor/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_ELECTRICCURRENT_SENSOR_ACK = 3192;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipRoll/ElectricCurrent/Sensor/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_ELECTRICCURRENT_SENSOR_DEVICE = 3193;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipRoll/ElectricCurrent/Sensor/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_ELECTRICCURRENT_SENSOR_ERROR = 3194;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipRoll/ElectricCurrent/Sensor/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_ELECTRICCURRENT_SENSOR_GAIN = 3195;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/ElectricCurrent/Sensor/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_ELECTRICCURRENT_SENSOR_MAX = 3196;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/ElectricCurrent/Sensor/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_ELECTRICCURRENT_SENSOR_MIN = 3197;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipRoll/ElectricCurrent/Sensor/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_ELECTRICCURRENT_SENSOR_NACK = 3198;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipRoll/ElectricCurrent/Sensor/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_ELECTRICCURRENT_SENSOR_OFFSET = 3199;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipRoll/ElectricCurrent/Sensor/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_ELECTRICCURRENT_SENSOR_SUBDEVICENUMBER = 3200;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipRoll/ElectricCurrent/Sensor/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_ELECTRICCURRENT_SENSOR_TYPE = 3201;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipRoll/ElectricCurrent/Sensor/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_ELECTRICCURRENT_SENSOR_VALUE = 3202;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Hardness/Actuator/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_HARDNESS_ACTUATOR_ACK = 3203;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Hardness/Actuator/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_HARDNESS_ACTUATOR_DEVICE = 3204;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Hardness/Actuator/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_HARDNESS_ACTUATOR_ERROR = 3205;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Hardness/Actuator/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_HARDNESS_ACTUATOR_GAIN = 3206;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Hardness/Actuator/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_HARDNESS_ACTUATOR_MAX = 3207;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Hardness/Actuator/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_HARDNESS_ACTUATOR_MIN = 3208;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Hardness/Actuator/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_HARDNESS_ACTUATOR_NACK = 3209;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Hardness/Actuator/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_HARDNESS_ACTUATOR_OFFSET = 3210;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipRoll/Hardness/Actuator/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_HARDNESS_ACTUATOR_SUBDEVICENUMBER = 3211;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Hardness/Actuator/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_HARDNESS_ACTUATOR_TYPE = 3212;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Hardness/Actuator/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_HARDNESS_ACTUATOR_VALUE = 3213;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Position/Actuator/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_POSITION_ACTUATOR_ACK = 3214;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Position/Actuator/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_POSITION_ACTUATOR_DEVICE = 3215;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Position/Actuator/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_POSITION_ACTUATOR_ERROR = 3216;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Position/Actuator/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_POSITION_ACTUATOR_GAIN = 3217;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Position/Actuator/IMax as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_POSITION_ACTUATOR_IMAX = 3218;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipRoll/Position/Actuator/InvertControlDirection as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_POSITION_ACTUATOR_INVERTCONTROLDIRECTION = 3219;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Position/Actuator/Kd as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_POSITION_ACTUATOR_KD = 3220;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Position/Actuator/Ki as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_POSITION_ACTUATOR_KI = 3221;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Position/Actuator/Kp as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_POSITION_ACTUATOR_KP = 3222;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Position/Actuator/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_POSITION_ACTUATOR_MAX = 3223;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Position/Actuator/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_POSITION_ACTUATOR_MIN = 3224;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipRoll/Position/Actuator/MotorNumber as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_POSITION_ACTUATOR_MOTORNUMBER = 3225;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Position/Actuator/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_POSITION_ACTUATOR_NACK = 3226;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Position/Actuator/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_POSITION_ACTUATOR_OFFSET = 3227;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipRoll/Position/Actuator/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_POSITION_ACTUATOR_SUBDEVICENUMBER = 3228;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Position/Actuator/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_POSITION_ACTUATOR_TYPE = 3229;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Position/Actuator/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_POSITION_ACTUATOR_VALUE = 3230;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Position/Sensor/Ack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_POSITION_SENSOR_ACK = 3231;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Position/Sensor/Device as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_POSITION_SENSOR_DEVICE = 3232;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Position/Sensor/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_POSITION_SENSOR_ERROR = 3233;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Position/Sensor/Gain as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_POSITION_SENSOR_GAIN = 3234;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Position/Sensor/GearRatio
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_POSITION_SENSOR_GEARRATIO = 3235;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Position/Sensor/Limit as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_POSITION_SENSOR_LIMIT = 3236;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Position/Sensor/Max as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_POSITION_SENSOR_MAX = 3237;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Position/Sensor/Min as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_POSITION_SENSOR_MIN = 3238;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Position/Sensor/Nack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_POSITION_SENSOR_NACK = 3239;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Position/Sensor/Offset as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_POSITION_SENSOR_OFFSET = 3240;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Position/Sensor/SensorType
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_POSITION_SENSOR_SENSORTYPE = 3241;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipRoll/Position/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_POSITION_SENSOR_SUBDEVICENUMBER = 3242;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Position/Sensor/Type as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_POSITION_SENSOR_TYPE = 3243;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Position/Sensor/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_POSITION_SENSOR_VALUE = 3244;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipRoll/Position/Sensor/jointZeroPosition as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_POSITION_SENSOR_JOINTZEROPOSITION = 3245;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipRoll/Position/Sensor/positionChainMREJoint as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_POSITION_SENSOR_POSITIONCHAINMREJOINT = 3246;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipRoll/Position/Sensor/positionChainMREMotor as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_POSITION_SENSOR_POSITIONCHAINMREMOTOR = 3247;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Temperature/Sensor/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_TEMPERATURE_SENSOR_ACK = 3248;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipRoll/Temperature/Sensor/AmbientTemperature as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_TEMPERATURE_SENSOR_AMBIENTTEMPERATURE = 3249;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Temperature/Sensor/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_TEMPERATURE_SENSOR_DEVICE = 3250;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Temperature/Sensor/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_TEMPERATURE_SENSOR_ERROR = 3251;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Temperature/Sensor/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_TEMPERATURE_SENSOR_GAIN = 3252;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Temperature/Sensor/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_TEMPERATURE_SENSOR_MAX = 3253;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Temperature/Sensor/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_TEMPERATURE_SENSOR_MIN = 3254;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Temperature/Sensor/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_TEMPERATURE_SENSOR_NACK = 3255;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Temperature/Sensor/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_TEMPERATURE_SENSOR_OFFSET = 3256;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipRoll/Temperature/Sensor/OtherMotorTransmission
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_TEMPERATURE_SENSOR_OTHERMOTORTRANSMISSION = 3257;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipRoll/Temperature/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_TEMPERATURE_SENSOR_SUBDEVICENUMBER = 3258;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipRoll/Temperature/Sensor/ThermalResistance as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_TEMPERATURE_SENSOR_THERMALRESISTANCE = 3259;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipRoll/Temperature/Sensor/ThermalTimeConstant as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_TEMPERATURE_SENSOR_THERMALTIMECONSTANT = 3260;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Temperature/Sensor/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_TEMPERATURE_SENSOR_TYPE = 3261;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipRoll/Temperature/Sensor/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_TEMPERATURE_SENSOR_VALUE = 3262;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipRoll/Temperature/Sensor/motorModel as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_TEMPERATURE_SENSOR_MOTORMODEL = 3263;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipYawPitch/ElectricCurrent/Sensor/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPYAWPITCH_ELECTRICCURRENT_SENSOR_VALUE = 3264;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipYawPitch/Hardness/Actuator/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPYAWPITCH_HARDNESS_ACTUATOR_MAX = 3265;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipYawPitch/Hardness/Actuator/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPYAWPITCH_HARDNESS_ACTUATOR_VALUE = 3266;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RHipYawPitch/Position/Actuator/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPYAWPITCH_POSITION_ACTUATOR_VALUE = 3267;

	/**
	 * Id of the sensor Device/SubDeviceList/RHipYawPitch/Position/Sensor/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPYAWPITCH_POSITION_SENSOR_VALUE = 3268;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RKneePitch/ElectricCurrent/Sensor/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_ELECTRICCURRENT_SENSOR_ACK = 3269;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RKneePitch/ElectricCurrent/Sensor/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_ELECTRICCURRENT_SENSOR_DEVICE = 3270;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RKneePitch/ElectricCurrent/Sensor/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_ELECTRICCURRENT_SENSOR_ERROR = 3271;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RKneePitch/ElectricCurrent/Sensor/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_ELECTRICCURRENT_SENSOR_GAIN = 3272;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RKneePitch/ElectricCurrent/Sensor/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_ELECTRICCURRENT_SENSOR_MAX = 3273;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RKneePitch/ElectricCurrent/Sensor/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_ELECTRICCURRENT_SENSOR_MIN = 3274;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RKneePitch/ElectricCurrent/Sensor/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_ELECTRICCURRENT_SENSOR_NACK = 3275;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RKneePitch/ElectricCurrent/Sensor/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_ELECTRICCURRENT_SENSOR_OFFSET = 3276;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RKneePitch/ElectricCurrent/Sensor/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_ELECTRICCURRENT_SENSOR_SUBDEVICENUMBER = 3277;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RKneePitch/ElectricCurrent/Sensor/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_ELECTRICCURRENT_SENSOR_TYPE = 3278;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RKneePitch/ElectricCurrent/Sensor/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_ELECTRICCURRENT_SENSOR_VALUE = 3279;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Hardness/Actuator/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_HARDNESS_ACTUATOR_ACK = 3280;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Hardness/Actuator/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_HARDNESS_ACTUATOR_DEVICE = 3281;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Hardness/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_HARDNESS_ACTUATOR_ERROR = 3282;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Hardness/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_HARDNESS_ACTUATOR_GAIN = 3283;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Hardness/Actuator/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_HARDNESS_ACTUATOR_MAX = 3284;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Hardness/Actuator/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_HARDNESS_ACTUATOR_MIN = 3285;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Hardness/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_HARDNESS_ACTUATOR_NACK = 3286;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Hardness/Actuator/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_HARDNESS_ACTUATOR_OFFSET = 3287;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RKneePitch/Hardness/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_HARDNESS_ACTUATOR_SUBDEVICENUMBER = 3288;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Hardness/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_HARDNESS_ACTUATOR_TYPE = 3289;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Hardness/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_HARDNESS_ACTUATOR_VALUE = 3290;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Position/Actuator/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_POSITION_ACTUATOR_ACK = 3291;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Position/Actuator/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_POSITION_ACTUATOR_DEVICE = 3292;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Position/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_POSITION_ACTUATOR_ERROR = 3293;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Position/Actuator/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_POSITION_ACTUATOR_GAIN = 3294;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Position/Actuator/IMax
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_POSITION_ACTUATOR_IMAX = 3295;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Position/Actuator/
	 * InvertControlDirection as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_POSITION_ACTUATOR_INVERTCONTROLDIRECTION = 3296;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Position/Actuator/Kd as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_POSITION_ACTUATOR_KD = 3297;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Position/Actuator/Ki as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_POSITION_ACTUATOR_KI = 3298;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Position/Actuator/Kp as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_POSITION_ACTUATOR_KP = 3299;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Position/Actuator/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_POSITION_ACTUATOR_MAX = 3300;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Position/Actuator/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_POSITION_ACTUATOR_MIN = 3301;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RKneePitch/Position/Actuator/MotorNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_POSITION_ACTUATOR_MOTORNUMBER = 3302;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Position/Actuator/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_POSITION_ACTUATOR_NACK = 3303;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Position/Actuator/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_POSITION_ACTUATOR_OFFSET = 3304;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RKneePitch/Position/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_POSITION_ACTUATOR_SUBDEVICENUMBER = 3305;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Position/Actuator/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_POSITION_ACTUATOR_TYPE = 3306;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Position/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_POSITION_ACTUATOR_VALUE = 3307;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Position/Sensor/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_POSITION_SENSOR_ACK = 3308;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Position/Sensor/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_POSITION_SENSOR_DEVICE = 3309;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Position/Sensor/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_POSITION_SENSOR_ERROR = 3310;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Position/Sensor/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_POSITION_SENSOR_GAIN = 3311;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RKneePitch/Position/Sensor/GearRatio as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_POSITION_SENSOR_GEARRATIO = 3312;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Position/Sensor/Limit as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_POSITION_SENSOR_LIMIT = 3313;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Position/Sensor/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_POSITION_SENSOR_MAX = 3314;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Position/Sensor/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_POSITION_SENSOR_MIN = 3315;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Position/Sensor/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_POSITION_SENSOR_NACK = 3316;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Position/Sensor/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_POSITION_SENSOR_OFFSET = 3317;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RKneePitch/Position/Sensor/SensorType as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_POSITION_SENSOR_SENSORTYPE = 3318;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RKneePitch/Position/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_POSITION_SENSOR_SUBDEVICENUMBER = 3319;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Position/Sensor/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_POSITION_SENSOR_TYPE = 3320;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Position/Sensor/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_POSITION_SENSOR_VALUE = 3321;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RKneePitch/Position/Sensor/jointZeroPosition as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_POSITION_SENSOR_JOINTZEROPOSITION = 3322;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RKneePitch/Position/Sensor/positionChainMREJoint as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_POSITION_SENSOR_POSITIONCHAINMREJOINT = 3323;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RKneePitch/Position/Sensor/positionChainMREMotor as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_POSITION_SENSOR_POSITIONCHAINMREMOTOR = 3324;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Temperature/Sensor/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_TEMPERATURE_SENSOR_ACK = 3325;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RKneePitch/Temperature/Sensor/AmbientTemperature as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_TEMPERATURE_SENSOR_AMBIENTTEMPERATURE = 3326;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RKneePitch/Temperature/Sensor/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_TEMPERATURE_SENSOR_DEVICE = 3327;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Temperature/Sensor/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_TEMPERATURE_SENSOR_ERROR = 3328;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Temperature/Sensor/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_TEMPERATURE_SENSOR_GAIN = 3329;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Temperature/Sensor/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_TEMPERATURE_SENSOR_MAX = 3330;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Temperature/Sensor/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_TEMPERATURE_SENSOR_MIN = 3331;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Temperature/Sensor/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_TEMPERATURE_SENSOR_NACK = 3332;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RKneePitch/Temperature/Sensor/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_TEMPERATURE_SENSOR_OFFSET = 3333;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Temperature/Sensor/
	 * OtherMotorTransmission as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_TEMPERATURE_SENSOR_OTHERMOTORTRANSMISSION = 3334;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RKneePitch/Temperature/Sensor/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_TEMPERATURE_SENSOR_SUBDEVICENUMBER = 3335;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RKneePitch/Temperature/Sensor/ThermalResistance as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_TEMPERATURE_SENSOR_THERMALRESISTANCE = 3336;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RKneePitch/Temperature/Sensor/ThermalTimeConstant as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_TEMPERATURE_SENSOR_THERMALTIMECONSTANT = 3337;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Temperature/Sensor/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_TEMPERATURE_SENSOR_TYPE = 3338;

	/**
	 * Id of the sensor Device/SubDeviceList/RKneePitch/Temperature/Sensor/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_TEMPERATURE_SENSOR_VALUE = 3339;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RKneePitch/Temperature/Sensor/motorModel as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_TEMPERATURE_SENSOR_MOTORMODEL = 3340;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/ElectricCurrent/Sensor/Ack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_ELECTRICCURRENT_SENSOR_ACK = 3341;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/ElectricCurrent/Sensor/Device as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_ELECTRICCURRENT_SENSOR_DEVICE = 3342;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/ElectricCurrent/Sensor/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_ELECTRICCURRENT_SENSOR_ERROR = 3343;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/ElectricCurrent/Sensor/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_ELECTRICCURRENT_SENSOR_GAIN = 3344;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/ElectricCurrent/Sensor/Max as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_ELECTRICCURRENT_SENSOR_MAX = 3345;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/ElectricCurrent/Sensor/Min as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_ELECTRICCURRENT_SENSOR_MIN = 3346;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/ElectricCurrent/Sensor/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_ELECTRICCURRENT_SENSOR_NACK = 3347;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/ElectricCurrent/Sensor/Offset as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_ELECTRICCURRENT_SENSOR_OFFSET = 3348;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/ElectricCurrent/Sensor
	 * /SubDeviceNumber as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_ELECTRICCURRENT_SENSOR_SUBDEVICENUMBER = 3349;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/ElectricCurrent/Sensor/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_ELECTRICCURRENT_SENSOR_TYPE = 3350;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/ElectricCurrent/Sensor/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_ELECTRICCURRENT_SENSOR_VALUE = 3351;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Hardness/Actuator/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_HARDNESS_ACTUATOR_ACK = 3352;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Hardness/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_HARDNESS_ACTUATOR_DEVICE = 3353;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Hardness/Actuator/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_HARDNESS_ACTUATOR_ERROR = 3354;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Hardness/Actuator/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_HARDNESS_ACTUATOR_GAIN = 3355;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Hardness/Actuator/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_HARDNESS_ACTUATOR_MAX = 3356;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Hardness/Actuator/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_HARDNESS_ACTUATOR_MIN = 3357;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Hardness/Actuator/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_HARDNESS_ACTUATOR_NACK = 3358;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Hardness/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_HARDNESS_ACTUATOR_OFFSET = 3359;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Hardness/Actuator/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_HARDNESS_ACTUATOR_SUBDEVICENUMBER = 3360;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Hardness/Actuator/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_HARDNESS_ACTUATOR_TYPE = 3361;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Hardness/Actuator/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_HARDNESS_ACTUATOR_VALUE = 3362;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Position/Actuator/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_POSITION_ACTUATOR_ACK = 3363;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Position/Actuator/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_POSITION_ACTUATOR_DEVICE = 3364;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Position/Actuator/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_POSITION_ACTUATOR_ERROR = 3365;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Position/Actuator/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_POSITION_ACTUATOR_GAIN = 3366;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Position/Actuator/IMax as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_POSITION_ACTUATOR_IMAX = 3367;

	/**
	 * Id of the sensor Device/SubDeviceList/RShoulderPitch/Position/Actuator/
	 * InvertControlDirection as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_POSITION_ACTUATOR_INVERTCONTROLDIRECTION = 3368;

	/**
	 * Id of the sensor Device/SubDeviceList/RShoulderPitch/Position/Actuator/Kd
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_POSITION_ACTUATOR_KD = 3369;

	/**
	 * Id of the sensor Device/SubDeviceList/RShoulderPitch/Position/Actuator/Ki
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_POSITION_ACTUATOR_KI = 3370;

	/**
	 * Id of the sensor Device/SubDeviceList/RShoulderPitch/Position/Actuator/Kp
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_POSITION_ACTUATOR_KP = 3371;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Position/Actuator/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_POSITION_ACTUATOR_MAX = 3372;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Position/Actuator/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_POSITION_ACTUATOR_MIN = 3373;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Position/Actuator/MotorNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_POSITION_ACTUATOR_MOTORNUMBER = 3374;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Position/Actuator/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_POSITION_ACTUATOR_NACK = 3375;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Position/Actuator/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_POSITION_ACTUATOR_OFFSET = 3376;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Position/Actuator/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_POSITION_ACTUATOR_SUBDEVICENUMBER = 3377;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Position/Actuator/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_POSITION_ACTUATOR_TYPE = 3378;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Position/Actuator/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_POSITION_ACTUATOR_VALUE = 3379;

	/**
	 * Id of the sensor Device/SubDeviceList/RShoulderPitch/Position/Sensor/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_POSITION_SENSOR_ACK = 3380;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Position/Sensor/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_POSITION_SENSOR_DEVICE = 3381;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Position/Sensor/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_POSITION_SENSOR_ERROR = 3382;

	/**
	 * Id of the sensor Device/SubDeviceList/RShoulderPitch/Position/Sensor/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_POSITION_SENSOR_GAIN = 3383;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Position/Sensor/GearRatio as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_POSITION_SENSOR_GEARRATIO = 3384;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Position/Sensor/Limit as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_POSITION_SENSOR_LIMIT = 3385;

	/**
	 * Id of the sensor Device/SubDeviceList/RShoulderPitch/Position/Sensor/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_POSITION_SENSOR_MAX = 3386;

	/**
	 * Id of the sensor Device/SubDeviceList/RShoulderPitch/Position/Sensor/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_POSITION_SENSOR_MIN = 3387;

	/**
	 * Id of the sensor Device/SubDeviceList/RShoulderPitch/Position/Sensor/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_POSITION_SENSOR_NACK = 3388;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Position/Sensor/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_POSITION_SENSOR_OFFSET = 3389;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Position/Sensor/SensorType as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_POSITION_SENSOR_SENSORTYPE = 3390;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Position/Sensor/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_POSITION_SENSOR_SUBDEVICENUMBER = 3391;

	/**
	 * Id of the sensor Device/SubDeviceList/RShoulderPitch/Position/Sensor/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_POSITION_SENSOR_TYPE = 3392;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Position/Sensor/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_POSITION_SENSOR_VALUE = 3393;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Position/Sensor/jointZeroPosition as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_POSITION_SENSOR_JOINTZEROPOSITION = 3394;

	/**
	 * Id of the sensor Device/SubDeviceList/RShoulderPitch/Position/Sensor/
	 * positionChainMREJoint as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_POSITION_SENSOR_POSITIONCHAINMREJOINT = 3395;

	/**
	 * Id of the sensor Device/SubDeviceList/RShoulderPitch/Position/Sensor/
	 * positionChainMREMotor as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_POSITION_SENSOR_POSITIONCHAINMREMOTOR = 3396;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Temperature/Sensor/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_TEMPERATURE_SENSOR_ACK = 3397;

	/**
	 * Id of the sensor Device/SubDeviceList/RShoulderPitch/Temperature/Sensor/
	 * AmbientTemperature as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_TEMPERATURE_SENSOR_AMBIENTTEMPERATURE = 3398;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Temperature/Sensor/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_TEMPERATURE_SENSOR_DEVICE = 3399;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Temperature/Sensor/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_TEMPERATURE_SENSOR_ERROR = 3400;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Temperature/Sensor/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_TEMPERATURE_SENSOR_GAIN = 3401;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Temperature/Sensor/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_TEMPERATURE_SENSOR_MAX = 3402;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Temperature/Sensor/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_TEMPERATURE_SENSOR_MIN = 3403;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Temperature/Sensor/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_TEMPERATURE_SENSOR_NACK = 3404;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Temperature/Sensor/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_TEMPERATURE_SENSOR_OFFSET = 3405;

	/**
	 * Id of the sensor Device/SubDeviceList/RShoulderPitch/Temperature/Sensor/
	 * OtherMotorTransmission as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_TEMPERATURE_SENSOR_OTHERMOTORTRANSMISSION = 3406;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Temperature/Sensor/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_TEMPERATURE_SENSOR_SUBDEVICENUMBER = 3407;

	/**
	 * Id of the sensor Device/SubDeviceList/RShoulderPitch/Temperature/Sensor/
	 * ThermalResistance as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_TEMPERATURE_SENSOR_THERMALRESISTANCE = 3408;

	/**
	 * Id of the sensor Device/SubDeviceList/RShoulderPitch/Temperature/Sensor/
	 * ThermalTimeConstant as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_TEMPERATURE_SENSOR_THERMALTIMECONSTANT = 3409;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Temperature/Sensor/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_TEMPERATURE_SENSOR_TYPE = 3410;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Temperature/Sensor/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_TEMPERATURE_SENSOR_VALUE = 3411;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderPitch/Temperature/Sensor/motorModel as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_TEMPERATURE_SENSOR_MOTORMODEL = 3412;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/ElectricCurrent/Sensor/Ack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_ELECTRICCURRENT_SENSOR_ACK = 3413;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/ElectricCurrent/Sensor/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_ELECTRICCURRENT_SENSOR_DEVICE = 3414;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/ElectricCurrent/Sensor/Error as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_ELECTRICCURRENT_SENSOR_ERROR = 3415;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/ElectricCurrent/Sensor/Gain as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_ELECTRICCURRENT_SENSOR_GAIN = 3416;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/ElectricCurrent/Sensor/Max as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_ELECTRICCURRENT_SENSOR_MAX = 3417;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/ElectricCurrent/Sensor/Min as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_ELECTRICCURRENT_SENSOR_MIN = 3418;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/ElectricCurrent/Sensor/Nack as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_ELECTRICCURRENT_SENSOR_NACK = 3419;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/ElectricCurrent/Sensor/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_ELECTRICCURRENT_SENSOR_OFFSET = 3420;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/ElectricCurrent/Sensor/SubDeviceNumber
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_ELECTRICCURRENT_SENSOR_SUBDEVICENUMBER = 3421;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/ElectricCurrent/Sensor/Type as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_ELECTRICCURRENT_SENSOR_TYPE = 3422;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/ElectricCurrent/Sensor/Value as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_ELECTRICCURRENT_SENSOR_VALUE = 3423;

	/**
	 * Id of the sensor Device/SubDeviceList/RShoulderRoll/Hardness/Actuator/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_HARDNESS_ACTUATOR_ACK = 3424;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/Hardness/Actuator/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_HARDNESS_ACTUATOR_DEVICE = 3425;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/Hardness/Actuator/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_HARDNESS_ACTUATOR_ERROR = 3426;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/Hardness/Actuator/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_HARDNESS_ACTUATOR_GAIN = 3427;

	/**
	 * Id of the sensor Device/SubDeviceList/RShoulderRoll/Hardness/Actuator/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_HARDNESS_ACTUATOR_MAX = 3428;

	/**
	 * Id of the sensor Device/SubDeviceList/RShoulderRoll/Hardness/Actuator/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_HARDNESS_ACTUATOR_MIN = 3429;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/Hardness/Actuator/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_HARDNESS_ACTUATOR_NACK = 3430;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/Hardness/Actuator/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_HARDNESS_ACTUATOR_OFFSET = 3431;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/Hardness/Actuator/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_HARDNESS_ACTUATOR_SUBDEVICENUMBER = 3432;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/Hardness/Actuator/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_HARDNESS_ACTUATOR_TYPE = 3433;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/Hardness/Actuator/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_HARDNESS_ACTUATOR_VALUE = 3434;

	/**
	 * Id of the sensor Device/SubDeviceList/RShoulderRoll/Position/Actuator/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_POSITION_ACTUATOR_ACK = 3435;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/Position/Actuator/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_POSITION_ACTUATOR_DEVICE = 3436;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/Position/Actuator/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_POSITION_ACTUATOR_ERROR = 3437;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/Position/Actuator/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_POSITION_ACTUATOR_GAIN = 3438;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/Position/Actuator/IMax as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_POSITION_ACTUATOR_IMAX = 3439;

	/**
	 * Id of the sensor Device/SubDeviceList/RShoulderRoll/Position/Actuator/
	 * InvertControlDirection as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_POSITION_ACTUATOR_INVERTCONTROLDIRECTION = 3440;

	/**
	 * Id of the sensor Device/SubDeviceList/RShoulderRoll/Position/Actuator/Kd
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_POSITION_ACTUATOR_KD = 3441;

	/**
	 * Id of the sensor Device/SubDeviceList/RShoulderRoll/Position/Actuator/Ki
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_POSITION_ACTUATOR_KI = 3442;

	/**
	 * Id of the sensor Device/SubDeviceList/RShoulderRoll/Position/Actuator/Kp
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_POSITION_ACTUATOR_KP = 3443;

	/**
	 * Id of the sensor Device/SubDeviceList/RShoulderRoll/Position/Actuator/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_POSITION_ACTUATOR_MAX = 3444;

	/**
	 * Id of the sensor Device/SubDeviceList/RShoulderRoll/Position/Actuator/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_POSITION_ACTUATOR_MIN = 3445;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/Position/Actuator/MotorNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_POSITION_ACTUATOR_MOTORNUMBER = 3446;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/Position/Actuator/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_POSITION_ACTUATOR_NACK = 3447;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/Position/Actuator/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_POSITION_ACTUATOR_OFFSET = 3448;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/Position/Actuator/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_POSITION_ACTUATOR_SUBDEVICENUMBER = 3449;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/Position/Actuator/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_POSITION_ACTUATOR_TYPE = 3450;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/Position/Actuator/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_POSITION_ACTUATOR_VALUE = 3451;

	/**
	 * Id of the sensor Device/SubDeviceList/RShoulderRoll/Position/Sensor/Ack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_POSITION_SENSOR_ACK = 3452;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/Position/Sensor/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_POSITION_SENSOR_DEVICE = 3453;

	/**
	 * Id of the sensor Device/SubDeviceList/RShoulderRoll/Position/Sensor/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_POSITION_SENSOR_ERROR = 3454;

	/**
	 * Id of the sensor Device/SubDeviceList/RShoulderRoll/Position/Sensor/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_POSITION_SENSOR_GAIN = 3455;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/Position/Sensor/GearRatio as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_POSITION_SENSOR_GEARRATIO = 3456;

	/**
	 * Id of the sensor Device/SubDeviceList/RShoulderRoll/Position/Sensor/Limit
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_POSITION_SENSOR_LIMIT = 3457;

	/**
	 * Id of the sensor Device/SubDeviceList/RShoulderRoll/Position/Sensor/Max
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_POSITION_SENSOR_MAX = 3458;

	/**
	 * Id of the sensor Device/SubDeviceList/RShoulderRoll/Position/Sensor/Min
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_POSITION_SENSOR_MIN = 3459;

	/**
	 * Id of the sensor Device/SubDeviceList/RShoulderRoll/Position/Sensor/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_POSITION_SENSOR_NACK = 3460;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/Position/Sensor/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_POSITION_SENSOR_OFFSET = 3461;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/Position/Sensor/SensorType as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_POSITION_SENSOR_SENSORTYPE = 3462;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/Position/Sensor/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_POSITION_SENSOR_SUBDEVICENUMBER = 3463;

	/**
	 * Id of the sensor Device/SubDeviceList/RShoulderRoll/Position/Sensor/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_POSITION_SENSOR_TYPE = 3464;

	/**
	 * Id of the sensor Device/SubDeviceList/RShoulderRoll/Position/Sensor/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_POSITION_SENSOR_VALUE = 3465;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/Position/Sensor/jointZeroPosition as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_POSITION_SENSOR_JOINTZEROPOSITION = 3466;

	/**
	 * Id of the sensor Device/SubDeviceList/RShoulderRoll/Position/Sensor/
	 * positionChainMREJoint as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_POSITION_SENSOR_POSITIONCHAINMREJOINT = 3467;

	/**
	 * Id of the sensor Device/SubDeviceList/RShoulderRoll/Position/Sensor/
	 * positionChainMREMotor as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_POSITION_SENSOR_POSITIONCHAINMREMOTOR = 3468;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/Temperature/Sensor/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_TEMPERATURE_SENSOR_ACK = 3469;

	/**
	 * Id of the sensor Device/SubDeviceList/RShoulderRoll/Temperature/Sensor/
	 * AmbientTemperature as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_TEMPERATURE_SENSOR_AMBIENTTEMPERATURE = 3470;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/Temperature/Sensor/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_TEMPERATURE_SENSOR_DEVICE = 3471;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/Temperature/Sensor/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_TEMPERATURE_SENSOR_ERROR = 3472;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/Temperature/Sensor/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_TEMPERATURE_SENSOR_GAIN = 3473;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/Temperature/Sensor/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_TEMPERATURE_SENSOR_MAX = 3474;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/Temperature/Sensor/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_TEMPERATURE_SENSOR_MIN = 3475;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/Temperature/Sensor/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_TEMPERATURE_SENSOR_NACK = 3476;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/Temperature/Sensor/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_TEMPERATURE_SENSOR_OFFSET = 3477;

	/**
	 * Id of the sensor Device/SubDeviceList/RShoulderRoll/Temperature/Sensor/
	 * OtherMotorTransmission as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_TEMPERATURE_SENSOR_OTHERMOTORTRANSMISSION = 3478;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/Temperature/Sensor/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_TEMPERATURE_SENSOR_SUBDEVICENUMBER = 3479;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/Temperature/Sensor/ThermalResistance
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_TEMPERATURE_SENSOR_THERMALRESISTANCE = 3480;

	/**
	 * Id of the sensor Device/SubDeviceList/RShoulderRoll/Temperature/Sensor/
	 * ThermalTimeConstant as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_TEMPERATURE_SENSOR_THERMALTIMECONSTANT = 3481;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/Temperature/Sensor/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_TEMPERATURE_SENSOR_TYPE = 3482;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/Temperature/Sensor/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_TEMPERATURE_SENSOR_VALUE = 3483;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RShoulderRoll/Temperature/Sensor/motorModel as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_TEMPERATURE_SENSOR_MOTORMODEL = 3484;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RWristYaw/ElectricCurrent/Sensor/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_ELECTRICCURRENT_SENSOR_ACK = 3485;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RWristYaw/ElectricCurrent/Sensor/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_ELECTRICCURRENT_SENSOR_DEVICE = 3486;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RWristYaw/ElectricCurrent/Sensor/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_ELECTRICCURRENT_SENSOR_ERROR = 3487;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RWristYaw/ElectricCurrent/Sensor/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_ELECTRICCURRENT_SENSOR_GAIN = 3488;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RWristYaw/ElectricCurrent/Sensor/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_ELECTRICCURRENT_SENSOR_MAX = 3489;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RWristYaw/ElectricCurrent/Sensor/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_ELECTRICCURRENT_SENSOR_MIN = 3490;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RWristYaw/ElectricCurrent/Sensor/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_ELECTRICCURRENT_SENSOR_NACK = 3491;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RWristYaw/ElectricCurrent/Sensor/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_ELECTRICCURRENT_SENSOR_OFFSET = 3492;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RWristYaw/ElectricCurrent/Sensor/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_ELECTRICCURRENT_SENSOR_SUBDEVICENUMBER = 3493;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RWristYaw/ElectricCurrent/Sensor/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_ELECTRICCURRENT_SENSOR_TYPE = 3494;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RWristYaw/ElectricCurrent/Sensor/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_ELECTRICCURRENT_SENSOR_VALUE = 3495;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Hardness/Actuator/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_HARDNESS_ACTUATOR_ACK = 3496;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Hardness/Actuator/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_HARDNESS_ACTUATOR_DEVICE = 3497;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Hardness/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_HARDNESS_ACTUATOR_ERROR = 3498;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Hardness/Actuator/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_HARDNESS_ACTUATOR_GAIN = 3499;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Hardness/Actuator/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_HARDNESS_ACTUATOR_MAX = 3500;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Hardness/Actuator/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_HARDNESS_ACTUATOR_MIN = 3501;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Hardness/Actuator/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_HARDNESS_ACTUATOR_NACK = 3502;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Hardness/Actuator/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_HARDNESS_ACTUATOR_OFFSET = 3503;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RWristYaw/Hardness/Actuator/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_HARDNESS_ACTUATOR_SUBDEVICENUMBER = 3504;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Hardness/Actuator/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_HARDNESS_ACTUATOR_TYPE = 3505;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Hardness/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_HARDNESS_ACTUATOR_VALUE = 3506;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Position/Actuator/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_POSITION_ACTUATOR_ACK = 3507;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Position/Actuator/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_POSITION_ACTUATOR_DEVICE = 3508;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Position/Actuator/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_POSITION_ACTUATOR_ERROR = 3509;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Position/Actuator/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_POSITION_ACTUATOR_GAIN = 3510;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Position/Actuator/IMax as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_POSITION_ACTUATOR_IMAX = 3511;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RWristYaw/Position/Actuator/InvertControlDirection
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_POSITION_ACTUATOR_INVERTCONTROLDIRECTION = 3512;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Position/Actuator/Kd as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_POSITION_ACTUATOR_KD = 3513;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Position/Actuator/Ki as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_POSITION_ACTUATOR_KI = 3514;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Position/Actuator/Kp as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_POSITION_ACTUATOR_KP = 3515;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Position/Actuator/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_POSITION_ACTUATOR_MAX = 3516;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Position/Actuator/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_POSITION_ACTUATOR_MIN = 3517;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RWristYaw/Position/Actuator/MotorNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_POSITION_ACTUATOR_MOTORNUMBER = 3518;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Position/Actuator/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_POSITION_ACTUATOR_NACK = 3519;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Position/Actuator/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_POSITION_ACTUATOR_OFFSET = 3520;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RWristYaw/Position/Actuator/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_POSITION_ACTUATOR_SUBDEVICENUMBER = 3521;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Position/Actuator/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_POSITION_ACTUATOR_TYPE = 3522;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Position/Actuator/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_POSITION_ACTUATOR_VALUE = 3523;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Position/Sensor/Ack as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_POSITION_SENSOR_ACK = 3524;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Position/Sensor/Device as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_POSITION_SENSOR_DEVICE = 3525;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Position/Sensor/Error as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_POSITION_SENSOR_ERROR = 3526;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Position/Sensor/Gain as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_POSITION_SENSOR_GAIN = 3527;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Position/Sensor/GearRatio
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_POSITION_SENSOR_GEARRATIO = 3528;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Position/Sensor/Limit as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_POSITION_SENSOR_LIMIT = 3529;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Position/Sensor/Max as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_POSITION_SENSOR_MAX = 3530;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Position/Sensor/Min as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_POSITION_SENSOR_MIN = 3531;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Position/Sensor/Nack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_POSITION_SENSOR_NACK = 3532;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Position/Sensor/Offset as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_POSITION_SENSOR_OFFSET = 3533;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RWristYaw/Position/Sensor/SensorType as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_POSITION_SENSOR_SENSORTYPE = 3534;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RWristYaw/Position/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_POSITION_SENSOR_SUBDEVICENUMBER = 3535;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Position/Sensor/Type as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_POSITION_SENSOR_TYPE = 3536;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Position/Sensor/Value as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_POSITION_SENSOR_VALUE = 3537;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RWristYaw/Position/Sensor/jointZeroPosition as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_POSITION_SENSOR_JOINTZEROPOSITION = 3538;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RWristYaw/Position/Sensor/positionChainMREJoint as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_POSITION_SENSOR_POSITIONCHAINMREJOINT = 3539;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RWristYaw/Position/Sensor/positionChainMREMotor as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_POSITION_SENSOR_POSITIONCHAINMREMOTOR = 3540;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Temperature/Sensor/Ack as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_TEMPERATURE_SENSOR_ACK = 3541;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RWristYaw/Temperature/Sensor/AmbientTemperature as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_TEMPERATURE_SENSOR_AMBIENTTEMPERATURE = 3542;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Temperature/Sensor/Device
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_TEMPERATURE_SENSOR_DEVICE = 3543;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Temperature/Sensor/Error
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_TEMPERATURE_SENSOR_ERROR = 3544;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Temperature/Sensor/Gain
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_TEMPERATURE_SENSOR_GAIN = 3545;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Temperature/Sensor/Max as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_TEMPERATURE_SENSOR_MAX = 3546;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Temperature/Sensor/Min as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_TEMPERATURE_SENSOR_MIN = 3547;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Temperature/Sensor/Nack
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_TEMPERATURE_SENSOR_NACK = 3548;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Temperature/Sensor/Offset
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_TEMPERATURE_SENSOR_OFFSET = 3549;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Temperature/Sensor/
	 * OtherMotorTransmission as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_TEMPERATURE_SENSOR_OTHERMOTORTRANSMISSION = 3550;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RWristYaw/Temperature/Sensor/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_TEMPERATURE_SENSOR_SUBDEVICENUMBER = 3551;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RWristYaw/Temperature/Sensor/ThermalResistance as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_TEMPERATURE_SENSOR_THERMALRESISTANCE = 3552;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RWristYaw/Temperature/Sensor/ThermalTimeConstant as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_TEMPERATURE_SENSOR_THERMALTIMECONSTANT = 3553;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Temperature/Sensor/Type
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_TEMPERATURE_SENSOR_TYPE = 3554;

	/**
	 * Id of the sensor Device/SubDeviceList/RWristYaw/Temperature/Sensor/Value
	 * as to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_TEMPERATURE_SENSOR_VALUE = 3555;

	/**
	 * Id of the sensor
	 * Device/SubDeviceList/RWristYaw/Temperature/Sensor/motorModel as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_RWRISTYAW_TEMPERATURE_SENSOR_MOTORMODEL = 3556;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Actuator/Ack as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_ACTUATOR_ACK = 3557;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Actuator/Device as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_ACTUATOR_DEVICE = 3558;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Actuator/Error as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_ACTUATOR_ERROR = 3559;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Actuator/Gain as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_ACTUATOR_GAIN = 3560;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Actuator/Max as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_ACTUATOR_MAX = 3561;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Actuator/Min as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_ACTUATOR_MIN = 3562;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Actuator/Nack as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_ACTUATOR_NACK = 3563;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Actuator/Offset as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_ACTUATOR_OFFSET = 3564;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Actuator/SubDeviceNumber as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_ACTUATOR_SUBDEVICENUMBER = 3565;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Actuator/Type as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_ACTUATOR_TYPE = 3566;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Actuator/Value as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_ACTUATOR_VALUE = 3567;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Left/Sensor/Ack as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_LEFT_SENSOR_ACK = 3568;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Left/Sensor/Device as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_LEFT_SENSOR_DEVICE = 3569;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Left/Sensor/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_LEFT_SENSOR_ERROR = 3570;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Left/Sensor/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_LEFT_SENSOR_GAIN = 3571;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Left/Sensor/Max as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_LEFT_SENSOR_MAX = 3572;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Left/Sensor/Min as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_LEFT_SENSOR_MIN = 3573;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Left/Sensor/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_LEFT_SENSOR_NACK = 3574;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Left/Sensor/Offset as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_LEFT_SENSOR_OFFSET = 3575;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Left/Sensor/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_LEFT_SENSOR_SUBDEVICENUMBER = 3576;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Left/Sensor/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_LEFT_SENSOR_TYPE = 3577;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Left/Sensor/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_LEFT_SENSOR_VALUE = 3578;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Left/Sensor/Value1 as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_LEFT_SENSOR_VALUE1 = 3579;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Left/Sensor/Value2 as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_LEFT_SENSOR_VALUE2 = 3580;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Left/Sensor/Value3 as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_LEFT_SENSOR_VALUE3 = 3581;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Left/Sensor/Value4 as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_LEFT_SENSOR_VALUE4 = 3582;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Left/Sensor/Value5 as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_LEFT_SENSOR_VALUE5 = 3583;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Left/Sensor/Value6 as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_LEFT_SENSOR_VALUE6 = 3584;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Left/Sensor/Value7 as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_LEFT_SENSOR_VALUE7 = 3585;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Left/Sensor/Value8 as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_LEFT_SENSOR_VALUE8 = 3586;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Left/Sensor/Value9 as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_LEFT_SENSOR_VALUE9 = 3587;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Right/Sensor/Ack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_RIGHT_SENSOR_ACK = 3588;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Right/Sensor/Device as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_RIGHT_SENSOR_DEVICE = 3589;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Right/Sensor/Error as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_RIGHT_SENSOR_ERROR = 3590;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Right/Sensor/Gain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_RIGHT_SENSOR_GAIN = 3591;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Right/Sensor/Max as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_RIGHT_SENSOR_MAX = 3592;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Right/Sensor/Min as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_RIGHT_SENSOR_MIN = 3593;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Right/Sensor/Nack as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_RIGHT_SENSOR_NACK = 3594;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Right/Sensor/Offset as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_RIGHT_SENSOR_OFFSET = 3595;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Right/Sensor/SubDeviceNumber as
	 * to be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_RIGHT_SENSOR_SUBDEVICENUMBER = 3596;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Right/Sensor/Type as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_RIGHT_SENSOR_TYPE = 3597;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Right/Sensor/Value as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_RIGHT_SENSOR_VALUE = 3598;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Right/Sensor/Value1 as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_RIGHT_SENSOR_VALUE1 = 3599;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Right/Sensor/Value2 as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_RIGHT_SENSOR_VALUE2 = 3600;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Right/Sensor/Value3 as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_RIGHT_SENSOR_VALUE3 = 3601;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Right/Sensor/Value4 as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_RIGHT_SENSOR_VALUE4 = 3602;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Right/Sensor/Value5 as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_RIGHT_SENSOR_VALUE5 = 3603;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Right/Sensor/Value6 as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_RIGHT_SENSOR_VALUE6 = 3604;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Right/Sensor/Value7 as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_RIGHT_SENSOR_VALUE7 = 3605;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Right/Sensor/Value8 as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_RIGHT_SENSOR_VALUE8 = 3606;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Right/Sensor/Value9 as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_RIGHT_SENSOR_VALUE9 = 3607;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Sensor/Ack as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_SENSOR_ACK = 3608;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Sensor/Device as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_SENSOR_DEVICE = 3609;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Sensor/Error as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_SENSOR_ERROR = 3610;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Sensor/Gain as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_SENSOR_GAIN = 3611;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Sensor/Max as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_SENSOR_MAX = 3612;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Sensor/MaxGaps as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_SENSOR_MAXGAPS = 3613;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Sensor/Min as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_SENSOR_MIN = 3614;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Sensor/MinEdges as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_SENSOR_MINEDGES = 3615;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Sensor/Nack as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_SENSOR_NACK = 3616;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Sensor/Offset as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_SENSOR_OFFSET = 3617;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Sensor/SubDeviceNumber as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_SENSOR_SUBDEVICENUMBER = 3618;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Sensor/Type as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_SENSOR_TYPE = 3619;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Sensor/Value as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_SENSOR_VALUE = 3620;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Sensor/dmax as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_SENSOR_DMAX = 3621;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Sensor/firstgain as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_SENSOR_FIRSTGAIN = 3622;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Sensor/ldetect as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_SENSOR_LDETECT = 3623;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Sensor/nblank as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_SENSOR_NBLANK = 3624;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Sensor/nburst as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_SENSOR_NBURST = 3625;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Sensor/ncag as to be used by the
	 * method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_SENSOR_NCAG = 3626;

	/**
	 * Id of the sensor Device/SubDeviceList/US/Sensor/nhold as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_DEVICE_SUBDEVICELIST_US_SENSOR_NHOLD = 3627;

	/**
	 * Id of the sensor FaceDetected as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_FACEDETECTED = 3628;

	/**
	 * Id of the sensor FrontTactilTouched as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_FRONTTACTILTOUCHED = 3629;

	/**
	 * Id of the sensor HandLeftBackTouched as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_HANDLEFTBACKTOUCHED = 3630;

	/**
	 * Id of the sensor HandLeftLeftTouched as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_HANDLEFTLEFTTOUCHED = 3631;

	/**
	 * Id of the sensor HandLeftRightTouched as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_HANDLEFTRIGHTTOUCHED = 3632;

	/**
	 * Id of the sensor HandRightBackTouched as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_HANDRIGHTBACKTOUCHED = 3633;

	/**
	 * Id of the sensor HandRightLeftTouched as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_HANDRIGHTLEFTTOUCHED = 3634;

	/**
	 * Id of the sensor HandRightRightTouched as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_HANDRIGHTRIGHTTOUCHED = 3635;

	/**
	 * Id of the sensor HotJoinDetected as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_HOTJOINDETECTED = 3636;

	/**
	 * Id of the sensor InfraRedFourBytesReceived as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_INFRAREDFOURBYTESRECEIVED = 3637;

	/**
	 * Id of the sensor InfraRedIpAdressReceived as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_INFRAREDIPADRESSRECEIVED = 3638;

	/**
	 * Id of the sensor InfraRedOneByteReceived as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_INFRAREDONEBYTERECEIVED = 3639;

	/**
	 * Id of the sensor InfraRedRemoteKeyReceived as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_INFRAREDREMOTEKEYRECEIVED = 3640;

	/**
	 * Id of the sensor InfraRedSide as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_INFRAREDSIDE = 3641;

	/**
	 * Id of the sensor LandmarkDetected as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_LANDMARKDETECTED = 3642;

	/**
	 * Id of the sensor Launcher/Loading as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_LAUNCHER_LOADING = 3643;

	/**
	 * Id of the sensor LeftBumperPressed as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_LEFTBUMPERPRESSED = 3644;

	/**
	 * Id of the sensor MiddleTactilTouched as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_MIDDLETACTILTOUCHED = 3645;

	/**
	 * Id of the sensor MonitorNumber as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_MONITORNUMBER = 3646;

	/**
	 * Id of the sensor Motion/IsComInSupportPolygon as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_MOTION_ISCOMINSUPPORTPOLYGON = 3647;

	/**
	 * Id of the sensor NoiseRecognized as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_NOISERECOGNIZED = 3648;

	/**
	 * Id of the sensor PictureDetected as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_PICTUREDETECTED = 3649;

	/**
	 * Id of the sensor RearTactilTouched as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_REARTACTILTOUCHED = 3650;

	/**
	 * Id of the sensor RightBumperPressed as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_RIGHTBUMPERPRESSED = 3651;

	/**
	 * Id of the sensor RobotConfig/Body/BaseVersion as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_ROBOTCONFIG_BODY_BASEVERSION = 3652;

	/**
	 * Id of the sensor RobotConfig/Body/Device/FSR/Calibration/Version as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_ROBOTCONFIG_BODY_DEVICE_FSR_CALIBRATION_VERSION = 3653;

	/**
	 * Id of the sensor RobotConfig/Body/Device/Foot/Version as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_ROBOTCONFIG_BODY_DEVICE_FOOT_VERSION = 3654;

	/**
	 * Id of the sensor RobotConfig/Body/Device/Hand/Left/Version as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_ROBOTCONFIG_BODY_DEVICE_HAND_LEFT_VERSION = 3655;

	/**
	 * Id of the sensor RobotConfig/Body/Device/Hand/Right/Version as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_ROBOTCONFIG_BODY_DEVICE_HAND_RIGHT_VERSION = 3656;

	/**
	 * Id of the sensor RobotConfig/Body/Device/LeftArm/Version as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_ROBOTCONFIG_BODY_DEVICE_LEFTARM_VERSION = 3657;

	/**
	 * Id of the sensor RobotConfig/Body/Device/Legs/Version as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_ROBOTCONFIG_BODY_DEVICE_LEGS_VERSION = 3658;

	/**
	 * Id of the sensor RobotConfig/Body/Device/RightArm/Version as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_ROBOTCONFIG_BODY_DEVICE_RIGHTARM_VERSION = 3659;

	/**
	 * Id of the sensor RobotConfig/Body/SoftwareRequirement as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_ROBOTCONFIG_BODY_SOFTWAREREQUIREMENT = 3660;

	/**
	 * Id of the sensor RobotConfig/Body/Type as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_ROBOTCONFIG_BODY_TYPE = 3661;

	/**
	 * Id of the sensor RobotConfig/Body/Version as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_ROBOTCONFIG_BODY_VERSION = 3662;

	/**
	 * Id of the sensor RobotConfig/Head/BaseVersion as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_ROBOTCONFIG_HEAD_BASEVERSION = 3663;

	/**
	 * Id of the sensor RobotConfig/Head/Device/Camera/Version as to be used by
	 * the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_ROBOTCONFIG_HEAD_DEVICE_CAMERA_VERSION = 3664;

	/**
	 * Id of the sensor RobotConfig/Head/Device/FaceBoard/Leds/Rotation as to be
	 * used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_ROBOTCONFIG_HEAD_DEVICE_FACEBOARD_LEDS_ROTATION = 3665;

	/**
	 * Id of the sensor RobotConfig/Head/Device/LaserRangeFinder/Version as to
	 * be used by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_ROBOTCONFIG_HEAD_DEVICE_LASERRANGEFINDER_VERSION = 3666;

	/**
	 * Id of the sensor RobotConfig/Head/Device/TouchBoard/Version as to be used
	 * by the method {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_ROBOTCONFIG_HEAD_DEVICE_TOUCHBOARD_VERSION = 3667;

	/**
	 * Id of the sensor RobotConfig/Head/HeadId as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_ROBOTCONFIG_HEAD_HEADID = 3668;

	/**
	 * Id of the sensor SonarLeftDetected as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_SONARLEFTDETECTED = 3669;

	/**
	 * Id of the sensor SonarLeftNothingDetected as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_SONARLEFTNOTHINGDETECTED = 3670;

	/**
	 * Id of the sensor SonarMiddleDetected as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_SONARMIDDLEDETECTED = 3671;

	/**
	 * Id of the sensor SonarRightDetected as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_SONARRIGHTDETECTED = 3672;

	/**
	 * Id of the sensor SonarRightNothingDetected as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_SONARRIGHTNOTHINGDETECTED = 3673;

	/**
	 * Id of the sensor SoundDetected as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_SOUNDDETECTED = 3674;

	/**
	 * Id of the sensor SpeechDetected as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_SPEECHDETECTED = 3675;

	/**
	 * Id of the sensor WordRecognized as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_WORDRECOGNIZED = 3676;

	/**
	 * Id of the sensor _AsynchronousTask11 as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID__ASYNCHRONOUSTASK11 = 3677;

	/**
	 * Id of the sensor _AsynchronousTask13 as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID__ASYNCHRONOUSTASK13 = 3678;

	/**
	 * Id of the sensor _AsynchronousTask15 as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID__ASYNCHRONOUSTASK15 = 3679;

	/**
	 * Id of the sensor _AsynchronousTask17 as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID__ASYNCHRONOUSTASK17 = 3680;

	/**
	 * Id of the sensor _AsynchronousTask19 as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID__ASYNCHRONOUSTASK19 = 3681;

	/**
	 * Id of the sensor _AsynchronousTask21 as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID__ASYNCHRONOUSTASK21 = 3682;

	/**
	 * Id of the sensor _AsynchronousTask23 as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID__ASYNCHRONOUSTASK23 = 3683;

	/**
	 * Id of the sensor _AsynchronousTask25 as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID__ASYNCHRONOUSTASK25 = 3684;

	/**
	 * Id of the sensor _AsynchronousTask27 as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID__ASYNCHRONOUSTASK27 = 3685;

	/**
	 * Id of the sensor _AsynchronousTask3 as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID__ASYNCHRONOUSTASK3 = 3686;

	/**
	 * Id of the sensor _AsynchronousTask5 as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID__ASYNCHRONOUSTASK5 = 3687;

	/**
	 * Id of the sensor _AsynchronousTask7 as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID__ASYNCHRONOUSTASK7 = 3688;

	/**
	 * Id of the sensor _AsynchronousTask9 as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID__ASYNCHRONOUSTASK9 = 3689;

	/**
	 * Id of the sensor footContact as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_FOOTCONTACT = 3690;

	/**
	 * Id of the sensor footContactChanged as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_FOOTCONTACTCHANGED = 3691;

	/**
	 * Id of the sensor leftFootContact as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_LEFTFOOTCONTACT = 3692;

	/**
	 * Id of the sensor leftFootTotalWeight as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_LEFTFOOTTOTALWEIGHT = 3693;

	/**
	 * Id of the sensor naoqi/ALMethodInfoSample as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_NAOQI_ALMETHODINFOSAMPLE = 3694;

	/**
	 * Id of the sensor redBallDetected as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_REDBALLDETECTED = 3695;

	/**
	 * Id of the sensor rightFootContact as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_RIGHTFOOTCONTACT = 3696;

	/**
	 * Id of the sensor rightFootTotalWeight as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_RIGHTFOOTTOTALWEIGHT = 3697;

	/**
	 * Id of the sensor robotHasFallen as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_ROBOTHASFALLEN = 3698;

	/**
	 * Id of the sensor robotPose as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_ROBOTPOSE = 3699;

	/**
	 * Id of the sensor robotPoseChanged as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_ROBOTPOSECHANGED = 3700;

	/**
	 * Id of the sensor robotPoseSince as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_ROBOTPOSESINCE = 3701;

	/**
	 * Id of the sensor soundDetector/SoundDetected as to be used by the method
	 * {@link NaoUtil#getSensorValues(Nao, List)}.
	 */
	public static final int SENSOR_ID_SOUNDDETECTOR_SOUNDDETECTED = 3702;
}