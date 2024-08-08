package main.java.com.pareekshit.scaler.arrays.prefix;

public class SubArrayWithGivenSumAndLength {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{4, 3, 2, 6, 1}, 3, 11));
    }

    public static int solve(int[] A, int B, int C) {
        int sum = 0;
        for (int i = 0; i < B; i++) {
            sum += A[i];
        }
        if (sum == C) return 1;
        for (int i = B; i < A.length; i++) {
            sum += A[i];
            sum -= A[i - B];
            if (sum == C) return 1;
        }
        return 0;
    }
}
