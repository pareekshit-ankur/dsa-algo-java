package main.java.com.pareekshit.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitStringsBySeparator {
    public static void main(String[] args) {
        System.out.println(splitWordsBySeparator(List.of("one,two.three", "four.five", "six"), '.'));
    }

    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> list = new ArrayList<>();
        for (String word : words) {
            list.addAll(Arrays.stream(word.split("\\".concat(String.valueOf(separator)))).toList());
        }
        list.removeIf(String::isEmpty);
        return list;
    }
}
