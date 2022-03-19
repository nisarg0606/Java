package Ayaan;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "Level";
        str = str.toLowerCase();
        String revString = "";
        for (int i = (str.length() - 1); i >= 0; i--) {
            revString = revString + str.charAt(i);
        }

        if (revString.equals(str)) {
            System.out.println(str + " is a palindrome string.....");
        } else {
            System.out.println(str + " is not a palindrome string.....");
        } 


        // you need to research about difference between == and .equals()
        // write a program that prints prime number between 1 to n. 
    }
}
