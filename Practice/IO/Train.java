package Practice.IO;

import java.io.*;
import java.util.Scanner;

public class Train {
    public void details() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the id of the train: ");
        String id = sc.nextLine();
        System.out.print("Enter the name of the train: ");
        String name = sc.nextLine();
        System.out.print("Enter the Departure Station: ");
        String dep = sc.nextLine();
        System.out.print("Enter the Arrival Station: ");
        String arr = sc.nextLine();
        System.out.print("Enter Fair: ");
        String fair = sc.nextLine();
        System.out.print("Enter departure Time:- ");
        String time = sc.nextLine();
        try (FileWriter fw = new FileWriter("Practice\\IO\\TrainDetails.txt")) {
            fw.write(id);
            fw.write(' ');
            fw.write(name);
            fw.write(' ');
            fw.write(dep);
            fw.write(' ');
            fw.write(arr);
            fw.write(' ');
            fw.write(fair);
            fw.write(' ');
            fw.write(time);

            fw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        sc.close();
    }

    public void search() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word you want to search for: ");
        String search = sc.nextLine();
        try (FileReader fr = new FileReader("Practice\\IO\\TrainDetails.txt")) {
            BufferedReader br = new BufferedReader(fr);
            String lines;
            int k = 0;
            while ((lines = br.readLine()) != null) {
                int count = 0;
                if (lines.contains(search)) // check if string is present
                {
                    count++;
                }
                if (count != 0) {
                    System.out.println(lines);
                    k++;
                }
            }
            if (k == 0) {
                System.out.println("Word is not present in the file");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        sc.close();
    }

    public static void main(String[] args) {
        Train tr = new Train();
        Scanner sc = new Scanner(System.in);
        System.out.println("1. for insert");
        System.out.println("2. for search");
        System.out.println("3. for exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        while (choice != 3) {
            switch (choice) {
                case 1:
                    tr.details();
                    sc.next();
                    break;
                    
                    case 2:
                    tr.search();
                    sc.next();
                    break;    
                default:
                    System.out.println("Enter a valid choice....");
                    break;
            }
        }
        sc.close();
    }
}