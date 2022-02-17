package DivaKhushi;

/*
    How to achive Abstraction in java....
    there are 2 ways to achieve it
        1. Abstract Class ( 0 to 100 %)
        2. Interfaces(100%)


    1. Abstract classes:-
        A class which is declared as abstract is known as abstract class.

        Points to Remember:
            a. An abstract class should be declared with abstractkeyword 
            b. It can have abstract as well as non-abstract methods inside it
            c. It cannot be Initialized.
            d. It can have a constructor and can also have static methods.
            e. It also can have final methods which will force the subclass not to change the body of the method
            */

abstract class Bike {
    int speed;
    String name;
    abstract void running();
    // void speed() {
    //     System.out.println("In speed method");
    // }
}

class Honda4 extends Bike {
    void running() {
        speed = 10;
        System.out.println("Running Safely....");
    }

    public static void main(String[] args) {
        Bike obj = new Honda4();
        obj.running();
    }
}