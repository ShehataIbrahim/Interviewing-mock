package com.streams.interviews;

import java.util.Random;

public class RandomStringGenerator {
    public String generateRandomString() {

        Random rand = new Random();

        String str = rand.ints(48, 123)

                .filter(num -> (num < 58 || num > 64) && (num < 91 || num > 96))

                .limit(15)

                .mapToObj(c -> (char) c).collect(StringBuffer::new, StringBuffer::append, StringBuffer::append)

                .toString();
        System.out.println(str);
        return str;

    }
}
