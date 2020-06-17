package com.xebia.JavaTraining.clean;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeTwoSortedArraysTest {

    @Test
    void mergeArrays() {
        MergeTwoSortedArrays testObject = new MergeTwoSortedArrays();

        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8};
        int combinedArrayLength = array1.length + array2.length;
        int[] array3 = new int[combinedArrayLength];
        int expected[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int actual[] = testObject.mergeArrays(array1, array2, array3);
        assertArrayEquals(expected, actual);

    }
}