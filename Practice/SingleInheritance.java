package Practice;

class A{
    void greet()
    {
        System.out.println("HEllo this is Class A..");
    }
}


class B extends A{
    void meet()
    {
        System.out.println("This is class B");
    }
}


public class SingleInheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.greet();
        obj.meet();
    }
}

class Test{
    static String name = "Nisarg";
};

class Test1{
 public static void main(String[] args) {
     System.out.println(Test.name);
     String s="Hello";
     s = "World";
        System.out.println(s);
 }
}