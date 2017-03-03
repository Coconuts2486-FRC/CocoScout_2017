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
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class Entry_Page {

private JFrame frame;

public static void main(String[] args) {
	
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
	static JLabel lblHighGoal_1;
	static JLabel lblLowGoal_1;
	static JLabel lblHighGoal_2;
	static JLabel lblLowGoal_2;
	static JLabel lblGearPickup;
	static JLabel lblGearPickup_1;
	static JLabel lblGearPlacement;
	static JButton btnUpdate;
	static JTextField Acc;
	static JTextField Cc;
	static JTextField Nts;
	static JTextField H_Amount;
	static JTextField L_Amount;
	static JTextField Timer_Secound;
	static JRadioButton rdbtnClimbedRope;
	static JRadioButton rdbtnLeftGear;
	static JRadioButton rdbtnMiddleGear;
	static JRadioButton rdbtnRightGear;
	private JTextField Timer_Minute;
	public Entry_Page() {initialize();}
	Data data;
	Auto_Data autodata;
	//String aaauto = "Auto";
	//String ttteleop = "Teleop";
	boolean mode;
	private JButton btnMode;
	private JTextField Mode;
	private JRadioButton rdbtnCrossedLine;
	private void initialize() {
		data = new Data();
		autodata = new Auto_Data();
		
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.setAlwaysOnTop(true);
		frame.setBounds(100, 100, 770, 639);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		Gear_Placement_Add_Left = new JButton("+");
		Gear_Placement_Add_Left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Gear_Placement.setText(Integer.toString(Integer.parseInt(Gear_Placement.getText())+1));
				
				}
		});
		Gear_Placement_Add_Left.setBounds(188, 184, 48, 29);
		frame.getContentPane().add(Gear_Placement_Add_Left);
		
		Gear_Placement_Subtract_Left = new JButton("-");
		Gear_Placement_Subtract_Left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Gear_Placement.setText(Integer.toString(Integer.parseInt(Gear_Placement.getText())-1));
				
				}
		});
		Gear_Placement_Subtract_Left.setBounds(224, 184, 48, 29);
		frame.getContentPane().add(Gear_Placement_Subtract_Left);
		
		
		
		Low_Goal_Add_Left = new JButton("+");
		Low_Goal_Add_Left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				L_Amount.setText(Integer.toString(Integer.parseInt(L_Amount.getText())+1));
				//Serelization.main();
				
		}});
		
		Low_Goal_Add_Left.setBounds(85, 271, 48, 29);
		frame.getContentPane().add(Low_Goal_Add_Left);
		
		Low_Goal_Subtract_Left = new JButton("-");
		Low_Goal_Subtract_Left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				L_Amount.setText(Integer.toString(Integer.parseInt(L_Amount.getText())-1));
				//Deserelization.main();
			}
		});
		Low_Goal_Subtract_Left.setBounds(124, 271, 48, 29);
		frame.getContentPane().add(Low_Goal_Subtract_Left);
		
		
		Gear_Pickup_Add_Left = new JButton("+");
		Gear_Pickup_Add_Left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			Gear_Input.setText(Integer.toString(Integer.parseInt(Gear_Input.getText())+1));
			
			
			}});
		Gear_Pickup_Add_Left.setBounds(85, 75, 48, 29);
		frame.getContentPane().add(Gear_Pickup_Add_Left);
		
		Gear_Pickup_Subtract_Left = new JButton("-");
		Gear_Pickup_Subtract_Left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Gear_Input.setText(Integer.toString(Integer.parseInt(Gear_Input.getText())-1));
				
				}
		});
		Gear_Pickup_Subtract_Left.setBounds(124, 75, 48, 29);
		frame.getContentPane().add(Gear_Pickup_Subtract_Left);
		
		Low_Goal_Subtract_Right = new JButton("-");
		Low_Goal_Subtract_Right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				L_Amount.setText(Integer.toString(Integer.parseInt(L_Amount.getText())-1));
				
				}
		});
		Low_Goal_Subtract_Right.setBounds(609, 271, 48, 29);
		frame.getContentPane().add(Low_Goal_Subtract_Right);
		
		Low_Goal_Add_Right = new JButton("+");
		Low_Goal_Add_Right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				L_Amount.setText(Integer.toString(Integer.parseInt(L_Amount.getText())+1));
				
				}
		});
		Low_Goal_Add_Right.setBounds(570, 271, 48, 29);
		frame.getContentPane().add(Low_Goal_Add_Right);
		
		Gear_Placement_Add_Right = new JButton("+");
		Gear_Placement_Add_Right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Gear_Placement.setText(Integer.toString(Integer.parseInt(Gear_Placement.getText())+1));
				
				}
		});
		Gear_Placement_Add_Right.setBounds(466, 184, 48, 29);
		frame.getContentPane().add(Gear_Placement_Add_Right);
		
		Gear_Placement_Subtract_Right = new JButton("-");
		Gear_Placement_Subtract_Right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Gear_Placement.setText(Integer.toString(Integer.parseInt(Gear_Placement.getText())-1));
				
				}
		});
		Gear_Placement_Subtract_Right.setBounds(501, 184, 48, 29);
		frame.getContentPane().add(Gear_Placement_Subtract_Right);
		
		Gear_Pickup_Left_Right = new JButton("-");
		Gear_Pickup_Left_Right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Gear_Input.setText(Integer.toString(Integer.parseInt(Gear_Input.getText())-1));
				
				}
		});
		Gear_Pickup_Left_Right.setBounds(609, 75, 48, 29);
		frame.getContentPane().add(Gear_Pickup_Left_Right);
		
		Gear_Pickup_Add_Right = new JButton("+");
		Gear_Pickup_Add_Right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Gear_Input.setText(Integer.toString(Integer.parseInt(Gear_Input.getText())+1));
				
				}
		});
		Gear_Pickup_Add_Right.setBounds(570, 75, 48, 29);
		frame.getContentPane().add(Gear_Pickup_Add_Right);
		
		High_Goal_Add_Left = new JButton("+");
		High_Goal_Add_Left.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		H_Amount.setText(Integer.toString(Integer.parseInt(H_Amount.getText())+1));
				
				}
		});
		High_Goal_Add_Left.setBounds(85, 246, 48, 29);
		frame.getContentPane().add(High_Goal_Add_Left);
		
		High_Goal_Subtract_Left = new JButton("-");
		High_Goal_Subtract_Left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				H_Amount.setText(Integer.toString(Integer.parseInt(H_Amount.getText())-1));
				
				}
		});
		High_Goal_Subtract_Left.setBounds(124, 246, 48, 29);
		frame.getContentPane().add(High_Goal_Subtract_Left);
		
		High_Goal_Subtract_Right = new JButton("-");
		High_Goal_Subtract_Right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				H_Amount.setText(Integer.toString(Integer.parseInt(H_Amount.getText())-1));
				
				}
		});
		High_Goal_Subtract_Right.setBounds(609, 246, 48, 29);
		frame.getContentPane().add(High_Goal_Subtract_Right);
		
		High_Goal_Add_Right = new JButton("+");
		High_Goal_Add_Right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				H_Amount.setText(Integer.toString(Integer.parseInt(H_Amount.getText())+1));
				
				}
		});
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
		lblGearInput.setBounds(6, 528, 74, 16);
		frame.getContentPane().add(lblGearInput);
		
		Gear_Input = new JTextField();
		Gear_Input.setBounds(120, 528, 130, 26);
		frame.getContentPane().add(Gear_Input);
		Gear_Input.setColumns(10);
		
		JLabel lblGearPla = new JLabel("Gear Placement:");
		lblGearPla.setBounds(6, 556, 100, 16);
		frame.getContentPane().add(lblGearPla);
		
		Gear_Placement = new JTextField();
		Gear_Placement.setBounds(120, 556, 130, 26);
		frame.getContentPane().add(Gear_Placement);
		Gear_Placement.setColumns(10);
		
		JRadioButton rdbtnCollectedFromHoppers = new JRadioButton("Collected From Hoppers");
		rdbtnCollectedFromHoppers.setBounds(277, 556, 184, 23);
		frame.getContentPane().add(rdbtnCollectedFromHoppers);
		
		JRadioButton rdbtnCollectedFromGround = new JRadioButton("Collected From Ground");
		rdbtnCollectedFromGround.setBounds(277, 528, 177, 23);
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
		lblAccuracy.setBounds(6, 395, 66, 16);
		frame.getContentPane().add(lblAccuracy);
		
		H_Accuracy = new JTextField();
		H_Accuracy.setBounds(120, 395, 130, 26);
		frame.getContentPane().add(H_Accuracy);
		H_Accuracy.setColumns(10);
		
		lblC = new JLabel("Carrying Capacity:");
		lblC.setBounds(511, 556, 115, 16);
		frame.getContentPane().add(lblC);
		
		lblSpeed_1 = new JLabel("Speed:");
		lblSpeed_1.setBounds(283, 370, 48, 16);
		frame.getContentPane().add(lblSpeed_1);
		
		lblAccuracy_1 = new JLabel("Accuracy:");
		lblAccuracy_1.setBounds(283, 396, 61, 16);
		frame.getContentPane().add(lblAccuracy_1);
		
		L_Accuracy = new JTextField();
		L_Accuracy.setBounds(356, 395, 130, 26);
		frame.getContentPane().add(L_Accuracy);
		L_Accuracy.setColumns(10);
		
		lblRotors = new JLabel("Rotors:");
		lblRotors.setBounds(6, 500, 61, 16);
		frame.getContentPane().add(lblRotors);
		
		lblMatchInfo = new JLabel("Match Info:");
		lblMatchInfo.setBounds(511, 347, 74, 16);
		frame.getContentPane().add(lblMatchInfo);
		
		lblCollection = new JLabel("Collection:");
		lblCollection.setBounds(283, 500, 74, 16);
		frame.getContentPane().add(lblCollection);
		
		lblCollection_1 = new JLabel("Collection:");
		lblCollection_1.setBounds(511, 500, 74, 16);
		frame.getContentPane().add(lblCollection_1);
		
		lblAccuracy_2 = new JLabel("Accuracy:");
		lblAccuracy_2.setBounds(511, 528, 61, 16);
		frame.getContentPane().add(lblAccuracy_2);
		
		lblNotes_1 = new JLabel("Notes:");
		lblNotes_1.setBounds(6, 587, 61, 16);
		frame.getContentPane().add(lblNotes_1);
		
		Thread time = new Thread(){
			public void run(){
			mode = true;
			Timer_Minute.setText(Integer.toString(0));
			int count=15;
			while (!(count==-1)){
			//Timer_Time.setText(Integer.toString(15));
			try {Thread.sleep(1000);} 
			catch (InterruptedException e) {e.printStackTrace();}
			Timer_Secound.setText(Integer.toString(count));
			count --;}
			//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
			
			//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
			Timer_Minute.setText(Integer.toString(2));
			int count2 = 15;
			while (!(count2==-1)){
				try {Thread.sleep(1000);} 
				catch (InterruptedException e) {e.printStackTrace();}
				Timer_Secound.setText(Integer.toString(count2));
				count2 --;}
			Timer_Minute.setText(Integer.toString(1));
			int count3 = 60;
			while (!(count3==-1)){
				try {Thread.sleep(1000);} 
				catch (InterruptedException e) {e.printStackTrace();}
				Timer_Secound.setText(Integer.toString(count3));
				count3 --;}
			Timer_Minute.setText(Integer.toString(0));
			int count4 = 60;
			while (!(count4==-1)){
				try {Thread.sleep(1000);} 
				catch (InterruptedException e) {e.printStackTrace();}
				Timer_Secound.setText(Integer.toString(count4));
				count4 --;}}};
		
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
		Info_Page ip = new Info_Page();
		ip.main(null);
			}
		});
		Info.setBounds(537, 311, 117, 29);
		frame.getContentPane().add(Info);
		
		
				
				//Mode >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
				
				
			
		
		btnUpdate = new JButton("Start Match");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			mode = true;
			Mode.setText("Auto");
			try{
					
					//input ---------------------------------------------------------------
					autodata.H_Speed = Double.parseDouble(H_Speed.getText());
					autodata.H_Accuracy = Double.parseDouble(H_Accuracy.getText());

					autodata.L_Speed = Double.parseDouble(L_Speed.getText());
					autodata.L_Accuracy = Double.parseDouble(L_Accuracy.getText());
					
					autodata.Team_Number = Integer.parseInt(Team.getText());
					autodata.Match_Number = Integer.parseInt(Match.getText());
					
					autodata.G_Input = Integer.parseInt(Gear_Input.getText());
					autodata.G_Placement = Integer.parseInt(Gear_Placement.getText());
					
					autodata.H_Amount = Integer.parseInt(H_Amount.getText());
					autodata.L_Amount = Integer.parseInt(L_Amount.getText());
					
					autodata.C_Accuracy = Double.parseDouble(Acc.getText());
					autodata.C_Carry = Double.parseDouble(Cc.getText());
					
					autodata.Hopper1 = Collect_Top_Left.isSelected();
					autodata.Hopper2 = Collect_Top_Right.isSelected();
					autodata.Hopper3 = Collect_Bottom_Left.isSelected();
					autodata.Hopper4 = Collect_Bottom_Middle.isSelected();
					autodata.Hopper5 = Collect_Bottom_Right.isSelected();
					
					autodata.C_Ground  = rdbtnCollectedFromGround.isSelected();
					autodata.C_Hoppers = rdbtnCollectedFromHoppers.isSelected();
					
					autodata.G_Left = rdbtnLeftGear.isSelected();
					autodata.G_Right = rdbtnRightGear.isSelected();
					autodata.G_Middle = rdbtnMiddleGear.isSelected();
					
					data.Rope = rdbtnClimbedRope.isSelected();
					
					autodata.Note = Nts.getText();
					
					}catch(Exception e1){System.out.println(e);}
					
					//Output -------------------------------------------------

					H_Speed.setText(Double.toString(autodata.H_Speed));
					H_Accuracy.setText(Double.toString(autodata.H_Accuracy));
					
					L_Speed.setText(Double.toString(autodata.L_Speed));
					L_Accuracy.setText(Double.toString(autodata.L_Accuracy));
					
					Team.setText(Integer.toString(autodata.Team_Number));
					Match.setText(Integer.toString(autodata.Match_Number));
					
					Gear_Input.setText(Integer.toString(autodata.G_Input));
					Gear_Placement.setText(Integer.toString(autodata.G_Placement));
					
					Acc.setText(Double.toString(autodata.C_Accuracy));
					Cc.setText(Double.toString(autodata.C_Carry));
					
					H_Amount.setText(Integer.toString(autodata.H_Amount));
					L_Amount.setText(Integer.toString(autodata.L_Amount));
					
					Collect_Top_Right.setSelected(autodata.Hopper1);
					Collect_Top_Left.setSelected(autodata.Hopper2);
					Collect_Bottom_Left.setSelected(autodata.Hopper3);
					Collect_Bottom_Middle.setSelected(autodata.Hopper4);
					Collect_Bottom_Right.setSelected(autodata.Hopper5);
					
					rdbtnCollectedFromGround.setSelected(autodata.C_Ground);
					rdbtnCollectedFromHoppers.setSelected(autodata.C_Hoppers);
					
					rdbtnLeftGear.setSelected(autodata.G_Left);
					rdbtnRightGear.setSelected(autodata.G_Right);
					rdbtnMiddleGear.setSelected(autodata.G_Middle);
					rdbtnClimbedRope.setSelected(data.Rope);
					
					Nts.setText(autodata.Note);
					
					time.start();
						
					}});
		btnUpdate.setBounds(427, 311, 117, 29);
		frame.getContentPane().add(btnUpdate);
		
		
		Acc = new JTextField();
		Acc.setBounds(634, 528, 130, 26);
		frame.getContentPane().add(Acc);
		Acc.setColumns(10);
		
		Cc = new JTextField();
		Cc.setBounds(634, 556, 130, 26);
		frame.getContentPane().add(Cc);
		Cc.setColumns(10);
		
		Nts = new JTextField();
		Nts.setBounds(120, 587, 645, 26);
		frame.getContentPane().add(Nts);
		Nts.setColumns(10);
		
		JLabel lblAmount = new JLabel("Amount:");
		lblAmount.setBounds(6, 424, 61, 16);
		frame.getContentPane().add(lblAmount);
		
		H_Amount = new JTextField();
		H_Amount.setBounds(120, 419, 130, 26);
		frame.getContentPane().add(H_Amount);
		H_Amount.setColumns(10);
		
		JLabel lblAmount_1 = new JLabel("Amount:");
		lblAmount_1.setBounds(283, 424, 61, 16);
		frame.getContentPane().add(lblAmount_1);
		
		L_Amount = new JTextField();
		L_Amount.setBounds(356, 419, 130, 26);
		frame.getContentPane().add(L_Amount);
		L_Amount.setColumns(10);
		
		Timer_Secound = new JTextField();
		Timer_Secound.setForeground(Color.BLACK);
		Timer_Secound.setEditable(false);
		Timer_Secound.setBackground(UIManager.getColor("Button.background"));
		Timer_Secound.setHorizontalAlignment(SwingConstants.CENTER);
		Timer_Secound.setFont(new Font("Apple Chancery", Font.PLAIN, 25));
		Timer_Secound.setBounds(62, 445, 50, 50);
		frame.getContentPane().add(Timer_Secound);
		Timer_Secound.setColumns(10);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
		@SuppressWarnings("deprecation")
		public void actionPerformed(ActionEvent e) {
				time.stop();
				frame.dispose();
			}
		});
		btnClose.setBounds(317, 311, 117, 29);
		frame.getContentPane().add(btnClose);
		
		rdbtnClimbedRope = new JRadioButton("Climbed Rope");
		rdbtnClimbedRope.setBounds(275, 450, 141, 23);
		frame.getContentPane().add(rdbtnClimbedRope);
		
		rdbtnLeftGear = new JRadioButton("Left Gear");
		rdbtnLeftGear.setBounds(124, 455, 141, 23);
		frame.getContentPane().add(rdbtnLeftGear);
		
		rdbtnMiddleGear = new JRadioButton("Middle Gear");
		rdbtnMiddleGear.setBounds(124, 475, 141, 23);
		frame.getContentPane().add(rdbtnMiddleGear);
		
		rdbtnRightGear = new JRadioButton("Right Gear");
		rdbtnRightGear.setBounds(124, 495, 141, 23);
		frame.getContentPane().add(rdbtnRightGear);
		
		Timer_Minute = new JTextField();
		Timer_Minute.setFont(new Font("Apple Chancery", Font.PLAIN, 25));
		Timer_Minute.setHorizontalAlignment(SwingConstants.CENTER);
		Timer_Minute.setBackground(UIManager.getColor("Button.background"));
		Timer_Minute.setBounds(6, 445, 50, 50);
		frame.getContentPane().add(Timer_Minute);
		Timer_Minute.setColumns(10);
		
		btnMode = new JButton("Mode");
		btnMode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			if(mode==true){
			mode = false;
			Mode.setText("Teleop");
			
			try{
				
				//input ---------------------------------------------------------------
				autodata.H_Speed = Double.parseDouble(H_Speed.getText());
				autodata.H_Accuracy = Double.parseDouble(H_Accuracy.getText());

				autodata.L_Speed = Double.parseDouble(L_Speed.getText());
				autodata.L_Accuracy = Double.parseDouble(L_Accuracy.getText());
				
				data.Team_Number = Integer.parseInt(Team.getText());
				data.Match_Number = Integer.parseInt(Match.getText());
				
				autodata.G_Input = Integer.parseInt(Gear_Input.getText());
				autodata.G_Placement = Integer.parseInt(Gear_Placement.getText());
				
				autodata.H_Amount = Integer.parseInt(H_Amount.getText());
				autodata.L_Amount = Integer.parseInt(L_Amount.getText());
				
				autodata.C_Accuracy = Double.parseDouble(Acc.getText());
				autodata.C_Carry = Double.parseDouble(Cc.getText());
				
				autodata.Hopper1 = Collect_Top_Left.isSelected();
				autodata.Hopper2 = Collect_Top_Right.isSelected();
				autodata.Hopper3 = Collect_Bottom_Left.isSelected();
				autodata.Hopper4 = Collect_Bottom_Middle.isSelected();
				autodata.Hopper5 = Collect_Bottom_Right.isSelected();
				
				autodata.C_Ground  = rdbtnCollectedFromGround.isSelected();
				autodata.C_Hoppers = rdbtnCollectedFromHoppers.isSelected();
				
				autodata.G_Left = rdbtnLeftGear.isSelected();
				autodata.G_Right = rdbtnRightGear.isSelected();
				autodata.G_Middle = rdbtnMiddleGear.isSelected();
				
				data.Rope = rdbtnClimbedRope.isSelected();
				autodata.Line = rdbtnCrossedLine.isSelected();
				
				autodata.Note = Nts.getText();
				
				}catch(Exception e1){System.out.println(e);}

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

				H_Amount.setText(Integer.toString(data.H_Amount));
				L_Amount.setText(Integer.toString(data.L_Amount));

				Collect_Top_Right.setSelected(data.Hopper1);
				Collect_Top_Left.setSelected(data.Hopper2);
				Collect_Bottom_Left.setSelected(data.Hopper3);
				Collect_Bottom_Middle.setSelected(data.Hopper4);
				Collect_Bottom_Right.setSelected(data.Hopper5);

				rdbtnCollectedFromGround.setSelected(data.C_Ground);
				rdbtnCollectedFromHoppers.setSelected(data.C_Hoppers);

				rdbtnLeftGear.setSelected(data.G_Left);
				rdbtnRightGear.setSelected(data.G_Right);
				rdbtnMiddleGear.setSelected(data.G_Middle);
				rdbtnClimbedRope.setSelected(data.Rope);

				Nts.setText(data.Note);
			
			} else {
				mode = true;
				Mode.setText("Auto");
				
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
					
					data.H_Amount = Integer.parseInt(H_Amount.getText());
					data.L_Amount = Integer.parseInt(L_Amount.getText());
					
					data.C_Accuracy = Double.parseDouble(Acc.getText());
					data.C_Carry = Double.parseDouble(Cc.getText());
					
					data.Hopper1 = Collect_Top_Left.isSelected();
					data.Hopper2 = Collect_Top_Right.isSelected();
					data.Hopper3 = Collect_Bottom_Left.isSelected();
					data.Hopper4 = Collect_Bottom_Middle.isSelected();
					data.Hopper5 = Collect_Bottom_Right.isSelected();
					
					data.C_Ground  = rdbtnCollectedFromGround.isSelected();
					data.C_Hoppers = rdbtnCollectedFromHoppers.isSelected();
					
					data.G_Left = rdbtnLeftGear.isSelected();
					data.G_Right = rdbtnRightGear.isSelected();
					data.G_Middle = rdbtnMiddleGear.isSelected();
					
					data.Rope = rdbtnClimbedRope.isSelected();
					
					data.Note = Nts.getText();
					
					}catch(Exception e1){System.out.println(e);}
				
				H_Speed.setText(Double.toString(autodata.H_Speed));
				H_Accuracy.setText(Double.toString(autodata.H_Accuracy));
				
				L_Speed.setText(Double.toString(autodata.L_Speed));
				L_Accuracy.setText(Double.toString(autodata.L_Accuracy));
				
				Team.setText(Integer.toString(data.Team_Number));
				Match.setText(Integer.toString(data.Match_Number));
				
				Gear_Input.setText(Integer.toString(autodata.G_Input));
				Gear_Placement.setText(Integer.toString(autodata.G_Placement));
				
				Acc.setText(Double.toString(autodata.C_Accuracy));
				Cc.setText(Double.toString(autodata.C_Carry));
				
				H_Amount.setText(Integer.toString(autodata.H_Amount));
				L_Amount.setText(Integer.toString(autodata.L_Amount));
				
				Collect_Top_Right.setSelected(autodata.Hopper1);
				Collect_Top_Left.setSelected(autodata.Hopper2);
				Collect_Bottom_Left.setSelected(autodata.Hopper3);
				Collect_Bottom_Middle.setSelected(autodata.Hopper4);
				Collect_Bottom_Right.setSelected(autodata.Hopper5);
				
				rdbtnCollectedFromGround.setSelected(autodata.C_Ground);
				rdbtnCollectedFromHoppers.setSelected(autodata.C_Hoppers);
				rdbtnCrossedLine.setSelected(autodata.Line);
				
				rdbtnLeftGear.setSelected(autodata.G_Left);
				rdbtnRightGear.setSelected(autodata.G_Right);
				rdbtnMiddleGear.setSelected(autodata.G_Middle);
				rdbtnClimbedRope.setSelected(data.Rope);
				
				Nts.setText(autodata.Note);
				
			}
				
			}
		});
		btnMode.setBounds(147, 311, 125, 29);
		frame.getContentPane().add(btnMode);
		
		Mode = new JTextField();
		Mode.setEditable(false);
		Mode.setBounds(5, 312, 130, 26);
		frame.getContentPane().add(Mode);
		Mode.setColumns(10);
		
		rdbtnCrossedLine = new JRadioButton("Crossed Line");
		rdbtnCrossedLine.setBounds(399, 450, 141, 23);
		frame.getContentPane().add(rdbtnCrossedLine);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Home_Page.modelViewStats.data.add(data);
				System.out.println("Yay!!!!!! data");
				System.out.println(data.Team_Number);
				
				Home_Page.modelViewStats.autodata.add(autodata);
				System.out.println("Yay!!!!!! autodata");
				System.out.println(autodata.Hopper3);
				
				time.stop();
				frame.dispose();
			}
		});
		btnUpload.setBounds(645, 311, 117, 29);
		frame.getContentPane().add(btnUpload);
		
		}	
}