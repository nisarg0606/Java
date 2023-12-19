package aarsh;

// public class MethodOverriding {
//     public static void main(String[] args) {
//         Animal ani = new Dog();
//         ani.sound();
//     }
// }

class Animalxyz {
    void sound() {
        System.out.println("animal is honking....");
    }
}

class Dogxyz extends Animalxyz {
    void sound() {
        System.out.println("Dog is barking...");
    }

    public static void main(String[] args) {
        Animalxyz obj = new Dogxyz();
        obj.sound();
    }
}
