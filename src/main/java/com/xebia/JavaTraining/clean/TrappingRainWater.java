package com.xebia.JavaTraining.clean;

public class TrappingRainWater {
    static int array[] = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

    public int MaximumWaterStored(int arrayLength) {
        int left[] = new int[arrayLength];
        int right[] = new int[arrayLength];
        int water = 0;
        // Fill left array
        left[0] = array[0];
        for (int i = 1; i < arrayLength; i++)
            left[i] = Math.max(left[i - 1], array[i]);

        // Fill right array
        right[arrayLength - 1] = array[arrayLength - 1];
        for (int i = arrayLength - 2; i >= 0; i--)
            right[i] = Math.max(right[i + 1], array[i]);

        for (int i = 0; i < arrayLength; i++)
            water += Math.min(left[i], right[i]) - array[i];

        return water;


    }
}