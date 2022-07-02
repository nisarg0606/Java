package USA_Practice.Streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamv1 {
    public static void main(String[] args) throws Exception {
        FileOutputStream fout = new FileOutputStream("USA_Practice\\Streams\\sample.txt", true);
        byte[] b = { 65, 32, 70, 32, 77, 32, 97, 32, 27, 32, 100, 32, 85 };
        fout.write(b);
        String s = "\nતમે કેમ છો";
        fout.write(s.getBytes());
        fout.close();
        System.out.println("Written Successfully");
        FileInputStream fin = new FileInputStream("USA_Practice\\Streams\\sample.txt");
        int b1;
        while ((b1 = fin.read()) != -1) {
            System.out.print((char) (int) (byte) b1);
        }
    }
}
