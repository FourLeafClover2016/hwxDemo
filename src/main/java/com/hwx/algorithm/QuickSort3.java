package com.hwx.algorithm;

import java.util.*;

public class QuickSort3 {
    private static final String start = "start";
    private static final String end = "end";

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
        Stack<Map<String, Integer>> quickStack = new Stack<>();
        Map<String, Integer> parMap = new HashMap<>();
        parMap.put(start, left);
        parMap.put(end, right);
        quickStack.push(parMap);
        while (!quickStack.empty()) {
            Map<String, Integer> pop = quickStack.pop();
            int baseIndex = partition(arr, pop.get(start), pop.get(end));
            if (pop.get(start) < baseIndex - 1) {
                Map<String, Integer> leftMap = new HashMap<String, Integer>();
                leftMap.put(start, pop.get(start));
                leftMap.put(end, baseIndex - 1);
                quickStack.push(leftMap);
            }
            if (pop.get(end) > baseIndex + 1) {
                Map<String, Integer> rightMap = new HashMap<String, Integer>();
                rightMap.put(start, baseIndex + 1);
                rightMap.put(end, pop.get(end));
                quickStack.push(rightMap);
            }

        }


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
