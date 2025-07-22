package main.java.com.pareekshit.leetcode.easy;

public class FindFirstPalindromicStringInArray {
    public static void main(String[] args) {
        System.out.println(firstPalindrome(new String[]{"abc","car","ada","racecar","cool"}));
        System.out.println(firstPalindrome(new String[]{"notapalindrome","racecar"}));
    }
    public static String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word, 0, word.length() - 1))
            return word;
        }
        return "";
    }

    public static boolean isPalindrome(String s, int l, int r) {
        if (s == null)
            return false;
        if (l >= r)
            return true;
        if (s.charAt(l) != s.charAt(r)) {
            return false;
        }
        return isPalindrome(s, l + 1, r - 1);
    }
}
