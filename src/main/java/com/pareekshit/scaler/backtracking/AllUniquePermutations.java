package main.java.com.pareekshit.scaler.backtracking;

import main.java.com.pareekshit.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


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

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums==null || nums.length==0) return res;
        boolean[] used = new boolean[nums.length];
        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums);
        dfs(nums, used, list, res);
        return res;
    }

    public void dfs(int[] nums, boolean[] used, List<Integer> list, List<List<Integer>> res){
        if(list.size()==nums.length){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;
            if(i>0 &&nums[i-1]==nums[i] && !used[i-1]) continue;
            used[i]=true;
            list.add(nums[i]);
            dfs(nums,used,list,res);
            used[i]=false;
            list.remove(list.size()-1);
        }
    }

    public List<List<Integer>> permuteList1(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length == 1) {
            List<Integer> singleList = new ArrayList<>();
            singleList.add(nums[0]);
            res.add(singleList);
            return res;
        }

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int[] remainingNums = new int[nums.length - 1];
            int index = 0;
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    remainingNums[index] = nums[j];
                    index++;
                }
            }

            List<List<Integer>> perms = permuteList1(remainingNums);
            for (List<Integer> p : perms) {
                p.add(n);
            }

            res.addAll(perms);
        }

        return res;
    }

}
