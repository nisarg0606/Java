package RahulSir;

import java.util.Scanner;

public class MultipleTryCatch {
    public static void main(String[] args) {
        int ans = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter NO1: ");
        int no1 = sc.nextInt();
        System.out.print("Enter NO2: ");
        int no2 = sc.nextInt();
        String name = "test";
        int a[] = new int[5];
        try {
            try {
                ans = no1 / no2;
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                System.out.println("statement----test");
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                System.out.println("Name.length()- "+name.length());
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                a[5] = 10;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (NullPointerException | ArithmeticException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Division: "+ans);
        sc.close();
    }
}
