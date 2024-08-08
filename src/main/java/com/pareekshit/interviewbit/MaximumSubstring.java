package main.java.com.pareekshit.interviewbit;

import java.util.ArrayList;
import java.util.List;

public class MaximumSubstring {
    public static void main(String[] args) {
        System.out.println(solve("baab", 2));
        System.out.println(solve("baabbbabbaabbaaaabbbbbababbbaababbbaabbbbabbaa", 39));
        System.out.println(solve("a", 39));
    }

    public static int solve(String A, int B) {
        int max = 0;
        List<String> subs = new ArrayList<>();
        int i = 0;
        while ((i + B) < A.length()) {
            subs.add(A.substring(i, i + B));
            i += B;
        }
        if (i < A.length()) {
            subs.add(A.substring(i));
        }
        for (String sub : subs) {
            int count = 0;
            for (int j = 0; j < sub.length(); j++) {
                if (sub.charAt(j) == 'a') {
                    count++;
                }
            }
            if (count == B) {
                return count;
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }
}
