package main.java.com.pareekshit.scaler.sorting;

import main.java.com.pareekshit.Util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FactorsSort {

    public static void main(String[] args) {
        Util.printArrayList(solve(new ArrayList<>(List.of(6, 8, 9))));
        Util.printArrayList(solve(new ArrayList<>(List.of(36, 13, 13, 26, 37, 28, 27, 43, 7))));
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        Comparator<Integer> factorComparator = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int o1Factor = getFactors(o1);
                int o2Factor = getFactors(o2);
                if (o1Factor == o2Factor) {
                    return o1 - o2;
                } else {
                    return o1Factor - o2Factor;
                }
            }
        };
        A.sort(factorComparator);
        return A;
    }

    public static Integer getFactors(int n) {
        int count = 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count + 1;
    }
}
