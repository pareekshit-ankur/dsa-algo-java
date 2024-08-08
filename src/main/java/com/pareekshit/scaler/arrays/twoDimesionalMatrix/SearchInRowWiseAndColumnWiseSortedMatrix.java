package main.java.com.pareekshit.scaler.arrays.twoDimesionalMatrix;

public class SearchInRowWiseAndColumnWiseSortedMatrix {
    public static void main(String[] args) {
        System.out.println(solve(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 2));
        System.out.println(solve(new int[][]{{2, 8, 8, 8}, {2, 8, 8, 8}, {2, 8, 8, 8}}, 8));
    }

    public static int solve(int[][] A, int B) {
        int r = 0, c = A[0].length - 1;
        int ans = Integer.MAX_VALUE;
        while (r < A.length && c >= 0) {
            if (A[r][c] == B) {
                ans = Math.min(((r + 1) * 1009 + c + 1), ans);
                c--;
            } else if (A[r][c] < B) {
                r++;
            } else {
                c--;
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
