package USA_Practice;
//types of polymorsphism
/*
    2 types of polymorphism
    1. compile time polymorsphism ==> function overloading or operator Operloading but in java operator 
    overloading is not suppored.... why??? because java doesn't supports those stuff which creates ambuigity
    
    
    function overloading???
    muliply(int a, int b)
    muliply(float a, float b)
    2. Run time Polymorphism
    ==> operator overriding(no operator overriding)
    there is only method overriding
    A --> parent
    B --> child
*/
class Parent{
    void display()
    {
        System.out.println("This is the display method of Parent");
    }
}

class Child extends Parent
{
    static void childmethod()
    {
        System.out.println("This is child method");
    }
    void display()
    {
        System.out.println("This is the display method of child");
    }

    int add()
    {
        return 1;
    }
    public static void main(String[] args) {
        Child obj = new Child();
        Parent obj1 = new Child();
        obj1.display();
        // obj1.childmethod();
        obj1 = new Parent();
        obj1.display();
        Child.childmethod();
        // Child.main(args);
        System.out.println(obj.add());
        // System.out.println(args[0]);
        // System.out.println(args[1]);
        // System.out.println(args[2]);
    }
}


class Overriding{// overriding
    public static void main(String[] args) {
        // Child obj = new Parent();
        Parent obj = new Child();
        obj.display();
        // obj.childmethod(); // this method cannot be accessed by parent as parent don't have that method of same name 
        obj = new Parent();
        obj.display();

    }
}


class Overloading{
    public static void main(String[] args) {
        System.out.println("This is the main method of overloading");
    }
}