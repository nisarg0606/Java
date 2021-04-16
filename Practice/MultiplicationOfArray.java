package Practice;

import java.util.Scanner;

public class MultiplicationOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];
        System.out.println("Enter A matrix...");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print("Enter [" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter B matrix...");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print("Enter [" + i + "][" + j + "]: ");
                b[i][j] = sc.nextInt();
            }
        }
        sc.close();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        for (int x[] : c) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}