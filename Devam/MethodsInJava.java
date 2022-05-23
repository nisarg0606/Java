package Devam;
import java.util.Scanner;
public class MethodsInJava {
    // there are 2 types of methods
    // 1 User Defined
    // Pre Defined --> Lenght() compareTo()
    private int sum(int a, int b) {
        int c = a + b;
        return c;
    }
    // Access modifier      return type     name of fun/method      parameters
        public              int             difference              (int a, int b) {
        int c = a - b;
        return c;
    }
    // create two methods / function for Division and Multiplication and both methods 
    //return type should be float  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MethodsInJava obj = new MethodsInJava(); // creating object of this class to access the methods
        // of this class
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.println("what you want to perform");
        System.out.println("1 --- For Sum");
        System.out.println("2 --- For Difference");
        System.out.println("3 --- For Multiplication");
        System.out.println("4 --- For Division");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("The sum of a and b is: " + obj.sum(a, b));
                break;
            case 2:
                System.out.println("The Difference between a and b is: " + obj.difference(a, b));
                break;
            default:
                System.out.println("Please enter a valid input....");
        }
    }
}
