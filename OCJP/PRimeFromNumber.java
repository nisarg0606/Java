package OCJP;

import java.util.Scanner;
class PrimeNum{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        while(n> 0)
        {
            int d = n % 10;
            if(d == 2)
            {
                System.out.print("2");
            }
            else if(d == 3)
            {
                System.out.print("3");
            }
            else if(d == 5)
            {
                System.out.print("5");
            }
            else if(d == 7)
            {
                System.out.print("7");
            }
            n = n / 10;
        }
        sc.close();
    }
}