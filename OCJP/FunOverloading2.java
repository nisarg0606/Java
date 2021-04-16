package OCJP;

public class FunOverloading2 {
	public int add(int no1,int no2) 
	{
		System.out.println("int - Two Arguments");
		return (no1+no2);
	}
	// public double add(int no1,int no2) // C.E---> ambiguity due to changing return Type only
	// {
		// System.out.println("double - Three Arguments");
		// return (no1+no2);
	// }
	public static void main(String[] args) 
	{	
		FunOverloading2  obj = new FunOverloading2();
		
		int twoAns = obj.add(10, 12);
		System.out.println("Addition : " + twoAns);
		
		double threeAns = obj.add(10, 12);
		System.out.println("Addition : " + threeAns);
	}
}