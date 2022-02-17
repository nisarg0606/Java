package Devam;

import java.util.Scanner;
public class IfelsePractice {
    public static void main(String[] args) {
        //make a program that you should firstly ask the user for the input and then if input is >= 33 
        //then user is passed else user failed
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        if(marks >= 33 && marks <= 100)
        {
            System.out.println("You are passed");
        }
        else if(marks >= 0 && marks <= 32)
        {
            System.out.println("You Failed");
        }
        else{
            System.out.println("Please Enter a valid marks...");
        }
    }
}
//max number between 2 numbers
/*
input: Enter 2 numbers:
    5 10
    10 10
    Output:
    The Maximum Number from 2 numbers is: 10
    a,b
    if a > b
            print-> a is bigger than b
    else if a == b
            both of them are equal
    else
            b is bigger than a
*/

class FindMaxofTwo{
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b)
        {
            System.out.println("A is Greater than B");
        }
        else if(a == b)
        {
            System.out.println("Both The Numbers are same");
        }
        else{
            System.out.println("B is greater than A");
        }
    }
}

// take a number from the user and you should let him know if number is +ve, -ve or 0(neutal)
/*
int a
Enter a number:
5
Positive Number
-10
Negative number
0
Neutral number i.e. 0
*/

class NumberCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a > 0)
        {
            System.out.println("The number is Positive....");
        }
        else if(a < 0)
        {
            System.out.println("The number is Negative");
        }
        else{
            System.out.println("The number is 0");
        }
    }
}