package main.java.com.pareekshit.leetcode;

import main.java.com.pareekshit.Util;

/**
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 * <p>
 * Example 1:
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * <p>
 * Example 2:
 * Input: nums = [-1,-100,3,99], k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 */
public class RotateArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        rotate(nums, 2);
        Util.printArray(nums);
        rotate(nums, 0);
        Util.printArray(nums);
    }

    public static void rotate(int[] nums, int k) {
        int n = k % nums.length;
        if (nums.length % 2 == 0) {
            for (int i = 0, p = n; i < n; i++, p++) {
                int temp = nums[i];
                nums[i] = nums[p];
                nums[p] = temp;
            }
        } else {
            int num = nums[n];
            for (int i = 0, p = n + 1; p < nums.length; i++, p++) {
                int temp = nums[i];
                nums[i] = nums[p];
                nums[p - 1] = temp;
            }
            nums[nums.length - 1] = num;
        }
    }
}
