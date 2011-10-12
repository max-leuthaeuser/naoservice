package org.qualitune.naoservice.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.qualitune.naoservice.client.Nao.ALBehaviorManager;
import org.qualitune.naoservice.client.Nao.ALMemory;
import org.qualitune.naoservice.client.Nao.ALMotion;
import org.qualitune.naoservice.client.Nao.ALTextToSpeech;

/**
 * This class provides further utility methods for the {@link Nao} class that
 * cannot be generated from the NaoQi API (i.e., more complex requests).
 * 
 * @author Claas Wilke
 */
public class NaoUtil {

	/** Key used in the {@link JSONObject} to access the return value. */
	protected static final String JSON_RETURN_VALUE_KEY = "returnvalue";

	/** Contains the cached ids of sensor values for {@link Nao}s. */
	protected static List<String> sensorValueIds;

	/**
	 * Reaturns a summary of all motors within the {@link Nao}, their stiffness
	 * and current position as a {@link String}.
	 * 
	 * @param nao
	 *            The {@link Nao} whose summary shall be returned.
	 * @return The summary as a {@link String}.
	 * @throws NaoUtilException
	 *             Thrown, if accessing the summary fails.
	 */
	public static String getActuatorSummary(Nao nao) throws NaoUtilException {
		ALMotion alMotion = nao.createALMotion();

		try {
			return alMotion.getSummary().get(JSON_RETURN_VALUE_KEY).toString();
		} catch (JSONException e) {
			throw new NaoUtilException(
					"Unable to access nao actuator summary.", e);
		}
	}

	/**
	 * Returns the average stiffness of all motors to a given {@link Nao}.
	 * 
	 * @param nao
	 *            The {@link Nao} whose stiffness shall be returned.
	 * @return The average stiffness of all motors. 0.0 means all motors have
	 *         not stiffness. 1.0 means all motors have full stiffness.
	 * @throws IllegalArgumentException
	 */
	public static float getAvgStiffness(Nao nao) {

		if (nao == null)
			throw new IllegalArgumentException("Argument 'nao' cannot be null.");
		// no else.

		ALMotion alMotion = nao.createALMotion();
		JSONArray array;
		float result = 0f;

		try {
			array = (JSONArray) alMotion.getJointNames("Body").get(
					JSON_RETURN_VALUE_KEY);

			List<String> jointNames = jsonArrayToStringList(array);

			for (String jointName : jointNames)
				result += ((JSONArray) alMotion.getStiffnesses(jointName).get(
						JSON_RETURN_VALUE_KEY)).getDouble(0);
			// end for.

			result = result / jointNames.size();
		}

		catch (JSONException e) {
			return -1f;
		}

		return result;
	}

	/**
	 * Returns a {@link NaoJointInfo} for a given {@link Nao} and
	 * {@link NaoJointID}
	 * 
	 * @param nao
	 *            The {@link Nao}.
	 * @param id
	 *            The {@link NaoJointID}.
	 * @return The {@link NaoJointInfo}.
	 * @throws NaoUtilException
	 */
	public static NaoJointInfo getJointInfo(Nao nao, NaoJointID id)
			throws NaoUtilException {

		if (nao == null)
			throw new IllegalArgumentException(
					"The argument 'nao' cannot be null.");
		else if (id == null)
			throw new IllegalArgumentException(
					"The argument 'id' cannot be null.");
		// no else.

		return new NaoJointInfo(nao, id);
	}

	/**
	 * Returns a {@link NaoJointInfos} for a given {@link Nao} and all its
	 * joints using a single request.
	 * 
	 * @param nao
	 *            The {@link Nao}.
	 * @return The {@link NaoJointInfos}.
	 * @throws NaoUtilException
	 */
	public static NaoJointInfos getJointInfos(Nao nao) throws NaoUtilException {
		if (nao == null)
			throw new IllegalArgumentException(
					"The argument 'nao' cannot be null.");
		// no else.

		return new NaoJointInfos(nao, true);
	}

	/**
	 * Returns the values as a {@link String}s for a given {@link String} as a
	 * sensor identifier.
	 * 
	 * @param nao
	 *            The {@link Nao} to read the value.
	 * @param identifier
	 *            The sensor identifier as a {@link String}.
	 * @return The value as a {@link String}.
	 * @throws NaoUtilException
	 *             Thrown, if the sensor value request fails.
	 */
	public static String getSensorValue(Nao nao, String identifier)
			throws NaoUtilException {

		if (nao == null)
			throw new IllegalArgumentException(
					"Argument 'nao' must not be null.");
		else if (identifier == null)
			throw new IllegalArgumentException(
					"Argument 'identifier' must not be null.");
		// no else.

		String result;
		ALMemory alMemory = nao.createALMemory();

		try {
			result = (alMemory.getData(identifier).get(JSON_RETURN_VALUE_KEY))
					.toString();
		}

		catch (JSONException e) {
			throw new NaoUtilException("Request of value '" + identifier
					+ "' failed.", e);
		}

		return result;
	}

	/**
	 * Returns a {@link Map} of values as {@link String}s for a given
	 * {@link List} of sensor identifiers.
	 * 
	 * @param nao
	 *            The {@link Nao} to read the values.
	 * @param identifier
	 *            The sensor identifiers as a {@link List}.
	 * @return The values as a {@link Map}.
	 * @throws NaoUtilException
	 *             Thrown if the request fails.
	 */
	@SuppressWarnings("unchecked")
	public static Map<String, String> getSensorValues(Nao nao,
			List<Integer> identifier) throws NaoUtilException {

		if (nao == null)
			throw new IllegalArgumentException(
					"Argument 'nao' must not be null.");
		else if (identifier == null || identifier.size() == 0)
			throw new IllegalArgumentException(
					"Argument 'identifier' must not be null or empty.");
		// no else.

		Map<String, String> result;

		/* Compute query. */
		StringBuffer ids = new StringBuffer();

		for (int index = 0; index < identifier.size(); index++) {
			if (index > 0)
				ids.append("+");
			// no else.

			ids.append((identifier.get(index) - 1));
		}
		// end for.

		try {
			JSONObject jsonResult = requestAction(nao, "/sensor/multiple/"
					+ ids.toString());

			result = new HashMap<String, String>();
			Iterator<String> keys = (Iterator<String>) jsonResult.keys();

			while (keys.hasNext()) {
				String key = keys.next();
				result.put(key, jsonResult.getString(key));
			}
			// end while.
		}

		catch (JSONException e) {
			throw new NaoUtilException(
					"Request for multiple sensor values failed.", e);
		}

		return result;
	}

	/**
	 * Returns the identifiers of all sensors that can be requested from a Nao
	 * via the method {@link NaoUtil#getSensorValue(Nao, String)}.
	 * 
	 * @throws NaoUtilException
	 *             Thrown, if the request fails.
	 */
	public static List<String> getSensorValueIDs(Nao nao)
			throws NaoUtilException {

		if (nao == null)
			throw new IllegalArgumentException(
					"Argument 'nao' must not be null.");
		// no else.

		ALMemory alMemory = nao.createALMemory();

		try {
			/* Probably Process sensor ids IDs into an array. */
			if (sensorValueIds == null)
				sensorValueIds = jsonArrayToStringList((JSONArray) alMemory
						.getDataListName().get(JSON_RETURN_VALUE_KEY));
			// no else.
		} catch (JSONException e) {
			throw new NaoUtilException("Request for sensor value IDs failed.",
					e);
		}

		return sensorValueIds;
	}

	/**
	 * Lets the given {@link Nao} say the given text.
	 * 
	 * @param nao
	 *            The {@link Nao} that shall say the text.
	 * @param text
	 *            The text to be said.
	 * @return <code>true</code> if executed successfully.
	 */
	public static boolean say(Nao nao, String text) {
		return say(nao, text, new SayParameter[]{});
	}

	/**
	 * Lets the given {@link Nao} say the given text. The text will be encoded to avoid errors with special characters.
	 * The web service on the nao then decodes it. 
	 * 
	 * @param nao The {@link Nao} that shall say the text.
	 * @param text The {@link Nao} that shall say the text.
	 * @param parameters a set of {@link SayParameter}s for passing parameters to adjust the voice of the nao.
	 * @return <code>true</code> if executed successfully.
	 */
	public static boolean say(Nao nao, String text, SayParameter...parameters){
		if (nao == null)
			throw new IllegalArgumentException("Argument 'nao' cannot be null.");
		else if (text == null)
			throw new IllegalArgumentException(
					"Argument 'text' cannot be null.");
		// no else.
		String result = null;
		try {
			result = URLEncoder.encode(text, "UTF-8");
			result = result.replaceAll("\\+", "%20");
		}
		catch (UnsupportedEncodingException ex){
			throw new RuntimeException("UTF-8 not supported", ex);
		}

		ALTextToSpeech alTextToSpeech = nao.createALTextToSpeech();
		if(parameters != null){
			for (SayParameter sayParameter : parameters) {
				alTextToSpeech.setParameter(sayParameter.getParameterName(), sayParameter.getParameterValue());
			}
		}
		JSONObject response = alTextToSpeech.say(result);
		try {
			String ex = (String) response.get("exception");
			if(ex != null && !"".equals(ex)){
				return false;
			}
		} catch (JSONException e) {
			throw new RuntimeException(e);
		}
		return true;
	}

	/**
	 * Sets the stiffness of all motors to a given value.
	 * 
	 * @param nao
	 *            The {@link Nao} whose stiffness shall be set.
	 * @param stiffness
	 *            The stiffness (0.0 = no stiffness, 1.0 = full stiffness).
	 * @return True, if the stiffness has been set successfully.
	 * @throws IllegalArgumentException
	 */
	public static boolean setStiffness(Nao nao, float stiffness) {

		if (nao == null)
			throw new IllegalArgumentException("Argument 'nao' cannot be null.");
		else if (stiffness < 0 || stiffness > 1.0)
			throw new IllegalArgumentException(
					"Argument 'stiffness' must be between 0.0 and 1.0");
		// no else.

		ALMotion alMotion = nao.createALMotion();
		String[] array;

		try {
			String result = (String) alMotion.getJointNames("Body").get(
					JSON_RETURN_VALUE_KEY);
			array = result.substring(2, result.length() - 2).split("', '");

			for (String jointName : array)
				alMotion.setStiffnesses(jointName, "[" + stiffness + "]");
			// end for.
		}

		catch (JSONException e) {
			return false;
		}

		return true;
	}

	/**
	 * Lets the given {@link Nao} stand up, if the <code>SitDown</code> behavior
	 * is deployed on the {@link Nao}.
	 * 
	 * @param nao
	 *            The {@link Nao} that shall sit down.
	 * @return <code>true</code> if the behavior has been executed successfully.
	 */
	public static boolean sitDown(Nao nao) {
		if (nao == null)
			throw new IllegalArgumentException(
					"The argument 'nao' cannot be null.");
		// no else.

		String behavior = "SitDown";
		return runBehavior(nao, behavior);
	}

	/**
	 * Lets the given {@link Nao} stand up, if the <code>StandUp</code> behavior
	 * is deployed on the {@link Nao}.
	 * 
	 * @param nao
	 *            The {@link Nao} that shall stand up.
	 * @return <code>true</code> if the behavior has been executed successfully.
	 */
	public static boolean standUp(Nao nao) {
		if (nao == null)
			throw new IllegalArgumentException(
					"The argument 'nao' cannot be null.");
		// no else.

		String behavior = "StandUp";
		return runBehavior(nao, behavior);
	}

	/**
	 * Starts a profiling thread to continuously profile some sensors of the
	 * {@link Nao}.
	 * 
	 * @param nao
	 *            The {@link Nao} to be profiled.
	 * @param ids
	 *            The IDs of the sensors to be profiled.
	 * @param profilingInterval
	 *            The profiling interval in milliseconds.
	 * @return A session ID to handle this profiling thread.
	 * 
	 *         TODO Test me TODO check arguments
	 */
	public static String startProfilingOfSensors(Nao nao, List<String> ids,
			int profilingInterval) {

		StringBuffer query = new StringBuffer();
		query.append("/profiling/start/");
		query.append(profilingInterval);
		query.append("/");

		boolean first = true;
		for (String id : ids) {
			if (first)
				first = false;
			else
				query.append("+");

			query.append(id);
		}
		// end for.

		return NaoUtil.requestActionWithStringResult(nao, query.toString());
	}

	/**
	 * Stops the profiling of a set of {@link Nao} sensors for a given session
	 * id.
	 * 
	 * @param nao
	 *            The {@link Nao} that is currently profiled.
	 * @param ids
	 *            The IDs of the sensors to be profiled.
	 * @param sessionID
	 *            The session ID for the profiling to be stopped.
	 * 
	 *            TODO Test me TODO check arguments
	 */
	public static Map<Double, List<String>> stopProfilingOfSensors(Nao nao,
			List<String> ids, String sessionID) {

		StringBuffer query = new StringBuffer();
		query.append("/profiling/stop/");
		query.append(sessionID);

		Map<Double, List<String>> result = new HashMap<Double, List<String>>();

		try {
			JSONObject requestResult = requestAction(nao, query.toString());

			List<JSONArray> valuesOfSensors = new ArrayList<JSONArray>(
					ids.size());

			int minLength = Integer.MAX_VALUE;
			for (String id : ids) {
				JSONArray values = requestResult.getJSONArray(id);
				valuesOfSensors.add(values);
				minLength = Math.min(minLength, values.length());
			}
			// end for.

			for (int valueIndex = 0; valueIndex < minLength; valueIndex++) {
				double timeStamp = ((JSONObject) valuesOfSensors.get(0).opt(
						valueIndex)).getDouble("timestamp");
				List<String> values = new ArrayList<String>(
						valuesOfSensors.size());

				for (int sensorIndex = 0; sensorIndex < valuesOfSensors.size(); sensorIndex++) {
					values.add(((JSONObject) valuesOfSensors.get(sensorIndex)
							.opt(valueIndex)).getString("value"));
				}
				// end for.

				result.put(timeStamp, values);
			}
			// end for.

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	/**
	 * Lets the given {@link Nao} walk a given distance.
	 * 
	 * @param nao
	 *            The {@link Nao}.
	 * @param xDistance
	 *            The distance to be walked to the front (negative value means
	 *            backwards) in meters.
	 * @param yDistance
	 *            The distance to be walked to the side (positive means: right,
	 *            negative means: left) in meters.
	 * @return <code>true</code> if method invocation was successful.
	 */
	public static boolean walkTo(Nao nao, float xDistance, float yDistance) {
		if (nao == null)
			throw new IllegalArgumentException(
					"The argument 'nao' cannot be null.");
		else if (xDistance == 0 && yDistance == 0)
			throw new IllegalArgumentException(
					"Either the argument 'xDistance' or 'yDistance' must not be 0.");
		// no else.
		double wayToGo = Math.sqrt(xDistance * xDistance + yDistance
				* yDistance);
		double theta = Math.asin(yDistance / wayToGo);

		if (xDistance > 0 && yDistance == 0)
			theta = 0d;
		else if (xDistance < 0 && yDistance == 0)
			theta = Math.PI;
		// no else.

		if (theta > 3.1415d)
			theta = 3.1415d;
		else if (theta < -3.1415d)
			theta = -3.1415d;
		// no else.

		Math.toDegrees(theta);

		ALMotion alMotion = nao.createALMotion();
		alMotion.walkTo(0f, 0f, (float) -theta);
		alMotion.walkTo((float) wayToGo, 0f, 0f);
		alMotion.walkTo(0f, 0f, (float) theta);

		return true;
	}

	/**
	 * Lets the given {@link Nao} waves hello with its right arm, if the
	 * <code>Hello</code> behavior is deployed on the {@link Nao}.
	 * 
	 * @param nao
	 *            The {@link Nao} that shall play the behavior.
	 * @return <code>true</code> if the behavior has been executed successfully.
	 */
	public static boolean waveHello(Nao nao) {
		if (nao == null)
			throw new IllegalArgumentException(
					"The argument 'nao' cannot be null.");
		// no else.

		String behavior = "Hello";
		return runBehavior(nao, behavior);
	}

	/**
	 * Lets the given {@link Nao} wipe its forhead, if the <code>Wipe</code>
	 * behavior is deployed on the {@link Nao}.
	 * 
	 * @param nao
	 *            The {@link Nao} that shall play the behavior.
	 * @return <code>true</code> if the behavior has been executed successfully.
	 */
	public static boolean wipeForehead(Nao nao) {
		if (nao == null)
			throw new IllegalArgumentException(
					"The argument 'nao' cannot be null.");
		// no else.

		String behavior = "Wipe";
		return runBehavior(nao, behavior);
	}

	/**
	 * Executes a behavior on a given {@link Nao}.
	 * 
	 * @param nao
	 *            The {@link Nao} where the behavior shall be executed.
	 * @param behavior
	 *            The identifier of an behavior that must be installed on the
	 *            {@link Nao}.
	 * @return <code>true</code> if the behavior has been executed successfully.
	 */
	public static boolean runBehavior(Nao nao, String behavior) {
		try {
			ALBehaviorManager alBM = nao.createALBehaviorManager();
			// TODO Why this fails? List<String> behaviors =
			// jsonArrayToStringList((JSONArray) alBM
			// .getInstalledBehaviors().get(JSON_RETURN_VALUE_KEY));
			//
			// if (behaviors.contains(behavior)) {
			JSONObject jsonObject = alBM.runBehavior(behavior);
			return ((String) jsonObject.get("exception")).length() == 0;
			// }
			//
			// else
			// return false;
		}

		catch (Exception e) {
			return false;
		}
	}

	/**
	 * Helper method to extract the values of sensors from an HTML.
	 * 
	 * @param html
	 *            The {@link String} containing the HTML.
	 * @return The found value if any as a {@link List} of {@link String}s.
	 */
	protected static List<String> extractValuesFromItemList(String html) {
		List<String> result = new ArrayList<String>();
		String pattern = "</i>: ";
		String htmlCopy = html + "";

		while (htmlCopy.contains(pattern)) {
			htmlCopy = htmlCopy.substring(htmlCopy.indexOf(pattern)
					+ pattern.length());
			result.add(htmlCopy.substring(0, htmlCopy.indexOf("</li>")));
		}

		return result;
	}

	/**
	 * Helper method to convert a {@link JSONArray} into a {@link List} of
	 * {@link String}s.
	 * 
	 * @param array
	 *            The {@link JSONArray} to be converted
	 * @return A {@link List} of {@link String}s.
	 * @throws JSONException
	 *             Thrown if access to the given {@link JSONArray} fails.
	 */
	protected static List<String> jsonArrayToStringList(JSONArray array)
			throws JSONException {

		List<String> result = new ArrayList<String>();

		for (int index = 0; index < array.length(); index++)
			result.add((String) array.get(index));
		// end for.

		return result;
	}

	/**
	 * Internal helper method to send a request to the Nao web service.
	 * 
	 * @param nao
	 *            The {@link Nao} used for the request.
	 * @param action
	 *            The request as a string. E.g.,
	 *            <code>/proxy/run/ALTextToSpeech/say/'Hello.'</code>.
	 * @throws JSONException
	 */
	protected static JSONObject requestAction(Nao nao, String action)
			throws JSONException {
		return new JSONObject(requestActionWithStringResult(nao, action));
	}

	/**
	 * Internal helper method to send a request to the Nao web service. That
	 * returns in a String rather than in a {@link JSONObject}.
	 * 
	 * @param nao
	 *            The {@link Nao} used for the request.
	 * @param action
	 *            The request as a string. E.g.,
	 *            <code>/proxy/run/ALTextToSpeech/say/'Hello.'</code>.
	 */
	protected static String requestActionWithStringResult(Nao nao, String action) {
		try {
			action = action.replaceAll(" ", "%20");

			URL request = new URL("http://" + nao.ip + ":" + nao.port + action);
			URLConnection response = request.openConnection();
			BufferedReader rd = new BufferedReader(new InputStreamReader(
					response.getInputStream()));

			StringBuilder sb = new StringBuilder();
			int cp;
			while ((cp = rd.read()) != -1) {
				sb.append((char) cp);
			}

			rd.close();
			return sb.toString();
		}

		catch (MalformedURLException e) {
			throw new IllegalStateException("Cannot connect to the Nao.", e);
		}

		catch (IOException e) {
			throw new IllegalStateException("Cannot connect to the Nao.", e);
		}
	}
}
