package Practice;
import java.util.Scanner;
public class CountNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int count = 0;
        int n = sc.nextInt();
        while (n>0) {
            n = n/10;
            count++; 
        }
        System.out.println(count);
        sc.close();
    }
}