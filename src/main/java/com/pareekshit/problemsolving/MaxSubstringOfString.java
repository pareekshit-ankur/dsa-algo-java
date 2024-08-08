package main.java.com.pareekshit.problemsolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxSubstringOfString {
    public static void main(String[] args) {
        System.out.println(maxSubstring("baca"));
    }

    public static String maxSubstring(String s) {
        List<String> subString = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                subString.add(s.substring(i, j + 1));
            }
        }
        Collections.sort(subString);
        return Collections.max(subString);
    }
}
