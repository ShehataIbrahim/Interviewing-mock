package com.streams.interviews;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AllNodeDistanceKInBinaryTreeTest {

    @Test
    void distanceKCase1() {
        TreeNode root = new TreeNode(20);
        /* Let us construct the tree shown in above diagram */
        root.setLeft(new TreeNode(8));
        root.setRight(new TreeNode(22));
        root.getLeft().setLeft(new TreeNode(4));
        root.getLeft().setRight(new TreeNode(12));
        root.getLeft().getRight().setLeft(new TreeNode(10));
        root.getLeft().getRight().setRight(new TreeNode(14));
        TreeNode target = root.getLeft().getRight();
        List<Integer> result = new AllNodeDistanceKInBinaryTree().distanceK(root, target, 2);
        assertTrue(result.contains(20));
        assertTrue(result.contains(4));
    }

    @Test
    void distanceKCase2() {
        TreeNode root = new TreeNode(3);

        /* Let us construct the tree shown in above diagram */
        root.setLeft(new TreeNode(5));
        root.setRight(new TreeNode(1));
        root.getLeft().setLeft(new TreeNode(6));
        root.getLeft().setRight(new TreeNode(2));
        root.getRight().setLeft(new TreeNode(0));
        root.getRight().setRight(new TreeNode(8));
        root.getLeft().getRight().setLeft(new TreeNode(7));
        root.getLeft().getRight().setRight(new TreeNode(4));
        root.getLeft().getRight().getLeft().setLeft(new TreeNode(10));
        root.getLeft().getRight().getLeft().setRight(new TreeNode(9));
        root.getLeft().getRight().getRight().setLeft(new TreeNode(11));
        root.getLeft().getRight().getRight().setRight(new TreeNode(12));
        TreeNode target = root.getLeft().right;
        List<Integer> result = new AllNodeDistanceKInBinaryTree().distanceK(root, target, 2);
        assertTrue(result.contains(3));
        assertTrue(result.contains(6));
        assertTrue(result.contains(10));
        assertTrue(result.contains(9));
        assertTrue(result.contains(11));
        assertTrue(result.contains(12));
    }
}