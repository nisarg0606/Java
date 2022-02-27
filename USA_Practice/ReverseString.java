package USA_Practice;

public class ReverseString {
    public static void main(String[] args) {
        String str = "1234+!#&()&%";
        String rev = "";
        char ch;
        for (int i = str.length() - 1; i >= 0; i--) {
            ch = str.charAt(i);
            rev = rev + ch;
        }
        System.out.println(rev);
    }
}

class ReverseStringByte {
    public static void main(String[] args) {
        String str = "Java is an easy language";
        byte[] input = str.getBytes();

        byte[] result = new byte[input.length];

        for (int i = 0; i < input.length; i++) {
            result[i] = input[input.length - i - 1];
        }

        System.out.println(new String(result));
    }
}