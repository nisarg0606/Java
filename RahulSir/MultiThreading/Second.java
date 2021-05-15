//program to perform multiple task by multiple thread
package RahulSir.MultiThreading;
class Resource1 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <=10; i++) 
		{
			System.out.println(Thread.currentThread().getName() + " -- " +  1 + " * " + i + " = " + (1*i));
		}
    }
}
class Resource2 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <=10; i++) 
		{
			System.out.println(Thread.currentThread().getName() + " -- " +  2 + " * " + i + " = " + (2*i));
		}
    }
}
public class Second {
    public static void main(String[] args) {
        Resource1 r1 = new Resource1();
        Resource2 r2 = new Resource2();
        r1.start();
        r2.start();
    }
}
