package main.java.com.pareekshit.leetcode.medium;

import java.util.Map;
import java.util.TreeMap;

public class CarPooling {
    public static void main(String[] args) {
        System.out.println(carPooling(new int[][]{{2, 1, 5}, {3, 5, 7}}, 3));
    }

    public static boolean carPooling(int[][] trips, int capacity) {
        TreeMap<Integer, Integer> startPoints = new TreeMap<>();
        TreeMap<Integer, Integer> endPoints = new TreeMap<>();
        for (int[] trip : trips) {
            if (startPoints.containsKey(trip[1])) {
                startPoints.put(trip[1], startPoints.get(trip[1]) + trip[0]);
            } else {
                startPoints.put(trip[1], trip[0]);
            }

            if (endPoints.containsKey(trip[2])) {
                endPoints.put(trip[2], endPoints.get(trip[2]) + trip[0]);
            } else {
                endPoints.put(trip[2], trip[0]);
            }
        }
        int currentCapacity = 0;
        for (Map.Entry<Integer, Integer> entry : startPoints.entrySet()) {
            Integer key = endPoints.floorKey(entry.getKey());
            while (key != null) {
                currentCapacity -= endPoints.get(key);
                endPoints.remove(key);
                key = endPoints.floorKey(entry.getKey());
            }
            currentCapacity += entry.getValue();
            if (currentCapacity > capacity) {
                return false;
            }
        }
        return true;
    }
}
