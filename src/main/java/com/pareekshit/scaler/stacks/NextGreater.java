package main.java.com.pareekshit.scaler.stacks;

import main.java.com.pareekshit.Util;

import java.util.Stack;

public class NextGreater {

    public static void main(String[] args) {
        Util.printArray(nextGreater(new int[]{4, 5, 2, 10}));
    }

    public static int[] nextGreater(int[] A) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[A.length];
        for (int i = A.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= A[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = stack.peek();
            }
            stack.push(A[i]);
        }
        return res;
    }
}
