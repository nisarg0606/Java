package USA_Practice;
import java.util.Scanner;

class twentyfirstcode {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Please enter the number of elements you want");
		int n = scr.nextInt();
		int arr1[] = new int[n];
        System.out.println("Please enter the elements");
        for(int i = 0; i < n; i++)
        {
            arr1[i] = scr.nextInt();
        }
        System.out.println("The elements are: ");
        for(int i = 0; i < n; i++)
        {
            System.out.println(arr1[i]);
        }
		System.out.println(arr1);                                                                                                      
		int arr2[]= new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]= arr2[i];
		}
			System.out.println("elements of original array");
			for(int i = 0;i<n;i++) {
				System.out.println(arr1[i] + " ");
			}
			
			System.out.println("elements of new array");
			for(int i = 0;i<n;i++) {
				System.out.println(arr2[i] + " ");
			}
		}
	}
