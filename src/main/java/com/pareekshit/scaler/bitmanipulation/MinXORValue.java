package main.java.com.pareekshit.scaler.bitmanipulation;

import java.util.Arrays;

public class MinXORValue {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{0, 2, 5, 7}));
        System.out.println(solveOptimal(new int[]{0, 2, 5, 7}));
        System.out.println(solveOptimal(new int[]{12, 4, 6, 2}));
    }

    public static int solve(final int[] A) {
        int ans = 0;
        int count;
        for (int i = 31; i >= 0; i--) {
            count = 0;
            for (int k : A) {
                if ((k & (1 << i)) > 0) {
                    count++;
                }
            }
            if (count >= 2) {
                ans |= (1 << i);
                for (int j = 0; j < A.length; j++) {
                    if ((A[j] & (1 << i)) == 0) {
                        A[j] = 0;
                    }
                }
            }
        }
        return ans;
    }

    public static int solveOptimal(final int[] A) {
        Arrays.sort(A);
        int n = A.length, ans = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            int xor = A[i] ^ A[i + 1];
            ans = Math.min(ans, xor);
        }
        return ans;
    }
}
