package main.java.com.pareekshit.scaler.trees;

import main.java.com.pareekshit.scaler.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class SerializeBinaryTree {
    public ArrayList<Integer> solve(TreeNode A) {
        if (A == null) {
            return null;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(A);
        ArrayList<Integer> num = new ArrayList<>();
        TreeNode treeNode = new TreeNode(-1);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            num.add(node.val);
            if (node.left == null && node.val != -1) {
                queue.add(treeNode);
            } else if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right == null && node.val != -1) {
                queue.add(treeNode);
            } else if (node.right != null) {
                queue.add(node.right);
            }
        }
        return num;
    }
}
