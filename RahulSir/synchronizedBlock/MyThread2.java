package RahulSir.synchronizedBlock;
//need to make this for using sync with 20
public class MyThread2 extends Thread{
    PrintTable t;
    public MyThread2(PrintTable t){
        this.t = t;
    }
    @Override
    public void run() {
        t.printTable(20);
    }
}