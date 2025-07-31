package main.java.com.pareekshit.leetcode.easy;

public class SumOfUniqueElements {
    public int sumOfUnique(int[] nums) {
        int[] arr = new int[101];
        for (int num : nums) {
            arr[num] += 1;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                sum += i;
            }
        }
        return sum;
    }
}
