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