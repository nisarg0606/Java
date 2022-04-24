package USA_Practice.MultiThreading;

public class SleepAndRunVsStart implements Runnable {
    public void run() {
        for (int i = 1; i < 25; i++) {
            try {
                Thread.sleep(200);
                System.out.println(i);
                System.out.println(i + " h1 " + i);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        SleepAndRunVsStart t1 = new SleepAndRunVsStart();
        Thread th1 = new Thread(t1);
        SleepAndRunVsStart t2 = new SleepAndRunVsStart();
        Thread th2 = new Thread(t2);
        th1.start();
        th2.start();
    }
}
