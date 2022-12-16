import java.util.HashMap;
import java.util.Map;

public class GoodString {
    // time complexity: O(n)
    // space complexity: O(n)
    public static void main(String[] args) {
        String s = "abacbc";
        boolean isGood = checkGoodString(s);
        System.out.println(isGood);
    }

    public static boolean checkGoodString(String s)
    {
        Map<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (freq.containsKey(c))
                freq.put(c, freq.get(c) + 1);
            else
                freq.put(c, 1);
        }
        int firstFreq = freq.get(s.charAt(0));
        for (int f : freq.values()) {
            if (f != firstFreq)
                return false;
        }
        return true;
    }
}
