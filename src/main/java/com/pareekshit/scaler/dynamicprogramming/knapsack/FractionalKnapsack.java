package main.java.com.pareekshit.scaler.dynamicprogramming.knapsack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FractionalKnapsack {
    public static void main(String[] args) {
        //System.out.println(solve(new int[]{60, 100, 120}, new int[]{10, 20, 30}, 50));
        System.out.println(solve(new int[]{16, 3, 3, 6, 7, 8, 17, 13, 7}, new int[]{3, 10, 9, 18, 17, 17, 6, 16, 13}, 11));
    }

    public static int solve(int[] A, int[] B, int C) {
        List<Pair> pairs = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            pairs.add(new Pair(A[i], B[i], (double) A[i] / B[i]));
        }
        pairs.sort(Comparator.comparingDouble(Pair::getPerUnitWeight).reversed());
        double ans = 0;
        for (Pair pair : pairs) {
            if (C == 0) {
                break;
            }
            if (pair.getWeight() < C) {
                ans += pair.getValue();
                C -= pair.getWeight();
            } else {
                ans += C * pair.getPerUnitWeight();
                C -= C;
            }
        }
        return (int) Math.floor((ans * 1000)/10);
    }

    static class Pair {
        int value;
        int weight;
        double perUnitWeight;

        public Pair(int value, int weight, double perUnitWeight) {
            this.value = value;
            this.weight = weight;
            this.perUnitWeight = perUnitWeight;
        }

        public int getValue() {
            return value;
        }

        public int getWeight() {
            return weight;
        }

        public double getPerUnitWeight() {
            return perUnitWeight;
        }
    }
}
