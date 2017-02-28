import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Page_Opener_Page {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page_Opener_Page window = new Page_Opener_Page();
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
	public Page_Opener_Page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 154, 103);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnEntryPage = new JButton("Entry Page");
		btnEntryPage.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
				Entry_Page enter = new Entry_Page();
				enter.main(null);
			}
		});
		btnEntryPage.setBounds(6, 6, 140, 29);
		frame.getContentPane().add(btnEntryPage);
		
		JButton btnNewButton = new JButton("Upload Data");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CSV csv = new CSV();
				csv.WriteToFile(Home_Page.modelViewStats);
			}
		});
		btnNewButton.setBounds(6, 47, 140, 29);
		frame.getContentPane().add(btnNewButton);
	}
}
