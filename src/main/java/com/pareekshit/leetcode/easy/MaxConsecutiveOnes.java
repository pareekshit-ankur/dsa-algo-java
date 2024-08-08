package main.java.com.pareekshit.leetcode.easy;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
        System.out.println(findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1}));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        int i;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                max = Math.max(max, count);
                count = 0;
            } else {
                count++;
            }
        }
        return Math.max(count, max);
    }
}
