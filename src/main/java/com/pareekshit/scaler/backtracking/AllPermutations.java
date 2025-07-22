package main.java.com.pareekshit.scaler.backtracking;

import main.java.com.pareekshit.Util;

import java.util.ArrayList;
import java.util.List;


public class AllPermutations {
    static int row = 0;

    public static void main(String[] args) {
        Util.print2DArray(permute(new int[]{1, 2, 3}));
        System.out.println();
        Util.print2DArrayList(permuteList(new int[]{1, 2, 3}));
    }

    public static int[][] permute(int[] A) {
        boolean[] visited = new boolean[A.length];
        int[] ans = new int[A.length];
        int[][] arr = new int[6][A.length];
        permute(A, 0, ans, visited, arr);
        return arr;
    }

    public static void permute(int[] A, int index, int[] ans, boolean[] visited, int[][] arr) {
        int N = A.length;
        if (index == N) {
            arr[row++] = ans.clone();
        }
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                ans[index] = A[i];
                permute(A, index + 1, ans, visited, arr);
                visited[i] = false;
            }
        }
    }

    public static List<List<Integer>> permuteList(int[] A) {
        boolean[] visited = new boolean[A.length];
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> arr= new ArrayList<>();
        permuteList(A, 0, ans, visited, arr);
        return arr;
    }

    public static void permuteList(int[] A, int index, List<Integer> ans, boolean[] visited, List<List<Integer>> arr) {
        int N = A.length;
        if (index == N) {
            arr.add(new ArrayList<>(ans));
        }
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                ans.add(index, A[i]);
                permuteList(A, index + 1, ans, visited, arr);
                visited[i] = false;
            }
        }
    }

}
