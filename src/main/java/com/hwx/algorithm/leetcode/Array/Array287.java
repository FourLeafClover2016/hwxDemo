package com.hwx.algorithm.leetcode.Array;

public class Array287 {
    public static int findDuplicate(int[] nums) {
        int slow = nums[0], fast = nums[nums[0]];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        int index = 0;
        while (true) {
            index = nums[index];
            slow = nums[slow];
            if (index == slow) {
                break;
            }
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,1,3,4,2};
        System.out.println(findDuplicate(nums));
    }
}
