package OCJP;

import java.util.Scanner;
class nPrime 
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter till which number you want prime numbers: ");
        int N = sc.nextInt(); 
        int i, j, flag, count=0;
        System.out.println("Prime numbers between 1 and " + N + " are:");
        for (i = 1; i <= N; i++) 
        {
            if (i == 0 || i == 1) 
                continue; 
            flag = 0;
            for (j = 2; j <= i / 2; j++) 
            { 
                if (i % j == 0)
                { 
                    flag = 1; 
                    break; 
                } 
            }
            if (flag == 0)
            {
                System.out.print(i + " "); 
                count++;
            } 
        } 
                System.out.println("\ncount: " + count);

    }
}