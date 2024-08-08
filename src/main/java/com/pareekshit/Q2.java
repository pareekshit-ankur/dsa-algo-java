package main.java.com.pareekshit;

/**
 * The partition problem is to determine whether a given set can be partitioned into two subsets such that the sum of elements in both subsets is the same.
 * Example 1:
 * Input: [1, 5, 11, 5]
 * Output: true
 * Explanation: The array can be partitioned into [1, 5, 5] and [11] with equal sums.
 * Example 2:
 * Input: [1, 2, 3, 5]
 * Output: false
 * Explanation: It is not possible to partition the array into two subsets with equal sums.
 */
public class Q2 {

    public static void main(String[] args) {
        System.out.println(checkSubset(new int[]{1, 5, 11, 5}));
        System.out.println(checkSubset(new int[]{1, 2, 3, 5}));
        System.out.println(checkSubset(new int[]{4, 6, 8, 10}));
    }

    private static boolean checkSubset(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == total - sum) {
                    return true;
                }
            }
        }
        return false;
    }
}
