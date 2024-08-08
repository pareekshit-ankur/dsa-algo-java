package main.java.com.pareekshit.leetcode.easy;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is
 * valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets. Open brackets must be closed in the correct order. Note
 * that an empty string is also considered valid.
 * <p>
 * Example 1:
 * <p>
 * Input: "()" Output: true Example 2:
 * <p>
 * Input: "()[]{}" Output: true Example 3:
 * <p>
 * Input: "(]" Output: false Example 4:
 * <p>
 * Input: "([)]" Output: false Example 5:
 * <p>
 * Input: "{[]}" Output: true
 */
public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid(""));
        System.out.println(isValid("{}[]()"));
        System.out.println(isValid("{}[(])"));
    }

    public static boolean isValid(String s) {
        boolean isBalanced = false;
        int pointer;
        if (s.isEmpty()) return true;
        else {
            char[] chars = s.toCharArray();
            pointer = -1;
            char[] stack = new char[chars.length];
            for (char c : chars) {
                if ((c == '{' || c == '(' || c == '[') && pointer != chars.length) {
                    stack[++pointer] = c;
                } else if ((c == '}' && pointer != -1 && stack[pointer] == '{')
                        || (c == ')' && pointer != -1 && stack[pointer] == '(')
                        || (c == ']' && pointer != -1 && stack[pointer] == '[')) {
                    stack[pointer] = '0';
                    pointer--;
                } else {
                    return false;
                }
            }
        }
        isBalanced = pointer == -1;
        return isBalanced;
    }
}