package com.streams.sort;

import org.junit.jupiter.api.Test;

class QuickSortTest implements SortAlgorithmTest {

    @Test
    void sortOddArray() {
        sortOddArray(new QuickSort());
    }

    @Test
    void sortEvenArray() {
        sortEvenArray(new QuickSort());
    }
}