package Practice;

import java.util.*;

public class SecondMaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many Elements you want to enter: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter " + i + " Element: ");
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        sc.close();
        int max1, max2;
        max1 = max2 = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max1) {
                max2 = max1;
                max1 = a[i];
                // break;
            }else if (a[i]>max2) {
                max2 = a[i];
            }
        }
        System.out.println("The max Element in the array is " + max1);
        System.out.println("The Second max Element in the array is " + max2);
    }
}
