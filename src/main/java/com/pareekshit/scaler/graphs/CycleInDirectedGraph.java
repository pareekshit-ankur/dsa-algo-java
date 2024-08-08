package main.java.com.pareekshit.scaler.graphs;

import java.util.ArrayList;

public class CycleInDirectedGraph {
    int cycle = 0;

    public void isCycle(boolean[] visited, boolean[] activity, ArrayList<ArrayList<Integer>> adjList, int node) {
        visited[node] = true;
        activity[node] = true;
        for (int i = 0; i < adjList.get(node).size(); i++) {
            int y = adjList.get(node).get(i);
            if (!visited[y]) {
                isCycle(visited, activity, adjList, y);
            } else {
                if (activity[y]) cycle = 1;
            }
        }
        activity[node] = false;
    }

    public int solve(int A, ArrayList<ArrayList<Integer>> B) {
        //Build a adjacency list(to store a graph)
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= A; i++) {
            adjList.add(new ArrayList<Integer>());
        }

        for (ArrayList<Integer> integers : B) {
            int u = integers.get(0);
            int v = integers.get(1);
            adjList.get(u).add(v);//Directed graph
        }

        boolean[] visited = new boolean[A + 1];
        boolean[] activity = new boolean[A + 1];
        //check for the presence of cycle
        for (int i = 1; i <= A; i++) {
            isCycle(visited, activity, adjList, i);
        }
        return cycle;
    }
}
