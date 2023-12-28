package com.streams.sort;

/**
 * Time Complexity
 * Happy case:     Ω(n)
 * Average case:   θ(n^2)
 * Worst case:     O(n^2)
 * Space Complexity
 * O(1)
 **/
public class BubbleSort implements SortAlgorithm {

    // An optimized version of Bubble Sort
    @Override
    public void sort(Integer[] arr) {
        bubbleSort(arr, arr.length);
    }

    // An optimized version of Bubble Sort
    private void bubbleSort(Integer[] arr, int n) {
        boolean progressing = true;

        for (int i = 0; i < n && progressing; i++) {
            progressing = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    progressing = true;
                }
            }
        }
    }
}
