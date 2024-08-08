package main.java.com.pareekshit.scaler.stacks;

import java.util.Stack;

public class DoubleCharacterTrouble {
    public static void main(String[] args) {
        System.out.println(solve("abba"));
    }

    public static String solve(String A) {
        Stack<Character> stack = new Stack<>();
        for (char c : A.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
            } else if (stack.peek() == c) {
                while (!stack.isEmpty() && stack.peek() == c) {
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
