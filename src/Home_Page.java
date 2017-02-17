import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Home_Page {

	private JFrame frame;
	private JTable table;
	
	public static Model_View_Stats modelViewStats = new Model_View_Stats();

	/**
	 * Launch the application.
	 */
	public static void hm(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home_Page window = new Home_Page();
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
	public Home_Page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 770, 598);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 6, 758, 266);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnNewEntry = new JButton("New Entry");
		btnNewEntry.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
				Entry_Page ent=new Entry_Page();
				ent.main(null);
			}
		});
		btnNewEntry.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnNewEntry.setBounds(6, 284, 758, 50);
		frame.getContentPane().add(btnNewEntry);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnEdit.setBounds(6, 346, 758, 50);
		frame.getContentPane().add(btnEdit);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnUpload.setBounds(6, 408, 758, 50);
		frame.getContentPane().add(btnUpload);
		
		JButton btnDownload = new JButton("Download");
		btnDownload.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnDownload.setBounds(6, 470, 758, 50);
		frame.getContentPane().add(btnDownload);
	}
}
