package main.java.com.pareekshit.scaler.hashing;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithZeroSum {

    public int solve(int[] A) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.

        long sum = A[0];
        Set<Long> set = new HashSet<>();
        set.add(sum);
        for (int i = 1; i < A.length; i++) {
            sum += A[i];
            if (sum == 0) {
                return 1;
            }
            if (set.contains(sum)) {
                return 1;
            } else {
                set.add(sum);
            }
        }
        return 0;
    }
}
