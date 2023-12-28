package com.streams.interviews;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinTest {

    @Test
    void min() {
            Integer[] nums = {1, 5, 7, -2, 4, 3, 2, 0,-1};
            int min=new Min().min(nums);
            assertEquals(-2,min);
    }
}