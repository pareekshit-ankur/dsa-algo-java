package main.java.com.pareekshit.scaler.trees;

import main.java.com.pareekshit.scaler.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class BinaryTreeFromInorderAndPostorder {
    Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] A, int[] B) {
        for (int i = 0; i < A.length; i++) {
            map.put(A[i], i);
        }
        return buildTree(A, B, 0, A.length - 1, B.length - 1);
    }

    public TreeNode buildTree(int[] A, int[] B, int inL, int inR, int pR) {
        if (inL > inR) {
            return null;
        }
        TreeNode root = new TreeNode(B[pR]);
        int id = map.get(root.val);
        int cntR = inR - id;
        root.left = buildTree(A, B, inL, id - 1, pR - cntR - 1);
        root.right = buildTree(A, B, id + 1, inR, pR - 1);
        return root;
    }
}
