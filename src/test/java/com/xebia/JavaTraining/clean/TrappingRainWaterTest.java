package com.xebia.JavaTraining.clean;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrappingRainWaterTest {

    @Test
    void maximumWaterStored() {
        TrappingRainWater water = new TrappingRainWater();
        int array[] = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int expected = water.MaximumWaterStored(array.length);
        int actual = 6;
        assertEquals(expected, actual);
    }
}