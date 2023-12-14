package com.streams;

import com.google.common.collect.Comparators;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public interface SortAlgorithmTest {
    default void sortOddArray(SortAlgorithm sorter, Integer[] array) {
        LocalDateTime timeBefore = LocalDateTime.now();
        sorter.sort(array);
        LocalDateTime timeAfter = LocalDateTime.now();
        Arrays.stream(array).forEach(i -> System.out.print(i + " "));
        System.out.println();
        System.out.println(ChronoUnit.NANOS.between(timeBefore, timeAfter));
        assertTrue(Comparators.isInOrder(List.of(array), Comparator.naturalOrder()));
    }

    default void sortOddArray(SortAlgorithm sorter) {
        Integer[] array = {9, 3, -1, 5, 13, 4, 2};
        sortOddArray(sorter, array);
    }

    default void sortEvenArray(SortAlgorithm sorter) {
        Integer[] array = {9, 3, -1, 5, 13, 4, 2,-2};
        sortOddArray(sorter, array);
    }
}
