package Practice;
import java.util.Scanner;
public class PAttern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        // for (int i = 0; i < n; i++) {
            //     for (int j = 1; j <= n; j++) {
                //         System.out.print(j+" ");
                //     }
                //     System.out.println();
                // }
                sc.close();
                System.out.println();
                int no=n;
                for (int i = 1; i <= n; i++) {
                    for (int j = i+1; j <= no+1; j++) {
                        System.out.print(j+" ");
                    }
                    no++;
                    System.out.println();
                }
                //other form for the above loop solution
                System.out.println();
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        System.out.print(j+i+"  ");
                    }
                    System.out.println();
                }
                System.out.println();
                int d = 1;
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        System.out.format("%02d  ", d);
                        d++;
                    }
                    System.out.println();
                }
                System.out.println();
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        System.out.print(i+"  ");
                    }
                    System.out.println();
                }               
                System.out.println();
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j+"  ");
                    }
                    System.out.println();
                }               
                System.out.println();
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(i+"  ");
                    }
                    System.out.println();
                }
                d = 1;
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.format("%02d  ", d);
                        d++;
                    }
                    System.out.println();
                }
                System.out.println();
                for (int i = n; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.format("%02d  ", j);
                        d++;
                    }
                    System.out.println();
                }
                System.out.println();
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        if (j>=i) {
                            System.out.print("* ");;
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
            }
}