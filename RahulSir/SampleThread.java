package RahulSir;

class I extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            if(i==3){
                // stop();
            }
            System.out.println(Thread.currentThread().getName());
        }
    }
}
class J extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            if(i==3){
                try {
                    sleep(100);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName());
        }
    }
}

class K extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            if(i==3){
                Thread.yield();
            }
            System.out.println(Thread.currentThread().getName());
        }
    }
}
public class SampleThread {
    public static void main(String[] args) {
        I obj1 = new I();
        J obj2 = new J();
        K obj3 = new K();
        obj1.start();
        obj2.start();
        obj3.start();
    }    
}