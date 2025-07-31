package main.java.com.pareekshit.leetcode.easy;

import main.java.com.pareekshit.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheDifferenceOfTwoArrays {
    public static void main(String[] args) {
        Util.print2DArrayList(findDifference(new int[]{-68, -80, -19, -94, 82, 21, -43}, new int[]{-63}));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] arr = new int[2001];
        Arrays.fill(arr, 1001);
        for (int i : nums1) {
            arr[i + 1000] = i;
        }
        Set<Integer> list1 = new HashSet<>();
        for (int i : nums2) {
            if (arr[i + 1000] == 1001) {
                list1.add(i);
            }
        }

        Arrays.fill(arr, 1001);
        for (int i : nums2) {
            arr[i + 1000] = i;
        }
        Set<Integer> list2 = new HashSet<>();
        for (int i : nums1) {
            if (arr[i + 1000] == 1001) {
                list2.add(i);
            }
        }
        ans.add(list2.stream().toList());
        ans.add(list1.stream().toList());
        return ans;
    }
}
