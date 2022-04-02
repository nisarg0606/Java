package Devam;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // 1234 ----> 4321
        // 1506 --> 6051
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number you want to do reverse of: ");
        int n = sc.nextInt();
        int temp1 = n;
        int ReverseNumber = 0;
        while (n > 0) {
            int temp = n % 10;
            ReverseNumber = ReverseNumber * 10 + temp;
            n = n / 10;
        }
        System.out.println("Reverse number is: " + ReverseNumber);
        if (ReverseNumber == temp1) {
            System.out.println(temp1 + " is a palindrome number");
        } else {
            System.out.println(temp1 + " is not a palindrome number");
        }
        sc.close();
    }
}
