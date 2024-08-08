package main.java.com.pareekshit.scaler.arrays.twoDimesionalMatrix;

public class MergeSortedIntervals {

    public static void main(String[] args) {
        solve(new int[][]{{1, 5}, {4, 6}, {7, 20}, {15, 30}, {31, 34}, {35, 50}});
    }

    public static int[][] solve(int[][] A) {
        int start = A[0][0], end = A[0][1];
        int[][] res = new int[A.length][2];
        int row = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i][0] <= end) {
                end = Math.max(end, A[i][1]);
            } else {
                res[row][0] = start;
                res[row][1] = end;
                start = A[i][0];
                end = A[i][1];
                row++;
            }
        }
        res[row][0] = start;
        res[row][1] = end;
        int count = 0;
        for (int i = 0; i < res.length; i++) {
            if (res[i][0] != 0) {
                count++;
            } else {
                break;
            }
        }
        int[][] ans = new int[count][2];
        for (int i = 0; i < count; i++) {
            ans[i][0] = res[i][0];
            ans[i][1] = res[i][1];
        }
        return ans;
    }
}
