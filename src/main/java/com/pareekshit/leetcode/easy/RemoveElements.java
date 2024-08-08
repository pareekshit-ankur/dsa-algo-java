package main.java.com.pareekshit.leetcode.easy;

public class RemoveElements {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3, 2, 2, 3}, 3));
        System.out.println(removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }

    public static int removeElement(int[] nums, int val) {
        int i, j;
        for (i = 0, j = 0; j < nums.length; ) {
            if (nums[j] == val) {
                j++;
            } else {
                nums[i] = nums[j];
                j++;
                i++;
            }
        }
        return i;
    }

}

