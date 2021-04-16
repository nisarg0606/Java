package RahulSir;

class AA extends Thread
{
    public void run()
    {
        System.out.println("This is thread A\t Thread ID: "+ Thread.currentThread().getId()+
        "\tThread Priority: "+Thread.currentThread().getPriority());
    }
} 
class BB extends Thread
{
    public void run()
    {
        System.out.println("This is thread B\t Thread ID: "+ Thread.currentThread().getId()+
        "\tThread Priority: "+Thread.currentThread().getPriority());
    }
} 
class CC extends Thread
{
    public void run()
    {
        System.out.println("This is thread C\t Thread ID: "+ Thread.currentThread().getId()+
        "\tThread Priority: "+Thread.currentThread().getPriority());
    }
} 
public class GetPrio {
    public static void main(String[] args) {
        AA threadA = new AA();
        BB threadB = new BB();
        CC threadC = new CC();
        threadA.setPriority(Thread.MIN_PRIORITY);
        threadB.setPriority(Thread.NORM_PRIORITY);
        threadC.setPriority(Thread.MAX_PRIORITY);
        System.out.println("\nThis is the main Thread\t Thread ID: "+
        Thread.currentThread().getId() + "\tThread Priority: " + Thread.currentThread().getPriority() +"\n");
        System.out.println("Let's call the other threads in the sequence A->B->C\n");
        threadA.start();
        threadB.start();
        threadC.start();
    }
}