package main.java.com.pareekshit.scaler.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {

    public static void main(String[] args) {
        System.out.println(largestNumber(new ArrayList<>(List.of(2, 3, 9, 0))));
        System.out.println(largestNumber(new ArrayList<>(List.of(3, 30, 34, 5, 9))));
    }

    public static String largestNumber(ArrayList<Integer> A) {
        StringBuilder sb = new StringBuilder();
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String xy = sb.append(o1).append(o2).toString();
                sb.setLength(0);
                String yx = sb.append(o2).append(o1).toString();
                sb.setLength(0);
                return yx.compareTo(xy);
            }
        };
        A.sort(comparator);
        if (A.get(0) == 0) {
            return "0";
        }
        for (Integer i : A) {
            sb.append(i);
        }
        return sb.toString();
    }
}
