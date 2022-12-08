package aarsh;

public class Inheritance {
    public static void main(String[] args) {
        // will only create object of chile class i.e. BabyDog
        BabyDog babyDog = new BabyDog();
        babyDog.bark();
        babyDog.eat();
        babyDog.sleep();
        babyDog.weep();
        
        // multi-level inheritance
    PuppyDog puppyDog = new PuppyDog();
    puppyDog.bark();
    puppyDog.eat();
    puppyDog.sleep();
    puppyDog.weep();
    puppyDog.Kiddo();
    }
}


class MaleDog{
    public void bark(){
        System.out.println("Male Dog Barking...");
    }

    public void eat(){
        System.out.println("Male Dog Eating...");
    }

    public void sleep(){
        System.out.println("Male Dog Sleeping...");
    }
}

class FemaleDog{
    public void bark(){
        System.out.println("Female Dog Barking...");
    }

    public void eat(){
        System.out.println("Female Dog Eating...");
    }

    public void sleep(){
        System.out.println("Female Dog Sleeping...");
    }
}
class BabyDog extends MaleDog{ // Single Inheritance can be implemented using extends keyword
    public void weep(){
        System.out.println("Baby Dog Weeping...");
    }
}


// Multi-level Inheritance
class PuppyDog extends BabyDog{
    public void Kiddo(){
        System.out.println("Puppy Dog Kiddo...");
    }
}

class Animal{// mummy pappa
    void eat()
    {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{ // aarsh
    void bark()
    {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal{ //chirasvi
    void meow()
    {
        System.out.println("Cat is meowing");
    }
}

class MainMethodExe{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // parent class method
        dog.bark();
        Cat cat = new Cat();
        cat.eat(); // parent class method
        cat.meow();
    }
}