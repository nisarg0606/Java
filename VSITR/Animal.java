package VSITR;
class Animal {
    public void animalSound(String s)
    {
    }
}
class Pig extends Animal{
    String s;
    public void animalSound()
    {
        this.s = "Oinks";
        System.out.println("The pig sounds: "+this.s);
    }
}

class Cat extends Animal{
    String s;
    public void animalSound()
    {
        this.s = "Meouws";
        System.out.println("The Cat sounds: "+this.s);
    }
}

class Dog extends Animal{
    String s;
    public void animalSound()
    {
        this.s = "Barks";
        System.out.println("The Dog sounds: "+this.s);
    }
}

class animalSound{
    public static void main(String[] args) {
        Pig p = new Pig();
        Cat c = new Cat();
        Dog d = new Dog();
        p.animalSound();
        c.animalSound();
        d.animalSound();
    }
}