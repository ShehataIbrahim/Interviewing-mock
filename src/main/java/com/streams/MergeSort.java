package com.streams;

import java.util.Arrays;

/**
 * Time Complexity
 * Happy case:     Ω(n log(n))
 * Average case:   θ(n log(n))
 * Worst case:     θ(n log(n))
 * Space Complexity
 * O(n)
 **/
public class MergeSort implements SortAlgorithm{
    @Override
    public void sort(Integer[] arr) {

        mergeSort(arr, 0, arr.length - 1);
    }

    private void mergeSort(Integer[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);
            merge(array, left, right, middle);
        }
    }

    private void merge(Integer[] array, int left, int right, int middle) {
        middle++;
        Integer[] L = Arrays.copyOfRange(array, left, middle);
        Integer[] R = Arrays.copyOfRange(array, middle, right+1);
        int i = 0;
        int j = 0;
        int k = left;
        while (i < L.length && j < R.length) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < L.length) {
            array[k] = L[i];
            i++;
        }
        while (j < R.length) {
            array[k] = R[j];
            j++;
        }

    }
}
