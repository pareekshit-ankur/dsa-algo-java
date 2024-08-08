package main.java.com.pareekshit.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array nums of size n, return the majority element.
 * <p>
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 * <p>
 * Example 1:
 * Input: nums = [3,2,3]
 * Output: 3
 * <p>
 * Example 2:
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 */
public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 3};

        //Solution 1
        Map<Integer, Integer> map = new HashMap<>();
        int maxCount = Integer.MIN_VALUE, maxValue = Integer.MIN_VALUE;
        for (int num : nums) {
            int value = 0;
            if (map.containsKey(num)) {
                value = map.get(num);
                value = value + 1;
                map.put(num, value);
                if (value > maxCount) {
                    maxCount = value;
                    maxValue = num;
                }
            } else {
                value = value + 1;
                map.put(num, value);
                if (value > maxCount) {
                    maxCount = value;
                    maxValue = num;
                }
            }
        }
        System.out.println(maxValue);

        //Solution 2 Bayer Moore Algorithm
        int candidate = 0, frequency = 0;
        for (int num : nums) {
            if (frequency == 0) {
                candidate = num;
            }
            if (num == candidate) {
                frequency++;
            } else {
                frequency--;
            }
        }
        System.out.println(candidate);
    }
}
