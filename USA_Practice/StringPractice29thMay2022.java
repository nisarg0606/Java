package USA_Practice;

import java.util.Scanner;

public class StringPractice29thMay2022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next();
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            System.out.println("Using String Methods");
            System.out.println("The first and last character of string is same so the string will be: "
                    + str.substring(1, str.length() - 1));
        } else {
            System.out.println("The First and the last character of string is not same so the string will be: " + str);
        }
        StringBuffer stringBuffer = new StringBuffer(str);
        if (stringBuffer.charAt(0) == stringBuffer.charAt(stringBuffer.length() - 1)) {
            stringBuffer.deleteCharAt(0);
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
            System.out.println("Using StingBuffer/Builder");
            System.out.println("The first and last character of string is same so the string will be: " + stringBuffer);
        } else {
            System.out.println(
                    "The First and the last character of string is not same so the string will be: " + stringBuffer);
        }
    }
}

class CharacterCheck {
    public String FirstTwoCharacterCheck(String str) {
        if (str.charAt(0) == 'g') {
            if (str.charAt(1) == 'h') {
                return str;
            } else {
                str = str.substring(0, 1) + str.substring(2);
                return str;
            }
        } else if (str.charAt(1) == 'h') {
            str = str.substring(1);
            return str;
        } else {
            return str;
        }
    }

    public static void main(String[] args) {
        CharacterCheck characterCheck = new CharacterCheck();
        System.out.println(characterCheck.FirstTwoCharacterCheck("goat"));
        System.out.println(characterCheck.FirstTwoCharacterCheck("photo"));
        System.out.println(characterCheck.FirstTwoCharacterCheck("ghost"));
    }
}

class ColorCheck {
    public static void main(String[] args) {
        String str = "bird";
        if (str.charAt(0) == 'b' || str.charAt(0) == 'B') {
            try {

                if (str.substring(0, 5).equals("black")) {
                    System.out.println("Black");
                }
            } catch (Exception e) {
            }
        } else if (str.charAt(0) == 'r' || str.charAt(0) == 'R') {
            try {
                if (str.substring(0, 3).equals("red")) {
                    System.out.println("Red");
                }
            } catch (Exception e) {
            }
        } else
            System.out.println("String doesn't not begin with red or black");
    }
}