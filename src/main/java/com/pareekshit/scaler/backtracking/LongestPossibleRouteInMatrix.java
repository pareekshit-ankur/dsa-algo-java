package main.java.com.pareekshit.scaler.backtracking;

public class LongestPossibleRouteInMatrix {
    public static void main(String[] args) {
        //System.out.println(solve(new int[]{0, 0}, new int[]{2, 2}, new int[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}}));
        System.out.println(solve(new int[]{0, 0}, new int[]{1, 1}, new int[][]{{1, 1}, {1, 1}}));
    }


    public static int solve(int[] A, int[] B, int[][] C) {
        int[] arr = new int[1];
        boolean[][] visited = new boolean[C.length][C[0].length];
        solve(C, A[0], A[1], 0, B[0], B[1], arr, visited);
        return arr[0];
    }

    public static void solve(int[][] C, int row, int col, int count, int endRow, int endCol, int[] ans, boolean[][] visited) {
        if (row == endRow && col == endCol) {
            ans[0] = Math.max(count, ans[0]);
            return;
        }
        if (row < C.length - 1 && C[row + 1][col] == 1 && !visited[row + 1][col]) {
            visited[row + 1][col] = true;
            solve(C, row + 1, col, count + 1, endRow, endCol, ans, visited);
            visited[row + 1][col] = false;
        }
        if (col < C[0].length - 1 && C[row][col + 1] == 1 && !visited[row][col + 1]) {
            visited[row][col + 1] = true;
            solve(C, row, col + 1, count + 1, endRow, endCol, ans, visited);
            visited[row][col + 1] = false;
        }
        if (row > 0 && row < C.length && C[row - 1][col] == 1 && !visited[row - 1][col]) {
            visited[row - 1][col] = true;
            solve(C, row - 1, col, count + 1, endRow, endCol, ans, visited);
            visited[row - 1][col] = false;
        }
        if (col > 0 && col < C[0].length && C[row][col - 1] == 1 && !visited[row][col - 1]) {
            visited[row][col - 1] = true;
            solve(C, row, col - 1, count + 1, endRow, endCol, ans, visited);
            visited[row][col - 1] = false;
        }
    }
}
