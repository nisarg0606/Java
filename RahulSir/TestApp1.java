package RahulSir;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Statement 1");
		System.out.println("Statement 2");
		System.out.println("Statement 3");
		System.out.println("Statement 4");
		System.out.println("Statement 5");

		int ans =0;
		try 
		{
			// code---Exception raise
			ans = 10/0;
			
			String name = "Nisarg";
			System.out.println("name.length() :- "+name.length());
			
			
			int value = Integer.parseInt("nisarg001");// NumberFormateException
			System.out.println("value : "+value);
		}
		catch(ArithmeticException e) 
		{
			System.out.println("ArithmeticException catch block");
			e.printStackTrace();
		}		
		catch(NullPointerException e) 
		{
			System.out.println("NullPointerException catch block");
			e.printStackTrace();
		}
		catch(Exception e) 
		{
			System.out.println("Exception catch block");
			e.printStackTrace();
		}

		System.out.println("Addition : " + ans);

		System.out.println("Statement 6");
		System.out.println("Statement 7");
		System.out.println("Statement 8");
		System.out.println("Statement 9");
		System.out.println("Statement 10");
	}
}