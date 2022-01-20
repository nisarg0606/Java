package DivaKhushi;

public class MethodOverloading {
    public static void main() {
        System.out.println("This is main method without any parameters");
    }

    public static void main(String s) {
        System.out.println("This is main method with one parameter and you passed" + s + " in the parameters");
    }

    int add() {
        System.out.println("This is add method with 0 parame");
        return 0;
    }

    int add(int a, int b) {
        return a + b;
    }

    void add(int a) {
        System.out.println("This is void add with 1 para");
    }

    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        mo.add();
        mo.add(1);
        System.out.println(mo.add(5, 6));
        mo.main();
        mo.main("Overloaded");
    }
}

/*
 * Polymorphism ==. Run Time Polymorphism, Compile Time Polymorphism
 * overloading overriding
 */


 /*
    do a program for displaying n prime numbers: 
    output:
    tell me the value of n: 100
    display prime numbers between 1 to 100
 
 */