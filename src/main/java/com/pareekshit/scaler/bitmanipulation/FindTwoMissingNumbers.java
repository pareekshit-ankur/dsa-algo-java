package main.java.com.pareekshit.scaler.bitmanipulation;

import java.util.Arrays;

public class FindTwoMissingNumbers {
    public static void main(String[] args) {
        printArray(solve(new int[]{3, 2, 4}));
        printArray(solve(new int[]{5, 1, 3, 6}));
        printArray(solve(new int[]{4, 5, 2, 9, 3, 7, 8, 11, 10}));
    }

    public static int[] solve(final int[] A) {
        int x = A[0];
        for (int i = 1; i < A.length; i++) {
            x ^= A[i];
        }
        for (int i = 1; i <= A.length + 2; i++) {
            x ^= i;
        }
        int pos = 0;
        for (int i = 0; i < 32; i++) {
            if ((x & (1 << i)) > 0) {
                pos = i;
                break;
            }
        }
        int n1 = 0, n2 = 0;
        for (int i = 0; i < A.length; i++) {
            if ((A[i] & (1 << pos)) > 0) {
                n1 ^= A[i];
            } else {
                n2 ^= A[i];
            }
        }
        for (int i = 1; i <= A.length + 2; i++) {
            if ((i & (1 << pos)) > 0) {
                n1 ^= i;
            } else {
                n2 ^= i;
            }
        }
        if (n1 < n2) {
            return new int[]{n1, n2};
        }
        return new int[]{n2, n1};
    }

    private static void printArray(int[] A) {
        Arrays.stream(A).mapToObj(i -> i + " ").forEach(System.out::print);
        System.out.println();
    }
}
