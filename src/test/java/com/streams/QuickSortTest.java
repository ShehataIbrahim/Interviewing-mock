package com.streams;

import com.google.common.collect.Comparators;
import com.google.common.collect.Ordering;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class QuickSortTest {

    @Test
    void validateArrayIsSorted() {
        Integer arr[] = {4, -1, 0, -5, 6};
        QuickSort sorter = new QuickSort();
        LocalDateTime timeBefore = LocalDateTime.now();
        arr = sorter.sort(arr);
        LocalDateTime timeAfter = LocalDateTime.now();
        System.out.println(ChronoUnit.NANOS.between(timeBefore, timeAfter));
        assertTrue(Comparators.isInOrder(List.of(arr), (o1, o2) -> o1<o2?-1: (o1==o2?0:1)));
    }
}