package OCJP;

class Animal1{  
    void eat(){System.out.println("eating...");}  
    }  
    class Dog1 extends Animal1{  
    void bark(){System.out.println("barking...");}  
    }  
    class Cat extends Animal1{  
    void meow(){System.out.println("meowing...");}  
    }  
    class TestInheritance3{  
    public static void main(String args[]){  
    Cat c=new Cat();  
    c.meow();  
    c.eat();  
    //c.bark();//C.T.Error  
    }}  