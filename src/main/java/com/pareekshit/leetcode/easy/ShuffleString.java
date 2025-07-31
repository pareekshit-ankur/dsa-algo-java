package main.java.com.pareekshit.leetcode.easy;

public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        char[] arr = new char[indices.length];
        int i = 0;
        for (int index : indices) {
            arr[index] = s.charAt(i);
            i++;
        }
        return new String(arr);
    }
}
