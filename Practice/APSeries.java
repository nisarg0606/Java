package Practice;
import java.util.Scanner;
public class APSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to print A.P. Series...");
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter d: ");
        int d = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sc.close();
        int term = a;
        for (int i = 0; i < n; i++) {
            System.out.print(term+", ");
            term = term + d;
        }
        System.out.print("....");
    }
}
