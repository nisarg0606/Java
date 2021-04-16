package W3Resource;

import java.util.*;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Unsorted Array of 10 numbers: ");
        int a[] = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println("Enter list of 10 words you want to sort: ");
        String s[] = new String[10];
        for (int i = 0; i < s.length; i++) {
            s[i] = sc.nextLine();
        }
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));

        sc.close();
    }
}
