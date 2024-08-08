package main.java.com.pareekshit.scaler.maths;

import main.java.com.pareekshit.Util;

public class PascalsTriangle {
    public static void main(String[] args) {
        Util.print2DArray(solve(3));
        Util.print2DArray(solve(5));
    }

    public static int[][] solve(int A) {
        int[][] arr = new int[A][A];
        for (int i = 0; i < A; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j || j == 0) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }
            }
        }
        return arr;
    }
}
