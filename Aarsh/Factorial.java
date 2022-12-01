package Aarsh;

public class Factorial { // this is class
    public int FactorialMethod(int n) // this is method
    {
        int fact = 1;
        while(n > 0)
        {
            fact = fact * n;
            n = n - 1;
        }
        return fact;
    }

    public static void main(String[] args) { // this is main method
        Factorial factorial = new Factorial();
        System.out.println("Factorial of 10 is: " + factorial.FactorialMethod(10));
    }
}
