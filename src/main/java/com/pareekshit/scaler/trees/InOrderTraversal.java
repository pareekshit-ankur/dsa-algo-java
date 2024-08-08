package main.java.com.pareekshit.scaler.trees;

import main.java.com.pareekshit.scaler.TreeNode;

import java.util.ArrayList;

public class InOrderTraversal {
        ArrayList<Integer> res = new ArrayList<>();
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        if (A == null){
            return res;
        }
        inorderTraversal(A.left);
        res.add(A.val);
        inorderTraversal(A.right);
        return res;
    }
}
