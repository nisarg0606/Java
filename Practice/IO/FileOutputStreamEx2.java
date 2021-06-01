package Practice.IO;
import java.io.*;

public class FileOutputStreamEx2 {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("Practice\\IO\\testoutwithstring.txt");
            String s = "This is a string...";
            byte[] b = s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Success...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}