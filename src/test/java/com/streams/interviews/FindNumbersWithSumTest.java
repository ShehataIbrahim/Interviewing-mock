package com.streams.interviews;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FindNumbersWithSumTest {

    @Test
    void findNumbersWithSum() {
        Integer[] input = {1, 2, 3, 4, 1, 2, 0, 5, 5, 6, 7, 8, 9, 10, 11, 12};
        Map<Integer, Integer> result = new FindNumbersWithSum().findNumbersWithSum(input, 10);
        result.forEach((i,j)-> assertEquals(10,i+j));
        assertEquals(6,result.size());
    }
}