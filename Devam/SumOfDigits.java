package Devam;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number you want to do sum of: ");
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            int temp = n % 10;
            sum = sum + temp;
            n = n / 10;
        }
        System.out.println("The Sum of the digits is: " + sum);
        //product of digits
        // example: 432 --> 4 * 3 * 2 = 24
    }
}
