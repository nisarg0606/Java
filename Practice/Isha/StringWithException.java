package Practice.Isha;
import java.util.*;
class EqString
{
 public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
     try
      {
       System.out.print("Enter 'internet' String : ");
        String name=sc.nextLine();
        sc.close();
        if(name.equalsIgnoreCase("internet"))
        System.out.print(name + " is equal to 'internet' ");
        else
        throw new NoMatchException(name);
    }
     catch(NoMatchException e1)
      {
        System.out.print("Error : " + e1.getMessage());
      }
  }
}
class NoMatchException extends Exception
 {
  NoMatchException(String msg)
   {
    super(msg + " is not equal to 'internet' ");
   }
}