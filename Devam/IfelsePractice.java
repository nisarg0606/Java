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
