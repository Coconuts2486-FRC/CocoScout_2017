import java.io.*;
public class Deserelization {

   public static void main() {

      try {
         FileInputStream fileIn = new FileInputStream("/Users/logan42474/Google Drive/test/x.xml");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         Home_Page.modelViewStats = (Model_View_Stats) in.readObject();
         in.close();
         fileIn.close();
         System.out.println("Data has been deserelized");
         System.out.println(Home_Page.modelViewStats.data.get(0).Team_Number);
      }catch(IOException i) {
         i.printStackTrace();
         return;
      }catch(ClassNotFoundException c) {
         System.out.println("Employee class not found");
         c.printStackTrace();
         return;
      }
      
      
   }
}