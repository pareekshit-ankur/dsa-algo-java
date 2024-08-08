package main.java.com.pareekshit.scaler.hashing;

import main.java.com.pareekshit.Util;

/**
 * Problem Description
 * Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B.
 * <p>
 * If the answer does not exist return an array with a single integer "-1".
 * <p>
 * First sub-array means the sub-array for which starting index in minimum.
 */
public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        Util.printArray(solve(new int[]{1, 2, 3, 4, 5}, 5));
        Util.printArray(solve(new int[]{5, 10, 20, 100, 105}, 110));

    }

    public static int[] solve(int[] A, int B) {
        int[] arr = new int[]{-1};
        int left = 0, right = 0;
        long sum = 0;
        while (right < A.length) {
            if (sum < B) {
                sum += (A[right] % 1000000007);
                sum %= 1000000007;
                right++;
            }
            if (sum > B) {
                sum -= (A[left] % 1000000007);
                sum %= 1000000007;
                left++;
            }
            if (sum == B) {
                arr = new int[Math.abs(left - right)];
                int index = 0;
                for (int i = left; i < right; i++) {
                    arr[index++] = A[i];
                }
                return arr;
            }
        }
        return arr;
    }
}
