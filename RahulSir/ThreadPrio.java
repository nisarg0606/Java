package RahulSir;

class L extends Thread
{
    public void run()
    {
        System.out.println("threadA Stared");
        for (int i = 1; i <= 5; i++) {
            System.out.println("\tFrom Thread A: i = "+i);
        }
        System.out.println("Exit from A");
    }
}

class M extends Thread
{
    public void run()
    {
        System.out.println("Thread B Stared");
        for (int i = 1; i <= 5; i++) {
            System.out.println("\tFrom Thread B: j = "+i);
        }
        System.out.println("Exit from B");
    }
}

class N extends Thread
{
    public void run()
    {
        System.out.println("Thread C Stared");
        for (int i = 1; i <= 5; i++) {
            System.out.println("\tFrom Thread C: K = "+i);
        }
        System.out.println("Exit from C");
    }
}
public class ThreadPrio {
    public static void main(String[] args) {
        L threadA = new L();
        M threadB = new M();
        N threadC = new N();

        threadC.setPriority(Thread.MAX_PRIORITY);
        threadB.setPriority(threadA.getPriority()+1);
        threadA.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Start From A");
        threadA.start();

        System.out.println("Start From B");
        threadB.start();
        
        System.out.println("Start From C");
        threadC.start();

        System.out.println("End of main thread");
    }
}
