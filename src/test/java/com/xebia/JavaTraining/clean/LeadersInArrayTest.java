package com.xebia.JavaTraining.clean;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeadersInArrayTest {

    @Test
    void printLeaders() {
        LeadersInArray leaders = new LeadersInArray();
        int array1[]={16, 17, 4, 3, 5, 2};
        int actual=leaders.printLeaders(array1);
        int expected=17;
        assertEquals(expected,actual);
    }
}