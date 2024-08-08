package main.java.com.pareekshit.leetcode.easy;

public class ImplementStrStr {

    public static void main(String[] args) {
        System.out.println(strStr("badc", "baba"));
        System.out.println(strStr("add", "egg"));
        System.out.println(strStr("foo", "bar"));
    }

    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }
        for (int i = 0; i < haystack.length(); i++) {

        }
        return -1;
    }
}
