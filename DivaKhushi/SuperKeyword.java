package DivaKhushi;

class Animal{
    String color = "White";
}

class Dog extends Animal
{
    String color = "Black";
    void printcolor()
    {//keyword known as super --> is used to denote the varibles or method or anything else related to parent
        System.out.println("The color of the parent is: " + super.color);
        System.out.println("The color of the child is: " + color);
    }
}
//define: super--> The super keyword is a reference variable which is used to refer the immediate parent class 
public class SuperKeyword {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printcolor(); 
    }
}
