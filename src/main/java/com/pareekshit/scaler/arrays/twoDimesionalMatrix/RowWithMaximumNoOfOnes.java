package main.java.com.pareekshit.scaler.arrays.twoDimesionalMatrix;

public class RowWithMaximumNoOfOnes {
    public static void main(String[] args) {
        solve(new int[][]{{}});
    }

    public static int solve(int[][] A) {
        int r = 0, c = A[0].length - 1;
        int ans = -1;
        while (r < A.length && c >= 0) {
            while (c >= 0 && A[r][c] == 1) {
                c--;
                ans = r;
            }
            r++;
        }
        return ans;
    }
}
