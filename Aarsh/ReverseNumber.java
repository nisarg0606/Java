package Aarsh;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // 123  ---> 321
        /*
         * 
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int rev = 0;
        while(num > 0) // num = 123 -> 12 > 0 (true) --> 1 > 0 (true) --> 0 > 0 (false) loop terminated
        {
            int temp = num % 10; // temp = 3 --> temp = 2 --> temp = 1
            rev = rev * 10 + temp; //0 * 10 = 0 + 3 --> rev = 3 --> rev = 3 * 10 + 2 = 32 --> rev = 32 --> rev = 32*10 + 1 = 321
            num = num / 10; // --> 123 / 10 = 12 --> 12/ 10 = 1 --> 1 / 10 = 0
        }

        System.out.println("Reverse number is: " + rev);
    }
}
