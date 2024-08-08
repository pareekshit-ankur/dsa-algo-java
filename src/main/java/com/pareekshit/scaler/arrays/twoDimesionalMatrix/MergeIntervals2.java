package main.java.com.pareekshit.scaler.arrays.twoDimesionalMatrix;

import main.java.com.pareekshit.Util;

public class MergeIntervals2 {

    public static void main(String[] args) {
        Util.print2DArray(insert(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5}));
    }

    public static int[][] insert(int[][] A, int[] B) {
        int index = 0, i = 0;
        int[][] arr = new int[A.length + 1][2];
        while (i < A.length) {
            if (A[i][0] < B[0]) {
                arr[index++] = A[i];
            } else {
                arr[index++] = B;
                break;
            }
            i++;
        }
        if (i == A.length) {
            arr[index] = B;
        } else {
            while (i < A.length) {
                arr[index++] = A[i];
                i++;
            }
        }

        return mergeIntervals(arr);
    }

    public static int[][] mergeIntervals(int[][] A) {
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
