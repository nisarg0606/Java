package aarsh.collection;

import java.util.Arrays;
import java.util.Stack;

public class CheckBalaceParanthesis {
    public boolean checkBalaceParanthesis(String s) {
        // Input: s = "{[()]}"
        // Input: s = "{[(])}"
        Character[] characters = { ')', ']', '}' };
        Stack<Character> items = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') { // ---> { [ (
                items.push(s.charAt(i));
            } else if (Arrays.asList(characters).contains(s.charAt(i))) { // ---> } ) ]
                if (items.isEmpty())
                    return false;
                if (s.charAt(i) == ')') { // if yes go inside, if no then go to other else if
                    if (items.pop() != '(')
                        return false;
                } else if (s.charAt(i) == ']') {
                    if (items.pop() != '[')
                        return false;
                } else if (s.charAt(i) == '}') {
                    if (items.pop() != '{')
                        return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        CheckBalaceParanthesis checkBalaceParanthesis = new CheckBalaceParanthesis();
        System.out.println(checkBalaceParanthesis.checkBalaceParanthesis("{[()]}"));
        System.out.println(checkBalaceParanthesis.checkBalaceParanthesis("{[(])}"));
        System.out.println(checkBalaceParanthesis.checkBalaceParanthesis("])}"));
        System.out.println(checkBalaceParanthesis.checkBalaceParanthesis("2 * (3 + 4) - {5 * [6 / (7 - 8)]}"));
    }
}
