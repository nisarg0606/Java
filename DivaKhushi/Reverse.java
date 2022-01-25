package DivaKhushi;

import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("Enter A number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        System.out.println("The reverse number is : " + rev);
    }
}
