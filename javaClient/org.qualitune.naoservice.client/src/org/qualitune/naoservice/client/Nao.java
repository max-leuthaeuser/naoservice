package org.qualitune.naoservice.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import org.json.JSONObject;
import org.json.JSONException;

/**
 * Java abstraction layer for Nao humanoid robot. <br />
 * <b>This is automatically generated code. Do not modify it!</b>
 * <p>
 * Simple example how to use this:
 * 
 * <pre>
 * Nao n = new Nao(&quot;192.168.10.221&quot;, 8080);
 * ALMemory almem = n.createALMemory();
 * System.out.println(almem.getBrokerName());
 * </pre>
 * 
 * </p>
 */
public class Nao {
	/** The IP address of the Nao. */
	protected String ip;

	/** The port where the Nao service is running. */
	protected int port;

	/**
	 * Creates a new {@link Nao} for a given IP address and a given port.
	 * 
	 * @param ip
	 *            The IP address of the Nao.
	 * @param port
	 *            The port where the Nao service is running.
	 */
	public Nao(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}

	/**
	 * Returns the IP of this {@link Nao}.
	 * 
	 * @return The IP of this {@link Nao}.
	 */
	public String getIP() {
		return this.ip;
	}

	/**
	 * Returns the port of this {@link Nao}.
	 * 
	 * @return The port of this {@link Nao}.
	 */
	public int getPort() {
		return this.port;
	}

	/**
	 * <summary>The ALAudioDevice module allows other modules to access to the
	 * sound data of the nao's microphones, and to send sound toward its
	 * loudspeakers The way to receive or send the audio data depends whether
	 * the modules are local (dynamic library) or remote (executable).</summary>
	 */
	public class ALAudioDevice {

		/**
		 * <summary> Local Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALAudioDeviceProxy(String[] pbroker) {
			return requestAction("ALAudioDevice/ALAudioDeviceProxy/" + "'"
					+ pbroker + "'");
		}

		/**
		 * <summary> Remote Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALAudioDeviceProxy(String pip, int pport) {
			return requestAction("ALAudioDevice/ALAudioDeviceProxy/" + "'"
					+ pip + "'" + "," + pport);
		}

		/**
		 * <summary> Gets the underlying generic proxy </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getGenericProxy() {
			return requestAction("ALAudioDevice/getGenericProxy/()");
		}

		/**
		 * <summary> Wait for the end of a long running method that was called
		 * using 'post' </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post'
		 * @param timeoutPeriod
		 *            The timeout period in ms. To wait indefinately, use a
		 *            timeoutPeriod of zero. <br />
		 *            <i>Actual SDK return value:</i>True if the timeout period
		 *            terminated. False if the method returned.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject wait(final int id, final int timeoutperiod) {
			return requestAction("ALAudioDevice/wait/" + id + ","
					+ timeoutperiod);
		}

		/**
		 * <summary> stop a long running method that was called using 'post'
		 * </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stop(final int id) {
			return requestAction("ALAudioDevice/stop/" + id);
		}

		/**
		 * <summary> isRunning </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isRunning(final int id) {
			return requestAction("ALAudioDevice/isRunning/" + id);
		}

		/**
		 * <summary> Closes the audio device for capture. You can call this
		 * method if you want to have access to the alsa input buffers in
		 * another program than naoqi while naoqi is running (with a record for
		 * example) </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject closeAudioInputs() {
			return requestAction("ALAudioDevice/closeAudioInputs/()");
		}

		/**
		 * <summary> Closes the audio device for playback. close the audio
		 * device for capture. You can call this method if you want to send
		 * sound to alsa in another program than naoqi while naoqi is running
		 * (with aplay for example) </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject closeAudioOutputs() {
			return requestAction("ALAudioDevice/closeAudioOutputs/()");
		}

		/**
		 * <summary> Disables the computation of the energy of each microphone
		 * signal </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject disableEnergyComputation() {
			return requestAction("ALAudioDevice/disableEnergyComputation/()");
		}

		/**
		 * <summary> Enables the computation of the energy of each microphone
		 * signal </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject enableEnergyComputation() {
			return requestAction("ALAudioDevice/enableEnergyComputation/()");
		}

		/**
		 * <summary> Exits and unregisters the module. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject exit() {
			return requestAction("ALAudioDevice/exit/()");
		}

		/**
		 * <summary> Gets the name of the parent broker. </summary> <br />
		 * <i>Actual SDK return value:</i> The name of the parent broker.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getBrokerName() {
			return requestAction("ALAudioDevice/getBrokerName/()");
		}

		/**
		 * <summary> Returns the energy of the front microphone signal
		 * </summary> <br />
		 * <i>Actual SDK return value:</i> energy of the front microphone signal
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getFrontMicEnergy() {
			return requestAction("ALAudioDevice/getFrontMicEnergy/()");
		}

		/**
		 * <summary> Returns the energy of the left microphone signal </summary> <br />
		 * <i>Actual SDK return value:</i> energy of the left microphone signal
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getLeftMicEnergy() {
			return requestAction("ALAudioDevice/getLeftMicEnergy/()");
		}

		/**
		 * <summary> Retrieves a method's description. </summary>
		 * 
		 * @param methodName
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A structure containing the
		 *            method's description.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodHelp(final String methodname) {
			return requestAction("ALAudioDevice/getMethodHelp/" + "'"
					+ methodname + "'");
		}

		/**
		 * <summary> Retrieves the module's method list. </summary> <br />
		 * <i>Actual SDK return value:</i> An array of method names.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodList() {
			return requestAction("ALAudioDevice/getMethodList/()");
		}

		/**
		 * <summary> Retrieves the module's description. </summary> <br />
		 * <i>Actual SDK return value:</i> A structure describing the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getModuleHelp() {
			return requestAction("ALAudioDevice/getModuleHelp/()");
		}

		/**
		 * <summary> Gets the output sound level of the system. </summary> <br />
		 * <i>Actual SDK return value:</i> outputVolume of the system
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getOutputVolume() {
			return requestAction("ALAudioDevice/getOutputVolume/()");
		}

		/**
		 * <summary> This method returns the specified internal parameter
		 * ('outputSampleRate' or 'inputBufferSize'). The value -1 is returned
		 * if the specified parameter is not valid. </summary>
		 * 
		 * @param pParamName
		 *            Name of the parameter to get ('outputSampleRate' or
		 *            'inputBufferSize'). <br />
		 *            <i>Actual SDK return value:</i> value of the specified
		 *            parameter
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getParameter(final String pparamname) {
			return requestAction("ALAudioDevice/getParameter/" + "'"
					+ pparamname + "'");
		}

		/**
		 * <summary> Returns the energy of the rear microphone signal </summary> <br />
		 * <i>Actual SDK return value:</i> energy of the rear microphone signal
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getRearMicEnergy() {
			return requestAction("ALAudioDevice/getRearMicEnergy/()");
		}

		/**
		 * <summary> Returns the energy of the right microphone signal
		 * </summary> <br />
		 * <i>Actual SDK return value:</i> energy of the right microphone signal
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getRightMicEnergy() {
			return requestAction("ALAudioDevice/getRightMicEnergy/()");
		}

		/**
		 * <summary> Gets the method usage string. This summarise how to use the
		 * method. </summary>
		 * 
		 * @param name
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A string that summarises
		 *            the usage of the method.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getUsage(final String name) {
			return requestAction("ALAudioDevice/getUsage/" + "'" + name + "'");
		}

		/**
		 * <summary> Opens the audio device for capture. If you closed the audio
		 * inputs with the closeAudioInputs method, you must call this method to
		 * be able to access to the sound data of the nao's microphones.
		 * </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject openAudioInputs() {
			return requestAction("ALAudioDevice/openAudioInputs/()");
		}

		/**
		 * <summary> Opens the audio device for playback. If you closed the
		 * audio outputs with the closeAudioOutputs method, you must call this
		 * method to ear or send sound onto the nao's loudspeakers. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject openAudioOutputs() {
			return requestAction("ALAudioDevice/openAudioOutputs/()");
		}

		/**
		 * <summary> Just a ping. Always returns true </summary> <br />
		 * <i>Actual SDK return value:</i> returns true
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ping() {
			return requestAction("ALAudioDevice/ping/()");
		}

		/**
		 * <summary> Play a sine wave which specified caracteristics. </summary>
		 * 
		 * @param frequence
		 *            Frequence in Hertz
		 * @param gain
		 *            Volume Gain between 0 and 100
		 * @param pan
		 *            Stereo Pan set to either {-1,0,+1}
		 * @param duration
		 *            Duration of the sine wave in seconds
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject playSine(final int frequence, final int gain,
				final int pan, final int duration) {
			return requestAction("ALAudioDevice/playSine/" + frequence + ","
					+ gain + "," + pan + "," + duration);
		}

		/**
		 * <summary> reset ALSA driver. Use this method only when no audio
		 * module is subscribed to ALAudioDevice </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject resetAudio() {
			return requestAction("ALAudioDevice/resetAudio/()");
		}

		/**
		 * <summary> This function allows a local module to send sound onto the
		 * nao's loudpseakers </summary>
		 * 
		 * @param nbOfFrames
		 *            Number of 16 bits samples per channel to send.
		 * @param pBuffer
		 *            Buffer to send <br />
		 *            <i>Actual SDK return value:</i> True if the operation is
		 *            successfull - False otherwise
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject sendLocalBufferToOutput(final int nbofframes,
				final int pbuffer) {
			return requestAction("ALAudioDevice/sendLocalBufferToOutput/"
					+ nbofframes + "," + pbuffer);
		}

		/**
		 * <summary> This function allows a remote module to send sound onto the
		 * nao's loudpseakers </summary>
		 * 
		 * @param nbOfFrames
		 *            Number of 16 bits samples per channel to send.
		 * @param pBuffer
		 *            Buffer to send <br />
		 *            <i>Actual SDK return value:</i> True if the operation is
		 *            successfull - False otherwise
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject sendRemoteBufferToOutput(final int nbofframes,
				final String pbuffer) {
			return requestAction("ALAudioDevice/sendRemoteBufferToOutput/"
					+ nbofframes + "+'" + pbuffer + "'");
		}

		/**
		 * <summary> This method allows to send sound samples contained in a
		 * sound file at the input of ALAudioDevice, instead of the nao's
		 * microphones sound data The sound file must be a .wav file containing
		 * 16bits / 4 channels / interleaved samples. Once the file has been
		 * read, microphones sound data will again taken as input </summary>
		 * 
		 * @param pFileName
		 *            Name of the input file.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setFileAsInput(final String pfilename) {
			return requestAction("ALAudioDevice/setFileAsInput/" + "'"
					+ pfilename + "'");
		}

		/**
		 * <summary> Sets the output sound level of the system. </summary>
		 * 
		 * @param volume
		 *            Volume [0-100].
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setOutputVolume(final int volume) {
			return requestAction("ALAudioDevice/setOutputVolume/" + volume);
		}

		/**
		 * <summary> This method sets the specified internal parameter
		 * ('outputSampleRate' or 'inputBufferSize') </summary>
		 * 
		 * @param pParamName
		 *            Name of the parameter to set ('outputSampleRate' or
		 *            'inputBufferSize').
		 * @param pParamValue
		 *            The value to which the specified parameter should be set.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setParameter(final String pparamname,
				final int pparamvalue) {
			return requestAction("ALAudioDevice/setParameter/" + "'"
					+ pparamname + "'" + "," + pparamvalue);
		}

		/**
		 * <summary> This method allows to record the signal collected on the
		 * nao's microphones. You can choose to record only the front microphone
		 * in a ogg file, or the 4 microphones in a wav file. In this last case
		 * the format of the file is 4 channels, 16 bits little endian, 48 KHz
		 * </summary>
		 * 
		 * @param pFileName
		 *            Name of the file where to record the sound.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject startMicrophonesRecording(final String pfilename) {
			return requestAction("ALAudioDevice/startMicrophonesRecording/"
					+ "'" + pfilename + "'");
		}

		/**
		 * <summary> This method calls a procedure to stop and clear the audio
		 * output buffers. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stopAudioOut() {
			return requestAction("ALAudioDevice/stopAudioOut/()");
		}

		/**
		 * <summary> This method stops the recording of the sound collected by
		 * the microphones. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stopMicrophonesRecording() {
			return requestAction("ALAudioDevice/stopMicrophonesRecording/()");
		}

		/**
		 * <summary> This function allows a remote module to subscribe to the
		 * ALAudioDevice module. </summary>
		 * 
		 * @param pModule
		 *            Name of the remote module <br />
		 *            <i>Actual SDK return value:</i> True if module has
		 *            subscribed successfully - False otherwise
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject subscribeRemoteModule(final String pmodule) {
			return requestAction("ALAudioDevice/subscribeRemoteModule/" + "'"
					+ pmodule + "'");
		}

		/**
		 * <summary> This function unsubscribes a remote module (identified by
		 * its name) from the ALAudioDevice module </summary>
		 * 
		 * @param pModule
		 *            Name of the remote module to unsuscribe from ALAudioDevice <br />
		 *            <i>Actual SDK return value:</i> True if module has been
		 *            unsubscribed successfully - False otherwise
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject unSubscribeRemoteModule(final String pmodule) {
			return requestAction("ALAudioDevice/unSubscribeRemoteModule/" + "'"
					+ pmodule + "'");
		}

		/**
		 * <summary> Returns the version of the module. </summary> <br />
		 * <i>Actual SDK return value:</i> A string containing the version of
		 * the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject version() {
			return requestAction("ALAudioDevice/version/()");
		}
	}

	public ALAudioDevice createALAudioDevice() {
		return new ALAudioDevice();
	}

	/**
	 * <summary>This module allows to play wav and mp3 files on NAO</summary>
	 */
	public class ALAudioPlayer {

		/**
		 * <summary> Local Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALAudioPlayerProxy(String[] pbroker) {
			return requestAction("ALAudioPlayer/ALAudioPlayerProxy/" + "'"
					+ pbroker + "'");
		}

		/**
		 * <summary> Remote Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALAudioPlayerProxy(String pip, int pport) {
			return requestAction("ALAudioPlayer/ALAudioPlayerProxy/" + "'"
					+ pip + "'" + "," + pport);
		}

		/**
		 * <summary> Gets the underlying generic proxy </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getGenericProxy() {
			return requestAction("ALAudioPlayer/getGenericProxy/()");
		}

		/**
		 * <summary> Wait for the end of a long running method that was called
		 * using 'post' </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post'
		 * @param timeoutPeriod
		 *            The timeout period in ms. To wait indefinately, use a
		 *            timeoutPeriod of zero. <br />
		 *            <i>Actual SDK return value:</i>True if the timeout period
		 *            terminated. False if the method returned.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject wait(final int id, final int timeoutperiod) {
			return requestAction("ALAudioPlayer/wait/" + id + ","
					+ timeoutperiod);
		}

		/**
		 * <summary> stop a long running method that was called using 'post'
		 * </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stop(final int id) {
			return requestAction("ALAudioPlayer/stop/" + id);
		}

		/**
		 * <summary> isRunning </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isRunning(final int id) {
			return requestAction("ALAudioPlayer/isRunning/" + id);
		}

		/**
		 * <summary> Exits and unregisters the module. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject exit() {
			return requestAction("ALAudioPlayer/exit/()");
		}

		/**
		 * <summary> Gets the name of the parent broker. </summary> <br />
		 * <i>Actual SDK return value:</i> The name of the parent broker.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getBrokerName() {
			return requestAction("ALAudioPlayer/getBrokerName/()");
		}

		/**
		 * <summary> Returns the master volume of the player </summary> <br />
		 * <i>Actual SDK return value:</i> Volume of the master - range 0.0 to
		 * 1.0.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMasterVolume() {
			return requestAction("ALAudioPlayer/getMasterVolume/()");
		}

		/**
		 * <summary> Retrieves a method's description. </summary>
		 * 
		 * @param methodName
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A structure containing the
		 *            method's description.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodHelp(final String methodname) {
			return requestAction("ALAudioPlayer/getMethodHelp/" + "'"
					+ methodname + "'");
		}

		/**
		 * <summary> Retrieves the module's method list. </summary> <br />
		 * <i>Actual SDK return value:</i> An array of method names.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodList() {
			return requestAction("ALAudioPlayer/getMethodList/()");
		}

		/**
		 * <summary> Retrieves the module's description. </summary> <br />
		 * <i>Actual SDK return value:</i> A structure describing the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getModuleHelp() {
			return requestAction("ALAudioPlayer/getModuleHelp/()");
		}

		/**
		 * <summary> Gets the method usage string. This summarise how to use the
		 * method. </summary>
		 * 
		 * @param name
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A string that summarises
		 *            the usage of the method.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getUsage(final String name) {
			return requestAction("ALAudioPlayer/getUsage/" + "'" + name + "'");
		}

		/**
		 * <summary> Returns the volume of the player </summary> <br />
		 * <i>Actual SDK return value:</i> Volume of the player - range 0.0 to
		 * 1.0.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getVolume() {
			return requestAction("ALAudioPlayer/getVolume/()");
		}

		/**
		 * <summary> Goes to a given position in a file which is playing.
		 * </summary>
		 * 
		 * @param playId
		 *            Id of the process which is playing the file
		 * @param position
		 *            Position in the file (in second)
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject goTo(final int playid, final float position) {
			return requestAction("ALAudioPlayer/goTo/" + playid + ","
					+ position);
		}

		/**
		 * <summary> Loads a file for ulterior playback </summary>
		 * 
		 * @param fileName
		 *            Path of the sound file (either mp3 or wav) <br />
		 *            <i>Actual SDK return value:</i> Id of the file which has
		 *            been loaded. This file can then be played with the play
		 *            function
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject loadFile(final String filename) {
			return requestAction("ALAudioPlayer/loadFile/" + "'" + filename
					+ "'");
		}

		/**
		 * <summary> Pause a play back </summary>
		 * 
		 * @param id
		 *            Id of the process that is playing the file you want to put
		 *            in pause
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject pause(final int id) {
			return requestAction("ALAudioPlayer/pause/" + id);
		}

		/**
		 * <summary> Just a ping. Always returns true </summary> <br />
		 * <i>Actual SDK return value:</i> returns true
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ping() {
			return requestAction("ALAudioPlayer/ping/()");
		}

		/**
		 * <summary> Starts the playback of a file preloaded with the loadFile
		 * function.. Asynchronous. </summary>
		 * 
		 * @param id
		 *            Id returned by the loadFile function <br />
		 *            <i>Actual SDK return value:</i> Id of the task. Can be
		 *            used to interrupt it.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject play(final int id) {
			return requestAction("ALAudioPlayer/play/" + id);
		}

		/**
		 * <summary> Starts the playback of a file preloaded with the loadFile
		 * function, with specific volume and audio balance. Asynchronous.
		 * </summary>
		 * 
		 * @param id
		 *            Id returned by the loadFile function
		 * @param volume
		 *            volume of the sound file (must be between 0.0 and 1.0)
		 * @param pan
		 *            audio balance of the sound file (-1.0 : left / 1.0 :
		 *            right) <br />
		 *            <i>Actual SDK return value:</i> Id of the task. Can be
		 *            used to interrupt it.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject play(final int id, final float volume, final float pan) {
			return requestAction("ALAudioPlayer/play/" + id + "," + volume
					+ "," + pan);
		}

		/**
		 * <summary> Plays a wav or mp3 file. Asynchronous. </summary>
		 * 
		 * @param fileName
		 *            Path of the sound file <br />
		 *            <i>Actual SDK return value:</i> Id of the task. Can be
		 *            used to interrupt it.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject playFile(final String filename) {
			return requestAction("ALAudioPlayer/playFile/" + "'" + filename
					+ "'");
		}

		/**
		 * <summary> Plays a wav or mp3 file, with specific volume and audio
		 * balance. Asynchronous. </summary>
		 * 
		 * @param fileName
		 *            Path of the sound file
		 * @param volume
		 *            volume of the sound file (must be between 0.0 and 1.0)
		 * @param pan
		 *            audio balance of the sound file (-1.0 : left / 1.0 : right
		 *            / 0.0 : centered) <br />
		 *            <i>Actual SDK return value:</i> Id of the task. Can be
		 *            used to interrupt it.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject playFile(final String filename, final float volume,
				final float pan) {
			return requestAction("ALAudioPlayer/playFile/" + "'" + filename
					+ "'" + "," + volume + "," + pan);
		}

		/**
		 * <summary> Plays a wav or mp3 file from a given position in the file..
		 * Asynchronous. </summary>
		 * 
		 * @param fileName
		 *            Name of the sound file
		 * @param position
		 *            Position in second where the playing has to begin <br />
		 *            <i>Actual SDK return value:</i> Id of the task. Can be
		 *            used to interrupt it.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject playFileFromPosition(final String filename,
				final float position) {
			return requestAction("ALAudioPlayer/playFileFromPosition/" + "'"
					+ filename + "'" + "," + position);
		}

		/**
		 * <summary> Plays a wav or mp3 file from a given position in the file,
		 * with specific volume and audio balance. Asynchronous. </summary>
		 * 
		 * @param fileName
		 *            Name of the sound file
		 * @param position
		 *            Position in second where the playing has to begin
		 * @param volume
		 *            volume of the sound file (must be between 0.0 and 1.0)
		 * @param pan
		 *            audio balance of the sound file (-1.0 : left / 1.0 :
		 *            right) <br />
		 *            <i>Actual SDK return value:</i> Id of the task. Can be
		 *            used to interrupt it.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject playFileFromPosition(final String filename,
				final float position, final float volume, final float pan) {
			return requestAction("ALAudioPlayer/playFileFromPosition/" + "'"
					+ filename + "'" + "," + position + "," + volume + ","
					+ pan);
		}

		/**
		 * <summary> Plays a wav or mp3 file in loop. Asynchronous. </summary>
		 * 
		 * @param fileName
		 *            Path of the sound file <br />
		 *            <i>Actual SDK return value:</i> Id of the task. Can be
		 *            used to interrupt it.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject playFileInLoop(final String filename) {
			return requestAction("ALAudioPlayer/playFileInLoop/" + "'"
					+ filename + "'");
		}

		/**
		 * <summary> Plays a wav or mp3 file in loop, with specific volume and
		 * audio balance. Asynchronous. </summary>
		 * 
		 * @param fileName
		 *            Path of the sound file
		 * @param volume
		 *            volume of the sound file (must be between 0.0 and 1.0)
		 * @param pan
		 *            audio balance of the sound file (-1.0 : left / 1.0 :
		 *            right) <br />
		 *            <i>Actual SDK return value:</i> Id of the task. Can be
		 *            used to interrupt it.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject playFileInLoop(final String filename,
				final float volume, final float pan) {
			return requestAction("ALAudioPlayer/playFileInLoop/" + "'"
					+ filename + "'" + "," + volume + "," + pan);
		}

		/**
		 * <summary> Starts the playback in loop of a file preloaded with the
		 * loadFile function. Asynchronous. </summary>
		 * 
		 * @param fileName
		 *            Path of the sound file <br />
		 *            <i>Actual SDK return value:</i> Id of the task. Can be
		 *            used to interrupt it.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject playInLoop(final int filename) {
			return requestAction("ALAudioPlayer/playInLoop/" + filename);
		}

		/**
		 * <summary> Plays a wav or mp3 file in loop, with specific volume and
		 * audio balance. Asynchronous. </summary>
		 * 
		 * @param fileName
		 *            Path of the sound file
		 * @param volume
		 *            volume of the sound file (must be between 0.0 and 1.0)
		 * @param pan
		 *            audio balance of the sound file (-1.0 : left / 1.0 :
		 *            right) <br />
		 *            <i>Actual SDK return value:</i> Id of the task. Can be
		 *            used to interrupt it.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject playInLoop(final int filename, final float volume,
				final float pan) {
			return requestAction("ALAudioPlayer/playInLoop/" + filename + ","
					+ volume + "," + pan);
		}

		/**
		 * <summary> Sets the master volume of the player </summary>
		 * 
		 * @param volume
		 *            Volume - range 0.0 to 1.0
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setMasterVolume(final float volume) {
			return requestAction("ALAudioPlayer/setMasterVolume/" + volume);
		}

		/**
		 * <summary> sets the audio panorama : -1 for left speaker / 1 for right
		 * speaker </summary>
		 * 
		 * @param arg1
		 *            arg
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setPanorama(final float arg1) {
			return requestAction("ALAudioPlayer/setPanorama/" + arg1);
		}

		/**
		 * <summary> Sets the volume of the player </summary>
		 * 
		 * @param id
		 *            Id of the process that is playing the file you want to put
		 *            louder or less loud
		 * @param volume
		 *            Volume - range 0.0 to 1.0
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setVolume(final int id, final float volume) {
			return requestAction("ALAudioPlayer/setVolume/" + id + "," + volume);
		}

		/**
		 * <summary> Stops all the files that are currently playing. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stopAll() {
			return requestAction("ALAudioPlayer/stopAll/()");
		}

		/**
		 * <summary> unloads all the files already loaded. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject unloadAllFiles() {
			return requestAction("ALAudioPlayer/unloadAllFiles/()");
		}

		/**
		 * <summary> unloads a file previously loaded with the loadFile function
		 * </summary>
		 * 
		 * @param id
		 *            Id returned by the loadFile function
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject unloadFile(final int id) {
			return requestAction("ALAudioPlayer/unloadFile/" + id);
		}

		/**
		 * <summary> Returns the version of the module. </summary> <br />
		 * <i>Actual SDK return value:</i> A string containing the version of
		 * the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject version() {
			return requestAction("ALAudioPlayer/version/()");
		}
	}

	public ALAudioPlayer createALAudioPlayer() {
		return new ALAudioPlayer();
	}

	/**
	 * <summary>This module computes the position (azimuth, elevation) of a
	 * sound source detected by ALSoundDetection.</summary>
	 */
	public class ALAudioSourceLocalization {

		/**
		 * <summary> Local Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALAudioSourceLocalizationProxy(String[] pbroker) {
			return requestAction("ALAudioSourceLocalization/ALAudioSourceLocalizationProxy/"
					+ "'" + pbroker + "'");
		}

		/**
		 * <summary> Remote Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALAudioSourceLocalizationProxy(String pip, int pport) {
			return requestAction("ALAudioSourceLocalization/ALAudioSourceLocalizationProxy/"
					+ "'" + pip + "'" + "," + pport);
		}

		/**
		 * <summary> Gets the underlying generic proxy </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getGenericProxy() {
			return requestAction("ALAudioSourceLocalization/getGenericProxy/()");
		}

		/**
		 * <summary> Wait for the end of a long running method that was called
		 * using 'post' </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post'
		 * @param timeoutPeriod
		 *            The timeout period in ms. To wait indefinately, use a
		 *            timeoutPeriod of zero. <br />
		 *            <i>Actual SDK return value:</i>True if the timeout period
		 *            terminated. False if the method returned.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject wait(final int id, final int timeoutperiod) {
			return requestAction("ALAudioSourceLocalization/wait/" + id + ","
					+ timeoutperiod);
		}

		/**
		 * <summary> stop a long running method that was called using 'post'
		 * </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stop(final int id) {
			return requestAction("ALAudioSourceLocalization/stop/" + id);
		}

		/**
		 * <summary> isRunning </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isRunning(final int id) {
			return requestAction("ALAudioSourceLocalization/isRunning/" + id);
		}

		/**
		 * <summary> Exits and unregisters the module. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject exit() {
			return requestAction("ALAudioSourceLocalization/exit/()");
		}

		/**
		 * <summary> Gets the name of the parent broker. </summary> <br />
		 * <i>Actual SDK return value:</i> The name of the parent broker.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getBrokerName() {
			return requestAction("ALAudioSourceLocalization/getBrokerName/()");
		}

		/**
		 * <summary> Gets the current period. </summary> <br />
		 * <i>Actual SDK return value:</i> Refresh period (in milliseconds).
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getCurrentPeriod() {
			return requestAction("ALAudioSourceLocalization/getCurrentPeriod/()");
		}

		/**
		 * <summary> Gets the current precision. </summary> <br />
		 * <i>Actual SDK return value:</i> Precision of the extractor.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getCurrentPrecision() {
			return requestAction("ALAudioSourceLocalization/getCurrentPrecision/()");
		}

		/**
		 * <summary> Retrieves a method's description. </summary>
		 * 
		 * @param methodName
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A structure containing the
		 *            method's description.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodHelp(final String methodname) {
			return requestAction("ALAudioSourceLocalization/getMethodHelp/"
					+ "'" + methodname + "'");
		}

		/**
		 * <summary> Retrieves the module's method list. </summary> <br />
		 * <i>Actual SDK return value:</i> An array of method names.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodList() {
			return requestAction("ALAudioSourceLocalization/getMethodList/()");
		}

		/**
		 * <summary> Retrieves the module's description. </summary> <br />
		 * <i>Actual SDK return value:</i> A structure describing the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getModuleHelp() {
			return requestAction("ALAudioSourceLocalization/getModuleHelp/()");
		}

		/**
		 * <summary> Gets the period for a specific subscription. </summary>
		 * 
		 * @param name
		 *            Name of the module which has subscribed. <br />
		 *            <i>Actual SDK return value:</i> Refresh period (in
		 *            milliseconds).
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMyPeriod(final String name) {
			return requestAction("ALAudioSourceLocalization/getMyPeriod/" + "'"
					+ name + "'");
		}

		/**
		 * <summary> Gets the precision for a specific subscription. </summary>
		 * 
		 * @param name
		 *            name of the module which has subscribed <br />
		 *            <i>Actual SDK return value:</i> precision of the extractor
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMyPrecision(final String name) {
			return requestAction("ALAudioSourceLocalization/getMyPrecision/"
					+ "'" + name + "'");
		}

		/**
		 * <summary> Get the list of values updated in ALMemory. </summary> <br />
		 * <i>Actual SDK return value:</i> Array of values updated by this
		 * extractor in ALMemory
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getOutputNames() {
			return requestAction("ALAudioSourceLocalization/getOutputNames/()");
		}

		/**
		 * <summary> Gets the parameters given by the module. </summary> <br />
		 * <i>Actual SDK return value:</i> Array of names and parameters of all
		 * subscribers.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getSubscribersInfo() {
			return requestAction("ALAudioSourceLocalization/getSubscribersInfo/()");
		}

		/**
		 * <summary> Gets the method usage string. This summarise how to use the
		 * method. </summary>
		 * 
		 * @param name
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A string that summarises
		 *            the usage of the method.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getUsage(final String name) {
			return requestAction("ALAudioSourceLocalization/getUsage/" + "'"
					+ name + "'");
		}

		/**
		 * <summary> Just a ping. Always returns true </summary> <br />
		 * <i>Actual SDK return value:</i> returns true
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ping() {
			return requestAction("ALAudioSourceLocalization/ping/()");
		}

		/**
		 * <summary> enable/disable the printing of some debug information
		 * </summary>
		 * 
		 * @param bSetOrUnset
		 *            enable the functionnality when true.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setDebugMode(final boolean bsetorunset) {
			return requestAction("ALAudioSourceLocalization/setDebugMode/"
					+ bsetorunset);
		}

		/**
		 * <summary> Set the specified parameter. </summary>
		 * 
		 * @param parameter
		 *            Name of the parameter. \"Sensibility\" between 0 and 1 to
		 *            adjust the capacity of NAO to locate quiet sounds.
		 *            \"EnergyComputation\" (1 or 0) that activates the
		 *            computation of the located source signal energy. This
		 *            energy is added in the
		 *            \"ALAudioSourceLocalization/SoundLocated\" ALMemory key.
		 * @param value
		 *            \"Sensibility\" : a float in [0,1]. \"EnergyComputation\"
		 *            : (1 or 0).
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setParameter(final String parameter,
				final String value) {
			return requestAction("ALAudioSourceLocalization/setParameter/"
					+ "'" + parameter + "'" + "+'" + value + "'");
		}

		/**
		 * <summary> Subscribes to the extractor. This causes the extractor to
		 * start writing information to memory using the keys described by
		 * getOutputNames(). These can be accessed in memory using
		 * ALMemory.getData(\"keyName\"). In many cases you can avoid calling
		 * subscribe on the extractor by just calling
		 * ALMemory.subscribeToEvent() supplying a callback method. This will
		 * automatically subscribe to the extractor for you. </summary>
		 * 
		 * @param name
		 *            Name of the module which subscribes.
		 * @param period
		 *            Refresh period (in milliseconds) if relevant.
		 * @param precision
		 *            Precision of the extractor if relevant.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject subscribe(final String name, final int period,
				final float precision) {
			return requestAction("ALAudioSourceLocalization/subscribe/" + "'"
					+ name + "'" + "," + period + "," + precision);
		}

		/**
		 * <summary> Subscribes to the extractor. This causes the extractor to
		 * start writing information to memory using the keys described by
		 * getOutputNames(). These can be accessed in memory using
		 * ALMemory.getData(\"keyName\"). In many cases you can avoid calling
		 * subscribe on the extractor by just calling
		 * ALMemory.subscribeToEvent() supplying a callback method. This will
		 * automatically subscribe to the extractor for you. </summary>
		 * 
		 * @param name
		 *            Name of the module which subscribes.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject subscribe(final String name) {
			return requestAction("ALAudioSourceLocalization/subscribe/" + "'"
					+ name + "'");
		}

		/**
		 * <summary> Unsubscribes from the extractor. </summary>
		 * 
		 * @param name
		 *            Name of the module which had subscribed.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject unsubscribe(final String name) {
			return requestAction("ALAudioSourceLocalization/unsubscribe/" + "'"
					+ name + "'");
		}

		/**
		 * <summary> Updates the period if relevant. </summary>
		 * 
		 * @param name
		 *            Name of the module which has subscribed.
		 * @param period
		 *            Refresh period (in milliseconds).
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject updatePeriod(final String name, final int period) {
			return requestAction("ALAudioSourceLocalization/updatePeriod/"
					+ "'" + name + "'" + "," + period);
		}

		/**
		 * <summary> Updates the precision if relevant. </summary>
		 * 
		 * @param name
		 *            Name of the module which has subscribed.
		 * @param precision
		 *            Precision of the extractor.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject updatePrecision(final String name,
				final float precision) {
			return requestAction("ALAudioSourceLocalization/updatePrecision/"
					+ "'" + name + "'" + "," + precision);
		}

		/**
		 * <summary> Returns the version of the module. </summary> <br />
		 * <i>Actual SDK return value:</i> A string containing the version of
		 * the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject version() {
			return requestAction("ALAudioSourceLocalization/version/()");
		}
	}

	public ALAudioSourceLocalization createALAudioSourceLocalization() {
		return new ALAudioSourceLocalization();
	}

	/**
	 * <summary>This module is intended to manage behaviors.</summary>
	 */
	public class ALBehaviorManager {

		/**
		 * <summary> Local Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALBehaviorManagerProxy(String[] pbroker) {
			return requestAction("ALBehaviorManager/ALBehaviorManagerProxy/"
					+ "'" + pbroker + "'");
		}

		/**
		 * <summary> Remote Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALBehaviorManagerProxy(String pip, int pport) {
			return requestAction("ALBehaviorManager/ALBehaviorManagerProxy/"
					+ "'" + pip + "'" + "," + pport);
		}

		/**
		 * <summary> Gets the underlying generic proxy </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getGenericProxy() {
			return requestAction("ALBehaviorManager/getGenericProxy/()");
		}

		/**
		 * <summary> Wait for the end of a long running method that was called
		 * using 'post' </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post'
		 * @param timeoutPeriod
		 *            The timeout period in ms. To wait indefinately, use a
		 *            timeoutPeriod of zero. <br />
		 *            <i>Actual SDK return value:</i>True if the timeout period
		 *            terminated. False if the method returned.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject wait(final int id, final int timeoutperiod) {
			return requestAction("ALBehaviorManager/wait/" + id + ","
					+ timeoutperiod);
		}

		/**
		 * <summary> stop a long running method that was called using 'post'
		 * </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stop(final int id) {
			return requestAction("ALBehaviorManager/stop/" + id);
		}

		/**
		 * <summary> isRunning </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isRunning(final int id) {
			return requestAction("ALBehaviorManager/isRunning/" + id);
		}

		/**
		 * <summary> Set the given behavior as default </summary>
		 * 
		 * @param name
		 *            The behavior name
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject addDefaultBehavior(final String name) {
			return requestAction("ALBehaviorManager/addDefaultBehavior/" + "'"
					+ name + "'");
		}

		/**
		 * <summary> Exits and unregisters the module. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject exit() {
			return requestAction("ALBehaviorManager/exit/()");
		}

		/**
		 * <summary> Gets the name of the parent broker. </summary> <br />
		 * <i>Actual SDK return value:</i> The name of the parent broker.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getBrokerName() {
			return requestAction("ALBehaviorManager/getBrokerName/()");
		}

		/**
		 * <summary> Get default behaviors </summary> <br />
		 * <i>Actual SDK return value:</i> Return default behaviors
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getDefaultBehaviors() {
			return requestAction("ALBehaviorManager/getDefaultBehaviors/()");
		}

		/**
		 * <summary> Get installed behaviors names </summary> <br />
		 * <i>Actual SDK return value:</i> Returns the behaviors list.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getInstalledBehaviors() {
			return requestAction("ALBehaviorManager/getInstalledBehaviors/()");
		}

		/**
		 * <summary> Retrieves a method's description. </summary>
		 * 
		 * @param methodName
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A structure containing the
		 *            method's description.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodHelp(final String methodname) {
			return requestAction("ALBehaviorManager/getMethodHelp/" + "'"
					+ methodname + "'");
		}

		/**
		 * <summary> Retrieves the module's method list. </summary> <br />
		 * <i>Actual SDK return value:</i> An array of method names.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodList() {
			return requestAction("ALBehaviorManager/getMethodList/()");
		}

		/**
		 * <summary> Retrieves the module's description. </summary> <br />
		 * <i>Actual SDK return value:</i> A structure describing the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getModuleHelp() {
			return requestAction("ALBehaviorManager/getModuleHelp/()");
		}

		/**
		 * <summary> Get running behaviors </summary> <br />
		 * <i>Actual SDK return value:</i> Return running behaviors
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getRunningBehaviors() {
			return requestAction("ALBehaviorManager/getRunningBehaviors/()");
		}

		/**
		 * <summary> Gets the method usage string. This summarise how to use the
		 * method. </summary>
		 * 
		 * @param name
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A string that summarises
		 *            the usage of the method.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getUsage(final String name) {
			return requestAction("ALBehaviorManager/getUsage/" + "'" + name
					+ "'");
		}

		/**
		 * <summary> Tell if supplied name corresponds to a valid behavior
		 * </summary>
		 * 
		 * @param name
		 *            The behavior directory name <br />
		 *            <i>Actual SDK return value:</i> Returns true if it is a
		 *            valid behavior
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isBehaviorInstalled(final String name) {
			return requestAction("ALBehaviorManager/isBehaviorInstalled/" + "'"
					+ name + "'");
		}

		/**
		 * <summary> Tell if supplied name corresponds to a running behavior
		 * </summary>
		 * 
		 * @param name
		 *            The behavior directory name <br />
		 *            <i>Actual SDK return value:</i> Returns true if it is a
		 *            running behavior
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isBehaviorRunning(final String name) {
			return requestAction("ALBehaviorManager/isBehaviorRunning/" + "'"
					+ name + "'");
		}

		/**
		 * <summary> Just a ping. Always returns true </summary> <br />
		 * <i>Actual SDK return value:</i> returns true
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ping() {
			return requestAction("ALBehaviorManager/ping/()");
		}

		/**
		 * <summary> Play default behaviors </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject playDefaultProject() {
			return requestAction("ALBehaviorManager/playDefaultProject/()");
		}

		/**
		 * <summary> Load a behavior from its directory name </summary>
		 * 
		 * @param name
		 *            The behavior directory name <br />
		 *            <i>Actual SDK return value:</i> Returns true if it was
		 *            successfully loaded.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject preloadBehavior(final String name) {
			return requestAction("ALBehaviorManager/preloadBehavior/" + "'"
					+ name + "'");
		}

		/**
		 * <summary> Remove a behavior from the filesystem </summary>
		 * 
		 * @param name
		 *            The behavior directory name <br />
		 *            <i>Actual SDK return value:</i> Return true if succeeded,
		 *            else false
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject removeBehavior(final String name) {
			return requestAction("ALBehaviorManager/removeBehavior/" + "'"
					+ name + "'");
		}

		/**
		 * <summary> Remove the given behavior from the default behaviors
		 * </summary>
		 * 
		 * @param name
		 *            The behavior directory name
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject removeDefaultBehavior(final String name) {
			return requestAction("ALBehaviorManager/removeDefaultBehavior/"
					+ "'" + name + "'");
		}

		/**
		 * <summary> Run a behavior </summary>
		 * 
		 * @param name
		 *            The behavior directory name
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject runBehavior(final String name) {
			return requestAction("ALBehaviorManager/runBehavior/" + "'" + name
					+ "'");
		}

		/**
		 * <summary> Stop all behaviors </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stopAllBehaviors() {
			return requestAction("ALBehaviorManager/stopAllBehaviors/()");
		}

		/**
		 * <summary> Stop a behavior </summary>
		 * 
		 * @param name
		 *            The behavior directory name
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stopBehavior(final String name) {
			return requestAction("ALBehaviorManager/stopBehavior/" + "'" + name
					+ "'");
		}

		/**
		 * <summary> Returns the version of the module. </summary> <br />
		 * <i>Actual SDK return value:</i> A string containing the version of
		 * the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject version() {
			return requestAction("ALBehaviorManager/version/()");
		}
	}

	public ALBehaviorManager createALBehaviorManager() {
		return new ALBehaviorManager();
	}

	/**
	 * <summary>This module handle one or several Aldebaran's bluetooth
	 * boards.</summary>
	 */
	public class ALBluetooth {

		/**
		 * <summary> Local Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALBluetoothProxy(String[] pbroker) {
			return requestAction("ALBluetooth/ALBluetoothProxy/" + "'"
					+ pbroker + "'");
		}

		/**
		 * <summary> Remote Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALBluetoothProxy(String pip, int pport) {
			return requestAction("ALBluetooth/ALBluetoothProxy/" + "'" + pip
					+ "'" + "," + pport);
		}

		/**
		 * <summary> Gets the underlying generic proxy </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getGenericProxy() {
			return requestAction("ALBluetooth/getGenericProxy/()");
		}

		/**
		 * <summary> Wait for the end of a long running method that was called
		 * using 'post' </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post'
		 * @param timeoutPeriod
		 *            The timeout period in ms. To wait indefinately, use a
		 *            timeoutPeriod of zero. <br />
		 *            <i>Actual SDK return value:</i>True if the timeout period
		 *            terminated. False if the method returned.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject wait(final int id, final int timeoutperiod) {
			return requestAction("ALBluetooth/wait/" + id + "," + timeoutperiod);
		}

		/**
		 * <summary> stop a long running method that was called using 'post'
		 * </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stop(final int id) {
			return requestAction("ALBluetooth/stop/" + id);
		}

		/**
		 * <summary> isRunning </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isRunning(final int id) {
			return requestAction("ALBluetooth/isRunning/" + id);
		}

		/**
		 * <summary> Connect to all associated devices that we found. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject connect() {
			return requestAction("ALBluetooth/connect/()");
		}

		/**
		 * <summary> Connect to a specific device. </summary>
		 * 
		 * @param devicename
		 *            the device name, this will be used to refer to the device
		 *            later
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject connect(final String devicename) {
			return requestAction("ALBluetooth/connect/" + "'" + devicename
					+ "'");
		}

		/**
		 * <summary> Disconnect all bluetooth devices </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject disconnect() {
			return requestAction("ALBluetooth/disconnect/()");
		}

		/**
		 * <summary> Disconnect a bluetooth device </summary>
		 * 
		 * @param devicename
		 *            the device name to disconnect
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject disconnect(final String devicename) {
			return requestAction("ALBluetooth/disconnect/" + "'" + devicename
					+ "'");
		}

		/**
		 * <summary> Exits and unregisters the module. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject exit() {
			return requestAction("ALBluetooth/exit/()");
		}

		/**
		 * <summary> list all bluetooth devices that are associated with nao.
		 * </summary> <br />
		 * <i>Actual SDK return value:</i> a list of bluetooth device <name,
		 * address>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getAssociatedDeviceList() {
			return requestAction("ALBluetooth/getAssociatedDeviceList/()");
		}

		/**
		 * <summary> Gets the name of the parent broker. </summary> <br />
		 * <i>Actual SDK return value:</i> The name of the parent broker.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getBrokerName() {
			return requestAction("ALBluetooth/getBrokerName/()");
		}

		/**
		 * <summary> list all connected bluetooth devices </summary> <br />
		 * <i>Actual SDK return value:</i> a list of connected bluetooth device
		 * <name>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getConnectedDeviceList() {
			return requestAction("ALBluetooth/getConnectedDeviceList/()");
		}

		/**
		 * <summary> list all available bluetooth devices (need a scan before)
		 * </summary> <br />
		 * <i>Actual SDK return value:</i> a list of bluetooth device <name,
		 * address>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getDeviceList() {
			return requestAction("ALBluetooth/getDeviceList/()");
		}

		/**
		 * <summary> Retrieves a method's description. </summary>
		 * 
		 * @param methodName
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A structure containing the
		 *            method's description.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodHelp(final String methodname) {
			return requestAction("ALBluetooth/getMethodHelp/" + "'"
					+ methodname + "'");
		}

		/**
		 * <summary> Retrieves the module's method list. </summary> <br />
		 * <i>Actual SDK return value:</i> An array of method names.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodList() {
			return requestAction("ALBluetooth/getMethodList/()");
		}

		/**
		 * <summary> Retrieves the module's description. </summary> <br />
		 * <i>Actual SDK return value:</i> A structure describing the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getModuleHelp() {
			return requestAction("ALBluetooth/getModuleHelp/()");
		}

		/**
		 * <summary> Gets the method usage string. This summarise how to use the
		 * method. </summary>
		 * 
		 * @param name
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A string that summarises
		 *            the usage of the method.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getUsage(final String name) {
			return requestAction("ALBluetooth/getUsage/" + "'" + name + "'");
		}

		/**
		 * <summary> Is a device connected? </summary>
		 * 
		 * @param devicename
		 *            the device name <br />
		 *            <i>Actual SDK return value:</i> return true is the device
		 *            is connected
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isConnected(final String devicename) {
			return requestAction("ALBluetooth/isConnected/" + "'" + devicename
					+ "'");
		}

		/**
		 * <summary> Just a ping. Always returns true </summary> <br />
		 * <i>Actual SDK return value:</i> returns true
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ping() {
			return requestAction("ALBluetooth/ping/()");
		}

		/**
		 * <summary> Scan for bluetooth devices, this may take up to 10 seconds
		 * </summary> <br />
		 * <i>Actual SDK return value:</i> a list of bluetooth devices <name,
		 * address>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject scan() {
			return requestAction("ALBluetooth/scan/()");
		}

		/**
		 * <summary> Send data to a bluetooth device, each value should be
		 * provided. </summary>
		 * 
		 * @param devicename
		 *            the device name
		 * @param PWMs
		 *            array of 4 signed short, should be between -32768 and
		 *            32768 (duty cycle ranging from -100% to 100%)
		 * @param servos
		 *            array of 2 unsigned short, should be between 500 and 2500
		 *            (pulse width in microsecond)
		 * @param GPIOs
		 *            array of 4 bool
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject send(final String devicename, final String pwms,
				final String servos, final String gpios) {
			return requestAction("ALBluetooth/send/" + "'" + devicename + "'"
					+ "+'" + pwms + "'" + "+'" + servos + "'" + "+'" + gpios
					+ "'");
		}

		/**
		 * <summary> set the device list that nao should handle. Association
		 * will be persistent after reboot. </summary>
		 * 
		 * @param deviceList
		 *            list of bluetooth device <name, address>
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setAssociatedDeviceList(final String devicelist) {
			return requestAction("ALBluetooth/setAssociatedDeviceList/" + "'"
					+ devicelist + "'");
		}

		/**
		 * <summary> Returns the version of the module. </summary> <br />
		 * <i>Actual SDK return value:</i> A string containing the version of
		 * the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject version() {
			return requestAction("ALBluetooth/version/()");
		}
	}

	public ALBluetooth createALBluetooth() {
		return new ALBluetooth();
	}

	/**
	 * <summary>The bonjour module advertises this Nao's IP address on the local
	 * network using the bonjour protocol. See:
	 * http://developer.apple.com/networking/bonjour/</summary>
	 */
	public class ALBonjour {

		/**
		 * <summary> Local Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALBonjourProxy(String[] pbroker) {
			return requestAction("ALBonjour/ALBonjourProxy/" + "'" + pbroker
					+ "'");
		}

		/**
		 * <summary> Remote Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALBonjourProxy(String pip, int pport) {
			return requestAction("ALBonjour/ALBonjourProxy/" + "'" + pip + "'"
					+ "," + pport);
		}

		/**
		 * <summary> Gets the underlying generic proxy </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getGenericProxy() {
			return requestAction("ALBonjour/getGenericProxy/()");
		}

		/**
		 * <summary> Wait for the end of a long running method that was called
		 * using 'post' </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post'
		 * @param timeoutPeriod
		 *            The timeout period in ms. To wait indefinately, use a
		 *            timeoutPeriod of zero. <br />
		 *            <i>Actual SDK return value:</i>True if the timeout period
		 *            terminated. False if the method returned.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject wait(final int id, final int timeoutperiod) {
			return requestAction("ALBonjour/wait/" + id + "," + timeoutperiod);
		}

		/**
		 * <summary> stop a long running method that was called using 'post'
		 * </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stop(final int id) {
			return requestAction("ALBonjour/stop/" + id);
		}

		/**
		 * <summary> isRunning </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isRunning(final int id) {
			return requestAction("ALBonjour/isRunning/" + id);
		}

		/**
		 * <summary> Declares NaoQi using bonjour. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject declare() {
			return requestAction("ALBonjour/declare/()");
		}

		/**
		 * <summary> Exits and unregisters the module. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject exit() {
			return requestAction("ALBonjour/exit/()");
		}

		/**
		 * <summary> Gets the name of the parent broker. </summary> <br />
		 * <i>Actual SDK return value:</i> The name of the parent broker.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getBrokerName() {
			return requestAction("ALBonjour/getBrokerName/()");
		}

		/**
		 * <summary> Retrieves a method's description. </summary>
		 * 
		 * @param methodName
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A structure containing the
		 *            method's description.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodHelp(final String methodname) {
			return requestAction("ALBonjour/getMethodHelp/" + "'" + methodname
					+ "'");
		}

		/**
		 * <summary> Retrieves the module's method list. </summary> <br />
		 * <i>Actual SDK return value:</i> An array of method names.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodList() {
			return requestAction("ALBonjour/getMethodList/()");
		}

		/**
		 * <summary> Retrieves the module's description. </summary> <br />
		 * <i>Actual SDK return value:</i> A structure describing the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getModuleHelp() {
			return requestAction("ALBonjour/getModuleHelp/()");
		}

		/**
		 * <summary> Gets the method usage string. This summarise how to use the
		 * method. </summary>
		 * 
		 * @param name
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A string that summarises
		 *            the usage of the method.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getUsage(final String name) {
			return requestAction("ALBonjour/getUsage/" + "'" + name + "'");
		}

		/**
		 * <summary> Just a ping. Always returns true </summary> <br />
		 * <i>Actual SDK return value:</i> returns true
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ping() {
			return requestAction("ALBonjour/ping/()");
		}

		/**
		 * <summary> Returns the version of the module. </summary> <br />
		 * <i>Actual SDK return value:</i> A string containing the version of
		 * the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject version() {
			return requestAction("ALBonjour/version/()");
		}
	}

	public ALBonjour createALBonjour() {
		return new ALBonjour();
	}

	/**
	 * <summary>ALFaceDetection is the Module which detects faces.</summary>
	 */
	public class ALFaceDetection {

		/**
		 * <summary> Local Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALFaceDetectionProxy(String[] pbroker) {
			return requestAction("ALFaceDetection/ALFaceDetectionProxy/" + "'"
					+ pbroker + "'");
		}

		/**
		 * <summary> Remote Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALFaceDetectionProxy(String pip, int pport) {
			return requestAction("ALFaceDetection/ALFaceDetectionProxy/" + "'"
					+ pip + "'" + "," + pport);
		}

		/**
		 * <summary> Gets the underlying generic proxy </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getGenericProxy() {
			return requestAction("ALFaceDetection/getGenericProxy/()");
		}

		/**
		 * <summary> Wait for the end of a long running method that was called
		 * using 'post' </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post'
		 * @param timeoutPeriod
		 *            The timeout period in ms. To wait indefinately, use a
		 *            timeoutPeriod of zero. <br />
		 *            <i>Actual SDK return value:</i>True if the timeout period
		 *            terminated. False if the method returned.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject wait(final int id, final int timeoutperiod) {
			return requestAction("ALFaceDetection/wait/" + id + ","
					+ timeoutperiod);
		}

		/**
		 * <summary> stop a long running method that was called using 'post'
		 * </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stop(final int id) {
			return requestAction("ALFaceDetection/stop/" + id);
		}

		/**
		 * <summary> isRunning </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isRunning(final int id) {
			return requestAction("ALFaceDetection/isRunning/" + id);
		}

		/**
		 * <summary>
		 * 
		 * </summary> <br />
		 * <i>Actual SDK return value:</i> true if the operation succeeds
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject clearDatabase() {
			return requestAction("ALFaceDetection/clearDatabase/()");
		}

		/**
		 * <summary> enable/disable the recognition stageProcess will be faster
		 * when disabled when you don't need to recognize people </summary>
		 * 
		 * @param enable
		 *            True/False
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject enableRecognition(final boolean enable) {
			return requestAction("ALFaceDetection/enableRecognition/" + enable);
		}

		/**
		 * <summary> (BETA) Choose to enable or disable tracking. Enabling
		 * tracking usually allows you to follow a face for a longer period of
		 * time. However, it can lead to more false detections. </summary>
		 * 
		 * @param enable
		 *            True/False
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject enableTracking(final boolean enable) {
			return requestAction("ALFaceDetection/enableTracking/" + enable);
		}

		/**
		 * <summary> Exits and unregisters the module. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject exit() {
			return requestAction("ALFaceDetection/exit/()");
		}

		/**
		 * <summary> Gets the name of the parent broker. </summary> <br />
		 * <i>Actual SDK return value:</i> The name of the parent broker.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getBrokerName() {
			return requestAction("ALFaceDetection/getBrokerName/()");
		}

		/**
		 * <summary> Gets the current period. </summary> <br />
		 * <i>Actual SDK return value:</i> Refresh period (in milliseconds).
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getCurrentPeriod() {
			return requestAction("ALFaceDetection/getCurrentPeriod/()");
		}

		/**
		 * <summary> Gets the current precision. </summary> <br />
		 * <i>Actual SDK return value:</i> Precision of the extractor.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getCurrentPrecision() {
			return requestAction("ALFaceDetection/getCurrentPrecision/()");
		}

		/**
		 * <summary> Retrieves a method's description. </summary>
		 * 
		 * @param methodName
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A structure containing the
		 *            method's description.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodHelp(final String methodname) {
			return requestAction("ALFaceDetection/getMethodHelp/" + "'"
					+ methodname + "'");
		}

		/**
		 * <summary> Retrieves the module's method list. </summary> <br />
		 * <i>Actual SDK return value:</i> An array of method names.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodList() {
			return requestAction("ALFaceDetection/getMethodList/()");
		}

		/**
		 * <summary> Retrieves the module's description. </summary> <br />
		 * <i>Actual SDK return value:</i> A structure describing the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getModuleHelp() {
			return requestAction("ALFaceDetection/getModuleHelp/()");
		}

		/**
		 * <summary> Gets the period for a specific subscription. </summary>
		 * 
		 * @param name
		 *            Name of the module which has subscribed. <br />
		 *            <i>Actual SDK return value:</i> Refresh period (in
		 *            milliseconds).
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMyPeriod(final String name) {
			return requestAction("ALFaceDetection/getMyPeriod/" + "'" + name
					+ "'");
		}

		/**
		 * <summary> Gets the precision for a specific subscription. </summary>
		 * 
		 * @param name
		 *            name of the module which has subscribed <br />
		 *            <i>Actual SDK return value:</i> precision of the extractor
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMyPrecision(final String name) {
			return requestAction("ALFaceDetection/getMyPrecision/" + "'" + name
					+ "'");
		}

		/**
		 * <summary> Get the list of values updated in ALMemory. </summary> <br />
		 * <i>Actual SDK return value:</i> Array of values updated by this
		 * extractor in ALMemory
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getOutputNames() {
			return requestAction("ALFaceDetection/getOutputNames/()");
		}

		/**
		 * <summary> Gets the parameters given by the module. </summary> <br />
		 * <i>Actual SDK return value:</i> Array of names and parameters of all
		 * subscribers.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getSubscribersInfo() {
			return requestAction("ALFaceDetection/getSubscribersInfo/()");
		}

		/**
		 * <summary> Gets the method usage string. This summarise how to use the
		 * method. </summary>
		 * 
		 * @param name
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A string that summarises
		 *            the usage of the method.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getUsage(final String name) {
			return requestAction("ALFaceDetection/getUsage/" + "'" + name + "'");
		}

		/**
		 * <summary> (BETA) Returns if tracking is enabled. </summary> <br />
		 * <i>Actual SDK return value:</i> True/False
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isTrackingEnabled() {
			return requestAction("ALFaceDetection/isTrackingEnabled/()");
		}

		/**
		 * <summary> Add a new face in the database. </summary>
		 * 
		 * @param pId
		 *            ID of the person to save <br />
		 *            <i>Actual SDK return value:</i> true if the operation
		 *            succeeds
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject learnFace(final String pid) {
			return requestAction("ALFaceDetection/learnFace/" + "'" + pid + "'");
		}

		/**
		 * <summary> Just a ping. Always returns true </summary> <br />
		 * <i>Actual SDK return value:</i> returns true
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ping() {
			return requestAction("ALFaceDetection/ping/()");
		}

		/**
		 * <summary> use in a new learning process the latest images where a
		 * face has been wrongly recognized </summary>
		 * 
		 * @param pId
		 *            ID of the person to save <br />
		 *            <i>Actual SDK return value:</i> true if the operation
		 *            succeeds
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject reLearnFace(final String pid) {
			return requestAction("ALFaceDetection/reLearnFace/" + "'" + pid
					+ "'");
		}

		/**
		 * <summary> Subscribes to the extractor. This causes the extractor to
		 * start writing information to memory using the keys described by
		 * getOutputNames(). These can be accessed in memory using
		 * ALMemory.getData(\"keyName\"). In many cases you can avoid calling
		 * subscribe on the extractor by just calling
		 * ALMemory.subscribeToEvent() supplying a callback method. This will
		 * automatically subscribe to the extractor for you. </summary>
		 * 
		 * @param name
		 *            Name of the module which subscribes.
		 * @param period
		 *            Refresh period (in milliseconds) if relevant.
		 * @param precision
		 *            Precision of the extractor if relevant.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject subscribe(final String name, final int period,
				final float precision) {
			return requestAction("ALFaceDetection/subscribe/" + "'" + name
					+ "'" + "," + period + "," + precision);
		}

		/**
		 * <summary> Subscribes to the extractor. This causes the extractor to
		 * start writing information to memory using the keys described by
		 * getOutputNames(). These can be accessed in memory using
		 * ALMemory.getData(\"keyName\"). In many cases you can avoid calling
		 * subscribe on the extractor by just calling
		 * ALMemory.subscribeToEvent() supplying a callback method. This will
		 * automatically subscribe to the extractor for you. </summary>
		 * 
		 * @param name
		 *            Name of the module which subscribes.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject subscribe(final String name) {
			return requestAction("ALFaceDetection/subscribe/" + "'" + name
					+ "'");
		}

		/**
		 * <summary> Unsubscribes from the extractor. </summary>
		 * 
		 * @param name
		 *            Name of the module which had subscribed.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject unsubscribe(final String name) {
			return requestAction("ALFaceDetection/unsubscribe/" + "'" + name
					+ "'");
		}

		/**
		 * <summary> Updates the period if relevant. </summary>
		 * 
		 * @param name
		 *            Name of the module which has subscribed.
		 * @param period
		 *            Refresh period (in milliseconds).
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject updatePeriod(final String name, final int period) {
			return requestAction("ALFaceDetection/updatePeriod/" + "'" + name
					+ "'" + "," + period);
		}

		/**
		 * <summary> Updates the precision if relevant. </summary>
		 * 
		 * @param name
		 *            Name of the module which has subscribed.
		 * @param precision
		 *            Precision of the extractor.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject updatePrecision(final String name,
				final float precision) {
			return requestAction("ALFaceDetection/updatePrecision/" + "'"
					+ name + "'" + "," + precision);
		}

		/**
		 * <summary> Returns the version of the module. </summary> <br />
		 * <i>Actual SDK return value:</i> A string containing the version of
		 * the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject version() {
			return requestAction("ALFaceDetection/version/()");
		}
	}

	public ALFaceDetection createALFaceDetection() {
		return new ALFaceDetection();
	}

	/**
	 * <summary>This module is dedicated to Track a Face expressed in
	 * NAO_SPACE.</summary>
	 */
	public class ALFaceTracker {

		/**
		 * <summary> Local Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALFaceTrackerProxy(String[] pbroker) {
			return requestAction("ALFaceTracker/ALFaceTrackerProxy/" + "'"
					+ pbroker + "'");
		}

		/**
		 * <summary> Remote Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALFaceTrackerProxy(String pip, int pport) {
			return requestAction("ALFaceTracker/ALFaceTrackerProxy/" + "'"
					+ pip + "'" + "," + pport);
		}

		/**
		 * <summary> Gets the underlying generic proxy </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getGenericProxy() {
			return requestAction("ALFaceTracker/getGenericProxy/()");
		}

		/**
		 * <summary> Wait for the end of a long running method that was called
		 * using 'post' </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post'
		 * @param timeoutPeriod
		 *            The timeout period in ms. To wait indefinately, use a
		 *            timeoutPeriod of zero. <br />
		 *            <i>Actual SDK return value:</i>True if the timeout period
		 *            terminated. False if the method returned.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject wait(final int id, final int timeoutperiod) {
			return requestAction("ALFaceTracker/wait/" + id + ","
					+ timeoutperiod);
		}

		/**
		 * <summary> stop a long running method that was called using 'post'
		 * </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stop(final int id) {
			return requestAction("ALFaceTracker/stop/" + id);
		}

		/**
		 * <summary> isRunning </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isRunning(final int id) {
			return requestAction("ALFaceTracker/isRunning/" + id);
		}

		/**
		 * <summary> Exits and unregisters the module. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject exit() {
			return requestAction("ALFaceTracker/exit/()");
		}

		/**
		 * <summary> Gets the name of the parent broker. </summary> <br />
		 * <i>Actual SDK return value:</i> The name of the parent broker.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getBrokerName() {
			return requestAction("ALFaceTracker/getBrokerName/()");
		}

		/**
		 * <summary> Retrieves a method's description. </summary>
		 * 
		 * @param methodName
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A structure containing the
		 *            method's description.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodHelp(final String methodname) {
			return requestAction("ALFaceTracker/getMethodHelp/" + "'"
					+ methodname + "'");
		}

		/**
		 * <summary> Retrieves the module's method list. </summary> <br />
		 * <i>Actual SDK return value:</i> An array of method names.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodList() {
			return requestAction("ALFaceTracker/getMethodList/()");
		}

		/**
		 * <summary> Retrieves the module's description. </summary> <br />
		 * <i>Actual SDK return value:</i> A structure describing the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getModuleHelp() {
			return requestAction("ALFaceTracker/getModuleHelp/()");
		}

		/**
		 * <summary> Return the position of the face in NAO_SPACE. </summary> <br />
		 * <i>Actual SDK return value:</i> An Array containing the face position
		 * [x, y, z].
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getPosition() {
			return requestAction("ALFaceTracker/getPosition/()");
		}

		/**
		 * <summary> Gets the method usage string. This summarise how to use the
		 * method. </summary>
		 * 
		 * @param name
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A string that summarises
		 *            the usage of the method.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getUsage(final String name) {
			return requestAction("ALFaceTracker/getUsage/" + "'" + name + "'");
		}

		/**
		 * <summary> Return true if the face Tracker is running. </summary> <br />
		 * <i>Actual SDK return value:</i> true if the face Tracker is running.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isActive() {
			return requestAction("ALFaceTracker/isActive/()");
		}

		/**
		 * <summary> Return true if a new face was detected since the last
		 * getPosition(). </summary> <br />
		 * <i>Actual SDK return value:</i> true if a new face was detected since
		 * the last getPosition().
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isNewData() {
			return requestAction("ALFaceTracker/isNewData/()");
		}

		/**
		 * <summary> Just a ping. Always returns true </summary> <br />
		 * <i>Actual SDK return value:</i> returns true
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ping() {
			return requestAction("ALFaceTracker/ping/()");
		}

		/**
		 * <summary> if true, the tracking will be through a Whole Body Process.
		 * </summary>
		 * 
		 * @param pWholeBodyOn
		 *            The whole Body state
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setWholeBodyOn(final boolean pwholebodyon) {
			return requestAction("ALFaceTracker/setWholeBodyOn/" + pwholebodyon);
		}

		/**
		 * <summary> Start the tracker by Subscribing to Event FaceDetected from
		 * ALFaceDetection module. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject startTracker() {
			return requestAction("ALFaceTracker/startTracker/()");
		}

		/**
		 * <summary> Start the tracker by Unsubscribing to Event FaceDetected
		 * from ALFaceDetection module. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stopTracker() {
			return requestAction("ALFaceTracker/stopTracker/()");
		}

		/**
		 * <summary> Returns the version of the module. </summary> <br />
		 * <i>Actual SDK return value:</i> A string containing the version of
		 * the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject version() {
			return requestAction("ALFaceTracker/version/()");
		}
	}

	public ALFaceTracker createALFaceTracker() {
		return new ALFaceTracker();
	}

	/**
	 * <summary>ALFileManager manages the user files stored in a shared
	 * folder.</summary>
	 */
	public class ALFileManager {

		/**
		 * <summary> Local Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALFileManagerProxy(String[] pbroker) {
			return requestAction("ALFileManager/ALFileManagerProxy/" + "'"
					+ pbroker + "'");
		}

		/**
		 * <summary> Remote Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALFileManagerProxy(String pip, int pport) {
			return requestAction("ALFileManager/ALFileManagerProxy/" + "'"
					+ pip + "'" + "," + pport);
		}

		/**
		 * <summary> Gets the underlying generic proxy </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getGenericProxy() {
			return requestAction("ALFileManager/getGenericProxy/()");
		}

		/**
		 * <summary> Wait for the end of a long running method that was called
		 * using 'post' </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post'
		 * @param timeoutPeriod
		 *            The timeout period in ms. To wait indefinately, use a
		 *            timeoutPeriod of zero. <br />
		 *            <i>Actual SDK return value:</i>True if the timeout period
		 *            terminated. False if the method returned.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject wait(final int id, final int timeoutperiod) {
			return requestAction("ALFileManager/wait/" + id + ","
					+ timeoutperiod);
		}

		/**
		 * <summary> stop a long running method that was called using 'post'
		 * </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stop(final int id) {
			return requestAction("ALFileManager/stop/" + id);
		}

		/**
		 * <summary> isRunning </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isRunning(final int id) {
			return requestAction("ALFileManager/isRunning/" + id);
		}

		/**
		 * <summary> Try to find if this file does exist on robot or not.
		 * </summary>
		 * 
		 * @param fileName
		 *            Name of the module associate to the preference. <br />
		 *            <i>Actual SDK return value:</i> True upon success
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject dataFileExists(final String filename) {
			return requestAction("ALFileManager/dataFileExists/" + "'"
					+ filename + "'");
		}

		/**
		 * <summary> Exits and unregisters the module. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject exit() {
			return requestAction("ALFileManager/exit/()");
		}

		/**
		 * <summary> Try to find if this file does exist on robot or not.
		 * </summary>
		 * 
		 * @param fileName
		 *            Name of the module associate to the preference. <br />
		 *            <i>Actual SDK return value:</i> True upon success
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject fileExists(final String filename) {
			return requestAction("ALFileManager/fileExists/" + "'" + filename
					+ "'");
		}

		/**
		 * <summary> Gets the name of the parent broker. </summary> <br />
		 * <i>Actual SDK return value:</i> The name of the parent broker.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getBrokerName() {
			return requestAction("ALFileManager/getBrokerName/()");
		}

		/**
		 * <summary> Returns the complete path of the file if it does exist.
		 * Starts by looking in user's shared folder, then in system folder.
		 * </summary>
		 * 
		 * @param prefs
		 *            array reprenting the whole file. <br />
		 *            <i>Actual SDK return value:</i> True upon success
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getFileCompletePath(final String prefs) {
			return requestAction("ALFileManager/getFileCompletePath/" + "'"
					+ prefs + "'");
		}

		/**
		 * <summary> Returns the complete path of the file if it does exist.
		 * Starts by looking in user's shared folder, then in system folder.
		 * </summary>
		 * 
		 * @param prefs
		 *            array reprenting the whole file. <br />
		 *            <i>Actual SDK return value:</i> True upon success
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getFileContents(final String prefs) {
			return requestAction("ALFileManager/getFileContents/" + "'" + prefs
					+ "'");
		}

		/**
		 * <summary> Retrieves a method's description. </summary>
		 * 
		 * @param methodName
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A structure containing the
		 *            method's description.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodHelp(final String methodname) {
			return requestAction("ALFileManager/getMethodHelp/" + "'"
					+ methodname + "'");
		}

		/**
		 * <summary> Retrieves the module's method list. </summary> <br />
		 * <i>Actual SDK return value:</i> An array of method names.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodList() {
			return requestAction("ALFileManager/getMethodList/()");
		}

		/**
		 * <summary> Retrieves the module's description. </summary> <br />
		 * <i>Actual SDK return value:</i> A structure describing the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getModuleHelp() {
			return requestAction("ALFileManager/getModuleHelp/()");
		}

		/**
		 * <summary> Get the current system shared folder path. </summary> <br />
		 * <i>Actual SDK return value:</i> System shared folder path string.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getSystemSharedFolderPath() {
			return requestAction("ALFileManager/getSystemSharedFolderPath/()");
		}

		/**
		 * <summary> Gets the method usage string. This summarise how to use the
		 * method. </summary>
		 * 
		 * @param name
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A string that summarises
		 *            the usage of the method.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getUsage(final String name) {
			return requestAction("ALFileManager/getUsage/" + "'" + name + "'");
		}

		/**
		 * <summary> Get the current user shared folder path. </summary> <br />
		 * <i>Actual SDK return value:</i> User shared folder path string.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getUserSharedFolderPath() {
			return requestAction("ALFileManager/getUserSharedFolderPath/()");
		}

		/**
		 * <summary> Just a ping. Always returns true </summary> <br />
		 * <i>Actual SDK return value:</i> returns true
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ping() {
			return requestAction("ALFileManager/ping/()");
		}

		/**
		 * <summary> Set a new value of the user shared folder path. </summary>
		 * 
		 * @param fileName
		 *            Name of the module associate to the preference.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setUserSharedFolderPath(final String filename) {
			return requestAction("ALFileManager/setUserSharedFolderPath/" + "'"
					+ filename + "'");
		}

		/**
		 * <summary> Returns the version of the module. </summary> <br />
		 * <i>Actual SDK return value:</i> A string containing the version of
		 * the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject version() {
			return requestAction("ALFileManager/version/()");
		}
	}

	public ALFileManager createALFileManager() {
		return new ALFileManager();
	}

	/**
	 * <summary>Frame manager is used to play choregraphe projects in naoqi. It
	 * needs Choregraphe projects in input and will return an ID for each
	 * project. It can also only read a given box/timeline in a complex
	 * behavior.</summary>
	 */
	public class ALFrameManager {

		/**
		 * <summary> Local Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALFrameManagerProxy(String[] pbroker) {
			return requestAction("ALFrameManager/ALFrameManagerProxy/" + "'"
					+ pbroker + "'");
		}

		/**
		 * <summary> Remote Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALFrameManagerProxy(String pip, int pport) {
			return requestAction("ALFrameManager/ALFrameManagerProxy/" + "'"
					+ pip + "'" + "," + pport);
		}

		/**
		 * <summary> Gets the underlying generic proxy </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getGenericProxy() {
			return requestAction("ALFrameManager/getGenericProxy/()");
		}

		/**
		 * <summary> Wait for the end of a long running method that was called
		 * using 'post' </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post'
		 * @param timeoutPeriod
		 *            The timeout period in ms. To wait indefinately, use a
		 *            timeoutPeriod of zero. <br />
		 *            <i>Actual SDK return value:</i>True if the timeout period
		 *            terminated. False if the method returned.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject wait(final int id, final int timeoutperiod) {
			return requestAction("ALFrameManager/wait/" + id + ","
					+ timeoutperiod);
		}

		/**
		 * <summary> stop a long running method that was called using 'post'
		 * </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stop(final int id) {
			return requestAction("ALFrameManager/stop/" + id);
		}

		/**
		 * <summary> isRunning </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isRunning(final int id) {
			return requestAction("ALFrameManager/isRunning/" + id);
		}

		/**
		 * <summary> Stop playing any behavior in FrameManager, and delete all
		 * of them. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject cleanBehaviors() {
			return requestAction("ALFrameManager/cleanBehaviors/()");
		}

		/**
		 * <summary> It will play a behavior and block until the behavior is
		 * finished. Note that it can block forever if the behavior output is
		 * never called. </summary>
		 * 
		 * @param id
		 *            The id of the box.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject completeBehavior(final String id) {
			return requestAction("ALFrameManager/completeBehavior/" + "'" + id
					+ "'");
		}

		/**
		 * <summary> Creates and play completely a timeline </summary>
		 * 
		 * @param xmlFile
		 *            The choregraphe project (in plain text for the moment). <br />
		 *            <i>Actual SDK return value:</i> return a unique identifier
		 *            for the created box that contains the timeline. You must
		 *            call deleteBehavior on it at some point.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject createAndPlayTimeline(final String xmlfile) {
			return requestAction("ALFrameManager/createAndPlayTimeline/" + "'"
					+ xmlfile + "'");
		}

		/**
		 * <summary> Called by ALMemory when subcription data is updated.
		 * </summary>
		 * 
		 * @param dataName
		 *            Name of the subscribed data.
		 * @param data
		 *            Value of the the subscribed data
		 * @param message
		 *            The message give when subscribing.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject dataChanged(final String dataname, final String data,
				final String message) {
			return requestAction("ALFrameManager/dataChanged/" + "'" + dataname
					+ "'" + "+'" + data + "'" + "+'" + message + "'");
		}

		/**
		 * <summary> Deletes a behavior (meaning a box). Stop the whole behavior
		 * contained in this box first. </summary>
		 * 
		 * @param id
		 *            The id of the box to delete.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject deleteBehavior(final String id) {
			return requestAction("ALFrameManager/deleteBehavior/" + "'" + id
					+ "'");
		}

		/**
		 * <summary> Exits and unregisters the module. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject exit() {
			return requestAction("ALFrameManager/exit/()");
		}

		/**
		 * <summary> Exit the reading of a timeline contained in a given box
		 * </summary>
		 * 
		 * @param id
		 *            The id of the box.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject exitBehavior(final String id) {
			return requestAction("ALFrameManager/exitBehavior/" + "'" + id
					+ "'");
		}

		/**
		 * <summary> Returns a playing behavior absolute path. </summary>
		 * 
		 * @param id
		 *            The id of the behavior. <br />
		 *            <i>Actual SDK return value:</i> Returns the absolute path
		 *            of given behavior.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getBehaviorPath(final String id) {
			return requestAction("ALFrameManager/getBehaviorPath/" + "'" + id
					+ "'");
		}

		/**
		 * <summary> Gets the name of the parent broker. </summary> <br />
		 * <i>Actual SDK return value:</i> The name of the parent broker.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getBrokerName() {
			return requestAction("ALFrameManager/getBrokerName/()");
		}

		/**
		 * <summary> Retrieves a method's description. </summary>
		 * 
		 * @param methodName
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A structure containing the
		 *            method's description.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodHelp(final String methodname) {
			return requestAction("ALFrameManager/getMethodHelp/" + "'"
					+ methodname + "'");
		}

		/**
		 * <summary> Retrieves the module's method list. </summary> <br />
		 * <i>Actual SDK return value:</i> An array of method names.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodList() {
			return requestAction("ALFrameManager/getMethodList/()");
		}

		/**
		 * <summary> Retrieves the module's description. </summary> <br />
		 * <i>Actual SDK return value:</i> A structure describing the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getModuleHelp() {
			return requestAction("ALFrameManager/getModuleHelp/()");
		}

		/**
		 * <summary> Returns in seconds, the duration of a given movement stored
		 * in a box. Returns 0 if the behavior has no motion layers. </summary>
		 * 
		 * @param id
		 *            The id of the box. <br />
		 *            <i>Actual SDK return value:</i> Returns the time in
		 *            seconds.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMotionLength(final String id) {
			return requestAction("ALFrameManager/getMotionLength/" + "'" + id
					+ "'");
		}

		/**
		 * <summary> Gets the FPS of a given timeline </summary>
		 * 
		 * @param id
		 *            The id of the timeline. <br />
		 *            <i>Actual SDK return value:</i> Returns the timeline's
		 *            FPS.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getTimelineFps(final String id) {
			return requestAction("ALFrameManager/getTimelineFps/" + "'" + id
					+ "'");
		}

		/**
		 * <summary> Gets the method usage string. This summarise how to use the
		 * method. </summary>
		 * 
		 * @param name
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A string that summarises
		 *            the usage of the method.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getUsage(final String name) {
			return requestAction("ALFrameManager/getUsage/" + "'" + name + "'");
		}

		/**
		 * <summary> Goes to a certain frame and continue playing </summary>
		 * 
		 * @param id
		 *            The id of the box containing the box.
		 * @param frame
		 *            The behavior frame name we want the timeline to go to. If
		 *            will jump to the starting index of the name given.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject gotoAndPlay(final String id, final String frame) {
			return requestAction("ALFrameManager/gotoAndPlay/" + "'" + id + "'"
					+ "+'" + frame + "'");
		}

		/**
		 * <summary> Goes to a certain frame and continue playing </summary>
		 * 
		 * @param id
		 *            The id of the box containing the box.
		 * @param frame
		 *            The frame we want the timeline to go to.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject gotoAndPlay(final String id, final int frame) {
			return requestAction("ALFrameManager/gotoAndPlay/" + "'" + id + "'"
					+ "," + frame);
		}

		/**
		 * <summary> Goes to a certain frame and pause </summary>
		 * 
		 * @param id
		 *            The id of the box containing the box.
		 * @param frame
		 *            The behavior frame name we want the timeline to go to. If
		 *            will jump to the starting index of the name given.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject gotoAndStop(final String id, final String frame) {
			return requestAction("ALFrameManager/gotoAndStop/" + "'" + id + "'"
					+ "+'" + frame + "'");
		}

		/**
		 * <summary> Goes to a certain frame and pause </summary>
		 * 
		 * @param id
		 *            The id of the box containing the box.
		 * @param frame
		 *            The frame we want the timeline to go to.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject gotoAndStop(final String id, final int frame) {
			return requestAction("ALFrameManager/gotoAndStop/" + "'" + id + "'"
					+ "," + frame);
		}

		/**
		 * <summary> Creates a new behavior, from a box found in an xml file.
		 * Note that you have to give the xml file contents, so this method is
		 * not very user friendly. You have to open the file, and send the
		 * string that matches the file contents if you are working from a file.
		 * You probably want to use newBehaviorFromFile instead. </summary>
		 * 
		 * @param path
		 *            The path to reach the box to instantiate in the project
		 *            (\"\" if root).
		 * @param xmlFile
		 *            The choregraphe project (in plain text for the moment). <br />
		 *            <i>Actual SDK return value:</i> return a unique identifier
		 *            for the created box.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject newBehavior(final String path, final String xmlfile) {
			return requestAction("ALFrameManager/newBehavior/" + "'" + path
					+ "'" + "+'" + xmlfile + "'");
		}

		/**
		 * <summary> Creates a new behavior, from the current Choregraphe
		 * behavior (uploaded to /tmp/currentChoregrapheBehavior/behavior.xar).
		 * </summary> <br />
		 * <i>Actual SDK return value:</i> return a unique identifier for the
		 * created behavior
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject newBehaviorFromChoregraphe() {
			return requestAction("ALFrameManager/newBehaviorFromChoregraphe/()");
		}

		/**
		 * <summary> Creates a new behavior, from a box found in an xml file
		 * stored in the robot. </summary>
		 * 
		 * @param xmlFilePath
		 *            Path to Xml file, ex : \"/home/youhou/mybehavior.xar\".
		 * @param path
		 *            The path to reach the box to instantiate in the project
		 *            (\"\" if root). <br />
		 *            <i>Actual SDK return value:</i> return a unique identifier
		 *            for the created box, that can be used by playBehavior
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject newBehaviorFromFile(final String xmlfilepath,
				final String path) {
			return requestAction("ALFrameManager/newBehaviorFromFile/" + "'"
					+ xmlfilepath + "'" + "+'" + path + "'");
		}

		/**
		 * <summary> Transmit Python error to Choregraphe or logger. Should not
		 * be called manually. </summary>
		 * 
		 * @param boxname
		 *            Name of the box raising the error
		 * @param methodname
		 *            Name of the method
		 * @param error
		 *            Error string
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject onPythonError(final String boxname,
				final String methodname, final String error) {
			return requestAction("ALFrameManager/onPythonError/" + "'"
					+ boxname + "'" + "+'" + methodname + "'" + "+'" + error
					+ "'");
		}

		/**
		 * <summary> Print Python message in Choregraphe or logger. Should not
		 * be called manually. </summary>
		 * 
		 * @param message
		 *            Message to print
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject onPythonPrint(final String message) {
			return requestAction("ALFrameManager/onPythonPrint/" + "'"
					+ message + "'");
		}

		/**
		 * <summary> Transmit Ruby error to Choregraphe or logger. Should not be
		 * called manually. </summary>
		 * 
		 * @param boxname
		 *            Name of the box raising the error
		 * @param methodname
		 *            Name of the method
		 * @param error
		 *            Error string
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject onRubyError(final String boxname,
				final String methodname, final String error) {
			return requestAction("ALFrameManager/onRubyError/" + "'" + boxname
					+ "'" + "+'" + methodname + "'" + "+'" + error + "'");
		}

		/**
		 * <summary> Print Ruby message in Choregraphe or logger. Should not be
		 * called manually. </summary>
		 * 
		 * @param message
		 *            Message to print
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject onRubyPrint(final String message) {
			return requestAction("ALFrameManager/onRubyPrint/" + "'" + message
					+ "'");
		}

		/**
		 * <summary> Transmit Urbi error to Choregraphe or logger. Should not be
		 * called manually. </summary>
		 * 
		 * @param boxname
		 *            Name of the box raising the error
		 * @param methodname
		 *            Name of the method
		 * @param location
		 *            Location of the error
		 * @param error
		 *            Error string
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject onUrbiError(final String boxname,
				final String methodname, final String location,
				final String error) {
			return requestAction("ALFrameManager/onUrbiError/" + "'" + boxname
					+ "'" + "+'" + methodname + "'" + "+'" + location + "'"
					+ "+'" + error + "'");
		}

		/**
		 * <summary> Print Urbi message in Choregraphe or logger. Should not be
		 * called manually. </summary>
		 * 
		 * @param message
		 *            Message to print
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject onUrbiPrint(final String message) {
			return requestAction("ALFrameManager/onUrbiPrint/" + "'" + message
					+ "'");
		}

		/**
		 * <summary> Just a ping. Always returns true </summary> <br />
		 * <i>Actual SDK return value:</i> returns true
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ping() {
			return requestAction("ALFrameManager/ping/()");
		}

		/**
		 * <summary> Starts a behavior </summary>
		 * 
		 * @param id
		 *            The id of the box.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject playBehavior(final String id) {
			return requestAction("ALFrameManager/playBehavior/" + "'" + id
					+ "'");
		}

		/**
		 * <summary> Play default behavior </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject playDefaultProject() {
			return requestAction("ALFrameManager/playDefaultProject/()");
		}

		/**
		 * <summary> Starts playing a timeline contained in a given box. If the
		 * box is a flow diagram, it will look for the first onStart input of
		 * type Bang, and stimulate it ! </summary>
		 * 
		 * @param id
		 *            The id of the box.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject playTimeline(final String id) {
			return requestAction("ALFrameManager/playTimeline/" + "'" + id
					+ "'");
		}

		/**
		 * <summary> Sets the FPS of a given timeline </summary>
		 * 
		 * @param id
		 *            The id of the timeline.
		 * @param fps
		 *            The FPS to set.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setTimelineFps(final String id, final int fps) {
			return requestAction("ALFrameManager/setTimelineFps/" + "'" + id
					+ "'" + "," + fps);
		}

		/**
		 * <summary> Stops playing a timeline contained in a given box, at the
		 * current frame </summary>
		 * 
		 * @param id
		 *            The id of the box.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stopTimeline(final String id) {
			return requestAction("ALFrameManager/stopTimeline/" + "'" + id
					+ "'");
		}

		/**
		 * <summary> Returns the version of the module. </summary> <br />
		 * <i>Actual SDK return value:</i> A string containing the version of
		 * the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject version() {
			return requestAction("ALFrameManager/version/()");
		}
	}

	public ALFrameManager createALFrameManager() {
		return new ALFrameManager();
	}

	/**
	 * <summary>Deals with FSR sensors.</summary>
	 */
	public class ALFsr {

		/**
		 * <summary> Local Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALFsrProxy(String[] pbroker) {
			return requestAction("ALFsr/ALFsrProxy/" + "'" + pbroker + "'");
		}

		/**
		 * <summary> Remote Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALFsrProxy(String pip, int pport) {
			return requestAction("ALFsr/ALFsrProxy/" + "'" + pip + "'" + ","
					+ pport);
		}

		/**
		 * <summary> Gets the underlying generic proxy </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getGenericProxy() {
			return requestAction("ALFsr/getGenericProxy/()");
		}

		/**
		 * <summary> Wait for the end of a long running method that was called
		 * using 'post' </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post'
		 * @param timeoutPeriod
		 *            The timeout period in ms. To wait indefinately, use a
		 *            timeoutPeriod of zero. <br />
		 *            <i>Actual SDK return value:</i>True if the timeout period
		 *            terminated. False if the method returned.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject wait(final int id, final int timeoutperiod) {
			return requestAction("ALFsr/wait/" + id + "," + timeoutperiod);
		}

		/**
		 * <summary> stop a long running method that was called using 'post'
		 * </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stop(final int id) {
			return requestAction("ALFsr/stop/" + id);
		}

		/**
		 * <summary> isRunning </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isRunning(final int id) {
			return requestAction("ALFsr/isRunning/" + id);
		}

		/**
		 * <summary> Exits and unregisters the module. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject exit() {
			return requestAction("ALFsr/exit/()");
		}

		/**
		 * <summary> Gets the name of the parent broker. </summary> <br />
		 * <i>Actual SDK return value:</i> The name of the parent broker.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getBrokerName() {
			return requestAction("ALFsr/getBrokerName/()");
		}

		/**
		 * <summary> Retrieves a method's description. </summary>
		 * 
		 * @param methodName
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A structure containing the
		 *            method's description.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodHelp(final String methodname) {
			return requestAction("ALFsr/getMethodHelp/" + "'" + methodname
					+ "'");
		}

		/**
		 * <summary> Retrieves the module's method list. </summary> <br />
		 * <i>Actual SDK return value:</i> An array of method names.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodList() {
			return requestAction("ALFsr/getMethodList/()");
		}

		/**
		 * <summary> Retrieves the module's description. </summary> <br />
		 * <i>Actual SDK return value:</i> A structure describing the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getModuleHelp() {
			return requestAction("ALFsr/getModuleHelp/()");
		}

		/**
		 * <summary> Gets the method usage string. This summarise how to use the
		 * method. </summary>
		 * 
		 * @param name
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A string that summarises
		 *            the usage of the method.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getUsage(final String name) {
			return requestAction("ALFsr/getUsage/" + "'" + name + "'");
		}

		/**
		 * <summary> Just a ping. Always returns true </summary> <br />
		 * <i>Actual SDK return value:</i> returns true
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ping() {
			return requestAction("ALFsr/ping/()");
		}

		/**
		 * <summary> Returns the version of the module. </summary> <br />
		 * <i>Actual SDK return value:</i> A string containing the version of
		 * the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject version() {
			return requestAction("ALFsr/version/()");
		}
	}

	public ALFsr createALFsr() {
		return new ALFsr();
	}

	/**
	 * <summary>This module works with Linux Infrared Remote Control (LIRC) in
	 * order to emit/receive IR remotes keys or to emit/receive IR information
	 * to/from an other Nao.</summary>
	 */
	public class ALInfrared {

		/**
		 * <summary> Local Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALInfraredProxy(String[] pbroker) {
			return requestAction("ALInfrared/ALInfraredProxy/" + "'" + pbroker
					+ "'");
		}

		/**
		 * <summary> Remote Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALInfraredProxy(String pip, int pport) {
			return requestAction("ALInfrared/ALInfraredProxy/" + "'" + pip
					+ "'" + "," + pport);
		}

		/**
		 * <summary> Gets the underlying generic proxy </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getGenericProxy() {
			return requestAction("ALInfrared/getGenericProxy/()");
		}

		/**
		 * <summary> Wait for the end of a long running method that was called
		 * using 'post' </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post'
		 * @param timeoutPeriod
		 *            The timeout period in ms. To wait indefinately, use a
		 *            timeoutPeriod of zero. <br />
		 *            <i>Actual SDK return value:</i>True if the timeout period
		 *            terminated. False if the method returned.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject wait(final int id, final int timeoutperiod) {
			return requestAction("ALInfrared/wait/" + id + "," + timeoutperiod);
		}

		/**
		 * <summary> stop a long running method that was called using 'post'
		 * </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stop(final int id) {
			return requestAction("ALInfrared/stop/" + id);
		}

		/**
		 * <summary> isRunning </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isRunning(final int id) {
			return requestAction("ALInfrared/isRunning/" + id);
		}

		/**
		 * <summary> Called during polling in order to update further
		 * information. </summary>
		 * 
		 * @param Keyname
		 *            Name of the next remote control key to reccord. <br />
		 *            <i>Actual SDK return value:</i> Returns the last message
		 *            given by irrecord (LIRC program to record IR remote
		 *            controls).
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject confRemoteRecordAddKey(final String keyname) {
			return requestAction("ALInfrared/confRemoteRecordAddKey/" + "'"
					+ keyname + "'");
		}

		/**
		 * <summary> Kill irrecord (LIRC program to record IR remote controls).
		 * </summary> <br />
		 * <i>Actual SDK return value:</i> Returns \"#BEGIN#\" to tell the web
		 * page to start from the beginning.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject confRemoteRecordCancel() {
			return requestAction("ALInfrared/confRemoteRecordCancel/()");
		}

		/**
		 * <summary> Called when the user validate a new key name. </summary> <br />
		 * <i>Actual SDK return value:</i> Returns the last message given by
		 * irrecord (LIRC program to record IR remote controls).
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject confRemoteRecordGetStatus() {
			return requestAction("ALInfrared/confRemoteRecordGetStatus/()");
		}

		/**
		 * <summary> Called when the user click on NEXT. </summary> <br />
		 * <i>Actual SDK return value:</i> Returns the last message given by
		 * irrecord (lirc program to record IR remote control).
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject confRemoteRecordNext() {
			return requestAction("ALInfrared/confRemoteRecordNext/()");
		}

		/**
		 * <summary> Rewrite the LIRC daemon configuration file (lircd.conf)
		 * with everyremotes configuration concatenated, and reload it in LIRC
		 * daemons </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject confRemoteRecordSave() {
			return requestAction("ALInfrared/confRemoteRecordSave/()");
		}

		/**
		 * <summary> Start remote record process. </summary>
		 * 
		 * @param Rm_name
		 *            Name of the remote control to reccord.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject confRemoteRecordStart(final String rm_name) {
			return requestAction("ALInfrared/confRemoteRecordStart/" + "'"
					+ rm_name + "'");
		}

		/**
		 * <summary> Exits and unregisters the module. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject exit() {
			return requestAction("ALInfrared/exit/()");
		}

		/**
		 * <summary> Gets the name of the parent broker. </summary> <br />
		 * <i>Actual SDK return value:</i> The name of the parent broker.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getBrokerName() {
			return requestAction("ALInfrared/getBrokerName/()");
		}

		/**
		 * <summary> Retrieves a method's description. </summary>
		 * 
		 * @param methodName
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A structure containing the
		 *            method's description.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodHelp(final String methodname) {
			return requestAction("ALInfrared/getMethodHelp/" + "'" + methodname
					+ "'");
		}

		/**
		 * <summary> Retrieves the module's method list. </summary> <br />
		 * <i>Actual SDK return value:</i> An array of method names.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodList() {
			return requestAction("ALInfrared/getMethodList/()");
		}

		/**
		 * <summary> Retrieves the module's description. </summary> <br />
		 * <i>Actual SDK return value:</i> A structure describing the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getModuleHelp() {
			return requestAction("ALInfrared/getModuleHelp/()");
		}

		/**
		 * <summary> Gets the method usage string. This summarise how to use the
		 * method. </summary>
		 * 
		 * @param name
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A string that summarises
		 *            the usage of the method.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getUsage(final String name) {
			return requestAction("ALInfrared/getUsage/" + "'" + name + "'");
		}

		/**
		 * <summary> Init IR reception (connect as a client to the LIRC daemon).
		 * </summary>
		 * 
		 * @param RepeatThreshold
		 *            Give the keep-pressing threshold after which the
		 *            repetition of a key is taken into consideration.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject initReception(final int repeatthreshold) {
			return requestAction("ALInfrared/initReception/" + repeatthreshold);
		}

		/**
		 * <summary> Just a ping. Always returns true </summary> <br />
		 * <i>Actual SDK return value:</i> returns true
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ping() {
			return requestAction("ALInfrared/ping/()");
		}

		/**
		 * <summary> Send 4 octets by IR. </summary>
		 * 
		 * @param Data_IR
		 *            4 octets to send through IR.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject send32(final String data_ir) {
			return requestAction("ALInfrared/send32/" + "'" + data_ir + "'");
		}

		/**
		 * <summary> Send 4 octets by IR. </summary>
		 * 
		 * @param Octet1
		 *            Octet 1 to send through IR.
		 * @param Octet2
		 *            Octet 2 to send through IR.
		 * @param Octet3
		 *            Octet 3 to send through IR.
		 * @param Octet4
		 *            Octet 4 to send through IR.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject send32(final int octet1, final int octet2,
				final int octet3, final int octet4) {
			return requestAction("ALInfrared/send32/" + octet1 + "," + octet2
					+ "," + octet3 + "," + octet4);
		}

		/**
		 * <summary> Send 1 octet by IR. </summary>
		 * 
		 * @param Octet
		 *            octet to send through IR.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject send8(final int octet) {
			return requestAction("ALInfrared/send8/" + octet);
		}

		/**
		 * <summary> Send an IP by IR. </summary>
		 * 
		 * @param IP
		 *            IP adress to send through IR.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject sendIpAddress(final String ip) {
			return requestAction("ALInfrared/sendIpAddress/" + "'" + ip + "'");
		}

		/**
		 * <summary> Simulate a remote control (Nao as a remote control).
		 * </summary>
		 * 
		 * @param Remote
		 *            IR remote control name.
		 * @param Key
		 *            IR remote control key name.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject sendRemoteKey(final String remote, final String key) {
			return requestAction("ALInfrared/sendRemoteKey/" + "'" + remote
					+ "'" + "+'" + key + "'");
		}

		/**
		 * <summary> Returns the version of the module. </summary> <br />
		 * <i>Actual SDK return value:</i> A string containing the version of
		 * the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject version() {
			return requestAction("ALInfrared/version/()");
		}
	}

	public ALInfrared createALInfrared() {
		return new ALInfrared();
	}

	/**
	 * <summary>ALLandMarkDetection is a module which detects and recognizes
	 * Naomarks. The output value is written in ALMemory in the LandmarkDetected
	 * variable.</summary>
	 */
	public class ALLandMarkDetection {

		/**
		 * <summary> Local Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALLandMarkDetectionProxy(String[] pbroker) {
			return requestAction("ALLandMarkDetection/ALLandMarkDetectionProxy/"
					+ "'" + pbroker + "'");
		}

		/**
		 * <summary> Remote Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALLandMarkDetectionProxy(String pip, int pport) {
			return requestAction("ALLandMarkDetection/ALLandMarkDetectionProxy/"
					+ "'" + pip + "'" + "," + pport);
		}

		/**
		 * <summary> Gets the underlying generic proxy </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getGenericProxy() {
			return requestAction("ALLandMarkDetection/getGenericProxy/()");
		}

		/**
		 * <summary> Wait for the end of a long running method that was called
		 * using 'post' </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post'
		 * @param timeoutPeriod
		 *            The timeout period in ms. To wait indefinately, use a
		 *            timeoutPeriod of zero. <br />
		 *            <i>Actual SDK return value:</i>True if the timeout period
		 *            terminated. False if the method returned.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject wait(final int id, final int timeoutperiod) {
			return requestAction("ALLandMarkDetection/wait/" + id + ","
					+ timeoutperiod);
		}

		/**
		 * <summary> stop a long running method that was called using 'post'
		 * </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stop(final int id) {
			return requestAction("ALLandMarkDetection/stop/" + id);
		}

		/**
		 * <summary> isRunning </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isRunning(final int id) {
			return requestAction("ALLandMarkDetection/isRunning/" + id);
		}

		/**
		 * <summary> Exits and unregisters the module. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject exit() {
			return requestAction("ALLandMarkDetection/exit/()");
		}

		/**
		 * <summary> Gets the name of the parent broker. </summary> <br />
		 * <i>Actual SDK return value:</i> The name of the parent broker.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getBrokerName() {
			return requestAction("ALLandMarkDetection/getBrokerName/()");
		}

		/**
		 * <summary> Gets the current period. </summary> <br />
		 * <i>Actual SDK return value:</i> Refresh period (in milliseconds).
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getCurrentPeriod() {
			return requestAction("ALLandMarkDetection/getCurrentPeriod/()");
		}

		/**
		 * <summary> Gets the current precision. </summary> <br />
		 * <i>Actual SDK return value:</i> Precision of the extractor.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getCurrentPrecision() {
			return requestAction("ALLandMarkDetection/getCurrentPrecision/()");
		}

		/**
		 * <summary> Retrieves a method's description. </summary>
		 * 
		 * @param methodName
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A structure containing the
		 *            method's description.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodHelp(final String methodname) {
			return requestAction("ALLandMarkDetection/getMethodHelp/" + "'"
					+ methodname + "'");
		}

		/**
		 * <summary> Retrieves the module's method list. </summary> <br />
		 * <i>Actual SDK return value:</i> An array of method names.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodList() {
			return requestAction("ALLandMarkDetection/getMethodList/()");
		}

		/**
		 * <summary> Retrieves the module's description. </summary> <br />
		 * <i>Actual SDK return value:</i> A structure describing the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getModuleHelp() {
			return requestAction("ALLandMarkDetection/getModuleHelp/()");
		}

		/**
		 * <summary> Gets the period for a specific subscription. </summary>
		 * 
		 * @param name
		 *            Name of the module which has subscribed. <br />
		 *            <i>Actual SDK return value:</i> Refresh period (in
		 *            milliseconds).
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMyPeriod(final String name) {
			return requestAction("ALLandMarkDetection/getMyPeriod/" + "'"
					+ name + "'");
		}

		/**
		 * <summary> Gets the precision for a specific subscription. </summary>
		 * 
		 * @param name
		 *            name of the module which has subscribed <br />
		 *            <i>Actual SDK return value:</i> precision of the extractor
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMyPrecision(final String name) {
			return requestAction("ALLandMarkDetection/getMyPrecision/" + "'"
					+ name + "'");
		}

		/**
		 * <summary> Get the list of values updated in ALMemory. </summary> <br />
		 * <i>Actual SDK return value:</i> Array of values updated by this
		 * extractor in ALMemory
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getOutputNames() {
			return requestAction("ALLandMarkDetection/getOutputNames/()");
		}

		/**
		 * <summary> Gets the parameters given by the module. </summary> <br />
		 * <i>Actual SDK return value:</i> Array of names and parameters of all
		 * subscribers.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getSubscribersInfo() {
			return requestAction("ALLandMarkDetection/getSubscribersInfo/()");
		}

		/**
		 * <summary> Gets the method usage string. This summarise how to use the
		 * method. </summary>
		 * 
		 * @param name
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A string that summarises
		 *            the usage of the method.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getUsage(final String name) {
			return requestAction("ALLandMarkDetection/getUsage/" + "'" + name
					+ "'");
		}

		/**
		 * <summary> Just a ping. Always returns true </summary> <br />
		 * <i>Actual SDK return value:</i> returns true
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ping() {
			return requestAction("ALLandMarkDetection/ping/()");
		}

		/**
		 * <summary> protected method </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject run() {
			return requestAction("ALLandMarkDetection/run/()");
		}

		/**
		 * <summary> Subscribes to the extractor. This causes the extractor to
		 * start writing information to memory using the keys described by
		 * getOutputNames(). These can be accessed in memory using
		 * ALMemory.getData(\"keyName\"). In many cases you can avoid calling
		 * subscribe on the extractor by just calling
		 * ALMemory.subscribeToEvent() supplying a callback method. This will
		 * automatically subscribe to the extractor for you. </summary>
		 * 
		 * @param name
		 *            Name of the module which subscribes.
		 * @param period
		 *            Refresh period (in milliseconds) if relevant.
		 * @param precision
		 *            Precision of the extractor if relevant.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject subscribe(final String name, final int period,
				final float precision) {
			return requestAction("ALLandMarkDetection/subscribe/" + "'" + name
					+ "'" + "," + period + "," + precision);
		}

		/**
		 * <summary> Subscribes to the extractor. This causes the extractor to
		 * start writing information to memory using the keys described by
		 * getOutputNames(). These can be accessed in memory using
		 * ALMemory.getData(\"keyName\"). In many cases you can avoid calling
		 * subscribe on the extractor by just calling
		 * ALMemory.subscribeToEvent() supplying a callback method. This will
		 * automatically subscribe to the extractor for you. </summary>
		 * 
		 * @param name
		 *            Name of the module which subscribes.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject subscribe(final String name) {
			return requestAction("ALLandMarkDetection/subscribe/" + "'" + name
					+ "'");
		}

		/**
		 * <summary> Unsubscribes from the extractor. </summary>
		 * 
		 * @param name
		 *            Name of the module which had subscribed.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject unsubscribe(final String name) {
			return requestAction("ALLandMarkDetection/unsubscribe/" + "'"
					+ name + "'");
		}

		/**
		 * <summary> Updates the period if relevant. </summary>
		 * 
		 * @param name
		 *            Name of the module which has subscribed.
		 * @param period
		 *            Refresh period (in milliseconds).
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject updatePeriod(final String name, final int period) {
			return requestAction("ALLandMarkDetection/updatePeriod/" + "'"
					+ name + "'" + "," + period);
		}

		/**
		 * <summary> Updates the precision if relevant. </summary>
		 * 
		 * @param name
		 *            Name of the module which has subscribed.
		 * @param precision
		 *            Precision of the extractor.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject updatePrecision(final String name,
				final float precision) {
			return requestAction("ALLandMarkDetection/updatePrecision/" + "'"
					+ name + "'" + "," + precision);
		}

		/**
		 * <summary> Returns the version of the module. </summary> <br />
		 * <i>Actual SDK return value:</i> A string containing the version of
		 * the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject version() {
			return requestAction("ALLandMarkDetection/version/()");
		}
	}

	public ALLandMarkDetection createALLandMarkDetection() {
		return new ALLandMarkDetection();
	}

	/**
	 * <summary>Allow control over Hokuyo laser when available on Nao's
	 * head.</summary>
	 */
	public class ALLaser {

		/**
		 * <summary> Local Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALLaserProxy(String[] pbroker) {
			return requestAction("ALLaser/ALLaserProxy/" + "'" + pbroker + "'");
		}

		/**
		 * <summary> Remote Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALLaserProxy(String pip, int pport) {
			return requestAction("ALLaser/ALLaserProxy/" + "'" + pip + "'"
					+ "," + pport);
		}

		/**
		 * <summary> Gets the underlying generic proxy </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getGenericProxy() {
			return requestAction("ALLaser/getGenericProxy/()");
		}

		/**
		 * <summary> Wait for the end of a long running method that was called
		 * using 'post' </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post'
		 * @param timeoutPeriod
		 *            The timeout period in ms. To wait indefinately, use a
		 *            timeoutPeriod of zero. <br />
		 *            <i>Actual SDK return value:</i>True if the timeout period
		 *            terminated. False if the method returned.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject wait(final int id, final int timeoutperiod) {
			return requestAction("ALLaser/wait/" + id + "," + timeoutperiod);
		}

		/**
		 * <summary> stop a long running method that was called using 'post'
		 * </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stop(final int id) {
			return requestAction("ALLaser/stop/" + id);
		}

		/**
		 * <summary> isRunning </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isRunning(final int id) {
			return requestAction("ALLaser/isRunning/" + id);
		}

		/**
		 * <summary> Exits and unregisters the module. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject exit() {
			return requestAction("ALLaser/exit/()");
		}

		/**
		 * <summary> Gets the name of the parent broker. </summary> <br />
		 * <i>Actual SDK return value:</i> The name of the parent broker.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getBrokerName() {
			return requestAction("ALLaser/getBrokerName/()");
		}

		/**
		 * <summary> Retrieves a method's description. </summary>
		 * 
		 * @param methodName
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A structure containing the
		 *            method's description.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodHelp(final String methodname) {
			return requestAction("ALLaser/getMethodHelp/" + "'" + methodname
					+ "'");
		}

		/**
		 * <summary> Retrieves the module's method list. </summary> <br />
		 * <i>Actual SDK return value:</i> An array of method names.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodList() {
			return requestAction("ALLaser/getMethodList/()");
		}

		/**
		 * <summary> Retrieves the module's description. </summary> <br />
		 * <i>Actual SDK return value:</i> A structure describing the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getModuleHelp() {
			return requestAction("ALLaser/getModuleHelp/()");
		}

		/**
		 * <summary> Gets the method usage string. This summarise how to use the
		 * method. </summary>
		 * 
		 * @param name
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A string that summarises
		 *            the usage of the method.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getUsage(final String name) {
			return requestAction("ALLaser/getUsage/" + "'" + name + "'");
		}

		/**
		 * <summary> Disable laser light </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject laserOFF() {
			return requestAction("ALLaser/laserOFF/()");
		}

		/**
		 * <summary> Enable laser light and sampling </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject laserON() {
			return requestAction("ALLaser/laserON/()");
		}

		/**
		 * <summary> Just a ping. Always returns true </summary> <br />
		 * <i>Actual SDK return value:</i> returns true
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ping() {
			return requestAction("ALLaser/ping/()");
		}

		/**
		 * <summary> Set detection threshold of the laser </summary>
		 * 
		 * @param length_min_l
		 *            int containing the min length that the laser will
		 *            detect(mm), this value must be upper than 20 mm
		 * @param length_max_l
		 *            int containing the max length that the laser will
		 *            detect(mm), this value must be lower than 5600 mm
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setDetectingLength(final String length_min_l,
				final String length_max_l) {
			return requestAction("ALLaser/setDetectingLength/" + "'"
					+ length_min_l + "'" + "+'" + length_max_l + "'");
		}

		/**
		 * <summary> Set openning angle of the laser </summary>
		 * 
		 * @param angle_min_f
		 *            float containing the min value in rad, this value must be
		 *            upper than -2.35619449
		 * @param angle_max_f
		 *            float containing the max value in rad, this value must be
		 *            lower than 2.092349795
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setOpeningAngle(final String angle_min_f,
				final String angle_max_f) {
			return requestAction("ALLaser/setOpeningAngle/" + "'" + angle_min_f
					+ "'" + "+'" + angle_max_f + "'");
		}

		/**
		 * <summary> Returns the version of the module. </summary> <br />
		 * <i>Actual SDK return value:</i> A string containing the version of
		 * the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject version() {
			return requestAction("ALLaser/version/()");
		}
	}

	public ALLaser createALLaser() {
		return new ALLaser();
	}

	/**
	 * <summary>ALlauncher allows to link dynamicaly with library, run
	 * executable, unload library, check if module is loaded...</summary>
	 */
	public class ALLauncher {

		/**
		 * <summary> Local Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALLauncherProxy(String[] pbroker) {
			return requestAction("ALLauncher/ALLauncherProxy/" + "'" + pbroker
					+ "'");
		}

		/**
		 * <summary> Remote Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALLauncherProxy(String pip, int pport) {
			return requestAction("ALLauncher/ALLauncherProxy/" + "'" + pip
					+ "'" + "," + pport);
		}

		/**
		 * <summary> Gets the underlying generic proxy </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getGenericProxy() {
			return requestAction("ALLauncher/getGenericProxy/()");
		}

		/**
		 * <summary> Wait for the end of a long running method that was called
		 * using 'post' </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post'
		 * @param timeoutPeriod
		 *            The timeout period in ms. To wait indefinately, use a
		 *            timeoutPeriod of zero. <br />
		 *            <i>Actual SDK return value:</i>True if the timeout period
		 *            terminated. False if the method returned.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject wait(final int id, final int timeoutperiod) {
			return requestAction("ALLauncher/wait/" + id + "," + timeoutperiod);
		}

		/**
		 * <summary> stop a long running method that was called using 'post'
		 * </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stop(final int id) {
			return requestAction("ALLauncher/stop/" + id);
		}

		/**
		 * <summary> isRunning </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isRunning(final int id) {
			return requestAction("ALLauncher/isRunning/" + id);
		}

		/**
		 * <summary> Exits and unregisters the module. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject exit() {
			return requestAction("ALLauncher/exit/()");
		}

		/**
		 * <summary> Gets the name of the parent broker. </summary> <br />
		 * <i>Actual SDK return value:</i> The name of the parent broker.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getBrokerName() {
			return requestAction("ALLauncher/getBrokerName/()");
		}

		/**
		 * <summary> get the list of modules loaded on the robot and connected
		 * on the robot </summary> <br />
		 * <i>Actual SDK return value:</i> array of present modules
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getGlobalModuleList() {
			return requestAction("ALLauncher/getGlobalModuleList/()");
		}

		/**
		 * <summary> Retrieves a method's description. </summary>
		 * 
		 * @param methodName
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A structure containing the
		 *            method's description.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodHelp(final String methodname) {
			return requestAction("ALLauncher/getMethodHelp/" + "'" + methodname
					+ "'");
		}

		/**
		 * <summary> Retrieves the module's method list. </summary> <br />
		 * <i>Actual SDK return value:</i> An array of method names.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodList() {
			return requestAction("ALLauncher/getMethodList/()");
		}

		/**
		 * <summary> Retrieves the module's description. </summary> <br />
		 * <i>Actual SDK return value:</i> A structure describing the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getModuleHelp() {
			return requestAction("ALLauncher/getModuleHelp/()");
		}

		/**
		 * <summary> Gets the method usage string. This summarise how to use the
		 * method. </summary>
		 * 
		 * @param name
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A string that summarises
		 *            the usage of the method.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getUsage(final String name) {
			return requestAction("ALLauncher/getUsage/" + "'" + name + "'");
		}

		/**
		 * <summary> Tests the existence of an active module in the global
		 * system (in same executable or in another executable of the
		 * distributed system) </summary>
		 * 
		 * @param strPartOfModuleName
		 *            a part of the name of the module to test existence <br />
		 *            <i>Actual SDK return value:</i> the returned value is true
		 *            if this module is present
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isModulePresent(final String strpartofmodulename) {
			return requestAction("ALLauncher/isModulePresent/" + "'"
					+ strpartofmodulename + "'");
		}

		/**
		 * <summary> runs an executable and connect it to current broker
		 * (executable) </summary>
		 * 
		 * @param moduleName
		 *            the name of the modulePack to launch or the name of the
		 *            script file to execute <br />
		 *            <i>Actual SDK return value:</i> true if ok
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject launchExecutable(final String modulename) {
			return requestAction("ALLauncher/launchExecutable/" + "'"
					+ modulename + "'");
		}

		/**
		 * <summary> Loads dynamicaly a module </summary>
		 * 
		 * @param moduleName
		 *            the name of the modulePack to launch or the name of the
		 *            python script to evaluate <br />
		 *            <i>Actual SDK return value:</i> list of modules loaded
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject launchLocal(final String modulename) {
			return requestAction("ALLauncher/launchLocal/" + "'" + modulename
					+ "'");
		}

		/**
		 * <summary> Import a python module </summary>
		 * 
		 * @param moduleName
		 *            the name of the module to launch <br />
		 *            <i>Actual SDK return value:</i> true if ok
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject launchPythonModule(final String modulename) {
			return requestAction("ALLauncher/launchPythonModule/" + "'"
					+ modulename + "'");
		}

		/**
		 * <summary> runs a script connected the current broker </summary>
		 * 
		 * @param moduleName
		 *            the name of the script to launch (python) <br />
		 *            <i>Actual SDK return value:</i> true if ok
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject launchScript(final String modulename) {
			return requestAction("ALLauncher/launchScript/" + "'" + modulename
					+ "'");
		}

		/**
		 * <summary> Just a ping. Always returns true </summary> <br />
		 * <i>Actual SDK return value:</i> returns true
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ping() {
			return requestAction("ALLauncher/ping/()");
		}

		/**
		 * <summary> Returns the version of the module. </summary> <br />
		 * <i>Actual SDK return value:</i> A string containing the version of
		 * the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject version() {
			return requestAction("ALLauncher/version/()");
		}
	}

	public ALLauncher createALLauncher() {
		return new ALLauncher();
	}

	/**
	 * <summary>ALLeds contains helper methods for controlling the Light Emiting
	 * Devices (LEDs).</summary>
	 */
	public class ALLeds {

		/**
		 * <summary> Local Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALLedsProxy(String[] pbroker) {
			return requestAction("ALLeds/ALLedsProxy/" + "'" + pbroker + "'");
		}

		/**
		 * <summary> Remote Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALLedsProxy(String pip, int pport) {
			return requestAction("ALLeds/ALLedsProxy/" + "'" + pip + "'" + ","
					+ pport);
		}

		/**
		 * <summary> Gets the underlying generic proxy </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getGenericProxy() {
			return requestAction("ALLeds/getGenericProxy/()");
		}

		/**
		 * <summary> Wait for the end of a long running method that was called
		 * using 'post' </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post'
		 * @param timeoutPeriod
		 *            The timeout period in ms. To wait indefinately, use a
		 *            timeoutPeriod of zero. <br />
		 *            <i>Actual SDK return value:</i>True if the timeout period
		 *            terminated. False if the method returned.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject wait(final int id, final int timeoutperiod) {
			return requestAction("ALLeds/wait/" + id + "," + timeoutperiod);
		}

		/**
		 * <summary> stop a long running method that was called using 'post'
		 * </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stop(final int id) {
			return requestAction("ALLeds/stop/" + id);
		}

		/**
		 * <summary> isRunning </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isRunning(final int id) {
			return requestAction("ALLeds/isRunning/" + id);
		}

		/**
		 * <summary> Makes a group name for ease of setting multiple LEDs.
		 * </summary>
		 * 
		 * @param groupName
		 *            The name of the group.
		 * @param ledNames
		 *            A vector of the names of the LEDs in the group.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject createGroup(final String groupname,
				final String lednames) {
			return requestAction("ALLeds/createGroup/" + "'" + groupname + "'"
					+ "+'" + lednames + "'");
		}

		/**
		 * <summary> An animation to show a direction with the ears. </summary>
		 * 
		 * @param degrees
		 *            The angle you want to show in degrees (int). 0 is up, 90
		 *            is forwards, 180 is down and 270 is back.
		 * @param duration
		 *            The duration in seconds of the animation.
		 * @param leaveOnAtEnd
		 *            If true the last led is left on at the end of the
		 *            animation.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject earLedsSetAngle(final int degrees,
				final float duration, final boolean leaveonatend) {
			return requestAction("ALLeds/earLedsSetAngle/" + degrees + ","
					+ duration + "," + leaveonatend);
		}

		/**
		 * <summary> Exits and unregisters the module. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject exit() {
			return requestAction("ALLeds/exit/()");
		}

		/**
		 * <summary> Sets the intensity of a LED or Group of LEDs within a given
		 * time. </summary>
		 * 
		 * @param name
		 *            The name of the LED or Group.
		 * @param intensity
		 *            The intensity of the LED or Group (a value between 0 and
		 *            1).
		 * @param duration
		 *            The duration of the fade in seconds
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject fade(final String name, final float intensity,
				final float duration) {
			return requestAction("ALLeds/fade/" + "'" + name + "'" + ","
					+ intensity + "," + duration);
		}

		/**
		 * <summary> Chain a list of color for a device, as the motion.doMove
		 * command. </summary>
		 * 
		 * @param name
		 *            The name of the LED or Group.
		 * @param rgbList
		 *            List of RGB led value, RGB as seen in hexa-decimal:
		 *            0x00RRGGBB.
		 * @param timeList
		 *            List of time to go to given intensity.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject fadeListRGB(final String name, final String rgblist,
				final String timelist) {
			return requestAction("ALLeds/fadeListRGB/" + "'" + name + "'"
					+ "+'" + rgblist + "'" + "+'" + timelist + "'");
		}

		/**
		 * <summary> Sets the intensity of a led. If the name matches an RGB
		 * led, all channels are set to the same value. </summary>
		 * 
		 * @param name
		 *            The name of the LED or Group.
		 * @param rgb
		 *            The RGB value led, RGB as seen in hexa-decimal:
		 *            0x00RRGGBB.
		 * @param duration
		 *            Time used to fade in seconds.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject fadeRGB(final String name, final int rgb,
				final float duration) {
			return requestAction("ALLeds/fadeRGB/" + "'" + name + "'" + ","
					+ rgb + "," + duration);
		}

		/**
		 * <summary> Gets the name of the parent broker. </summary> <br />
		 * <i>Actual SDK return value:</i> The name of the parent broker.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getBrokerName() {
			return requestAction("ALLeds/getBrokerName/()");
		}

		/**
		 * <summary> Gets the intensity of a LED or device </summary>
		 * 
		 * @param name
		 *            The name of the LED or Group. <br />
		 *            <i>Actual SDK return value:</i> The intensity of the LED
		 *            or Group.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getIntensity(final String name) {
			return requestAction("ALLeds/getIntensity/" + "'" + name + "'");
		}

		/**
		 * <summary> Retrieves a method's description. </summary>
		 * 
		 * @param methodName
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A structure containing the
		 *            method's description.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodHelp(final String methodname) {
			return requestAction("ALLeds/getMethodHelp/" + "'" + methodname
					+ "'");
		}

		/**
		 * <summary> Retrieves the module's method list. </summary> <br />
		 * <i>Actual SDK return value:</i> An array of method names.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodList() {
			return requestAction("ALLeds/getMethodList/()");
		}

		/**
		 * <summary> Retrieves the module's description. </summary> <br />
		 * <i>Actual SDK return value:</i> A structure describing the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getModuleHelp() {
			return requestAction("ALLeds/getModuleHelp/()");
		}

		/**
		 * <summary> Gets the method usage string. This summarise how to use the
		 * method. </summary>
		 * 
		 * @param name
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A string that summarises
		 *            the usage of the method.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getUsage(final String name) {
			return requestAction("ALLeds/getUsage/" + "'" + name + "'");
		}

		/**
		 * <summary> Lists the devices in the group. </summary>
		 * 
		 * @param groupName
		 *            The name of the Group. <br />
		 *            <i>Actual SDK return value:</i> A vector of string device
		 *            names.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject listGroup(final String groupname) {
			return requestAction("ALLeds/listGroup/" + "'" + groupname + "'");
		}

		/**
		 * <summary> Lists available group names. </summary> <br />
		 * <i>Actual SDK return value:</i> A vector of group names.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject listGroups() {
			return requestAction("ALLeds/listGroups/()");
		}

		/**
		 * <summary> Lists the devices aliased by a short LED name. </summary>
		 * 
		 * @param arg1
		 *            arg <br />
		 *            <i>Actual SDK return value:</i> A vector of device names.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject listLED(final String arg1) {
			return requestAction("ALLeds/listLED/" + "'" + arg1 + "'");
		}

		/**
		 * <summary> Lists the short LED names. </summary> <br />
		 * <i>Actual SDK return value:</i> A vector of LED names.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject listLEDs() {
			return requestAction("ALLeds/listLEDs/()");
		}

		/**
		 * <summary> Switch to a minimum intensity a LED or Group of LEDs.
		 * </summary>
		 * 
		 * @param name
		 *            The name of the LED or Group.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject off(final String name) {
			return requestAction("ALLeds/off/" + "'" + name + "'");
		}

		/**
		 * <summary> Switch to a maximum intensity a LED or Group of LEDs.
		 * </summary>
		 * 
		 * @param name
		 *            The name of the LED or Group.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject on(final String name) {
			return requestAction("ALLeds/on/" + "'" + name + "'");
		}

		/**
		 * <summary> Just a ping. Always returns true </summary> <br />
		 * <i>Actual SDK return value:</i> returns true
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ping() {
			return requestAction("ALLeds/ping/()");
		}

		/**
		 * <summary> Launch a random animation in eyes </summary>
		 * 
		 * @param duration
		 *            Approximate duration of the animation in seconds.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject randomEyes(final float duration) {
			return requestAction("ALLeds/randomEyes/" + duration);
		}

		/**
		 * <summary> Launch a green/yellow/red rasta animation on all body.
		 * </summary>
		 * 
		 * @param duration
		 *            Approximate duration of the animation in seconds.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject rasta(final float duration) {
			return requestAction("ALLeds/rasta/" + duration);
		}

		/**
		 * <summary> Launch a rotation using the leds of the eyes. </summary>
		 * 
		 * @param rgb
		 *            the RGB value led, RGB as seen in hexa-decimal:
		 *            0x00RRGGBB.
		 * @param timeForRotation
		 *            Approximate time to make one turn.
		 * @param totalDuration
		 *            Approximate duration of the animation in seconds.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject rotateEyes(final int rgb,
				final float timeforrotation, final float totalduration) {
			return requestAction("ALLeds/rotateEyes/" + rgb + ","
					+ timeforrotation + "," + totalduration);
		}

		/**
		 * <summary> Sets the intensity of a LED or Group of LEDs. </summary>
		 * 
		 * @param name
		 *            The name of the LED or Group.
		 * @param intensity
		 *            The intensity of the LED or Group (a value between 0 and
		 *            1).
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setIntensity(final String name, final float intensity) {
			return requestAction("ALLeds/setIntensity/" + "'" + name + "'"
					+ "," + intensity);
		}

		/**
		 * <summary> Returns the version of the module. </summary> <br />
		 * <i>Actual SDK return value:</i> A string containing the version of
		 * the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject version() {
			return requestAction("ALLeds/version/()");
		}
	}

	public ALLeds createALLeds() {
		return new ALLeds();
	}

	/**
	 * <summary>This module allows you log errors, warnings, and info to syslog,
	 * stdout or a file. The verbosity level and/or filter allow you to
	 * customize the output.</summary>
	 */
	public class ALLogger {

		/**
		 * <summary> Local Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALLoggerProxy(String[] pbroker) {
			return requestAction("ALLogger/ALLoggerProxy/" + "'" + pbroker
					+ "'");
		}

		/**
		 * <summary> Remote Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALLoggerProxy(String pip, int pport) {
			return requestAction("ALLogger/ALLoggerProxy/" + "'" + pip + "'"
					+ "," + pport);
		}

		/**
		 * <summary> Gets the underlying generic proxy </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getGenericProxy() {
			return requestAction("ALLogger/getGenericProxy/()");
		}

		/**
		 * <summary> Wait for the end of a long running method that was called
		 * using 'post' </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post'
		 * @param timeoutPeriod
		 *            The timeout period in ms. To wait indefinately, use a
		 *            timeoutPeriod of zero. <br />
		 *            <i>Actual SDK return value:</i>True if the timeout period
		 *            terminated. False if the method returned.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject wait(final int id, final int timeoutperiod) {
			return requestAction("ALLogger/wait/" + id + "," + timeoutperiod);
		}

		/**
		 * <summary> stop a long running method that was called using 'post'
		 * </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stop(final int id) {
			return requestAction("ALLogger/stop/" + id);
		}

		/**
		 * <summary> isRunning </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isRunning(final int id) {
			return requestAction("ALLogger/isRunning/" + id);
		}

		/**
		 * <summary> Log a debug message. </summary>
		 * 
		 * @param moduleName
		 *            Name of the module.
		 * @param message
		 *            Log Message.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject debug(final String modulename, final String message) {
			return requestAction("ALLogger/debug/" + "'" + modulename + "'"
					+ "+'" + message + "'");
		}

		/**
		 * <summary> Log an error. </summary>
		 * 
		 * @param moduleName
		 *            Name of the module.
		 * @param message
		 *            Log Message.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject error(final String modulename, final String message) {
			return requestAction("ALLogger/error/" + "'" + modulename + "'"
					+ "+'" + message + "'");
		}

		/**
		 * <summary> Exits and unregisters the module. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject exit() {
			return requestAction("ALLogger/exit/()");
		}

		/**
		 * <summary> Log a fatal error. </summary>
		 * 
		 * @param moduleName
		 *            Name of the module.
		 * @param message
		 *            Log Message.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject fatal(final String modulename, final String message) {
			return requestAction("ALLogger/fatal/" + "'" + modulename + "'"
					+ "+'" + message + "'");
		}

		/**
		 * <summary> Gets the name of the parent broker. </summary> <br />
		 * <i>Actual SDK return value:</i> The name of the parent broker.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getBrokerName() {
			return requestAction("ALLogger/getBrokerName/()");
		}

		/**
		 * <summary> Retrieves a method's description. </summary>
		 * 
		 * @param methodName
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A structure containing the
		 *            method's description.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodHelp(final String methodname) {
			return requestAction("ALLogger/getMethodHelp/" + "'" + methodname
					+ "'");
		}

		/**
		 * <summary> Retrieves the module's method list. </summary> <br />
		 * <i>Actual SDK return value:</i> An array of method names.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodList() {
			return requestAction("ALLogger/getMethodList/()");
		}

		/**
		 * <summary> Retrieves the module's description. </summary> <br />
		 * <i>Actual SDK return value:</i> A structure describing the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getModuleHelp() {
			return requestAction("ALLogger/getModuleHelp/()");
		}

		/**
		 * <summary> Gets the method usage string. This summarise how to use the
		 * method. </summary>
		 * 
		 * @param name
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A string that summarises
		 *            the usage of the method.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getUsage(final String name) {
			return requestAction("ALLogger/getUsage/" + "'" + name + "'");
		}

		/**
		 * <summary> Log a info message. </summary>
		 * 
		 * @param moduleName
		 *            Name of the module.
		 * @param message
		 *            Log Message.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject info(final String modulename, final String message) {
			return requestAction("ALLogger/info/" + "'" + modulename + "'"
					+ "+'" + message + "'");
		}

		/**
		 * <summary> Allows the logger to store logs in a file. Warning: this is
		 * not recomended on Nao. </summary>
		 * 
		 * @param fileName
		 *            The fileName to use. Relative to the user naoqi folder.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject logInFile(final String filename) {
			return requestAction("ALLogger/logInFile/" + "'" + filename + "'");
		}

		/**
		 * <summary> Publish logs to a Log Forwarder. Pass an empty string in
		 * order to use the default value: \"tcp://localhost:50998\" </summary>
		 * 
		 * @param inputAddress
		 *            Desired input ZMQ address of the Log Forwarder.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject logInForwarder(final String inputaddress) {
			return requestAction("ALLogger/logInForwarder/" + "'"
					+ inputaddress + "'");
		}

		/**
		 * <summary> Allows the logger to output logs to the standard output.
		 * </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject logInStd() {
			return requestAction("ALLogger/logInStd/()");
		}

		/**
		 * <summary> Allows the logger to output logs to the system log. (Linux
		 * only) </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject logInSys() {
			return requestAction("ALLogger/logInSys/()");
		}

		/**
		 * <summary> DEPRECIATED: Log a low priority debug message. Use debug
		 * instead. </summary>
		 * 
		 * @param moduleName
		 *            Name of the module.
		 * @param message
		 *            Log Message.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject lowDebug(final String modulename, final String message) {
			return requestAction("ALLogger/lowDebug/" + "'" + modulename + "'"
					+ "+'" + message + "'");
		}

		/**
		 * <summary> DEPRECIATED: Log a low priority information message. Use
		 * info instead. </summary>
		 * 
		 * @param moduleName
		 *            Name of the module.
		 * @param message
		 *            Log Message.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject lowInfo(final String modulename, final String message) {
			return requestAction("ALLogger/lowInfo/" + "'" + modulename + "'"
					+ "+'" + message + "'");
		}

		/**
		 * <summary> Just a ping. Always returns true </summary> <br />
		 * <i>Actual SDK return value:</i> returns true
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ping() {
			return requestAction("ALLogger/ping/()");
		}

		/**
		 * <summary> Unsubscribe specified id from connection list. </summary>
		 * 
		 * @param id
		 *            Id used to register the handler.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject removeHandler(final String id) {
			return requestAction("ALLogger/removeHandler/" + "'" + id + "'");
		}

		/**
		 * <summary> output a simple line separator </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject separator() {
			return requestAction("ALLogger/separator/()");
		}

		/**
		 * <summary> Creates a filter. Only messages containing the string will
		 * be logged. Use an empty string to remove the filter. </summary>
		 * 
		 * @param filter
		 *            The string that defines the filter.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setFilter(final String filter) {
			return requestAction("ALLogger/setFilter/" + "'" + filter + "'");
		}

		/**
		 * <summary> set verbosity: debug, info, warning, error, fatal, silent.
		 * Default is info </summary>
		 * 
		 * @param verbosity
		 *            verbosity value
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setVerbosity(final String verbosity) {
			return requestAction("ALLogger/setVerbosity/" + "'" + verbosity
					+ "'");
		}

		/**
		 * <summary> Returns the version of the module. </summary> <br />
		 * <i>Actual SDK return value:</i> A string containing the version of
		 * the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject version() {
			return requestAction("ALLogger/version/()");
		}

		/**
		 * <summary> Log a warning. </summary>
		 * 
		 * @param moduleName
		 *            Name of the module.
		 * @param message
		 *            Log Message.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject warn(final String modulename, final String message) {
			return requestAction("ALLogger/warn/" + "'" + modulename + "'"
					+ "+'" + message + "'");
		}
	}

	public ALLogger createALLogger() {
		return new ALLogger();
	}

	/**
	 * <summary>ALMemory is a class that implements an event-based storage
	 * base.</summary>
	 */
	public class ALMemory {

		/**
		 * <summary> Local Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALMemoryProxy(String[] pbroker) {
			return requestAction("ALMemory/ALMemoryProxy/" + "'" + pbroker
					+ "'");
		}

		/**
		 * <summary> Remote Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALMemoryProxy(String pip, int pport) {
			return requestAction("ALMemory/ALMemoryProxy/" + "'" + pip + "'"
					+ "," + pport);
		}

		/**
		 * <summary> Gets the underlying generic proxy </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getGenericProxy() {
			return requestAction("ALMemory/getGenericProxy/()");
		}

		/**
		 * <summary> Wait for the end of a long running method that was called
		 * using 'post' </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post'
		 * @param timeoutPeriod
		 *            The timeout period in ms. To wait indefinately, use a
		 *            timeoutPeriod of zero. <br />
		 *            <i>Actual SDK return value:</i>True if the timeout period
		 *            terminated. False if the method returned.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject wait(final int id, final int timeoutperiod) {
			return requestAction("ALMemory/wait/" + id + "," + timeoutperiod);
		}

		/**
		 * <summary> stop a long running method that was called using 'post'
		 * </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stop(final int id) {
			return requestAction("ALMemory/stop/" + id);
		}

		/**
		 * <summary> isRunning </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isRunning(final int id) {
			return requestAction("ALMemory/isRunning/" + id);
		}

		/**
		 * <summary> Triggers a Synchronizer. </summary>
		 * 
		 * @param dataName
		 *            Name of the subscribed data.
		 * @param data
		 *            Value of the the subscribed data
		 * @param message
		 *            The message give when subscribing.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject dataChanged(final String dataname, final String data,
				final String message) {
			return requestAction("ALMemory/dataChanged/" + "'" + dataname + "'"
					+ "+'" + data + "'" + "+'" + message + "'");
		}

		/**
		 * <summary> Declare event to allow subscribe on the event </summary>
		 * 
		 * @param eventName
		 *            Event name
		 * @param name
		 *            Name of extractor that create event
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject declareEvent(final String eventname, final String name) {
			return requestAction("ALMemory/declareEvent/" + "'" + eventname
					+ "'" + "+'" + name + "'");
		}

		/**
		 * <summary> Declare event to allow subscribe on the event </summary>
		 * 
		 * @param eventName
		 *            Event name
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject declareEvent(final String eventname) {
			return requestAction("ALMemory/declareEvent/" + "'" + eventname
					+ "'");
		}

		/**
		 * <summary> Exits and unregisters the module. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject exit() {
			return requestAction("ALMemory/exit/()");
		}

		/**
		 * <summary> Gets the name of the parent broker. </summary> <br />
		 * <i>Actual SDK return value:</i> The name of the parent broker.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getBrokerName() {
			return requestAction("ALMemory/getBrokerName/()");
		}

		/**
		 * <summary> Allows programs and modules to get data stored in ALMemory.
		 * </summary>
		 * 
		 * @param name
		 *            Name of the data.
		 * @param duration
		 *            All the data stored for \"duration\" seconds will be
		 *            returned. If 0 returns the lastest value. If -1 returns
		 *            all stored values. <br />
		 *            <i>Actual SDK return value:</i> an array containing all
		 *            the retrieved data
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getData(final String name, final int duration) {
			return requestAction("ALMemory/getData/" + "'" + name + "'" + ","
					+ duration);
		}

		/**
		 * <summary> Allows programs and modules to get data stored in ALMemory.
		 * </summary>
		 * 
		 * @param name
		 *            Name of the data. <br />
		 *            <i>Actual SDK return value:</i> an array containing all
		 *            the retrieved data
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getData(final String name) {
			return requestAction("ALMemory/getData/" + "'" + name + "'");
		}

		/**
		 * <summary> Allows programs to get an array containing all the data's
		 * name. </summary> <br />
		 * <i>Actual SDK return value:</i> return an array of data's string
		 * name.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getDataListName() {
			return requestAction("ALMemory/getDataListName/()");
		}

		/**
		 * <summary> Allows programs and modules to retrieve data stored in
		 * ALMemory, but waits until the data has changed. </summary>
		 * 
		 * @param name
		 *            Name of the data.
		 * @param duration
		 *            All the data stored for \"duration\" seconds will be
		 *            returned. If 0 returns the lastest value. If -1 returns
		 *            all stored values. <br />
		 *            <i>Actual SDK return value:</i> an array containing all
		 *            the retrieved data
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getDataOnChange(final String name, final int duration) {
			return requestAction("ALMemory/getDataOnChange/" + "'" + name + "'"
					+ "," + duration);
		}

		/**
		 * <summary> get pointer on 32bits data. Carrefull dangerous function.
		 * It's an heavy call, make it only function at initialization, not at
		 * every cycle </summary>
		 * 
		 * @param name
		 *            Name of the data. <br />
		 *            <i>Actual SDK return value:</i> a pointer converted to int
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getDataPtr(final String name) {
			return requestAction("ALMemory/getDataPtr/" + "'" + name + "'");
		}

		/**
		 * <summary> return all application event </summary> <br />
		 * <i>Actual SDK return value:</i> return an array of data's string
		 * name.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getEventList() {
			return requestAction("ALMemory/getEventList/()");
		}

		/**
		 * <summary> Get event list generated by extractor </summary>
		 * 
		 * @param name
		 *            Name of extractor that create event <br />
		 *            <i>Actual SDK return value:</i> return an array of data's
		 *            string name.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getExtractorEvent(final String name) {
			return requestAction("ALMemory/getExtractorEvent/" + "'" + name
					+ "'");
		}

		/**
		 * <summary> Allows programs and modules to retrieve multiple datas
		 * stored in ALMemory at the same time. </summary>
		 * 
		 * @param name
		 *            an array containing the datas' name and their durations. <br />
		 *            <i>Actual SDK return value:</i> an array containing all
		 *            the retrieved values of requested data
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getListData(final String name) {
			return requestAction("ALMemory/getListData/" + "'" + name + "'");
		}

		/**
		 * <summary> Retrieves a method's description. </summary>
		 * 
		 * @param methodName
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A structure containing the
		 *            method's description.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodHelp(final String methodname) {
			return requestAction("ALMemory/getMethodHelp/" + "'" + methodname
					+ "'");
		}

		/**
		 * <summary> Retrieves the module's method list. </summary> <br />
		 * <i>Actual SDK return value:</i> An array of method names.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodList() {
			return requestAction("ALMemory/getMethodList/()");
		}

		/**
		 * <summary> return all application event </summary> <br />
		 * <i>Actual SDK return value:</i> return an array of data's string
		 * name.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMicroEventList() {
			return requestAction("ALMemory/getMicroEventList/()");
		}

		/**
		 * <summary> Retrieves the module's description. </summary> <br />
		 * <i>Actual SDK return value:</i> A structure describing the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getModuleHelp() {
			return requestAction("ALMemory/getModuleHelp/()");
		}

		/**
		 * <summary> Returns the names of subscribers </summary>
		 * 
		 * @param name
		 *            Name of the event or micro-event <br />
		 *            <i>Actual SDK return value:</i> List of subscriber names
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getSubscribers(final String name) {
			return requestAction("ALMemory/getSubscribers/" + "'" + name + "'");
		}

		/**
		 * <summary> Return variable type </summary>
		 * 
		 * @param name
		 *            Name of the variable <br />
		 *            <i>Actual SDK return value:</i> String type: Data,
		 *            ShmData, Event, MicroEvent
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getType(final String name) {
			return requestAction("ALMemory/getType/" + "'" + name + "'");
		}

		/**
		 * <summary> Gets the method usage string. This summarise how to use the
		 * method. </summary>
		 * 
		 * @param name
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A string that summarises
		 *            the usage of the method.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getUsage(final String name) {
			return requestAction("ALMemory/getUsage/" + "'" + name + "'");
		}

		/**
		 * <summary> Allows any program to insert data into ALMemory. Overloaded
		 * method for 32bits type optimization </summary>
		 * 
		 * @param name
		 *            Name of the data to be inserted.
		 * @param data
		 *            Value of the data
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject insertData(final String name, final int data) {
			return requestAction("ALMemory/insertData/" + "'" + name + "'"
					+ "," + data);
		}

		/**
		 * <summary> Allows any program to insert data into ALMemory. Overloaded
		 * method for type optimization </summary>
		 * 
		 * @param name
		 *            Name of the data to be inserted.
		 * @param data
		 *            Value of the data
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject insertData(final String name, final float data) {
			return requestAction("ALMemory/insertData/" + "'" + name + "'"
					+ "," + data);
		}

		/**
		 * <summary> Allows any program to insert data into ALMemory. </summary>
		 * 
		 * @param name
		 *            Name of the data to be inserted.
		 * @param data
		 *            Value of the data
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject insertData(final String name, final String data) {
			return requestAction("ALMemory/insertData/" + "'" + name + "'"
					+ "+'" + data + "'");
		}

		/**
		 * <summary> Allows any program to insert a list of data into ALMemory.
		 * </summary>
		 * 
		 * @param listOfInsertData
		 *            list of [Name, Value, lifespan, waitforAnswer, group] for
		 *            each data to be inserted.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject insertListData(final String listofinsertdata) {
			return requestAction("ALMemory/insertListData/" + "'"
					+ listofinsertdata + "'");
		}

		/**
		 * <summary> Insert object in ALMemory. Please use ALMemoryFastAccess
		 * </summary>
		 * 
		 * @param name
		 *            ALMemory data name
		 * @param buffer
		 *            buffer in ALValue
		 * @param bufferSize
		 *            buffer size
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject insertObject(final String name, final String buffer,
				final int buffersize) {
			return requestAction("ALMemory/insertObject/" + "'" + name + "'"
					+ "+'" + buffer + "'" + "," + buffersize);
		}

		/**
		 * <summary> Just a ping. Always returns true </summary> <br />
		 * <i>Actual SDK return value:</i> returns true
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ping() {
			return requestAction("ALMemory/ping/()");
		}

		/**
		 * <summary> Raise an event, insert data associated to event. Call user
		 * callback </summary>
		 * 
		 * @param name
		 *            Name of the event to raise.
		 * @param data
		 *            Value of the data. could be int, double, string, or an
		 *            array of any of these types.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject raiseEvent(final String name, final String data) {
			return requestAction("ALMemory/raiseEvent/" + "'" + name + "'"
					+ "+'" + data + "'");
		}

		/**
		 * <summary> Raise a micro-event, insert data associated to event. Call
		 * user callback </summary>
		 * 
		 * @param name
		 *            Name of the data to be inserted.
		 * @param data
		 *            Value of the data. could be int, double, string, or an
		 *            array of any of these types.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject raiseMicroEvent(final String name, final String data) {
			return requestAction("ALMemory/raiseMicroEvent/" + "'" + name + "'"
					+ "+'" + data + "'");
		}

		/**
		 * <summary> Allows programs and modules to retrieve data stored in
		 * ALMemory. </summary>
		 * 
		 * @param name
		 *            Name of the data to be remove.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject removeData(final String name) {
			return requestAction("ALMemory/removeData/" + "'" + name + "'");
		}

		/**
		 * <summary> Remove micro event from ALMemory. Unsubscribe subscribers.
		 * </summary>
		 * 
		 * @param name
		 *            Name of the data to remove.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject removeMicroEvent(final String name) {
			return requestAction("ALMemory/removeMicroEvent/" + "'" + name
					+ "'");
		}

		/**
		 * <summary> Subscribe to event and automaticaly launch module function
		 * that generate the event. WARNING THERE IS NO MESSAGE parameter
		 * </summary>
		 * 
		 * @param name
		 *            Event name
		 * @param moduleName
		 *            subscriber name
		 * @param callback
		 *            name of function to call when a data is changed
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject subscribeToEvent(final String name,
				final String modulename, final String callback) {
			return requestAction("ALMemory/subscribeToEvent/" + "'" + name
					+ "'" + "+'" + modulename + "'" + "+'" + callback + "'");
		}

		/**
		 * <summary> Subscribe to event and automaticaly launch module function
		 * that generate the event. WARNING THERE IS NO MESSAGE parameter
		 * </summary>
		 * 
		 * @param name
		 *            Event name
		 * @param moduleName
		 *            subscriber name
		 * @param message
		 *            message to send with callback
		 * @param callback
		 *            name of function to call when a data is changed
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject subscribeToEvent(final String name,
				final String modulename, final String message,
				final String callback) {
			return requestAction("ALMemory/subscribeToEvent/" + "'" + name
					+ "'" + "+'" + modulename + "'" + "+'" + message + "'"
					+ "+'" + callback + "'");
		}

		/**
		 * <summary> Allows modules to subscribe to a piece of data, in order to
		 * get notified when the data changes. Subscribers are called whenever
		 * the data has been set, even if the new value is the same as the
		 * previous one. </summary>
		 * 
		 * @param name
		 *            Name of the data.
		 * @param moduleName
		 *            Name of the module.
		 * @param message
		 *            message passed to the module when a notification is sent.
		 * @param callback
		 *            name of function to call when a data is changed
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject subscribeToMicroEvent(final String name,
				final String modulename, final String message,
				final String callback) {
			return requestAction("ALMemory/subscribeToMicroEvent/" + "'" + name
					+ "'" + "+'" + modulename + "'" + "+'" + message + "'"
					+ "+'" + callback + "'");
		}

		/**
		 * <summary> Informs ALMemory that a module doesn't exists anymore.
		 * </summary>
		 * 
		 * @param name
		 *            Name of the destructed module.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject unregisterModuleReference(final String name) {
			return requestAction("ALMemory/unregisterModuleReference/" + "'"
					+ name + "'");
		}

		/**
		 * <summary> Allows modules to unsubscribe from a piece of data and stop
		 * getting notified when the data changes. </summary>
		 * 
		 * @param name
		 *            Name of the data.
		 * @param moduleName
		 *            Name of the module.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject unsubscribeOnDataChange(final String name,
				final String modulename) {
			return requestAction("ALMemory/unsubscribeOnDataChange/" + "'"
					+ name + "'" + "+'" + modulename + "'");
		}

		/**
		 * <summary> Get event list generated by extractor </summary>
		 * 
		 * @param name
		 *            Event name
		 * @param moduleName
		 *            subscriber name
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject unsubscribeToEvent(final String name,
				final String modulename) {
			return requestAction("ALMemory/unsubscribeToEvent/" + "'" + name
					+ "'" + "+'" + modulename + "'");
		}

		/**
		 * <summary> Allows modules to unsubscribe from a piece of data, in
		 * order to stop getting notified when the data changes. </summary>
		 * 
		 * @param name
		 *            Name of the data.
		 * @param moduleName
		 *            Name of the module.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject unsubscribeToMicroEvent(final String name,
				final String modulename) {
			return requestAction("ALMemory/unsubscribeToMicroEvent/" + "'"
					+ name + "'" + "+'" + modulename + "'");
		}

		/**
		 * <summary> Returns the version of the module. </summary> <br />
		 * <i>Actual SDK return value:</i> A string containing the version of
		 * the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject version() {
			return requestAction("ALMemory/version/()");
		}

		/**
		 * <summary> Allows modules to subscribe to a piece of data, in order to
		 * get notified when the data changes. Subscribers are called whenever
		 * the data has been set, even if the new value is the same as the
		 * previous one. </summary>
		 * 
		 * @param dataName
		 *            Name of the data.
		 * @param condition
		 *            message passed to the module when a notification is sent.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject waitOnCondition(final String dataname,
				final String condition) {
			return requestAction("ALMemory/waitOnCondition/" + "'" + dataname
					+ "'" + "+'" + condition + "'");
		}

		/**
		 * <summary> Waits for a condition to be triggered. </summary>
		 * 
		 * @param name
		 *            Condition name
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject waitSynchronizer(final String name) {
			return requestAction("ALMemory/waitSynchronizer/" + "'" + name
					+ "'");
		}
	}

	public ALMemory createALMemory() {
		return new ALMemory();
	}

	/**
	 * <summary>ALMotion provides methods that help make Nao move. It contains
	 * commands for manipulating joint angles, joint stiffness, and a higher
	 * level API for controling walks.</summary>
	 */
	public class ALMotion {

		/**
		 * <summary> Local Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALMotionProxy(String[] pbroker) {
			return requestAction("ALMotion/ALMotionProxy/" + "'" + pbroker
					+ "'");
		}

		/**
		 * <summary> Remote Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALMotionProxy(String pip, int pport) {
			return requestAction("ALMotion/ALMotionProxy/" + "'" + pip + "'"
					+ "," + pport);
		}

		/**
		 * <summary> Gets the underlying generic proxy </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getGenericProxy() {
			return requestAction("ALMotion/getGenericProxy/()");
		}

		/**
		 * <summary> Wait for the end of a long running method that was called
		 * using 'post' </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post'
		 * @param timeoutPeriod
		 *            The timeout period in ms. To wait indefinately, use a
		 *            timeoutPeriod of zero. <br />
		 *            <i>Actual SDK return value:</i>True if the timeout period
		 *            terminated. False if the method returned.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject wait(final int id, final int timeoutperiod) {
			return requestAction("ALMotion/wait/" + id + "," + timeoutperiod);
		}

		/**
		 * <summary> stop a long running method that was called using 'post'
		 * </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stop(final int id) {
			return requestAction("ALMotion/stop/" + id);
		}

		/**
		 * <summary> isRunning </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isRunning(final int id) {
			return requestAction("ALMotion/isRunning/" + id);
		}

		/**
		 * <summary> Interpolates one or multiple joints to a target angle or
		 * along timed trajectories. This is a blocking call. </summary>
		 * 
		 * @param names
		 *            Name or names of joints, chains, \"Body\", \"BodyJoints\"
		 *            or \"BodyActuators\".
		 * @param angleLists
		 *            An angle, list of angles or list of list of angles in
		 *            radians
		 * @param timeLists
		 *            A time, list of times or list of list of times in seconds
		 * @param isAbsolute
		 *            If true, the movement is described in absolute angles,
		 *            else the angles are relative to the current angle.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject angleInterpolation(final String names,
				final String anglelists, final String timelists,
				final boolean isabsolute) {
			return requestAction("ALMotion/angleInterpolation/" + "'" + names
					+ "'" + "+'" + anglelists + "'" + "+'" + timelists + "'"
					+ "," + isabsolute);
		}

		/**
		 * <summary> Interpolates a sequence of timed angles for several motors
		 * using bezier control points. This is a blocking call. </summary>
		 * 
		 * @param jointNames
		 *            A vector of joint names
		 * @param times
		 *            An ragged ALValue matrix of floats. Each line
		 *            corresponding to a motor, and column element to a control
		 *            point.
		 * @param controlPoints
		 *            An ALValue array of arrays each containing [float angle,
		 *            Handle1, Handle2], where Handle is [int InterpolationType,
		 *            float dAngle, float dTime] descibing the handle offsets
		 *            relative to the angle and time of the point. The first
		 *            bezier param describes the handle that controls the curve
		 *            preceeding the point, the second describes the curve
		 *            following the point.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject angleInterpolationBezier(final String jointnames,
				final String times, final String controlpoints) {
			return requestAction("ALMotion/angleInterpolationBezier/" + "'"
					+ jointnames + "'" + "+'" + times + "'" + "+'"
					+ controlpoints + "'");
		}

		/**
		 * <summary> Interpolates one or multiple joints to a target angle,
		 * using a fraction of max speed. Only one target angle is allowed for
		 * each joint. This is a blocking call. </summary>
		 * 
		 * @param names
		 *            Name or names of joints, chains, \"Body\", \"BodyJoints\"
		 *            or \"BodyActuators\".
		 * @param targetAngles
		 *            An angle, or list of angles in radians
		 * @param maxSpeedFraction
		 *            A fraction.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject angleInterpolationWithSpeed(final String names,
				final String targetangles, final float maxspeedfraction) {
			return requestAction("ALMotion/angleInterpolationWithSpeed/" + "'"
					+ names + "'" + "+'" + targetangles + "'" + ","
					+ maxspeedfraction);
		}

		/**
		 * <summary> Returns true if the resources are available. </summary>
		 * 
		 * @param resourceNames
		 *            A vector of resource names such as joints <br />
		 *            <i>Actual SDK return value:</i> True if the resources are
		 *            available
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject areResourcesAvailable(final String resourcenames) {
			return requestAction("ALMotion/areResourcesAvailable/" + "'"
					+ resourcenames + "'");
		}

		/**
		 * <summary> Changes Angles. This is a non-blocking call. </summary>
		 * 
		 * @param names
		 *            The name or names of joints, chains, \"Body\",
		 *            \"BodyJoints\" or \"BodyActuators\".
		 * @param changes
		 *            One or more changes in radians
		 * @param fractionMaxSpeed
		 *            The fraction of maximum speed to use
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject changeAngles(final String names,
				final String changes, final float fractionmaxspeed) {
			return requestAction("ALMotion/changeAngles/" + "'" + names + "'"
					+ "+'" + changes + "'" + "," + fractionmaxspeed);
		}

		/**
		 * <summary> Creates a move of an end effector in cartesian space. This
		 * is a non-blocking call. </summary>
		 * 
		 * @param effectorName
		 *            Name of the effector.
		 * @param space
		 *            Task space {SPACE_TORSO = 0, SPACE_WORLD = 1, SPACE_NAO =
		 *            2}.
		 * @param positionChange
		 *            6D position change array (xd, yd, zd, wxd, wyd, wzd) in
		 *            meters and radians
		 * @param fractionMaxSpeed
		 *            The fraction of maximum speed to use
		 * @param axisMask
		 *            Axis mask. True for axes that you wish to control. e.g. 7
		 *            for position only, 56 for rotation only and 63 for both
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject changePosition(final String effectorname,
				final int space, final String positionchange,
				final float fractionmaxspeed, final int axismask) {
			return requestAction("ALMotion/changePosition/" + "'"
					+ effectorname + "'" + "," + space + "+'" + positionchange
					+ "'" + "," + fractionmaxspeed + "," + axismask);
		}

		/**
		 * <summary> Moves an end-effector to the given position and orientation
		 * transform. This is a non-blocking call. </summary>
		 * 
		 * @param chainName
		 *            Name of the chain. Could be: \"Head\", \"LArm\",\"RArm\",
		 *            \"LLeg\", \"RLeg\", \"Torso\"
		 * @param space
		 *            Task space {SPACE_TORSO = 0, SPACE_WORLD = 1, SPACE_NAO =
		 *            2}.
		 * @param transform
		 *            ALTransform arrays
		 * @param fractionMaxSpeed
		 *            The fraction of maximum speed to use
		 * @param axisMask
		 *            Axis mask. True for axes that you wish to control. e.g. 7
		 *            for position only, 56 for rotation only and 63 for both
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject changeTransform(final String chainname,
				final int space, final String transform,
				final float fractionmaxspeed, final int axismask) {
			return requestAction("ALMotion/changeTransform/" + "'" + chainname
					+ "'" + "," + space + "+'" + transform + "'" + ","
					+ fractionmaxspeed + "," + axismask);
		}

		/**
		 * <summary> Closes the hand, then cuts motor current to conserve
		 * energy. This is a blocking call. </summary>
		 * 
		 * @param handName
		 *            The name of the hand. Could be: \"RHand\" or \"LHand\"
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject closeHand(final String handname) {
			return requestAction("ALMotion/closeHand/" + "'" + handname + "'");
		}

		/**
		 * <summary> Exits and unregisters the module. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject exit() {
			return requestAction("ALMotion/exit/()");
		}

		/**
		 * <summary> Gets the angles of the joints </summary>
		 * 
		 * @param names
		 *            Names the joints, chains, \"Body\", \"BodyJoints\" or
		 *            \"BodyActuators\".
		 * @param useSensors
		 *            If true, sensor angles will be returned <br />
		 *            <i>Actual SDK return value:</i> Joint angles in radians.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getAngles(final String names, final boolean usesensors) {
			return requestAction("ALMotion/getAngles/" + "'" + names + "'"
					+ "," + usesensors);
		}

		/**
		 * <summary> Gets the name of the parent broker. </summary> <br />
		 * <i>Actual SDK return value:</i> The name of the parent broker.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getBrokerName() {
			return requestAction("ALMotion/getBrokerName/()");
		}

		/**
		 * <summary> Gets the COM of a joint, chain, \"Body\" or \"BodyJoints\".
		 * </summary>
		 * 
		 * @param pName
		 *            Name of the body which we want the mass. In chain name
		 *            case, this function give the com of the chain.
		 * @param pSpace
		 *            Task space {SPACE_TORSO = 0, SPACE_WORLD = 1, SPACE_NAO =
		 *            2}.
		 * @param pUseSensorValues
		 *            If true, the sensor values will be used to determine the
		 *            position. <br />
		 *            <i>Actual SDK return value:</i> The COM position (meter).
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getCOM(final String pname, final int pspace,
				final boolean pusesensorvalues) {
			return requestAction("ALMotion/getCOM/" + "'" + pname + "'" + ","
					+ pspace + "," + pusesensorvalues);
		}

		/**
		 * <summary> Gets the names of all the joints in the collection.
		 * </summary>
		 * 
		 * @param name
		 *            Name of a chain, \"Body\", \"BodyJoints\" or
		 *            \"BodyActuators\". <br />
		 *            <i>Actual SDK return value:</i> Vector of strings, one for
		 *            each joint in the collection
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getJointNames(final String name) {
			return requestAction("ALMotion/getJointNames/" + "'" + name + "'");
		}

		/**
		 * <summary> Get the minAngle, maxAngle, and maxChangePerCycle for a
		 * given chain in the body. </summary>
		 * 
		 * @param name
		 *            Name of a joint, chain, \"Body\", \"BodyJoints\" or
		 *            \"BodyActuators\". <br />
		 *            <i>Actual SDK return value:</i> Array of ALValue arrays
		 *            containing the minAngle, maxAngle and maxChangePerCycle
		 *            for all the joints specified.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getLimits(final String name) {
			return requestAction("ALMotion/getLimits/" + "'" + name + "'");
		}

		/**
		 * <summary> Gets the mass of a joint, chain, \"Body\" or
		 * \"BodyJoints\". </summary>
		 * 
		 * @param pName
		 *            Name of the body which we want the mass. \"Body\",
		 *            \"BodyJoints\" and \"Com\" give the total mass of nao. For
		 *            the chain, it gives the total mass of the chain. <br />
		 *            <i>Actual SDK return value:</i> The mass in kg.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMass(final String pname) {
			return requestAction("ALMotion/getMass/" + "'" + pname + "'");
		}

		/**
		 * <summary> Retrieves a method's description. </summary>
		 * 
		 * @param methodName
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A structure containing the
		 *            method's description.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodHelp(final String methodname) {
			return requestAction("ALMotion/getMethodHelp/" + "'" + methodname
					+ "'");
		}

		/**
		 * <summary> Retrieves the module's method list. </summary> <br />
		 * <i>Actual SDK return value:</i> An array of method names.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodList() {
			return requestAction("ALMotion/getMethodList/()");
		}

		/**
		 * <summary> Retrieves the module's description. </summary> <br />
		 * <i>Actual SDK return value:</i> A structure describing the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getModuleHelp() {
			return requestAction("ALMotion/getModuleHelp/()");
		}

		/**
		 * <summary> Gets a Position relative to the TASK_SPACE. </summary>
		 * 
		 * @param name
		 *            Name of the item. Could be: Head, LArm, RArm, LLeg, RLeg,
		 *            Torso, CameraTop, CameraBottom, MicroFront, MicroRear,
		 *            MicroLeft, MicroRight, Accelerometer, Gyrometer, Laser,
		 *            LFsrFR, LFsrFL, LFsrRR, LFsrRL, RFsrFR, RFsrFL, RFsrRR,
		 *            RFsrRL, USSensor1, USSensor2, USSensor3, USSensor4.
		 * @param space
		 *            Task space {SPACE_TORSO = 0, SPACE_WORLD = 1, SPACE_NAO =
		 *            2}.
		 * @param useSensorValues
		 *            If true, the sensor values will be used to determine the
		 *            position. <br />
		 *            <i>Actual SDK return value:</i> Vector containing the
		 *            Position6D using meters and radians (x, y, z, wx, wy, wz)
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getPosition(final String name, final int space,
				final boolean usesensorvalues) {
			return requestAction("ALMotion/getPosition/" + "'" + name + "'"
					+ "," + space + "," + usesensorvalues);
		}

		/**
		 * <summary> Get the robot configuration. </summary> <br />
		 * <i>Actual SDK return value:</i> ALValue arrays containing the robot
		 * parameter names and the robot parameter values.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getRobotConfig() {
			return requestAction("ALMotion/getRobotConfig/()");
		}

		/**
		 * <summary> Gets the World Absolute Robot Position. </summary>
		 * 
		 * @param useSensors
		 *            If true, use the sensor values <br />
		 *            <i>Actual SDK return value:</i> A vector containing the
		 *            World Absolute Robot Position. (Absolute Position X,
		 *            Absolute Position Y, Absolute Angle Z)
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getRobotPosition(final boolean usesensors) {
			return requestAction("ALMotion/getRobotPosition/" + usesensors);
		}

		/**
		 * <summary> Gets the World Absolute Robot Velocity. </summary> <br />
		 * <i>Actual SDK return value:</i> A vector containing the World
		 * Absolute Robot Velocity. (Absolute Velocity Translation X, Absolute
		 * Velocity Translation Y, Absolute Velocity Rotation WZ)
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getRobotVelocity() {
			return requestAction("ALMotion/getRobotVelocity/()");
		}

		/**
		 * <summary> Gets stiffness of a joint or group of joints </summary>
		 * 
		 * @param jointName
		 *            Name of the joints, chains, \"Body\", \"BodyJoints\" or
		 *            \"BodyActuators\". <br />
		 *            <i>Actual SDK return value:</i> One or more stiffnesses.
		 *            1.0 indicates maximum stiffness. 0.0 indicated minimum
		 *            stiffness
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getStiffnesses(final String jointname) {
			return requestAction("ALMotion/getStiffnesses/" + "'" + jointname
					+ "'");
		}

		/**
		 * <summary> Returns a string representation of the Model's state
		 * </summary> <br />
		 * <i>Actual SDK return value:</i> A formated string
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getSummary() {
			return requestAction("ALMotion/getSummary/()");
		}

		/**
		 * <summary> Gets an ALValue structure describing the tasks in the Task
		 * List </summary> <br />
		 * <i>Actual SDK return value:</i> An ALValue containing an ALValue for
		 * each task. The inner ALValue contains: Name, MotionID, BrokerID,
		 * Priority, Resources
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getTaskList() {
			return requestAction("ALMotion/getTaskList/()");
		}

		/**
		 * <summary> Gets an Homogenous Transform relative to the TASK_SPACE.
		 * </summary>
		 * 
		 * @param name
		 *            Name of the item. Could be: any joint or chain or sensor
		 *            (Head, LArm, RArm, LLeg, RLeg, Torso, HeadYaw, ...,
		 *            CameraTop, CameraBottom, MicroFront, MicroRear, MicroLeft,
		 *            MicroRight, Accelerometer, Gyrometer, Laser, LFsrFR,
		 *            LFsrFL, LFsrRR, LFsrRL, RFsrFR, RFsrFL, RFsrRR, RFsrRL,
		 *            USSensor1, USSensor2, USSensor3, USSensor4.
		 * @param space
		 *            Task space {SPACE_TORSO = 0, SPACE_WORLD = 1, SPACE_NAO =
		 *            2}.
		 * @param useSensorValues
		 *            If true, the sensor values will be used to determine the
		 *            position. <br />
		 *            <i>Actual SDK return value:</i> Vector of 16 floats
		 *            corresponding to the values of the matrix, line by line.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getTransform(final String name, final int space,
				final boolean usesensorvalues) {
			return requestAction("ALMotion/getTransform/" + "'" + name + "'"
					+ "," + space + "," + usesensorvalues);
		}

		/**
		 * <summary> Gets the method usage string. This summarise how to use the
		 * method. </summary>
		 * 
		 * @param name
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A string that summarises
		 *            the usage of the method.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getUsage(final String name) {
			return requestAction("ALMotion/getUsage/" + "'" + name + "'");
		}

		/**
		 * <summary> Gets if Arms Motions are enabled during the Walk Process.
		 * </summary> <br />
		 * <i>Actual SDK return value:</i> True Arm Motions are controlled by
		 * the Walk Task.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getWalkArmsEnable() {
			return requestAction("ALMotion/getWalkArmsEnable/()");
		}

		/**
		 * <summary> Kills all tasks. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject killAll() {
			return requestAction("ALMotion/killAll/()");
		}

		/**
		 * <summary> Kills a motion task. </summary>
		 * 
		 * @param motionTaskID
		 *            TaskID of the motion task you want to kill. <br />
		 *            <i>Actual SDK return value:</i> Return true if the
		 *            specified motionTaskId has been killed.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject killTask(final int motiontaskid) {
			return requestAction("ALMotion/killTask/" + motiontaskid);
		}

		/**
		 * <summary> Kills all tasks that use any of the resources given.
		 * </summary>
		 * 
		 * @param resourceNames
		 *            A vector of resource joint names
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject killTasksUsingResources(final String resourcenames) {
			return requestAction("ALMotion/killTasksUsingResources/" + "'"
					+ resourcenames + "'");
		}

		/**
		 * <summary> Emergency Stop on Walk task: This method will end the walk
		 * task brutally, without attempting to return to a balanced state. If
		 * Nao has one foot in the air, he could easily fall. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject killWalk() {
			return requestAction("ALMotion/killWalk/()");
		}

		/**
		 * <summary> Opens the hand, then cuts motor current to conserve energy.
		 * This is a blocking call. </summary>
		 * 
		 * @param handName
		 *            The name of the hand. Could be: \"RHand or \"LHand\"
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject openHand(final String handname) {
			return requestAction("ALMotion/openHand/" + "'" + handname + "'");
		}

		/**
		 * <summary> Just a ping. Always returns true </summary> <br />
		 * <i>Actual SDK return value:</i> returns true
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ping() {
			return requestAction("ALMotion/ping/()");
		}

		/**
		 * <summary> Moves an end-effector to the given position and orientation
		 * over time. This is a blocking call. </summary>
		 * 
		 * @param chainName
		 *            Name of the chain. Could be: \"Head\", \"LArm\", \"RArm\",
		 *            \"LLeg\", \"RLeg\", \"Torso\"
		 * @param space
		 *            Task space {SPACE_TORSO = 0, SPACE_WORLD = 1, SPACE_NAO =
		 *            2}.
		 * @param path
		 *            Vector of 6D position arrays (x,y,z,wx,wy,wz) in meters
		 *            and radians
		 * @param axisMask
		 *            Axis mask. True for axes that you wish to control. e.g. 7
		 *            for position only, 56 for rotation only and 63 for both
		 * @param durations
		 *            Vector of times in seconds corresponding to the path
		 *            points
		 * @param isAbsolute
		 *            If true, the movement is absolute else relative
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject positionInterpolation(final String chainname,
				final int space, final String path, final int axismask,
				final String durations, final boolean isabsolute) {
			return requestAction("ALMotion/positionInterpolation/" + "'"
					+ chainname + "'" + "," + space + "+'" + path + "'" + ","
					+ axismask + "+'" + durations + "'" + "," + isabsolute);
		}

		/**
		 * <summary> Sets angles. This is a non-blocking call. </summary>
		 * 
		 * @param names
		 *            The name or names of joints, chains, \"Body\",
		 *            \"BodyJoints\" or \"BodyActuators\".
		 * @param angles
		 *            One or more angles in radians
		 * @param fractionMaxSpeed
		 *            The fraction of maximum speed to use
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setAngles(final String names, final String angles,
				final float fractionmaxspeed) {
			return requestAction("ALMotion/setAngles/" + "'" + names + "'"
					+ "+'" + angles + "'" + "," + fractionmaxspeed);
		}

		/**
		 * <summary> Internal Use. </summary>
		 * 
		 * @param config
		 *            Internal: An array of ALValues [i][0]: name, [i][1]: value
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setMotionConfig(final String config) {
			return requestAction("ALMotion/setMotionConfig/" + "'" + config
					+ "'");
		}

		/**
		 * <summary> Moves an end-effector to the given position and
		 * orientation. This is a non-blocking call. </summary>
		 * 
		 * @param chainName
		 *            Name of the chain. Could be: \"Head\", \"LArm\",\"RArm\",
		 *            \"LLeg\", \"RLeg\", \"Torso\"
		 * @param space
		 *            Task space {SPACE_TORSO = 0, SPACE_WORLD = 1, SPACE_NAO =
		 *            2}.
		 * @param position
		 *            6D position array (x,y,z,wx,wy,wz) in meters and radians
		 * @param fractionMaxSpeed
		 *            The fraction of maximum speed to use
		 * @param axisMask
		 *            Axis mask. True for axes that you wish to control. e.g. 7
		 *            for position only, 56 for rotation only and 63 for both
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setPosition(final String chainname, final int space,
				final String position, final float fractionmaxspeed,
				final int axismask) {
			return requestAction("ALMotion/setPosition/" + "'" + chainname
					+ "'" + "," + space + "+'" + position + "'" + ","
					+ fractionmaxspeed + "," + axismask);
		}

		/**
		 * <summary> Sets the stiffness of one or more joints. This is a
		 * non-blocking call. </summary>
		 * 
		 * @param names
		 *            Names of joints, chains, \"Body\", \"BodyJoints\" or
		 *            \"BodyActuators\".
		 * @param stiffnesses
		 *            One or more stiffnesses between zero and one.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setStiffnesses(final String names,
				final String stiffnesses) {
			return requestAction("ALMotion/setStiffnesses/" + "'" + names + "'"
					+ "," + stiffnesses + "");
		}

		/**
		 * <summary> Moves an end-effector to the given position and orientation
		 * transform. This is a non-blocking call. </summary>
		 * 
		 * @param chainName
		 *            Name of the chain. Could be: \"Head\", \"LArm\",\"RArm\",
		 *            \"LLeg\", \"RLeg\", \"Torso\"
		 * @param space
		 *            Task space {SPACE_TORSO = 0, SPACE_WORLD = 1, SPACE_NAO =
		 *            2}.
		 * @param transform
		 *            ALTransform arrays
		 * @param fractionMaxSpeed
		 *            The fraction of maximum speed to use
		 * @param axisMask
		 *            Axis mask. True for axes that you wish to control. e.g. 7
		 *            for position only, 56 for rotation only and 63 for both
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setTransform(final String chainname, final int space,
				final String transform, final float fractionmaxspeed,
				final int axismask) {
			return requestAction("ALMotion/setTransform/" + "'" + chainname
					+ "'" + "," + space + "+'" + transform + "'" + ","
					+ fractionmaxspeed + "," + axismask);
		}

		/**
		 * <summary> Sets if Arms Motions are enabled during the Walk Process.
		 * </summary>
		 * 
		 * @param leftArmEnable
		 *            if true Left Arm motions are controlled by the Walk Task
		 * @param rightArmEnable
		 *            if true Right Arm mMotions are controlled by the Walk Task
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setWalkArmsEnable(final boolean leftarmenable,
				final boolean rightarmenable) {
			return requestAction("ALMotion/setWalkArmsEnable/" + leftarmenable
					+ "," + rightarmenable);
		}

		/**
		 * <summary> Makes Nao walk at the given velocity. This is a
		 * non-blocking call. </summary>
		 * 
		 * @param x
		 *            Fraction of MaxStepX. Use negative for backwards. [-1.0 to
		 *            1.0]
		 * @param y
		 *            Fraction of MaxStepY. Use negative for right. [-1.0 to
		 *            1.0]
		 * @param theta
		 *            Fraction of MaxStepTheta. Use negative for clockwise [-1.0
		 *            to 1.0]
		 * @param frequency
		 *            Fraction of MaxStepFrequency [0.0 to 1.0]
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setWalkTargetVelocity(final float x, final float y,
				final float theta, final float frequency) {
			return requestAction("ALMotion/setWalkTargetVelocity/" + x + ","
					+ y + "," + theta + "," + frequency);
		}

		/**
		 * <summary> Makes Nao do a single step. This is a blocking call.
		 * </summary>
		 * 
		 * @param legName
		 *            name of the leg to move('LLeg'or 'RLeg')
		 * @param x
		 *            Position along X axis of the leg relative to the other Leg
		 *            in meters. Must be less than MaxStepX
		 * @param y
		 *            Position along Y axis of the leg relative to the other Leg
		 *            in meters. Must be less than MaxStepY
		 * @param theta
		 *            Orientation round Z axis of the leg relative to the other
		 *            leg in radians. Must be less than MaxStepX
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stepTo(final String legname, final float x,
				final float y, final float theta) {
			return requestAction("ALMotion/stepTo/" + "'" + legname + "'" + ","
					+ x + "," + y + "," + theta);
		}

		/**
		 * <summary> Interpolates one or multiple joints to a target stiffness
		 * or along timed trajectories of stiffness. This is a blocking call.
		 * </summary>
		 * 
		 * @param names
		 *            Name or names of joints, chains, \"Body\", \"BodyJoints\"
		 *            or \"BodyActuators\".
		 * @param stiffnessLists
		 *            An stiffness, list of stiffnesses or list of list of
		 *            stiffnesses
		 * @param timeLists
		 *            A time, list of times or list of list of times.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stiffnessInterpolation(final String names,
				final String stiffnesslists, final String timelists) {
			return requestAction("ALMotion/stiffnessInterpolation/" + "'"
					+ names + "'" + "+'" + stiffnesslists + "'" + "+'"
					+ timelists + "'");
		}

		/**
		 * <summary> Moves an end-effector to the given position and orientation
		 * over time using homogenous transforms to describe the positions or
		 * changes. This is a blocking call. </summary>
		 * 
		 * @param chainName
		 *            Name of the chain. Could be: \"Head\", \"LArm\",\"RArm\",
		 *            \"LLeg\", \"RLeg\", \"Torso\"
		 * @param space
		 *            Task space {SPACE_TORSO = 0, SPACE_WORLD = 1, SPACE_NAO =
		 *            2}.
		 * @param path
		 *            Vector of ALTransform arrays
		 * @param axisMask
		 *            Axis mask. True for axes that you wish to control. e.g. 7
		 *            for position only, 56 for rotation only and 63 for both
		 * @param duration
		 *            Vector of times in seconds corresponding to the path
		 *            points
		 * @param isAbsolute
		 *            If true, the movement is absolute else relative
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject transformInterpolation(final String chainname,
				final int space, final String path, final int axismask,
				final String duration, final boolean isabsolute) {
			return requestAction("ALMotion/transformInterpolation/" + "'"
					+ chainname + "'" + "," + space + "+'" + path + "'" + ","
					+ axismask + "+'" + duration + "'" + "," + isabsolute);
		}

		/**
		 * <summary> Update the target to follow by the head of NAO. </summary>
		 * 
		 * @param pTargetPositionWy
		 *            The target position wy in SPACE_NAO
		 * @param pTargetPositionWz
		 *            The target position wz in SPACE_NAO
		 * @param pTimeSinceDetectionMs
		 *            The time in Ms since the target was detected
		 * @param pUseOfWholeBody
		 *            If true, the target is follow in cartesian space by the
		 *            Head with whole Body constraints.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject updateTrackerTarget(final float ptargetpositionwy,
				final float ptargetpositionwz, final int ptimesincedetectionms,
				final boolean puseofwholebody) {
			return requestAction("ALMotion/updateTrackerTarget/"
					+ ptargetpositionwy + "," + ptargetpositionwz + ","
					+ ptimesincedetectionms + "," + puseofwholebody);
		}

		/**
		 * <summary> Returns the version of the module. </summary> <br />
		 * <i>Actual SDK return value:</i> A string containing the version of
		 * the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject version() {
			return requestAction("ALMotion/version/()");
		}

		/**
		 * <summary> Waits until the WalkTask is finished: This method can be
		 * used to block your script/code execution until the walk task is
		 * totally finished. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject waitUntilWalkIsFinished() {
			return requestAction("ALMotion/waitUntilWalkIsFinished/()");
		}

		/**
		 * <summary> Return True if Walk is Active. </summary> <br />
		 * <i>Actual SDK return value:</i> True Arm Motions are controlled by
		 * the Walk Task.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject walkIsActive() {
			return requestAction("ALMotion/walkIsActive/()");
		}

		/**
		 * <summary> Makes Nao walk to the given relative Position. This is a
		 * blocking call. </summary>
		 * 
		 * @param x
		 *            Distance along the X axis in meters.
		 * @param y
		 *            Distance along the Y axis in meters.
		 * @param theta
		 *            Rotation around the Z axis in radians [-3.1415 to 3.1415].
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject walkTo(final float x, final float y, final float theta) {
			return requestAction("ALMotion/walkTo/" + x + "," + y + "," + theta);
		}

		/**
		 * <summary> UserFriendly Whole Body API: enable Whole Body Balancer.
		 * It's a Generalized Inverse Kinematics which deals with cartesian
		 * control, balance, redundancy and task priority. The main goal is to
		 * generate and stabilized consistent motions without precomputed
		 * trajectories and adapt nao's behaviour to the situation. The
		 * generalized inverse kinematic problem takes in account equality
		 * constraints (keep foot fix), inequality constraints (joint limits,
		 * balance, ...) and quadratic minimization (cartesian / articular
		 * desired trajectories). We solve each step a quadratic programming on
		 * the robot. </summary>
		 * 
		 * @param isEnabled
		 *            Active / Disactive Whole Body Balancer.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject wbEnable(final boolean isenabled) {
			return requestAction("ALMotion/wbEnable/" + isenabled);
		}

		/**
		 * <summary> UserFriendly Whole Body API: enable to keep balance in
		 * support polygon. </summary>
		 * 
		 * @param isEnable
		 *            Enable Nao to keep balance.
		 * @param supportLeg
		 *            Name of the support leg: \"Legs\", \"LLeg\", \"RLeg\".
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject wbEnableBalanceConstraint(final boolean isenable,
				final String supportleg) {
			return requestAction("ALMotion/wbEnableBalanceConstraint/"
					+ isenable + "+'" + supportleg + "'");
		}

		/**
		 * <summary> UserFriendly Whole Body API: enable whole body cartesian
		 * control of an effector. </summary>
		 * 
		 * @param effectorName
		 *            Name of the effector : \"Head\", \"LArm\" or \"RArm\". Nao
		 *            goes to posture init. He manages his balance and keep foot
		 *            fix. \"Head\" is controlled in rotation. \"LArm\" and
		 *            \"RArm\" are controlled in position.
		 * @param isEnabled
		 *            Active / Disactive Effector Control.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject wbEnableEffectorControl(final String effectorname,
				final boolean isenabled) {
			return requestAction("ALMotion/wbEnableEffectorControl/" + "'"
					+ effectorname + "'" + "," + isenabled);
		}

		/**
		 * <summary> UserFriendly Whole Body API: set the foot state: fixed
		 * foot, constrained in a plane or free. </summary>
		 * 
		 * @param stateName
		 *            Name of the foot state. \"Fixed\" set the foot fixed.
		 *            \"Plane\" constrained the Foot in the plane. \"Free\" set
		 *            the foot free.
		 * @param supportLeg
		 *            Name of the foot. \"LLeg\", \"RLeg\" or \"Legs\".
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject wbFootState(final String statename,
				final String supportleg) {
			return requestAction("ALMotion/wbFootState/" + "'" + statename
					+ "'" + "+'" + supportleg + "'");
		}

		/**
		 * <summary> UserFriendly Whole Body API: set new target for controlled
		 * effector. This is a non-blocking call. </summary>
		 * 
		 * @param effectorName
		 *            Name of the effector : \"Head\", \"LArm\" or \"RArm\". Nao
		 *            goes to posture init. He manages his balance and keep foot
		 *            fix. \"Head\" is controlled in rotation. \"LArm\" and
		 *            \"RArm\" are controlled in position.
		 * @param targetCoordinate
		 *            \"Head\" is controlled in rotation (WX, WY, WZ). \"LArm\"
		 *            and \"RArm\" are controlled in position (X, Y, Z).
		 *            TargetCoordinate must be absolute and expressed in
		 *            SPACE_NAO. If the desired position/orientation is
		 *            unfeasible, target is resize to the nearest feasible
		 *            motion.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject wbSetEffectorControl(final String effectorname,
				final String targetcoordinate) {
			return requestAction("ALMotion/wbSetEffectorControl/" + "'"
					+ effectorname + "'" + "+'" + targetcoordinate + "'");
		}
	}

	public ALMotion createALMotion() {
		return new ALMotion();
	}

	/**
	 * <summary>ALMotionRecorder is a module giving the possibility to record
	 * Nao's motors poses. A first possibility is to record periodically, ie. a
	 * pose is stored every t seconds. Another possibility is to use an
	 * interactive mode where the user choses when a poses must be
	 * stored.</summary>
	 */
	public class ALMotionRecorder {

		/**
		 * <summary> Local Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALMotionRecorderProxy(String[] pbroker) {
			return requestAction("ALMotionRecorder/ALMotionRecorderProxy/"
					+ "'" + pbroker + "'");
		}

		/**
		 * <summary> Remote Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALMotionRecorderProxy(String pip, int pport) {
			return requestAction("ALMotionRecorder/ALMotionRecorderProxy/"
					+ "'" + pip + "'" + "," + pport);
		}

		/**
		 * <summary> Gets the underlying generic proxy </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getGenericProxy() {
			return requestAction("ALMotionRecorder/getGenericProxy/()");
		}

		/**
		 * <summary> Wait for the end of a long running method that was called
		 * using 'post' </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post'
		 * @param timeoutPeriod
		 *            The timeout period in ms. To wait indefinately, use a
		 *            timeoutPeriod of zero. <br />
		 *            <i>Actual SDK return value:</i>True if the timeout period
		 *            terminated. False if the method returned.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject wait(final int id, final int timeoutperiod) {
			return requestAction("ALMotionRecorder/wait/" + id + ","
					+ timeoutperiod);
		}

		/**
		 * <summary> stop a long running method that was called using 'post'
		 * </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stop(final int id) {
			return requestAction("ALMotionRecorder/stop/" + id);
		}

		/**
		 * <summary> isRunning </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isRunning(final int id) {
			return requestAction("ALMotionRecorder/isRunning/" + id);
		}

		/**
		 * <summary> Called by ALMemory when subcription data is updated.
		 * </summary>
		 * 
		 * @param dataName
		 *            Name of the subscribed data.
		 * @param data
		 *            Value of the the subscribed data
		 * @param message
		 *            The message give when subscribing.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject dataChanged(final String dataname, final String data,
				final String message) {
			return requestAction("ALMotionRecorder/dataChanged/" + "'"
					+ dataname + "'" + "+'" + data + "'" + "+'" + message + "'");
		}

		/**
		 * <summary> Exits and unregisters the module. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject exit() {
			return requestAction("ALMotionRecorder/exit/()");
		}

		/**
		 * <summary> Gets the name of the parent broker. </summary> <br />
		 * <i>Actual SDK return value:</i> The name of the parent broker.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getBrokerName() {
			return requestAction("ALMotionRecorder/getBrokerName/()");
		}

		/**
		 * <summary> Retrieves a method's description. </summary>
		 * 
		 * @param methodName
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A structure containing the
		 *            method's description.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodHelp(final String methodname) {
			return requestAction("ALMotionRecorder/getMethodHelp/" + "'"
					+ methodname + "'");
		}

		/**
		 * <summary> Retrieves the module's method list. </summary> <br />
		 * <i>Actual SDK return value:</i> An array of method names.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodList() {
			return requestAction("ALMotionRecorder/getMethodList/()");
		}

		/**
		 * <summary> Retrieves the module's description. </summary> <br />
		 * <i>Actual SDK return value:</i> A structure describing the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getModuleHelp() {
			return requestAction("ALMotionRecorder/getModuleHelp/()");
		}

		/**
		 * <summary> Gets the method usage string. This summarise how to use the
		 * method. </summary>
		 * 
		 * @param name
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A string that summarises
		 *            the usage of the method.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getUsage(final String name) {
			return requestAction("ALMotionRecorder/getUsage/" + "'" + name
					+ "'");
		}

		/**
		 * <summary> Just a ping. Always returns true </summary> <br />
		 * <i>Actual SDK return value:</i> returns true
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ping() {
			return requestAction("ALMotionRecorder/ping/()");
		}

		/**
		 * <summary> Start recording the motion in an interactive mode
		 * </summary>
		 * 
		 * @param jointsToRecord
		 *            Names of joints that must be recorded
		 * @param nbPoses
		 *            Default number of poses to record
		 * @param extensionAllowed
		 *            Set to true to ignore nbPoses and keep recording new poses
		 *            as long as record is not manually stopped
		 * @param mode
		 *            Indicates which interactive mode must be used. 1 : Use
		 *            rigth bumper to enslave and left bumper to store the pose
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject startInteractiveRecording(
				final String jointstorecord, final int nbposes,
				final boolean extensionallowed, final int mode) {
			return requestAction("ALMotionRecorder/startInteractiveRecording/"
					+ "'" + jointstorecord + "'" + "," + nbposes + ","
					+ extensionallowed + "," + mode);
		}

		/**
		 * <summary> Start recording the motion in a periodic mode </summary>
		 * 
		 * @param jointsToRecord
		 *            Names of joints that must be recorded
		 * @param nbPoses
		 *            Default number of poses to record
		 * @param extensionAllowed
		 *            set to true to ignore nbPoses and keep recording new poses
		 *            as long as record is not manually stopped
		 * @param timeStep
		 *            Time in seconds to wait between two poses
		 * @param jointsToReplay
		 *            Names of joints that must be replayed
		 * @param replayData
		 *            An ALValue holding data for replayed joints. It holds two
		 *            ALValues. The first one is an AlValue where each line
		 *            corresponds to a joint, and column elements are times of
		 *            control points The second one is also an ALValue where
		 *            each line corresponds to a joint, but column elements are
		 *            arrays containing [float angle, Handle1, Handle2]
		 *            elements, where Handle is [int InterpolationType, float
		 *            dAngle, float dTime] describing the handle offsets
		 *            relative to the angle and time of the point. The first
		 *            bezier param describes the handle that controls the curve
		 *            preceding the point, the second describes the curve
		 *            following the point.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject startPeriodicRecording(final String jointstorecord,
				final int nbposes, final boolean extensionallowed,
				final float timestep, final String jointstoreplay,
				final String replaydata) {
			return requestAction("ALMotionRecorder/startPeriodicRecording/"
					+ "'" + jointstorecord + "'" + "," + nbposes + ","
					+ extensionallowed + "," + timestep + "+'" + jointstoreplay
					+ "'" + "+'" + replaydata + "'");
		}

		/**
		 * <summary> Stop recording the motion and return data </summary> <br />
		 * <i>Actual SDK return value:</i> Returns the recorded data as an
		 * ALValue
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stopAndGetRecording() {
			return requestAction("ALMotionRecorder/stopAndGetRecording/()");
		}

		/**
		 * <summary> Returns the version of the module. </summary> <br />
		 * <i>Actual SDK return value:</i> A string containing the version of
		 * the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject version() {
			return requestAction("ALMotionRecorder/version/()");
		}
	}

	public ALMotionRecorder createALMotionRecorder() {
		return new ALMotionRecorder();
	}

	/**
	 * <summary>ALPreferences allows access to xml preference files.</summary>
	 */
	public class ALPreferences {

		/**
		 * <summary> Local Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALPreferencesProxy(String[] pbroker) {
			return requestAction("ALPreferences/ALPreferencesProxy/" + "'"
					+ pbroker + "'");
		}

		/**
		 * <summary> Remote Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALPreferencesProxy(String pip, int pport) {
			return requestAction("ALPreferences/ALPreferencesProxy/" + "'"
					+ pip + "'" + "," + pport);
		}

		/**
		 * <summary> Gets the underlying generic proxy </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getGenericProxy() {
			return requestAction("ALPreferences/getGenericProxy/()");
		}

		/**
		 * <summary> Wait for the end of a long running method that was called
		 * using 'post' </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post'
		 * @param timeoutPeriod
		 *            The timeout period in ms. To wait indefinately, use a
		 *            timeoutPeriod of zero. <br />
		 *            <i>Actual SDK return value:</i>True if the timeout period
		 *            terminated. False if the method returned.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject wait(final int id, final int timeoutperiod) {
			return requestAction("ALPreferences/wait/" + id + ","
					+ timeoutperiod);
		}

		/**
		 * <summary> stop a long running method that was called using 'post'
		 * </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stop(final int id) {
			return requestAction("ALPreferences/stop/" + id);
		}

		/**
		 * <summary> isRunning </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isRunning(final int id) {
			return requestAction("ALPreferences/isRunning/" + id);
		}

		/**
		 * <summary> Exits and unregisters the module. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject exit() {
			return requestAction("ALPreferences/exit/()");
		}

		/**
		 * <summary> Gets the name of the parent broker. </summary> <br />
		 * <i>Actual SDK return value:</i> The name of the parent broker.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getBrokerName() {
			return requestAction("ALPreferences/getBrokerName/()");
		}

		/**
		 * <summary> Retrieves a method's description. </summary>
		 * 
		 * @param methodName
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A structure containing the
		 *            method's description.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodHelp(final String methodname) {
			return requestAction("ALPreferences/getMethodHelp/" + "'"
					+ methodname + "'");
		}

		/**
		 * <summary> Retrieves the module's method list. </summary> <br />
		 * <i>Actual SDK return value:</i> An array of method names.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodList() {
			return requestAction("ALPreferences/getMethodList/()");
		}

		/**
		 * <summary> Retrieves the module's description. </summary> <br />
		 * <i>Actual SDK return value:</i> A structure describing the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getModuleHelp() {
			return requestAction("ALPreferences/getModuleHelp/()");
		}

		/**
		 * <summary> Gets the method usage string. This summarise how to use the
		 * method. </summary>
		 * 
		 * @param name
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A string that summarises
		 *            the usage of the method.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getUsage(final String name) {
			return requestAction("ALPreferences/getUsage/" + "'" + name + "'");
		}

		/**
		 * <summary> Just a ping. Always returns true </summary> <br />
		 * <i>Actual SDK return value:</i> returns true
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ping() {
			return requestAction("ALPreferences/ping/()");
		}

		/**
		 * <summary> Reads all preferences from an xml files and stores them in
		 * an ALValue. </summary>
		 * 
		 * @param fileName
		 *            Name of the module associate to the preference.
		 * @param autoGenerateMemoryNames
		 *            If true a memory name will be generated for each non-array
		 *            preference. <br />
		 *            <i>Actual SDK return value:</i> array reprenting the whole
		 *            file.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject readPrefFile(final String filename,
				final boolean autogeneratememorynames) {
			return requestAction("ALPreferences/readPrefFile/" + "'" + filename
					+ "'" + "," + autogeneratememorynames);
		}

		/**
		 * <summary> Writes all preferences from ALValue to an xml file.
		 * </summary>
		 * 
		 * @param prefs
		 *            array reprenting the whole file. <br />
		 *            <i>Actual SDK return value:</i> True upon success.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject saveToMemory(final String prefs) {
			return requestAction("ALPreferences/saveToMemory/" + "'" + prefs
					+ "'");
		}

		/**
		 * <summary> Returns the version of the module. </summary> <br />
		 * <i>Actual SDK return value:</i> A string containing the version of
		 * the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject version() {
			return requestAction("ALPreferences/version/()");
		}

		/**
		 * <summary> Writes all preferences from ALValue to an xml file.
		 * </summary>
		 * 
		 * @param fileName
		 *            Name of the module associate to the preference.
		 * @param prefs
		 *            array reprenting the whole file.
		 * @param ignoreMemoryNames
		 *            If true all memory names will be removed before saving.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject writePrefFile(final String filename,
				final String prefs, final boolean ignorememorynames) {
			return requestAction("ALPreferences/writePrefFile/" + "'"
					+ filename + "'" + "+'" + prefs + "'" + ","
					+ ignorememorynames);
		}
	}

	public ALPreferences createALPreferences() {
		return new ALPreferences();
	}

	/**
	 * <summary>This module evaluates python commands on the fly.</summary>
	 */
	public class ALPythonBridge {

		/**
		 * <summary> Local Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALPythonBridgeProxy(String[] pbroker) {
			return requestAction("ALPythonBridge/ALPythonBridgeProxy/" + "'"
					+ pbroker + "'");
		}

		/**
		 * <summary> Remote Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALPythonBridgeProxy(String pip, int pport) {
			return requestAction("ALPythonBridge/ALPythonBridgeProxy/" + "'"
					+ pip + "'" + "," + pport);
		}

		/**
		 * <summary> Gets the underlying generic proxy </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getGenericProxy() {
			return requestAction("ALPythonBridge/getGenericProxy/()");
		}

		/**
		 * <summary> Wait for the end of a long running method that was called
		 * using 'post' </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post'
		 * @param timeoutPeriod
		 *            The timeout period in ms. To wait indefinately, use a
		 *            timeoutPeriod of zero. <br />
		 *            <i>Actual SDK return value:</i>True if the timeout period
		 *            terminated. False if the method returned.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject wait(final int id, final int timeoutperiod) {
			return requestAction("ALPythonBridge/wait/" + id + ","
					+ timeoutperiod);
		}

		/**
		 * <summary> stop a long running method that was called using 'post'
		 * </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stop(final int id) {
			return requestAction("ALPythonBridge/stop/" + id);
		}

		/**
		 * <summary> isRunning </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isRunning(final int id) {
			return requestAction("ALPythonBridge/isRunning/" + id);
		}

		/**
		 * <summary> eval script </summary>
		 * 
		 * @param stringToEvaluate
		 *            string to eval <br />
		 *            <i>Actual SDK return value:</i> if the evaluation has gone
		 *            wrong
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject eval(final String stringtoevaluate) {
			return requestAction("ALPythonBridge/eval/" + "'"
					+ stringtoevaluate + "'");
		}

		/**
		 * <summary> evaluates script and returns an informative array.
		 * </summary>
		 * 
		 * @param stringToEvaluate
		 *            string to eval <br />
		 *            <i>Actual SDK return value:</i> an array containing
		 *            [return value, exceptions, stdout, stderr]
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject evalFull(final String stringtoevaluate) {
			return requestAction("ALPythonBridge/evalFull/" + "'"
					+ stringtoevaluate + "'");
		}

		/**
		 * <summary> eval script and return result. evalReturn(2+2) will return
		 * 4 </summary>
		 * 
		 * @param stringToEvaluate
		 *            string to eval <br />
		 *            <i>Actual SDK return value:</i> the result of the
		 *            evaluation
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject evalReturn(final String stringtoevaluate) {
			return requestAction("ALPythonBridge/evalReturn/" + "'"
					+ stringtoevaluate + "'");
		}

		/**
		 * <summary> Exits and unregisters the module. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject exit() {
			return requestAction("ALPythonBridge/exit/()");
		}

		/**
		 * <summary> Gets the name of the parent broker. </summary> <br />
		 * <i>Actual SDK return value:</i> The name of the parent broker.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getBrokerName() {
			return requestAction("ALPythonBridge/getBrokerName/()");
		}

		/**
		 * <summary> Retrieves a method's description. </summary>
		 * 
		 * @param methodName
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A structure containing the
		 *            method's description.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodHelp(final String methodname) {
			return requestAction("ALPythonBridge/getMethodHelp/" + "'"
					+ methodname + "'");
		}

		/**
		 * <summary> Retrieves the module's method list. </summary> <br />
		 * <i>Actual SDK return value:</i> An array of method names.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodList() {
			return requestAction("ALPythonBridge/getMethodList/()");
		}

		/**
		 * <summary> Retrieves the module's description. </summary> <br />
		 * <i>Actual SDK return value:</i> A structure describing the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getModuleHelp() {
			return requestAction("ALPythonBridge/getModuleHelp/()");
		}

		/**
		 * <summary> Gets the method usage string. This summarise how to use the
		 * method. </summary>
		 * 
		 * @param name
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A string that summarises
		 *            the usage of the method.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getUsage(final String name) {
			return requestAction("ALPythonBridge/getUsage/" + "'" + name + "'");
		}

		/**
		 * <summary> Just a ping. Always returns true </summary> <br />
		 * <i>Actual SDK return value:</i> returns true
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ping() {
			return requestAction("ALPythonBridge/ping/()");
		}

		/**
		 * <summary> Returns the version of the module. </summary> <br />
		 * <i>Actual SDK return value:</i> A string containing the version of
		 * the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject version() {
			return requestAction("ALPythonBridge/version/()");
		}
	}

	public ALPythonBridge createALPythonBridge() {
		return new ALPythonBridge();
	}

	/**
	 * <summary>ALRedBallDetection is a module which can detect red ball based
	 * on color saturation.</summary>
	 */
	public class ALRedBallDetection {

		/**
		 * <summary> Local Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALRedBallDetectionProxy(String[] pbroker) {
			return requestAction("ALRedBallDetection/ALRedBallDetectionProxy/"
					+ "'" + pbroker + "'");
		}

		/**
		 * <summary> Remote Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALRedBallDetectionProxy(String pip, int pport) {
			return requestAction("ALRedBallDetection/ALRedBallDetectionProxy/"
					+ "'" + pip + "'" + "," + pport);
		}

		/**
		 * <summary> Gets the underlying generic proxy </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getGenericProxy() {
			return requestAction("ALRedBallDetection/getGenericProxy/()");
		}

		/**
		 * <summary> Wait for the end of a long running method that was called
		 * using 'post' </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post'
		 * @param timeoutPeriod
		 *            The timeout period in ms. To wait indefinately, use a
		 *            timeoutPeriod of zero. <br />
		 *            <i>Actual SDK return value:</i>True if the timeout period
		 *            terminated. False if the method returned.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject wait(final int id, final int timeoutperiod) {
			return requestAction("ALRedBallDetection/wait/" + id + ","
					+ timeoutperiod);
		}

		/**
		 * <summary> stop a long running method that was called using 'post'
		 * </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stop(final int id) {
			return requestAction("ALRedBallDetection/stop/" + id);
		}

		/**
		 * <summary> isRunning </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isRunning(final int id) {
			return requestAction("ALRedBallDetection/isRunning/" + id);
		}

		/**
		 * <summary> Exits and unregisters the module. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject exit() {
			return requestAction("ALRedBallDetection/exit/()");
		}

		/**
		 * <summary> Gets the name of the parent broker. </summary> <br />
		 * <i>Actual SDK return value:</i> The name of the parent broker.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getBrokerName() {
			return requestAction("ALRedBallDetection/getBrokerName/()");
		}

		/**
		 * <summary> Gets the current period. </summary> <br />
		 * <i>Actual SDK return value:</i> Refresh period (in milliseconds).
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getCurrentPeriod() {
			return requestAction("ALRedBallDetection/getCurrentPeriod/()");
		}

		/**
		 * <summary> Gets the current precision. </summary> <br />
		 * <i>Actual SDK return value:</i> Precision of the extractor.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getCurrentPrecision() {
			return requestAction("ALRedBallDetection/getCurrentPrecision/()");
		}

		/**
		 * <summary> Retrieves a method's description. </summary>
		 * 
		 * @param methodName
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A structure containing the
		 *            method's description.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodHelp(final String methodname) {
			return requestAction("ALRedBallDetection/getMethodHelp/" + "'"
					+ methodname + "'");
		}

		/**
		 * <summary> Retrieves the module's method list. </summary> <br />
		 * <i>Actual SDK return value:</i> An array of method names.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodList() {
			return requestAction("ALRedBallDetection/getMethodList/()");
		}

		/**
		 * <summary> Retrieves the module's description. </summary> <br />
		 * <i>Actual SDK return value:</i> A structure describing the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getModuleHelp() {
			return requestAction("ALRedBallDetection/getModuleHelp/()");
		}

		/**
		 * <summary> Gets the period for a specific subscription. </summary>
		 * 
		 * @param name
		 *            Name of the module which has subscribed. <br />
		 *            <i>Actual SDK return value:</i> Refresh period (in
		 *            milliseconds).
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMyPeriod(final String name) {
			return requestAction("ALRedBallDetection/getMyPeriod/" + "'" + name
					+ "'");
		}

		/**
		 * <summary> Gets the precision for a specific subscription. </summary>
		 * 
		 * @param name
		 *            name of the module which has subscribed <br />
		 *            <i>Actual SDK return value:</i> precision of the extractor
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMyPrecision(final String name) {
			return requestAction("ALRedBallDetection/getMyPrecision/" + "'"
					+ name + "'");
		}

		/**
		 * <summary> Get the list of values updated in ALMemory. </summary> <br />
		 * <i>Actual SDK return value:</i> Array of values updated by this
		 * extractor in ALMemory
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getOutputNames() {
			return requestAction("ALRedBallDetection/getOutputNames/()");
		}

		/**
		 * <summary> Gets the parameters given by the module. </summary> <br />
		 * <i>Actual SDK return value:</i> Array of names and parameters of all
		 * subscribers.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getSubscribersInfo() {
			return requestAction("ALRedBallDetection/getSubscribersInfo/()");
		}

		/**
		 * <summary> Gets the method usage string. This summarise how to use the
		 * method. </summary>
		 * 
		 * @param name
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A string that summarises
		 *            the usage of the method.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getUsage(final String name) {
			return requestAction("ALRedBallDetection/getUsage/" + "'" + name
					+ "'");
		}

		/**
		 * <summary> Just a ping. Always returns true </summary> <br />
		 * <i>Actual SDK return value:</i> returns true
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ping() {
			return requestAction("ALRedBallDetection/ping/()");
		}

		/**
		 * <summary> Subscribes to the extractor. This causes the extractor to
		 * start writing information to memory using the keys described by
		 * getOutputNames(). These can be accessed in memory using
		 * ALMemory.getData(\"keyName\"). In many cases you can avoid calling
		 * subscribe on the extractor by just calling
		 * ALMemory.subscribeToEvent() supplying a callback method. This will
		 * automatically subscribe to the extractor for you. </summary>
		 * 
		 * @param name
		 *            Name of the module which subscribes.
		 * @param period
		 *            Refresh period (in milliseconds) if relevant.
		 * @param precision
		 *            Precision of the extractor if relevant.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject subscribe(final String name, final int period,
				final float precision) {
			return requestAction("ALRedBallDetection/subscribe/" + "'" + name
					+ "'" + "," + period + "," + precision);
		}

		/**
		 * <summary> Subscribes to the extractor. This causes the extractor to
		 * start writing information to memory using the keys described by
		 * getOutputNames(). These can be accessed in memory using
		 * ALMemory.getData(\"keyName\"). In many cases you can avoid calling
		 * subscribe on the extractor by just calling
		 * ALMemory.subscribeToEvent() supplying a callback method. This will
		 * automatically subscribe to the extractor for you. </summary>
		 * 
		 * @param name
		 *            Name of the module which subscribes.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject subscribe(final String name) {
			return requestAction("ALRedBallDetection/subscribe/" + "'" + name
					+ "'");
		}

		/**
		 * <summary> Unsubscribes from the extractor. </summary>
		 * 
		 * @param name
		 *            Name of the module which had subscribed.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject unsubscribe(final String name) {
			return requestAction("ALRedBallDetection/unsubscribe/" + "'" + name
					+ "'");
		}

		/**
		 * <summary> Updates the period if relevant. </summary>
		 * 
		 * @param name
		 *            Name of the module which has subscribed.
		 * @param period
		 *            Refresh period (in milliseconds).
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject updatePeriod(final String name, final int period) {
			return requestAction("ALRedBallDetection/updatePeriod/" + "'"
					+ name + "'" + "," + period);
		}

		/**
		 * <summary> Updates the precision if relevant. </summary>
		 * 
		 * @param name
		 *            Name of the module which has subscribed.
		 * @param precision
		 *            Precision of the extractor.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject updatePrecision(final String name,
				final float precision) {
			return requestAction("ALRedBallDetection/updatePrecision/" + "'"
					+ name + "'" + "," + precision);
		}

		/**
		 * <summary> Returns the version of the module. </summary> <br />
		 * <i>Actual SDK return value:</i> A string containing the version of
		 * the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject version() {
			return requestAction("ALRedBallDetection/version/()");
		}
	}

	public ALRedBallDetection createALRedBallDetection() {
		return new ALRedBallDetection();
	}

	/**
	 * <summary>This module is dedicated to Track a Red Ball expressed in
	 * NAO_SPACE.</summary>
	 */
	public class ALRedBallTracker {

		/**
		 * <summary> Local Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALRedBallTrackerProxy(String[] pbroker) {
			return requestAction("ALRedBallTracker/ALRedBallTrackerProxy/"
					+ "'" + pbroker + "'");
		}

		/**
		 * <summary> Remote Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALRedBallTrackerProxy(String pip, int pport) {
			return requestAction("ALRedBallTracker/ALRedBallTrackerProxy/"
					+ "'" + pip + "'" + "," + pport);
		}

		/**
		 * <summary> Gets the underlying generic proxy </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getGenericProxy() {
			return requestAction("ALRedBallTracker/getGenericProxy/()");
		}

		/**
		 * <summary> Wait for the end of a long running method that was called
		 * using 'post' </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post'
		 * @param timeoutPeriod
		 *            The timeout period in ms. To wait indefinately, use a
		 *            timeoutPeriod of zero. <br />
		 *            <i>Actual SDK return value:</i>True if the timeout period
		 *            terminated. False if the method returned.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject wait(final int id, final int timeoutperiod) {
			return requestAction("ALRedBallTracker/wait/" + id + ","
					+ timeoutperiod);
		}

		/**
		 * <summary> stop a long running method that was called using 'post'
		 * </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stop(final int id) {
			return requestAction("ALRedBallTracker/stop/" + id);
		}

		/**
		 * <summary> isRunning </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isRunning(final int id) {
			return requestAction("ALRedBallTracker/isRunning/" + id);
		}

		/**
		 * <summary> Exits and unregisters the module. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject exit() {
			return requestAction("ALRedBallTracker/exit/()");
		}

		/**
		 * <summary> Gets the name of the parent broker. </summary> <br />
		 * <i>Actual SDK return value:</i> The name of the parent broker.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getBrokerName() {
			return requestAction("ALRedBallTracker/getBrokerName/()");
		}

		/**
		 * <summary> Retrieves a method's description. </summary>
		 * 
		 * @param methodName
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A structure containing the
		 *            method's description.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodHelp(final String methodname) {
			return requestAction("ALRedBallTracker/getMethodHelp/" + "'"
					+ methodname + "'");
		}

		/**
		 * <summary> Retrieves the module's method list. </summary> <br />
		 * <i>Actual SDK return value:</i> An array of method names.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodList() {
			return requestAction("ALRedBallTracker/getMethodList/()");
		}

		/**
		 * <summary> Retrieves the module's description. </summary> <br />
		 * <i>Actual SDK return value:</i> A structure describing the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getModuleHelp() {
			return requestAction("ALRedBallTracker/getModuleHelp/()");
		}

		/**
		 * <summary> Return the position of the red ball in NAO_SPACE.
		 * </summary> <br />
		 * <i>Actual SDK return value:</i> An Array containing the red ball
		 * position [x, y, z].
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getPosition() {
			return requestAction("ALRedBallTracker/getPosition/()");
		}

		/**
		 * <summary> Gets the method usage string. This summarise how to use the
		 * method. </summary>
		 * 
		 * @param name
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A string that summarises
		 *            the usage of the method.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getUsage(final String name) {
			return requestAction("ALRedBallTracker/getUsage/" + "'" + name
					+ "'");
		}

		/**
		 * <summary> Return true if the red Ball Tracker is running. </summary> <br />
		 * <i>Actual SDK return value:</i> true if the red Ball Tracker is
		 * running.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isActive() {
			return requestAction("ALRedBallTracker/isActive/()");
		}

		/**
		 * <summary> Return true if a new Red Ball was detected since the last
		 * getPosition(). </summary> <br />
		 * <i>Actual SDK return value:</i> true if a new Red Ball was detected
		 * since the last getPosition().
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isNewData() {
			return requestAction("ALRedBallTracker/isNewData/()");
		}

		/**
		 * <summary> Just a ping. Always returns true </summary> <br />
		 * <i>Actual SDK return value:</i> returns true
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ping() {
			return requestAction("ALRedBallTracker/ping/()");
		}

		/**
		 * <summary> if true, the tracking will be through a Whole Body Process.
		 * </summary>
		 * 
		 * @param pWholeBodyOn
		 *            The whole Body state
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setWholeBodyOn(final boolean pwholebodyon) {
			return requestAction("ALRedBallTracker/setWholeBodyOn/"
					+ pwholebodyon);
		}

		/**
		 * <summary> Start the tracker by Subscribing to Event redBallDetected
		 * from ALRedBallDetection module. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject startTracker() {
			return requestAction("ALRedBallTracker/startTracker/()");
		}

		/**
		 * <summary> Start the tracker by Unsubscribing to Event redBallDetected
		 * from ALRedBallDetection module. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stopTracker() {
			return requestAction("ALRedBallTracker/stopTracker/()");
		}

		/**
		 * <summary> Returns the version of the module. </summary> <br />
		 * <i>Actual SDK return value:</i> A string containing the version of
		 * the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject version() {
			return requestAction("ALRedBallTracker/version/()");
		}
	}

	public ALRedBallTracker createALRedBallTracker() {
		return new ALRedBallTracker();
	}

	/**
	 * <summary>Manage robot resources: Synchronize movement, led, sound. Run
	 * specific actions when another behavior wants your resources</summary>
	 */
	public class ALResourceManager {

		/**
		 * <summary> Local Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALResourceManagerProxy(String[] pbroker) {
			return requestAction("ALResourceManager/ALResourceManagerProxy/"
					+ "'" + pbroker + "'");
		}

		/**
		 * <summary> Remote Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALResourceManagerProxy(String pip, int pport) {
			return requestAction("ALResourceManager/ALResourceManagerProxy/"
					+ "'" + pip + "'" + "," + pport);
		}

		/**
		 * <summary> Gets the underlying generic proxy </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getGenericProxy() {
			return requestAction("ALResourceManager/getGenericProxy/()");
		}

		/**
		 * <summary> Wait for the end of a long running method that was called
		 * using 'post' </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post'
		 * @param timeoutPeriod
		 *            The timeout period in ms. To wait indefinately, use a
		 *            timeoutPeriod of zero. <br />
		 *            <i>Actual SDK return value:</i>True if the timeout period
		 *            terminated. False if the method returned.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject wait(final int id, final int timeoutperiod) {
			return requestAction("ALResourceManager/wait/" + id + ","
					+ timeoutperiod);
		}

		/**
		 * <summary> stop a long running method that was called using 'post'
		 * </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stop(final int id) {
			return requestAction("ALResourceManager/stop/" + id);
		}

		/**
		 * <summary> isRunning </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isRunning(final int id) {
			return requestAction("ALResourceManager/isRunning/" + id);
		}

		/**
		 * <summary> True if resources free </summary>
		 * 
		 * @param resourceNames
		 *            Resource names <br />
		 *            <i>Actual SDK return value:</i> True if all the specify
		 *            resources are free
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject areResourcesFree(final String resourcenames) {
			return requestAction("ALResourceManager/areResourcesFree/" + "'"
					+ resourcenames + "'");
		}

		/**
		 * <summary> True if all the specified resources are owned by the owner
		 * </summary>
		 * 
		 * @param resourceNameList
		 *            Resource name
		 * @param ownerName
		 *            Owner pointer with hierarchy <br />
		 *            <i>Actual SDK return value:</i> True if all the specify
		 *            resources are owned by the owner
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject areResourcesOwnedBy(final String resourcenamelist,
				final String ownername) {
			return requestAction("ALResourceManager/areResourcesOwnedBy/" + "'"
					+ resourcenamelist + "'" + "+'" + ownername + "'");
		}

		/**
		 * <summary> Create a resource </summary>
		 * 
		 * @param resourceName
		 *            Resource name to create
		 * @param parentResourceName
		 *            Parent resource name or empty string for root resource
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject createResource(final String resourcename,
				final String parentresourcename) {
			return requestAction("ALResourceManager/createResource/" + "'"
					+ resourcename + "'" + "+'" + parentresourcename + "'");
		}

		/**
		 * <summary> Enable or disable a state resource </summary>
		 * 
		 * @param resourceName
		 *            The name of the resource that you wish enable of disable.
		 *            e.g. Standing
		 * @param enabled
		 *            True to enable, false to disable
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject enableStateResource(final String resourcename,
				final boolean enabled) {
			return requestAction("ALResourceManager/enableStateResource/" + "'"
					+ resourcename + "'" + "," + enabled);
		}

		/**
		 * <summary> Exits and unregisters the module. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject exit() {
			return requestAction("ALResourceManager/exit/()");
		}

		/**
		 * <summary> Gets the name of the parent broker. </summary> <br />
		 * <i>Actual SDK return value:</i> The name of the parent broker.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getBrokerName() {
			return requestAction("ALResourceManager/getBrokerName/()");
		}

		/**
		 * <summary> Retrieves a method's description. </summary>
		 * 
		 * @param methodName
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A structure containing the
		 *            method's description.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodHelp(final String methodname) {
			return requestAction("ALResourceManager/getMethodHelp/" + "'"
					+ methodname + "'");
		}

		/**
		 * <summary> Retrieves the module's method list. </summary> <br />
		 * <i>Actual SDK return value:</i> An array of method names.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodList() {
			return requestAction("ALResourceManager/getMethodList/()");
		}

		/**
		 * <summary> Retrieves the module's description. </summary> <br />
		 * <i>Actual SDK return value:</i> A structure describing the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getModuleHelp() {
			return requestAction("ALResourceManager/getModuleHelp/()");
		}

		/**
		 * <summary> Gets the method usage string. This summarise how to use the
		 * method. </summary>
		 * 
		 * @param name
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A string that summarises
		 *            the usage of the method.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getUsage(final String name) {
			return requestAction("ALResourceManager/getUsage/" + "'" + name
					+ "'");
		}

		/**
		 * <summary> Just a ping. Always returns true </summary> <br />
		 * <i>Actual SDK return value:</i> returns true
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ping() {
			return requestAction("ALResourceManager/ping/()");
		}

		/**
		 * <summary> Release resource </summary>
		 * 
		 * @param resourceName
		 *            Resource name
		 * @param ownerName
		 *            Existing owner name
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject releaseResource(final String resourcename,
				final String ownername) {
			return requestAction("ALResourceManager/releaseResource/" + "'"
					+ resourcename + "'" + "+'" + ownername + "'");
		}

		/**
		 * <summary> Release resources list </summary>
		 * 
		 * @param resourceNames
		 *            Resource names
		 * @param ownerName
		 *            Owner name
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject releaseResources(final String resourcenames,
				final String ownername) {
			return requestAction("ALResourceManager/releaseResources/" + "'"
					+ resourcenames + "'" + "+'" + ownername + "'");
		}

		/**
		 * <summary> Returns the version of the module. </summary> <br />
		 * <i>Actual SDK return value:</i> A string containing the version of
		 * the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject version() {
			return requestAction("ALResourceManager/version/()");
		}

		/**
		 * <summary> Wait resource </summary>
		 * 
		 * @param ressourceName
		 *            Resource name
		 * @param ownerName
		 *            Owner name
		 * @param callbackName
		 *            callback name
		 * @param timeoutSeconds
		 *            Timeout in seconds
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject waitForResource(final String ressourcename,
				final String ownername, final String callbackname,
				final int timeoutseconds) {
			return requestAction("ALResourceManager/waitForResource/" + "'"
					+ ressourcename + "'" + "+'" + ownername + "'" + "+'"
					+ callbackname + "'" + "," + timeoutseconds);
		}
	}

	public ALResourceManager createALResourceManager() {
		return new ALResourceManager();
	}

	/**
	 * <summary>This module give the estimated Nao PoseDetects.</summary>
	 */
	public class ALRobotPose {

		/**
		 * <summary> Local Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALRobotPoseProxy(String[] pbroker) {
			return requestAction("ALRobotPose/ALRobotPoseProxy/" + "'"
					+ pbroker + "'");
		}

		/**
		 * <summary> Remote Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALRobotPoseProxy(String pip, int pport) {
			return requestAction("ALRobotPose/ALRobotPoseProxy/" + "'" + pip
					+ "'" + "," + pport);
		}

		/**
		 * <summary> Gets the underlying generic proxy </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getGenericProxy() {
			return requestAction("ALRobotPose/getGenericProxy/()");
		}

		/**
		 * <summary> Wait for the end of a long running method that was called
		 * using 'post' </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post'
		 * @param timeoutPeriod
		 *            The timeout period in ms. To wait indefinately, use a
		 *            timeoutPeriod of zero. <br />
		 *            <i>Actual SDK return value:</i>True if the timeout period
		 *            terminated. False if the method returned.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject wait(final int id, final int timeoutperiod) {
			return requestAction("ALRobotPose/wait/" + id + "," + timeoutperiod);
		}

		/**
		 * <summary> stop a long running method that was called using 'post'
		 * </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stop(final int id) {
			return requestAction("ALRobotPose/stop/" + id);
		}

		/**
		 * <summary> isRunning </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isRunning(final int id) {
			return requestAction("ALRobotPose/isRunning/" + id);
		}

		/**
		 * <summary> Exits and unregisters the module. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject exit() {
			return requestAction("ALRobotPose/exit/()");
		}

		/**
		 * <summary> Get the actual robot pose and the time since this pose was
		 * activate. </summary> <br />
		 * <i>Actual SDK return value:</i> A ALValue array of size 2. With first
		 * a string of the robot pose and
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getActualPoseAndTime() {
			return requestAction("ALRobotPose/getActualPoseAndTime/()");
		}

		/**
		 * <summary> Gets the name of the parent broker. </summary> <br />
		 * <i>Actual SDK return value:</i> The name of the parent broker.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getBrokerName() {
			return requestAction("ALRobotPose/getBrokerName/()");
		}

		/**
		 * <summary> Retrieves a method's description. </summary>
		 * 
		 * @param methodName
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A structure containing the
		 *            method's description.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodHelp(final String methodname) {
			return requestAction("ALRobotPose/getMethodHelp/" + "'"
					+ methodname + "'");
		}

		/**
		 * <summary> Retrieves the module's method list. </summary> <br />
		 * <i>Actual SDK return value:</i> An array of method names.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodList() {
			return requestAction("ALRobotPose/getMethodList/()");
		}

		/**
		 * <summary> Retrieves the module's description. </summary> <br />
		 * <i>Actual SDK return value:</i> A structure describing the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getModuleHelp() {
			return requestAction("ALRobotPose/getModuleHelp/()");
		}

		/**
		 * <summary> Get the full list of pose possibly return by this module.
		 * </summary> <br />
		 * <i>Actual SDK return value:</i> A ALValue array of string containing
		 * the possible Poses.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getPoseNames() {
			return requestAction("ALRobotPose/getPoseNames/()");
		}

		/**
		 * <summary> Gets the method usage string. This summarise how to use the
		 * method. </summary>
		 * 
		 * @param name
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A string that summarises
		 *            the usage of the method.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getUsage(final String name) {
			return requestAction("ALRobotPose/getUsage/" + "'" + name + "'");
		}

		/**
		 * <summary> Just a ping. Always returns true </summary> <br />
		 * <i>Actual SDK return value:</i> returns true
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ping() {
			return requestAction("ALRobotPose/ping/()");
		}

		/**
		 * <summary> Returns the version of the module. </summary> <br />
		 * <i>Actual SDK return value:</i> A string containing the version of
		 * the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject version() {
			return requestAction("ALRobotPose/version/()");
		}
	}

	public ALRobotPose createALRobotPose() {
		return new ALRobotPose();
	}

	/**
	 * <summary>Deals with bumpers and chest button.</summary>
	 */
	public class ALSensors {

		/**
		 * <summary> Local Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALSensorsProxy(String[] pbroker) {
			return requestAction("ALSensors/ALSensorsProxy/" + "'" + pbroker
					+ "'");
		}

		/**
		 * <summary> Remote Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALSensorsProxy(String pip, int pport) {
			return requestAction("ALSensors/ALSensorsProxy/" + "'" + pip + "'"
					+ "," + pport);
		}

		/**
		 * <summary> Gets the underlying generic proxy </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getGenericProxy() {
			return requestAction("ALSensors/getGenericProxy/()");
		}

		/**
		 * <summary> Wait for the end of a long running method that was called
		 * using 'post' </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post'
		 * @param timeoutPeriod
		 *            The timeout period in ms. To wait indefinately, use a
		 *            timeoutPeriod of zero. <br />
		 *            <i>Actual SDK return value:</i>True if the timeout period
		 *            terminated. False if the method returned.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject wait(final int id, final int timeoutperiod) {
			return requestAction("ALSensors/wait/" + id + "," + timeoutperiod);
		}

		/**
		 * <summary> stop a long running method that was called using 'post'
		 * </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stop(final int id) {
			return requestAction("ALSensors/stop/" + id);
		}

		/**
		 * <summary> isRunning </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isRunning(final int id) {
			return requestAction("ALSensors/isRunning/" + id);
		}

		/**
		 * <summary> Exits and unregisters the module. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject exit() {
			return requestAction("ALSensors/exit/()");
		}

		/**
		 * <summary> Gets the name of the parent broker. </summary> <br />
		 * <i>Actual SDK return value:</i> The name of the parent broker.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getBrokerName() {
			return requestAction("ALSensors/getBrokerName/()");
		}

		/**
		 * <summary> Gets the current period. </summary> <br />
		 * <i>Actual SDK return value:</i> Refresh period (in milliseconds).
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getCurrentPeriod() {
			return requestAction("ALSensors/getCurrentPeriod/()");
		}

		/**
		 * <summary> Gets the current precision. </summary> <br />
		 * <i>Actual SDK return value:</i> Precision of the extractor.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getCurrentPrecision() {
			return requestAction("ALSensors/getCurrentPrecision/()");
		}

		/**
		 * <summary> Retrieves a method's description. </summary>
		 * 
		 * @param methodName
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A structure containing the
		 *            method's description.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodHelp(final String methodname) {
			return requestAction("ALSensors/getMethodHelp/" + "'" + methodname
					+ "'");
		}

		/**
		 * <summary> Retrieves the module's method list. </summary> <br />
		 * <i>Actual SDK return value:</i> An array of method names.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodList() {
			return requestAction("ALSensors/getMethodList/()");
		}

		/**
		 * <summary> Retrieves the module's description. </summary> <br />
		 * <i>Actual SDK return value:</i> A structure describing the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getModuleHelp() {
			return requestAction("ALSensors/getModuleHelp/()");
		}

		/**
		 * <summary> Gets the period for a specific subscription. </summary>
		 * 
		 * @param name
		 *            Name of the module which has subscribed. <br />
		 *            <i>Actual SDK return value:</i> Refresh period (in
		 *            milliseconds).
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMyPeriod(final String name) {
			return requestAction("ALSensors/getMyPeriod/" + "'" + name + "'");
		}

		/**
		 * <summary> Gets the precision for a specific subscription. </summary>
		 * 
		 * @param name
		 *            name of the module which has subscribed <br />
		 *            <i>Actual SDK return value:</i> precision of the extractor
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMyPrecision(final String name) {
			return requestAction("ALSensors/getMyPrecision/" + "'" + name + "'");
		}

		/**
		 * <summary> Get the list of values updated in ALMemory. </summary> <br />
		 * <i>Actual SDK return value:</i> Array of values updated by this
		 * extractor in ALMemory
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getOutputNames() {
			return requestAction("ALSensors/getOutputNames/()");
		}

		/**
		 * <summary> Gets the parameters given by the module. </summary> <br />
		 * <i>Actual SDK return value:</i> Array of names and parameters of all
		 * subscribers.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getSubscribersInfo() {
			return requestAction("ALSensors/getSubscribersInfo/()");
		}

		/**
		 * <summary> Gets the method usage string. This summarise how to use the
		 * method. </summary>
		 * 
		 * @param name
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A string that summarises
		 *            the usage of the method.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getUsage(final String name) {
			return requestAction("ALSensors/getUsage/" + "'" + name + "'");
		}

		/**
		 * <summary> Just a ping. Always returns true </summary> <br />
		 * <i>Actual SDK return value:</i> returns true
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ping() {
			return requestAction("ALSensors/ping/()");
		}

		/**
		 * <summary> Monitors sensors. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject run() {
			return requestAction("ALSensors/run/()");
		}

		/**
		 * <summary> Subscribes to the extractor. This causes the extractor to
		 * start writing information to memory using the keys described by
		 * getOutputNames(). These can be accessed in memory using
		 * ALMemory.getData(\"keyName\"). In many cases you can avoid calling
		 * subscribe on the extractor by just calling
		 * ALMemory.subscribeToEvent() supplying a callback method. This will
		 * automatically subscribe to the extractor for you. </summary>
		 * 
		 * @param name
		 *            Name of the module which subscribes.
		 * @param period
		 *            Refresh period (in milliseconds) if relevant.
		 * @param precision
		 *            Precision of the extractor if relevant.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject subscribe(final String name, final int period,
				final float precision) {
			return requestAction("ALSensors/subscribe/" + "'" + name + "'"
					+ "," + period + "," + precision);
		}

		/**
		 * <summary> Subscribes to the extractor. This causes the extractor to
		 * start writing information to memory using the keys described by
		 * getOutputNames(). These can be accessed in memory using
		 * ALMemory.getData(\"keyName\"). In many cases you can avoid calling
		 * subscribe on the extractor by just calling
		 * ALMemory.subscribeToEvent() supplying a callback method. This will
		 * automatically subscribe to the extractor for you. </summary>
		 * 
		 * @param name
		 *            Name of the module which subscribes.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject subscribe(final String name) {
			return requestAction("ALSensors/subscribe/" + "'" + name + "'");
		}

		/**
		 * <summary> Unsubscribes from the extractor. </summary>
		 * 
		 * @param name
		 *            Name of the module which had subscribed.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject unsubscribe(final String name) {
			return requestAction("ALSensors/unsubscribe/" + "'" + name + "'");
		}

		/**
		 * <summary> Updates the period if relevant. </summary>
		 * 
		 * @param name
		 *            Name of the module which has subscribed.
		 * @param period
		 *            Refresh period (in milliseconds).
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject updatePeriod(final String name, final int period) {
			return requestAction("ALSensors/updatePeriod/" + "'" + name + "'"
					+ "," + period);
		}

		/**
		 * <summary> Updates the precision if relevant. </summary>
		 * 
		 * @param name
		 *            Name of the module which has subscribed.
		 * @param precision
		 *            Precision of the extractor.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject updatePrecision(final String name,
				final float precision) {
			return requestAction("ALSensors/updatePrecision/" + "'" + name
					+ "'" + "," + precision);
		}

		/**
		 * <summary> Returns the version of the module. </summary> <br />
		 * <i>Actual SDK return value:</i> A string containing the version of
		 * the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject version() {
			return requestAction("ALSensors/version/()");
		}
	}

	public ALSensors createALSensors() {
		return new ALSensors();
	}

	/**
	 * <summary>ALSentinel (ex-ALWatchDog) is a module that implements vital
	 * services for Nao:</summary>
	 */
	public class ALSentinel {

		/**
		 * <summary> Local Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALSentinelProxy(String[] pbroker) {
			return requestAction("ALSentinel/ALSentinelProxy/" + "'" + pbroker
					+ "'");
		}

		/**
		 * <summary> Remote Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALSentinelProxy(String pip, int pport) {
			return requestAction("ALSentinel/ALSentinelProxy/" + "'" + pip
					+ "'" + "," + pport);
		}

		/**
		 * <summary> Gets the underlying generic proxy </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getGenericProxy() {
			return requestAction("ALSentinel/getGenericProxy/()");
		}

		/**
		 * <summary> Wait for the end of a long running method that was called
		 * using 'post' </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post'
		 * @param timeoutPeriod
		 *            The timeout period in ms. To wait indefinately, use a
		 *            timeoutPeriod of zero. <br />
		 *            <i>Actual SDK return value:</i>True if the timeout period
		 *            terminated. False if the method returned.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject wait(final int id, final int timeoutperiod) {
			return requestAction("ALSentinel/wait/" + id + "," + timeoutperiod);
		}

		/**
		 * <summary> stop a long running method that was called using 'post'
		 * </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stop(final int id) {
			return requestAction("ALSentinel/stop/" + id);
		}

		/**
		 * <summary> isRunning </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isRunning(final int id) {
			return requestAction("ALSentinel/isRunning/" + id);
		}

		/**
		 * <summary> callback for internal use. </summary>
		 * 
		 * @param dataName
		 *            Name of the modified data
		 * @param data
		 *            value of the data
		 * @param message
		 *            associate message.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject BatteryChargeCellVoltageMinChanged(
				final String dataname, final String data, final String message) {
			return requestAction("ALSentinel/BatteryChargeCellVoltageMinChanged/"
					+ "'"
					+ dataname
					+ "'"
					+ "+'"
					+ data
					+ "'"
					+ "+'"
					+ message
					+ "'");
		}

		/**
		 * <summary> callback for internal use. </summary>
		 * 
		 * @param dataName
		 *            Name of the modified data
		 * @param data
		 *            value of the data
		 * @param message
		 *            associate message.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject BatteryChargeStatusChanged(final String dataname,
				final String data, final String message) {
			return requestAction("ALSentinel/BatteryChargeStatusChanged/" + "'"
					+ dataname + "'" + "+'" + data + "'" + "+'" + message + "'");
		}

		/**
		 * <summary> check the battery information, voltage and alarm flag
		 * </summary>
		 * 
		 * @param enable
		 *            true of false to respectively enable or disable (default:
		 *            true)
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject enableBatteryMeasure(final boolean enable) {
			return requestAction("ALSentinel/enableBatteryMeasure/" + enable);
		}

		/**
		 * <summary> check the remaining physical memory </summary>
		 * 
		 * @param enable
		 *            true of false to respectively enable or disable (default:
		 *            true)
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject enableCheckRemainingRam(final boolean enable) {
			return requestAction("ALSentinel/enableCheckRemainingRam/" + enable);
		}

		/**
		 * <summary> enable or disable the \"ouch\" action after two pushes.
		 * </summary>
		 * 
		 * @param enable
		 *            true of false to respectively enable or disable
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject enableDefaultActionDoubleClick(final boolean enable) {
			return requestAction("ALSentinel/enableDefaultActionDoubleClick/"
					+ enable);
		}

		/**
		 * <summary> enable or disable the \"hello, i'm nao...\" after one short
		 * push of the Power button. In both cases the ALMemory
		 * ALSentinel/SimpleClickOccured key will be set to true, so users can
		 * read/registerOnChange it, then reset to false after handling the
		 * event. </summary>
		 * 
		 * @param enable
		 *            true of false to respectively enable or disable
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject enableDefaultActionSimpleClick(final boolean enable) {
			return requestAction("ALSentinel/enableDefaultActionSimpleClick/"
					+ enable);
		}

		/**
		 * <summary> enable or disable the \"restart naoqi\" action after three
		 * pushes. </summary>
		 * 
		 * @param enable
		 *            true of false to respectively enable or disable
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject enableDefaultActionTripleClick(final boolean enable) {
			return requestAction("ALSentinel/enableDefaultActionTripleClick/"
					+ enable);
		}

		/**
		 * <summary> Enable or Disable heat monitoring. </summary>
		 * 
		 * @param enable
		 *            true to enable, false to disable, default: true
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject enableHeatMonitoring(final boolean enable) {
			return requestAction("ALSentinel/enableHeatMonitoring/" + enable);
		}

		/**
		 * <summary> Enable or Disable power monitoring. </summary>
		 * 
		 * @param enable
		 *            true to enable, false to disable, default: true
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject enablePowerMonitoring(final boolean enable) {
			return requestAction("ALSentinel/enablePowerMonitoring/" + enable);
		}

		/**
		 * <summary> Exits and unregisters the module. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject exit() {
			return requestAction("ALSentinel/exit/()");
		}

		/**
		 * <summary> exit naoqi (warning: it will really exit Naoqi) </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject exitNaoqi() {
			return requestAction("ALSentinel/exitNaoqi/()");
		}

		/**
		 * <summary> Get the battery level (0..5) 5: full 0: totally empty
		 * (never reached). </summary> <br />
		 * <i>Actual SDK return value:</i> the battery level (0..5): 5: full 0:
		 * totally empty (never reached)
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getBatteryLevel() {
			return requestAction("ALSentinel/getBatteryLevel/()");
		}

		/**
		 * <summary> Get a text presentation of the battery level ('My battery
		 * is...'). </summary> <br />
		 * <i>Actual SDK return value:</i> the sentence describing the battery
		 * level
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getBatteryLevelDesc() {
			return requestAction("ALSentinel/getBatteryLevelDesc/()");
		}

		/**
		 * <summary> Gets the name of the parent broker. </summary> <br />
		 * <i>Actual SDK return value:</i> The name of the parent broker.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getBrokerName() {
			return requestAction("ALSentinel/getBrokerName/()");
		}

		/**
		 * <summary> Retrieves a method's description. </summary>
		 * 
		 * @param methodName
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A structure containing the
		 *            method's description.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodHelp(final String methodname) {
			return requestAction("ALSentinel/getMethodHelp/" + "'" + methodname
					+ "'");
		}

		/**
		 * <summary> Retrieves the module's method list. </summary> <br />
		 * <i>Actual SDK return value:</i> An array of method names.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodList() {
			return requestAction("ALSentinel/getMethodList/()");
		}

		/**
		 * <summary> Retrieves the module's description. </summary> <br />
		 * <i>Actual SDK return value:</i> A structure describing the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getModuleHelp() {
			return requestAction("ALSentinel/getModuleHelp/()");
		}

		/**
		 * <summary> get the remaining physical memory value (one shot)
		 * </summary> <br />
		 * <i>Actual SDK return value:</i> the remaining RAM in kb
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getRemainingRam() {
			return requestAction("ALSentinel/getRemainingRam/()");
		}

		/**
		 * <summary> Gets the method usage string. This summarise how to use the
		 * method. </summary>
		 * 
		 * @param name
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A string that summarises
		 *            the usage of the method.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getUsage(final String name) {
			return requestAction("ALSentinel/getUsage/" + "'" + name + "'");
		}

		/**
		 * <summary> callback for internal use. </summary>
		 * 
		 * @param dataName
		 *            Name of the modified data
		 * @param data
		 *            value of the data
		 * @param message
		 *            associate message.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject onAccX(final String dataname, final String data,
				final String message) {
			return requestAction("ALSentinel/onAccX/" + "'" + dataname + "'"
					+ "+'" + data + "'" + "+'" + message + "'");
		}

		/**
		 * <summary> callback for internal use. </summary>
		 * 
		 * @param dataName
		 *            Name of the modified data
		 * @param data
		 *            value of the data
		 * @param message
		 *            associate message.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject onAccY(final String dataname, final String data,
				final String message) {
			return requestAction("ALSentinel/onAccY/" + "'" + dataname + "'"
					+ "+'" + data + "'" + "+'" + message + "'");
		}

		/**
		 * <summary> callback for internal use. </summary>
		 * 
		 * @param dataName
		 *            Name of the modified data
		 * @param data
		 *            value of the data
		 * @param message
		 *            associate message.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject onAccZ(final String dataname, final String data,
				final String message) {
			return requestAction("ALSentinel/onAccZ/" + "'" + dataname + "'"
					+ "+'" + data + "'" + "+'" + message + "'");
		}

		/**
		 * <summary> callback for internal use. </summary>
		 * 
		 * @param dataName
		 *            Name of the modified data
		 * @param data
		 *            value of the data
		 * @param message
		 *            associate message.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject onBatteryMeasure(final String dataname,
				final String data, final String message) {
			return requestAction("ALSentinel/onBatteryMeasure/" + "'"
					+ dataname + "'" + "+'" + data + "'" + "+'" + message + "'");
		}

		/**
		 * <summary> callback for change in battery power level. (internal use).
		 * </summary>
		 * 
		 * @param dataName
		 *            Name of the modified data
		 * @param data
		 *            value of the data
		 * @param message
		 *            associate message.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject onMotorError(final String dataname,
				final String data, final String message) {
			return requestAction("ALSentinel/onMotorError/" + "'" + dataname
					+ "'" + "+'" + data + "'" + "+'" + message + "'");
		}

		/**
		 * <summary> callback for change in battery power level. (internal use).
		 * </summary>
		 * 
		 * @param dataName
		 *            Name of the modified data
		 * @param data
		 *            value of the data
		 * @param message
		 *            associate message.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject onTemperatureMeasure(final String dataname,
				final String data, final String message) {
			return requestAction("ALSentinel/onTemperatureMeasure/" + "'"
					+ dataname + "'" + "+'" + data + "'" + "+'" + message + "'");
		}

		/**
		 * <summary> Just a ping. Always returns true </summary> <br />
		 * <i>Actual SDK return value:</i> returns true
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ping() {
			return requestAction("ALSentinel/ping/()");
		}

		/**
		 * <summary> callback when the power button is pressed. (internal use).
		 * </summary>
		 * 
		 * @param dataName
		 *            Name of the modified data
		 * @param data
		 *            value of the data
		 * @param message
		 *            associate message.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject powerButtonOnPress(final String dataname,
				final String data, final String message) {
			return requestAction("ALSentinel/powerButtonOnPress/" + "'"
					+ dataname + "'" + "+'" + data + "'" + "+'" + message + "'");
		}

		/**
		 * <summary> Launch a small presentation of Nao: name, ip, battery. It's
		 * the default behavior launched when user press on the chest </summary>
		 * 
		 * @param enableFastCheckJoints
		 *            if true, Nao will quickly check that his joints are moving
		 *            properly.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject presentation(final boolean enablefastcheckjoints) {
			return requestAction("ALSentinel/presentation/"
					+ enablefastcheckjoints);
		}

		/**
		 * <summary> Monitors buttons and Battery. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject run() {
			return requestAction("ALSentinel/run/()");
		}

		/**
		 * <summary> Change the power threshold; below it, Nao will sit down and
		 * remove power from his motors. </summary>
		 * 
		 * @param powerLimit
		 *            power limit in percent, default: 0.07; 0.00 to disable
		 *            this feature.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setPowerLimit(final float powerlimit) {
			return requestAction("ALSentinel/setPowerLimit/" + powerlimit);
		}

		/**
		 * <summary> Returns the version of the module. </summary> <br />
		 * <i>Actual SDK return value:</i> A string containing the version of
		 * the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject version() {
			return requestAction("ALSentinel/version/()");
		}
	}

	public ALSentinel createALSentinel() {
		return new ALSentinel();
	}

	/**
	 * <summary>Deals with Ultrasonic sound Sensors. Usefull to detect an
	 * obstacle.</summary>
	 */
	public class ALSonar {

		/**
		 * <summary> Local Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALSonarProxy(String[] pbroker) {
			return requestAction("ALSonar/ALSonarProxy/" + "'" + pbroker + "'");
		}

		/**
		 * <summary> Remote Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALSonarProxy(String pip, int pport) {
			return requestAction("ALSonar/ALSonarProxy/" + "'" + pip + "'"
					+ "," + pport);
		}

		/**
		 * <summary> Gets the underlying generic proxy </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getGenericProxy() {
			return requestAction("ALSonar/getGenericProxy/()");
		}

		/**
		 * <summary> Wait for the end of a long running method that was called
		 * using 'post' </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post'
		 * @param timeoutPeriod
		 *            The timeout period in ms. To wait indefinately, use a
		 *            timeoutPeriod of zero. <br />
		 *            <i>Actual SDK return value:</i>True if the timeout period
		 *            terminated. False if the method returned.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject wait(final int id, final int timeoutperiod) {
			return requestAction("ALSonar/wait/" + id + "," + timeoutperiod);
		}

		/**
		 * <summary> stop a long running method that was called using 'post'
		 * </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stop(final int id) {
			return requestAction("ALSonar/stop/" + id);
		}

		/**
		 * <summary> isRunning </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isRunning(final int id) {
			return requestAction("ALSonar/isRunning/" + id);
		}

		/**
		 * <summary> Exits and unregisters the module. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject exit() {
			return requestAction("ALSonar/exit/()");
		}

		/**
		 * <summary> Gets the name of the parent broker. </summary> <br />
		 * <i>Actual SDK return value:</i> The name of the parent broker.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getBrokerName() {
			return requestAction("ALSonar/getBrokerName/()");
		}

		/**
		 * <summary> Gets the current period. </summary> <br />
		 * <i>Actual SDK return value:</i> Refresh period (in milliseconds).
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getCurrentPeriod() {
			return requestAction("ALSonar/getCurrentPeriod/()");
		}

		/**
		 * <summary> Gets the current precision. </summary> <br />
		 * <i>Actual SDK return value:</i> Precision of the extractor.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getCurrentPrecision() {
			return requestAction("ALSonar/getCurrentPrecision/()");
		}

		/**
		 * <summary> Retrieves a method's description. </summary>
		 * 
		 * @param methodName
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A structure containing the
		 *            method's description.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodHelp(final String methodname) {
			return requestAction("ALSonar/getMethodHelp/" + "'" + methodname
					+ "'");
		}

		/**
		 * <summary> Retrieves the module's method list. </summary> <br />
		 * <i>Actual SDK return value:</i> An array of method names.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodList() {
			return requestAction("ALSonar/getMethodList/()");
		}

		/**
		 * <summary> Retrieves the module's description. </summary> <br />
		 * <i>Actual SDK return value:</i> A structure describing the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getModuleHelp() {
			return requestAction("ALSonar/getModuleHelp/()");
		}

		/**
		 * <summary> Gets the period for a specific subscription. </summary>
		 * 
		 * @param name
		 *            Name of the module which has subscribed. <br />
		 *            <i>Actual SDK return value:</i> Refresh period (in
		 *            milliseconds).
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMyPeriod(final String name) {
			return requestAction("ALSonar/getMyPeriod/" + "'" + name + "'");
		}

		/**
		 * <summary> Gets the precision for a specific subscription. </summary>
		 * 
		 * @param name
		 *            name of the module which has subscribed <br />
		 *            <i>Actual SDK return value:</i> precision of the extractor
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMyPrecision(final String name) {
			return requestAction("ALSonar/getMyPrecision/" + "'" + name + "'");
		}

		/**
		 * <summary> Get the list of values updated in ALMemory. </summary> <br />
		 * <i>Actual SDK return value:</i> Array of values updated by this
		 * extractor in ALMemory
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getOutputNames() {
			return requestAction("ALSonar/getOutputNames/()");
		}

		/**
		 * <summary> Gets the parameters given by the module. </summary> <br />
		 * <i>Actual SDK return value:</i> Array of names and parameters of all
		 * subscribers.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getSubscribersInfo() {
			return requestAction("ALSonar/getSubscribersInfo/()");
		}

		/**
		 * <summary> Gets the method usage string. This summarise how to use the
		 * method. </summary>
		 * 
		 * @param name
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A string that summarises
		 *            the usage of the method.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getUsage(final String name) {
			return requestAction("ALSonar/getUsage/" + "'" + name + "'");
		}

		/**
		 * <summary> Just a ping. Always returns true </summary> <br />
		 * <i>Actual SDK return value:</i> returns true
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ping() {
			return requestAction("ALSonar/ping/()");
		}

		/**
		 * <summary> Subscribes to the extractor. This causes the extractor to
		 * start writing information to memory using the keys described by
		 * getOutputNames(). These can be accessed in memory using
		 * ALMemory.getData(\"keyName\"). In many cases you can avoid calling
		 * subscribe on the extractor by just calling
		 * ALMemory.subscribeToEvent() supplying a callback method. This will
		 * automatically subscribe to the extractor for you. </summary>
		 * 
		 * @param name
		 *            Name of the module which subscribes.
		 * @param period
		 *            Refresh period (in milliseconds) if relevant.
		 * @param precision
		 *            Precision of the extractor if relevant.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject subscribe(final String name, final int period,
				final float precision) {
			return requestAction("ALSonar/subscribe/" + "'" + name + "'" + ","
					+ period + "," + precision);
		}

		/**
		 * <summary> Subscribes to the extractor. This causes the extractor to
		 * start writing information to memory using the keys described by
		 * getOutputNames(). These can be accessed in memory using
		 * ALMemory.getData(\"keyName\"). In many cases you can avoid calling
		 * subscribe on the extractor by just calling
		 * ALMemory.subscribeToEvent() supplying a callback method. This will
		 * automatically subscribe to the extractor for you. </summary>
		 * 
		 * @param name
		 *            Name of the module which subscribes.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject subscribe(final String name) {
			return requestAction("ALSonar/subscribe/" + "'" + name + "'");
		}

		/**
		 * <summary> Unsubscribes from the extractor. </summary>
		 * 
		 * @param name
		 *            Name of the module which had subscribed.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject unsubscribe(final String name) {
			return requestAction("ALSonar/unsubscribe/" + "'" + name + "'");
		}

		/**
		 * <summary> Updates the period if relevant. </summary>
		 * 
		 * @param name
		 *            Name of the module which has subscribed.
		 * @param period
		 *            Refresh period (in milliseconds).
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject updatePeriod(final String name, final int period) {
			return requestAction("ALSonar/updatePeriod/" + "'" + name + "'"
					+ "," + period);
		}

		/**
		 * <summary> Updates the precision if relevant. </summary>
		 * 
		 * @param name
		 *            Name of the module which has subscribed.
		 * @param precision
		 *            Precision of the extractor.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject updatePrecision(final String name,
				final float precision) {
			return requestAction("ALSonar/updatePrecision/" + "'" + name + "'"
					+ "," + precision);
		}

		/**
		 * <summary> Returns the version of the module. </summary> <br />
		 * <i>Actual SDK return value:</i> A string containing the version of
		 * the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject version() {
			return requestAction("ALSonar/version/()");
		}
	}

	public ALSonar createALSonar() {
		return new ALSonar();
	}

	/**
	 * <summary>This module detects in incoming audio buffers every sound with a
	 * significative level.</summary>
	 */
	public class ALSoundDetection {

		/**
		 * <summary> Local Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALSoundDetectionProxy(String[] pbroker) {
			return requestAction("ALSoundDetection/ALSoundDetectionProxy/"
					+ "'" + pbroker + "'");
		}

		/**
		 * <summary> Remote Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALSoundDetectionProxy(String pip, int pport) {
			return requestAction("ALSoundDetection/ALSoundDetectionProxy/"
					+ "'" + pip + "'" + "," + pport);
		}

		/**
		 * <summary> Gets the underlying generic proxy </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getGenericProxy() {
			return requestAction("ALSoundDetection/getGenericProxy/()");
		}

		/**
		 * <summary> Wait for the end of a long running method that was called
		 * using 'post' </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post'
		 * @param timeoutPeriod
		 *            The timeout period in ms. To wait indefinately, use a
		 *            timeoutPeriod of zero. <br />
		 *            <i>Actual SDK return value:</i>True if the timeout period
		 *            terminated. False if the method returned.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject wait(final int id, final int timeoutperiod) {
			return requestAction("ALSoundDetection/wait/" + id + ","
					+ timeoutperiod);
		}

		/**
		 * <summary> stop a long running method that was called using 'post'
		 * </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stop(final int id) {
			return requestAction("ALSoundDetection/stop/" + id);
		}

		/**
		 * <summary> isRunning </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isRunning(final int id) {
			return requestAction("ALSoundDetection/isRunning/" + id);
		}

		/**
		 * <summary> Exits and unregisters the module. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject exit() {
			return requestAction("ALSoundDetection/exit/()");
		}

		/**
		 * <summary> Gets the name of the parent broker. </summary> <br />
		 * <i>Actual SDK return value:</i> The name of the parent broker.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getBrokerName() {
			return requestAction("ALSoundDetection/getBrokerName/()");
		}

		/**
		 * <summary> Gets the current period. </summary> <br />
		 * <i>Actual SDK return value:</i> Refresh period (in milliseconds).
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getCurrentPeriod() {
			return requestAction("ALSoundDetection/getCurrentPeriod/()");
		}

		/**
		 * <summary> Gets the current precision. </summary> <br />
		 * <i>Actual SDK return value:</i> Precision of the extractor.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getCurrentPrecision() {
			return requestAction("ALSoundDetection/getCurrentPrecision/()");
		}

		/**
		 * <summary> DEPRECATED - Get description of events </summary>
		 * 
		 * @param type
		 *            Name of detector. For now only one detector is available :
		 *            \"soundDetection/SoundDetector\".
		 * @param nameDesc
		 *            Name of the description : 'default' if not defined <br />
		 *            <i>Actual SDK return value:</i> Return description for all
		 *            detections
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getDescription(final String type,
				final String namedesc) {
			return requestAction("ALSoundDetection/getDescription/" + "'"
					+ type + "'" + "+'" + namedesc + "'");
		}

		/**
		 * <summary> DEPRECATED - Get index of events detected </summary>
		 * 
		 * @param type
		 *            Name of detector. For now only one detector is available :
		 *            \"soundDetection/SoundDetector\". <br />
		 *            <i>Actual SDK return value:</i> Return index of all
		 *            detections of the current audio buffer
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getEvents(final String type) {
			return requestAction("ALSoundDetection/getEvents/" + "'" + type
					+ "'");
		}

		/**
		 * <summary> Retrieves a method's description. </summary>
		 * 
		 * @param methodName
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A structure containing the
		 *            method's description.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodHelp(final String methodname) {
			return requestAction("ALSoundDetection/getMethodHelp/" + "'"
					+ methodname + "'");
		}

		/**
		 * <summary> Retrieves the module's method list. </summary> <br />
		 * <i>Actual SDK return value:</i> An array of method names.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodList() {
			return requestAction("ALSoundDetection/getMethodList/()");
		}

		/**
		 * <summary> Retrieves the module's description. </summary> <br />
		 * <i>Actual SDK return value:</i> A structure describing the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getModuleHelp() {
			return requestAction("ALSoundDetection/getModuleHelp/()");
		}

		/**
		 * <summary> Gets the period for a specific subscription. </summary>
		 * 
		 * @param name
		 *            Name of the module which has subscribed. <br />
		 *            <i>Actual SDK return value:</i> Refresh period (in
		 *            milliseconds).
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMyPeriod(final String name) {
			return requestAction("ALSoundDetection/getMyPeriod/" + "'" + name
					+ "'");
		}

		/**
		 * <summary> Gets the precision for a specific subscription. </summary>
		 * 
		 * @param name
		 *            name of the module which has subscribed <br />
		 *            <i>Actual SDK return value:</i> precision of the extractor
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMyPrecision(final String name) {
			return requestAction("ALSoundDetection/getMyPrecision/" + "'"
					+ name + "'");
		}

		/**
		 * <summary> Get the list of values updated in ALMemory. </summary> <br />
		 * <i>Actual SDK return value:</i> Array of values updated by this
		 * extractor in ALMemory
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getOutputNames() {
			return requestAction("ALSoundDetection/getOutputNames/()");
		}

		/**
		 * <summary> Gets the parameters given by the module. </summary> <br />
		 * <i>Actual SDK return value:</i> Array of names and parameters of all
		 * subscribers.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getSubscribersInfo() {
			return requestAction("ALSoundDetection/getSubscribersInfo/()");
		}

		/**
		 * <summary> Gets the method usage string. This summarise how to use the
		 * method. </summary>
		 * 
		 * @param name
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A string that summarises
		 *            the usage of the method.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getUsage(final String name) {
			return requestAction("ALSoundDetection/getUsage/" + "'" + name
					+ "'");
		}

		/**
		 * <summary> Just a ping. Always returns true </summary> <br />
		 * <i>Actual SDK return value:</i> returns true
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ping() {
			return requestAction("ALSoundDetection/ping/()");
		}

		/**
		 * <summary> enable/disable the printing of some debug information
		 * </summary>
		 * 
		 * @param bSetOrUnset
		 *            enable the functionnality when true.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setDebugMode(final boolean bsetorunset) {
			return requestAction("ALSoundDetection/setDebugMode/" + bsetorunset);
		}

		/**
		 * <summary> Set detection parameters </summary>
		 * 
		 * @param paraDetect
		 *            Name of the parameter. Please refer to the example below
		 *            for the available parameters.
		 * @param param
		 *            Value of the parameter.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setParameter(final String paradetect,
				final float param) {
			return requestAction("ALSoundDetection/setParameter/" + "'"
					+ paradetect + "'" + "," + param);
		}

		/**
		 * <summary> DEPRECATED - Set detection parameters </summary>
		 * 
		 * @param type
		 *            Name of detector. For now only one detector is available :
		 *            \"soundDetection/SoundDetector\".
		 * @param paraDetect
		 *            Name of the parameter. Please refer to the example below
		 *            for the available parameters.
		 * @param param
		 *            Value of the parameter.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setParameter(final String type,
				final String paradetect, final float param) {
			return requestAction("ALSoundDetection/setParameter/" + "'" + type
					+ "'" + "+'" + paradetect + "'" + "," + param);
		}

		/**
		 * <summary> Subscribes to the extractor. This causes the extractor to
		 * start writing information to memory using the keys described by
		 * getOutputNames(). These can be accessed in memory using
		 * ALMemory.getData(\"keyName\"). In many cases you can avoid calling
		 * subscribe on the extractor by just calling
		 * ALMemory.subscribeToEvent() supplying a callback method. This will
		 * automatically subscribe to the extractor for you. </summary>
		 * 
		 * @param name
		 *            Name of the module which subscribes.
		 * @param period
		 *            Refresh period (in milliseconds) if relevant.
		 * @param precision
		 *            Precision of the extractor if relevant.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject subscribe(final String name, final int period,
				final float precision) {
			return requestAction("ALSoundDetection/subscribe/" + "'" + name
					+ "'" + "," + period + "," + precision);
		}

		/**
		 * <summary> Subscribes to the extractor. This causes the extractor to
		 * start writing information to memory using the keys described by
		 * getOutputNames(). These can be accessed in memory using
		 * ALMemory.getData(\"keyName\"). In many cases you can avoid calling
		 * subscribe on the extractor by just calling
		 * ALMemory.subscribeToEvent() supplying a callback method. This will
		 * automatically subscribe to the extractor for you. </summary>
		 * 
		 * @param name
		 *            Name of the module which subscribes.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject subscribe(final String name) {
			return requestAction("ALSoundDetection/subscribe/" + "'" + name
					+ "'");
		}

		/**
		 * <summary> Unsubscribes from the extractor. </summary>
		 * 
		 * @param name
		 *            Name of the module which had subscribed.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject unsubscribe(final String name) {
			return requestAction("ALSoundDetection/unsubscribe/" + "'" + name
					+ "'");
		}

		/**
		 * <summary> Updates the period if relevant. </summary>
		 * 
		 * @param name
		 *            Name of the module which has subscribed.
		 * @param period
		 *            Refresh period (in milliseconds).
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject updatePeriod(final String name, final int period) {
			return requestAction("ALSoundDetection/updatePeriod/" + "'" + name
					+ "'" + "," + period);
		}

		/**
		 * <summary> Updates the precision if relevant. </summary>
		 * 
		 * @param name
		 *            Name of the module which has subscribed.
		 * @param precision
		 *            Precision of the extractor.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject updatePrecision(final String name,
				final float precision) {
			return requestAction("ALSoundDetection/updatePrecision/" + "'"
					+ name + "'" + "," + precision);
		}

		/**
		 * <summary> Returns the version of the module. </summary> <br />
		 * <i>Actual SDK return value:</i> A string containing the version of
		 * the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject version() {
			return requestAction("ALSoundDetection/version/()");
		}
	}

	public ALSoundDetection createALSoundDetection() {
		return new ALSoundDetection();
	}

	/**
	 * <summary>ALSpeechRecognition gives access to the embedded voice
	 * recognition system. It can be dynamically modified. This class allows
	 * user to load the current words list that should be recognized. The result
	 * of the recognition engine is located in the ALMemory's key:
	 * "WordRecognized" The structure of the result is an array : [ (string)
	 * word , (float) confidence ]</summary>
	 */
	public class ALSpeechRecognition {

		/**
		 * <summary> Local Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALSpeechRecognitionProxy(String[] pbroker) {
			return requestAction("ALSpeechRecognition/ALSpeechRecognitionProxy/"
					+ "'" + pbroker + "'");
		}

		/**
		 * <summary> Remote Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALSpeechRecognitionProxy(String pip, int pport) {
			return requestAction("ALSpeechRecognition/ALSpeechRecognitionProxy/"
					+ "'" + pip + "'" + "," + pport);
		}

		/**
		 * <summary> Gets the underlying generic proxy </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getGenericProxy() {
			return requestAction("ALSpeechRecognition/getGenericProxy/()");
		}

		/**
		 * <summary> Wait for the end of a long running method that was called
		 * using 'post' </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post'
		 * @param timeoutPeriod
		 *            The timeout period in ms. To wait indefinately, use a
		 *            timeoutPeriod of zero. <br />
		 *            <i>Actual SDK return value:</i>True if the timeout period
		 *            terminated. False if the method returned.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject wait(final int id, final int timeoutperiod) {
			return requestAction("ALSpeechRecognition/wait/" + id + ","
					+ timeoutperiod);
		}

		/**
		 * <summary> stop a long running method that was called using 'post'
		 * </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stop(final int id) {
			return requestAction("ALSpeechRecognition/stop/" + id);
		}

		/**
		 * <summary> isRunning </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isRunning(final int id) {
			return requestAction("ALSpeechRecognition/isRunning/" + id);
		}

		/**
		 * <summary> Exits and unregisters the module. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject exit() {
			return requestAction("ALSpeechRecognition/exit/()");
		}

		/**
		 * <summary> Returns the list of the languages installed on the system.
		 * </summary> <br />
		 * <i>Actual SDK return value:</i> Array of strings that contains the
		 * list of the installed languages.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getAvailableLanguages() {
			return requestAction("ALSpeechRecognition/getAvailableLanguages/()");
		}

		/**
		 * <summary> Gets the name of the parent broker. </summary> <br />
		 * <i>Actual SDK return value:</i> The name of the parent broker.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getBrokerName() {
			return requestAction("ALSpeechRecognition/getBrokerName/()");
		}

		/**
		 * <summary> Gets the current period. </summary> <br />
		 * <i>Actual SDK return value:</i> Refresh period (in milliseconds).
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getCurrentPeriod() {
			return requestAction("ALSpeechRecognition/getCurrentPeriod/()");
		}

		/**
		 * <summary> Gets the current precision. </summary> <br />
		 * <i>Actual SDK return value:</i> Precision of the extractor.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getCurrentPrecision() {
			return requestAction("ALSpeechRecognition/getCurrentPrecision/()");
		}

		/**
		 * <summary> Returns the current language used by the speech recognition
		 * system. </summary> <br />
		 * <i>Actual SDK return value:</i> Current language used by the speech
		 * recognition engine.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getLanguage() {
			return requestAction("ALSpeechRecognition/getLanguage/()");
		}

		/**
		 * <summary> Retrieves a method's description. </summary>
		 * 
		 * @param methodName
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A structure containing the
		 *            method's description.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodHelp(final String methodname) {
			return requestAction("ALSpeechRecognition/getMethodHelp/" + "'"
					+ methodname + "'");
		}

		/**
		 * <summary> Retrieves the module's method list. </summary> <br />
		 * <i>Actual SDK return value:</i> An array of method names.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodList() {
			return requestAction("ALSpeechRecognition/getMethodList/()");
		}

		/**
		 * <summary> Retrieves the module's description. </summary> <br />
		 * <i>Actual SDK return value:</i> A structure describing the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getModuleHelp() {
			return requestAction("ALSpeechRecognition/getModuleHelp/()");
		}

		/**
		 * <summary> Gets the period for a specific subscription. </summary>
		 * 
		 * @param name
		 *            Name of the module which has subscribed. <br />
		 *            <i>Actual SDK return value:</i> Refresh period (in
		 *            milliseconds).
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMyPeriod(final String name) {
			return requestAction("ALSpeechRecognition/getMyPeriod/" + "'"
					+ name + "'");
		}

		/**
		 * <summary> Gets the precision for a specific subscription. </summary>
		 * 
		 * @param name
		 *            name of the module which has subscribed <br />
		 *            <i>Actual SDK return value:</i> precision of the extractor
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMyPrecision(final String name) {
			return requestAction("ALSpeechRecognition/getMyPrecision/" + "'"
					+ name + "'");
		}

		/**
		 * <summary> Get the list of values updated in ALMemory. </summary> <br />
		 * <i>Actual SDK return value:</i> Array of values updated by this
		 * extractor in ALMemory
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getOutputNames() {
			return requestAction("ALSpeechRecognition/getOutputNames/()");
		}

		/**
		 * <summary> Gets a parameter of the speech recognition engine. Note
		 * that when the ASR engine language is set to Chinese, no parameter can
		 * be retrieved </summary>
		 * 
		 * @param paramName
		 *            Name of the parameter. <br />
		 *            <i>Actual SDK return value:</i> Value of the parameter.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getParameter(final String paramname) {
			return requestAction("ALSpeechRecognition/getParameter/" + "'"
					+ paramname + "'");
		}

		/**
		 * <summary> This function allows you to get the phonetic
		 * transcription(s) used by the speech recognition engine when it is
		 * asked to recognize a word. Note that when the ASR engine language is
		 * set to Chinese, no phonetic transcription can be retrieved.
		 * </summary>
		 * 
		 * @param word
		 *            Word to phoneticize. <br />
		 *            <i>Actual SDK return value:</i> Phonetic transcription(s)
		 *            of the word
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getPhoneticTranscription(final String word) {
			return requestAction("ALSpeechRecognition/getPhoneticTranscription/"
					+ "'" + word + "'");
		}

		/**
		 * <summary> Gets the parameters given by the module. </summary> <br />
		 * <i>Actual SDK return value:</i> Array of names and parameters of all
		 * subscribers.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getSubscribersInfo() {
			return requestAction("ALSpeechRecognition/getSubscribersInfo/()");
		}

		/**
		 * <summary> Gets the method usage string. This summarise how to use the
		 * method. </summary>
		 * 
		 * @param name
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A string that summarises
		 *            the usage of the method.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getUsage(final String name) {
			return requestAction("ALSpeechRecognition/getUsage/" + "'" + name
					+ "'");
		}

		/**
		 * <summary> Loads the vocabulary to recognized contained in a .lxd
		 * file. This method is not available with the ASR engine language set
		 * to Chinese. For more informations see the red documentation
		 * </summary>
		 * 
		 * @param vocabularyFile
		 *            Name of the lxd file containing the vocabulary
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject loadVocabulary(final String vocabularyfile) {
			return requestAction("ALSpeechRecognition/loadVocabulary/" + "'"
					+ vocabularyfile + "'");
		}

		/**
		 * <summary> Just a ping. Always returns true </summary> <br />
		 * <i>Actual SDK return value:</i> returns true
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ping() {
			return requestAction("ALSpeechRecognition/ping/()");
		}

		/**
		 * <summary> Enables or disables the playing of sounds indicating the
		 * state of the recognition engine. </summary>
		 * 
		 * @param setOrNot
		 *            Enable (true) or disable it (false).
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setAudioExpression(final boolean setornot) {
			return requestAction("ALSpeechRecognition/setAudioExpression/"
					+ setornot);
		}

		/**
		 * <summary> enable/disable the printing of some debug information
		 * </summary>
		 * 
		 * @param bSetOrUnset
		 *            enable the functionnality when true.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setDebugMode(final boolean bsetorunset) {
			return requestAction("ALSpeechRecognition/setDebugMode/"
					+ bsetorunset);
		}

		/**
		 * <summary> Sets the language used by the speech recognition engine.
		 * The list of the available languages can be collected through the
		 * getAvailableLanguages method. If you want to set a language as the
		 * default language (loading automatically at module launch), please
		 * refer to the web page of the robot. </summary>
		 * 
		 * @param languageName
		 *            Name of the language in English.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setLanguage(final String languagename) {
			return requestAction("ALSpeechRecognition/setLanguage/" + "'"
					+ languagename + "'");
		}

		/**
		 * <summary> Sets a parameter of the speech recognition engine. Note
		 * that when the ASR engine language is set to Chinese, no parameter can
		 * be set. The parameters that can be set and the corresponding values
		 * are: \"EarUseSpeechDetector\" - Values : 0 (No), 1 (Regular), or 2
		 * (Cepstral) : type of speech detector used by the ASR engine - default
		 * value is 2. \"EarSpeed\" - Values : 0 to 3 - 0 is slowest and most
		 * accurate. 3 is the fastest but may add some recognition errors,
		 * especially if you talk fast because some parts of the audio data is
		 * not processed. - default value is 2. \"EarUseFilter\" : Values : 0
		 * (no) or 1 (yes) - Applies a High-Pass filter on the input signal -
		 * default value is 0. </summary>
		 * 
		 * @param paramName
		 *            Name of the parameter.
		 * @param paramValue
		 *            Value of the parameter.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setParameter(final String paramname,
				final float paramvalue) {
			return requestAction("ALSpeechRecognition/setParameter/" + "'"
					+ paramname + "'" + "," + paramvalue);
		}

		/**
		 * <summary> Enables or disables the leds animations showing the state
		 * of the recognition engine during the recognition process. </summary>
		 * 
		 * @param setOrNot
		 *            Enable (true) or disable it (false).
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setVisualExpression(final boolean setornot) {
			return requestAction("ALSpeechRecognition/setVisualExpression/"
					+ setornot);
		}

		/**
		 * <summary> Sets the list of words (vocabulary) that should be
		 * recognized by the speech recognition engine. </summary>
		 * 
		 * @param vocabulary
		 *            List of words that should be recognized
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setWordListAsVocabulary(final String vocabulary) {
			return requestAction("ALSpeechRecognition/setWordListAsVocabulary/"
					+ "'" + vocabulary + "'");
		}

		/**
		 * <summary> Subscribes to the extractor. This causes the extractor to
		 * start writing information to memory using the keys described by
		 * getOutputNames(). These can be accessed in memory using
		 * ALMemory.getData(\"keyName\"). In many cases you can avoid calling
		 * subscribe on the extractor by just calling
		 * ALMemory.subscribeToEvent() supplying a callback method. This will
		 * automatically subscribe to the extractor for you. </summary>
		 * 
		 * @param name
		 *            Name of the module which subscribes.
		 * @param period
		 *            Refresh period (in milliseconds) if relevant.
		 * @param precision
		 *            Precision of the extractor if relevant.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject subscribe(final String name, final int period,
				final float precision) {
			return requestAction("ALSpeechRecognition/subscribe/" + "'" + name
					+ "'" + "," + period + "," + precision);
		}

		/**
		 * <summary> Subscribes to the extractor. This causes the extractor to
		 * start writing information to memory using the keys described by
		 * getOutputNames(). These can be accessed in memory using
		 * ALMemory.getData(\"keyName\"). In many cases you can avoid calling
		 * subscribe on the extractor by just calling
		 * ALMemory.subscribeToEvent() supplying a callback method. This will
		 * automatically subscribe to the extractor for you. </summary>
		 * 
		 * @param name
		 *            Name of the module which subscribes.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject subscribe(final String name) {
			return requestAction("ALSpeechRecognition/subscribe/" + "'" + name
					+ "'");
		}

		/**
		 * <summary> Unsubscribes from the extractor. </summary>
		 * 
		 * @param name
		 *            Name of the module which had subscribed.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject unsubscribe(final String name) {
			return requestAction("ALSpeechRecognition/unsubscribe/" + "'"
					+ name + "'");
		}

		/**
		 * <summary> Updates the period if relevant. </summary>
		 * 
		 * @param name
		 *            Name of the module which has subscribed.
		 * @param period
		 *            Refresh period (in milliseconds).
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject updatePeriod(final String name, final int period) {
			return requestAction("ALSpeechRecognition/updatePeriod/" + "'"
					+ name + "'" + "," + period);
		}

		/**
		 * <summary> Updates the precision if relevant. </summary>
		 * 
		 * @param name
		 *            Name of the module which has subscribed.
		 * @param precision
		 *            Precision of the extractor.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject updatePrecision(final String name,
				final float precision) {
			return requestAction("ALSpeechRecognition/updatePrecision/" + "'"
					+ name + "'" + "," + precision);
		}

		/**
		 * <summary> Returns the version of the module. </summary> <br />
		 * <i>Actual SDK return value:</i> A string containing the version of
		 * the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject version() {
			return requestAction("ALSpeechRecognition/version/()");
		}
	}

	public ALSpeechRecognition createALSpeechRecognition() {
		return new ALSpeechRecognition();
	}

	/**
	 * <summary>This module handles the text to speech operations. It converts
	 * std::strings into a PCM signal and sends it into the two speakers. The
	 * voice parameters can be changed using the FX settings.</summary>
	 */
	public class ALTextToSpeech {

		/**
		 * <summary> Local Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALTextToSpeechProxy(String[] pbroker) {
			return requestAction("ALTextToSpeech/ALTextToSpeechProxy/" + "'"
					+ pbroker + "'");
		}

		/**
		 * <summary> Remote Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALTextToSpeechProxy(String pip, int pport) {
			return requestAction("ALTextToSpeech/ALTextToSpeechProxy/" + "'"
					+ pip + "'" + "," + pport);
		}

		/**
		 * <summary> Gets the underlying generic proxy </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getGenericProxy() {
			return requestAction("ALTextToSpeech/getGenericProxy/()");
		}

		/**
		 * <summary> Wait for the end of a long running method that was called
		 * using 'post' </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post'
		 * @param timeoutPeriod
		 *            The timeout period in ms. To wait indefinately, use a
		 *            timeoutPeriod of zero. <br />
		 *            <i>Actual SDK return value:</i>True if the timeout period
		 *            terminated. False if the method returned.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject wait(final int id, final int timeoutperiod) {
			return requestAction("ALTextToSpeech/wait/" + id + ","
					+ timeoutperiod);
		}

		/**
		 * <summary> stop a long running method that was called using 'post'
		 * </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stop(final int id) {
			return requestAction("ALTextToSpeech/stop/" + id);
		}

		/**
		 * <summary> isRunning </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isRunning(final int id) {
			return requestAction("ALTextToSpeech/isRunning/" + id);
		}

		/**
		 * <summary> Disables the notifications puted in ALMemory during the
		 * synthesis (TextStarted, TextDone, CurrentBookMark, CurrentWord, ...)
		 * </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject disableNotifications() {
			return requestAction("ALTextToSpeech/disableNotifications/()");
		}

		/**
		 * <summary> Enables the notifications puted in ALMemory during the
		 * synthesis (TextStarted, TextDone, CurrentBookMark, CurrentWord, ...)
		 * </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject enableNotifications() {
			return requestAction("ALTextToSpeech/enableNotifications/()");
		}

		/**
		 * <summary> Exits and unregisters the module. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject exit() {
			return requestAction("ALTextToSpeech/exit/()");
		}

		/**
		 * <summary> Outputs the languages installed on the system. </summary> <br />
		 * <i>Actual SDK return value:</i> Array of std::string that contains
		 * the languages installed on the system.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getAvailableLanguages() {
			return requestAction("ALTextToSpeech/getAvailableLanguages/()");
		}

		/**
		 * <summary> Outputs the available voices. The returned list contains
		 * the voice IDs. </summary> <br />
		 * <i>Actual SDK return value:</i> Array of std::string containing the
		 * voices installed on the system.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getAvailableVoices() {
			return requestAction("ALTextToSpeech/getAvailableVoices/()");
		}

		/**
		 * <summary> Gets the name of the parent broker. </summary> <br />
		 * <i>Actual SDK return value:</i> The name of the parent broker.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getBrokerName() {
			return requestAction("ALTextToSpeech/getBrokerName/()");
		}

		/**
		 * <summary> Returns the language currently used by the text-to-speech
		 * engine. </summary> <br />
		 * <i>Actual SDK return value:</i> Language of the current voice.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getLanguage() {
			return requestAction("ALTextToSpeech/getLanguage/()");
		}

		/**
		 * <summary> Returns the encoding that should be used with the specified
		 * language. </summary>
		 * 
		 * @param pLanguage
		 *            Language name (as a std::string). Must belong to the
		 *            languages available in TTS. <br />
		 *            <i>Actual SDK return value:</i> Encoding of the specified
		 *            language.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getLanguageEncoding(final String planguage) {
			return requestAction("ALTextToSpeech/getLanguageEncoding/" + "'"
					+ planguage + "'");
		}

		/**
		 * <summary> Retrieves a method's description. </summary>
		 * 
		 * @param methodName
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A structure containing the
		 *            method's description.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodHelp(final String methodname) {
			return requestAction("ALTextToSpeech/getMethodHelp/" + "'"
					+ methodname + "'");
		}

		/**
		 * <summary> Retrieves the module's method list. </summary> <br />
		 * <i>Actual SDK return value:</i> An array of method names.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodList() {
			return requestAction("ALTextToSpeech/getMethodList/()");
		}

		/**
		 * <summary> Retrieves the module's description. </summary> <br />
		 * <i>Actual SDK return value:</i> A structure describing the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getModuleHelp() {
			return requestAction("ALTextToSpeech/getModuleHelp/()");
		}

		/**
		 * <summary> Returns the value of one of the voice parameters. The
		 * available parameters are: \"pitchShift\",
		 * \"doubleVoice\",\"doubleVoiceLevel\" and \"doubleVoiceTimeShift\"
		 * </summary>
		 * 
		 * @param pParameterName
		 *            Name of the parameter. <br />
		 *            <i>Actual SDK return value:</i> Value of the specified
		 *            parameter
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getParameter(final String pparametername) {
			return requestAction("ALTextToSpeech/getParameter/" + "'"
					+ pparametername + "'");
		}

		/**
		 * <summary> Gets the method usage string. This summarise how to use the
		 * method. </summary>
		 * 
		 * @param name
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A string that summarises
		 *            the usage of the method.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getUsage(final String name) {
			return requestAction("ALTextToSpeech/getUsage/" + "'" + name + "'");
		}

		/**
		 * <summary> Returns the voice currently used by the text-to-speech
		 * engine. </summary> <br />
		 * <i>Actual SDK return value:</i> Name of the current voice
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getVoice() {
			return requestAction("ALTextToSpeech/getVoice/()");
		}

		/**
		 * <summary> Fetches the current volume the text to speech. </summary> <br />
		 * <i>Actual SDK return value:</i> Volume (integer between 0 and 100).
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getVolume() {
			return requestAction("ALTextToSpeech/getVolume/()");
		}

		/**
		 * <summary> Loads a set of voice parameters defined in a xml file
		 * contained in the preferences folder.The name of the xml file must
		 * begin with ALTextToSpeech_Voice_ </summary>
		 * 
		 * @param pPreferenceName
		 *            Name of the voice preference.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject loadVoicePreference(final String ppreferencename) {
			return requestAction("ALTextToSpeech/loadVoicePreference/" + "'"
					+ ppreferencename + "'");
		}

		/**
		 * <summary> Just a ping. Always returns true </summary> <br />
		 * <i>Actual SDK return value:</i> returns true
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ping() {
			return requestAction("ALTextToSpeech/ping/()");
		}

		/**
		 * <summary> Performs the text-to-speech operations : it takes a
		 * std::string as input and outputs a sound in both speakers. It logs an
		 * error if the std::string is empty. String encoding must be UTF8..
		 * Asynchronous. </summary>
		 * 
		 * @param stringToSay
		 *            Text to say, encoded in UTF-8. <br />
		 *            <i>Actual SDK return value:</i> Id of the task. Can be
		 *            used to interrupt it.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject say(final String stringtosay) {
			return requestAction("ALTextToSpeech/say/" + "\"" + stringtosay
					+ "\"");
		}

		/**
		 * <summary> Performs the text-to-speech operations: it takes a
		 * std::string as input and outputs the corresponding audio signal in
		 * the specified file.. Asynchronous. </summary>
		 * 
		 * @param pStringToSay
		 *            Text to say, encoded in UTF-8.
		 * @param pFileName
		 *            RAW file where to store the generated signal. The signal
		 *            is encoded with a sample rate of 22050Hz, format S16_LE, 2
		 *            channels. <br />
		 *            <i>Actual SDK return value:</i> Id of the task. Can be
		 *            used to interrupt it.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject sayToFile(final String pstringtosay,
				final String pfilename) {
			return requestAction("ALTextToSpeech/sayToFile/" + "'"
					+ pstringtosay + "'" + "+'" + pfilename + "'");
		}

		/**
		 * <summary> This method performs the text-to-speech operations: it
		 * takes a std::string, outputs the synthesis resulting audio signal in
		 * a file, and then plays the audio file. The file is deleted
		 * afterwards. It is useful when you want to perform a short synthesis,
		 * when few CPU is available. Do not use it if you want a low-latency
		 * synthesis or to synthesize a long std::string.. Asynchronous.
		 * </summary>
		 * 
		 * @param pStringToSay
		 *            Text to say, encoded in UTF-8. <br />
		 *            <i>Actual SDK return value:</i> Id of the task. Can be
		 *            used to interrupt it.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject sayToFileAndPlay(final String pstringtosay) {
			return requestAction("ALTextToSpeech/sayToFileAndPlay/" + "'"
					+ pstringtosay + "'");
		}

		/**
		 * <summary> Changes the language used by the Text-to-Speech engine. It
		 * automatically changes the voice used since each of them is related to
		 * a unique language. If you want that change to take effect
		 * automatically after reboot of your robot, refer to the robot web page
		 * (setting page). </summary>
		 * 
		 * @param pLanguage
		 *            Language name. Must belong to the languages available in
		 *            TTS (can be obtained with the getAvailableLanguages
		 *            method). It should be an identifier std::string.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setLanguage(final String planguage) {
			return requestAction("ALTextToSpeech/setLanguage/" + "'"
					+ planguage + "'");
		}

		/**
		 * <summary> Changes the parameters of the voice. The available
		 * parameters are: </summary>
		 * 
		 * @param pEffectName
		 *            Name of the parameter.
		 * @param pEffectValue
		 *            Value of the parameter.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setParameter(final String peffectname,
				final float peffectvalue) {
			return requestAction("ALTextToSpeech/setParameter/" + "'"
					+ peffectname + "'" + "," + peffectvalue);
		}

		/**
		 * <summary> Changes the voice used by the text-to-speech engine. The
		 * voice identifier must belong to the installed voices, that can be
		 * listed using the 'getAvailableVoices' method. If the voice is not
		 * available, it remains unchanged. No exception is thrown in this case.
		 * </summary>
		 * 
		 * @param pVoiceID
		 *            The voice (as a std::string).
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setVoice(final String pvoiceid) {
			return requestAction("ALTextToSpeech/setVoice/" + "'" + pvoiceid
					+ "'");
		}

		/**
		 * <summary> Sets the volume of text-to-speech output. </summary>
		 * 
		 * @param volume
		 *            Volume (between 0.0 and 1.0).
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setVolume(final float volume) {
			return requestAction("ALTextToSpeech/setVolume/" + volume);
		}

		/**
		 * <summary> This method stops the current and all the pending tasks
		 * immediately. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stopAll() {
			return requestAction("ALTextToSpeech/stopAll/()");
		}

		/**
		 * <summary> Returns the version of the module. </summary> <br />
		 * <i>Actual SDK return value:</i> A string containing the version of
		 * the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject version() {
			return requestAction("ALTextToSpeech/version/()");
		}
	}

	public ALTextToSpeech createALTextToSpeech() {
		return new ALTextToSpeech();
	}

	/**
	 * <summary>ALVideoDevice, formerly called Video Input Module (V.I.M.), is
	 * architectured in order to provide every module related to vision, called
	 * Generic Video Module (G.V.M.), a direct access to raw images from video
	 * source, or an access to images transformed in the requested
	 * format.</summary>
	 */
	public class ALVideoDevice {

		/**
		 * <summary> Local Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALVideoDeviceProxy(String[] pbroker) {
			return requestAction("ALVideoDevice/ALVideoDeviceProxy/" + "'"
					+ pbroker + "'");
		}

		/**
		 * <summary> Remote Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALVideoDeviceProxy(String pip, int pport) {
			return requestAction("ALVideoDevice/ALVideoDeviceProxy/" + "'"
					+ pip + "'" + "," + pport);
		}

		/**
		 * <summary> Gets the underlying generic proxy </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getGenericProxy() {
			return requestAction("ALVideoDevice/getGenericProxy/()");
		}

		/**
		 * <summary> Wait for the end of a long running method that was called
		 * using 'post' </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post'
		 * @param timeoutPeriod
		 *            The timeout period in ms. To wait indefinately, use a
		 *            timeoutPeriod of zero. <br />
		 *            <i>Actual SDK return value:</i>True if the timeout period
		 *            terminated. False if the method returned.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject wait(final int id, final int timeoutperiod) {
			return requestAction("ALVideoDevice/wait/" + id + ","
					+ timeoutperiod);
		}

		/**
		 * <summary> stop a long running method that was called using 'post'
		 * </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stop(final int id) {
			return requestAction("ALVideoDevice/stop/" + id);
		}

		/**
		 * <summary> isRunning </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isRunning(final int id) {
			return requestAction("ALVideoDevice/isRunning/" + id);
		}

		/**
		 * <summary> Exits and unregisters the module. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject exit() {
			return requestAction("ALVideoDevice/exit/()");
		}

		/**
		 * <summary> Get the active camera </summary> <br />
		 * <i>Actual SDK return value:</i> 0: top camera - 1: bottom camera
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getActiveCamera() {
			return requestAction("ALVideoDevice/getActiveCamera/()");
		}

		/**
		 * <summary> Returns angles relative to camera axis given a normalized
		 * position in the image. </summary>
		 * 
		 * @param imgPos
		 *            normalized position in the image [0.0 - 1.0] <br />
		 *            <i>Actual SDK return value:</i> corresponding angles
		 *            values in radians.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getAngPosFromImgPos(final String imgpos) {
			return requestAction("ALVideoDevice/getAngPosFromImgPos/" + "'"
					+ imgpos + "'");
		}

		/**
		 * <summary> Returns angles relative to camera axis given a normalized
		 * position in the image. </summary>
		 * 
		 * @param imgSize
		 *            normalized position in the image [0.0 - 1.0] <br />
		 *            <i>Actual SDK return value:</i> corresponding angles
		 *            values in radians.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getAngSizeFromImgSize(final String imgsize) {
			return requestAction("ALVideoDevice/getAngSizeFromImgSize/" + "'"
					+ imgsize + "'");
		}

		/**
		 * <summary> Gets the name of the parent broker. </summary> <br />
		 * <i>Actual SDK return value:</i> The name of the parent broker.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getBrokerName() {
			return requestAction("ALVideoDevice/getBrokerName/()");
		}

		/**
		 * <summary> Returns a pointer to a locked ALImage, with data array
		 * pointing directly to raw data. No format conversion and no copy of
		 * the raw buffer. </summary>
		 * 
		 * @param id
		 *            Name under which the G.V.M. is known from ALVideoDevice. <br />
		 *            <i>Actual SDK return value:</i> Pointer to the locked
		 *            image buffer, NULL if error. Warning, image pointer is
		 *            valid only for C++ dynamic library.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getDirectRawImageLocal(final String id) {
			return requestAction("ALVideoDevice/getDirectRawImageLocal/" + "'"
					+ id + "'");
		}

		/**
		 * <summary> Fills pFrameOut with data coming directly from raw buffer
		 * (no format conversion). </summary>
		 * 
		 * @param id
		 *            Name under which the G.V.M. is known from ALVideoDevice. <br />
		 *            <i>Actual SDK return value:</i> Array containing image
		 *            informations :
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getDirectRawImageRemote(final String id) {
			return requestAction("ALVideoDevice/getDirectRawImageRemote/" + "'"
					+ id + "'");
		}

		/**
		 * <summary> Get the color space of the requested G.V.M. </summary>
		 * 
		 * @param id
		 *            Name under which the G.V.M. is known from ALVideoDevice. <br />
		 *            <i>Actual SDK return value:</i> { 0 = kYuv, 9 = kYUV422,
		 *            10 = kYUV, 11 = kRGB, 12 = kHSY, 13 = kBGR } -1: can't
		 *            access video source
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getGVMColorSpace(final String id) {
			return requestAction("ALVideoDevice/getGVMColorSpace/" + "'" + id
					+ "'");
		}

		/**
		 * <summary> Get the frame rate of the requested G.V.M. </summary>
		 * 
		 * @param id
		 *            Name under which the G.V.M. is known from ALVideoDevice. <br />
		 *            <i>Actual SDK return value:</i> { 5, 10, 15, 30 } -1:
		 *            can't access video source
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getGVMFrameRate(final String id) {
			return requestAction("ALVideoDevice/getGVMFrameRate/" + "'" + id
					+ "'");
		}

		/**
		 * <summary> Get the resolution of the requested G.V.M. </summary>
		 * 
		 * @param id
		 *            Name under which the G.V.M. is known from ALVideoDevice. <br />
		 *            <i>Actual SDK return value:</i> { 0 = kQQVGA, 1 = kQVGA, 2
		 *            = kVGA } -1: can't access video source
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getGVMResolution(final String id) {
			return requestAction("ALVideoDevice/getGVMResolution/" + "'" + id
					+ "'");
		}

		/**
		 * <summary> Applies transformations to the last image from video source
		 * and returns a pointer to a locked ALImage. </summary>
		 * 
		 * @param id
		 *            Name under which the G.V.M. is known from ALVideoDevice
		 *            (formerly called V.I.M.) <br />
		 *            <i>Actual SDK return value:</i> Pointer of the locked
		 *            image buffer, NULL if error.Warning, image pointer is
		 *            valid only for C++ dynamic library.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getImageLocal(final String id) {
			return requestAction("ALVideoDevice/getImageLocal/" + "'" + id
					+ "'");
		}

		/**
		 * <summary> Applies transformations to the last image from video source
		 * and fills pFrameOut. </summary>
		 * 
		 * @param id
		 *            Name under which the G.V.M. is known from ALVideoDevice. <br />
		 *            <i>Actual SDK return value:</i> Array containing image
		 *            informations :
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getImageRemote(final String id) {
			return requestAction("ALVideoDevice/getImageRemote/" + "'" + id
					+ "'");
		}

		/**
		 * <summary> Returns normalized image info from angles info in radians
		 * (as returned by vision extractors). </summary>
		 * 
		 * @param angles
		 *            camera angle values in radians. <br />
		 *            <i>Actual SDK return value:</i> corresponding normalized
		 *            position info.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getImgInfoFromAngInfo(final String angles) {
			return requestAction("ALVideoDevice/getImgInfoFromAngInfo/" + "'"
					+ angles + "'");
		}

		/**
		 * <summary> Returns image info from angles info in radians (as returned
		 * by vision extractors). Express image info in the requested
		 * resolution. </summary>
		 * 
		 * @param angInfo
		 *            camera angle values in radians.
		 * @param arg2
		 *            arg <br />
		 *            <i>Actual SDK return value:</i> corresponding position
		 *            info.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getImgInfoFromAngInfoWithRes(final String anginfo,
				final int arg2) {
			return requestAction("ALVideoDevice/getImgInfoFromAngInfoWithRes/"
					+ "'" + anginfo + "'" + "," + arg2);
		}

		/**
		 * <summary> Returns normalized image position from camera angles in
		 * radians. </summary>
		 * 
		 * @param angPos
		 *            camera angle values in radians. <br />
		 *            <i>Actual SDK return value:</i> corresponding normalized
		 *            position in the image [0.0 - 1.0]
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getImgPosFromAngPos(final String angpos) {
			return requestAction("ALVideoDevice/getImgPosFromAngPos/" + "'"
					+ angpos + "'");
		}

		/**
		 * <summary> Returns normalized image position from camera angles in
		 * radians. </summary>
		 * 
		 * @param angSize
		 *            camera angle values in radians. <br />
		 *            <i>Actual SDK return value:</i> corresponding normalized
		 *            position in the image [0.0 - 1.0]
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getImgSizeFromAngSize(final String angsize) {
			return requestAction("ALVideoDevice/getImgSizeFromAngSize/" + "'"
					+ angsize + "'");
		}

		/**
		 * <summary> Retrieves a method's description. </summary>
		 * 
		 * @param methodName
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A structure containing the
		 *            method's description.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodHelp(final String methodname) {
			return requestAction("ALVideoDevice/getMethodHelp/" + "'"
					+ methodname + "'");
		}

		/**
		 * <summary> Retrieves the module's method list. </summary> <br />
		 * <i>Actual SDK return value:</i> An array of method names.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodList() {
			return requestAction("ALVideoDevice/getMethodList/()");
		}

		/**
		 * <summary> Retrieves the module's description. </summary> <br />
		 * <i>Actual SDK return value:</i> A structure describing the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getModuleHelp() {
			return requestAction("ALVideoDevice/getModuleHelp/()");
		}

		/**
		 * <summary> Get the value of a video source specific parameter.
		 * </summary>
		 * 
		 * @param pParam
		 *            Parameter's reference among kCameraBrightnessID, <br />
		 *            <i>Actual SDK return value:</i> Parameter's value.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getParam(final int pparam) {
			return requestAction("ALVideoDevice/getParam/" + pparam);
		}

		/**
		 * <summary> Gets the method usage string. This summarise how to use the
		 * method. </summary>
		 * 
		 * @param name
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A string that summarises
		 *            the usage of the method.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getUsage(final String name) {
			return requestAction("ALVideoDevice/getUsage/" + "'" + name + "'");
		}

		/**
		 * <summary> Get the color space of the video source image. </summary> <br />
		 * <i>Actual SDK return value:</i> { 0 = kYuv, 9 = kYUV422, 10 = kYUV,
		 * 11 = kRGB, 12 = kHSY, 13 = kBGR } -1 can't access video source
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getVIMColorSpace() {
			return requestAction("ALVideoDevice/getVIMColorSpace/()");
		}

		/**
		 * <summary> Get the frame rate of the video source image. </summary> <br />
		 * <i>Actual SDK return value:</i> { 5, 10, 15, 30 } -1: can't access
		 * video source
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getVIMFrameRate() {
			return requestAction("ALVideoDevice/getVIMFrameRate/()");
		}

		/**
		 * <summary> Get the resolution of the video source image. </summary> <br />
		 * <i>Actual SDK return value:</i> { 0 = kQQVGA, 1 = kQVGA, 2 = kVGA }
		 * -1: can't access video source
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getVIMResolution() {
			return requestAction("ALVideoDevice/getVIMResolution/()");
		}

		/**
		 * <summary> Advanced method that asks if the framegrabber is off.
		 * </summary> <br />
		 * <i>Actual SDK return value:</i> true if off
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isFrameGrabberOff() {
			return requestAction("ALVideoDevice/isFrameGrabberOff/()");
		}

		/**
		 * <summary> Callback when client is disconnected </summary>
		 * 
		 * @param eventName
		 *            The echoed event name
		 * @param eventContents
		 *            The name of the client that has disconnected
		 * @param message
		 *            The message give when subscribing.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject onClientDisconnected(final String eventname,
				final String eventcontents, final String message) {
			return requestAction("ALVideoDevice/onClientDisconnected/" + "'"
					+ eventname + "'" + "+'" + eventcontents + "'" + "+'"
					+ message + "'");
		}

		/**
		 * <summary> Just a ping. Always returns true </summary> <br />
		 * <i>Actual SDK return value:</i> returns true
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ping() {
			return requestAction("ALVideoDevice/ping/()");
		}

		/**
		 * <summary> BETA - background record of an .arv raw format video from
		 * the images processed by a G.V.M. </summary>
		 * 
		 * @param id
		 *            Name under which the G.V.M. is known from the V.I.M.
		 * @param path
		 *            path/name of the video to be recorded
		 * @param totalNumber
		 *            number of images to be recorded. 0xFFFFFFFF for
		 *            \"unlimited\"
		 * @param period
		 *            one image recorded every pPeriod images <br />
		 *            <i>Actual SDK return value:</i> true if success
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject recordVideo(final String id, final String path,
				final int totalnumber, final int period) {
			return requestAction("ALVideoDevice/recordVideo/" + "'" + id + "'"
					+ "+'" + path + "'" + "," + totalnumber + "," + period);
		}

		/**
		 * <summary> Release image buffer locked by getDirectRawImageLocal().
		 * </summary>
		 * 
		 * @param id
		 *            Name under which the G.V.M. is known from the V.I.M. <br />
		 *            <i>Actual SDK return value:</i> true if success
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject releaseDirectRawImage(final String id) {
			return requestAction("ALVideoDevice/releaseDirectRawImage/" + "'"
					+ id + "'");
		}

		/**
		 * <summary> Release image buffer locked by getImageLocal(). </summary>
		 * 
		 * @param id
		 *            Name under which the G.V.M. is known from ALVideoDevice. <br />
		 *            <i>Actual SDK return value:</i> true if success
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject releaseImage(final String id) {
			return requestAction("ALVideoDevice/releaseImage/" + "'" + id + "'");
		}

		/**
		 * <summary> return the width and the height of a resolution </summary>
		 * 
		 * @param resolution
		 *            { 0 = kQQVGA, 1 = kQVGA, 2 = kVGA } <br />
		 *            <i>Actual SDK return value:</i> array of sizes: (return
		 *            [-1;-1] if the format is invalid)
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject resolutionToSizes(final int resolution) {
			return requestAction("ALVideoDevice/resolutionToSizes/"
					+ resolution);
		}

		/**
		 * <summary> Set the colorspace of the output image. </summary>
		 * 
		 * @param id
		 *            Name under which the G.V.M. is known from ALVideoDevice.
		 * @param colorSpace
		 *            { 0 = kYuv, 9 = kYUV422, 10 = kYUV, 11 = kRGB, 12 = kHSY,
		 *            13 = kBGR } <br />
		 *            <i>Actual SDK return value:</i> true if success
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setColorSpace(final String id, final int colorspace) {
			return requestAction("ALVideoDevice/setColorSpace/" + "'" + id
					+ "'" + "," + colorspace);
		}

		/**
		 * <summary> Set the required frame rate. </summary>
		 * 
		 * @param id
		 *            Name under which the G.V.M. is known from ALVideoDevice.
		 * @param frameRate
		 *            images per seconds { 5, 10, 15, 30 } <br />
		 *            <i>Actual SDK return value:</i> true if success
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setFrameRate(final String id, final int framerate) {
			return requestAction("ALVideoDevice/setFrameRate/" + "'" + id + "'"
					+ "," + framerate);
		}

		/**
		 * <summary> Sets the value of a specific parameter for the video
		 * source. </summary>
		 * 
		 * @param param
		 *            Parameter's reference among:
		 * @param newValue
		 *            Parameter's new value.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setParam(final int param, final int newvalue) {
			return requestAction("ALVideoDevice/setParam/" + param + ","
					+ newvalue);
		}

		/**
		 * <summary> Sets a specific parameter for the video source at its
		 * default value. </summary>
		 * 
		 * @param param
		 *            Parameter's reference.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setParamDefault(final int param) {
			return requestAction("ALVideoDevice/setParamDefault/" + param);
		}

		/**
		 * <summary> Set the size of the output image. </summary>
		 * 
		 * @param id
		 *            Name under which the G.V.M. is known from ALVideoDevice.
		 * @param size
		 *            { 0 = kQQVGA, 1 = kQVGA, 2 = kVGA } <br />
		 *            <i>Actual SDK return value:</i> true if success
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setResolution(final String id, final int size) {
			return requestAction("ALVideoDevice/setResolution/" + "'" + id
					+ "'" + "," + size);
		}

		/**
		 * <summary> return the resolution from sizes </summary>
		 * 
		 * @param width
		 *            width of the image
		 * @param height
		 *            height of the image <br />
		 *            <i>Actual SDK return value:</i> { 0 = kQQVGA, 1 = kQVGA, 2
		 *            = kVGA } or -1 if the inputs are invalid
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject sizesToResolution(final int width, final int height) {
			return requestAction("ALVideoDevice/sizesToResolution/" + width
					+ "," + height);
		}

		/**
		 * <summary> Advanced method that opens and initialize video source
		 * device if it was not before. </summary> <br />
		 * <i>Actual SDK return value:</i> true if success
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject startFrameGrabber() {
			return requestAction("ALVideoDevice/startFrameGrabber/()");
		}

		/**
		 * <summary> Advanced method that close video source device. </summary> <br />
		 * <i>Actual SDK return value:</i> true if success
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stopFrameGrabber() {
			return requestAction("ALVideoDevice/stopFrameGrabber/()");
		}

		/**
		 * <summary> BETA - stop writing the video sequence </summary>
		 * 
		 * @param id
		 *            Name under which the G.V.M. is known from ALVideoDevice. <br />
		 *            <i>Actual SDK return value:</i> true if success
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stopVideo(final String id) {
			return requestAction("ALVideoDevice/stopVideo/" + "'" + id + "'");
		}

		/**
		 * <summary> Register to ALVideoDevice (formerly Video Input
		 * Module/V.I.M.). When a General Video Module(G.V.M.) registers to
		 * ALVideoDevice, a buffer of the requested image format is added to the
		 * buffers list. </summary>
		 * 
		 * @param gvmName
		 *            Name of the registering G.V.M.
		 * @param resolution
		 *            Resolution requested. { 0 = kQQVGA, 1 = kQVGA, 2 = kVGA }
		 * @param colorSpace
		 *            Colorspace requested. { 0 = kYuv, 9 = kYUV422, 10 = kYUV,
		 *            11 = kRGB, 12 = kHSY, 13 = kBGR }
		 * @param fps
		 *            Fps (frames per second) requested. { 5, 10, 15, 30 } <br />
		 *            <i>Actual SDK return value:</i> Name under which the
		 *            G.V.M. is known from ALVideoDevice, 0 if failed.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject subscribe(final String gvmname, final int resolution,
				final int colorspace, final int fps) {
			return requestAction("ALVideoDevice/subscribe/" + "'" + gvmname
					+ "'" + "," + resolution + "," + colorspace + "," + fps);
		}

		/**
		 * <summary> Used to unregister a G.V.M. from ALVideoDevice. </summary>
		 * 
		 * @param id
		 *            Name under which the G.V.M. is known from ALVideoDevice.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject unsubscribe(final String id) {
			return requestAction("ALVideoDevice/unsubscribe/" + "'" + id + "'");
		}

		/**
		 * <summary> Returns the version of the module. </summary> <br />
		 * <i>Actual SDK return value:</i> A string containing the version of
		 * the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject version() {
			return requestAction("ALVideoDevice/version/()");
		}
	}

	public ALVideoDevice createALVideoDevice() {
		return new ALVideoDevice();
	}

	/**
	 * <summary>ALVisionRecognition is a module which detects and recognizes
	 * learned pictures, like pages of a comic books, faces of objects or even
	 * locations.</summary>
	 */
	public class ALVisionRecognition {

		/**
		 * <summary> Local Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALVisionRecognitionProxy(String[] pbroker) {
			return requestAction("ALVisionRecognition/ALVisionRecognitionProxy/"
					+ "'" + pbroker + "'");
		}

		/**
		 * <summary> Remote Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALVisionRecognitionProxy(String pip, int pport) {
			return requestAction("ALVisionRecognition/ALVisionRecognitionProxy/"
					+ "'" + pip + "'" + "," + pport);
		}

		/**
		 * <summary> Gets the underlying generic proxy </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getGenericProxy() {
			return requestAction("ALVisionRecognition/getGenericProxy/()");
		}

		/**
		 * <summary> Wait for the end of a long running method that was called
		 * using 'post' </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post'
		 * @param timeoutPeriod
		 *            The timeout period in ms. To wait indefinately, use a
		 *            timeoutPeriod of zero. <br />
		 *            <i>Actual SDK return value:</i>True if the timeout period
		 *            terminated. False if the method returned.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject wait(final int id, final int timeoutperiod) {
			return requestAction("ALVisionRecognition/wait/" + id + ","
					+ timeoutperiod);
		}

		/**
		 * <summary> stop a long running method that was called using 'post'
		 * </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stop(final int id) {
			return requestAction("ALVisionRecognition/stop/" + id);
		}

		/**
		 * <summary> isRunning </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isRunning(final int id) {
			return requestAction("ALVisionRecognition/isRunning/" + id);
		}

		/**
		 * <summary> Exits and unregisters the module. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject exit() {
			return requestAction("ALVisionRecognition/exit/()");
		}

		/**
		 * <summary> Gets the name of the parent broker. </summary> <br />
		 * <i>Actual SDK return value:</i> The name of the parent broker.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getBrokerName() {
			return requestAction("ALVisionRecognition/getBrokerName/()");
		}

		/**
		 * <summary> Gets the current period. </summary> <br />
		 * <i>Actual SDK return value:</i> Refresh period (in milliseconds).
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getCurrentPeriod() {
			return requestAction("ALVisionRecognition/getCurrentPeriod/()");
		}

		/**
		 * <summary> Gets the current precision. </summary> <br />
		 * <i>Actual SDK return value:</i> Precision of the extractor.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getCurrentPrecision() {
			return requestAction("ALVisionRecognition/getCurrentPrecision/()");
		}

		/**
		 * <summary> Retrieves a method's description. </summary>
		 * 
		 * @param methodName
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A structure containing the
		 *            method's description.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodHelp(final String methodname) {
			return requestAction("ALVisionRecognition/getMethodHelp/" + "'"
					+ methodname + "'");
		}

		/**
		 * <summary> Retrieves the module's method list. </summary> <br />
		 * <i>Actual SDK return value:</i> An array of method names.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodList() {
			return requestAction("ALVisionRecognition/getMethodList/()");
		}

		/**
		 * <summary> Retrieves the module's description. </summary> <br />
		 * <i>Actual SDK return value:</i> A structure describing the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getModuleHelp() {
			return requestAction("ALVisionRecognition/getModuleHelp/()");
		}

		/**
		 * <summary> Gets the period for a specific subscription. </summary>
		 * 
		 * @param name
		 *            Name of the module which has subscribed. <br />
		 *            <i>Actual SDK return value:</i> Refresh period (in
		 *            milliseconds).
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMyPeriod(final String name) {
			return requestAction("ALVisionRecognition/getMyPeriod/" + "'"
					+ name + "'");
		}

		/**
		 * <summary> Gets the precision for a specific subscription. </summary>
		 * 
		 * @param name
		 *            name of the module which has subscribed <br />
		 *            <i>Actual SDK return value:</i> precision of the extractor
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMyPrecision(final String name) {
			return requestAction("ALVisionRecognition/getMyPrecision/" + "'"
					+ name + "'");
		}

		/**
		 * <summary> Get the list of values updated in ALMemory. </summary> <br />
		 * <i>Actual SDK return value:</i> Array of values updated by this
		 * extractor in ALMemory
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getOutputNames() {
			return requestAction("ALVisionRecognition/getOutputNames/()");
		}

		/**
		 * <summary> Gets the parameters given by the module. </summary> <br />
		 * <i>Actual SDK return value:</i> Array of names and parameters of all
		 * subscribers.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getSubscribersInfo() {
			return requestAction("ALVisionRecognition/getSubscribersInfo/()");
		}

		/**
		 * <summary> Gets the method usage string. This summarise how to use the
		 * method. </summary>
		 * 
		 * @param name
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A string that summarises
		 *            the usage of the method.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getUsage(final String name) {
			return requestAction("ALVisionRecognition/getUsage/" + "'" + name
					+ "'");
		}

		/**
		 * <summary> load the database.ar1, ar2, ar3, ar4 and ar5 files that
		 * have to be on the robot in
		 * /home/nao/naoqi/share/naoqi/vision/visionrecognition/current.
		 * </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject load() {
			return requestAction("ALVisionRecognition/load/()");
		}

		/**
		 * <summary> Just a ping. Always returns true </summary> <br />
		 * <i>Actual SDK return value:</i> returns true
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ping() {
			return requestAction("ALVisionRecognition/ping/()");
		}

		/**
		 * <summary> protected method </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject run() {
			return requestAction("ALVisionRecognition/run/()");
		}

		/**
		 * <summary> Set vision recognition parameters. </summary>
		 * 
		 * @param paramName
		 *            Name of the parameter to be changed. Among
		 *            (\"resolution\",[int])
		 * @param paramValue
		 *            Value(s) of the parameter to be changed.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setParam(final String paramname,
				final String paramvalue) {
			return requestAction("ALVisionRecognition/setParam/" + "'"
					+ paramname + "'" + "+'" + paramvalue + "'");
		}

		/**
		 * <summary> Subscribes to the extractor. This causes the extractor to
		 * start writing information to memory using the keys described by
		 * getOutputNames(). These can be accessed in memory using
		 * ALMemory.getData(\"keyName\"). In many cases you can avoid calling
		 * subscribe on the extractor by just calling
		 * ALMemory.subscribeToEvent() supplying a callback method. This will
		 * automatically subscribe to the extractor for you. </summary>
		 * 
		 * @param name
		 *            Name of the module which subscribes.
		 * @param period
		 *            Refresh period (in milliseconds) if relevant.
		 * @param precision
		 *            Precision of the extractor if relevant.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject subscribe(final String name, final int period,
				final float precision) {
			return requestAction("ALVisionRecognition/subscribe/" + "'" + name
					+ "'" + "," + period + "," + precision);
		}

		/**
		 * <summary> Subscribes to the extractor. This causes the extractor to
		 * start writing information to memory using the keys described by
		 * getOutputNames(). These can be accessed in memory using
		 * ALMemory.getData(\"keyName\"). In many cases you can avoid calling
		 * subscribe on the extractor by just calling
		 * ALMemory.subscribeToEvent() supplying a callback method. This will
		 * automatically subscribe to the extractor for you. </summary>
		 * 
		 * @param name
		 *            Name of the module which subscribes.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject subscribe(final String name) {
			return requestAction("ALVisionRecognition/subscribe/" + "'" + name
					+ "'");
		}

		/**
		 * <summary> Unsubscribes from the extractor. </summary>
		 * 
		 * @param name
		 *            Name of the module which had subscribed.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject unsubscribe(final String name) {
			return requestAction("ALVisionRecognition/unsubscribe/" + "'"
					+ name + "'");
		}

		/**
		 * <summary> Updates the period if relevant. </summary>
		 * 
		 * @param name
		 *            Name of the module which has subscribed.
		 * @param period
		 *            Refresh period (in milliseconds).
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject updatePeriod(final String name, final int period) {
			return requestAction("ALVisionRecognition/updatePeriod/" + "'"
					+ name + "'" + "," + period);
		}

		/**
		 * <summary> Updates the precision if relevant. </summary>
		 * 
		 * @param name
		 *            Name of the module which has subscribed.
		 * @param precision
		 *            Precision of the extractor.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject updatePrecision(final String name,
				final float precision) {
			return requestAction("ALVisionRecognition/updatePrecision/" + "'"
					+ name + "'" + "," + precision);
		}

		/**
		 * <summary> Returns the version of the module. </summary> <br />
		 * <i>Actual SDK return value:</i> A string containing the version of
		 * the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject version() {
			return requestAction("ALVisionRecognition/version/()");
		}
	}

	public ALVisionRecognition createALVisionRecognition() {
		return new ALVisionRecognition();
	}

	/**
	 * <summary>This module contains different vision functionalities, like
	 * picture taking, video recording, white balance setting, etc ... Picture
	 * and videos are both saved in
	 * /home/nao/naoqi/share/naoqi/vision.</summary>
	 */
	public class ALVisionToolbox {

		/**
		 * <summary> Local Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALVisionToolboxProxy(String[] pbroker) {
			return requestAction("ALVisionToolbox/ALVisionToolboxProxy/" + "'"
					+ pbroker + "'");
		}

		/**
		 * <summary> Remote Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ALVisionToolboxProxy(String pip, int pport) {
			return requestAction("ALVisionToolbox/ALVisionToolboxProxy/" + "'"
					+ pip + "'" + "," + pport);
		}

		/**
		 * <summary> Gets the underlying generic proxy </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getGenericProxy() {
			return requestAction("ALVisionToolbox/getGenericProxy/()");
		}

		/**
		 * <summary> Wait for the end of a long running method that was called
		 * using 'post' </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post'
		 * @param timeoutPeriod
		 *            The timeout period in ms. To wait indefinately, use a
		 *            timeoutPeriod of zero. <br />
		 *            <i>Actual SDK return value:</i>True if the timeout period
		 *            terminated. False if the method returned.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject wait(final int id, final int timeoutperiod) {
			return requestAction("ALVisionToolbox/wait/" + id + ","
					+ timeoutperiod);
		}

		/**
		 * <summary> stop a long running method that was called using 'post'
		 * </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stop(final int id) {
			return requestAction("ALVisionToolbox/stop/" + id);
		}

		/**
		 * <summary> isRunning </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isRunning(final int id) {
			return requestAction("ALVisionToolbox/isRunning/" + id);
		}

		/**
		 * <summary> Indicates if we might be in backlighting conditions.
		 * </summary> <br />
		 * <i>Actual SDK return value:</i> range from 0(no backlight) to 100
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject backlighting() {
			return requestAction("ALVisionToolbox/backlighting/()");
		}

		/**
		 * <summary> Exits and unregisters the module. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject exit() {
			return requestAction("ALVisionToolbox/exit/()");
		}

		/**
		 * <summary> Gets the name of the parent broker. </summary> <br />
		 * <i>Actual SDK return value:</i> The name of the parent broker.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getBrokerName() {
			return requestAction("ALVisionToolbox/getBrokerName/()");
		}

		/**
		 * <summary> Retrieves a method's description. </summary>
		 * 
		 * @param methodName
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A structure containing the
		 *            method's description.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodHelp(final String methodname) {
			return requestAction("ALVisionToolbox/getMethodHelp/" + "'"
					+ methodname + "'");
		}

		/**
		 * <summary> Retrieves the module's method list. </summary> <br />
		 * <i>Actual SDK return value:</i> An array of method names.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodList() {
			return requestAction("ALVisionToolbox/getMethodList/()");
		}

		/**
		 * <summary> Retrieves the module's description. </summary> <br />
		 * <i>Actual SDK return value:</i> A structure describing the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getModuleHelp() {
			return requestAction("ALVisionToolbox/getModuleHelp/()");
		}

		/**
		 * <summary> Gets the method usage string. This summarise how to use the
		 * method. </summary>
		 * 
		 * @param name
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A string that summarises
		 *            the usage of the method.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getUsage(final String name) {
			return requestAction("ALVisionToolbox/getUsage/" + "'" + name + "'");
		}

		/**
		 * <summary> Prepare camera for shooting (like the auto-focus on
		 * standard and digital cameras) </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject halfPress() {
			return requestAction("ALVisionToolbox/halfPress/()");
		}

		/**
		 * <summary> Tell if it is dark around. </summary> <br />
		 * <i>Actual SDK return value:</i> [0;4] outdoor - [5;100] indoor bright
		 * - [101;127] shadowed place
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isItDark() {
			return requestAction("ALVisionToolbox/isItDark/()");
		}

		/**
		 * <summary>
		 * 
		 * </summary> <br />
		 * <i>Actual SDK return value:</i> True/False
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isVideoRecording() {
			return requestAction("ALVisionToolbox/isVideoRecording/()");
		}

		/**
		 * <summary> Print in the logger the info for an instance of
		 * takePictureRegurarly() </summary>
		 * 
		 * @param instanceNumber
		 *            number of the instance we want to get info on
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject logTPRInstanceInfo(final int instancenumber) {
			return requestAction("ALVisionToolbox/logTPRInstanceInfo/"
					+ instancenumber);
		}

		/**
		 * <summary> Just a ping. Always returns true </summary> <br />
		 * <i>Actual SDK return value:</i> returns true
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ping() {
			return requestAction("ALVisionToolbox/ping/()");
		}

		/**
		 * <summary> Set white balance by using Nao's white hands as reference.
		 * </summary>
		 * 
		 * @param camera
		 *            Camera we want to set white balance to : [0] top - [1]
		 *            bottom - [2] both
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setWhiteBalance(final int camera) {
			return requestAction("ALVisionToolbox/setWhiteBalance/" + camera);
		}

		/**
		 * <summary> Start recording a video. The .avi video is stored on the
		 * robot in the /home/nao/naoqi/share/naoqi/vision folder. The record
		 * should be stopped by calling stopVideoRecord(). Resolution: 320*240,
		 * MJPG format, frame rate ~10-15 fps. Please note that only one record
		 * at a time can be made. </summary>
		 * 
		 * @param videoName
		 *            Name of the video file to be recorded.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject startVideoRecord(final String videoname) {
			return requestAction("ALVisionToolbox/startVideoRecord/" + "'"
					+ videoname + "'");
		}

		/**
		 * <summary> Start recording a video, with advanced options. Please note
		 * that only one record at a time can be made. </summary>
		 * 
		 * @param videoName
		 *            Name of the video file to be recorded.
		 * @param framerate
		 *            Record frame rate [0.1-50.0]. Warning: MJPG format
		 *            requires framerate greater than 2.0.
		 * @param format
		 *            ARV = raw YUV422 format; IYUV = raw avi, MJPG = compressed
		 *            avi.
		 * @param resIndex
		 *            Resolution index. 0 = 160*120, 1 = 320*240, 2 = 640*480
		 * @param numFrames
		 *            Number of frames to record. If less than 0, it records
		 *            until stopVideoRecord() is called.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject startVideoRecord_adv(final String videoname,
				final float framerate, final String format, final int resindex,
				final int numframes) {
			return requestAction("ALVisionToolbox/startVideoRecord_adv/" + "'"
					+ videoname + "'" + "," + framerate + "+'" + format + "'"
					+ "," + resindex + "," + numframes);
		}

		/**
		 * <summary> Stop an instance of takePictureRegularly() </summary>
		 * 
		 * @param pathAndNameRoot
		 *            path and name root of the file we want to stop recording
		 * @param imageRecordFormat
		 *            formats of the file we want to stop recording
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stopTPR(final String pathandnameroot,
				final String imagerecordformat) {
			return requestAction("ALVisionToolbox/stopTPR/" + "'"
					+ pathandnameroot + "'" + "+'" + imagerecordformat + "'");
		}

		/**
		 * <summary> Stop a video record that was launched with
		 * startVideoRecord() or startVideoRecord_adv(). The function returns
		 * the number of frames that were recorded, as well as the video
		 * absolute file name. </summary> <br />
		 * <i>Actual SDK return value:</i> Array of two elements
		 * [numRecordedFrames, recordAbsolutePath]
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stopVideoRecord() {
			return requestAction("ALVisionToolbox/stopVideoRecord/()");
		}

		/**
		 * <summary> Shoot 3 successives pictures and place them in the
		 * /home/nao/naoqi/share/naoqi/vision folder. If halfPress has not been
		 * called before, it will take longer between click and shoot.
		 * </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject takePicture() {
			return requestAction("ALVisionToolbox/takePicture/()");
		}

		/**
		 * <summary> Shoot regularly a picture to follow Nao's evolution in his
		 * environment </summary>
		 * 
		 * @param secondsBetweenTwoShots
		 *            how many seconds between two pictures?
		 * @param pathAndNameRoot
		 *            path and the root of the name for the picture
		 * @param overwriteImage
		 *            do we need to overwrite the picture, or do we add a
		 *            timestamp to the name?
		 * @param imageRecordFormat
		 *            such as jpeg, bmp, png, etc.
		 * @param resolution
		 *            resolution for the image (e.g. kQQVGA, kQVGA)
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject takePictureRegularly(
				final float secondsbetweentwoshots,
				final String pathandnameroot, final boolean overwriteimage,
				final String imagerecordformat, final int resolution) {
			return requestAction("ALVisionToolbox/takePictureRegularly/"
					+ secondsbetweentwoshots + "+'" + pathandnameroot + "'"
					+ "," + overwriteimage + "+'" + imagerecordformat + "'"
					+ "," + resolution);
		}

		/**
		 * <summary> Returns the version of the module. </summary> <br />
		 * <i>Actual SDK return value:</i> A string containing the version of
		 * the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject version() {
			return requestAction("ALVisionToolbox/version/()");
		}
	}

	public ALVisionToolbox createALVisionToolbox() {
		return new ALVisionToolbox();
	}

	/**
	 * <summary>Manage link with devices (sensors and actuators). See specific
	 * documentation.</summary>
	 */
	public class DCM {

		/**
		 * <summary> Local Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject DCMProxy(String[] pbroker) {
			return requestAction("DCM/DCMProxy/" + "'" + pbroker + "'");
		}

		/**
		 * <summary> Remote Constructor </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject DCMProxy(String pip, int pport) {
			return requestAction("DCM/DCMProxy/" + "'" + pip + "'" + ","
					+ pport);
		}

		/**
		 * <summary> Gets the underlying generic proxy </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getGenericProxy() {
			return requestAction("DCM/getGenericProxy/()");
		}

		/**
		 * <summary> Wait for the end of a long running method that was called
		 * using 'post' </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post'
		 * @param timeoutPeriod
		 *            The timeout period in ms. To wait indefinately, use a
		 *            timeoutPeriod of zero. <br />
		 *            <i>Actual SDK return value:</i>True if the timeout period
		 *            terminated. False if the method returned.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject wait(final int id, final int timeoutperiod) {
			return requestAction("DCM/wait/" + id + "," + timeoutperiod);
		}

		/**
		 * <summary> stop a long running method that was called using 'post'
		 * </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject stop(final int id) {
			return requestAction("DCM/stop/" + id);
		}

		/**
		 * <summary> isRunning </summary>
		 * 
		 * @param id
		 *            The ID of the method that was returned when calling the
		 *            method using 'post' <br />
		 *            <i>Actual SDK return value:</i>True if if the method is
		 *            currently running.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject isRunning(final int id) {
			return requestAction("DCM/isRunning/" + id);
		}

		/**
		 * <summary> Calibration of a joint </summary>
		 * 
		 * @param calibrationInput
		 *            Internal use only
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject calibration(final String calibrationinput) {
			return requestAction("DCM/calibration/" + "'" + calibrationinput
					+ "'");
		}

		/**
		 * <summary> Create or change an alias (list of actuators) </summary>
		 * 
		 * @param alias
		 *            Alias name and description <br />
		 *            <i>Actual SDK return value:</i> Same as pParams, but with
		 *            the name removed if the actuator is not found
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject createAlias(final String alias) {
			return requestAction("DCM/createAlias/" + "'" + alias + "'");
		}

		/**
		 * <summary> Exits and unregisters the module. </summary>
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject exit() {
			return requestAction("DCM/exit/()");
		}

		/**
		 * <summary> Gets the name of the parent broker. </summary> <br />
		 * <i>Actual SDK return value:</i> The name of the parent broker.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getBrokerName() {
			return requestAction("DCM/getBrokerName/()");
		}

		/**
		 * <summary> Retrieves a method's description. </summary>
		 * 
		 * @param methodName
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A structure containing the
		 *            method's description.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodHelp(final String methodname) {
			return requestAction("DCM/getMethodHelp/" + "'" + methodname + "'");
		}

		/**
		 * <summary> Retrieves the module's method list. </summary> <br />
		 * <i>Actual SDK return value:</i> An array of method names.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getMethodList() {
			return requestAction("DCM/getMethodList/()");
		}

		/**
		 * <summary> Retrieves the module's description. </summary> <br />
		 * <i>Actual SDK return value:</i> A structure describing the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getModuleHelp() {
			return requestAction("DCM/getModuleHelp/()");
		}

		/**
		 * <summary> Return the STM base name </summary> <br />
		 * <i>Actual SDK return value:</i> the STM base name for all
		 * device/sensors (1st string in the array) and all devices (2nd string
		 * in the array)
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getPrefix() {
			return requestAction("DCM/getPrefix/()");
		}

		/**
		 * <summary> Return the DCM time </summary>
		 * 
		 * @param offset
		 *            optional time in ms (signed) to add/remove <br />
		 *            <i>Actual SDK return value:</i> An integer (could be
		 *            signed) with the DCM time
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getTime(final int offset) {
			return requestAction("DCM/getTime/" + offset);
		}

		/**
		 * <summary> Gets the method usage string. This summarise how to use the
		 * method. </summary>
		 * 
		 * @param name
		 *            The name of the method. <br />
		 *            <i>Actual SDK return value:</i> A string that summarises
		 *            the usage of the method.
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject getUsage(final String name) {
			return requestAction("DCM/getUsage/" + "'" + name + "'");
		}

		/**
		 * <summary> Just a ping. Always returns true </summary> <br />
		 * <i>Actual SDK return value:</i> returns true
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject ping() {
			return requestAction("DCM/ping/()");
		}

		/**
		 * <summary> Save updated value from DCM in XML pref file </summary>
		 * 
		 * @param action
		 *            string : 'Save' 'Load' 'Add'
		 * @param target
		 *            string : 'Chest' 'Head' 'Main' 'All'
		 * @param keyName
		 *            The name of the key if action = 'Add'.
		 * @param keyValue
		 *            The ALVAlue of the key to add <br />
		 *            <i>Actual SDK return value:</i> Nothing
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject preferences(final String action, final String target,
				final String keyname, final String keyvalue) {
			return requestAction("DCM/preferences/" + "'" + action + "'" + "+'"
					+ target + "'" + "+'" + keyname + "'" + "+'" + keyvalue
					+ "'");
		}

		/**
		 * <summary> Call this function to send a timed-command list to an
		 * actuator </summary>
		 * 
		 * @param commands
		 *            AL::ALValue with all data
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject set(final String commands) {
			return requestAction("DCM/set/" + "'" + commands + "'");
		}

		/**
		 * <summary> Call this function to send timed-command list to an alias
		 * (list of actuators) </summary>
		 * 
		 * @param commands
		 *            AL::ALValue with all data
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject setAlias(final String commands) {
			return requestAction("DCM/setAlias/" + "'" + commands + "'");
		}

		/**
		 * <summary> Special DCM commands </summary>
		 * 
		 * @param result
		 *            one string and could be Reset, Version, Chain, Diagnostic,
		 *            Config
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject special(final String result) {
			return requestAction("DCM/special/" + "'" + result + "'");
		}

		/**
		 * <summary> Returns the version of the module. </summary> <br />
		 * <i>Actual SDK return value:</i> A string containing the version of
		 * the module.
		 * 
		 * @return JSONObject which contains the following values as strings:<br/ >
		 *         <ul>
		 *         <li>the actual return value (returnvalue)</li>
		 *         <li>exceptions (exception)</li>
		 *         <li>standard out (stdout)</li>
		 *         <li>standard err (err)</li>
		 *         </ul>
		 */
		public JSONObject version() {
			return requestAction("DCM/version/()");
		}
	}

	public DCM createDCM() {
		return new DCM();
	}

	/**
	 * Internal helper method to send a request to the Nao web service.
	 * 
	 * @param action
	 *            The request as a string. E.g.,
	 *            <code>ALTextToSpeech/say/'Hello.'</code>.
	 */
	protected JSONObject requestAction(String action) {
		try {
			action = action.replaceAll(" ", "%20");

			URL request = new URL("http://" + ip + ":" + port + "/proxy/run/"
					+ action);
			URLConnection response = request.openConnection();
			BufferedReader rd = new BufferedReader(new InputStreamReader(
					response.getInputStream()));

			StringBuilder sb = new StringBuilder();
			int cp;
			while ((cp = rd.read()) != -1) {
				sb.append((char) cp);
			}

			JSONObject result = new JSONObject(sb.toString());
			rd.close();
			return result;
		}

		catch (MalformedURLException e) {
			throw new IllegalStateException("Cannot connect to the Nao.", e);
		}

		catch (IOException e) {
			throw new IllegalStateException("Cannot connect to the Nao.", e);
		}

		catch (JSONException e) {
			throw new IllegalStateException(
					"Unable to create JSON object from request", e);
		}
	}
}