package Aarsh;

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
        int rollno_array[] = new int[n];
        int marks_array[] = new int[n];
        String Results[] = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for roll no " + (i + 1) + ": ");
            rollno_array[i] = (i + 1);
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
        System.out.println("Enter roll no you want to see grades: ");
        int rollno = sc.nextInt();
        int marks = marks_array[rollno - 1];
        System.out.println("Marks: " + marks);
        System.out.println("Result: " + Results[rollno - 1]);
    }
}
