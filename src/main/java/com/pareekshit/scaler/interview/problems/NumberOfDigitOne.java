package main.java.com.pareekshit.scaler.interview.problems;

public class NumberOfDigitOne {
    public static void main(String[] args) {
        System.out.println(solveBruteForce(10));
        System.out.println(solveBruteForce(11));
        System.out.println(solve(100));
        System.out.println(solveBruteForce(134));
        System.out.println(solveBruteForce(234));
        //System.out.println(solve(1000000000));
    }

    public static int solve(int A) {
        if (A == 0) return 0;
        int ans = 0, i = 1;
        while (A / i > 0) {
            ans += (A / (i * 10)) * i + Math.min(Math.max((A % (i * 10)) - (i - 1), 0), i);
            i *= 10;
        }
        return ans;
    }

    public static int solveBruteForce(int A) {
        int countOfOne = 0;
        for (int i = 1; i <= A; i++) {
            countOfOne += getOneCount(i);
        }
        return countOfOne;
    }

    public static int getOneCount(int n) {
        int countOfOne = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit == 1) {
                countOfOne++;
            }
            n /= 10;
        }
        return countOfOne;
    }
}
