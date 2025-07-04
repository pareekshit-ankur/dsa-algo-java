package main.java.com.pareekshit.leetcode.easy;

import java.util.ArrayDeque;
import java.util.Queue;

public class MyStack {
    static Queue<Integer> q1 = new ArrayDeque<>();
    static Queue<Integer> q2 = new ArrayDeque<>();

    public static void main(String[] args) {
        push(1);
        push(2);
        System.out.println(top());
        System.out.println(pop());
        System.out.println(empty());
    }

    public static void push(int x) {
        if (!q1.isEmpty()) {
            q1.add(x);
        } else if (!q2.isEmpty()) {
            q2.add(x);
        } else {
            q1.add(x);
        }
    }

    public static int pop() {
        int res = 0;
        if (!q1.isEmpty()) {
            int n = q1.size();
            for (int i = 0; i < n - 1; i++) {
                q2.add(q1.poll());
            }
            res = q1.poll();
        } else if (!q2.isEmpty()) {
            int n = q2.size();
            for (int i = 0; i < n - 1; i++) {
                q1.add(q2.poll());
            }
            res = q2.poll();
        }
        return res;
    }

    public static int top() {
        int res = 0;
        if (!q1.isEmpty()) {
            int n = q1.size();
            for (int i = 0; i < n; i++) {
                res = q1.poll();
                q2.add(res);
            }
        } else if (!q2.isEmpty()) {
            int n = q2.size();
            for (int i = 0; i < n; i++) {
                res = q2.poll();
                q1.add(res);
            }
        }
        return res;
    }

    public static boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}
