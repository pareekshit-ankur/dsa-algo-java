package main.java.com.pareekshit.scaler.trees;

import main.java.com.pareekshit.scaler.TreeNode;

public class IdenticalBinaryTree {
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

    public int isSameTree(TreeNode A, TreeNode B) {
        if (A == null || B == null) {
            return 0;
        }
        if (A == B && A.val == B.val) {
            return 1;
        }
        return isSameTree(A.left, B.left) * isSameTree(A.right, B.right);
    }
}
