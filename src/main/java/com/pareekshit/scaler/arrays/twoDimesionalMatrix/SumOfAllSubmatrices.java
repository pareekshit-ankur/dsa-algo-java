package main.java.com.pareekshit.scaler.arrays.twoDimesionalMatrix;

public class SumOfAllSubmatrices {
    public static void main(String[] args) {

        System.out.println(solve(new int[][]{{}}));
    }

    public static int solve(int[][] A) {
        int ans = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                ans += A[i][j] * (i + 1) * (j + 1) * (A.length - i) * (A[i].length - j);
            }
        }
        return ans;
    }
}
