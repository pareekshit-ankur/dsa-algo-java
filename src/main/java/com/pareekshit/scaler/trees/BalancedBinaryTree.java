package main.java.com.pareekshit.scaler.trees;

import main.java.com.pareekshit.scaler.TreeNode;

public class BalancedBinaryTree {
    boolean isBalanced = true;

    public int isBalanced(TreeNode A) {
        height(A);
        if (isBalanced) {
            return 1;
        }
        return 0;
    }

    public int height(TreeNode root) {
        if (root == null) {
            return -1;
        }
        int l = height(root.left);
        int r = height(root.right);
        if (Math.abs(l - r) > 1) {
            isBalanced = false;
            return -1;
        }
        return Math.max(l, r) + 1;
    }
}
