import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import javax.swing.SwingUtilities;

/**
 * The model of NaoCam. Handles the communication to the web service and
 * prepares the image rendering.
 * 
 * @author Max Leuthaeuser
 */
public class NaoCamModel {
	/**
	 * Represents the interval between two request to the web service.
	 */
	private volatile int interval = 300;

	private volatile boolean stopRequested = false;

	private URL requestUrl;
	private URLConnection response;
	private BufferedReader responseReader;

	public NaoCamModel() {
		try {
			requestUrl = new URL(NaoCam.STREAM_LOCATION + "/" + interval);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Start the requests to the web service and the image rendering.
	 */
	public void startCam() {
		System.out.println("starting...");
		stopRequested = false;
		openConnection();
		Thread worker = new Thread() {
			public void run() {
				while (!stopRequested) {
					// this could take a while
					final byte[] r = queryImage();
					if (r == null) {
						stopRequested = true;
						System.err
								.println("Connection lost. Will stop the transmission.");
						stopCam();
						break;
					}
					SwingUtilities.invokeLater(new Runnable() {
						@Override
						public void run() {
							NaoCamPresenter.INSTANCE.getView().drawImage(r);
						}
					});
					try {
						Thread.sleep(interval);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		worker.start();
	}

	private void openConnection() {
		try {
			response = requestUrl.openConnection();
			responseReader = new BufferedReader(new InputStreamReader(
					response.getInputStream()));
		} catch (IOException e) {
			NaoCamView
					.showErrorMessage("Can not read data from the web service.");
			stopRequested = true;
		}
	}

	private void closeConnection() {
		try {
			if (responseReader != null)
				responseReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Internal helper method to call the web service, retrieve the image and
	 * draw it.
	 */
	private byte[] queryImage() {
		StringBuilder sb = new StringBuilder();
		int cp;
		try {
			while (!stopRequested && (cp = responseReader.read()) != -1) {
				sb.append((char) cp);
			}
			if (!stopRequested)
				return base64ToImage(sb.toString());
		} catch (IOException e) {
			NaoCamView
					.showErrorMessage("IOException while reading an image from the web service.");
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Stop the requests to the web service and the image rendering.
	 */
	public void stopCam() {
		System.out.println("stopped!");
		stopRequested = true;
		closeConnection();
	}

	/**
	 * Change the interval between two request to the web service.
	 * 
	 * @param interval
	 *            in ms
	 */
	public void changeInterval(final int interval) {
		this.interval = interval;
		System.out.println("Interval changed: " + interval);
	}

	/**
	 * Internal helper method to convert a base64 encoded string back to an
	 * {@link Graphics2D} as image.
	 * 
	 * @param s
	 *            a base64 encoded String from an image
	 * @return a byte array decoded from the String s
	 */
	private byte[] base64ToImage(final String s) {
		return Base64.decodeFast(s);
	}
}
