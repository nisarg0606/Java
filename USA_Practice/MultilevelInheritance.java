package USA_Practice;
class Animal{
    void eating()
    {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    void bark()
    {
        System.out.println("Dog is Barking");
    }
}

class BabyDog extends Dog{
    void babydog()
    {
        System.out.println("Baby Dog is Barking");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        BabyDog bd = new BabyDog();
        bd.babydog();
        bd.bark();
        bd.eating();
    }
}
