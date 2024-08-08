package main.java.com.pareekshit.scaler.trees;

import main.java.com.pareekshit.Util;
import main.java.com.pareekshit.scaler.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DeserializeBinaryTree {
    public static void main(String[] args) {
        //TreeNode node = solve(new int[]{1, 2, 3, 4, 5, -1, -1, -1, -1, -1, 6, -1, -1});
        //Util.printArrayList(PreOrderTraversal.preorderTraversal(node));
        //Util.printArrayList(PostOrderTraversal.postorderTraversal(node));
        TreeNode node = solve(new int[]{1, 2, 4, -1, 3, -1, 5, 7, -1, -1, 6, -1, 8, -1, -1, -1, -1});
        Util.printArrayList(PreOrderTraversal.preorderTraversal(node));
        Util.printArrayList(PostOrderTraversal.postorderTraversal(node));
    }

    public static TreeNode solve(int[] A) {
        TreeNode head = new TreeNode(A[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(head);
        int i = 1;
        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            if (A[i] != -11) {
                curr.left = new TreeNode(A[i]);
                queue.add(curr.left);
            }
            i++;
            if (A[i] != -11) {
                curr.right = new TreeNode(A[i]);
                queue.add(curr.right);
            }
            i++;
        }
        return head;
    }

    public TreeNode solve(ArrayList<Integer> A) {
        TreeNode head = new TreeNode(A.get(0));
        TreeNode curr = head;
        int i = 0;
        for (int j = i; j < A.size(); i++, j += 2) {
            int index = 2 * i;
            TreeNode left, right;
            if (A.get(index) == -1) {
                left = null;
            } else {
                left = new TreeNode(A.get(index));
            }
            if (A.get(index + 1) == -1) {
                right = null;
            } else {
                right = new TreeNode(A.get(index + 1));
            }
            curr.left = left;
            curr.right = right;
        }
        return head;
    }

}
