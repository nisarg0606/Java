package USA_Practice.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Read_Write_File {
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
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            String s = "Hey there this is my first File... I am learning how to write in a file using Java\n";
            bufferedWriter.write(s);
            bufferedWriter.close();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                System.out.print(string);
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
