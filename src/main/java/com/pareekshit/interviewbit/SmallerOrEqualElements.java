package main.java.com.pareekshit.interviewbit;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SmallerOrEqualElements {
    public static void main(String[] args) {
        List<Integer> numbers = Stream.of(1, 2, 5, 5).collect(Collectors.toList());
        //System.out.println(solve(Stream.of(1,3, 4, 4, 6).collect(Collectors.toList()), 4));
        //System.out.println(solve(Stream.of(1, 2, 5, 5).collect(Collectors.toList()), 3));
        //System.out.println(solve(Stream.of(42, 46).collect(Collectors.toList()), 43));
        //System.out.println(solve(Stream.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1 ).collect(Collectors.toList()), 1));
        System.out.println(solve(Stream.of(1, 3, 3, 3, 6, 6, 6, 6, 6, 7).collect(Collectors.toList()), 2));
    }

    public static int solve(List<Integer> A, int B) {
        int i = A.size() / 2;
        int x = 0, y = A.size();
        if (A.size() == 2) {
            if (A.get(1) < B) return 2;
            if (A.get(1) > B && A.get(0) <= B) return 1;
            return 0;
        }
        while (i > 0 && i < (A.size() - 1)) {
            if (A.get(i) == B && A.get(i + 1) > B) {
                return i + 1;
            }
            if (A.get(i) < B && A.get(i + 1) > B) {
                return i + 1;
            }
            if (A.get(i) == B && A.get(i + 1) <= B) {
                x = i;
                i = (x + y) / 2;
            } else if (A.get(i) > B) {
                y = i;
                i = (x + y) / 2;
            } else if (A.get(i) < B) {
                x = i;
                i = (x + y) / 2;
            }
        }
        if (i == A.size() - 1 && A.get(i) == B) {
            return A.size();
        }
        if (i == 0 && A.get(0) <= B) {
            return 1;
        }

        return 0;
    }
}
