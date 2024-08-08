package main.java.com.pareekshit.scaler.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class AnotherBfs {

    public int solve(int A, int[][] B, int C, int D) {
        ArrayList<int[]>[] adj = new ArrayList[A + 1];
        PriorityQueue<int[]> q = new PriorityQueue<>(Comparator.comparingInt(i -> i[1]));
        // create the graph
        for (int i = 0; i < adj.length; i++) adj[i] = new ArrayList<>();
        for (int[] ints : B) {
            adj[ints[0]].add(new int[]{ints[1], ints[2]});
            adj[ints[1]].add(new int[]{ints[0], ints[2]});
        }

        boolean[] visited = new boolean[A];
        Arrays.fill(visited, false); // init the visited array
        int ans = Integer.MAX_VALUE;

        q.add(new int[]{C, 0});

        while (!q.isEmpty()) {
            int[] node = q.poll();
            visited[node[0]] = true;
            if (node[0] == D) ans = Math.min(ans, node[1]);
            for (int[] temp : adj[node[0]]) {
                if (!visited[temp[0]]) q.add(new int[]{temp[0], temp[1] + node[1]});
            }
        }

        if (ans == Integer.MAX_VALUE) return -1;
        return ans;
    }
}
