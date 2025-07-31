package main.java.com.pareekshit.leetcode.easy;

public class FindMissingAndRepeatedValues {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] arr = new int[grid.length * grid.length + 1];
        int repeated = 0, missing = 0;
        for (int[] ints : grid) {
            for (int i : ints) {
                if (arr[i] == i) {
                    repeated = i;
                } else {
                    arr[i] = i;
                }
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != i) {
                missing = i;
            }
        }
        return new int[]{repeated, missing};
    }
}
