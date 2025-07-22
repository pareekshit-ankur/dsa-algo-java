package main.java.com.pareekshit.leetcode.easy;

public class RemoveTrailingZerosFromString {
    public static void main(String[] args) {
        System.out.println(removeTrailingZeros("51230100"));
    }
    public static String removeTrailingZeros(String num) {
        char[] arr = num.toCharArray();
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != '0') {
                index = i;
                break;
            }
        }
        return num.substring(0, index+1);
    }
}
