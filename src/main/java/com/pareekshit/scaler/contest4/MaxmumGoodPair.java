package main.java.com.pareekshit.scaler.contest4;

public class MaxmumGoodPair {
    public static void main(String[] args) {
        System.out.println(solve("bcc", "abc"));
        System.out.println(solve("add", "abcd"));
        System.out.println(solve("aabcccccd", "aaabbb"));
        System.out.println(solve("aabccddd", "aaccdd"));
    }

    public static int solve(String A, String B) {
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();
        int max = 0;
        int i;
        if (a.length > b.length) {
            i = b.length - 1;
        } else {
            i = a.length - 1;
        }

        for (int j = b.length - 1; i >= 0 && j >= 0; ) {
            if (i <= j) {
                if (a[i] >= b[j]) {
                    max = Math.max(max, Math.abs(i - j));
                    i--;
                } else {
                    j--;
                }
            } else {
                i--;
            }
        }
        return max;
    }
}
