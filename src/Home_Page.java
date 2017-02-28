import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JScrollPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Home_Page {

	/*public void addRowToJTable()
	{
		DefaultTableModel model = (DefaultTableModel) table.getModel();
        ArrayList<Data> list = Home_Page.modelViewStats.data;
        Object rowData[] = new Object[4];
        for(int i = 0; i < list.size(); i++)
        {
            rowData[0] = list.get(i).C_Accuracy;
            rowData[1] = list.get(i).C_Carry;
            rowData[2] = list.get(i).C_Ground;
            rowData[3] = list.get(i).C_Hoppers;
            rowData[4] = list.get(i).G_Input;
            rowData[5] = list.get(i).G_Left;
            rowData[6] = list.get(i).G_Middle;
            rowData[7] = list.get(i).G_Right;
            rowData[8] = list.get(i).H_Accuracy;
            rowData[9] = list.get(i).H_Amount;
            rowData[10] = list.get(i).H_Speed;
            rowData[11] = list.get(i).Hopper1;
            rowData[12] = list.get(i).Hopper2;
            rowData[13] = list.get(i).Hopper3;
            rowData[14] = list.get(i).Hopper4;
            rowData[15] = list.get(i).Hopper5;
            rowData[16] = list.get(i).L_Accuracy;
            rowData[17] = list.get(i).L_Amount;
            rowData[18] = list.get(i).L_Speed;
            rowData[19] = list.get(i).Match_Number;
            rowData[20] = list.get(i).Note;
            rowData[21] = list.get(i).Rope;
            rowData[22] = list.get(i).Team_Number;
            
            model.addRow(rowData);
        }
	}*/
	
	private JFrame frame;
	private JTable table;
	
	public static Model_View_Stats modelViewStats = new Model_View_Stats();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
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
		frame.setBounds(100, 100, 770, 403);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 6, 758, 266);
		frame.getContentPane().add(scrollPane);
		
		
		
		//Object [] [] data = {{"Hello","no"}}; //Home_Page.modelViewStats.data.toArray()
		//String[] columnHeaders={"test","test"};
		
		 //data,columnHeaders
	
		scrollPane.setViewportView(table);
		
		JButton btnLoadData = new JButton("Load Data");
		btnLoadData.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		btnLoadData.setBounds(6, 284, 758, 91);
		frame.getContentPane().add(btnLoadData);
	}
}
