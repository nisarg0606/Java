package RahulSir;

import java.io.*;

public class TestFileInputStream {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("test.txt");
            int temp;
            while ((temp = fin.read()) != -1) {
                System.out.print((char) temp);
            }
            fin.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            try {
                // fin.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            // System.out.println("Data is written in file");
        }
    }
}
