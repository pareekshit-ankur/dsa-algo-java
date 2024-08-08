package main.java.com.pareekshit.scaler.arrays;

public class ContinuosSumQuery {

    public static void main(String[] args) {
        System.out.println(solve(5, new int[][]{{1, 2, 10}, {2, 3, 20}, {2, 5, 25}}));
    }

    public static int[] solve(int A, int[][] B) {
        int[] arr = new int[A];
        for (int i = 0; i < B.length; i++) {
            arr[B[i][0] - 1] += B[i][2];
            if (B[i][1] != A) {
                arr[B[i][1]] -= B[i][2];
            }
        }
        for (int i = 1; i < A; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }
}
