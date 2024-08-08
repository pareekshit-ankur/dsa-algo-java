package main.java.com.pareekshit.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    public static void main(String[] args) {
        System.out.println(isIsomorphic("badc", "baba"));
        System.out.println(isIsomorphic("add", "egg"));
        System.out.println(isIsomorphic("foo", "bar"));
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> tmap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char chs = s.charAt(i);
            char cht = t.charAt(i);
            if ((tmap.containsKey(chs) && tmap.get(chs) != cht) || (!tmap.containsKey(chs) && tmap.containsValue(cht))) {
                return false;
            } else {
                tmap.put(chs, cht);
            }
        }
        return true;
    }
}
