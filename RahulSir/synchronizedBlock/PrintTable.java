package RahulSir.synchronizedBlock;

public class PrintTable {
    public void printTable(int no) {
		synchronized(this)
        {
            for (int i = 1; i <= 10; i++) {
                System.out.println(no + " * " + i + " = " + (no * i));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+" Nisarg Shah");
        }
    }
}
