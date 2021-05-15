package RahulSir.MultiThreadingWithSync;

public class MultiThreadingUsingAnonymous {
    public static void main(String[] args) {
        final Table obj = new Table();
        Thread t1 = new Thread(){
            @Override
            public void run() {
                obj.printTable(10);
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                obj.printTable(20);
            }
        };

        t1.start();
        t2.start();
    }
}
