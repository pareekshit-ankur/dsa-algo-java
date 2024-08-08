package main.java.com.pareekshit.scaler.trees;

import main.java.com.pareekshit.scaler.TreeNode;

import java.util.ArrayList;

public class PostOrderTraversal {
    static ArrayList<Integer> res = new ArrayList<>();

    public static ArrayList<Integer> postorderTraversal(TreeNode A) {
        if (A == null) {
            return res;
        }
        postorderTraversal(A.left);
        postorderTraversal(A.right);
        res.add(A.val);
        return res;
    }

}
