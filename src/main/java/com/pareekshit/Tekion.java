package main.java.com.pareekshit;

import java.util.*;

/**
 * 11
 * 21   31
 * 41  51  71  61
 * 81         91
 * <p>
 * 1, 3, 6, 8
 */

// (n*2) (n*2)+1
public class Tekion {
    public static void main(String[] args) {
        Integer[] array = new Integer[16];
        int power = 0;
        int height = power + 1;
        int elementsToProcess = (int) Math.pow(2, power);
        int elemetsProcessed = 0;
        Map<Integer, TreeSet<Integer>> map = new TreeMap<>();
        for (int i = 1; i < args.length; i++) {
            if (array[i] != null) {
                elemetsProcessed++;
                if (!map.containsKey(height)) {
                    TreeSet<Integer> set = new TreeSet<>(Comparator.reverseOrder());
                    set.add(i);
                    map.put(height, set);
                } else {
                    TreeSet<Integer> set = map.get(height);
                    set.add(i);
                    map.put(height, set);
                }
            } else {
                elemetsProcessed++;
            }
            if (elementsToProcess == elemetsProcessed) {
                power++;
                elementsToProcess = (int) Math.pow(2, power);
                elemetsProcessed = 0;
            }
        }

        for (Map.Entry<Integer, TreeSet<Integer>> entry : map.entrySet()) {
            System.out.println(array[entry.getValue().first()] + " ");
        }
    }

    public boolean isIntersecting(Node head1, Node head2) {
        Set<Node> visitedNodes = new HashSet<>();
        Node temp = head1;
        while (temp != null) {
            visitedNodes.add(temp);
            temp = temp.next;
        }
        temp = head2;
        while (temp != null) {
            if (visitedNodes.contains(temp))
                return true;
            temp = temp.next;
        }
        return false;
    }
}

class Node {
    int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}