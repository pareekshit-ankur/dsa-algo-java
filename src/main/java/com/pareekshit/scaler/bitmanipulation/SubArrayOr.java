package main.java.com.pareekshit.scaler.bitmanipulation;

public class SubArrayOr {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 2, 3, 4, 5}));
        System.out.println(solveOptimal(new int[]{1, 2, 3, 4, 5}));
        System.out.println(solve(new int[]{7, 8, 9, 10}));
        System.out.println(solveOptimal(new int[]{7, 8, 9, 10}));
    }

    public static int solve(final int[] A) {
        int mod = 1000000007;
        int ans = 0, sum;
        for (int i = 0; i < A.length; i++) {
            sum = 0;
            for (int j = i; j < A.length; j++) {
                sum |= A[j];
                ans += sum;
                ans %= mod;
            }
        }
        return ans;
    }

    public static int solveOptimal(final int[] A) {
        int mod = 1000000007;
        int n = A.length, consecutiveZero;
        long totalSubArrays = n * (n + 1L) / 2;
        long ans = 0, sum, subArrayCountForNotSetBit;

        for (int i = 31; i >= 0; i--) {
            subArrayCountForNotSetBit = 0;
            consecutiveZero = 0;
            for (int k : A) {
                if ((k & (1 << i)) > 0) {
                    subArrayCountForNotSetBit += getTotalSubArrayCount(consecutiveZero);
                    consecutiveZero = 0;
                } else {
                    consecutiveZero++;
                }
            }
            subArrayCountForNotSetBit += getTotalSubArrayCount(consecutiveZero);
            if (consecutiveZero < n) {
                sum = ((totalSubArrays - subArrayCountForNotSetBit) * (long) Math.pow(2, i)) % mod;
                ans += (int) (sum % mod);
                ans %= mod;
            }
        }
        return (int) ans;
    }

    public static long getTotalSubArrayCount(int n) {
        return n * (n + 1L) / 2;
    }
}
