package main.java.com.pareekshit.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArraysTwo {
    public static void main(String[] args) {
        Arrays.stream(intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2})).forEach(System.out::println);
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<>();
        for (int i : nums1) {
            if (map1.containsKey(i)) {
                map1.put(i, map1.get(i) + 1);
            } else {
                map1.put(i, 1);
            }
        }
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i : nums2) {
            if (map2.containsKey(i)) {
                map2.put(i, map2.get(i) + 1);
            } else {
                map2.put(i, 1);
            }
        }
        List<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map2.entrySet()) {
            if (map1.containsKey(entry.getKey())) {
                for (int j = 0; j < Math.min(map1.get(entry.getKey()), entry.getValue()); j++) {
                    res.add(entry.getKey());
                }
                map1.remove(entry.getKey());
            }
        }
        int[] ans = new int[res.size()];
        int count = 0;
        for (Integer re : res) {
            ans[count++] = re;
        }
        return ans;
    }
}
