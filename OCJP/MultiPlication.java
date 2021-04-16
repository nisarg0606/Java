package OCJP;
import java.util.Scanner;

public class MultiPlication{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number you want to get table of: ");
        int n = sc.nextInt();
        sc.close();
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(n + " * " + i + " = " + i*n);
        }
    }
}