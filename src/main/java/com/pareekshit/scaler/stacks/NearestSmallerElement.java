package main.java.com.pareekshit.scaler.stacks;

import main.java.com.pareekshit.Util;

import java.util.Stack;

public class NearestSmallerElement {

    public static void main(String[] args) {
        Util.printArray(prevSmaller(new int[]{34, 35, 27, 42, 5, 28, 39, 20, 28}));
    }

    public static int[] prevSmaller(int[] A) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            while (!stack.isEmpty() && stack.peek() >= A[i]) {
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
