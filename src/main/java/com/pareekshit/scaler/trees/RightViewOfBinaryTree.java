package main.java.com.pareekshit.scaler.trees;

import main.java.com.pareekshit.Util;
import main.java.com.pareekshit.scaler.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public  class RightViewOfBinaryTree {
    public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        TreeNode left = new TreeNode(15);
        TreeNode right = new TreeNode(2);
        head.left = left;
        head.right = right;
        Util.printArrayList(solve(head));
    }
    public static ArrayList<Integer> solve(TreeNode A) {
        if (A == null) {
            return null;
        }
        ArrayList<Integer> list = new ArrayList<>();
        Deque<TreeNode> queue = new LinkedList<>();
        TreeNode last = A;
        queue.add(A);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
            if (node == last) {
                list.add(node.val);
                if (!queue.isEmpty()) {
                    last = queue.peekLast();
                }
            }
        }
        return list;
    }
}
