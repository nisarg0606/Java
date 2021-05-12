package RahulSir.ThreadDemo;

public class SleepMethodImplementation {
    public static void main(String[] args) {
        RunmethodofSleep t1 = new RunmethodofSleep();
        RunmethodofSleep t2 = new RunmethodofSleep();
        RunmethodofSleep t3 = new RunmethodofSleep();
        t1.start();
        t2.start();
        t3.start();
    }
}