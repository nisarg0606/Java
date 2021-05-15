package RahulSir.MultiThreadingWithSync;
//need to make this for using sync with 10
public class MyThread1 extends Thread {
    Table t;

    public MyThread1(Table t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.printTable(10);
    }
}
