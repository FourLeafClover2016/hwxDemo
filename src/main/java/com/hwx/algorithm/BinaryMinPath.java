package com.hwx.algorithm;

/**
 * 二叉树的最短路径
 */
public class BinaryMinPath {
    public static int minPath(TreeNode root) {
        if(root == null ) {
            return 0;
        }
        if (root.leftChild == null) {
            return minPath(root.rightChild) + 1;
        }
        if (root.rightChild == null) {
            return minPath(root.leftChild) + 1;
        }
        return Math.min(minPath(root.leftChild), minPath(root.rightChild)) + 1;
    }
}
