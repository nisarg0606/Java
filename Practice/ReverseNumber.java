package Practice;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number you want to reverse: ");
        int n = sc.nextInt();
        while (n>0) {
            int reverse = n % 10;
            System.out.print(reverse);
            n = n/10;
        }
        sc.close();
    }
}