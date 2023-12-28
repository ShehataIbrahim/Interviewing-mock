package com.streams.sort;

import com.google.common.collect.Comparators;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public interface SortAlgorithmTest {
    default void sortOddArray(SortAlgorithm sorter, Integer[] array) {
        System.out.println("--------" + sorter.getClass().getSimpleName() + "--------");
        System.out.print("Input Array: ");
        Arrays.stream(array).forEach(i -> System.out.print(i + " "));
        System.out.println();
        sorter.sort(array);
        System.out.print("Output Array: ");
        Arrays.stream(array).forEach(i -> System.out.print(i + " "));
        System.out.println();
        assertTrue(Comparators.isInOrder(List.of(array), Comparator.naturalOrder()));
    }

    default void sortOddArray(SortAlgorithm sorter) {
        Integer[] array = {9, 3, -1, 5, 13, 4, 2};
        sortOddArray(sorter, array);
    }

    default void sortEvenArray(SortAlgorithm sorter) {
        Integer[] array = {9, 3, -1, 5, 13, 4, 2, -2};
        sortOddArray(sorter, array);
    }
}
