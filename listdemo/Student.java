package listdemo;

import java.util.Scanner;

	public class Student{
		private int no;
		private String name;
		private int std;
	
	public Student(){
		
	}
	public Student(int no, String name, int std){
		super();
		this.no=no;
		this.name=name;
		this.std=std;
		
	}
	public void scan(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no:");
		no =sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name:");
		name= sc.nextLine();
		System.out.println("Enter Std:");
		std= sc.nextInt();	
		sc.close();
	}
	public void update(){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Name : ");
			name = sc.nextLine();
			System.out.println("Enter Std : ");
			std = sc.nextInt();
			sc.close();
	}
	public int getNo(){
		return no;
	}
	public void setNo(int no){
		this.no=no;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getStd(){
		return std;
	}
	public void setStd(int std){
		this.std=std;
	}
}