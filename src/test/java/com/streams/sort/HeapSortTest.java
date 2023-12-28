package com.streams.sort;

import org.junit.jupiter.api.Test;

class HeapSortTest implements SortAlgorithmTest {

    @Test
    void sortOddArray() {
        sortOddArray(new HeapSort());
    }

    @Test
    void sortEvenArray() {
        sortEvenArray(new HeapSort());
    }
}