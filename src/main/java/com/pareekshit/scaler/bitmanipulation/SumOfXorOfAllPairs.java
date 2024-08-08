package main.java.com.pareekshit.scaler.bitmanipulation;

public class SumOfXorOfAllPairs {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 2, 3}));
        System.out.println(solve(new int[]{3, 4, 2}));
    }

    public static int solve(final int[] A) {
        int mod = 1000000007;
        int ans = 0, setCount;
        long sum;
        for (int i = 31; i >= 0; i--) {
            setCount = 0;
            for (int k : A) {
                if ((k & (1 << i)) > 0) {
                    setCount++;
                }
            }
            sum = (((long) setCount * (A.length - setCount)) * (1L << i)) % mod;
            ans += (int) (sum % mod);
            ans %= mod;
        }
        return ans;
    }

    public static int solveBruteForce(final int[] A) {
        int mod = 1000000007;
        int ans = 0;
        long sum;
        //Brute Force
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                sum = A[i] ^ A[j];
                ans += (int) (sum % mod);
                ans %= mod;
            }
        }
        return ans;
    }
}
