package RahulSir;

import java.io.*;
import java.util.Scanner;
public class TestFileOutputStreamApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        byte b[] = name.getBytes();

        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream("test.txt");
            fout.write(b);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally
        {
            try {
                fout.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Data is written in file");
        }
        sc.close();
    }
}
