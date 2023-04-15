import java.util.Scanner;

class Solution {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt(); 
        sc.nextLine();
		String name = sc.nextLine();
		System.out.println("The name of the person is " + name + " and the age is " + age + ".");
	}
}