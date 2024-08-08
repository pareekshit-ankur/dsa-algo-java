package main.java.com.pareekshit.scaler.bitmanipulation;

public class FindNthMagicNumber {
    public static void main(String[] args) {
        System.out.println(solve(3));
        System.out.println(solve(10));
    }

    public static int solve(int A) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            if ((A & (1 << i)) > 0) {
                ans += (int) Math.pow(5, i + 1);
            }
        }
        return ans;
    }
}
