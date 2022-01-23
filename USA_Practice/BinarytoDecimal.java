package USA_Practice;

import java.util.Scanner;

public class BinarytoDecimal {
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int i = 0;
        int length = binary.length();
        while (length > 0) {
            int lastDigit = binary.charAt(i) - '0';
            decimal += lastDigit * Math.pow(2, length - 1);
            length--;
            i++;
        }
        return decimal;
    }  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number :");
        String binary = sc.next();
        int decimal = binaryToDecimal(binary);
        System.out.println("The decimal number is :" + decimal);
    }
}
