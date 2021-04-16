package Practice;
import java.util.Scanner;
public class SumInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements you want to enter: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter "+(i+1)+" Element: ");
            sum = sum + sc.nextInt();
        }
        sc.close();
        System.out.println("The sum of the Elements is: "+ sum);
    }
}