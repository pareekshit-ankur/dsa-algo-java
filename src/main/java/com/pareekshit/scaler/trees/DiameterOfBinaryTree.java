package main.java.com.pareekshit.scaler.trees;

import main.java.com.pareekshit.scaler.TreeNode;

public class DiameterOfBinaryTree {
    int diameter = 0;

    public int solve(TreeNode A) {
        if (A == null) {
            return 0;
        }
        return height(A);
    }

    public int height(TreeNode A) {
        if (A == null) {
            return -1;
        }
        int left = height(A.left);
        int right = height(A.right);
        diameter = Math.max(diameter, left + right + 2);
        return Math.max(left, right) + 1;
    }
}
