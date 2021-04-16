package RahulSir;

class O extends Thread{
    public void run(){
        for(int i = 0; i<5; i++)
        {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

class P extends Thread{
    public void run(){
        for(int i = 0; i<5; i++)
        {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
class Q extends Thread{
    public void run(){
        for(int i = 0; i<5; i++)
        {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
public class Priority {
    public static void main(String[] args) {
        O obO = new O();
        P obP = new P();  
        Q obQ = new Q();
        System.out.println(obO.getPriority());
        System.out.println(obP.getPriority());
        System.out.println(obQ.getPriority());
        obO.setPriority(1);
        obP.setPriority(5);
        obQ.setPriority(10);
        System.out.println(obO.getPriority());
        System.out.println(obP.getPriority());
        System.out.println(obQ.getPriority());
    }
}
