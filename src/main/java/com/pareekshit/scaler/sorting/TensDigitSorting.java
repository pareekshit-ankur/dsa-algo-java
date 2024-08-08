package main.java.com.pareekshit.scaler.sorting;

import main.java.com.pareekshit.Util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TensDigitSorting {

    public static void main(String[] args) {
        Util.printArrayList(solve(new ArrayList<>(List.of(15, 11, 7, 19))));
        Util.printArrayList(solve(new ArrayList<>(List.of(36, 13, 13, 26, 37, 28, 27, 43, 7))));
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        Comparator<Integer> factorComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int o1Digit = (o1 / 10) % 10;
                int o2Digit = (o2 / 10) % 10;
                if (o1Digit == o2Digit) {
                    return o2 - o1;
                } else {
                    return o1Digit - o2Digit;
                }
            }
        };
        A.sort(factorComparator);
        return A;
    }

}
