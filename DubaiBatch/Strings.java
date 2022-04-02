package DubaiBatch;

public class Strings {
    public static void main(String[] args) {
        char ch[] = { 'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd' };
        String s = new String(ch);
        String s1 = "PrAtHam";
        String s2 = "PRATHAM";
        // s1 = s1.concat(" Shah");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s2.toLowerCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s1.equalsIgnoreCase(s2)); // equals method check if they are of same
        // object or not
        if (s1 == s2) {
            System.out.println("Equals");
        } else {
            System.out.println("Not equals");
        }
    }// string class do provide you many methods that are really usefull---> compare,
     // touppermethod, tolowercase
     // length, replace
     // String literal

    // why strings are immutables
    // thread safe behaviour
    // security
    // space heap --> heap hdd sdd minimum manner

    // equals() difference between all of this
    // ==
    // compareto
}
