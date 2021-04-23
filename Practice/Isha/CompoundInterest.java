package Practice.Isha;
import java.util.Scanner;
public class CompoundInterest {
    public static double IntegerCalc(double P, double r, double n, double t) {
        double temp = (1+(r/n));
        double temp2 = (n*t);
        double Intereset = P*(Math.pow(temp, temp2));
        return  Intereset;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter P: ");
        double P = sc.nextDouble();
        System.out.print("Enter R: ");
        double R = sc.nextDouble();
        System.out.print("Enter N: ");
        double N = sc.nextDouble();
        System.out.print("Enter T: ");
        double T = sc.nextDouble();
        System.out.println("A = "+IntegerCalc(P, R, N, T)); 
        sc.close();
    }
}
