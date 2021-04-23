package Practice.Isha;

public class Threadtesting extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println('x');
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Q42 {
    public static void main(String[] args) {
        Threadtesting t1 = new Threadtesting();
        Threadtesting t2 = new Threadtesting();
        Threadtesting t3 = new Threadtesting();
        Threadtesting t4 = new Threadtesting();
        Threadtesting t5 = new Threadtesting();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException E) {
            System.out.println(E);
        }
        System.out.println("hello");
    }
}
