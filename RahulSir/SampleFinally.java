package RahulSir;

import java.util.Scanner;
public class SampleFinally {
    public static void main(String[] args) {
        try {
            Scanner obj = new Scanner(System.in);
            int x= obj.nextInt();
            System.out.println(x);
            obj.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            System.out.println("This is Finally Block....");
        }
    }
}