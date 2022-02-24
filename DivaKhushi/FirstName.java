package DivaKhushi;
import java.util.Scanner;
public class FirstName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str[] = { "Khushi Sheth", "Tejas Shah", "Diva Patel", "Shlok Sheth", "Laxit Shah",
                "Dhyani Sheth", "Khushi Shah", "Khushi Makvana" };
        String Firstname = "Khushi";
        int firstnamelen = Firstname.length();
        int size = str.length;
        int i = 0;
        while (i < size) {
            if (str[i].length() > firstnamelen) {
                String temp = str[i];
                String[] temp1 = temp.split(" ");
                if (temp1[0].equals(Firstname)) {
                    System.out.println(str[i]);
                }
            }
            i++;
        }
    }
}