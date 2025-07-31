package main.java.com.pareekshit.leetcode.easy;

public class MaximumProductsOfTwoElementsInAnArray {
    public static void main(String[] args) {
        //System.out.println(maxProduct(new int[]{10, 2, 5, 2}));
        System.out.println(maxProduct(new int[]{3,7}));
    }

    public static int maxProduct(int[] nums) {
        int max = nums[0], maxIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }
        int secondMax = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != maxIndex && nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }
        return (secondMax - 1) * (max - 1);
    }
}
