package Devam;

class Animal {
    public void Message() {
        System.out.println("Method of Animal Class");
    }

    String a = "This is Varible of Animal Class";
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }

    public static void main(String[] args) {
        Dog obj = new Dog(); // by creating the object of (dog) child class I can access all
        // the public properies of (animal) parent class
        System.out.println(obj.a);
        obj.Message();
        obj.bark();
    }
}