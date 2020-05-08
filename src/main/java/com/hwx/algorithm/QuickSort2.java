package com.hwx.algorithm;

import java.util.Arrays;
import java.util.Random;

public class QuickSort2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, 9);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int baseIndex = partition(arr, left, right);
        quickSort(arr, left, baseIndex - 1);
        quickSort(arr, baseIndex + 1, right);
    }

    public static int partition(int[] arr, int left, int right) {
        int mark = left;
        int base = arr[left];
        for (int i = left + 1; i <= right; i++) {
            if (arr[i] < base) {
                mark++;
                int tmp = arr[i];
                arr[i] = arr[mark];
                arr[mark] = tmp;
            }
        }
        arr[left] = arr[mark];
        arr[mark] = base;
        return mark;
    }
}
