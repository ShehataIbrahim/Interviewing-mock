package com.streams;
/**
 * Time Complexity
 * Happy case:     Ω(n log(n))
 * Average case:   θ(n log(n))
 * Worst case:     O(n^2)
 * Space Complexity
 * O(n)
 **/
public class QuickSort implements SortAlgorithm{
    @Override
    public void sort(Integer[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(Integer[] arr, int low, int high) {
        if (low < high && high < arr.length) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private int partition(Integer[] arr, int low, int high) {

        int pivot = arr[high];
        int k = low - 1;
        for (int i = low; i < high; i++) {
            if (arr[i] < pivot) {
                k++;
                swap(arr, k, i);
            }
        }

        k++;
        swap(arr, high, k);
        return k;
    }

    private void swap(Integer[] arr, int k, int i) {
        int temp = arr[k];
        arr[k] = arr[i];
        arr[i] = temp;
    }
}
