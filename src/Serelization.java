import java.io.*;
public class Serelization {

   public static void main() {
      
      
      try {
         FileOutputStream fileOut =
         new FileOutputStream("/Users/logan42474/Google Drive/test/x.xml");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(Home_Page.modelViewStats);
         out.close();
         fileOut.close();
         System.out.println("Data has been Serelized");
      }catch(IOException i) {
         i.printStackTrace();
      }
   }
}