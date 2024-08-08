package main.java.com.pareekshit.scaler.stacks;

import java.util.Stack;

public class PassingGame {
    public int solve(int A, int B, int[] C) {
        Stack<Integer> stack = new Stack<>();
        stack.push(B);
        for (int i : C) {
            if (i == 0) {
                stack.pop();
            } else {
                stack.push(i);
            }
        }
        return stack.peek();
    }
}
