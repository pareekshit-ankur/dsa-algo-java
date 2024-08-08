package main.java.com.pareekshit.leetcode.top.interview;

public class FindIndexOfFirstOccurrenceOfString {
    public static void main(String[] args) {
        System.out.println(strStr("leetcode", "leeto"));
        System.out.println(strStr("mississippi", "issip"));
        System.out.println(strStr("mississippi", "issipi"));
    }

    public static int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }
        for (int i = 0, j = 0; i < haystack.length() && j < needle.length(); ) {
            if (haystack.charAt(i) != needle.charAt(j)) {
                i++;
            } else {
                int index = i;
                boolean isPresent = true;
                while (i < haystack.length() && j < needle.length()) {
                    if (haystack.charAt(i) != needle.charAt(j)) {
                        isPresent = false;
                        j = 0;
                        i = index + 1;
                        break;
                    }
                    i++;
                    j++;
                }
                if (isPresent && j == needle.length()) {
                    return index;
                }
            }
        }
        return -1;
    }
}
