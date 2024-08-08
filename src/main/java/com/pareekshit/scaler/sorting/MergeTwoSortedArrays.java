package main.java.com.pareekshit.scaler.sorting;

import main.java.com.pareekshit.Util;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        Util.printArray(solve(new int[]{4, 7, 9}, new int[]{2, 11, 19}));
        Util.printArray(solve(new int[]{3}, new int[]{-4, -3}));
    }

    public static int[] solve(final int[] A, final int[] B) {
        int[] arr = new int[A.length + B.length];
        int i, j, index = 0;
        for (i = 0, j = 0; i < A.length && j < B.length; ) {
            if (A[i] < B[j]) {
                arr[index++] = A[i++];
            } else {
                arr[index++] = B[j++];
            }
        }
        while (i < A.length) {
            arr[index++] = A[i++];
        }
        while (j < B.length) {
            arr[index++] = B[j++];
        }
        return arr;
    }
}
