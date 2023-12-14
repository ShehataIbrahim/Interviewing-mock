package com.streams;

import com.google.common.collect.Comparators;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class QuickSortTest {

    @Test
    void validateArrayIsSorted() {
        Integer[] array = {9, 3, -1, 5, 13, 4, 2};
        QuickSort sorter = new QuickSort();
        LocalDateTime timeBefore = LocalDateTime.now();
        sorter.sort(array);
        LocalDateTime timeAfter = LocalDateTime.now();
        System.out.println(ChronoUnit.NANOS.between(timeBefore, timeAfter));
        assertTrue(Comparators.isInOrder(List.of(array), Comparator.naturalOrder()));
    }
}