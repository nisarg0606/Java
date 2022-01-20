package DivaKhushi;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of radius: ");
        int r = sc.nextInt();
        System.out.println("The area of circle is "+ Math.PI*r*r);
    }
    int add(int a, int b)
    {
        return a + b;
    }
}
