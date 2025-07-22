package main.java.com.pareekshit.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class PermutationDifferenceBetweenTwoStrings {
    public static void main(String[] args) {
        System.out.println(findPermutationDifference("abcde", "edbac"));
    }

    public static int findPermutationDifference(String s, String t) {
        int diff = 0;
        Map<Character, Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        arr = t.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            diff += Math.abs(i - map.get(arr[i]));
        }
        return diff;
    }
}
