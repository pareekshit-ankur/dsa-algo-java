package main.java.com.pareekshit;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring("aab"));
    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (map.containsKey(c)) {
                int previousValue = map.get(c);
                map.put(c, i);
                i = previousValue;
            } else {
                map.put(c, i);
            }
            System.out.println(map);
            List<Integer> values = new ArrayList<>(map.values());
            if (values.size() > 1) {
                Collections.sort(values);
                int diff = values.get((values.size() - 1)) - values.get(0);
                if (maxLength < diff + 1) {
                    maxLength = diff + 1;
                }
            }
        }
        return maxLength;
    }
}