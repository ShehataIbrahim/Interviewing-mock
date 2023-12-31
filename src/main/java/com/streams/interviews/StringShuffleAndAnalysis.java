package com.streams.interviews;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class StringShuffleAndAnalysis {
    public String shuffle(String input) {

        String output = tryShuffle(input);
        while (isProperlyShuffled(input, output) > 0)
            output = tryShuffle(input);
        return output;
    }

    private String tryShuffle(String input) {
        char[] inputAsArray = input.toCharArray();
        int length = inputAsArray.length;

        Random random = new Random();
        Set<Integer> swapped = new HashSet<>(length);
        for (int i = 0; i < length; i++) {
            if (swapped.contains(i))
                continue;
            int rand;
            do {
                rand = random.nextInt(length);
            } while (swapped.contains(rand) && rand != i);
            swap(inputAsArray, i, rand);
            swapped.add(rand);
        }
        return new String(inputAsArray);
    }

    private float isProperlyShuffled(String input, String out) {
        float numberOfNoneShuffled = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == out.charAt(i))
                numberOfNoneShuffled++;
        }
        return numberOfNoneShuffled / input.length();
    }


    private void swap(char[] arr, int j, int i) {
        char temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
