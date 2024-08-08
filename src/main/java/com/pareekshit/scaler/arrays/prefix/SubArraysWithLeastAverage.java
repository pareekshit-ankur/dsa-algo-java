package main.java.com.pareekshit.scaler.arrays.prefix;

public class SubArraysWithLeastAverage {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{3, 7, 90, 20, 10, 50, 40}, 3));
        System.out.println(solve(new int[]{3, 7, 5, 20, -10, 0, 12}, 2));
        System.out.println(solve(new int[]{15, 7, 11, 7, 9, 8, 18, 1, 16, 18, 6, 1, 1, 4, 18}, 6));
        System.out.println(solve(new int[]{20, 3, 13, 5, 10, 14, 8, 5, 11, 9, 1, 11}, 9));
    }

    public static int solve(int[] A, int B) {
        int minIndex = 0, n = A.length;
        int sum = 0;
        for (int i = 0; i < B; i++) {
            sum += A[i];
        }
        double avg = (double) sum / B;
        for (int i = B; i < n; i++) {
            sum += A[i];
            sum -= A[i - B];
            if (((double) sum / B) < avg) {
                avg = (double) sum / B;
                minIndex = (i - B) + 1;
            }
        }
        return minIndex;
    }
}
