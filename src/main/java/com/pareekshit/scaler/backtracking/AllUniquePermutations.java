package main.java.com.pareekshit.scaler.backtracking;

import main.java.com.pareekshit.Util;

import java.util.HashMap;


public class AllUniquePermutations {
    static int row = 0;

    public static void main(String[] args) {
        Util.print2DArray(permute(new int[]{1, 1, 2}));
    }

    public static int[][] permute(int[] A) {
        boolean[] visited = new boolean[A.length];
        int[] ans = new int[A.length];
        int[][] arr = new int[factorial(A.length)][A.length];
        row = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : A) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        permute(A, 0, ans, visited, arr, map);
        return arr;
    }

    public static void permute(int[] A, int index, int[] ans, boolean[] visited, int[][] arr, HashMap<Integer, Integer> map) {
        int N = A.length;
        if (index == N) {
            arr[row++] = ans.clone();
            return;
        }
        for (int i = 0; i < N; i++) {
            if (!visited[i] && map.containsKey(A[i]) && map.get(A[i]) > 0) {
                visited[i] = true;
                ans[index] = A[i];
                int value = map.get(A[i]) - 1;
                if (value == 0) {
                    map.remove(i);
                } else {
                    map.put(i, value);
                }
                permute(A, index + 1, ans, visited, arr, map);
                visited[i] = false;
            }
        }
    }

    static int factorial(int number) {
        int factorial = 1;
        if (number == 1 || number == 0) {
            return 1;
        } else {
            factorial = number * factorial(number - 1);
        }
        return factorial;
    }

}
