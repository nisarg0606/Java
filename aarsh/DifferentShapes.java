package aarsh;

import java.util.Scanner;

public class DifferentShapes {
    public float AreaOfRectangle(float length, float width) {
        return (length * width);
    }

    public float AreaOfSquare(float length) {
        return (length * length);
    }

    public float AreaOfTriangle(float base, float height) {
        return (0.5f * base * height);
    }

    public static void main(String[] args) {
        DifferentShapes differentShapes = new DifferentShapes(); // stored in stack
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1 --- For Area of Rectangle");
            System.out.println("2 --- For Area of Square");
            System.out.println("3 --- For Area of Triangle");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            float length, height, base, width;
            switch (choice) {
                case 1:
                    System.out.println("Enter the length and width: ");
                    length = sc.nextFloat();
                    width = sc.nextFloat();
                    System.out.println(new DifferentShapes().AreaOfRectangle(length, width));// 2nd way --> anonymous class use
                    break;
                case 2:
                    System.out.println("Enter the length: ");
                    length = sc.nextFloat();
                    System.out.println(differentShapes.AreaOfSquare(length));
                    break;
                case 3:
                    System.out.println("Enter base and height: ");
                    base = sc.nextFloat();
                    height = sc.nextFloat();
                    System.out.println(differentShapes.AreaOfTriangle(base, height));
                    break;
                default:
                    System.out.println("Please enter a valid choice");
                    break;
            }
            System.out.println("Do you want to continue(0 - exit | 1 - continue): ");
            choice = sc.nextInt();
            if(choice == 0)
                break;
        }
    }
}
