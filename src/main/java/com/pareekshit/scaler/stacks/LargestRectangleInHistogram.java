package main.java.com.pareekshit.scaler.stacks;

import java.util.Stack;

public class LargestRectangleInHistogram {
    public static void main(String[] args) {
        System.out.println(largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3}));
    }

    public static int largestRectangleArea(int[] A) {
        if (A.length == 1) {
            return A[0];
        }
        int[] prevSmaller = prevSmaller(A);
        int[] nextSmallest = nextSmallest(A);
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            int j = prevSmaller[i];
            int k = nextSmallest[i];
            max = Math.max(max, A[i] * (k - j - 1));
        }
        return max;
    }

    public static int[] nextSmallest(int[] A) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[A.length];
        for (int i = A.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && A[stack.peek()] > A[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                res[i] = A.length;
            } else {
                res[i] = stack.peek();
            }
            stack.push(i);
        }
        return res;
    }

    public static int[] prevSmaller(int[] A) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            while (!stack.isEmpty() && A[stack.peek()] >= A[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                res[i] = -1;

            } else {
                res[i] = stack.peek();
            }
            stack.push(i);
        }
        return res;
    }
}
