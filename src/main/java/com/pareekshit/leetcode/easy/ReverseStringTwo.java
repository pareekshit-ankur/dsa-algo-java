package main.java.com.pareekshit.leetcode.easy;

public class ReverseStringTwo {
    public static void main(String[] args) {
        System.out.println(reverseStr("hyzqyljrnigxvdtneasepfahmtyhlohwxmkqcdfehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqlimjkfnqcqnajmebeddqsgl", 39));
        System.out.println(reverseStr("abcdefg", 8));
        System.out.println(reverseStr("abcd", 4));
        System.out.println(reverseStr("abcdefg", 2));
        System.out.println(reverseStr("abcd", 2));
    }

    public static String reverseStr(String s, int k) {
        if (k >= s.length()) {
            return new StringBuilder(s).reverse().toString();
        }
        char[] arr = s.toCharArray();
        int len = 0;
        while (len < arr.length) {
            int rem = arr.length - len;
            if (rem > k) {
                for (int i = len, j = i + k - 1; i < j && len + k <= arr.length; i++, j--) {
                    char c = arr[i];
                    arr[i] = arr[j];
                    arr[j] = c;
                }
            } else {
                for (int i = len, j = i + k - 1; i < j && len + k <= arr.length; i++, j--) {
                    char c = arr[i];
                    arr[i] = arr[j];
                    arr[j] = c;
                }
            }
            len += 2 * k;
        }
        return new String(arr);
    }
}
