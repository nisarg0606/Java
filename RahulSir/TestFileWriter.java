package RahulSir;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class TestFileWriter{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        FileWriter fw = new FileWriter("DemoFileWriter.txt");
        fw.write(name);
        fw.close();
        sc.close();
        System.out.println("Task Done");
    }
}