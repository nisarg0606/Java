package USA_Practice.IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class DynamicFiles {
    public static void main(String[] args) {
        // difference between FileWriter and BufferWriter
        // how can I do write and read both/ read after writing using what so ever thing
        // you want...
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        try {
            File file = new File("D:/Java/USA_Practice/FileWriterDemo.txt");
            System.out.println("You want to write or read in/from the file?");
            Character c = sc.nextLine().toLowerCase().charAt(0);
            // sc.nextLine();
            if (c == 'w') {
                FileWriter fileWriter = new FileWriter(file, true);
                do {
                    System.out.println("Enter what you want to write to a file: ");
                    String data = sc.nextLine();
                    fileWriter.append(data + "\n");
                    System.out.println("Do you want to continue(1- Y/ 0 - N): ");
                    choice = sc.nextInt();
                    sc.nextLine();
                } while (choice != 0);
                fileWriter.close();
            } else {
                FileReader fileReader = new FileReader(file);
                int i;
                System.out.println("-------------Output from The File-------------");
                while ((i = fileReader.read()) != -1) {
                    System.out.print((char) i);
                }
                fileReader.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        sc.close();
    }
}