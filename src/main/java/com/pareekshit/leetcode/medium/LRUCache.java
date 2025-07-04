package main.java.com.pareekshit.leetcode.medium;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCache {
    Map<Integer, Integer> map = new HashMap<>();
    LinkedList<Integer> list = new LinkedList<>();
    public LRUCache(int capacity) {

    }

    public int get(int key) {
        return map.get(key);
    }

    public void put(int key, int value) {

    }
}
