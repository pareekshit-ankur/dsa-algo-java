package main.java.com.pareekshit.scaler.graphs;

import java.util.ArrayList;

public class PathInDirectedGraph {
    public static void main(String[] args) {
        System.out.println(solve(2, new int[][]{{1, 2}}));
        System.out.println(solve(4, new int[][]{{1, 2}, {2, 3}, {4, 3}}));
    }

    static boolean[] visited;
    static ArrayList<Integer>[] al;

    public static int solve(int A, int[][] B) {
        visited = new boolean[A + 1];
        al = new ArrayList[A + 1];
        for (int i = 0; i < al.length; i++) {
            al[i] = new ArrayList<Integer>();
        }
        for (int[] value : B) {
            al[value[0]].add(value[1]);
        }
        dfs(1, al);
        if (visited[A]) {
            return 1;
        }
        return 0;
    }

    public static boolean dfs(int i, ArrayList<Integer>[] B) {
        visited[i] = true;
        for (int n : B[i - 1]) {
            if (!visited[n] && dfs(n, B)) {
                dfs(n, B);
                return true;
            }
        }
        return false;
    }
}
