package Practice;
import java.util.Scanner;
public class MaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many Elements you want to enter: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter "+i+" Element: ");
            a[i] = sc.nextInt();
        }
        sc.close();
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max)
            {
                max = a[i];
            }
        }
        System.out.print("The max Element in the array is "+max);
    }
}