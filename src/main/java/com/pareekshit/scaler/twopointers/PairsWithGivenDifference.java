package main.java.com.pareekshit.scaler.twopointers;

import java.util.Arrays;

public class PairsWithGivenDifference {

    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 0));
        System.out.println(solve(new int[]{8, 5, 1, 10, 5, 9, 9, 3, 5, 6, 6, 2, 8, 2, 2, 6, 3, 8, 7, 2, 5, 3, 4, 3, 3, 2, 7, 9, 6, 8, 7, 2, 9, 10, 3, 8, 10, 6, 5, 4, 2, 3}, 3));
    }

    public static int solve(int[] A, int B) {
        Arrays.sort(A);
        int count = 0;
        int l = 0, r = 1;
        while (l < A.length - 1 && r < A.length - 1) {
            if (A[r] - A[l] == B) {
                count++;
                r++;
                l++;
            }
            if (A[r] - A[l] < B) {
                r++;
            } else {
                l++;
            }
        }
        return count;
    }
}
