//single task by multiple thread
package RahulSir.MultiThreading;
public class FirstProgram extends Thread{
    @Override
	public void run() 
	{
		for (int i = 1; i <=10; i++) 
		{
			System.out.println(Thread.currentThread().getName() + " -- " +  5 + " * " + i + " = " + (5*i));
		}
	}
    public static void main(String[] args) {
        FirstProgram t1 = new FirstProgram();
        FirstProgram t2 = new FirstProgram();
        FirstProgram t3 = new FirstProgram();

		t1.start();
		t2.start();
		t3.start();
    }
}