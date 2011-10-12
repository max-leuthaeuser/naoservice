package org.qualitune.naoservice.client;

/**
 * Class which can be used to pass parameters to the {@link NaoUtil#say(Nao, String, SayParameter...)} method.
 * The type of each parameter is float.
 * Possible parameters are:
 * 
 * <li><b>pitchShift</b>:<br>
 * applies a pitch shifting to the voice. The value indicates the ratio between the new fundamental frequencies and the old ones (examples: 2.0: an octave above, 1.5: a quint above). Correct range is (1.0 -- 4), or 0 to disable effect
 * <li><b>doubleVoice</b>:<br>
 * adds a second voice to the first one. The value indicates the ratio between the second voice fundamental frequency and the first one. Correct range is (1.0 -- 4), or 0 to disable effect 
 * <li><b>doubleVoiceLevel</b>:<br>
 * the corresponding value is the level of the double voice (1.0: equal to the main voice one). Correct range is (0 -- 4). 
 * <li><b>doubleVoiceTimeShift</b>:<br>
 * the corresponding value is the delay between the double voice and the main one. Correct range is (0 -- 0.5)
If the effect value is not available, the effect parameter remains unchanged.
 * 
 * @author jreimann
 *
 */
public class SayParameter {

	private String parameterName;
	private float parameterValue;
	
	public SayParameter(String parameterName, float parameterValue) {
		super();
		this.parameterName = parameterName;
		this.parameterValue = parameterValue;
	}

	public String getParameterName() {
		return parameterName;
	}

	public float getParameterValue() {
		return parameterValue;
	}
	
	
}
