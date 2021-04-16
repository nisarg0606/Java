package RahulSir;

/*
    Author: Nisarg Shah
    DOC: 10-12-2020
    Topic: Life Cycle of Thread
*/
class A extends Thread{
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("The Thread name is "+Thread.currentThread().getName());
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("The Thread name is "+Thread.currentThread().getName());
        }
    }
}

class C extends Thread{
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("The Thread name is "+Thread.currentThread().getName());
        }
    }
}

class D extends Thread{
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("The Thread name is "+Thread.currentThread().getName());
        }
    }
}
class E extends Thread{
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("The Thread name is "+Thread.currentThread().getName());
        }
    }
}
public class ThreadImple {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        C obj3 = new C();
        D obj4 = new D();
        E obj5 = new E();
        obj1.start();
        obj2.start();
        obj3.start();
        obj4.start();
        obj5.start();
    }    
}
