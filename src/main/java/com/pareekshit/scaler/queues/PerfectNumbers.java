package main.java.com.pareekshit.scaler.queues;

import java.util.LinkedList;
import java.util.Queue;

public class PerfectNumbers {
    public static void main(String[] args) {
        System.out.println(solve(2));
        System.out.println(solve(3));
        System.out.println(solve(100000));
    }

    public static String solve(int A) {
        if (A == 1) {
            return "11";
        }
        if (A == 2) {
            return "22";
        }
        Queue<Long> queue = new LinkedList<>();
        queue.add(1L);
        queue.add(2L);
        StringBuilder sb = new StringBuilder();
        int index = 2;
        while (index < A) {
            long x = queue.poll();
            long a = x * 10 + 1;
            long b = a + 1;
            if (index + 1 == A) {
                sb.append(a);
                String s = sb.reverse().toString();
                sb.reverse();
                return sb.append(s).toString();
            }
            if (index + 2 == A) {
                sb.append(b);
                String s = sb.reverse().toString();
                sb.reverse();
                return sb.append(s).toString();
            }
            queue.add(a);
            queue.add(b);
            index += 2;
        }
        return sb.toString();
    }
}
