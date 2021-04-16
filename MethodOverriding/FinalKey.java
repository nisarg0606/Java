package MethodOverriding;

class Bike{
    final void run()
    {
        System.out.println("Running....");
    }
}
public class FinalKey extends Bike{
    final int no1;
    FinalKey()
    {
        no1 = 20;
        System.out.println("Final no1 using construtor: "+no1);
    }
    public static void main(String[] args) {
        new FinalKey().run();
        FinalKey ob = new FinalKey();
        System.out.println("The final Variable: "+ob.no1);
        // new FinalKey();
    }
}
