package main.java.com.pareekshit.scaler.trees;

import main.java.com.pareekshit.scaler.TreeNode;

public class PathSum {
    public int hasPathSum(TreeNode A, int B) {
        return pathSumExists(A, B) ? 1 : 0;
    }

    public static boolean pathSumExists(TreeNode A, int B) {
        if (A == null) {
            return false;
        }
        if (A.left == null && A.right == null) {
            return A.val == B;
        }
        return pathSumExists(A.left, B - A.val) || pathSumExists(A.right, B - A.val);
    }
}
