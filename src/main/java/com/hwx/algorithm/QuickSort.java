package com.hwx.algorithm;

import java.util.Arrays;
import java.util.Random;

/**
 * 快速排序，双边排序和单边排序
 */
public class QuickSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
        quickSort2(arr, 0, 9);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 双边排序
     */
    public static void quickSort(int[] arr, int startIndex, int endIndex) {

        if (startIndex >= endIndex) {
            return;
        }
        int boundIndex = partition(arr, startIndex, endIndex);
        quickSort(arr, startIndex, boundIndex - 1);
        quickSort(arr, boundIndex + 1, endIndex);
    }

    public static int partition(int[] arr, int leftIndex, int rightIndex) {
        int baseIndex = leftIndex;
        int baseValue = arr[leftIndex];
        while (leftIndex != rightIndex) {
            while (leftIndex < rightIndex && arr[rightIndex] > baseValue) {
                rightIndex--;
            }
            while (leftIndex < rightIndex && arr[leftIndex] <= baseValue) {
                leftIndex++;
            }

            if (leftIndex < rightIndex) {
                int temp = arr[rightIndex];
                arr[rightIndex] = arr[leftIndex];
                arr[leftIndex] = temp;
            }
        }

        arr[baseIndex] = arr[leftIndex];
        arr[leftIndex] = baseValue;

        return leftIndex;
    }


    /**
     * 单边排序
     */
    public static void quickSort2(int[] arr, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }
        int boundIndex = partition2(arr, startIndex, endIndex);
        quickSort2(arr, startIndex, boundIndex - 1);
        quickSort2(arr, boundIndex + 1, endIndex);
    }

    public static int partition2(int[] arr, int leftIndex, int rightIndex) {
        int baseIndex = leftIndex;
        int baseValue = arr[baseIndex];
        int mark = leftIndex;
        for (int i = leftIndex; i <= rightIndex; i++) {
            if (baseValue > arr[i]) {
                mark++;
                int temp = arr[mark];
                arr[mark] = arr[i];
                arr[i] = temp;
            }
        }
        arr[baseIndex] = arr[mark];
        arr[mark] = baseValue;
        return mark;
    }


}
