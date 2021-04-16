package Practice;
import java.util.Scanner;
public class AddingMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3]; 
        int b[][] = new int[3][3]; 
        int c[][] = new int[3][3]; 
        System.out.println("Enter A matrix...");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print("Enter ["+i+"]["+j+"]: ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter B matrix...");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print("Enter ["+i+"]["+j+"]: ");
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("The sum of both matrix...");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.format(c[i][j]+", ");    
            }
            System.out.println();
        }

        sc.close();
    }
}
