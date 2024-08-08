package main.java.com.pareekshit.scaler.queues;

import java.util.Stack;

public class QueueUsingStacks {
    static Stack<Integer> exit = new Stack<>();
    static Stack<Integer> entry = new Stack<>();

    static void push(int X) {
        entry.push(X);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    static int pop() {
        if (exit.empty()) {
            while (!entry.empty()) {
                exit.push(entry.pop());
            }
        }
        return exit.pop();
    }

    /**
     * Get the front element of the queue.
     */
    static int peek() {
        if (exit.empty()) {
            while (!entry.empty()) {
                exit.push(entry.pop());
            }
        }
        return exit.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    static boolean empty() {
        return (entry.empty() && exit.empty());
    }
}
