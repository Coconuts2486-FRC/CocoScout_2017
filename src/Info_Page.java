import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Info_Page {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Info_Page window = new Info_Page();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Info_Page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setAlwaysOnTop(true);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Speed = How many fuel particals are added in one secound.");
		lblNewLabel.setBounds(6, 6, 438, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblAccuracy = new JLabel("Accuracy = How many fuel particals enter out of ten");
		lblAccuracy.setBounds(6, 34, 438, 16);
		frame.getContentPane().add(lblAccuracy);
		
		JLabel lblAmountHow = new JLabel("Amount = How many fuel particals are fired\n");
		lblAmountHow.setBounds(6, 62, 438, 16);
		frame.getContentPane().add(lblAmountHow);
		
		JLabel lblCollectionHow = new JLabel("Collection = How the fuel was collected (Ground / Hoppers)");
		lblCollectionHow.setBounds(6, 90, 438, 16);
		frame.getContentPane().add(lblCollectionHow);
		
		JLabel lblCollectionAccuracy = new JLabel("Collection Accuracy = How many fule particals were picked off the ground out of ten");
		lblCollectionAccuracy.setBounds(6, 118, 438, 16);
		frame.getContentPane().add(lblCollectionAccuracy);
	}

}
