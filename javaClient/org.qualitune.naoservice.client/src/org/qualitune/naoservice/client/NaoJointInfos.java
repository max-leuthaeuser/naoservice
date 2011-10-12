package org.qualitune.naoservice.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class that contains infos of all Joints within the {@link Nao}.
 * 
 * @author Claas Wilke
 */
public class NaoJointInfos {

	/** Contains all identifiers necessary for a {@link NaoJointInfos} request. */
	protected static List<Integer> identifiers;

	/** The {@link NaoJointInfo} of every joint by its {@link NaoJointID}. */
	protected Map<NaoJointID, NaoJointInfo> jointInfos = new HashMap<NaoJointID, NaoJointInfo>();

	/**
	 * Creates new {@link NaoJointInfo}s for a given {@link Nao}.
	 * 
	 * @param nao
	 *            The {@link Nao}.
	 * @param requestInfos
	 *            If <code>true</code> this {@link NaoJointID} will by itself
	 *            connect to the {@link Nao} and requests its infos. Otherwhise
	 *            they have to be set manually.
	 * @throws NaoUtilException
	 */
	public NaoJointInfos(Nao nao, boolean requestInfos) throws NaoUtilException {

		/* Create the infos. */
		for (NaoJointID id : NaoJointID.values()) {
			jointInfos.put(id, new NaoJointInfo(nao, id, false));
		}
		// end for.

		if (requestInfos) {
			if (identifiers == null)
				initIdentifiers();
			// no else.

			/* Request all the info. */
			Map<String, String> values = NaoUtil.getSensorValues(nao,
					identifiers);

			/* Set the info for all the NaoJointInfo objects. */
			for (String key : values.keySet()) {
				if (key.contains("HeadPitch"))
					setNaoJointInfoValue(jointInfos.get(NaoJointID.HeadPitch),
							key, values.get(key));
				else if (key.contains("HeadYaw"))
					setNaoJointInfoValue(jointInfos.get(NaoJointID.HeadYaw),
							key, values.get(key));
				else if (key.contains("LAnklePitch"))
					setNaoJointInfoValue(
							jointInfos.get(NaoJointID.LAnklePitch), key,
							values.get(key));
				else if (key.contains("LAnkleRoll"))
					setNaoJointInfoValue(jointInfos.get(NaoJointID.LAnkleRoll),
							key, values.get(key));
				else if (key.contains("LElbowRoll"))
					setNaoJointInfoValue(jointInfos.get(NaoJointID.LElbowRoll),
							key, values.get(key));
				else if (key.contains("LElbowYaw"))
					setNaoJointInfoValue(jointInfos.get(NaoJointID.LElbowYaw),
							key, values.get(key));
				else if (key.contains("LHipPitch"))
					setNaoJointInfoValue(jointInfos.get(NaoJointID.LHipPitch),
							key, values.get(key));
				else if (key.contains("LHipRoll"))
					setNaoJointInfoValue(jointInfos.get(NaoJointID.LHipRoll),
							key, values.get(key));
				else if (key.contains("LHipYawPitch"))
					setNaoJointInfoValue(
							jointInfos.get(NaoJointID.LHipYawPitch), key,
							values.get(key));
				else if (key.contains("LKneePitch"))
					setNaoJointInfoValue(jointInfos.get(NaoJointID.LKneePitch),
							key, values.get(key));
				else if (key.contains("LShoulderPitch"))
					setNaoJointInfoValue(
							jointInfos.get(NaoJointID.LShoulderPitch), key,
							values.get(key));
				else if (key.contains("LShoulderRoll"))
					setNaoJointInfoValue(
							jointInfos.get(NaoJointID.LShoulderRoll), key,
							values.get(key));
				else if (key.contains("RAnklePitch"))
					setNaoJointInfoValue(
							jointInfos.get(NaoJointID.RAnklePitch), key,
							values.get(key));
				else if (key.contains("RAnkleRoll"))
					setNaoJointInfoValue(jointInfos.get(NaoJointID.RAnkleRoll),
							key, values.get(key));
				else if (key.contains("RElbowRoll"))
					setNaoJointInfoValue(jointInfos.get(NaoJointID.RElbowRoll),
							key, values.get(key));
				else if (key.contains("RElbowYaw"))
					setNaoJointInfoValue(jointInfos.get(NaoJointID.RElbowYaw),
							key, values.get(key));
				else if (key.contains("RHipPitch"))
					setNaoJointInfoValue(jointInfos.get(NaoJointID.RHipPitch),
							key, values.get(key));
				else if (key.contains("RHipRoll"))
					setNaoJointInfoValue(jointInfos.get(NaoJointID.RHipRoll),
							key, values.get(key));
				else if (key.contains("RKneePitch"))
					setNaoJointInfoValue(jointInfos.get(NaoJointID.RKneePitch),
							key, values.get(key));
				else if (key.contains("RShoulderPitch"))
					setNaoJointInfoValue(
							jointInfos.get(NaoJointID.RShoulderPitch), key,
							values.get(key));
				else if (key.contains("RShoulderRoll"))
					setNaoJointInfoValue(
							jointInfos.get(NaoJointID.RShoulderRoll), key,
							values.get(key));
				else if (key.contains(NaoConstants.TIME_STAMP)) {
					long timestamp = Math.round(Double.parseDouble(values
							.get(key)) * 1000000000);
					for (NaoJointID id : NaoJointID.values())
						jointInfos.get(id).timeStamp = timestamp;
					// end for.
				} else
					throw new NaoUtilException("Unknown sensor identifier: "
							+ key);
			}
		}
		// no else.
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append(NaoJointInfo.getLegend());

		List<NaoJointID> keys = new ArrayList<NaoJointID>(jointInfos.keySet());
		Collections.sort(keys);

		for (NaoJointID id : keys) {
			result.append(jointInfos.get(id) + "\n");
		}
		// end for.

		return result.toString();
	}

	public String getIntendedJointPositions(boolean withLegend) {

		StringBuffer resultLegend = new StringBuffer();
		StringBuffer result = new StringBuffer();

		for (NaoJointID id : NaoJointID.values()) {
			resultLegend.append(id + " | ");
			result.append(jointInfos.get(id).getPositionIntended() + " | ");
		}
		// end for.

		if (withLegend)
			return resultLegend.toString() + "\n" + result.toString();
		else
			return result.toString();
	}

	/**
	 * Returns the {@link NaoJointInfo} for a given {@link NaoJointID}.
	 * 
	 * @param id
	 *            The {@link NaoJointID}.
	 * @return The corresponding {@link NaoJointInfo}.
	 */
	public NaoJointInfo getJointInfo(NaoJointID id) {

		if (id == null)
			throw new IllegalArgumentException("Argument 'id' cannot be null.");
		// no else.

		return jointInfos.get(id);
	}

	/**
	 * Helper method to set a {@link NaoJointInfo} value for a given
	 * {@link NaoJointInfo} that is identified by its sensor name.
	 * 
	 * @param info
	 *            The {@link NaoJointInfo} for which the value shall be set.
	 * @param key
	 *            The sensor name of the value.
	 * @param value
	 *            The value as a String.
	 */
	protected void setNaoJointInfoValue(NaoJointInfo info, String key,
			String value) {
		if (key.contains("ElectricCurrent"))
			info.current = Double.parseDouble(value);
		else if (key.contains("Hardness"))
			info.stiffness = Double.parseDouble(value);
		else if (key.contains("Position/Actuator"))
			info.positionIntended = Double.parseDouble(value);
		else if (key.contains("Position/Sensor"))
			info.position = Double.parseDouble(value);
		else if (key.contains("Temperature"))
			info.temperature = Double.parseDouble(value);
		// no else.
	}

	/**
	 * Helper method to initialize the identifier list.
	 */
	protected void initIdentifiers() {
		identifiers = new ArrayList<Integer>();
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
		result = prime * result
				+ ((jointInfos == null) ? 0 : jointInfos.hashCode());
		return result;
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
		NaoJointInfos other = (NaoJointInfos) obj;
		if (jointInfos == null) {
			if (other.jointInfos != null)
				return false;
		} else if (!jointInfos.equals(other.jointInfos))
			return false;
		return true;
	}

}
