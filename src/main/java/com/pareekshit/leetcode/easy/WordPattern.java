package main.java.com.pareekshit.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba","dog cat cat dog"));
        System.out.println(wordPattern("abba","dog cat cat fish"));
        System.out.println(wordPattern("abba","dog dog dog dog"));
    }
    public static boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        char [] chars = pattern.toCharArray();
        String [] words = s.split(" ");
        if (chars.length!= words.length) return false;
        for (int i = 0; i < chars.length; i++) {
            if (!map.containsKey(chars[i]) && !map.containsValue(words[i])){
                map.put(chars[i], words[i]);
            }else if(map.containsKey(chars[i]) && !map.get(chars[i]).equals(words[i])){
                return false;
            }else if(!map.containsKey(chars[i]) && map.containsValue(words[i])){
                return false;
            }
        }
        return true;
    }
}
