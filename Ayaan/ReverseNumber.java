package Ayaan;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter what you want to do reverse of: ");
        int n = sc.nextInt(); // 45643
        // int temp = n;
        int reverse = 0;
        int temp1 = n;
        int sum = 0;
        while (n > 0) {
            int temp = n % 10;
            reverse = (reverse * 10) + temp;
            sum = sum + temp;
            n = n / 10;
        }
        if (temp1 == reverse) {
            System.out.println("The number is palindrome");
        } else {
            System.out.println("The number is not palindrome");
        }
        System.out.println("Reverse number is: " + reverse);
        System.out.println("Sum of digits is: " + sum);
    } // 1234 --> 10
}