package RahulSir;

// import java.io.BufferedOutputStream;
// import java.io.FileOutputStream;
import java.io.*;
import java.util.Scanner;
public class TestBufferOutputStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value you want to print to file: ");
        String name = sc.nextLine();
        byte b[] = name.getBytes();
        try {
            FileOutputStream fout = new FileOutputStream("testBuffer.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fout);
            bout.write(b);
            bout.flush();
            fout.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            System.out.println("Successfully Printed");
        }
        sc.close();
    }
}