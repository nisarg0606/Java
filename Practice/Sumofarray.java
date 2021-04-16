package Practice;
import java.util.Scanner;
public class Sumofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value of " + (i+1) + " Element: ");
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("The sum of all elements is : " + sum);
        sc.close();
    }
}