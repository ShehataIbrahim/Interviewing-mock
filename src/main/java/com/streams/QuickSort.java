package com.streams;

import java.util.Arrays;

public class QuickSort {
    public Integer[] sort(Integer[] arr) {
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    private void quickSort(Integer[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            System.out.println(pi + "\t" + Arrays.asList(arr) + "\t" + low + "\t" + high);
            quickSort(arr, low, pi - 1);
            System.out.println("\t" + Arrays.asList(arr) + "\t" + low + "\t" + (pi - 1));
            quickSort(arr, pi + 1, high);
            System.out.println("\t" + Arrays.asList(arr) + "\t" + (pi + 1) + "\t" + high);
        }
    }

    private void swap(Integer[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private int partition(Integer[] arr, int low, int high) {
        int middle = (high - low) == 1 ? high : (high - low) / 2;
        int pivot = arr[middle], i = (low - 1);
        for (int j = low; j <= high - 1; j++)
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        swap(arr, i + 1, middle);
        return (i + 1);
    }
}
