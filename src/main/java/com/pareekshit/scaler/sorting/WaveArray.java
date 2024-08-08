package main.java.com.pareekshit.scaler.sorting;

import main.java.com.pareekshit.Util;

import java.util.Arrays;

public class WaveArray {

    public static void main(String[] args) {
        Util.printArray(wave(new int[]{1, 2, 3, 4}));
    }

    public static int[] wave(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length - 1; i += 2) {
            int temp = A[i];
            A[i] = A[i + 1];
            A[i + 1] = temp;
        }
        return A;
    }
}
