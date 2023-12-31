package com.streams.interviews;

import java.util.OptionalInt;

public class LargestOddNumberInString {
    private boolean isOdd(int s) {
        System.out.println(s);
        return s % 2 != 0;
    }

    //Find the max Odd in the string
    @SuppressWarnings("unused")
    public int findMaxOddInString(String str) {
        OptionalInt max = str.chars().mapToObj(Character::getNumericValue).filter(this::isOdd).mapToInt(v -> v).max();
        return max.orElse(0);
    }

    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--)
            if (num.charAt(i) % 2 != 0)
                return num.substring(0, i + 1);
        return "";
    }
}
