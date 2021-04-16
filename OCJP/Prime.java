package OCJP;
import java.util.Scanner;
public class Prime{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number you want to check prime: ");
        int n = sc.nextInt();
        sc.close();
        int flag = 0, i;
        int m = n/2;
        if(n ==0 || n == 1)
        {
            System.out.println(n+" is not prime number");
        }else{
            for(i=2; i <=m; i++)
            {
                if(n%i == 0)
                {
                    System.out.println(n +" is not prime number");
                    flag = 1;
                    break;
                }
            }                        
            if(flag == 0)
            {
                System.out.println(n + " is prime number");
            }
        }
        sc.close(); 
    }
}