package com.streams;

public interface SortAlgorithm {
    void sort(Integer[] arr);
    default void swap(Integer[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
