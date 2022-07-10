package USA_Practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Read_File {
    public static void main(String[] args) {
        // try {
        // FileReader fread = new
        // FileReader("D:\\Java\\USA_Practice\\ArrayAndNumber.java");
        // int i;
        // while ((i = fread.read()) != -1) {
        // System.out.print((char) i);
        // }
        // } catch (IOException e) {
        // e.printStackTrace();
        // }

        // what if you want to perform Multiple Operations on a file??new
        // FileReader(file)
        try {

            File file = new File("D:\\Java\\USA_Practice\\File_Demo.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            String s = "Hey there this is my first File... I am learning how to write in a file using Java";
            bufferedWriter.write(s);
            bufferedWriter.close();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                System.out.println(string);
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
