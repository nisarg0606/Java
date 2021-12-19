package USA_Practice;

import java.util.Scanner;

public class VolumeOfDifferentShapes {
    public static double sphere(float r) {
        double ans =  4 * r * r * r / 3;
        ans =  Math.PI * ans;
        return ans;
    }
    public static double cylinder(float r, float h) {
        double ans =  Math.PI * r * r * h;// pi * r ^ 2 * h
        return ans;
    }
    public static double cone(float r, float h) {
        double ans =  Math.PI * r * r * h / 3;// pi * r * r * h;
        return ans;
    }
    public static double cube(float a) {
        double ans =  a * a * a; // l * l * l;
        return ans;
    }
    public static double rectangularPrism(float a, float b, float h) {
        double ans =  a * b * h; // l * b * h;
        return ans;
    }
    public static double rectangularPyramid(float a, float b, float h) {
        double ans =  a * b * h / 3; // l * b * h / 3
        return ans;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the radius for sphere: ");
            float radius = sc.nextFloat();
            System.out.println("The volume of sphere is " + sphere(radius));
            System.out.println("Enter the radius for cylinder: ");
            radius = sc.nextFloat();
            System.out.println("Enter the height for cylinder: ");
            float height = sc.nextFloat();
            System.out.println("The volume of cylinder is " + cylinder(radius, height));
            System.out.println("Enter the radius for cone: ");
            radius = sc.nextFloat();
            System.out.println("Enter the height for cone: ");
            height = sc.nextFloat();
            System.out.println("The volume of cone is " + cone(radius, height));
            System.out.println("Enter the length for cube: ");
            float length = sc.nextFloat();
            System.out.println("The volume of cube is " + cube(length));
            System.out.println("Enter the length for rectangular prism: ");
            length = sc.nextFloat();
            System.out.println("Enter the width for rectangular prism: ");
            float width = sc.nextFloat();
            System.out.println("Enter the height for rectangular prism: ");
            height = sc.nextFloat();
            System.out.println("The volume of rectangular prism is " + rectangularPrism(length, width, height));
            System.out.println("Enter the length for rectangular pyramid: ");
            length = sc.nextFloat();
            System.out.println("Enter the width for rectangular pyramid: ");
            width = sc.nextFloat();
            System.out.println("Enter the height for rectangular pyramid: ");
            height = sc.nextFloat();
            System.out.println("The volume of rectangular pyramid is " + rectangularPyramid(length, width, height));
        } catch (Exception e) {
          e.printStackTrace();  
          System.out.println("Scanner has thown an error");
        }
    }
}
/*
 * volume of sphere = (4/3) * pi (3.14) * r * r * r ;
 * volume of cube = r ^ 3;
 * volume of cuboid = L * b * h;
 * volume of cone = pi * r * r * h/3;
 */