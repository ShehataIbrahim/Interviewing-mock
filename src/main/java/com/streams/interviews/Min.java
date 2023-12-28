package com.streams.interviews;

public class Min {
    public int min(Integer[] nums) {
        int min = nums[0];
        int size = nums.length;
        for (int i = 1; i < (nums.length / 2 + 1); i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (size - i > i && nums[size - i] < min) {
                min = nums[size - 1];
            }
        }
        return min;
    }
}
