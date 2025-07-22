package main.java.com.pareekshit.leetcode.easy;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortThePeople {

    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new TreeMap<>(Comparator.reverseOrder());
        for (int i = 0; i < heights.length; i++) {
            map.put(heights[i], names[i]);
        }
        int i=0;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            names[i++] = entry.getValue();
        }
        return names;
    }
}
