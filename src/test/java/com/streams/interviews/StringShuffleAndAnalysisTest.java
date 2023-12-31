package com.streams.interviews;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringShuffleAndAnalysisTest {

    @Test
    void shuffle() {
        String input="Hello World";
        StringShuffleAndAnalysis shuffler = new StringShuffleAndAnalysis();
        String result=shuffler.shuffle(input);
        System.out.println(result);
        assertNotEquals(input,result);
    }
}