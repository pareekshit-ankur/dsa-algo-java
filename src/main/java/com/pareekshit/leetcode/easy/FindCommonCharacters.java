package main.java.com.pareekshit.leetcode.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindCommonCharacters {
    public static void main(String[] args) {
        commonChars(new String[]{"bella", "label", "roller"}).forEach(System.out::println);
    }

    public static List<String> commonChars(String[] words) {
        Set<Character> set = new HashSet<>(words[0].chars().mapToObj(c -> (char) c).toList());
        int[] arr = new int[26];
        for (String word : words) {
            set.retainAll(word.chars().mapToObj(c -> (char) c).toList());
            for (char c : word.toCharArray()) {
                arr[c - 'a'] += 1;
            }
        }
        List<String> list = new ArrayList<>();
        int len = words.length;
        for (Character character : set) {
            if (arr[character - 'a'] == len) {
                list.add(String.valueOf(character));
            } else if (arr[character - 'a'] > len) {
                for (int j = 0; j < arr[character - 'a'] / len; j++) {
                    list.add(String.valueOf(character));
                }
            }
        }
        return list;
    }
}
