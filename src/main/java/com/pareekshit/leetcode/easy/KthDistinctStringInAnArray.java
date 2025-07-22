package main.java.com.pareekshit.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * A distinct string is a string that is present only once in an array.
 * <p>
 * Given an array of strings arr, and an integer k, return the kth distinct string present in arr. If there are fewer than k distinct strings, return an empty string "".
 * <p>
 * Note that the strings are considered in the order in which they appear in the array.
 */
public class KthDistinctStringInAnArray {

    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new HashMap<>();
        Arrays.stream(arr).forEach(s -> {
            map.computeIfPresent(s, (key, value) -> value + 1);
            map.putIfAbsent(s, 1);
        });
        int distinctCount =0;
        for (String s : arr) {
            if (map.get(s) == 1) {
                distinctCount++;
                if (distinctCount == k) {
                    return s;
                }
            }
        }
        return "";
    }
}
