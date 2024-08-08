package main.java.com.pareekshit.scaler.dynamicprogramming.knapsack;

public class UnboundedKnapsack {
    public static void main(String[] args) {
        System.out.println(solve(10, new int[]{5}, new int[]{10}));
        System.out.println(solve(10, new int[]{6, 7}, new int[]{5, 5}));
    }

    public static int solve(int A, int[] B, int[] C) {
        int[] arr = new int[A + 1];
        for (int i = 1; i <= A; i++) {
            for (int j = 0; j < B.length; j++) {
                if (C[j] <= i) {
                    arr[i] = Math.max(arr[i], arr[i - C[j]] + B[j]);
                }
            }
        }
        return arr[A];
    }
}
