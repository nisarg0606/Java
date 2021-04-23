package Practice.Isha;
import java.util.Scanner;
public class SumOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix A");
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter ["+i+"]["+j+"] Element: ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the matrix B");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter ["+i+"]["+j+"] Element: ");
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Sum of Matrix A and B is as below");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.printf("%2d  ",c[i][j]);   
            }
            System.out.println();
        }
        sc.close();
    }
}
