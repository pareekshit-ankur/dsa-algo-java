package main.java.com.pareekshit.scaler.trees;

import main.java.com.pareekshit.scaler.TreeNode;

public class SortedArrayToBalancedBst {

    public TreeNode sortedArrayToBST(final int[] A) {
        return buildTree(A, 0, A.length);
    }

    public TreeNode buildTree(final int[] A, int l, int r) {
        if (l > r) {
            return null;
        }
        TreeNode head = new TreeNode(1);
        return head;
    }
}
