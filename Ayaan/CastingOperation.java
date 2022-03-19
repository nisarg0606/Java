package Ayaan;

public class CastingOperation {
    public static void main(String[] args) {
        String a = "123.54";
        float b = Float.parseFloat(a); // autoboxing
        int c = (int) b; // casting
        System.out.println(b);
        System.out.println(c);
        // a.charAt(0);
    }
}