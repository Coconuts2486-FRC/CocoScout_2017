public class Data_Set extends Entry_Page {
public void run(){
Data data = new Data();
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
	
	System.out.println(data.G_Left);
	System.out.println(data.G_Right);
	System.out.println(data.G_Middle);
	System.out.println(data.Hopper1);
	System.out.println(data.Hopper2);
	System.out.println(data.Hopper3);
	System.out.println(data.Hopper4);
	System.out.println(data.Hopper5);
	System.out.println(data.Rope);
	System.out.println("_-_-_-_-_-_-_-_-_-_-_-_");
	
	Nts.setText(data.Note);

}
}
