package main.java.com.pareekshit.scaler.maths;

public class DeleteOne {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{5, 15, 30}));
    }

    public static int solve(int[] A) {
        int[] prefix = new int[A.length];
        prefix[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            prefix[i] = gcd(prefix[i - 1], A[i]);
        }
        int[] suffix = new int[A.length];
        suffix[A.length - 1] = A[A.length - 1];
        for (int i = A.length - 2; i >= 0; i--) {
            suffix[i] = gcd(suffix[i + 1], A[i]);
        }
        int ans = Math.max(suffix[1], prefix[A.length - 2]);
        for (int i = 1; i < A.length - 1; i++) {
            ans = Math.max(ans, gcd(prefix[i - 1], suffix[i + 1]));
        }
        return ans;
    }

    public static int gcd(int A, int B) {
        if (B == 0) {
            return A;
        }
        return gcd(B, A % B);
    }
}
