package main.java.com.pareekshit.scaler.dynamicprogramming.knapsack;

public class Zero1Knapsack {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{60, 100, 120}, new int[]{10, 20, 30}, 50));
        System.out.println(solve(new int[]{359, 963, 465, 706, 146, 282, 828, 962, 492}, new int[]{96, 43, 28, 37, 92, 5, 3, 54, 93}, 383));
    }

    public static int solve(int[] A, int[] B, int C) {
        int[][] arr = new int[A.length][C + 1];
        for (int i = 0; i < A.length; i++) {
            for (int j = 1; j <= C; j++) {
                if (i == 0 || j == 0) {
                    arr[i][j] = 0;
                } else if (j >= B[i]) {
                    arr[i][j] = Math.max(arr[i - 1][j], arr[i - 1][j - B[i]] + A[i]);
                } else {
                    arr[i][j] = arr[i - 1][j];
                }
            }
        }
        return arr[A.length - 1][C];
    }

    public static int solveWorking(int[] A, int[] B, int C) {
        int[][] arr = new int[A.length + 1][C + 1];
        for (int i = 0; i <= A.length; i++) {
            for (int j = 0; j <= C; j++) {
                if (i == 0 || j == 0) {
                    arr[i][j] = 0;
                } else if (j >= B[i - 1]) {
                    arr[i][j] = Math.max(arr[i - 1][j], arr[i - 1][j - B[i - 1]] + A[i - 1]);
                } else {
                    arr[i][j] = arr[i - 1][j];
                }
            }
        }
        return arr[A.length][C];
    }
}
