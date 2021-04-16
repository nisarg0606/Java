package OCJP;
import java.util.Scanner;
public class APSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        // String ohmy[] = new String[] {};
        
        long n = sc.nextLong();
        long rem;
        int count = 10;
        while(n > 0)
        {
            count = count * 10;
            rem = n % 10;
            n = n / (1 * count);
            System.out.print(rem);
        }
        sc.close();
    }
}
