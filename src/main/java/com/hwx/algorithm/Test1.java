package com.hwx.algorithm;

import java.util.LinkedList;

public class Test1 {
    public static void main(String[] args) {
        LinkedList<Integer> inputList = new LinkedList<>();
        inputList.add(3);
        inputList.add(2);
        inputList.add(9);
        inputList.add(null);
        inputList.add(10);
        inputList.add(null);
        inputList.add(null);
        inputList.add(8);
        inputList.add(null);
        inputList.add(4);
        TreeNode binaryTree = createBinaryTree(inputList);
    }

    public static TreeNode createBinaryTree(LinkedList<Integer> inputList) {
        TreeNode node = null;
        if (inputList == null || inputList.isEmpty()) {
            return null;
        }
        Integer data = inputList.removeFirst();
        if (data != null) {
            node = new TreeNode(data);
            node.leftChild = createBinaryTree(inputList);
            node.rightChild = createBinaryTree(inputList);
        }
        return node;
    }
}
