package com.streams;

import com.google.common.collect.Comparators;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    void sort() {
        Integer[] arrr = {9, 3, 1, 5, 13};
        MergeSort mergeSort=new MergeSort();
        mergeSort.sort(arrr);
        Arrays.stream(arrr).forEach(i-> System.out.print(i+" "));
        assertTrue(Comparators.isInOrder(List.of(arrr), Comparator.naturalOrder()));
    }
}