package main.java.com.pareekshit.scaler.stacks;

import java.util.Stack;

public class EvaluateExpression {
    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"-500", "-10", "/"}));
        System.out.println(evalRPN(new String[]{"2", "1", "+", "3", "*"}));
        System.out.println(evalRPN(new String[]{"5", "1", "2", "+", "4", "*", "+", "3", "-"}));
        System.out.println(evalRPN(new String[]{"-1"}));
    }

    public static int evalRPN(String[] A) {
        if (A.length == 1) {
            return Integer.valueOf(A[0]);
        }
        Stack<Integer> stack = new Stack<>();
        for (String s : A) {
            char ch = ' ';
            boolean isOperator = false;
            if (s.length() == 1) {
                if (Character.isDigit(s.charAt(0))) {
                    stack.push(Integer.valueOf(s));
                } else {
                    isOperator = true;
                    ch = s.charAt(0);
                }
            } else {
                stack.push(Integer.valueOf(s));
            }
            if (isOperator) {
                if (stack.size() > 1) {
                    int b = stack.pop();
                    int a = stack.pop();
                    int c = 0;
                    if (ch == '+') {
                        c = a + b;
                    } else if (ch == '-') {
                        c = a - b;
                    } else if (ch == '*') {
                        c = a * b;
                    } else if (ch == '/') {
                        c = a / b;
                    }
                    stack.push(c);
                }
            }
        }
        return stack.peek();
    }

}
