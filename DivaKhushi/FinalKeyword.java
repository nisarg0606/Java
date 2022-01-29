package DivaKhushi;
public class FinalKeyword {
    final int speed;
    FinalKeyword(int speed)// you can initialize the final variable in the constructor
    {
        this.speed = speed;
    }
    void run(){
        // speed = 500;//Final variable cannot be reassigned
        System.out.println("The speed is: "+speed);
    }

    public static void main(String[] args) {
        FinalKeyword obj = new FinalKeyword(100);
        obj = new FinalKeyword(200);// you can reassign the object
        obj.run();
    }
}


/*final*/ class Bike{
    final void run()// you can inherit the final method but you cannot override it
    {
        System.out.println("The bike is running");
    }
}

class Honda extends Bike{// Final class cannot be inherited
    // void run()// final method cannot be overridden
    void running()
    {
        System.out.println("The bike is running at 100 kmph");
    }

    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.run();
    }
}
/*
    Final Keyword:
    The final keyword is used to restrict the change of a variable after its initial assignment.
    Final can be:
    1. Method
    2. Class
    3. Variable

*/