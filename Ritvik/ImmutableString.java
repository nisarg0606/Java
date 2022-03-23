package Ritvik;

public class ImmutableString {
    public static void main(String[] args) {
        // what do you mean by immutable?
        // it cannot be changed
        // String are immuatable
        String s = "Ritvik";
        s = s.concat("Kannan");
        s = "Rutvik";
        System.out.println(s);
    }
}
