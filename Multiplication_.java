import java.util.Scanner;


public class Multiplication_ {
    public static void main(String[] args) {
        Multiplication_ obj = new Multiplication_();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1: ");
        int num = sc.nextInt();
        System.out.println("Enter the number2: ");
        int num2 = sc.nextInt();
        System.out.println("The multiplication of " + num + " and " + num2 + " is: " + obj.multiply(num, num2));
    }

    int multiply(int num, int num2) {
        if (num < 0 && num2 < 0) {
            num = -num;
            num2 = -num2;
        }
        if( num < 0 )
        {
            num = -num;
            return -multiply(num, num2);
        }
        if( num2 < 0 )
        {
            num2 = -num2;
            return -multiply(num, num2);
        }
        if (num == 0 || num2 == 0) {
            return 0;
        }

        if (num2 == 0) {
            return 0;
        }
        if (num2 == 1) {
            return num;
        }
        return num + multiply(num, num2 - 1);
    }
}