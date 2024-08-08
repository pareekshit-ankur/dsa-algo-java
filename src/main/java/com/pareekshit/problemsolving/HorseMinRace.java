package main.java.com.pareekshit.problemsolving;

import java.util.Arrays;

/**
 * There are 25 horses and need to find the fastest 3 horses. Maximum 5 horses can participate in a race. Find minimum
 * number of races required to get the fastest 3 horses.
 */
public class HorseMinRace {
    public static void main(String[] args) {
        String[] horses = new String[25];
        for (int i = 0; i < horses.length; i++) {
            horses[i] = "H".concat(String.valueOf(i + 1));
        }
        Arrays.stream(horses).forEach(System.out::println);
        System.out.println(getMinimumRaces(horses, 5));
    }

    public static Integer getMinimumRaces(String[] horses, int noOfHorsesInSingleRace) {
        int requiredRaces = 0;
        requiredRaces = horses.length / noOfHorsesInSingleRace;
        return requiredRaces;
    }
}
