package Devam;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        System.out.println("Enter value of a: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter value of b: ");
        int b = sc.nextInt();
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for substraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");
        int choice = sc.nextInt();
        if(choice == 1)
        {
            System.out.println("The addition of 2 numbers is: " + (a + b));
        }
        else if(choice == 2)
        {
            System.out.println("The substraction of 2 numbers is: " + (a - b));
        }
        else if(choice == 3)
        {
            System.out.println("The multiplication of 2 numbers is: " + (a * b));
        }
        else if(choice == 4)
        {
            System.out.println("The division of 2 numbers is: " + (a / b));
        }
        else{
            System.out.println("Please enter a valid choice....");
        }
        //hw for today ----> complete all the previous code with this one
    }
}