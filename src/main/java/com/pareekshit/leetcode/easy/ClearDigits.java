package main.java.com.pareekshit.leetcode.easy;

import java.util.Stack;

public class ClearDigits {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                stack.push(c);
            } else {
                if (Character.isLetter(stack.peek())) {
                    stack.pop();
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
