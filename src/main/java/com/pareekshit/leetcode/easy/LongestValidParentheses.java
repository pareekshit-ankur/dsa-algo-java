package main.java.com.pareekshit.leetcode.easy;

import java.util.Stack;

public class LongestValidParentheses {
    public static void main(String[] args) {
        System.out.println(longestValidParentheses("(()"));
        System.out.println(longestValidParentheses(")()())"));
        System.out.println(longestValidParentheses(""));
        System.out.println(longestValidParentheses("()(()"));
    }
    public static int longestValidParentheses(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        int count = 0, max = 0;
        for (char c : arr) {
            if (c == '(') {
                stack.push('(');
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
                count += 2;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        if (!stack.isEmpty()){
            max-=2;
        }
        return max;
    }
}
