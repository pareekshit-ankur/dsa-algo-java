package main.java.com.pareekshit.scaler.backtracking;

import main.java.com.pareekshit.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NumberOfSquarefulArrays {
    static int row = 0;
    static int[][] arr;

    public static void main(String[] args) {
        Util.print2DArray(subsets(new int[]{1, 2, 3}));
        Util.print2DArray(subsets(new int[]{1, 2, 2}));
        Util.print2DArray(subsets(new int[]{9, -20, -11, -8, -4, 2, -12, 14, 1, -18}));
    }

    public static int[][] subsets(int[] A) {
        row = 0;
        Arrays.sort(A);
        int[] B = new int[A.length];
        for (int i = 0, j = A.length - 1; i < A.length; i++, j--) {
            B[i] = A[j];
        }
        ArrayList<Integer> list = new ArrayList<>();
        arr = new int[(int) Math.pow(2, A.length)][];
        subsets(B, 0, list);
        return arr;
    }

    public static void subsets(int[] A, int index, ArrayList<Integer> ans) {
        int N = A.length;
        if (index == N) {
            arr[row++] = ans.stream().mapToInt(Integer::intValue).toArray().clone();
            return;
        }
        subsets(A, index + 1, ans);
        ans.add(A[index]);
        subsets(A, index + 1, ans);
        ans.remove(ans.size() - 1);
    }


    private ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();

    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        Collections.sort(A);
        rec(A, 0, new ArrayList<>());
        return ans;
    }

    void rec(ArrayList<Integer> A, int start, ArrayList<Integer> t) {
        ans.add(new ArrayList<>(t));
        if (start >= A.size()) {
            return;
        }
        for (int i = start; i < A.size(); i++) {
            t.add(A.get(i));
            rec(A, i + 1, t);

            //  Remove last element
            int index = t.size() - 1;
            t.remove(index);
        }
    }

    boolean checkSquareNumber(int n) {
        int num = (int) Math.sqrt(n);
        return (num * num == n);
    }
}
