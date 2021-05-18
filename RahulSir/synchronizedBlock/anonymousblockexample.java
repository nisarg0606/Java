package RahulSir.synchronizedBlock;

public class anonymousblockexample {
    public static void main(String[] args) {
        String resource1 = "Nisarg";
        String resource2 = "Shah";
        Thread t1 = new Thread() {
            @Override
            public void run() {
                System.out.println("This is run method of t1");
                synchronized (resource1) {
                    System.out.println("This is resource 1 of 1 i.e. thread 1 locked");
                }
                synchronized (resource2) {
                    System.out.println("This is resource 2 of 1 i.e. thread 1 locked");
                }
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                System.out.println("This is run method of t2");
                synchronized (resource1) {
                    System.out.println("This is resource 1 of 2 i.e. thread 2 locked");
                } 
                synchronized (resource2) {
                    System.out.println("This is resource 2 of 2 i.e. thread 2 locked");
                }
            }
        };
        t1.start();
        t2.start();
    }
}