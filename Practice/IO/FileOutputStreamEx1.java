//File output stream is used for writing chacters to file using bytes
package Practice.IO;
import java.io.*;

public class FileOutputStreamEx1 {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("Practice\\IO\\testout.txt");
            fout.write(65);
            fout.close();
            System.out.println("Success....");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}