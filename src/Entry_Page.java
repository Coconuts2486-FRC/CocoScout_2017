import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.Color;


public class Entry_Page {

private JFrame frame;

public static void ent(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
			
		public void run() {
		try {
		Entry_Page window = new Entry_Page();
		window.frame.setVisible(true);
		} catch (Exception e) {
		e.printStackTrace();
		}
		
		}
		});
		}



	public static String path;
	static JButton Gear_Placement_Add_Left;
	static JButton Gear_Placement_Subtract_Left;
	static JButton Low_Goal_Add_Left;
	static JButton Low_Goal_Subtract_Left;
	static JButton Gear_Pickup_Add_Left;
	static JButton Gear_Pickup_Subtract_Left;
	static JButton Low_Goal_Subtract_Right;
	static JButton Low_Goal_Add_Right;
	static JButton Gear_Placement_Add_Right;
	static JButton Gear_Placement_Subtract_Right;
	static JButton Gear_Pickup_Left_Right;
	static JButton Gear_Pickup_Add_Right;
	static JButton High_Goal_Add_Left;
	static JButton High_Goal_Subtract_Left;
	static JButton High_Goal_Subtract_Right;
	static JButton High_Goal_Add_Right;
	static JRadioButton Collect_Top_Right;
	static JRadioButton Collect_Top_Left;
	static JRadioButton Collect_Bottom_Right;
	static JRadioButton Collect_Bottom_Middle;
	static JRadioButton Collect_Bottom_Left;
	static JRadioButton rdbtnCollectedFromGround;
	static JRadioButton rdbtnCollectedFromHoppers;
	static JRadioButton Teleop;
	static JRadioButton Autonomous;
	static JTextField H_Speed;
	static JTextField L_Speed;
	static JTextField Gear_Input;
	static JTextField Gear_Placement;
	static JTextField Team;
	static JTextField Match;
	static JLabel lblSpeed;
	static JLabel lblAccuracy;
	static JTextField H_Accuracy;
	static JLabel lblC;
	static JLabel lblSpeed_1;
	static JLabel lblAccuracy_1;
	static JTextField L_Accuracy;
	static JLabel lblRotors;
	static JLabel lblMatchInfo;
	static JLabel lblCollection;
	static JLabel lblCollection_1;
	static JLabel lblAccuracy_2;
	static JLabel lblNotes_1;
	static JButton Upload;
	static JLabel lblHighGoal_1;
	static JLabel lblLowGoal_1;
	static JLabel lblHighGoal_2;
	static JLabel lblLowGoal_2;
	static JLabel lblGearPickup;
	static JLabel lblGearPickup_1;
	static JLabel lblGearPlacement;
	static JButton btnUpdate;
	private JTextField Acc;
	private JTextField Cc;
	private JTextField Nts;
	public Entry_Page() {initialize();}

	private void initialize() {
		
		
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.setAlwaysOnTop(true);
		frame.setBounds(100, 100, 770, 598);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		Gear_Placement_Add_Left = new JButton("+");
		Gear_Placement_Add_Left.setBounds(188, 184, 48, 29);
		frame.getContentPane().add(Gear_Placement_Add_Left);
		
		Gear_Placement_Subtract_Left = new JButton("-");
		Gear_Placement_Subtract_Left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Gear_Placement_Subtract_Left.setBounds(224, 184, 48, 29);
		frame.getContentPane().add(Gear_Placement_Subtract_Left);
		
		
		
		Low_Goal_Add_Left = new JButton("+");
		Low_Goal_Add_Left.setBounds(85, 271, 48, 29);
		frame.getContentPane().add(Low_Goal_Add_Left);
		
		Low_Goal_Subtract_Left = new JButton("-");
		Low_Goal_Subtract_Left.setBounds(124, 271, 48, 29);
		frame.getContentPane().add(Low_Goal_Subtract_Left);
		
		
		Gear_Pickup_Add_Left = new JButton("+");
		Gear_Pickup_Add_Left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		Gear_Pickup_Add_Left.setBounds(85, 75, 48, 29);
		frame.getContentPane().add(Gear_Pickup_Add_Left);
		
		Gear_Pickup_Subtract_Left = new JButton("-");
		Gear_Pickup_Subtract_Left.setBounds(124, 75, 48, 29);
		frame.getContentPane().add(Gear_Pickup_Subtract_Left);
		
		Low_Goal_Subtract_Right = new JButton("-");
		Low_Goal_Subtract_Right.setBounds(609, 271, 48, 29);
		frame.getContentPane().add(Low_Goal_Subtract_Right);
		
		Low_Goal_Add_Right = new JButton("+");
		Low_Goal_Add_Right.setBounds(570, 271, 48, 29);
		frame.getContentPane().add(Low_Goal_Add_Right);
		
		Gear_Placement_Add_Right = new JButton("+");
		Gear_Placement_Add_Right.setBounds(466, 184, 48, 29);
		frame.getContentPane().add(Gear_Placement_Add_Right);
		
		Gear_Placement_Subtract_Right = new JButton("-");
		Gear_Placement_Subtract_Right.setBounds(501, 184, 48, 29);
		frame.getContentPane().add(Gear_Placement_Subtract_Right);
		
		Gear_Pickup_Left_Right = new JButton("-");
		Gear_Pickup_Left_Right.setBounds(609, 75, 48, 29);
		frame.getContentPane().add(Gear_Pickup_Left_Right);
		
		Gear_Pickup_Add_Right = new JButton("+");
		Gear_Pickup_Add_Right.setBounds(570, 75, 48, 29);
		frame.getContentPane().add(Gear_Pickup_Add_Right);
		
		High_Goal_Add_Left = new JButton("+");
		High_Goal_Add_Left.setBounds(85, 246, 48, 29);
		frame.getContentPane().add(High_Goal_Add_Left);
		
		High_Goal_Subtract_Left = new JButton("-");
		High_Goal_Subtract_Left.setBounds(124, 246, 48, 29);
		frame.getContentPane().add(High_Goal_Subtract_Left);
		
		High_Goal_Subtract_Right = new JButton("-");
		High_Goal_Subtract_Right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		High_Goal_Subtract_Right.setBounds(609, 246, 48, 29);
		frame.getContentPane().add(High_Goal_Subtract_Right);
		
		High_Goal_Add_Right = new JButton("+");
		High_Goal_Add_Right.setBounds(570, 246, 48, 29);
		frame.getContentPane().add(High_Goal_Add_Right);
		
		JRadioButton Collect_Bottom_Left = new JRadioButton("Collected");
		Collect_Bottom_Left.setForeground(Color.RED);
		Collect_Bottom_Left.setBounds(169, 252, 91, 23);
		frame.getContentPane().add(Collect_Bottom_Left);
		
		JRadioButton Collect_Bottom_Middle = new JRadioButton("Collected");
		Collect_Bottom_Middle.setForeground(Color.RED);
		Collect_Bottom_Middle.setBounds(325, 252, 91, 23);
		frame.getContentPane().add(Collect_Bottom_Middle);
		
		JRadioButton Collect_Bottom_Right = new JRadioButton("Collected");
		Collect_Bottom_Right.setForeground(Color.RED);
		Collect_Bottom_Right.setBounds(489, 252, 91, 23);
		frame.getContentPane().add(Collect_Bottom_Right);
		
		JRadioButton Collect_Top_Left = new JRadioButton("Collected");
		Collect_Top_Left.setForeground(Color.RED);
		Collect_Top_Left.setBounds(238, 54, 141, 23);
		frame.getContentPane().add(Collect_Top_Left);
		
		
		Collect_Top_Right = new JRadioButton("Collected");
		Collect_Top_Right.setForeground(Color.RED);
		Collect_Top_Right.setBounds(424, 54, 141, 23);
		frame.getContentPane().add(Collect_Top_Right);
		
		
		Teleop = new JRadioButton("Teleop");
		Teleop.setBounds(6, 312, 74, 23);
		frame.getContentPane().add(Teleop);
		
		Autonomous = new JRadioButton("Autonomous");
		Autonomous.setBounds(85, 312, 141, 23);
		frame.getContentPane().add(Autonomous);
		
		JLabel lblHighGoal = new JLabel("High Goal:");
		lblHighGoal.setBounds(5, 347, 66, 16);
		frame.getContentPane().add(lblHighGoal);
		
		H_Speed = new JTextField();
		H_Speed.setBounds(120, 370, 130, 26);
		frame.getContentPane().add(H_Speed);
		H_Speed.setColumns(10);
		
		JLabel lblLowGoal = new JLabel("Low Goal:");
		lblLowGoal.setBounds(283, 347, 66, 16);
		frame.getContentPane().add(lblLowGoal);
		
		L_Speed = new JTextField();
		L_Speed.setBounds(356, 370, 130, 26);
		frame.getContentPane().add(L_Speed);
		L_Speed.setColumns(10);
		
		JLabel lblGearInput = new JLabel("Gear Input:");
		lblGearInput.setBounds(6, 478, 74, 16);
		frame.getContentPane().add(lblGearInput);
		
		Gear_Input = new JTextField();
		Gear_Input.setBounds(120, 478, 130, 26);
		frame.getContentPane().add(Gear_Input);
		Gear_Input.setColumns(10);
		
		JLabel lblGearPla = new JLabel("Gear Placement:");
		lblGearPla.setBounds(6, 506, 100, 16);
		frame.getContentPane().add(lblGearPla);
		
		Gear_Placement = new JTextField();
		Gear_Placement.setBounds(120, 506, 130, 26);
		frame.getContentPane().add(Gear_Placement);
		Gear_Placement.setColumns(10);
		
		JRadioButton rdbtnCollectedFromHoppers = new JRadioButton("Collected From Hoppers");
		rdbtnCollectedFromHoppers.setBounds(277, 506, 184, 23);
		frame.getContentPane().add(rdbtnCollectedFromHoppers);
		
		JRadioButton rdbtnCollectedFromGround = new JRadioButton("Collected From Ground");
		rdbtnCollectedFromGround.setBounds(277, 478, 177, 23);
		frame.getContentPane().add(rdbtnCollectedFromGround);
		
		JLabel lblTeam = new JLabel("Team #:");
		lblTeam.setBounds(511, 370, 56, 16);
		frame.getContentPane().add(lblTeam);
		
		Team = new JTextField();
		Team.setBounds(634, 370, 130, 26);
		frame.getContentPane().add(Team);
		Team.setColumns(10);
		
		JLabel lblRound = new JLabel("Round #:");
		lblRound.setBounds(511, 396, 61, 16);
		frame.getContentPane().add(lblRound);
		
		Match = new JTextField();
		Match.setBounds(634, 396, 130, 26);
		frame.getContentPane().add(Match);
		Match.setColumns(10);
		
		JLabel lblNotes = new JLabel("Notes:");
		lblNotes.setBounds(6, 529, 48, -17);
		frame.getContentPane().add(lblNotes);
		
		lblSpeed = new JLabel("Speed:");
		lblSpeed.setBounds(6, 370, 61, 16);
		frame.getContentPane().add(lblSpeed);
		
		lblAccuracy = new JLabel("Accuracy:");
		lblAccuracy.setBounds(6, 396, 66, 16);
		frame.getContentPane().add(lblAccuracy);
		
		H_Accuracy = new JTextField();
		H_Accuracy.setBounds(120, 396, 130, 26);
		frame.getContentPane().add(H_Accuracy);
		H_Accuracy.setColumns(10);
		
		lblC = new JLabel("Carrying Capacity:");
		lblC.setBounds(511, 506, 115, 16);
		frame.getContentPane().add(lblC);
		
		lblSpeed_1 = new JLabel("Speed:");
		lblSpeed_1.setBounds(283, 370, 48, 16);
		frame.getContentPane().add(lblSpeed_1);
		
		lblAccuracy_1 = new JLabel("Accuracy:");
		lblAccuracy_1.setBounds(283, 396, 61, 16);
		frame.getContentPane().add(lblAccuracy_1);
		
		L_Accuracy = new JTextField();
		L_Accuracy.setBounds(356, 396, 130, 26);
		frame.getContentPane().add(L_Accuracy);
		L_Accuracy.setColumns(10);
		
		lblRotors = new JLabel("Rotors:");
		lblRotors.setBounds(6, 450, 61, 16);
		frame.getContentPane().add(lblRotors);
		
		lblMatchInfo = new JLabel("Match Info:");
		lblMatchInfo.setBounds(511, 347, 74, 16);
		frame.getContentPane().add(lblMatchInfo);
		
		lblCollection = new JLabel("Collection:");
		lblCollection.setBounds(283, 450, 74, 16);
		frame.getContentPane().add(lblCollection);
		
		lblCollection_1 = new JLabel("Collection:");
		lblCollection_1.setBounds(511, 450, 74, 16);
		frame.getContentPane().add(lblCollection_1);
		
		lblAccuracy_2 = new JLabel("Accuracy:");
		lblAccuracy_2.setBounds(511, 478, 61, 16);
		frame.getContentPane().add(lblAccuracy_2);
		
		lblNotes_1 = new JLabel("Notes:");
		lblNotes_1.setBounds(6, 549, 61, 16);
		frame.getContentPane().add(lblNotes_1);
		
		Upload = new JButton("Upload");
		Upload.setBounds(647, 311, 117, 29);
		frame.getContentPane().add(Upload);
		
		lblHighGoal_1 = new JLabel("High Goal:");
		lblHighGoal_1.setForeground(Color.YELLOW);
		lblHighGoal_1.setBounds(23, 251, 66, 16);
		frame.getContentPane().add(lblHighGoal_1);
		
		lblLowGoal_1 = new JLabel("Low Goal:");
		lblLowGoal_1.setForeground(Color.YELLOW);
		lblLowGoal_1.setBounds(29, 276, 61, 16);
		frame.getContentPane().add(lblLowGoal_1);
		
		lblHighGoal_2 = new JLabel("High Goal:");
		lblHighGoal_2.setForeground(Color.YELLOW);
		lblHighGoal_2.setBounds(653, 251, 74, 16);
		frame.getContentPane().add(lblHighGoal_2);
		
		lblLowGoal_2 = new JLabel("Low Goal:");
		lblLowGoal_2.setForeground(Color.YELLOW);
		lblLowGoal_2.setBounds(653, 276, 61, 16);
		frame.getContentPane().add(lblLowGoal_2);
		
		lblGearPickup = new JLabel("Gear Pickup:");
		lblGearPickup.setForeground(Color.YELLOW);
		lblGearPickup.setBounds(653, 80, 81, 16);
		frame.getContentPane().add(lblGearPickup);
		
		lblGearPickup_1 = new JLabel("Gear Pickup:");
		lblGearPickup_1.setForeground(Color.YELLOW);
		lblGearPickup_1.setBounds(8, 80, 83, 16);
		frame.getContentPane().add(lblGearPickup_1);
		
		lblGearPlacement = new JLabel("Gear Placement:");
		lblGearPlacement.setForeground(Color.YELLOW);
		lblGearPlacement.setBounds(320, 189, 100, 16);
		frame.getContentPane().add(lblGearPlacement);
		
		
		JLabel label = new JLabel("-----");
		label.setForeground(Color.YELLOW);
		label.setBounds(277, 189, 61, 16);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("-----");
		label_1.setForeground(Color.YELLOW);
		label_1.setBounds(424, 189, 61, 16);
		frame.getContentPane().add(label_1);
		
		JLabel icon = new JLabel("");
		icon.setBounds(6, 6, 728, 308);
		path="./Resources/Map.jpg";
		ImageIcon myimage = new ImageIcon (path);
		Image img = myimage.getImage();
		Image newImg = img.getScaledInstance(icon.getWidth(), icon.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(newImg);
		icon.setIcon(image);
		frame.getContentPane().add(icon);
		
		JButton Info = new JButton("Info");
		Info.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("it worked!!!!!!!!!!");
			}
		});
		Info.setBounds(537, 311, 117, 29);
		frame.getContentPane().add(Info);
		
		btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Data data = new Data();
				
				Thread data123 = new Thread(){
				public void run(){
					
					while(true){
					try{
					//input ---------------------------------------------------------------
					data.H_Speed = Double.parseDouble(H_Speed.getText());
					data.H_Accuracy = Double.parseDouble(H_Accuracy.getText());

					data.L_Speed = Double.parseDouble(L_Speed.getText());
					data.L_Accuracy = Double.parseDouble(L_Accuracy.getText());
					
					data.Team_Number = Integer.parseInt(Team.getText());
					data.Match_Number = Integer.parseInt(Match.getText());
					
					data.G_Input = Integer.parseInt(Gear_Input.getText());
					data.G_Placement = Integer.parseInt(Gear_Placement.getText());
					
					data.C_Accuracy = Double.parseDouble(Acc.getText());
					data.C_Carry = Double.parseDouble(Cc.getText());
					
					data.Hopper1 = Collect_Top_Left.isSelected();
					data.Hopper2 = Collect_Top_Right.isSelected();
					data.Hopper3 = Collect_Bottom_Left.isSelected();
					data.Hopper4 = Collect_Bottom_Middle.isSelected();
					data.Hopper5 = Collect_Bottom_Right.isSelected();
					
					data.C_Ground  = rdbtnCollectedFromGround.isSelected();
					data.C_Hoppers = rdbtnCollectedFromHoppers.isSelected();
					
					data.Note = Nts.getText();
					
					System.out.println(1);
					try {Thread.sleep(1000);} 
					catch (InterruptedException e1) {System.out.println(e1.getMessage());}
					}catch(Exception e){System.out.println(e);}
					//Output -------------------------------------------------
				
					H_Speed.setText(Double.toString(data.H_Speed));
					H_Accuracy.setText(Double.toString(data.H_Accuracy));
					
					L_Speed.setText(Double.toString(data.L_Speed));
					L_Accuracy.setText(Double.toString(data.L_Accuracy));
					
					Team.setText(Integer.toString(data.Team_Number));
					Match.setText(Integer.toString(data.Match_Number));
					
					Gear_Input.setText(Integer.toString(data.G_Input));
					Gear_Placement.setText(Integer.toString(data.G_Placement));
					
					Acc.setText(Double.toString(data.C_Accuracy));
					Cc.setText(Double.toString(data.C_Carry));
					
					Collect_Top_Right.setSelected(data.Hopper1);
					Collect_Top_Left.setSelected(data.Hopper2);
					Collect_Bottom_Left.setSelected(data.Hopper3);
					Collect_Bottom_Middle.setSelected(data.Hopper4);
					Collect_Bottom_Right.setSelected(data.Hopper5);
					
					rdbtnCollectedFromGround.setSelected(data.C_Ground);
					rdbtnCollectedFromHoppers.setSelected(data.C_Hoppers);
					
					Nts.setText(data.Note);
					
					
					System.out.println(9);
					try {Thread.sleep(1000);} 
					catch (InterruptedException e1) {System.out.println(e1.getMessage());}
					System.out.println(8);
					try {Thread.sleep(1000);} 
					catch (InterruptedException e1) {System.out.println(e1.getMessage());}
					System.out.println(7);
					try {Thread.sleep(1000);} 
					catch (InterruptedException e1) {System.out.println(e1.getMessage());}
					System.out.println(6);
					try {Thread.sleep(1000);} 
					catch (InterruptedException e1) {System.out.println(e1.getMessage());}
					System.out.println(5);
					try {Thread.sleep(1000);} 
					catch (InterruptedException e1) {System.out.println(e1.getMessage());}
					System.out.println(4);
					try {Thread.sleep(1000);} 
					catch (InterruptedException e1) {System.out.println(e1.getMessage());}
					System.out.println(3);
					try {Thread.sleep(1000);} 
					catch (InterruptedException e1) {System.out.println(e1.getMessage());}
					System.out.println(2);
					try {Thread.sleep(1000);} 
					catch (InterruptedException e1) {System.out.println(e1.getMessage());}
					
					System.out.println("Yep Yep!!!");
					
					
					}
					
					

				
				
					}};
				
			data123.start();

			
			}
		});
		btnUpdate.setBounds(427, 311, 117, 29);
		frame.getContentPane().add(btnUpdate);
		
		Acc = new JTextField();
		Acc.setBounds(634, 473, 130, 26);
		frame.getContentPane().add(Acc);
		Acc.setColumns(10);
		
		Cc = new JTextField();
		Cc.setBounds(634, 501, 130, 26);
		frame.getContentPane().add(Cc);
		Cc.setColumns(10);
		
		Nts = new JTextField();
		Nts.setBounds(124, 544, 640, 26);
		frame.getContentPane().add(Nts);
		Nts.setColumns(10);
		
		
	}	
}
