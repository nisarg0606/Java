package OCJP;

public class FunOverloading1 
{
	public int add(int no1,int no2) 
	{
		System.out.println("int - Two Arguments");
		return (no1+no2);
	}
	public double add(double no1,double no2) 
	{
		System.out.println("double - Three Arguments");
		return (no1+no2);
	}
	public static void main(String[] args) 
	{	
		FunOverloading1  obj = new FunOverloading1();
		
		int twoAns = obj.add(10, 12);
		System.out.println("Addition : " + twoAns);
		
		double threeAns = obj.add(10.54, 12.54);
		System.out.println("Addition : " + threeAns);
	}
}