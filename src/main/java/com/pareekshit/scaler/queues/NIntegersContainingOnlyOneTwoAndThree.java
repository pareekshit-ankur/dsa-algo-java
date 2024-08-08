package main.java.com.pareekshit.scaler.queues;

import main.java.com.pareekshit.Util;

import java.util.LinkedList;
import java.util.Queue;

public class NIntegersContainingOnlyOneTwoAndThree {
    public static void main(String[] args) {
        Util.printArray(solve(11));
    }

    public static int[] solve(int A) {
        if (A == 1) {
            return new int[]{1};
        }
        if (A == 2) {
            return new int[]{1, 2};
        }
        if (A == 3) {
            return new int[]{1, 2, 3};
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        int[] res = new int[A];
        res[0] = 1;
        res[1] = 2;
        res[2] = 3;
        int index = 3;
        while (index < A) {
            int x = queue.poll();
            int a = x * 10 + 1;
            int b = a + 1;
            int c = a + 2;
            res[index++] = a;
            if (index == A) {
                return res;
            }
            res[index++] = b;
            if (index == A) {
                return res;
            }
            res[index++] = c;
            if (index == A) {
                return res;
            }
            queue.add(a);
            queue.add(b);
            queue.add(c);
        }
        return res;
    }
}
