package main.java.com.pareekshit.scaler.stacks;

import main.java.com.pareekshit.Util;

import java.util.Stack;

public class SortStackUsingAnotherStack {
    public static void main(String[] args) {
        Util.printArray(solve(new int[]{5, 17, 100, 11}));
    }

    public static int[] solve(int[] A) {
        int[] res = new int[A.length];
        Stack<Integer> tempStack = new Stack<>();
        for (int i : A) {
            tempStack.push(i);
        }
        Stack<Integer> finalStack = new Stack<>();
        while (!tempStack.isEmpty()) {
            int x = tempStack.pop();
            while (!finalStack.isEmpty() && finalStack.peek() > x) {
                tempStack.push(finalStack.pop());
            }
            finalStack.push(x);
        }
        while (!finalStack.isEmpty()) {
            tempStack.push(finalStack.pop());
        }
        int i = 0;
        while (!tempStack.isEmpty()) {
            res[i++] = tempStack.pop();
        }
        return res;
    }
}
