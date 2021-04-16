package Practice;
import java.util.Scanner;
public class SumOFnNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter till which number you want to add: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("The num of "+n+" numbers is "+sum);
        sc.close();
    }
}