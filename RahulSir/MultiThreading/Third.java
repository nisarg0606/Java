// program by anonyms method
package RahulSir.MultiThreading;

public class Third {
    public static void main(String[] args) {
        System.out.println("By anonyms--------");
        Thread t1 = new Thread() {
            public void run() {
                System.out.println("Task 1 done..." + Thread.currentThread().getName());
            };
        };
        Thread t2 = new Thread() {
            public void run() {
                System.out.println("Task 2 done..." + Thread.currentThread().getName());
            };
        };
        t1.start();
        t2.start();
    }
}