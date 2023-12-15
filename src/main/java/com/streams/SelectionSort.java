package com.streams;
/**
 * Time Complexity
 * Happy case:     Ω(n^2)
 * Average case:   θ(n^2)
 * Worst case:     O(n^2)
 * Space Complexity
 * O(1)
 **/
public class SelectionSort implements SortAlgorithm{
    @Override
    public void sort(Integer[] arr) {
        selectSort(arr,0);
    }
    private boolean selectSort(Integer[] arr,int startIndex)
    {
        if(startIndex==arr.length)
            return true;
        int minimum=startIndex;
        for (int i = startIndex+1; i < arr.length; i++) {
            if(arr[i]<arr[minimum])
                minimum=i;
        }
        if(minimum==startIndex)
            return true;
        swap(arr,minimum,startIndex);
        return selectSort(arr,++startIndex);
    }
}
