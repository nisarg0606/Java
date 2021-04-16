package RahulSir;

import java.util.Scanner;
class CustomException extends Exception{
    private static final long serialVersionUID = 1L;//writing this so CustomException doesn't give a warning
    public CustomException(String msg) {
        super(msg);
    }
}
public class ExceptionHandling{
    public static void main(String[] args) {
        try {
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter the value of x: ");
            int x = obj.nextInt();
            obj.close();
            if (x%2==0) {
                throw new CustomException("Please  enter an odd number");
            }
        } catch (CustomException e) {     
            System.out.println(e.getMessage());
        }
    }
}