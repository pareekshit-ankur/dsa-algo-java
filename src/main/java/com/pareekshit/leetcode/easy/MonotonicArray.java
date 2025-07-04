package main.java.com.pareekshit.leetcode.easy;

public class MonotonicArray {
    public static void main(String[] args) {
        System.out.println(isMonotonic(new int[]{1, 2, 2, 3}));
        System.out.println(isMonotonic(new int[]{6, 5, 4, 4}));
        System.out.println(isMonotonic(new int[]{1, 3, 2}));
        System.out.println(isMonotonic(new int[]{1, 1, 2}));
    }

    public static boolean isMonotonic(int[] nums) {
        boolean incr = false, decr = false;
        if (nums.length == 1) return true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] == 0) {
                continue;
            }
            if (!incr && !decr) {
                if (nums[i + 1] - nums[i] > 0) {
                    incr = true;
                } else {
                    decr = true;
                }
            }
            if ((nums[i + 1] - nums[i] > 0 && decr) || (nums[i] - nums[i + 1] > 0 && incr)) {
                return false;
            }
        }
        return true;
    }
}
