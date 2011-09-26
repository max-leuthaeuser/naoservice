import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
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

	public NaoCamModel() {
		try {
			requestUrl = new URL(NaoCam.STREAM_LOCATION);
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
		Thread worker = new Thread() {
			public void run() {
				while (!stopRequested) {
					// this could take a while
					final Image r = queryImage();
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

	/**
	 * Internal helper method to call the web service, retrieve the image and
	 * draw it.
	 */
	private Image queryImage() {
		try {
			final HttpURLConnection connection = (HttpURLConnection) requestUrl
					.openConnection();

			connection.setRequestMethod("GET");
			connection.connect();
			try {
				final InputStream is = connection.getInputStream();
				final Reader reader = new InputStreamReader(is);
				final char[] buf = new char[16384];
				int read;
				final StringBuffer sb = new StringBuffer();
				while ((read = reader.read(buf)) > 0) {
					sb.append(buf, 0, read);
				}
				byte[] i = Base64.decode(sb.toString());
				return ImageIO.read(new ByteArrayInputStream(i));
			} finally {
				connection.disconnect();
			}
		} catch (IOException e) {
		}
		return null;
	}

	/**
	 * Stop the requests to the web service and the image rendering.
	 */
	public void stopCam() {
		System.out.println("stopped!");
		stopRequested = true;
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
}
