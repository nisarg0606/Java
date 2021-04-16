package Practice;
import java.util.Scanner;
public class DisplayDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        while (n>0) {
            int r = n % 10;
            n = n/10; 
            System.out.println(r);
        }
        sc.close();
    }
}
