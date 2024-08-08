package main.java.com.pareekshit.scaler.maths;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class PrimeSum {
    public static void main(String[] args) {
        Arrays.stream(solve(4)).forEach(System.out::println);
        Arrays.stream(solve(16777214)).forEach(System.out::println);
    }

    public static int[] solve(int A) {
        if (A == 1) {
            return new int[0];
        }
        Set<Integer> primeNums = new TreeSet<>();
        boolean[] arr = new boolean[A + 1];
        Arrays.fill(arr, Boolean.TRUE);
        for (int i = 2; i * i <= A; i++) {
            if (arr[i] && isPrime(i)) {
                for (int j = i * i; j <= A; j = j + i) {
                    arr[j] = false;
                }
            }
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i]) {
                primeNums.add(i);
            }
        }
        for (Integer primeNum : primeNums) {
            if (primeNums.contains(A - primeNum)) {
                return new int[]{primeNum, A - primeNum};
            }
        }
        return new int[0];
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
