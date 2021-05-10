package RahulSir.ThreadDemo;

public class FirstThread extends Thread{
    @Override
    public void run() {
        System.out.println("Start run");
        System.out.println("1st statement of run");
        System.out.println("2nd statement of run");
        System.out.println("3rd statement of run");
        System.out.println("4th statement of run");
        System.out.println("5th statement of run");
        System.out.println("Exit run");
    }

    public static void main(String[] args) {
        System.out.println("Start main");
        System.out.println("1st of main");
        FirstThread t = new FirstThread();
        t.start();
        System.out.println("2nd of main");
        System.out.println("3rd of main");
        System.out.println("4th of main");
        System.out.println("5th of main");
        System.out.println("Exit main");
    }
}