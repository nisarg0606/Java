package VSITR;

abstract class Myclass {
    abstract double calculate(int x);
}

class Sub1 extends Myclass {
    @Override
    double calculate(int x) {
        double t;
        double sqrtroot = x / 2;
        do {
            t = sqrtroot;
            sqrtroot = (t + (x / t)) / 2;
        } while ((t - sqrtroot) != 0);
        return sqrtroot;
    }
}

class Sub2 extends Myclass{
    @Override
    double calculate(int x) {
        return Math.sqrt(x);
    } 
}

class Sub3 extends Myclass{
    @Override
    double calculate(int x) {
        x = x*x*x;
        return x;
    }
}
class abstractClassImp {
    public static void main(String[] args) {
        Myclass c;
        c = new Sub1();
        System.out.println("The SquareRoot of 25 is "+c.calculate(25));
        c = new Sub2();
        System.out.println("The SquareRoot of 25 is "+c.calculate(25));
        c = new Sub3();
        System.out.println("The Cube of 3 is "+c.calculate(3));
    }
}