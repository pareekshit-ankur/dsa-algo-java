package main.java.com.pareekshit.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        String [] chars = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> res = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            char [] arr = word.toCharArray();
            for (char c : arr) {
                sb.append(chars[c-'a']);
            }
            res.add(sb.toString());
            sb.setLength(0);
        }
        return res.size();
    }
}
