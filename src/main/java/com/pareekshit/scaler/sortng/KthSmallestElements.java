package main.java.com.pareekshit.scaler.sortng;

import java.util.Arrays;

public class KthSmallestElements {
    public static void main(String[] args) {
        //System.out.println(kthsmallest(new int[]{2, 1, 4, 3, 2}, 3));
        System.out.println(kthsmallest(new int[]{94, 87, 100, 11, 23, 98, 17, 35, 43, 66, 34, 53, 72, 80, 5, 34, 64, 71, 9, 16, 41, 66, 96}, 19));
        System.out.println(kthsmallest(new int[]{8, 16, 80, 55, 32, 8, 38, 40, 65, 18, 15, 45, 50, 38, 54, 52, 23, 74, 81, 42, 28, 16, 66, 35, 91, 36, 44, 9, 85, 58, 59, 49, 75, 20, 87, 60, 17, 11, 39, 62, 20, 17, 46, 26, 81, 92}, 9));
    }

    public static int kthsmallest(final int[] A, int B) {
        int[] arr = Arrays.copyOf(A, A.length);
        for (int i = 0; i < B; i++) {
            int mi = arr.length - 1;
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[mi]) {
                    mi = j;
                }
            }
            if (arr[i] > arr[mi]) {
                int temp = arr[i];
                arr[i] = arr[mi];
                arr[mi] = temp;
            }
        }
        return arr[B - 1];
    }

    public static int kthsmallestInbuiltMethod(final int[] A, int B) {
        int[] arr = Arrays.copyOf(A, A.length);
        Arrays.sort(arr);
        return arr[B - 1];
    }
}
