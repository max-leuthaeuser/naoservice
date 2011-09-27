/**
 * Synonym for <tt>URLEncoder.encode(String, "UTF-8")</tt>.
 *
 * <p>Used to ensure that HTTP query strings are in proper form, by escaping
 * special characters such as spaces.</p>
 *
 * <p>It is important to note that if a query string appears in an <tt>HREF</tt>
 * attribute, then there are two issues - ensuring the query string is valid
 * HTTP (it is URL-encoded), and ensuring it is valid HTML (ensuring the 
 * ampersand is escaped).</p>
 */
