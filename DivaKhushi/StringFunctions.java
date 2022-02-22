package DivaKhushi;

public class StringFunctions {
    public static void main(String[] args) {
        String s = "Khushi";
        String s2 = "Khushi";// it doesn't create a new instance in the memory
        char ch[] = { 'k', 'h', 'u', 's', 'h', 'i' };
        String s1 = new String(ch);// concats the char array // new keyword to create a new object
        System.out.println(s1);
        System.out.println(s1.hashCode());
        System.out.println(ch.hashCode());
        System.out.println(s.charAt(2));
        System.out.println(s.length());
        String formating = String.format("value of %f is this and after formatting it is: %.2f", 32.34566546f,
                32.34566546f);
        /*
            String it is : %s
            float is : %f
            double : %f --> 4.4d
            int %d
            Hexadecimal value: %x
            char %c
        */
        System.out.println(formating);
        System.out.println(s.substring(2, 4));// first part is inclusive and the last part is exclusive
        System.out.println(s.substring(0));
    }
}
