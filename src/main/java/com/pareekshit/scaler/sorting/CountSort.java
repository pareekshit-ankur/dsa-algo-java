package main.java.com.pareekshit.scaler.sorting;

import main.java.com.pareekshit.Util;

public class CountSort {
    public static void main(String[] args) {
        Util.printArray(solve(new int[]{1, 3, 1}));
        Util.printArray(solve(new int[]{4, 2, 1, 3}));
    }

    public static int[] solve(final int[] A) {
        int[] arr = new int[A.length];
        int[] freq = new int[100000 + 1];
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            freq[A[i]]++;
        }
        for (int i = 0; i < freq.length; ) {
            if (freq[i] == 0) {
                i++;
            } else {
                arr[index++] = i;
                freq[i]--;
            }
        }
        return arr;
    }
}
