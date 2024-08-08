package main.java.com.pareekshit.scaler.maths;

public class ModSum {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 2, 3}));
    }

    public static int solve(int[] A) {
        int[] freq = new int[1001];
        for (int i : A) {
            freq[i] += 1;
        }
        int modVal = 1000000007;
        int ans = 0;
        for (int i = 1; i < 1001; i++) {
            for (int j = 1; j < 1001; j++) {
                ans += ((i % j) * freq[i] * freq[j]) % modVal;
                ans %= modVal;
            }
        }
        return ans;
    }
}
