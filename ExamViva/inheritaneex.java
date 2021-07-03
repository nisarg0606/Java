package ExamViva;

class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}

class BabyDog extends Dog {
    void weep() {
        System.out.println("weeping...");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("meowing...");
    }
}

class C {
    public void disp() {
        System.out.println("C");
    }
}

class A extends C {
    public void disp() {
        System.out.println("A");
    }
}

class B extends C {
    public void disp() {
        System.out.println("B");
    }

}

class D extends A {
    public void disp() {
        System.out.println("D");
    }
}
interface one {
    public void print_ex();
}
 
interface two {
    public void print_for();
}
 
interface three extends one, two {
    public void print_ex();
}
class child implements three {
    @Override public void print_ex()
    {
        System.out.println("Exams");
    }
 
    public void print_for() { System.out.println("Are"); }
}

class TestInheritance {
    public static void main(String args[]) {
        Dog d = new Dog();// single level inheritance
        d.bark();
        d.eat();
        BabyDog bd = new BabyDog(); // multilevel inheritance
        bd.weep();
        bd.bark();
        bd.eat();
        Cat c = new Cat(); // Hierarchical Inheritance
        c.meow();
        c.eat(); // this will call eat method of animal
        child ch = new child();//Multiple Inheritance with interface
        ch.print_ex();
        ch.print_for();
        ch.print_ex();
        D obj = new D(); // Hybrid Inheritance
        obj.disp();
    }
}
