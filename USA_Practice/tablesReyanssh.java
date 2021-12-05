package USA_Practice;

import java.util.Scanner;


public class tablesReyanssh {
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        int m,n, i = 0;
        System.out.println("Enter the number of start and end: ");
        m = sc.nextInt();
        n = sc.nextInt();
        System.out.println("The table is: ");
        while(m <= n)
        {
            while(i < 11)
            {
                System.out.print(m + " * " + i + " = " + m*i + "\t");
                i++;
            }
            System.out.println();
            i = 0;
            m++;
        }
        sc.close();
    }
    
}
