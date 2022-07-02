package USA_Practice.Streams;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CreateFilev1 {
    public static void main(String[] args) {
        try {
            File f0 = new File("USA_Practice\\Streams\\newfile.txt");
            // try {
            // if (f0.createNewFile()) {
            // System.out.println("File with name " + f0.getName() + " Created
            // Successfully");
            // } else {
            // System.out.println("File Already Exists....");
            // }
            // } catch (Exception e) {
            // e.printStackTrace();
            // }
            StringBuffer sb = new StringBuffer();
            sb.append("\nHey there this is my new File....");
            FileWriter fw = new FileWriter(f0, true);
            if (fw.append(sb) != null) {
                System.out.println("Successfully Written");
            } else {
                System.out.println("Nothing Written");
            }
            fw.close();
            FileReader fr = new FileReader(f0);
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            fr.close();
            System.out.println(f0.length());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
