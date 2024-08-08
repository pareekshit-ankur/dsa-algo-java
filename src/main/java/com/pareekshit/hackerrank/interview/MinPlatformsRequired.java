package main.java.com.pareekshit.hackerrank.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinPlatformsRequired {

    public static void main(String[] args) {
        Integer arr[] = {900, 940, 950, 1100, 1500, 1800};
        Integer dep[] = {910, 1200, 1120, 1130, 1900, 2000};
        List<Integer> arrTime = new ArrayList<>();
        Collections.addAll(arrTime, arr);
        List<Integer> depTime = new ArrayList<>();
        Collections.addAll(depTime, dep);
        System.out.println(getMinimumPlatforms(arrTime, depTime));
    }

    public static int getMinimumPlatforms(List<Integer> arrivalTimes,
                                          List<Integer> depTimes) {
        int platforms = 0;
        int max = 0;
        while (!arrivalTimes.isEmpty() && !depTimes.isEmpty()) {
            if (arrivalTimes.get(0) < depTimes.get(0)) {
                platforms++;
                arrivalTimes.remove(0);
            } else {
                platforms--;
                depTimes.remove(0);
            }
            if (platforms > max) {
                max = platforms;
            }
        }
        return max;
    }
}
