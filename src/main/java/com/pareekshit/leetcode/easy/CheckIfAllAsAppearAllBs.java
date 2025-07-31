package main.java.com.pareekshit.leetcode.easy;

public class CheckIfAllAsAppearAllBs {
    public static void main(String[] args) {
        System.out.println(checkString("aaabbb"));
        System.out.println(checkString("abab"));
        System.out.println(checkString("bbb"));
    }
    public static boolean checkString(String s) {
        char[] arr = s.toCharArray();
        boolean a = false;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (a && arr[i] == 'b') return false;
            if (arr[i] == 'a') a = true;
        }
        return true;
    }
}
