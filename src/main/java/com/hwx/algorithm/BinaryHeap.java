package com.hwx.algorithm;

import java.util.Arrays;

/**
 * 二叉堆
 */
public class BinaryHeap {

    /**
     * 上浮
     */
    public static void upAjust(int[] arr) {
        int childIndex = arr.length - 1;
        int parentIndex = (childIndex - 1) / 2;
        int tmp = arr[childIndex];
        while (childIndex > 0 && tmp < arr[parentIndex]) {
            arr[childIndex] = arr[parentIndex];
            childIndex = parentIndex;
            parentIndex = (childIndex - 1) / 2;
        }
        arr[childIndex] = tmp;

    }

    /**
     * 下沉
     *
     * @param arr
     * @param parentIndex 需要下沉的父节点
     */
    public static void downAjust(int[] arr, int parentIndex) {
        int length = arr.length;
        int tmp = arr[parentIndex];
        int childIndex = parentIndex * 2 + 1;
        while (childIndex < length) {
            if ((childIndex + 1) < length && arr[childIndex] > arr[childIndex + 1]) {
                childIndex++;
            }
            if (tmp <= arr[childIndex]) {
                break;
            }

            arr[parentIndex] = arr[childIndex];
            parentIndex = childIndex;
            childIndex = parentIndex * 2 + 1;
        }
        arr[parentIndex] = tmp;
    }

    /**
     * 二叉树构建，从最后一个非叶子结点开始，依次下沉
     *
     * @param arr
     */
    public static void buildBinary(int[] arr) {
        for (int i = (arr.length - 2) / 2; i >= 0; i--) {
            downAjust(arr, i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, 5, 7, 8, 9, 10, 0};
        upAjust(arr);
        System.out.println(Arrays.toString(arr));
        int[] arr2 = {7, 1, 3, 10, 5, 2, 8, 9, 6};
        buildBinary(arr2);
        System.out.println(Arrays.toString(arr2));

    }
}
