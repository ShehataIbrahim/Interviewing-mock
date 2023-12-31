package com.streams.interviews;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestOddNumberInStringTest {

    @Test
    void largestOddNumber() {
        String s = "504367359";
        var largestOddNumber=new LargestOddNumberInString();
        String max = largestOddNumber.largestOddNumber(s);
        assertEquals("504367359",max);
        s = "5043673590";
        max = largestOddNumber.largestOddNumber(s);
        assertEquals("504367359",max);
    }
}