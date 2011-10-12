package org.qualitune.naoservice.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class NaoJointInfo {

	/** The joint if this {@link NaoJointInfo} belongs to. */
	protected NaoJointID jointID;

	/** The current of this joint (in <code>A</code>). */
	protected double current;

	/** The stiffness of this joint. */
	protected double stiffness;

	/** The intended position of this joint. */
	protected double positionIntended;

	/** The actual position of this joint. */
	protected double position;

	/** The current temperature of this joint (in rounded <code>°C</code>). */
	protected double temperature;

	/**
	 * The time stamp of this {@link NaoJointInfo} in <code>10^-9 seconds</code>
	 * .
	 */
	protected long timeStamp;

	/**
	 * Creates a new {@link NaoJointInfo} for a given {@link Nao} and a given
	 * jointID.
	 * 
	 * @param nao
	 *            The {@link Nao}.
	 * @param jointID
	 *            The {@link NaoJointID}
	 * @throws NaoUtilException
	 */
	public NaoJointInfo(Nao nao, NaoJointID jointID) throws NaoUtilException {

		this.jointID = jointID;

		init(nao);
	}

	/**
	 * Creates a new {@link NaoJointInfo}.
	 * 
	 * @param nao
	 *            The {@link Nao} this {@link NaoJointInfo} belongs to.
	 * @param id
	 *            The {@link NaoJointID} of this {@link NaoJointInfo}.
	 * @param requestInfos
	 *            If <code>true</code> this {@link NaoJointID} will by itself
	 *            connect to the {@link Nao} and requests its infos. Otherwhise
	 *            they have to be set manually.
	 * @throws NaoUtilException
	 */
	public NaoJointInfo(Nao nao, NaoJointID id, boolean requestInfos)
			throws NaoUtilException {
		this.jointID = id;

		if (requestInfos)
			init(nao);
		// no else.
	}

	/**
	 * Returns an additional {@link String} to the
	 * {@link NaoJointInfo#toString()} method that explains how the
	 * {@link String} has to be interpreted.
	 * 
	 * @return The legend as a {@link String}.
	 */
	public static String getLegend() {
		StringBuffer result = new StringBuffer();
		result.append("Joint | Time | Current | Stiffness | Intended Position | Position | Temperature\n");
		return result.toString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NaoJointInfo other = (NaoJointInfo) obj;
		if (Double.doubleToLongBits(current) != Double
				.doubleToLongBits(other.current))
			return false;
		if (jointID != other.jointID)
			return false;
		if (Double.doubleToLongBits(position) != Double
				.doubleToLongBits(other.position))
			return false;
		if (Double.doubleToLongBits(positionIntended) != Double
				.doubleToLongBits(other.positionIntended))
			return false;
		if (Double.doubleToLongBits(stiffness) != Double
				.doubleToLongBits(other.stiffness))
			return false;
		if (Double.doubleToLongBits(temperature) != Double
				.doubleToLongBits(other.temperature))
			return false;
		if (timeStamp != other.timeStamp)
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(current);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((jointID == null) ? 0 : jointID.hashCode());
		temp = Double.doubleToLongBits(position);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(positionIntended);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(stiffness);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(temperature);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (int) (timeStamp ^ (timeStamp >>> 32));
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append(jointID);
		result.append(" | ");
		result.append(timeStamp);
		result.append(" | ");
		result.append(current);
		result.append(" | ");
		result.append(stiffness);
		result.append(" | ");
		result.append(positionIntended);
		result.append(" | ");
		result.append(position);
		result.append(" | ");
		result.append(temperature);
		return result.toString();
	}

	/**
	 * Returns the joint if this {@link NaoJointInfo} belongs to.
	 * 
	 * @return The joint if this {@link NaoJointInfo} belongs to.
	 */
	public NaoJointID getJointID() {
		return jointID;
	}

	/**
	 * Returns the current of this joint (in <code>A</code>).
	 * 
	 * @return The current of this joint (in <code>A</code>).
	 */
	public double getCurrent() {
		return current;
	}

	/**
	 * Returns the stiffness of this joint.
	 * 
	 * @return The stiffness of this joint.
	 */
	public double getStiffness() {
		return stiffness;
	}

	/**
	 * Returns the actual position of this joint.
	 * 
	 * @return The actual position of this joint.
	 */
	public double getPosition() {
		return position;
	}

	/**
	 * Returns the intended position of this joint.
	 * 
	 * @return The intended position of this joint.
	 */
	public double getPositionIntended() {
		return positionIntended;
	}

	/**
	 * Returns the current temperature of this joint (in rounded <code>°C</code>
	 * ).
	 * 
	 * @return The current temperature of this joint (in rounded <code>°C</code>
	 *         ).
	 */
	public double getTemperature() {
		return temperature;
	}

	/**
	 * Returns the time stamp of this {@link NaoJointInfo} in
	 * <code>10^-9 seconds</code>.
	 * 
	 * @return The time stamp of this {@link NaoJointInfo} in
	 *         <code>10^-9 seconds</code>.
	 */
	public long getTimeStamp() {
		return timeStamp;
	}

	/**
	 * Sets the actual position of this joint.
	 * 
	 * @param position
	 *            The actual position of this joint.
	 */
	public void setPosition(double position) {
		this.position = position;
	}

	/**
	 * Sets the intended position of this joint.
	 * 
	 * @param position
	 *            The intended position of this joint.
	 */
	public void setPositionIntended(double position) {
		positionIntended = position;
	}

	/**
	 * Initializes this {@link NaoJointInfo}.
	 * 
	 * @param nao
	 *            The {@link Nao} of this {@link NaoJointInfo}.
	 * @throws NaoUtilException
	 */
	protected void init(Nao nao) throws NaoUtilException {
		List<Integer> identifiers = new ArrayList<Integer>();
		switch (jointID) {
		case HeadYaw:
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_ELECTRICCURRENT_SENSOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_HARDNESS_ACTUATOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_POSITION_ACTUATOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_POSITION_SENSOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_HEADYAW_TEMPERATURE_SENSOR_VALUE);
			break;
		case HeadPitch:
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_ELECTRICCURRENT_SENSOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_HARDNESS_ACTUATOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_POSITION_ACTUATOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_POSITION_SENSOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_HEADPITCH_TEMPERATURE_SENSOR_VALUE);
			break;
		case LShoulderPitch:
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_ELECTRICCURRENT_SENSOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_HARDNESS_ACTUATOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_POSITION_ACTUATOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_POSITION_SENSOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERPITCH_TEMPERATURE_SENSOR_VALUE);
			break;
		case LShoulderRoll:
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_ELECTRICCURRENT_SENSOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_HARDNESS_ACTUATOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_POSITION_ACTUATOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_POSITION_SENSOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LSHOULDERROLL_TEMPERATURE_SENSOR_VALUE);
			break;
		case LElbowYaw:
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_ELECTRICCURRENT_SENSOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_HARDNESS_ACTUATOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_POSITION_ACTUATOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_POSITION_SENSOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWYAW_TEMPERATURE_SENSOR_VALUE);
			break;
		case LElbowRoll:
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_ELECTRICCURRENT_SENSOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_HARDNESS_ACTUATOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_POSITION_ACTUATOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_POSITION_SENSOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LELBOWROLL_TEMPERATURE_SENSOR_VALUE);
			break;
		case LHipYawPitch:
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_ELECTRICCURRENT_SENSOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_HARDNESS_ACTUATOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_POSITION_ACTUATOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_POSITION_SENSOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPYAWPITCH_TEMPERATURE_SENSOR_VALUE);
			break;
		case LHipPitch:
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_ELECTRICCURRENT_SENSOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_HARDNESS_ACTUATOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_POSITION_ACTUATOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_POSITION_SENSOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPPITCH_TEMPERATURE_SENSOR_VALUE);
			break;
		case LHipRoll:
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_ELECTRICCURRENT_SENSOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_HARDNESS_ACTUATOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_POSITION_ACTUATOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_POSITION_SENSOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LHIPROLL_TEMPERATURE_SENSOR_VALUE);
			break;
		case LKneePitch:
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_ELECTRICCURRENT_SENSOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_HARDNESS_ACTUATOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_POSITION_ACTUATOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_POSITION_SENSOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LKNEEPITCH_TEMPERATURE_SENSOR_VALUE);
			break;
		case LAnklePitch:
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_ELECTRICCURRENT_SENSOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_HARDNESS_ACTUATOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_POSITION_ACTUATOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_POSITION_SENSOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEPITCH_TEMPERATURE_SENSOR_VALUE);
			break;
		case LAnkleRoll:
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_ELECTRICCURRENT_SENSOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_HARDNESS_ACTUATOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_POSITION_ACTUATOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_POSITION_SENSOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_LANKLEROLL_TEMPERATURE_SENSOR_VALUE);
			break;
		case RShoulderPitch:
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_ELECTRICCURRENT_SENSOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_HARDNESS_ACTUATOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_POSITION_ACTUATOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_POSITION_SENSOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERPITCH_TEMPERATURE_SENSOR_VALUE);
			break;
		case RShoulderRoll:
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_ELECTRICCURRENT_SENSOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_HARDNESS_ACTUATOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_POSITION_ACTUATOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_POSITION_SENSOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RSHOULDERROLL_TEMPERATURE_SENSOR_VALUE);
			break;
		case RElbowYaw:
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_ELECTRICCURRENT_SENSOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_HARDNESS_ACTUATOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_POSITION_ACTUATOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_POSITION_SENSOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWYAW_TEMPERATURE_SENSOR_VALUE);
			break;
		case RElbowRoll:
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_ELECTRICCURRENT_SENSOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_HARDNESS_ACTUATOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_POSITION_ACTUATOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_POSITION_SENSOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RELBOWROLL_TEMPERATURE_SENSOR_VALUE);
			break;
		case RHipPitch:
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_ELECTRICCURRENT_SENSOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_HARDNESS_ACTUATOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_POSITION_ACTUATOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_POSITION_SENSOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPPITCH_TEMPERATURE_SENSOR_VALUE);
			break;
		case RHipRoll:
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_ELECTRICCURRENT_SENSOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_HARDNESS_ACTUATOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_POSITION_ACTUATOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_POSITION_SENSOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RHIPROLL_TEMPERATURE_SENSOR_VALUE);
			break;
		case RKneePitch:
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_ELECTRICCURRENT_SENSOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_HARDNESS_ACTUATOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_POSITION_ACTUATOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_POSITION_SENSOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RKNEEPITCH_TEMPERATURE_SENSOR_VALUE);
			break;
		case RAnklePitch:
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_ELECTRICCURRENT_SENSOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_HARDNESS_ACTUATOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_POSITION_ACTUATOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_POSITION_SENSOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEPITCH_TEMPERATURE_SENSOR_VALUE);
			break;
		case RAnkleRoll:
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_ELECTRICCURRENT_SENSOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_HARDNESS_ACTUATOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_POSITION_ACTUATOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_POSITION_SENSOR_VALUE);
			identifiers
					.add(NaoConstants.SENSOR_ID_DEVICE_SUBDEVICELIST_RANKLEROLL_TEMPERATURE_SENSOR_VALUE);
			break;
	
		default:
			throw new NaoUtilException("Unknown Joint ID: "
					+ jointID.toString() + ".");
		}
	
		Map<String, String> values = NaoUtil.getSensorValues(nao, identifiers);
	
		for (String key : values.keySet()) {
			if (key.contains("ElectricCurrent"))
				current = Double.parseDouble(values.get(key));
			else if (key.contains("Hardness"))
				stiffness = Double.parseDouble(values.get(key));
			else if (key.contains("Position/Actuator"))
				positionIntended = Double.parseDouble(values.get(key));
			else if (key.contains("Position/Sensor"))
				position = Double.parseDouble(values.get(key));
			else if (key.contains("Temperature"))
				temperature = Double.parseDouble(values.get(key));
			else if (key.contains(NaoConstants.TIME_STAMP))
				timeStamp = Math
						.round(Double.parseDouble(values.get(key)) * 1000000000);
			// no else.
		}
	}
}
