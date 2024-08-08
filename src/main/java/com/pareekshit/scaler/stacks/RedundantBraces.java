package main.java.com.pareekshit.scaler.stacks;

import java.util.Stack;

public class RedundantBraces {
    public static void main(String[] args) {
        System.out.println(braces("((a+b))"));
        System.out.println(braces("(a+(a+b))"));
        System.out.println(braces("a+b"));
    }

    public static int braces(String A) {
        Stack<Character> stack = new Stack<>();
        for (char c : A.toCharArray()) {
            int initialSize = stack.size();
            if (c == ')') {
                if (stack.peek() != '(') {
                    while (stack.peek() != '(') {
                        stack.pop();
                    }
                    stack.pop();
                }
                int currentSize = stack.size();
                if (initialSize - currentSize <= 2) {
                    return 1;
                }

            } else if (c == '}') {
                if (stack.peek() != '{') {
                    while (stack.peek() != '{') {
                        stack.pop();
                    }
                    stack.pop();
                }
                int currentSize = stack.size();
                if (initialSize - currentSize <= 2) {
                    return 1;
                }
            } else if (c == ']') {
                if (stack.peek() != '[') {
                    while (stack.peek() != '[') {
                        stack.pop();
                    }
                    stack.pop();
                }
                int currentSize = stack.size();
                if (initialSize - currentSize <= 2) {
                    return 1;
                }
            } else {
                stack.push(c);
            }
        }
        if (!stack.isEmpty() && ((stack.peek() == '{' || stack.peek() == '(' || stack.peek() == '['))) {
            return 1;
        }
        return 0;
    }
}
