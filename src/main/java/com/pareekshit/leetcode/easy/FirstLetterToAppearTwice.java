package main.java.com.pareekshit.leetcode.easy;

public class FirstLetterToAppearTwice {
    public char repeatedCharacter(String s) {
        char[] arr = s.toCharArray();
        int[] vis = new int[26];
        for (char c : arr) {
            if (vis[c - 'a'] == 1) {
                return c;
            } else {
                vis[c - 'a'] = 1;
            }
        }
        return ' ';
    }
}
