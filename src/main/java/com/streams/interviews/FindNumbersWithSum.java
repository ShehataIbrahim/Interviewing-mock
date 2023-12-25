package com.streams.interviews;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindNumbersWithSum {
    public static void main(String[] args) {
        Integer[] input = {1, 2, 3, 4, 1, 2, 0, 5, 5, 6, 7, 8, 9, 10, 11, 12};
        findNumbersWithSum(input, 10);
    }
    public static void findNumbersWithSum(Integer[] arr, int sum) {
        Arrays.sort(arr);
        int j = arr.length - 1;
        int i = 0;
        Map<Integer, Integer> matches = new HashMap<>();
        while (i < arr.length && j > 0 && j != i) {
            if (arr[i] + arr[j] == sum) {
                if (arr[j] > arr[i]) matches.put(arr[i], arr[j]);
                else matches.put(arr[j], arr[i]);
                i++;
                j--;
            } else if (arr[i] + arr[j] > sum) {
                j--;
            } else i++;

        }
        if(matches.isEmpty()) System.out.println("No Matches");
        else
            matches.entrySet().forEach(e -> System.out.println(String.format("%s , %s", e.getKey(), e.getValue())));
    }
}
