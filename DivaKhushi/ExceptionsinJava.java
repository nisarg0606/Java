package DivaKhushi;

public class ExceptionsinJava {
    /*
     * Exceptions in Java
     * 3 types of exceptions
     * 1. checked exceptions
     * 2. unchecked exceptions
     * 3. error
     * 
     * checked exceptions
     *
     * 3. ClassCastException
     * 4.
     * 5. NumberFormatException
     * 6. IOException
     * 7. FileNotFoundException
     * 8. SQLException
     * 
     * 
     * unchecked exceptions
     * ArithmeticException
     * 2. ArrayIndexOutOfBoundsException
     * NullPointerException
     * 
     * 
     * error
     * 1. OutOfMemoryError
     * 2. StackOverflowError --> linked list ArrayList Vector
     * 3. VirtualMachineError -->
     * 4. AssertionError
     * 
     * How to handle errors?
     * 1. try-catch
     * 2. try-catch-finally
     * 3. try-catch-finally-throw
     * 4. Throws
     * 
     */

    public static void main(String[] args) {
        // try {
        // int data = 100 / 0;
        // System.out.println("Hello World!");
        // } catch (ArithmeticException e) {
        // System.out.println("You cannot divide a number by 0");
        // } catch (Exception e) {
        // System.out.println("Exception");
        // }
        // try {
        // String s = null;

        // } catch (NullPointerException e) {
        // System.out.println("You cannot use null");
        // } finally {
        // System.out.println("Finally");
        // System.out.println("I am outside the try-catch block");
        // }

        try {
            String s = "abc";
            int i = Integer.parseInt(s);
            System.out.println(i);

        } catch (NumberFormatException e) {
            System.out.println(e);
            System.out.println("there is no number present in the string");
        }
        /*
         * try{
         * statement 1;
         * statement 2;
         * try{
         * statement 3;
         * statement 4;
         * }catch(Excpetion E)
         * {
         * sysout();
         * }
         * }catch(Exception e1)
         * {
         * sysout();
         * }
         * IndexoutofBound error--> 
         */
    }
}
