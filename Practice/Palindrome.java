package Practice;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number you want to reverse: ");
        int n = sc.nextInt();
        int rev = 0;
        int m = n;
        while (n>0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n = n/10;
        }
        if(m==rev){
            System.out.println("It is a palindrome....");
        }
        else
        {
            System.out.println("It is not a palindrome....");
        }
        sc.close();
    }
}
