package RahulSir.ThreadDemo;

public class JoinMethodwithflavor {
    public static void main(String[] args) {
        RunmethodofSleep t1 = new RunmethodofSleep();
        RunmethodofSleep t2 = new RunmethodofSleep();
        RunmethodofSleep t3 = new RunmethodofSleep();
        t1.start();
        try {
            t1.join(1500);
            // System.out.println("Completed Thread 0");
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        t2.start();
        t3.start();
    }
}