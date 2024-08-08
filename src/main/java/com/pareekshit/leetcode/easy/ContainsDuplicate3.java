package main.java.com.pareekshit.leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate3 {
    public static void main(String[] args) {
        System.out.println(containsNearbyAlmostDuplicate(new int[]{1, 2, 3, 1}, 3, 0));
    }

    public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && Math.abs(map.get(nums[i]) - i) <= indexDiff && Math.abs(map.get(nums[i]) - i) <= indexDiff) {
                return true;
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }

    public static boolean containsNearbyDuplicateSlidingWindow(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            if (i > k) {
                set.remove(nums[i - k]);
            }
            set.add(nums[i]);
        }
        return false;
    }
}
