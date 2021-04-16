package VSITR;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of Height: ");
        double Height = sc.nextDouble();
        System.out.print("Enter the value of Weight: ");
        double Weight = sc.nextDouble();
        double BMI = Weight / (Height * Height);
        if (BMI < 18.5)
            System.out.println("UnderWeight");
        else if (BMI <= 24.9)
            System.out.println("Normal");
        else if (BMI <= 29.9)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
        sc.close();
    }
}
