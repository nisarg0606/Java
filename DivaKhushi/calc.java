package DivaKhushi;

import java.util.Scanner;

class calcccc {
    public static void main(String Args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.println("1.Add\n2.Sub\n3.Mul\n4.Div \nEnter the choice:");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Addition is: " + (a + b));
                break;
            case 2:
                System.out.println("Subtraction is: " + (a - b));
                break;
            case 3:
                System.out.println("Multiplication is: " + (a * b));
                break;
            case 4:
                System.out.println("Division is: " + (a / b));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
