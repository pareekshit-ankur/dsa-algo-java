package main.java.com.pareekshit.interviewbit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        //System.out.println(removeDuplicates(new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3))));
        System.out.println(removeDuplicates(new ArrayList<>(Arrays.asList(5000, 5000, 5000))));
    }

    public static int removeDuplicates(ArrayList<Integer> A) {
        if (A.size() == 1) {
            return A.size();
        }
        int j = 0;
        for (int i = 1; i < A.size(); i++) {
            if (!Objects.equals(A.get(i), A.get(j))) {
                j++;
                A.add(j, A.get(i));
            }
        }
        return j + 1;
    }
}
