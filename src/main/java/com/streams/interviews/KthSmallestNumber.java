package com.streams.interviews;

/**
 * This uses InsertionSort with Exit Criteria to Enhance performance
 */
public class KthSmallestNumber {
    public int findSmallest(Integer[] arr, int stop) {
        int[] newArray = new int[stop + 1];
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = (i < stop) ? i - 1 : stop - 1;
            while (j >= 0 && newArray[j] > key) {
                newArray[j + 1] = newArray[j];
                j--;
            }
            newArray[j + 1] = key;
        }
        return newArray[stop - 1];
    }
}
