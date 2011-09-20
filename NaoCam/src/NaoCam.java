import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 * This is a small example how to make use of the NaoService video streaming
 * module. It shows the current camera image with a simple Swing interface.
 * 
 * @author Max Leuthaeuser
 */
public class NaoCam {
	private static String SERVER_IP = "http://192.168.0.139:8070";
	//private static final String SERVER_IP = "http://localhost:8080";
	public static String STREAM_LOCATION = SERVER_IP + "/stream/image_latest/1";

	/**
	 * Setup and start the GUI inside the AWT event dispatching thread.
	 * 
	 * @param args
	 *            stream location, if not specified here the standard location
	 *            will be chosen.
	 * @see SERVER_IP
	 */
	public static void main(String[] args) {
		if (args.length > 0) {
			STREAM_LOCATION = args[0];
		}
		System.out.println("Stream location will be: " + STREAM_LOCATION);
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				setSystemLookAndFeel();
				NaoCamPresenter.INSTANCE.init();
			}
		});
	}

	/**
	 * Try to set the Swing look and feel that is the default for the system. In
	 * case of an error, a detailed report is printed to stderr.
	 */
	private static void setSystemLookAndFeel() {
		final String lafClass = UIManager.getSystemLookAndFeelClassName();

		try {
			UIManager.setLookAndFeel(lafClass);
		} catch (Exception e) {
			System.err.println("Could not set the look and feel to '"
					+ lafClass + "', reverting to the default one:");
			System.err.println(e.getMessage());
		}
	}
}
