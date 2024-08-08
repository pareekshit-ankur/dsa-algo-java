package main.java.com.pareekshit.scaler.maths;

public class ConsecutiveNumbersSum {
    public static void main(String[] args) {
        System.out.println(solve(1));
        System.out.println(solve(3));
        System.out.println(solve(9));
    }

    public static int solve(int A) {
        int ans = 0, k = 1;
        int val = numSum(k);
        while (val <= A) {
            if ((A - val) % k == 0) {
                ans++;
            }
            k++;
            val = numSum(k);
        }
        /*for (int i = 1; i <= k; i++) {
            int val = A - ((k * (k - 1)) / 2);
            if (val % k == 0) {
                ans++;
            }
        }*/
        return ans;
    }

    static int numSum(int a) {
        return (a * (a + 1)) / 2;
    }
}
