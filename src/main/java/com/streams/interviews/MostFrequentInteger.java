package com.streams.interviews;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MostFrequentInteger {
    public static void main(String[] args) {
        Integer[] input = {1, 2, 3, 4, 1, 2, 0, 5, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println(findMostFrequentInteger(input));
    }

    public static int findMostFrequentInteger(Integer[] arr) {
        if (arr == null || arr.length == 0) throw new IllegalArgumentException("Array is empty");
        Map<Integer, Integer> calculatedFrequency = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            Integer key = arr[i];
            int frequency = 1;
            if (calculatedFrequency.containsKey(key)) frequency = calculatedFrequency.get(key) + 1;
            calculatedFrequency.put(key, frequency);
        }
        return Collections.max(calculatedFrequency.entrySet(), Map.Entry.comparingByValue()).getKey();

    }
}
