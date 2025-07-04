package main.java.com.pareekshit.leetcode.easy;

public class ReverseWordsInString3 {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
        System.out.println(reverseWords("Mr Ding"));
    }

    public static String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int i, j;
        for (i = 0, j = 0; j < arr.length; j++) {
            if (Character.isSpaceChar(arr[j])) {
                int p = i, q = j - 1;
                for (; p < q; p++, q--) {
                    char temp = arr[p];
                    arr[p] = arr[q];
                    arr[q] = temp;
                }
                i = j;
            } else {
                if (j > 0 && Character.isSpaceChar(arr[j - 1])) {
                    i = j;
                }
            }
        }
        int p = i, q = j - 1;
        for (; p < q; p++, q--) {
            char temp = arr[p];
            arr[p] = arr[q];
            arr[q] = temp;
        }
        return new String(arr);
    }
}
