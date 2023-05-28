package leetcode;

import java.util.Map;

public class RomanToInt {
    public int romanToInt(String s) {
        char[] romanLetters = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
        int[] romanValues = { 1, 5, 10, 50, 100, 500, 1000 };
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && s.charAt(i) == 'I' && s.charAt(i + 1) == 'V') {
                result += 4;
                i++;
            } else if (i + 1 < s.length() && s.charAt(i) == 'I' && s.charAt(i + 1) == 'X') {
                result += 9;
                i++;
            } else if (i + 1 < s.length() && s.charAt(i) == 'X' && s.charAt(i + 1) == 'L') {
                result += 40;
                i++;
            } else if (i + 1 < s.length() && s.charAt(i) == 'X' && s.charAt(i + 1) == 'C') {
                result += 90;
                i++;
            } else if (i + 1 < s.length() && s.charAt(i) == 'C' && s.charAt(i + 1) == 'D') {
                result += 400;
                i++;
            } else if (i + 1 < s.length() && s.charAt(i) == 'C' && s.charAt(i + 1) == 'M') {
                result += 900;
                i++;
            } else {
                for (int j = 0; j < romanLetters.length; j++) {
                    if (s.charAt(i) == romanLetters[j]) {
                        result += romanValues[j];
                        break;
                    }
                }
            }
        }
        return result;
    }

    public int romanToInt2(String s) {
        Map<Character, Integer> romanMap = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100,
                'D', 500, 'M', 1000);
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length()
                    && romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i + 1))) {
                result -= romanMap.get(s.charAt(i));
            } else {
                result += romanMap.get(s.charAt(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        RomanToInt rti = new RomanToInt();
        System.out.println(rti.romanToInt("III"));
        System.out.println(rti.romanToInt("IV"));
        System.out.println(rti.romanToInt("IX"));
        System.out.println(rti.romanToInt("LVIII"));
        System.out.println(rti.romanToInt("MCMXCIV"));
    }
}
