package main.java.com.pareekshit.scaler.graphs;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopologicalSort {
    public int[] solve(int A, int[][] B) {
        int[] indegree = new int[A + 1];
        ArrayList<Integer>[] adj = new ArrayList[A + 1];
        for (int i = 0; i < adj.length; i++) adj[i] = new ArrayList<>();

        for (int[] ints : B) {
            adj[ints[0]].add(ints[1]);
            indegree[ints[1]]++;
        }

        Queue<Integer> queue = new PriorityQueue<>();
        for (int i = 1; i < indegree.length; i++) {
            if (indegree[i] == 0) queue.add(i);
        }
        if (queue.isEmpty()) return new int[]{};
        int[] ts = new int[A];
        int index = 0;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            ts[index++] = node;
            ArrayList<Integer> list = adj[node];
            for (int a : list) {
                indegree[a]--;
                if (indegree[a] == 0) queue.add(a);
            }
        }
        return ts;
    }
}
