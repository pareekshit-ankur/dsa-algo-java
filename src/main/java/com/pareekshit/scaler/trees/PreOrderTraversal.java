package main.java.com.pareekshit.scaler.trees;

import main.java.com.pareekshit.scaler.TreeNode;

import java.util.ArrayList;

public class PreOrderTraversal {
    static ArrayList<Integer> res = new ArrayList<>();

    public static ArrayList<Integer> preorderTraversal(TreeNode A) {
        if (A == null) {
            return res;
        }
        res.add(A.val);
        preorderTraversal(A.left);
        preorderTraversal(A.right);
        return res;
    }

}
