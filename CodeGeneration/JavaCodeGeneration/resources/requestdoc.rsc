/**
 * Internal helper method to send a request to the Nao web service.
 * 
 * @param action
 *            The request as a string. E.g.,
 *            <code>ALTextToSpeech/say/'Hello.'</code>.
 * @return a JSONObject containing <code> returnvalue, exceptions,
 *            stdout and stderr.</code>
 */
