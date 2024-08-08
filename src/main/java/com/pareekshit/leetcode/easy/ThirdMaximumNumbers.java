package main.java.com.pareekshit.leetcode.easy;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ThirdMaximumNumbers {
    public static void main(String[] args) {
        System.out.println(thirdMax1(new int[]{2, 2, 3, 1}));
        System.out.println(thirdMax1(new int[]{1, 1, 2}));
    }

    public static int thirdMax(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        } else {
            SortedSet<Integer> sortedSet = new TreeSet(Arrays.stream(nums).boxed().collect(Collectors.toList()));
            if (sortedSet.size() == 1) {
                return sortedSet.first();
            } else if (sortedSet.size() == 2) {
                return sortedSet.last();
            } else {
                sortedSet.remove(sortedSet.last());
                sortedSet.remove(sortedSet.last());
                return sortedSet.last();
            }
        }
    }

    public static int thirdMax1(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        } else {
            int secondMax = Integer.MIN_VALUE, thirdMax = Integer.MIN_VALUE;
            int max = Arrays.stream(nums).max().getAsInt();
            for (int num : nums) {
                if (num > secondMax && num < max) secondMax = num;
            }
            for (int num : nums) {
                if (num > thirdMax && num < secondMax) thirdMax = num;
            }
            return thirdMax;
        }
    }
}
