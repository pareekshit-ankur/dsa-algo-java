package main.java.com.pareekshit.scaler.trees;

import main.java.com.pareekshit.scaler.TreeLinkNode;

import java.util.Deque;
import java.util.LinkedList;

public class NextPointerBinaryTree {
    public void connect(TreeLinkNode root) {
        if (root == null) {
            return;
        }
        Deque<TreeLinkNode> queue = new LinkedList<>();
        TreeLinkNode last = root;
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeLinkNode node = queue.poll();
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
            if (node != last) {
                node.next = queue.peekFirst();
            } else {
                node.next = null;
                if (!queue.isEmpty()) {
                    last = queue.peekLast();
                }
            }
        }
    }
}
