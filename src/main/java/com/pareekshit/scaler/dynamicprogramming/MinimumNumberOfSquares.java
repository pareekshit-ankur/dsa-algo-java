package main.java.com.pareekshit.scaler.dynamicprogramming;

public class MinimumNumberOfSquares {
    public int countMinSquares(int A) {
        if (A <= 1) {
            return 1;
        }
        int[] cnt = new int[A + 1];
        for (int i = 0; i <= A; i++) {
            cnt[i] = i;
            for (int j = 1; j * j <= i; j++) {
                cnt[i] = Math.min(cnt[i], cnt[i - (j * j)] + 1);
            }
        }
        return cnt[A];
    }
}
