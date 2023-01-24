package leetcode;

import java.util.Stack;

public class SubSequence {
    public boolean isSubsequence(String s, String t) {
        Stack<String> s1 = new Stack<>();
        Stack<String> s2 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            s1.push(s.substring(i, i + 1));
        }
        for (int i = 0; i < t.length(); i++) {
            s2.push(t.substring(i, i + 1));
        }
        while (!s1.isEmpty()) {
            if (s2.isEmpty())
                return false;
            if (s1.peek().equals(s2.peek())) {
                s1.pop();
                s2.pop();
            } else {
                s2.pop();
            }
        }
        return true;
    }

    public boolean isSubsequenceSimpleWay(String s, String t) {
        int n = s.length(), m = t.length(), j = 0;
        for(int i = 0; i < m && j < n; i++)
            if(s.charAt(j) == t.charAt(i))
                j++;
        return (j == n);
    }
    public static void main(String[] args) {
        SubSequence s = new SubSequence();
        System.out.println(s.isSubsequence("abc", "ahbgdc"));
        System.out.println(s.isSubsequence("axc", "ahbgdc"));
        System.out.println(s.isSubsequenceSimpleWay("abc", "abcde"));
    }
}
