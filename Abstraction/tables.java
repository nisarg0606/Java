import java.util.Scanner;

public class tables {
    public static void main(String[] args) {
        // Scanner scr = new Scanner(System.in);
        // int num;
        // int i = 0;
        // System.out.println("Enter the number you want the table of ");
        // num = scr.nextInt();
        // while (i < 10) {
        // System.out.println(num + "x" + i + "=" + num * i);
        // i++;
        // }
        Scanner scr = new Scanner(System.in);
        int start, end;
        System.out.println("Enter the start and end number");
        start = scr.nextInt();
        end = scr.nextInt();
        for (int j = start; j <= end; j++) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(j + "x" + i + "=" + (j * i));
            }
            System.out.println();
        }
        scr.close();
    }
}