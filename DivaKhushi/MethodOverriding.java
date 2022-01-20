package DivaKhushi;

class Bank {
    float interest = 100;

    void setInterest(float interest) {
        this.interest = interest;
    }

    void getInterest() {
        System.out.println("The interest is : " + interest);
    }

    float getRateofInterest() {
        return 0;
    }
}

class SBI extends Bank {
    float getRateofInterest() {
        return 12.99f;
    }
}

class Axis extends Bank {
    float getRateofInterest() {
        return 4.5f;
    }
}

class ICICI extends Bank {
    float getRateofInterest() {
        return 6.6f;
    }
}

public class MethodOverriding {// At Runtime

    public static void main(String[] args) {
        Bank bank;
        bank = new SBI();
        // System.out.println(bank.interest);
        System.out.println("The rate of SBI bank is " + bank.getRateofInterest());// overriding
        SBI sbi = new SBI();
        Axis axis = new Axis();
        ICICI icici = new ICICI();
        // System.out.println(icici.interest);
        // ICICI bankobj = new Bank();//This is throwing an error because child cannot
        // create object of parent;
    }
}