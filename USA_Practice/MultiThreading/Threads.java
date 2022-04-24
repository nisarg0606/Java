package USA_Practice.MultiThreading;

public class Threads extends Thread {
    public void run() {
        System.out.println("hi, I am inside the thread....");
    }

    public static void main(String[] args) {
        Threads th = new Threads();
        th.start();// th.run()
        // th.start();
        // th.run();
        // th.run();
    }
}
