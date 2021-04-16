package Practice;
import java.util.Scanner;
public class RotationOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i : a) {
            System.out.print(i+", ");  
        }
        System.out.println();
        int temp = a[0];
        for (int i = 1; i < a.length; i++) {
            a[i-1] = a[i];
        }
        a[a.length-1] = temp;
        sc.close();
    }
}
