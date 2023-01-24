package codechef;

import java.util.Scanner;

class compareSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a, b, c;
        while (t > 0) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if ((a + b) == c)
                System.out.println("YES");
            else
                System.out.println("NO");
            t--;
        }
    }
}