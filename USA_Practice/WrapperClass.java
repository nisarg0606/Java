package USA_Practice;

public class WrapperClass {
    public static void main(String[] args) {
        // what is the meaning of wrapper/ wrap?    
        // wrapper Classes are that which helps you to convert primitive data types to objects...
        // int char string boolean float short long double
        // Integer Character String Boolean Float Short Long Double
        // autoboxing and unbloxing....
        // Autoboxing
        int a = 20; // primitive data type to Object
        Integer i = Integer.valueOf(a); // before java 5.0 you need to call this explicity
        Integer j = a;
        System.out.println(a + "    " + i + "   " + j);

        float b = 20.50f;
        // Autoboxing
        Float obj = b;
        System.out.println(obj);
        // Unbloxing
        float f = obj;
        System.out.println(f);

    }
}
