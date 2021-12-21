package DivaKhushi;

import java.util.Scanner;

public class ArrayofString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        char arr[] = new char[5];
        for(char i = 0; i < n; i++)
        {
            arr[i] = sc.next().charAt(0);
        }
        System.out.println();
        for (char i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
