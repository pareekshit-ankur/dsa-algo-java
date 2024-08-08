package main.java.com.pareekshit.scaler.sorting;

import main.java.com.pareekshit.Util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BClosestPointsToOrigin {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(List.of(1, 3)));
        input.add(new ArrayList<>(List.of(-2, 2)));
        Util.print2DArrayList(solve(input, 1));
    }

    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {
        Comparator<ArrayList<Integer>> comparator = new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                return (o1.get(0) * o1.get(0) + o1.get(1) * o1.get(1)) - (o2.get(0) * o2.get(0) + o2.get(1) * o2.get(1));
            }
        };
        A.sort(comparator);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < B; i++) {
            ans.add(A.get(i));
        }
        return ans;
    }
}
