package OCJP;
public class Ambigity 
{
	void sum(int a, long b) 
	{
		System.out.println("a method invoked");
	}

	void sum(long a, int b) 
	{
		System.out.println("b method invoked");
	}

	public static void main(String args[]) 
	{
		Ambigity obj = new Ambigity();
		// obj.sum(20, 20);// C.E----> now ambiguity
        System.out.println(obj);
    }
}