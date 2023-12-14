package com.streams;

import org.junit.jupiter.api.Test;

class MergeSortTest implements SortAlgorithmTest {

    @Test
    void sort() {
        sort(new MergeSort());
    }
}