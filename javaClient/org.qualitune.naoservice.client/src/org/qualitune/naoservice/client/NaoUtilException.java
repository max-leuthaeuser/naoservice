package org.qualitune.naoservice.client;

/**
 * Exception thrown if a request issued to a nao service fails.
 * 
 * @author Claas Wilke
 */
public class NaoUtilException extends Exception {

	/** Generated ID for serialization. */
	private static final long serialVersionUID = -3467603498369009041L;

	/**
	 * Creates a new {@link NaoUtilException} with a given message.
	 * 
	 * @param msg
	 *            The message.
	 */
	public NaoUtilException(String msg) {
		super(msg);
	}

	/**
	 * Creates a new {@link NaoUtilException} with a given message and cause.
	 * 
	 * @param msg
	 *            The message.
	 * @param cause
	 *            The cause of this {@link NaoUtilException}.
	 */
	public NaoUtilException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
