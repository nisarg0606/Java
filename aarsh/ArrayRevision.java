package aarsh;

import java.util.Scanner;

public class ArrayRevision {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many elements you want to enter: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		System.out.println("The sum of the elements of the array is: " + sum);
	}
}

class StringArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many elements you want to enter: ");
		int n = sc.nextInt();
		String arr[] = new String[n];
		String sum = "";
		for(int i = 0; i < n; i++) {
			arr[i] = sc.next();
			sum = sum  + arr[i];
		}
		System.out.println("The sum of the string array is: " + sum);
	}
}
