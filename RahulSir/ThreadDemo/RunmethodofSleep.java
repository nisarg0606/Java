package RahulSir.ThreadDemo;

public class RunmethodofSleep extends Thread{
    @Override
    public void run()
    {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i+"-"+Thread.currentThread().getName());
        }
    }
}