package OCJP;

import java.util.Scanner;
public class NumberDigits{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;
        sc.close();
        while(n > 0)
            {
                count++;
                n = n / 10;
            }
        System.out.println(count);
    }
}