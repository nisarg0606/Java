package OCJP;
//main method overloading
public class Funoverloading3 {
	public static void main(int no) 
	{
		System.out.println("int no -- main");
	}
	public static void main(String name) 
	{
		System.out.println("String name -- main");
	}
	public static void main(char a) 
	{
		System.out.println("char a-- main");
	}
	public static void main(String[] name) 
	{	
		System.out.println("String[] name -- main");
		main("Nisarg");
	}    
}
