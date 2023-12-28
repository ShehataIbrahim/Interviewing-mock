package com.streams.interviews;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindUniqueValueTest {

    @Test
    void findUniqueValue() {
        Integer[] input = {1, 2, 3, 4, 1, 2, 3, 5, 4, 6, 7, 8, 6, 7, 8,5,11,10,11};
        int out = new FindUniqueValue().findUniqueValue(input);
        assertEquals(10,out);
    }
}