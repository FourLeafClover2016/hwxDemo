package com.hwx.algorithm;

import java.util.Arrays;
import java.util.Random;

/**
 * 堆排序
 */
public class HeapSort {

    public static void downAjust(int arr[], int parentIndex, int len) {
        int temp = arr[parentIndex];
        int childIndex = parentIndex * 2 + 1;

        while (childIndex < len) {
            if (childIndex + 1 < len && arr[childIndex] < arr[childIndex + 1]) {
                childIndex++;
            }
            if (temp >= arr[childIndex]) {
                break;
            }
            arr[parentIndex] = arr[childIndex];
            parentIndex = childIndex;
            childIndex = parentIndex * 2 + 1;
        }
        arr[parentIndex] = temp;
    }

    public static int[] buildMaxHeap() {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(15);
        }

        for (int i = (arr.length - 2) / 2; i >= 0; i--) {
            downAjust(arr, i, arr.length);
        }
        return arr;
    }

    public static void sort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            downAjust(arr, 0, i);
        }
    }

    public static void main(String[] args) {
        int arr[] = buildMaxHeap();
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));


    }
}
