import java.util.Scanner;

class reyaansh {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int num;
		int i=0;
		System.out.println("Enter the number you want the table of ");
		num=scr.nextInt();
		while(i<10) {
			System.out.println(num+"x"+i+"=");
			i++;
		}
		scr.close();
	}
}



/*
	enter starting number: 1
	enter ending number: 10
	1 x 1 = 1
	......
	1 x 10 = 10

	2 X 1 = 2
	.....
	2 X 10 = 20

	3 X 1 = 3
	.....
	3 X 10 = 30
	.........
	......
	10 X 10 = 100
*/
