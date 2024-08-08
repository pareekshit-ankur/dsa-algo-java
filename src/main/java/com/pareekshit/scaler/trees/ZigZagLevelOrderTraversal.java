package main.java.com.pareekshit.scaler.trees;

import main.java.com.pareekshit.scaler.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

public class ZigZagLevelOrderTraversal {
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode A) {
        if (A == null) {
            return null;
        }
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Deque<TreeNode> queue = new LinkedList<>();
        TreeNode last = A;
        queue.add(A);
        ArrayList<Integer> num = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            num.add(node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
            if (node == last && !queue.isEmpty()) {
                list.add(num);
                num = new ArrayList<>();
                last = queue.peekLast();
            }
        }
        if (!num.isEmpty()) {
            list.add(num);
        }
        for (int i = 1; i <list.size() ; i+=2) {
            Collections.reverse(list.get(i));
        }
        return list;
    }
}
