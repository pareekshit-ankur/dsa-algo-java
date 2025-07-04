package main.java.com.pareekshit.scaler.twopointers;

public class AnotherCountRectangles {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1,2,3}, 5));
    }
    public static int solve(int[] A, int B) {
        int MOD = 1000000007;
        long total = (long) (Math.pow(2, A.length - 1) % MOD);
        long count = 0;
        int l = 0, r = A.length - 1;
        for (int i = l; i < r; ) {
            int val = A[i] % MOD * A[r] % MOD;
            if (val <= B) {
                i++;
            } else {
                count += (long) (Math.pow(2, r - l + 1) % MOD);
            }
        }
        return (int) ((total-count)%MOD);
    }
}
