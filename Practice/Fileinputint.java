package Practice;

import java.io.*;
import java.util.Scanner;
class c {
    public static void main(String arg[]) throws Exception
	{ 
        Scanner sc = new Scanner(System.in);
        // System.out.print();
		FileWriter f=new FileWriter("C.txt",true);
		BufferedWriter b=new BufferedWriter(f);
		System.out.print("Enter s1:- ");
        int s1 = sc.nextInt();
		System.out.print("Enter s2:- ");
        int s2 = sc.nextInt();
        int ans = s1 + s2;
        String aString = String.valueOf(ans);
		b.write("ans: "+ aString+"\n");
		b.close();
        sc.close();
	}
}