package main.java.com.pareekshit.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        Set<Integer> res = new HashSet<>();
        for (int i : nums2) {
            if (set.contains(i))
                res.add(i);
        }
        int [] ans = new int[res.size()];
        int count = 0;
        for (Integer re : res) {
            ans[count++] = re;
        }
        return ans;
    }
}
