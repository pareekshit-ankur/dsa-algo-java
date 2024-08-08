package main.java.com.pareekshit.scaler.trees;

import main.java.com.pareekshit.scaler.TreeNode;

public class SumBinaryTreeOrNot {
    public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        head.right = new TreeNode(4);
        System.out.println(solve(head));
    }

    static int ans = 1;

    public static int solve(TreeNode A) {
        checkSumBinary(A);
        return ans;
    }

    private static int checkSumBinary(TreeNode A) {
        if (A == null) {
            return 0;
        }
        int left = checkSumBinary(A.left);
        int right = checkSumBinary(A.right);
        if (left + right == A.val || left + right == 0) {
            return left + right + A.val;
        } else {
            ans = 0;
            return 0;
        }
    }
}
