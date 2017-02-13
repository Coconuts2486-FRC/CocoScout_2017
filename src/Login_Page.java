import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login_Page {

	private JFrame frame;
	private JPasswordField passwordField;
	private JLabel lblPassword;
	private JButton btnLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Page window = new Login_Page();
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
	public Login_Page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 770, 377);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCoconutsScouting = new JLabel("Coconuts Scouting");
		lblCoconutsScouting.setFont(new Font("Apple Chancery", Font.PLAIN, 25));
		lblCoconutsScouting.setHorizontalAlignment(SwingConstants.CENTER);
		lblCoconutsScouting.setBounds(6, 6, 758, 40);
		frame.getContentPane().add(lblCoconutsScouting);
		
		passwordField = new JPasswordField();
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setBounds(6, 243, 758, 40);
		frame.getContentPane().add(passwordField);
		
		lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Apple Chancery", Font.PLAIN, 20));
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(6, 191, 758, 40);
		frame.getContentPane().add(lblPassword);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
				double password=3.14159;
				@SuppressWarnings("deprecation")
				double enter= Double.parseDouble(passwordField.getText());
				if (password==enter){
				Home_Page hm= new Home_Page();
				hm.hm(null);
				frame.dispose();}
				else if(!(password==enter)){JOptionPane.showMessageDialog(frame, "Password is incorrect: Contact Logan M. for password");}
		}
		});
		btnLogin.setFont(new Font("Apple Chancery", Font.PLAIN, 30));
		btnLogin.setBounds(6, 295, 758, 56);
		frame.getContentPane().add(btnLogin);
	}
}
