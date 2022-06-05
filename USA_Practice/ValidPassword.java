package USA_Practice;
import java.util.Scanner;
public class ValidPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(
                "1. A password must have at least eight characters.\n" +
                        "2. A password consists of only letters and digits.\n" +
                        "3. A password must contain at least two digits and at least two letters/characters\n");
        while (true) {
            System.out.print("\nEnter the password to check: ");
            String password = sc.next();
            System.out.print(isValidPassword(password));
            if (isValidPassword(password) == password) {
                System.out.print(" is a valid password.");
                System.exit(0);
            }
            sc.close();
        }
    }

    public static String isValidPassword(String password) {
        if (password.length() < 8) {
            return "Please enter a valid length";
        }
        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (is_Letter(ch))
                charCount++;
            else if (is_Number(ch))
                numCount++;
            else
                return "Please enter numbers and characters only";
        }
        if (numCount < 2)
            return "Please enter atleast 2 numbers";
        else if (charCount < 2)
            return "Please enter atleast 2 Characters";
        return password;

    }

    public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }

    public static boolean is_Number(char ch) {
        return (ch >= '0' && ch <= '9');
    }
}