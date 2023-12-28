package com.streams.sort;

import org.junit.jupiter.api.Test;

class SelectionSortTest implements SortAlgorithmTest {

    @Test
    void sortOddArray() {
        sortOddArray(new SelectionSort());
    }

    @Test
    void sortEvenArray() {
        sortEvenArray(new SelectionSort());
    }
}