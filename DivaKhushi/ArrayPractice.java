package DivaKhushi;

import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sub[] = new int[5];
        int total = 0;
        for (int i = 0; i < sub.length; i++) {
            System.out.println("Enter the marks of sub " + (i + 1));
            sub[i] = sc.nextInt();
            total = total + sub[i];
        }
        float Percentage = (total * 100 / 500);
        System.out.println("The Percentage obtained by you is: " + Percentage);
    }
}
