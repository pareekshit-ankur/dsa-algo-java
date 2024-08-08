package main.java.com.pareekshit.scaler.arrays.prefix;

public class MaximumSubArrays {
    public static void main(String[] args) {
        System.out.println(maxSubarray(5, 12, new int[]{2, 1, 3, 4, 5}));
    }

    public static int maxSubarray(int A, int B, int[] C) {
        int max = 0;
        for (int i = 0; i < A; i++) {
            int sum = 0;
            for (int j = i; j < A; j++) {
                sum += C[j];
                if (sum > B) {
                    break;
                }
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}
