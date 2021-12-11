package USA_Practice;

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}


class Dog extends Animal
{
    void bark()
    {
        System.out.println("Dog is Barking");
    }
}

/**
 * SingleInheritance
 */
public class SingleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}