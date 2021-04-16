package VSITR;
class Bank1 {
    double getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank1 {
    @Override
    double getRateOfInterest() {
        return 7;
    }
}

class ICICI extends Bank1 {
    @Override
    double getRateOfInterest() {
        return 7.5;
    }
}

class Axis extends Bank1 {
    @Override
    double getRateOfInterest() {
        return 7.75;
    }
}

class BankFinal{
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        Axis a = new Axis();
        System.out.println("The rate of interest in SBI Bank is "+s.getRateOfInterest());
        System.out.println("The rate of interest in ICICI Bank is "+i.getRateOfInterest());
        System.out.println("The rate of interest in Axis Bank is "+a.getRateOfInterest());
    }
}