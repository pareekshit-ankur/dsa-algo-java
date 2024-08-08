package main.java.com.pareekshit.scaler.binarysearch;

public class MatrixSearch {
    public static void main(String[] args) {
        System.out.println(searchMatrix(new int[][]{
                {1}, {11}, {49}, {74}, {77}, {78}, {93}, {94}
        }, 49));
    }

    public static int searchMatrix(int[][] A, int B) {
        int row = 0;
        if (A[0][0] == B || A[A.length - 1][A[A.length - 1].length - 1] == B) {
            return 1;
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i][0] <= B && A[i][A[0].length - 1] >= B) {
                row = i;
            }

        }
        int N = A[row].length;
        int l = 0, r = N - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (A[row][mid] == B) {
                return 1;
            }
            if (A[row][mid] < B) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return 0;
    }
}
