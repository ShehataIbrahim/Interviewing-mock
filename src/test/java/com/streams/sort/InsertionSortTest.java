package com.streams.sort;

import org.junit.jupiter.api.Test;

class InsertionSortTest implements SortAlgorithmTest {

    @Test
    void sortOddArray() {
        sortOddArray(new InsertionSort());
    }

    @Test
    void sortEvenArray() {
        sortEvenArray(new InsertionSort());
    }
}