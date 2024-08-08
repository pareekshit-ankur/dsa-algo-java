package main.java.com.pareekshit.scaler.bitmanipulation;

public class MaximumAndPair {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{13, 18, 23, 56, 81, 20, 4, 24, 93}));
    }

    public static int solve(final int[] A) {
        int ans = 0;
        int count = 0;
        for (int i = 31; i >= 0; i--) {
            count = 0;
            for (int j = 0; j < A.length; j++) {
                if ((A[j] & (1 << i)) > 0) {
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
}
