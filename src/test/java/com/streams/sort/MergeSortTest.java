package com.streams.sort;

import org.junit.jupiter.api.Test;

class MergeSortTest implements SortAlgorithmTest {

    @Test
    void sortOddArray() {
        sortOddArray(new MergeSort());
    }

    @Test
    void sortEvenArray() {
        sortEvenArray(new MergeSort());
    }
}