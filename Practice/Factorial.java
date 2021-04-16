package Practice;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number you want to know the factorial of: ");
        int n = sc.nextInt();
        long fact = 1;
        for (long i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("The Factorial of "+n+" is "+fact);
        sc.close();
    }
}