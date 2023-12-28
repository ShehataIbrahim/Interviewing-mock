package com.streams.sort;

/**
 * Time Complexity
 * Happy case:     Ω(n)
 * Average case:   θ(n^2)
 * Worst case:     O(n^2)
 * Space Complexity
 * O(1)
 **/
public class InsertionSort implements SortAlgorithm {
    @Override
    public void sort(Integer[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
