package USA_Practice.MultiThreading;
class ThreadExample extends Thread {
    ThreadExample(String threadName) {
        super(threadName);}
    // overriding the run method of thread class
    public void run() {
        System.out.println("This thread is running");
    }}
public class AlternativeofSetName { // what do you mean by static????
    static int MIN_PRIORITY = 1; // minimum priority
    static int NORMAL_PRIORITY = 5; // normal priority
    static int MAX_PRIORITY = 10; // maximum priority
    public static void main(String[] args) {
        ThreadExample th1 = new ThreadExample("Thread1"); // setting the name of the 
        //thread using the super constructor i.e. overridding the Thread Class Constructor
        ThreadExample th2 = new ThreadExample("Thread2");

        ThreadExample th3 = new ThreadExample("Thread3");
        System.out.println("The Name of th1 is " + th1.getName());
        th1.setPriority(MIN_PRIORITY);// setting the priority to 1
        System.out.println(th1.getId());// gettting the id of thread
        System.out.println(th2.getId());
        System.out.println("The Name of th2 is " + th2.getName());
        th1.setName("Thread1BySetmethod");
        th2.setName("Thread2BySetmethod");
        System.out.println("The Name of th1 is " + th1.getName());
        System.out.println("The Name of th2 is " + th2.getName());
        System.out.println("The Name of th3 is " + th3.getName());

        System.out.println("The Current Thread which is executing is: " + Thread.currentThread().getName());// Name of the current
        // thread which is being executed.... 
        System.out.println(th1.getPriority());
    }
}