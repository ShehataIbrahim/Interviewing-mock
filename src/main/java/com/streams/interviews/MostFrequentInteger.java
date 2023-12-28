package com.streams.interviews;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MostFrequentInteger {
    public int findMostFrequentInteger(Integer[] arr) {
        if (arr == null || arr.length == 0) throw new IllegalArgumentException("Array is empty");
        Map<Integer, Integer> calculatedFrequency = new HashMap<>();

        for (Integer key : arr) {
            int frequency = 1;
            if (calculatedFrequency.containsKey(key)) frequency = calculatedFrequency.get(key) + 1;
            calculatedFrequency.put(key, frequency);
        }
        return Collections.max(calculatedFrequency.entrySet(), Map.Entry.comparingByValue()).getKey();

    }
}
