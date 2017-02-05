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
	private JButton Gear_Placement_Add_Left;
	private JButton Gear_Placement_Subtract_Left;
	private JButton Low_Goal_Add_Left;
	private JButton Low_Goal_Subtract_Left;
	private JButton Gear_Pickup_Add_Left;
	private JButton Gear_Pickup_Subtract_Left;
	private JButton Low_Goal_Subtract_Right;
	private JButton Low_Goal_Add_Right;
	private JButton Gear_Placement_Add_Right;
	private JButton Gear_Placement_Subtract_Right;
	private JButton Gear_Pickup_Left_Right;
	private JButton Gear_Pickup_Add_Right;
	private JButton High_Goal_Add_Left;
	private JButton High_Goal_Subtract_Left;
	private JButton High_Goal_Subtract_Right;
	private JButton High_Goal_Add_Right;
	private JRadioButton Collect_Top_Right;
	private JRadioButton Teleop;
	private JRadioButton Autonomous;
	private JTextField H_Speed;
	private JTextField L_Speed;
	private JTextField Gear_Input;
	private JTextField Gear_Placement;
	private JTextField Team;
	private JTextField Match;
	private JLabel lblSpeed;
	private JLabel lblAccuracy;
	private JTextField H_Accuracy;
	private JLabel lblC;
	private JTextField C_Carring_Capacity;
	private JLabel lblSpeed_1;
	private JLabel lblAccuracy_1;
	private JTextField L_Accuracy;
	private JLabel lblRotors;
	private JLabel lblMatchInfo;
	private JLabel lblCollection;
	private JLabel lblCollection_1;
	private JLabel lblAccuracy_2;
	private JTextField C_Accuracy;
	private JLabel lblNotes_1;
	private JTextField Notes;
	private JButton Upload;
	private JLabel lblHighGoal_1;
	private JLabel lblLowGoal_1;
	private JLabel lblHighGoal_2;
	private JLabel lblLowGoal_2;
	private JLabel lblGearPickup;
	private JLabel lblGearPickup_1;
	private JLabel lblGearPlacement;
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
		
		C_Carring_Capacity = new JTextField();
		C_Carring_Capacity.setBounds(634, 506, 130, 26);
		frame.getContentPane().add(C_Carring_Capacity);
		C_Carring_Capacity.setColumns(10);
		
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
		
		C_Accuracy = new JTextField();
		C_Accuracy.setBounds(634, 478, 130, 26);
		frame.getContentPane().add(C_Accuracy);
		C_Accuracy.setColumns(10);
		
		lblNotes_1 = new JLabel("Notes:");
		lblNotes_1.setBounds(6, 549, 61, 16);
		frame.getContentPane().add(lblNotes_1);
		
		Notes = new JTextField();
		Notes.setBounds(120, 544, 644, 26);
		frame.getContentPane().add(Notes);
		Notes.setColumns(10);
		
		Upload = new JButton("Upload");
		Upload.setBounds(653, 311, 117, 29);
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
		path="./Resource/Map.jpg";
		ImageIcon myimage = new ImageIcon (path);
		Image img = myimage.getImage();
		Image newImg = img.getScaledInstance(icon.getWidth(), icon.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(newImg);
		icon.setIcon(image);
		frame.getContentPane().add(icon);
		
		JButton Info = new JButton("Info");
		Info.setBounds(540, 312, 117, 29);
		frame.getContentPane().add(Info);
		
		Data data = new Data();
		try{

		data.H_Speed = Double.parseDouble(H_Speed.getText());
		data.H_Accuracy = Double.parseDouble(H_Accuracy.getText());

		data.L_Speed = Double.parseDouble(L_Speed.getText());
		data.L_Accuracy = Double.parseDouble(L_Accuracy.getText());
		
		data.Team_Number = Integer.parseInt(Team.getText());
		data.Match_Number = Integer.parseInt(Match.getText());
		
		data.G_Input = Integer.parseInt(Gear_Input.getText());
		data.G_Placement = Integer.parseInt(Gear_Placement.getText());
		
		data.C_Accuracy = Double.parseDouble(C_Accuracy.getText());
		data.C_Capacity = Integer.parseInt(C_Carring_Capacity.getText());
		
		data.Hopper1 = Collect_Top_Left.isSelected();
		data.Hopper2 = Collect_Top_Right.isSelected();
		data.Hopper3 = Collect_Bottom_Left.isSelected();
		data.Hopper4 = Collect_Bottom_Middle.isSelected();
		data.Hopper5 = Collect_Bottom_Right.isSelected();
		
		data.C_Ground  = rdbtnCollectedFromGround.isSelected();
		data.C_Hoppers = rdbtnCollectedFromHoppers.isSelected();
		
		data.Notes = Notes.getText();
		
		
		
		
		H_Speed.setText(Double.toString(data.H_Speed));
		H_Accuracy.setText(Double.toString(data.H_Accuracy));
		
		
		
		
		} catch(java.lang.NumberFormatException e){
		
		}
	}}
