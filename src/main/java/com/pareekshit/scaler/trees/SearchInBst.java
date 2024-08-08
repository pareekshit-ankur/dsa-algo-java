package main.java.com.pareekshit.scaler.trees;

import main.java.com.pareekshit.scaler.TreeNode;

public class SearchInBst {
    public int solve(TreeNode A, int B) {
        if (A == null) {
            return 0;
        }
        TreeNode curr = A;
        while (curr != null) {
            if (curr.val == B) {
                return 1;
            }
            if (curr.val > B) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
        return 0;
    }
}
