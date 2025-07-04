package main.java.com.pareekshit.scaler.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    public static void main(String[] args) {
        //String input = "32 4 S 5 13 S 9 6 S 4 1 G 4 S 6 1 S 8 11 G 13 G 1 S 12 12 G 10 S 15 13 S 2 13 S 7 5 S 10 3 G 6 G 10 S 15 14 S 5 12 G 5 G 7 G 15 G 5 G 6 G 10 S 7 13 G 14 S 8 9 G 4 S 6 11 G 9 S 6 12 G 3";
        String input = "6 2 S 2 1 S 2 2 G 2 S 1 1 S 4 1 G 2";
        String[] inputs = input.split(" ");
        int n = Integer.parseInt(inputs[0]);
        int capacity = Integer.parseInt(inputs[1]);
        LRUCache lruCache = new LRUCache(capacity);
        int i = 2;
        while (i < inputs.length) {
            if (inputs[i].equals("S")) {
                int key = Integer.parseInt(inputs[i + 1]);
                int value = Integer.parseInt(inputs[i + 2]);
                lruCache.set(key, value);
                i += 3;
            } else if (inputs[i].equals("G")) {
                int key = Integer.parseInt(inputs[i + 1]);
                System.out.println(lruCache.get(key));
                i += 2;
            }
        }
    }

    static class Node {
        int key, value;
        Node next, prev;

        public Node() {
        }

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
            next = prev = null;
        }
    }

    Map<Integer, Node> map;
    Integer size;
    Node head, tail;

    public LRUCache(int capacity) {
        map = new HashMap<>(capacity);
        size = capacity;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            deleteNode(node);
            insertNodeAtTail(key, node.value);
            return node.value;
        }
        return -1;
    }

    public void set(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            deleteNode(node);
            insertNodeAtTail(key, value);
        } else if (map.isEmpty()) {
            Node node = new Node(key, value);
            head = node;
            tail = node;
            map.put(key, node);
        } else if (map.size() < size) {
            insertNodeAtTail(key, value);
        } else if (map.size() == size) {
            map.remove(head.key);
            head = head.next;
            insertNodeAtTail(key, value);
        }
    }

    private void insertNodeAtTail(int key, int value) {
        Node node = new Node(key, value);
        tail.next = node;
        node.prev = tail;
        tail = node;
        map.put(key, node);
    }

    private static void deleteNode(Node node) {
        if (node.next == null && node.prev == null) {
            return;
        }
        if (node.prev != null && node.next != null) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
            node.next = null;
            node.prev = null;
        } else if (node.prev != null) {
            node.prev.next = null;
            node.prev = null;
        } else {
            node.next.prev = null;
            node.next = null;
        }
    }
}
