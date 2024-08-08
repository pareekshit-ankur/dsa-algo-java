package main.java.com.pareekshit.scaler.dynamicprogramming;

public class MaxProductSubarray {
    public int maxProduct(final int[] A) {
        if (A.length == 1) {
            return A[0];
        }
        long max = A[0], min = A[0], ans = A[0];
        for (int i = 1; i < A.length; i++) {
            long minVal = Math.min(A[i], Math.min(A[i] * max, A[i] * min));
            max = Math.max(A[i], Math.max(A[i] * max, A[i] * min));
            ans = Math.max(ans, max);
            min = minVal;
        }
        return (int) ans;
    }
}
