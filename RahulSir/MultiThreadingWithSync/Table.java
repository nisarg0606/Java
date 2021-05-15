package RahulSir.MultiThreadingWithSync;

public class Table 
{
	public synchronized void printTable(int no) 
	{
		for (int i = 1; i <=10; i++) 
		{
			System.out.println(no + " * " + i + " = " + (no*i));
			try 
			{
				Thread.sleep(500);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}