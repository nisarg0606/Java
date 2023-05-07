package leetcode;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int start = 0;
        int end = 0;
        int[] map = new int[128];
        while (end < s.length()) {
            char c = s.charAt(end);
            if (map[c] == 0) {
                map[c] = 1;
                end++;
                max = Math.max(max, end - start);
            } else {
                map[s.charAt(start)] = 0;
                start++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        LengthOfLongestSubstring lols = new LengthOfLongestSubstring();
        System.out.println(lols.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lols.lengthOfLongestSubstring("bbbbb"));
        System.out.println(lols.lengthOfLongestSubstring("pwwkew"));
        System.out.println(lols.lengthOfLongestSubstring(""));
        System.out.println(lols.lengthOfLongestSubstring(" "));
        System.out.println(lols.lengthOfLongestSubstring("au"));
        System.out.println(lols.lengthOfLongestSubstring("dvdf"));
    }
}
