package Practice;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Breadth of Triangle: ");
        Float b = sc.nextFloat();
        System.out.print("Enter the Height of the Triangle: ");
        Float h = sc.nextFloat();
        Float Area = (0.5f * (b * h));
        sc.close();
        System.out.println("The Area of Triangle is " + Area);
    }
}