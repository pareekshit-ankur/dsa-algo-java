package main.java.com.pareekshit.recursion;

public class PalindromeString {

    public static void main(String[] args) {
        System.out.println(isPalindrome("abc", 0, "abc".length() - 1));
        System.out.println(isPalindrome("ada", 0, "ada".length() - 1));
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

    public static boolean isPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1)
            return false;
        /*if (l >= r)
            return true;*/
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }
        return isPalindrome(s.substring(1, s.length() - 1));
    }
}
