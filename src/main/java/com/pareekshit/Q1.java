package main.java.com.pareekshit;

import java.util.HashMap;
import java.util.Map;

/**
 * Print the string in the following format
 * 1. Character following by its frequency.
 * 2. Sort by its frequency, if frequency matches then sort by alphabetical order.
 * Eg:
 * Input string: "bcpppcbe"
 * o/p: "p3b2c2e1”
 * i/p : fqreqrrz
 * O/p :   r3q2e1f1z1
 */
public class Q1 {

    public static void main(String[] args) {
        String s = "bcpppcbe";
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
    }

    /*private void frequency(Map<Character, Integer> map) {
        Comparator<Map.Entry<String, Integer>> valueThenKeyComparator = Comparator
                .comparing(Map.Entry::getValue)
                .thenComparing(Map.Entry::getKey);
        Map<Character, Integer> sortedMap = new TreeMap<>(valueThenKeyComparator);
        sortedMap.putAll(map);
    }*/
}
