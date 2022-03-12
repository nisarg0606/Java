package Devam;

import java.util.Scanner;

public class Whilelooppractice {
    public static void main(String[] args) {
        System.out.print("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;// i is starting from n
        while (i <= n) { // i is greater than 0
            System.out.println(i); // print the value of i
            i++; // i = i + 1 // i = i - 1 // decremement the value of i at the end of the while
                 // loop
        }
    }
}

class SquareofNumbers {
    public static void main(String[] args) {
        System.out.print("Enter a number you want square of: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            System.out.println("The square of the number " + n + " is: " + n * n);
            n--;
        }
    }
}
class SquareofNumbersDynamic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting value: ");
        int starting = sc.nextInt();
        System.out.print("Enter the ending value: ");
        int ending = sc.nextInt();
        int i = starting;
        while(i >= starting && i <= ending)
        {
            System.out.println("The square of the number " + i + " is: " + i * i);
            i++;
        }//while loop completed
        
        i = starting;
        System.out.println();
        System.out.println("Using Do...While loop");
        do{
            System.out.println("The square of the number " + i + " is: " + i * i);
            i++;
        }while(i >= starting && i <= ending);
    }
}