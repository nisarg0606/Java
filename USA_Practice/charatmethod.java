package USA_Practice;

import java.util.Scanner;

public class charatmethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.next();
        System.out.println("Enter what index you want to get : ");
        int index = sc.nextInt();
        char c = s.charAt(index);
        System.out.println("The char is: " + c);
    }
}
