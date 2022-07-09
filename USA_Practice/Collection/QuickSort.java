package USA_Practice.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> i = new ArrayList<>();
        System.out.println("Enter how many numbers you want to enter: ");
        int n = sc.nextInt();
        int x;
        for (int j = 0; j < n; j++) {
            System.out.println("Enter a number: ");
            x = sc.nextInt();
            i.add(x);
        }
        System.out.println("Before Sorting the Array: ");
        for (Integer integer : i) {
            System.out.print(integer + "    ");
        }
        System.out.println("\nAfter Sorting the Array: ");
        Collections.sort(i);
        for (Integer integer : i) {
            System.out.print(integer + "    ");
        }
    }
}
