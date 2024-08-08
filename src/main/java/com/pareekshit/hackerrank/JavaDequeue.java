package main.java.com.pareekshit.hackerrank;

import java.util.*;

public class JavaDequeue {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
        }
        int max = 0;
        Set<Integer> unique = new HashSet<>();
        List<Integer> nums = new ArrayList<>(deque);
        for (int i = 0; i + m < deque.size(); i++) {
            unique.addAll(nums.subList(i, i + m));
            if (unique.size() > max) {
                max = unique.size();
            }
            unique.clear();
        }
        System.out.println(max);
    }
}



