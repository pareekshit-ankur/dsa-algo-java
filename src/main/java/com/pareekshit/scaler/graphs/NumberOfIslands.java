package main.java.com.pareekshit.scaler.graphs;

public class NumberOfIslands {
    boolean[][] visited;
    int[] arrx = {0, -1, 1};
    int[] arry = {0, -1, 1};

    public int solve(int[][] A) {
        visited = new boolean[A.length][A[0].length];
        int ans = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][j] == 1 && !visited[i][j]) {
                    dfs(i, j, A);
                    ans++;
                }
            }
        }
        return (ans);
    }

    public void dfs(int i, int j, int[][] A) {
        visited[i][j] = true;

        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 3; l++) {
                int x = i + arrx[k];
                int y = j + arry[l];

                if (x >= 0 && x < A.length && y >= 0 && y < A[0].length && A[x][y] == 1 && !visited[x][y]) {
                    dfs(x, y, A);
                }
            }
        }
    }
}
