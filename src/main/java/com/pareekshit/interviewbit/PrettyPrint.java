package main.java.com.pareekshit.interviewbit;

import java.util.ArrayList;

public class PrettyPrint {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> array = prettyPrint(4);
        for (ArrayList<Integer> integers : array) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> prettyPrint(int A) {
        ArrayList<ArrayList<Integer>> array = new ArrayList<>();
        int len = A * 2 - 1;
        for (int i = 0; i < A; i++) {
            ArrayList<Integer> innerArray = new ArrayList<>();
            int j, num = 0;
            for (j = 0; j < i; j++) {
                innerArray.add(A - j);
            }
            for (j = i; j < len - i; j++) {
                num = A - i;
                innerArray.add(A - i);
            }
            for (; j < len; j++) {
                num += 1;
                innerArray.add(num);
            }
            array.add(innerArray);
        }
        int pointer = 2;
        for (int i = A; i < len; i++) {
            ArrayList<Integer> innerArray = new ArrayList<>();
            int j;
            for (j = 0; j < len; j++) {
                innerArray.add(array.get(i - pointer).get(j));
            }
            array.add(innerArray);
            pointer += 2;
        }
        return array;
    }
}
