package MethodOverriding;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog : eat()");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
    }
}