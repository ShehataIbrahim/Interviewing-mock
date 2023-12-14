package com.streams;

import org.junit.jupiter.api.Test;

class SelectionSortTest implements SortAlgorithmTest {

    @Test
    void sort() {
        sort(new SelectionSort());
    }
}