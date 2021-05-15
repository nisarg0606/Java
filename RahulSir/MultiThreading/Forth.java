// program by runnable method 
package RahulSir.MultiThreading;

public class Forth {
    public static void main(String[] args) {
        System.out.println("By runnable-----");
        Runnable r1 = new Runnable(){
            @Override
            public void run() {
                System.out.println("Task 1 done -"+ Thread.currentThread().getName());
            }
        };
        Runnable r2 = new Runnable(){
            @Override
            public void run() {
                System.out.println("Task 2 done -"+ Thread.currentThread().getName());
            }
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        
        t1.start();
        t2.start();
    }
}
