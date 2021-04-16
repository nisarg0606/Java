package Abstraction;

abstract class Bank {
    public abstract double getRointrst();
}

class AxisBank extends Bank {

    @Override
    public double getRointrst() {
        return 7;
    }
}

class SbiBank extends Bank {

    @Override
    public double getRointrst() {
        return 5;
    }

}

class BoiBank extends Bank {

    @Override
    public double getRointrst() {
        return 9;
    }
}

public class Banks {
    public static void main(String[] args) {
        Bank bank = new AxisBank();
        System.out.println(bank.getRointrst() + "-bank.getRointrst()");
        bank = new BoiBank();
        System.out.println(bank.getRointrst() + "-bank.getRointrst()");
        bank = new SbiBank();
        System.out.println(bank.getRointrst() + "-bank.getRointrst()");
    }
}