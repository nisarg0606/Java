package RahulSir.ThreadDemo;

public class ThreadUsingImplementsRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Start run using Runnable");
        System.out.println("1st statement of run using Runnable");
        System.out.println("2nd statement of run using Runnable");
        System.out.println("3rd statement of run using Runnable");
        System.out.println("4th statement of run using Runnable");
        System.out.println("5th statement of run using Runnable");
        System.out.println("Exit run using Runnable");
    }
    public static void main(String[] args) {
        System.out.println("Start main");
        System.out.println("1st of main");
        System.out.println("Thread Name: "+Thread.currentThread().getName());
        ThreadUsingImplementsRunnable r = new ThreadUsingImplementsRunnable();
        Thread thread = new Thread(r);
        thread.start();
        // System.out.println(Thread.currentThread().getName());
        System.out.println("2nd of main");
        System.out.println("3rd of main");
        System.out.println("4th of main");
        System.out.println("5th of main");
        System.out.println("Exit main");
    }
}