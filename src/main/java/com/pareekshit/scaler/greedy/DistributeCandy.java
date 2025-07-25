package main.java.com.pareekshit.scaler.greedy;

import java.util.Arrays;

public class DistributeCandy {
    public static void main(String[] args) {
        System.out.println(candy(new int[]{1, 5, 2, 1}));
        System.out.println(candy(new int[]{1, 2}));
    }

    public static int candy(int[] A) {
        int total = 0;
        int[] candies = new int[A.length];
        Arrays.fill(candies, 1);
        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }
        total = candies[A.length - 1];
        for (int i = A.length - 2; i >= 0; i--) {
            if (A[i] > A[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
            total += candies[i];
        }
        return total;
    }
}
