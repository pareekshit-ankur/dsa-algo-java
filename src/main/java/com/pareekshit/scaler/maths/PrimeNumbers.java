package main.java.com.pareekshit.scaler.maths;

import java.util.Arrays;

public class PrimeNumbers {
    static boolean[] arr = new boolean[10000000 + 1];

    static {
        solve(10000000);
    }

    public static void main(String[] args) {
        //Arrays.stream(solve(7)).forEach(System.out::println);
        //Arrays.stream(solve(12)).forEach(System.out::println);
        Arrays.stream(solve(49)).forEach(System.out::println);
    }

    public static int[] solve(int A) {
        if (A == 1) {
            return new int[0];
        }

        boolean[] arr = new boolean[A + 1];
        Arrays.fill(arr, Boolean.TRUE);
        for (int i = 2; i * i <= A; i++) {
            if (arr[i] && isPrime(i)) {
                for (int j = i * i; j <= A; j = j + i) {
                    arr[j] = false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i]) count++;
        }
        int[] res = new int[count];
        for (int i = 2, index = 0; i < arr.length; i++) {
            if (arr[i]) {
                res[index] = i;
                index++;
            }
        }
        return res;
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
