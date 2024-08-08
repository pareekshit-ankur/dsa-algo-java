package main.java.com.pareekshit.scaler.trees;

import main.java.com.pareekshit.scaler.TreeNode;

public class EqualTreePartition {
    int sum;
    boolean partitionExists = false;

    public int solve(TreeNode A) {
        if (A == null) {
            return 0;
        }
        sum = sum(A);
        checkPartition(A);
        return partitionExists ? 1 : 0;
    }

    public int sum(TreeNode A) {
        if (A == null) {
            return 0;
        }
        return A.val + sum(A.left) + sum(A.right);
    }

    public int checkPartition(TreeNode A) {
        if (A == null) {
            return 0;
        }
        int total = A.val + checkPartition(A.left) + checkPartition(A.right);
        if (total * 2 == sum) {
            partitionExists = true;
        }
        return total;
    }
}
