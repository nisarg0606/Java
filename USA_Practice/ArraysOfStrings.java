package USA_Practice;

public class ArraysOfStrings {
    public static void main(String[] args) {
        String arrStr[] = new String[] { "reyaansh", "nidish", "milan", "soham", "kairavy" };
        String cpyStr[] = new String[arrStr.length];
        for (int i = 0; i < arrStr.length; i++) {
            cpyStr[i] = arrStr[i];
        }
        System.out.println("Array After copying is : ");
        for (String string : cpyStr) {
            System.out.print(string + "     ");
        }
    }
}