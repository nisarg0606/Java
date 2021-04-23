package Practice.Isha;
import java.util.Scanner;
abstract class Calculation {
    abstract double area();
}
class Rectangle extends Calculation{
    double area()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int l = sc.nextInt();   
        System.out.print("Enter Bredth: ");
        int b = sc.nextInt();
        sc.close();   
        return l * b;
    }
}
class Triangle extends Calculation
{
    double area()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base: ");
        int l = sc.nextInt();
        System.out.print("Enter Height: ");
        int h = sc.nextInt();
        sc.close();   
        return 0.5*l*h;
    }
}

class Calc{
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        System.out.println("The Area of Rectangle: "+r.area()); 
        System.out.println("The Area of Triangle: "+t.area());
    }
}