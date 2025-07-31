package main.java.com.pareekshit.leetcode.easy;

public class PercentageOfLetterInString {
    public static void main(String[] args) {
        System.out.println(percentageLetter("foobar", 'o'));
        System.out.println(percentageLetter("sgawtb", 's'));
    }

    public static int percentageLetter(String s, char letter) {
        char[] arr = s.toCharArray();
        int[] vis = new int[26];
        for (char c : arr) {
            vis[c - 'a'] += 1;
        }
        return Math.toIntExact((long) Math.floor(((vis[letter - 'a'] * 1.0) / s.length()) * 100));
    }
}
