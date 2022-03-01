package DivaKhushi;

public class StringCaseFunctions {
    public static void main(String[] args) {
        String str = "KHUSHI";// A -> 65 and a-> 97
        String str1 = "khushi"; // Khushi and khushi --> KhushiSheth123 --> khushisheth123 -> gmail instagram
        System.out.println(str.compareTo(str1));
        String str2 = str.toLowerCase();

        System.out.println(str2);
        System.out.println(str1);
        if (str1.equalsIgnoreCase(str)) {
            System.out.println("Both strings are same.");
        }

        System.out.println(str1.toUpperCase());
        System.out.println(str1.replace("k", "u"));
        System.out.println(str1);
    }
}// java.lang package --> This is the package which is by default imported in
 // java