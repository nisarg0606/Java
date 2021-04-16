package VSITR;
abstract class Animal1 {
    boolean vegetarian;
    int runningSpeed;
    String animalName;

    Animal1(boolean v, int r, String n) {
        vegetarian = v;
        runningSpeed = r;
        animalName = n;
    }

    abstract void display();
}

class Carnivorous extends Animal1 {
    Carnivorous(boolean a, int b, String c) {
        super(a, b, c);
    }

    void display() {
        System.out.println("Speed of Carnivorous Animal " + animalName + " is " + runningSpeed);
    }
}

class Vegetarian extends Animal1 {
    Vegetarian(boolean a, int b, String c) {
        super(a, b, c);
    }

    void display() {
        System.out.println("Speed of Vegetarian Animal " + animalName + " is " + runningSpeed);
    }
}

public class Abstract {
    public static void main(String args[]) {
        Carnivorous lion = new Carnivorous(false, 100, "Lion");
        Vegetarian cow = new Vegetarian(false, 30, "Cow");
        lion.display();
        cow.display();
    }
}