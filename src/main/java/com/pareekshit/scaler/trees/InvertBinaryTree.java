package main.java.com.pareekshit.scaler.trees;

import main.java.com.pareekshit.scaler.TreeNode;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode A) {
        if (A == null) {
            return null;
        }
        TreeNode temp = A.left;
        A.left = A.right;
        A.right = temp;
        invertTree(A.left);
        invertTree(A.right);
        return A;
    }
}
