package RahulSir;

class Parent{
    int x,y,z;
    public Parent(){
        System.out.println("This is known as default constructor.");
    }
    void superDisplay(){
        System.out.println("This is the display of super class.");
    }
}

/**
* child extends Parent
 */
class Child extends Parent {
    public Child() {
        super();
        System.out.println("Whatever");
        super.x=34;
        super.superDisplay();
    }    
}

public class SuperExample {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.getClass();
    }    
}
