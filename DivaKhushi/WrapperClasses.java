package DivaKhushi;
/*
    Wrapper class in Java provides the mechanism to convert primitive data types into objects 
    and vice versa.
    what are primitive data types in Java?
    byte, short, int, long, float = 0f, double = 0d, char, boolean

    Since J2SE 5.0, Java provides the wrapper classes for all the primitive data types
    and they are known are autoboxing and unboxing.
*/
//AutoBoxing example of int to Integer

//example of primitive to wrapper class
public class WrapperClasses {
    public static void main(String[] args) {
        int a = 20;
        Integer b = Integer.valueOf(a);//converting int to Integer Expicitly
        Integer j = a;//autoboxing, now compiler will write Integer.valueOf(a) internally

        System.out.println(a + " " + b + " " + j);
    }
}
class Primitiveclass{

    // example of wrapper class to primitive
    public static void main(String[] args) {
        Integer a = new Integer(40);    
        int c = a.intValue();//converting Integer to int explicitly
        int j = a;//unboxing, now compiler will write a.intValue() internally 
        System.out.println(a + " " + c + " " + j);  
        byte b= 2;
        short s= 3;
        int i= 4;
        long l= 5;
        float f= 6.0f;
        double d= 7.0;
        char ch= 'a';
        boolean bl= true;

        //Autoboxing: Converting primitive to wrapper class
        Byte byteobj = b;

        //Printing the objects:
        System.out.println("Byte Object: " + byteobj);


        //Unboxing: Converting wrapper class to primitive
        byte bytevalue = byteobj;


        //Print Primitive value:
        System.out.println("Byte value: " + bytevalue);
    }
}