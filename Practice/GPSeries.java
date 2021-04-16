package Practice;
import java.util.Scanner;
public class GPSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to Print G.P. Series...");
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        long term = a;
        for (int i = 0; i < n; i++) {
            System.out.print(term+", ");
            term = term * r;
        }
        System.out.println("...");
        sc.close();
    }
}
