package RahulSir.synchronizedBlock;
//need to make this for using sync with 10
public class MyThread1 extends Thread {
    PrintTable t;

    public MyThread1(PrintTable t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.printTable(10);
    }
}
