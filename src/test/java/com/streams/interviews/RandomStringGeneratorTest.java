package com.streams.interviews;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomStringGeneratorTest {

    @Test
    void generateRandomString() {
        RandomStringGenerator generator = new RandomStringGenerator();
        for (int i = 0; i < 10; i++) {
            assertNotEquals(generator.generateRandomString(), generator.generateRandomString());
        }
    }
}