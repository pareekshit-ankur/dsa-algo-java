package main.java.com.pareekshit.scaler.sorting;

import main.java.com.pareekshit.Util;

import java.util.Arrays;

public class SortByColor {

    public static void main(String[] args) {
        Util.printArray(sortColors(new int[]{0, 1, 2, 0, 1, 2}));
    }

    public static int[] sortColors(int[] A) {
        int[] freq = new int[3];
        for (int i : A) {
            freq[i]++;
        }
        int index = 0;
        for (int i = 0; i < freq.length; i++) {
            Arrays.fill(A, index, index + freq[i], i);
            index = index + freq[i];
        }
        return A;
    }
}
