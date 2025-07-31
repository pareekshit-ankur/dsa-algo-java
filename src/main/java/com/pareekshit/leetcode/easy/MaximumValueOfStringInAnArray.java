package main.java.com.pareekshit.leetcode.easy;

public class MaximumValueOfStringInAnArray {

    public int maximumValue(String[] strs) {
        int max = 0;
        for (String str : strs) {
            if (onlyDigits(str)){
                max = Math.max(max, Integer.parseInt(str));
            }else {
                max = Math.max(max, str.length());
            }
        }
        return max;
    }

    public boolean onlyDigits(String s) {

        // Regex to check if the string
        // contains only digits
        return s.matches("[0-9]+");
    }
}
