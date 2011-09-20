/**
 * Acts as the layer between view and model. Implemented using the Enum
 * singleton pattern.
 * 
 * @author Max Leuthaeuser
 */
public enum NaoCamPresenter {
	INSTANCE;

	private NaoCamView view;
	private NaoCamModel model;

	private State state;

	/**
	 * Triggers the GUI building process, the model instantiation and sets the
	 * initial state.
	 */
	public void init() {
		view = new NaoCamView();
		model = new NaoCamModel();
		state = new Stopped();
	}

	public NaoCamView getView() {
		return view;
	}

	public NaoCamModel getModel() {
		return model;
	}

	/**
	 * Start the requests to the web service and the image rendering.
	 */
	public void startCam() {
		state.startCam();
	}

	/**
	 * Stop the requests to the web service and the image rendering.
	 */
	public void stopCam() {
		state.stopCam();
	}

	/**
	 * Change the intervall between two request to the web service.
	 * 
	 * @param intervall
	 *            in ms
	 */
	public void changeIntervall(final int intervall) {
		state.changeInterval(intervall);
	}

	/**
	 * Inner class which represents the current state of the
	 * {@link NaoCamPresenter} and forwards requests to the {@link NaoCamModel}.
	 */
	private abstract class State {
		/**
		 * Start the requests to the web service and the image rendering.
		 */
		public void startCam() {
		}

		/**
		 * Stop the requests to the web service and the image rendering.
		 */
		public void stopCam() {
		}

		/**
		 * Change the interval between two request to the web service.
		 * 
		 * @param interval
		 *            in ms
		 */
		public void changeInterval(final int interval) {
			model.changeInterval(interval);
		}
	}

	private class Stopped extends State {
		public void startCam() {
			model.startCam();
			state = new Running();
		}
	}

	private class Running extends State {
		public void stopCam() {
			model.stopCam();
			state = new Stopped();
		}
	}
}
