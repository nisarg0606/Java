package leetcode;

public class LongestPalindrome {
    public int longestPalindrome(String s){
        int[] count = new int[128];
        for (char c : s.toCharArray()) {
            count[c]++;
        }
        int ans = 0;
        for (int v : count) {
            ans += v / 2 * 2;
            if (ans % 2 == 0 && v % 2 == 1) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        LongestPalindrome lp = new LongestPalindrome();
        System.out.println(lp.longestPalindrome("abccccdd"));
        System.out.println(lp.longestPalindrome("a"));
        System.out.println(lp.longestPalindrome("bb"));
    }
}
