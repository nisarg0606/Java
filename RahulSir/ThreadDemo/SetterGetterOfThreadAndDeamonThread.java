package RahulSir.ThreadDemo;

public class SetterGetterOfThreadAndDeamonThread extends Thread {
    @Override
    public void run() {
        if (Thread.currentThread().isDaemon())
            System.out.println("Daemon Thread " + Thread.currentThread().getName() + " - Priority: "
                    + Thread.currentThread().getPriority());
        else
            System.out.println("User Thread " + Thread.currentThread().getName() + " - Priority: "
                    + Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        SetterGetterOfThreadAndDeamonThread t1 = new SetterGetterOfThreadAndDeamonThread();
        SetterGetterOfThreadAndDeamonThread t2 = new SetterGetterOfThreadAndDeamonThread();
        SetterGetterOfThreadAndDeamonThread t3 = new SetterGetterOfThreadAndDeamonThread();
        SetterGetterOfThreadAndDeamonThread t4 = new SetterGetterOfThreadAndDeamonThread();
        SetterGetterOfThreadAndDeamonThread t5 = new SetterGetterOfThreadAndDeamonThread();
        SetterGetterOfThreadAndDeamonThread t6 = new SetterGetterOfThreadAndDeamonThread();
    
        t1.setName("1- C");
        t2.setName("2 - C++");
        t3.setName("3 - Java");
        t4.setName("4 - Python");
        t5.setName("5 - Ruby");
        t6.setName("6 - Programming trainer");
        t6.setDaemon(true);

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t4.setPriority(Thread.MAX_PRIORITY);
        t5.setPriority(Thread.NORM_PRIORITY);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();

        // t6.setDaemon(true); this statement will give illegal state exception
    }
}