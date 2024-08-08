package main.java.com.pareekshit.leetcode.easy;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 2}));
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }

    public static int removeDuplicates(int[] nums) {
        int i, j;
        for (i = 0, j = 1; j < nums.length; ) {
            if (nums[i] != nums[j]) {
                nums[i + 1] = nums[j];
                j++;
                i++;
            } else {
                j++;
            }
        }
        return i + 1;
    }

}

