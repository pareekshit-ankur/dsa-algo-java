package main.java.com.pareekshit;

import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] arr = {10, 20, 30};
        int k = 3;
        for (int i = 0; i < arr.length; i++) {
            int[] tempArr = new int[arr.length];
            System.arraycopy(arr, 0, tempArr, 0, arr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[0];
            tempArr[0] = temp;
            Arrays.stream(tempArr).forEach(System.out::print);
            System.out.println();
            temp = tempArr[0];
            tempArr[0] = tempArr[arr.length - 1];
            tempArr[arr.length - 1] = temp;
            Arrays.stream(tempArr).forEach(System.out::print);
            System.out.println();
        }
        int[] modifiedArray = new int[array.length];
        for (int i = array.length - (k), j = 0; i < array.length; i++, j++) {
            modifiedArray[j] = array[i];
        }
        for (int i = 0, j = k; i < array.length - k; i++, j++) {
            modifiedArray[j] = array[i];
        }
        Arrays.stream(modifiedArray).forEach(System.out::print);
    }

    public static int getMaxDiff(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = Math.abs(arr[i] - arr[i + 1]);
            if (diff > max) {
                max = diff;
            }
        }
        return max;
    }
}
