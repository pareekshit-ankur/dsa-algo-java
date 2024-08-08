package main.java.com.pareekshit.scaler.contest2;

public class DecreasingDishes {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{10, 4, 9, 1, 3, 5}));
    }

    public static int solve(int[] A) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            int prev = A[i];
            int sum = prev;
            for (int j = i + 1; j < A.length; j++) {
                if (A[j] < prev) {
                    sum += A[j];
                    prev = A[j];
                } else {
                    break;
                }
            }
            if (max < sum) {
                max = sum;
            }
        }
        return max;
    }
}
