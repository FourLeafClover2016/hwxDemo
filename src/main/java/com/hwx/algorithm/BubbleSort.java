package com.hwx.algorithm;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {
    /**
     * 冒泡排序
     * @param arr
     */
    public static void sort(int[] arr) {
        for (int i = 0, len = arr.length; i < len - 1; i++) {
            for (int j = 0; j < len -1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    /**
     * 冒泡排序优化1
     * @param arr
     */
    public static void sort1(int[] arr) {
        boolean exchangeFlag = false;
        for (int i = 0, len = arr.length; i < len - 1; i++) {
            for (int j = 0; j < len -1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    exchangeFlag = true;
                }
            }
            if (!exchangeFlag) {
                break;
            }
            exchangeFlag = false;
        }
    }

    /**
     * 冒泡排序优化2
     * @param arr
     */
    public static void sort2(int[] arr) {
        boolean exchangeFlag = false;
        int boundIndex = arr.length - 1;
        for (int i = 0, len = arr.length; i < len - 1; i++) {
            int tmpIndex = 0;
            for (int j = 0; j < boundIndex; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    exchangeFlag = true;
                    tmpIndex = j;
                }
            }
            boundIndex = tmpIndex;

            if (!exchangeFlag) {
                break;
            }
            exchangeFlag = false;
        }
    }


    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 8, 2, 10, 3};
        sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr1 = {3, 4, 5, 6, 10, 7, 8};
        sort1(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {3, 4, 2, 1, 6, 7, 8};
        sort2(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
