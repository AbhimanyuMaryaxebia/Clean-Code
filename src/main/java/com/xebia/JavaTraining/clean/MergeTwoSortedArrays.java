package com.xebia.JavaTraining.clean;

public class MergeTwoSortedArrays {

    public int[] mergeArrays(int[] array1, int[] array2, int[] array3) {
        int i = 0, j = 0, k = 0;
        int firstArrayLength = array1.length;
        int secondArrayLength = array2.length;
        while (i < firstArrayLength && j < secondArrayLength) {

            // Compare each elements of both the arrays, smaller elements is inserted to 3rd Array, and index is incremented

            if (array1[i] < array2[j])
                array3[k++] = array1[i++];
            else
                array3[k++] = array2[j++];
        }

        // Store remaining elements of first array & Second Array Respectively
        while (i < firstArrayLength)
            array3[k++] = array1[i++];
        while (j < secondArrayLength)
            array3[k++] = array2[j++];

        return array3;
    }

}
