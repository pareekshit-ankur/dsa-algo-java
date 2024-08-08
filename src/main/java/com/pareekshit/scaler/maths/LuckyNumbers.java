package main.java.com.pareekshit.scaler.maths;

import java.util.Arrays;

public class LuckyNumbers {
    static boolean[] arr = new boolean[50000 + 1];
    static int[] factors = new int[50000 + 1];

    static {
        Arrays.fill(arr, Boolean.TRUE);
        arr[1] = false;
        for (int i = 2; i <= 50000; i++) {
            if (arr[i] && isPrime(i)) {
                for (int j = 2 * i; j <= 50000; j = j + i) {
                    arr[j] = false;
                    factors[j] += 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(solve(8));
        System.out.println(solve(12));
        System.out.println(solve(1000));
    }

    public static int solve(int A) {
        int count = 0;
        for (int i = 1; i <= A; i++) {
            if (factors[i] == 2) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
