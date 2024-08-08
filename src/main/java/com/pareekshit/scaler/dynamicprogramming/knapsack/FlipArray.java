package main.java.com.pareekshit.scaler.dynamicprogramming.knapsack;

public class FlipArray {
    public int solve(final int[] A) {
        int totalSum = 0;
        for (int i : A) {
            totalSum += i;
        }
        return totalSum;
    }
}
