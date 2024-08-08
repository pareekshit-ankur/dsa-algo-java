package main.java.com.pareekshit.scaler.trees;

import main.java.com.pareekshit.Util;
import main.java.com.pareekshit.scaler.TreeNode;

import java.util.*;
import java.util.stream.Collectors;

public class VerticalOrderTraversal {
    public static void main(String[] args) {
        TreeNode head = new TreeNode(411);
        TreeNode left = new TreeNode(8262);
        head.left = left;
        Util.print2DArrayList(verticalOrderTraversal(head));
    }

    public static ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {
        if (A == null) {
            return null;
        }
        ArrayList<ArrayList<Integer>> list;
        Map<Integer, ArrayList<TreeNode>> map = new TreeMap<>();
        Map<TreeNode, Integer> dmap = new HashMap<>();
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(A);
        ArrayList<TreeNode> listNodes = new ArrayList<>();
        listNodes.add(A);
        map.put(0, listNodes);
        dmap.put(A, 0);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null) {
                queue.add(node.left);
                int dist = dmap.get(node) - 1;
                dmap.put(node.left, dist);
                listNodes = map.getOrDefault(dist, new ArrayList<>());
                listNodes.add(node.left);
                map.put(dist, listNodes);
            }
            if (node.right != null) {
                queue.add(node.right);
                int dist = dmap.get(node) + 1;
                dmap.put(node.right, dist);
                listNodes = map.getOrDefault(dist, new ArrayList<>());
                listNodes.add(node.right);
                map.put(dist, listNodes);
            }
        }
        list = map.values().stream().map(nodes -> nodes.stream().map(node -> node.val).collect(Collectors.toCollection(ArrayList::new))).collect(Collectors.toCollection(ArrayList::new));
        return list;
    }
}
