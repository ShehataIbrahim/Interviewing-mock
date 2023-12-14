package com.streams;

public class HeapSort implements SortAlgorithm {
    @Override
    public void sort(Integer[] arr) {
        int N = arr.length;
        // Build heap (rearrange array)
        for (int i = N / 2 - 1; i >= 0; i--)
            toHeap(arr, N, i);
        //Extract elements from heap
        for (int i = N - 1; i > 0; i--) {
            swap(arr, 0, i);
            toHeap(arr, i, 0);
        }
    }

    private void toHeap(Integer[] arr, int N, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < N && arr[l] > arr[largest]) largest = l;
        if (r < N && arr[r] > arr[largest]) largest = r;
        if (largest != i) {
            swap(arr, i, largest);
            toHeap(arr, N, largest);
        }
    }

}
