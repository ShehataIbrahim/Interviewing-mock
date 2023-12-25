package com.streams.interviews;

import com.streams.HeapSort;

public class KthSmallestElement {
    public static void main(String[] args) {
        Integer[] nums= {1,5,7,6,4,3,2};
        new HeapSort().sort(nums);
        System.out.println(nums[1]);
    }
}
