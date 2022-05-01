package USA_Practice.MultiThreading;

class A extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("\tFrom A : i = " + i);
        }
        System.out.println("Exiting from A....");
    }
}

class B extends Thread{
    @Override
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("\tFrom B : i = " + j);
        }
        System.out.println("Exiting from B....");
    }
}

class C extends Thread{
    @Override
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("\tFrom C : i = " + j);
        }
        System.out.println("Exiting from C....");
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        new A().start();
        new B().start();
        new C().start();
    }
    
}