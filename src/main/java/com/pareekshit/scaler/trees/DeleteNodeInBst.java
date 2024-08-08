package main.java.com.pareekshit.scaler.trees;

import main.java.com.pareekshit.scaler.TreeNode;

public class DeleteNodeInBst {
    public static void main(String[] args) {
        TreeNode head = new TreeNode(3);
        head.right = new TreeNode(4);
        solve(head, 3);
    }

    public static TreeNode solve(TreeNode A, int B) {
        if (A == null) {
            return null;
        }
        TreeNode curr = A, prev = null;
        while (curr != null) {
            if (curr.val == B) {
                break;
            }
            prev = curr;
            if (curr.val > B) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
        if (curr == null) {
            return A;
        }
        if (curr.left == null && curr.right == null) {
            if (prev != null) {
                if (prev.right == curr) {
                    prev.right = null;
                } else {
                    prev.left = null;
                }
            } else {
                A = null;
            }
        } else if (curr.left != null && curr.right != null) {

            int leftMax = getMaxValFromBst(curr.left);
            solve(curr.left, leftMax);
            curr.val = leftMax;

        } else if (curr.left != null) {
            if (prev != null) {
                if (prev.left == curr) {
                    prev.left = curr.left;
                } else {
                    prev.right = curr.left;
                }
            }
        } else {
            if (prev != null) {
                if (prev.right == curr) {
                    prev.right = curr.right;
                } else {
                    prev.left = curr.right;
                }
            }
        }
        return A;
    }

    public static int getMaxValFromBst(TreeNode A) {
        if (A == null) {
            return -1;
        }
        TreeNode curr = A;
        while (curr.right != null) {
            curr = curr.right;
        }
        return curr.val;
    }

    public int getMinValFromBst(TreeNode A) {
        if (A == null) {
            return -1;
        }
        TreeNode curr = A;
        while (curr.left != null) {
            curr = curr.left;
        }
        return curr.val;
    }
}
