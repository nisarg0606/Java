package OCJP;

public class FunOverloading {
    public int add(int d,int e) 
	{
		System.out.println("Two Arguments");
		return (d+e);
	}
    public int add(int no1,int no2 , int no3) 
	{
		System.out.println("Three Arguments");
		return (no1+no2+no3);
	}

    public static void main(String[] args) {
        FunOverloading obj = new FunOverloading();

        int Ans1 = obj.add(10, 12);
        System.out.println("Addition: "+Ans1);
        
        int Ans2 = obj.add(10, 12, 13);
        System.out.println("Addition: "+Ans2);
    }
	public double add(double d, double e) {
		return 0;
	}
}