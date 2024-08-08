package main.java.com.pareekshit.scaler.dynamicprogramming.knapsack;

import java.util.Arrays;

public class TusharsBirthdayParty {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{2, 4, 6}, new int[]{2, 1, 3}, new int[]{2, 5, 3}));
    }

    public static int solve(final int[] A, final int[] B, final int[] C) {
        int ans = 0;
        int maxEatingCapacity = A[0];
        for (int i : A) {
            maxEatingCapacity = Math.max(maxEatingCapacity, i);
        }
        int[] arr = new int[maxEatingCapacity + 1];
        Arrays.fill(arr, Integer.MAX_VALUE);
        arr[0] = 0;
        for (int i = 1; i <= maxEatingCapacity; i++) {
            for (int j = 0; j < B.length; j++) {
                if (B[j] <= i && arr[i - B[j]] < Integer.MAX_VALUE) {
                    arr[i] = Math.min(arr[i], arr[i - B[j]] + C[j]);
                }
            }
        }
        for (int i : A) {
            ans += arr[i];
        }
        return ans;
    }
}
