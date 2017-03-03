import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CSV {
	public void WriteToFile(Model_View_Stats stats){
		WriteToFile(stats, System.getProperty("user.dir") + "\\output.csv", true);
	}
	public void WriteToFile(Model_View_Stats stats, String directory, Boolean columnHeaders){
		try
		{
			BufferedWriter out = new BufferedWriter(new FileWriter(directory));
			if(columnHeaders){
				out.write("\"Team Number\",\"Match Number\",\"High Goal Amount\",\"Low Goal Amount\",\"High Goal Speed\",\"Low Goal Speed\",\"High Goal Accuracy\",\"Low Goal Accuracy\",\"Gear To Robot\",\"Gears Placed\",\"Fuel Collection Accuracy\",\"Carrying Capacity\",\"Collected from Ground\",\"Collected from Hoppers\",\"Hopper Top Left\",\"Hopper Top Right\",\"Hopper Bottow Left\",\"Hopper Bottow Middle\",\"Hopper Bottow Right\",\"Placed Gear Left\",\"Placed Gear Middle\",\"Placed Gear Right\",\"Climbed Rope\",\"Notes\",\"Auto High Goal Amount\",\"Auto Low Goal Amount\",\"Auto High Goal Speed\",\"Auto Low Goal Speed\",\"Auto High Goal Accuracy\",\"Auto Low Goal Accuracy\",\"Auto Gear To Robot\",\"Auto Gears Placed\",\"Auto Fuel Collection Accuracy\",\"Auto Carrying Capacity\",\"Auto Collected from Ground\",\"Auto Collected from Hoppers\",\"Auto Hopper Top Left\",\"Auto Hopper Top Right\",\"Auto Hopper Bottow Left\",\"Auto Hopper Bottow Middle\",\"Auto Hopper Bottow Right\",\"Auto Placed Gear Left\",\"Auto Placed Gear Middle\",\"Auto Placed Gear Right\",\"Auto Crossed Line\",\"Auto Notes\"");
			}
			for(int i = 0; i <= stats.autodata.size() - 1; i++){
				out.write("\n" + String.format("%1s,%2s,%3s,%4s,%5s,%6s,%7s,%8s,%9s,%10s,%11s,%12s,%13s,%14s,%15s,%16s,%17s,%18s,%19s,%20s,%21s,%22s,%23s,%24s,%25s,%26s,%27s,%28s,%29s,%30s,%31s,%32s,%33s,%34s,%35s,%36s,%37s,%38s,%39s,%40s,%41s,%42s,%43s,%44s,%45s,%46s", stats.data.get(i).Team_Number, stats.data.get(i).Match_Number, stats.data.get(i).H_Amount,stats.data.get(i).L_Amount,stats.data.get(i).H_Speed,stats.data.get(i).L_Speed,stats.data.get(i).H_Accuracy,stats.data.get(i).L_Accuracy,stats.data.get(i).G_Input,stats.data.get(i).G_Placement,stats.data.get(i).C_Accuracy,stats.data.get(i).C_Carry,stats.data.get(i).C_Ground,stats.data.get(i).C_Hoppers,stats.data.get(i).Hopper1,stats.data.get(i).Hopper2,stats.data.get(i).Hopper3,stats.data.get(i).Hopper4,stats.data.get(i).Hopper5,stats.data.get(i).G_Left,stats.data.get(i).G_Middle,stats.data.get(i).G_Right,stats.data.get(i).Rope,stats.data.get(i).Note, stats.autodata.get(i).H_Amount,stats.autodata.get(i).L_Amount,stats.autodata.get(i).H_Speed,stats.autodata.get(i).L_Speed,stats.autodata.get(i).H_Accuracy,stats.autodata.get(i).L_Accuracy,stats.autodata.get(i).G_Input,stats.autodata.get(i).G_Placement,stats.autodata.get(i).C_Accuracy,stats.autodata.get(i).C_Carry,stats.autodata.get(i).C_Ground,stats.autodata.get(i).C_Hoppers,stats.autodata.get(i).Hopper1,stats.autodata.get(i).Hopper2,stats.autodata.get(i).Hopper3,stats.autodata.get(i).Hopper4,stats.autodata.get(i).Hopper5,stats.autodata.get(i).G_Left,stats.autodata.get(i).G_Middle,stats.autodata.get(i).G_Right,stats.autodata.get(i).Line,stats.autodata.get(i).Note));
			}
			out.close();
		}
		catch(IOException ex) { System.out.println(ex.getMessage()); }
	}
}
