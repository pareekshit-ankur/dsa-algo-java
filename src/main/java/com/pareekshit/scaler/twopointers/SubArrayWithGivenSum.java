package main.java.com.pareekshit.scaler.twopointers;

import main.java.com.pareekshit.Util;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        Util.printArray(solve(new int[]{5, 10, 20, 100, 105}, 110));
        Util.printArray(solve(new int[]{1, 2, 3, 4, 5}, 5));
        Util.printArray(solve(new int[]{1, 1000000000}, 1000000000));
    }

    public static int[] solve(int[] A, int B) {
        int sum = 0;
        int l = 0, r = 0;
        while (r < A.length) {
            sum += A[r++];
            while (sum > B) {
                sum -= A[l++];
            }
            if (sum == B) {
                int[] res = new int[r - l];
                for (int i = l, j = 0; i < r; i++, j++) {
                    res[j] = A[i];
                }
                return res;
            }
        }
        return new int[]{-1};
    }
}
