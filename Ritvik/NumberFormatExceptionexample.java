package Ritvik;

public class NumberFormatExceptionexample {
    public static void main(String[] ritvik) {
        int invalid = 0;
        int number, count = 0;
        for (int i = 0; i < ritvik.length; i++) {
            try {
                number = Integer.parseInt(ritvik[i]);
            } catch (NumberFormatException e) {
                invalid = invalid + 1;
                System.out.println(ritvik[i] + " is not a number");
                continue;
            }
            count = count + 1;
        }
        System.out.println("Valid Numbers = " + count);
        System.out.println("Invalid Numbers = " + invalid);
    }
}
