import java.util.HashMap;
import java.util.Map;

public class LetterApprearingTwice {
    public static void main(String[] args) {
        String s = "abccbaacz";
        LetterApprearingTwice lat = new LetterApprearingTwice();
        char c = lat.firstLetterAppearingTwice(s);
        System.out.println(c);
    }

    public char firstLetterAppearingTwice(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (freq.containsKey(c))
                 return c;
            else
                freq.put(c, 1);
        }
        return ' ';
        // time complexity: O(n)
        // space complexity: O(1)
    }
}
