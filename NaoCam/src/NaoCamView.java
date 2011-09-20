import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 * The view of NaoCam. Builds and contains all GUI elements and forwards user
 * actions to the {@link NaoCamPresenter}.
 * 
 * @author Max Leuthaeuser
 */
public final class NaoCamView extends JFrame implements ActionListener,
		KeyListener {
	private static final long serialVersionUID = 1L;
	private JButton startButton, stopButton;
	private JPanel image;
	private JTextField intInput;
	private JLabel intervalText;
	private volatile Image buffer;

	public NaoCamView() {
		buildGui();
		attachListener();
	}

	private void buildGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();

		// layout
		JPanel top = new JPanel(new BorderLayout());
		buffer = new BufferedImage(320, 240, BufferedImage.TYPE_INT_RGB);
		image = new JPanel() {
			private static final long serialVersionUID = 1L;

			@Override
			public void paint(Graphics g) {
				g.drawImage(buffer, 0, 0, null);
				g.dispose();
			}
		};
		top.add(new JScrollPane(image), BorderLayout.CENTER);
		JPanel bottom = new JPanel(new BorderLayout(5, 5));
		c.setLayout(new BorderLayout());
		startButton = new JButton("Start");
		stopButton = new JButton("Stop");
		intInput = new JTextField("300");
		intInput.setToolTipText("Press ENTER to confirm.");
		intervalText = new JLabel("Interval (" + intInput.getText() + " ms)");

		JPanel s = new JPanel(new BorderLayout());
		s.add(intervalText, BorderLayout.NORTH);
		s.add(intInput, BorderLayout.CENTER);
		bottom.add(startButton, BorderLayout.WEST);
		bottom.add(stopButton, BorderLayout.EAST);
		bottom.add(s, BorderLayout.CENTER);

		c.add(top, BorderLayout.CENTER);
		c.add(bottom, BorderLayout.SOUTH);

		setSize(340, 315);
		setVisible(true);
	}

	public void drawImage(byte[] b) {
		try {
			buffer = ImageIO.read(new ByteArrayInputStream(b));
			image.repaint();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Shows the given message to the user.
	 * 
	 * @param m
	 *            The message to show.
	 */
	public static void showErrorMessage(String m) {
		JOptionPane.showMessageDialog(null, m);
	}

	private void attachListener() {
		startButton.addActionListener(this);
		stopButton.addActionListener(this);
		intInput.addKeyListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == startButton) {
			NaoCamPresenter.INSTANCE.startCam();
		} else {
			NaoCamPresenter.INSTANCE.stopCam();
		}
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
			try {
				int i = Integer.parseInt(intInput.getText());
				if (i < 100) {
					NaoCamView
							.showErrorMessage("Interval < 100ms is not allowed.");
					intInput.setText("100");
					NaoCamPresenter.INSTANCE.changeIntervall(100);
				}
				intervalText
						.setText("Interval (" + intInput.getText() + " ms)");
				NaoCamPresenter.INSTANCE.changeIntervall(i);
			} catch (NumberFormatException e) {
				NaoCamView.showErrorMessage("Enter a valid number!");
			}
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
}
