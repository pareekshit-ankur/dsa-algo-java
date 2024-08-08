package main.java.com.pareekshit.scaler.interview.problems;

import main.java.com.pareekshit.Util;

public class NextPermutation {
    public static void main(String[] args) {
        Util.printArray(nextPermutation(new int[]{1, 2, 3}));
        Util.printArray(nextPermutation(new int[]{3, 2, 1}));
        Util.printArray(nextPermutation(new int[]{1, 2, 3, 6, 5, 4}));
    }

    public static int[] nextPermutation(int[] A) {
        int index = 0;
        for (int i = A.length - 1; i > 0; i--) {
            if (A[i - 1] >= A[i]) {
                continue;
            } else {
                index = i - 1;
                break;
            }
        }
        int nextLargestNumber = Integer.MAX_VALUE;
        int nextLargestNumberIndex = 0;
        for (int i = index + 1; i < A.length; i++) {
            if (A[i] > A[index] && A[i] < nextLargestNumber) {
                nextLargestNumber = A[i];
                nextLargestNumberIndex = i;
            }
        }
        if (index == 0) {
            int temp = A[A.length - 1];
            A[A.length - 1] = A[A.length - 2];
            A[A.length - 2] = temp;
            return A;
        }
        int temp = A[index];
        A[index] = A[nextLargestNumberIndex];
        A[nextLargestNumberIndex] = temp;
        for (int i = index + 1, j = A.length - 1; i < j; i++, j--) {
            temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
        return A;
    }
}
