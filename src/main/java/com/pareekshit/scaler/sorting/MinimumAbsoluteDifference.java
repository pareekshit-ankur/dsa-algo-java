package main.java.com.pareekshit.scaler.sorting;

import java.util.Arrays;

public class MinimumAbsoluteDifference {

    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 2, 3, 4, 5}));
    }

    public static int solve(int[] A) {
        int min = Integer.MAX_VALUE;
        Arrays.sort(A);
        for (int i = 0; i < A.length - 1; i++) {
            min = Math.min(min, Math.abs(A[i + 1] - A[i]));
        }
        return min;
    }
}
