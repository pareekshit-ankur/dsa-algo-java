package main.java.com.pareekshit.scaler.dynamicprogramming;

import java.util.Arrays;

public class Stairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(10));
    }

    public static int climbStairs(int A) {
        int[] arr = new int[A + 1];
        Arrays.fill(arr, -1);
        if (A == 0 || A == 1) {
            return 1;
        }
        return ways(A, arr);
    }

    public static int ways(int A, int[] arr) {
        if (A == 0 || A == 1) {
            return 1;
        }
        if (arr[A] != -1) {
            return arr[A] % 1000000007;
        }
        int val = ways(A - 1, arr) + ways(A - 2, arr);
        arr[A] = val;
        return val % 1000000007;
    }
}
