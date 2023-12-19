package aarsh;

import java.util.Scanner;

public class ScoreCard {
    // roll no: { 1, 2, 3 ,4 ,5 }
    // marks: {99, 70, 40, 80, 65}
    // 1: HONORS
    // 2: DIVISION I

    public static void main(String[] args) {
        System.out.println("Honors      --- (marks > 79 and marks <= 100) ");
        System.out.println("Division I  --- (marks > 59 and marks <= 79");
        System.out.println("Division II --- (marks > 49 and marks <= 59");
        System.out.println("Fail        --- (marks >= 0 and marks <= 49");
        // method take roll no and marks as an database

        Scanner sc = new Scanner(System.in);
        System.out.println("How many student marks you want to enter: ");
        int n = sc.nextInt();
        int marks_array[] = new int[n];
        String Results[] = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for roll no " + (i + 1) + ": ");
            marks_array[i] = sc.nextInt();
            if (marks_array[i] > 79 && marks_array[i] <= 100)
                Results[i] = "Honors";
            else if (marks_array[i] > 59 && marks_array[i] <= 79)
                Results[i] = "Division I";
            else if (marks_array[i] > 49 && marks_array[i] <= 59)
                Results[i] = "Division II";
            else if (marks_array[i] >= 0 && marks_array[i] <= 49)
                Results[i] = "Fail";
            else
                Results[i] = "Invalid Marks";
        }
        while (true) {
            System.out.println("Enter roll no you want to see grades: ");
            int rollno = sc.nextInt();
            // exception handling
            // try and catch

            // run time error and compile time error -->
            // compile time errors are solved during compiliing the program
            // but if you handle run time errors than you need to use try catch
            // alternative to try catch --> throws
            int marks = 0;
            try {
                marks = marks_array[rollno - 1];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("You have entered invalid roll no. Please check and reenter");
                // continue;
                System.out.println("Marks: " + marks);
                try{
                    System.out.println("Result: " + Results[rollno - 1]);
                }catch(Exception ex)
                {
                    ex.printStackTrace();
                }
                System.out.println("Continue (y or n): ");
                int choice = sc.next().charAt(0);
                if (choice == 'n' || choice == 'n')
                break;
            }catch(ArithmeticException e)
            {
                System.out.println("Maths error...");
            }catch(Exception e)
            {
                System.out.println("Something is wrong...");
            }
            finally{
                System.out.println("Due to some error the program is exited...");
            }
               // HW: how many types of exception can occur in java. 
        }
    }
}
