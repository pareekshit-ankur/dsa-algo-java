package main.java.com.pareekshit.scaler.trees;

import main.java.com.pareekshit.Util;
import main.java.com.pareekshit.scaler.TreeNode;

import java.util.*;


public class TopView {

    public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        head.left = left;
        head.right = right;
        Util.printArrayList(solve(head));
        topView(head);
    }

    public static ArrayList<Integer> solve(TreeNode A) {
        if (A == null) {
            return null;
        }
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer, ArrayList<TreeNode>> map = new TreeMap<>();
        Map<TreeNode, Integer> dmap = new HashMap<>();
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(A);
        ArrayList<TreeNode> listNodes = new ArrayList<>();
        listNodes.add(A);
        map.put(0, listNodes);
        dmap.put(A, 0);
        while (!queue.isEmpty()) {
            TreeNode TreeNode = queue.poll();
            if (TreeNode.left != null) {
                queue.add(TreeNode.left);
                int dist = dmap.get(TreeNode) - 1;
                dmap.put(TreeNode.left, dist);
                listNodes = map.getOrDefault(dist, new ArrayList<>());
                listNodes.add(TreeNode.left);
                map.put(dist, listNodes);
            }
            if (TreeNode.right != null) {
                queue.add(TreeNode.right);
                int dist = dmap.get(TreeNode) + 1;
                dmap.put(TreeNode.right, dist);
                listNodes = map.getOrDefault(dist, new ArrayList<>());
                listNodes.add(TreeNode.right);
                map.put(dist, listNodes);
            }
        }
        for (ArrayList<TreeNode> nodes : map.values()) {
            list.add(nodes.get(0).val);
        }
        return list;
    }

    public static void topView(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        Map<TreeNode, Integer> dMap = new HashMap<>();
        Map<Integer, List<TreeNode>> map = new TreeMap<>();
        queue.add(root);
        List<TreeNode> listNodes = new ArrayList<>();
        listNodes.add(root);
        map.put(0, listNodes);
        dMap.put(root, 0);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            if (temp.left != null) {
                queue.add(temp.left);
                int dist = dMap.get(temp) - 1;
                dMap.put(temp.left, dist);
                List<TreeNode> nodes = map.getOrDefault(dist, new ArrayList<>());
                nodes.add(temp.left);
                map.put(dist, nodes);
            }
            if (temp.right != null) {
                queue.add(temp.right);
                int dist = dMap.get(temp) + 1;
                dMap.put(temp.right, dist);
                List<TreeNode> nodes = map.getOrDefault(dist, new ArrayList<>());
                nodes.add(temp.right);
                map.put(dist, nodes);
            }
        }
        for (List<TreeNode> value : map.values()) {
            System.out.println(value.get(0).val);
        }
    }
}
