package main.java.com.pareekshit.leetcode.easy;

import main.java.com.pareekshit.Util;

import java.util.ArrayList;
import java.util.List;

public class CellsInRangeOnAnExcelSheet {
    public static void main(String[] args) {
        Util.printArrayList(cellsInRange("K1:L2"));
        Util.printArrayList(cellsInRange("U7:X9"));
    }

    public static List<String> cellsInRange(String s) {
        List<String> res = new ArrayList<>();
        String[] arr = s.split(":");
        int rowRange = (arr[1].charAt(0) - 'A') - (arr[0].charAt(0) - 'A');
        int colRange = arr[1].charAt(1) - arr[0].charAt(1);
        for (int i = 0; i <= rowRange; i++) {
            char c = (char) (arr[0].charAt(0) + i);
            for (int i1 = Character.getNumericValue(arr[0].charAt(1)); i1 <= Character.getNumericValue(arr[0].charAt(1)) + colRange; i1++) {
                String str = String.valueOf(c).concat(String.valueOf(i1));
                res.add(str);
            }
        }
        return res;
    }
}
