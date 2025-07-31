package main.java.com.pareekshit.leetcode.easy;

public class CheckBalancedString {
    public boolean isBalanced(String num) {
        int even = 0, odd = 0;
        char[] arr = num.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                even += Character.getNumericValue(arr[i]);
            } else {
                odd += Character.getNumericValue(arr[i]);
            }
        }
        return odd == even;
    }
}
