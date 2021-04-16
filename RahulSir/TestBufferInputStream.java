package RahulSir;

// import java.io.BufferedInputStream;
// import java.io.FileInputStream;
import java.io.*;
public class TestBufferInputStream {
    public static void main(String[] args) throws Exception {
        FileInputStream fin = new FileInputStream("testBuffer.txt");
        BufferedInputStream bin = new BufferedInputStream(fin);
        int temp=0;
        while ((temp = bin.read()) !=-1) {
            System.out.print((char)temp);
        }
        System.out.println("\nSuccessfully Done");
        bin.close();
    }
}