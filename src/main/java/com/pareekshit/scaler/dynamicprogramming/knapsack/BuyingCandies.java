package main.java.com.pareekshit.scaler.dynamicprogramming.knapsack;

/**
 * Rishik likes candies a lot. So, he went to a candy-shop to buy candies.
 *
 * The shopkeeper showed him N packets each containg A[i] candies for cost of C[i] nibbles, each candy in that packet has a sweetness B[i]. The shopkeeper puts the condition that Rishik can buy as many complete candy-packets as he wants but he can't buy a part of the packet.
 *
 * Rishik has D nibbles, can you tell him the maximum amount of sweetness he can get from candy-packets he will buy?
 */
public class BuyingCandies {
    public int solve(int[] A, int[] B, int[] C, int D) {
        int[] arr = new int[D + 1];
        for (int i = 1; i <= D; i++) {
            for (int j = 0; j < C.length; j++) {
                if (C[j] <= i) {
                    arr[i] = Math.max(arr[i], arr[i - C[j]] + (A[j] * B[j]));
                }
            }
        }
        return arr[D];
    }
}
