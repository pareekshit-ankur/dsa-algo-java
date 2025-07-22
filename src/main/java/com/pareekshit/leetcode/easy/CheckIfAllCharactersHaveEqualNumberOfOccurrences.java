package main.java.com.pareekshit.leetcode.easy;

public class CheckIfAllCharactersHaveEqualNumberOfOccurrences {
    public boolean areOccurrencesEqual(String s) {
        int[] arr = new int[26];
        for (char c : s.toCharArray()) {
            arr[c - 'a'] += 1;
        }
        int num = -1;
        for (int k : arr) {
            if (k > 0) {
                num = k;
                break;
            }
        }

        for (int j : arr) {
            if (j != num && j != 0) {
                return false;
            }
        }
        return true;
    }
}
