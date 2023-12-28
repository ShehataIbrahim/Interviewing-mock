package com.streams.sort;

import org.junit.jupiter.api.Test;

class BubbleSortTest implements SortAlgorithmTest {

    @Test
    void sortOddArray() {
        sortOddArray(new BubbleSort());
    }

    @Test
    void sortEvenArray() {
        sortEvenArray(new BubbleSort());
    }
}
