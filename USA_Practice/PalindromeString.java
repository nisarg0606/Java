package USA_Practice;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Word: ");
        String str = sc.nextLine();
        String rev = "";
        char ch;
        for (int i = str.length() - 1; i >= 0; i--) {
            ch = str.charAt(i);
            rev = rev + ch;
        }
        System.out.println(rev);
        if (str.equals(rev)) { // equals and ==
            System.out.println(str + " is a Palindrome String");
        } else {
            System.out.println(str + " is not a Palindrome String");
        }//thequickbrownfoxxofnworbquickthe
    }
}
