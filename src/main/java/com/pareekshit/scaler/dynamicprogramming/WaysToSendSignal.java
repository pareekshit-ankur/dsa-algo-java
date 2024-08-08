package main.java.com.pareekshit.scaler.dynamicprogramming;

public class WaysToSendSignal {
    public int solve(int A) {
        if (A == 1) {
            return 2;
        } else if (A == 2) {
            return 3;
        }
        long a = 2, b = 3, ans;
        for (int i = 2; i <= A; i++) {
            ans = a + b;
            a = b;
            b = ans;
        }
        return (int) (b % 1000000007);
    }
}
