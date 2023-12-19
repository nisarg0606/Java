package aarsh;

public class WrapperClass {
    public static void main(String[] args) {
        // primitive data types
        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40;
        float f = 50.0F;
        double d = 60.0D;
        char c = 'a';
        boolean b2 = true;

        // autoboxing used to convert primitive to wrapper classes directly
        Byte byteobj = b;
        Short shortobj = s;
        Integer intobj = i;
        Long longobj = l;
        Float floatobj = f;
        Double doubleobj = d;
        Character charobj = c;
        Boolean boolobj = b2;

        System.out.println(byteobj);
        System.out.println(shortobj);
        System.out.println(intobj);
        System.out.println(longobj);
        System.out.println(floatobj);
        System.out.println(doubleobj);
        System.out.println(charobj);
        System.out.println(boolobj);

        // unboxing : convert wrapper to primitive data type
        byte bytevalue = byteobj;
        short shortvalue = shortobj;
        int intvalue = intobj;
        long longvalue = longobj;
        float floatvalue = floatobj;
        double doublevalue = doubleobj;
        char charvalue = charobj;
        boolean boolvalue = boolobj;

        System.out.println(bytevalue);
        System.out.println(shortvalue);
        System.out.println(intvalue);
        System.out.println(longvalue);
        System.out.println(floatvalue);
        System.out.println(doublevalue);
        System.out.println(charvalue);
        System.out.println(boolvalue);
    }
}
