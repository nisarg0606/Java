package OCJP;

class Animal {
    void eat() {
        System.out.println("eating....");
    }
}

class Dog extends Animal {
    void barK() {
        System.out.println("barking....");
    }
}

class Babydog extends Dog {
    void weep() {
        System.out.println("Weeping....");
    }
}

public class Multilevelnheritance {
    public static void main(String[] args) {
        Babydog d = new Babydog();
        d.weep();
        d.barK();
        d.eat();
    }
}