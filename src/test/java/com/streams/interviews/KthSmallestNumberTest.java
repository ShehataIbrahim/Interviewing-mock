package com.streams.interviews;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KthSmallestNumberTest {
    @Test
    void findSmallest() {
        Integer[] array = {9, -3, -1, -5, -13, 4, 2,-2};
        int number=new KthSmallestNumber().findSmallest(array, 3);
        assertEquals(-3,number);
    }
}