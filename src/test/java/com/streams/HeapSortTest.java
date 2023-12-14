package com.streams;

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