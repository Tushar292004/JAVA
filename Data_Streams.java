import java.io.*;
public class Data_Streams {

   public static void main(String args[])throws IOException {

      // writing string to a file encoded as modified UTF-8
      DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("file.txt"));
      dataOut.writeUTF("hello macha how are you");

      // Reading data from the same file
      DataInputStream dataIn = new DataInputStream(new FileInputStream("file.txt"));

      while(dataIn.available()>0) {
         String k = dataIn.readUTF();
         System.out.println(k);
      }
   }
}
