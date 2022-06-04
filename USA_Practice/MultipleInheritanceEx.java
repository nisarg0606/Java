package USA_Practice;
// is multiple inheritance Supported in java??

// if yes then how to implement that
// if no then wht no??

// Nidish - yes          Reyaans - Yes        Soham- Yes     Milan-Yes

// NO Multiple inheritance is not supported in java!!! Why??? Because Java is a
//  simple language also it is secure one and it reduces the complexicity of the code
/*
 when to us extends and when to use implements 
 --> Implements for interfaces and extends for classes one can extend a single class at
  a paticular time but one class can implement more that 1 interfaces at a time.
*/

// is that any method to do multiple inheritance in java??
// Yes, you can do that using Interfaces..... 
public class MultipleInheritanceEx implements A, B {
    public void eat() {
        A.super.eat();
        B.super.eat();
    }
    public int add(int a)
    {
        return a;
    }

    public static void main(String[] args) {
        MultipleInheritanceEx obj = new MultipleInheritanceEx();
        obj.eat();
    }
}

interface A {
    default void eat() {
        System.out.println("Eat of A");
    }
}

interface B {
    default void eat() {
        System.out.println("Eat of B");
    }
    int add(int a);
}

// one child and 2 parents

// Basic rule of interfaces is that you need to overload each and every method that is written 
//in interface unless it's not default