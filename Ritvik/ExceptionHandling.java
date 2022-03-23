package Ritvik;

public class ExceptionHandling {
    public static void main(String[] args) {
        // exception is a abnormal normal
        // we need to handle the abnormal contions
        // -1 0 1 status code of exit
        // nullpointerexception classnotfoundexception IOException MathException
        // NumberFormat Exception
        /*
         * 3 types of excpetions
         * 1. Checked Exception
         * 2. Unchecked Exception
         * 3. Errors
         */
        System.out.println("Before Try block");
        try {
            String s = null;
            // int a = 100 / 0;
            // int array[] = new int[] { 1, 2, 3, 4 };
            // System.out.println(array[5]);
            System.out.println(s);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You accessed a wrong index.....");
        }
        System.out.println("After Catch Block");
    }
}

class MoreExampleOfException {
    // MoreExampleOfException() {
    // String id = null;
    // }

    // public String id() {
    // return this.id();
    // }

    public static void main(String[] args) {
        String test = null;
        // String test1 = "ritvik";
        // String test2 = "Ritvik";

        try {
            if (test.equals("ritvik"))
                System.out.println("Same");
            else
                System.out.println("Not same");
        } catch (NullPointerException e) {
            System.out.println("You checked for null Value... Your String doen't have any value assigned");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Final Code Executed....");
        }
    }

}
