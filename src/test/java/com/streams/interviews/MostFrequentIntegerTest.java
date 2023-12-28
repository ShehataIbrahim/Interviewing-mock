package com.streams.interviews;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MostFrequentIntegerTest {

    @Test
    void findMostFrequentInteger() {
        Integer[] input = {1, 2, 3, 4, 1, 2, 0, 5, 5, 6, 7, 8, 9, 10, 11, 12};
        int out = new MostFrequentInteger().findMostFrequentInteger(input);
        assertEquals(1,out);
    }
}