package RahulSir;

class F extends Thread{
    public void run(){
        for (int i = 1; i < 5; i++) {
            if (i == 1) 
            Thread.yield();
            System.out.println("\tFrom Thread A: i = "+i);
        }
        System.out.println("Exit from A ");
    }
}
class G extends Thread{
    public void run(){
        for (int j = 1; j < 5; j++) {
            System.out.println("\tFrom Thread A: j = "+j);
            if (j == 3) {
                // stop();
            }
        }
        System.out.println("Exit from B ");
    }
}
class H extends Thread{
    public void run(){
        for (int k = 1; k < 5; k++) {
            System.out.println("\tFrom Thread A: k = "+k);
            if (k == 1) {
                try {
                    sleep(10000);
                } catch (Exception e) {
                    
                }
            }
        }
        System.out.println("Exit from C ");
    }
}
public class ThreadMethods {
    public static void main(String[] args) {
    G threadG = new G();
    H threadH = new H();
    F threadF = new F();
    System.out.println("Start thread A");
    threadF.start();
    System.out.println("Start thread B");
    threadG.start();
    System.out.println("Start thread C");
    threadH.start();
    System.out.println("End of main thread");
    }    
}