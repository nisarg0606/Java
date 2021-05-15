package RahulSir.MultiThreadingWithSync;
//need to make this for using sync with 20
public class MyThread2 extends Thread{
    Table t;
    public MyThread2(Table t){
        this.t = t;
    }
    @Override
    public void run() {
        t.printTable(20);
    }
}