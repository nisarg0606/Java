package RahulSir;

import java.util.Scanner;

public class StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        sc.close();
        int count = 0;
        char ch[] = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ch[i]= s.charAt(i);  
              if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                  count++;  
            }
        System.out.println("Total words in the string are " + count);
    }
}
