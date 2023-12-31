package com.streams.interviews;

import java.util.*;

/**
 * LeetCode
 * 863. All Nodes Distance K in Binary Tree
 * Medium
 * Topics
 * Companies
 * Given the root of a binary tree, the value of a target node target, and an integer k, return an array of the values of all nodes that have a distance k from the target node.
 */
public class AllNodeDistanceKInBinaryTree {

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode getLeft();
     * TreeNode getRight();
     * TreeNode(int x) { val = x; }
     * }
     */
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<Integer, List<Integer>> treeGraph = new HashMap<>();
        buildGraphFromTree(treeGraph, root);
        List<Integer> result = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
        addDistanceKNodes(result, k, 0, target.getVal(), treeGraph, visited);
        return result;
    }

    private void addDistanceKNodes(List<Integer> res, int k, int distance, int currentNode, Map<Integer, List<Integer>> tree, Set<Integer> visited) {
        if (visited.contains(currentNode)) {
            return;
        }
        visited.add(currentNode);
        if (distance == k) {
            res.add(currentNode);
            return;
        }
        if (distance > k) {
            return;
        }
        List<Integer> nodeNeighbours = tree.get(currentNode);
        if (nodeNeighbours==null) {
            return;
        }
        for (int node : nodeNeighbours) {
            addDistanceKNodes(res, k, distance + 1, node, tree, visited);
        }
    }

    private void buildGraphFromTree(Map<Integer, List<Integer>> adj, TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.getLeft() != null) {
            if (!adj.containsKey(root.getVal())) {
                adj.put(root.getVal(), new ArrayList<>());
            }
            adj.get(root.getVal()).add(root.getLeft().getVal());
            if (!adj.containsKey(root.getLeft().getVal())) {
                adj.put(root.getLeft().getVal(), new ArrayList<>());
            }
            adj.get(root.getLeft().getVal()).add(root.getVal());
            buildGraphFromTree(adj, root.getLeft());
        }
        if (root.getRight() != null) {
            if (!adj.containsKey(root.getVal())) {
                adj.put(root.getVal(), new ArrayList<>());
            }
            adj.get(root.getVal()).add(root.getRight().getVal());
            if (!adj.containsKey(root.getRight().getVal())) {
                adj.put(root.getRight().getVal(), new ArrayList<>());
            }
            adj.get(root.getRight().getVal()).add(root.getVal());
            buildGraphFromTree(adj, root.getRight());
        }
    }

}
