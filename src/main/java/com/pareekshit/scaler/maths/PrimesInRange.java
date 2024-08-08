package main.java.com.pareekshit.scaler.maths;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimesInRange {
    static boolean[] arr = new boolean[10000000 + 1];

    static {
        filterPrime(10000000);
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

    public static void filterPrime(int n) {
        Arrays.fill(arr, Boolean.TRUE);
        arr[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (arr[i] && isPrime(i)) {
                for (int j = i * i; j <= n; j = j + i) {
                    arr[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        solve(1, 7).forEach(System.out::println);
    }

    public static ArrayList<Integer> solve(int A, int B) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = A; i <= B; i++) {
            if (arr[i]) {
                list.add(i);
            }
        }
        return list;

    }
}
