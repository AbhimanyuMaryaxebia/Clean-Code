package com.xebia.JavaTraining.clean;

//element is leader if it is greater than all the elements to its right side.
// And the rightmost element is always a leader.

public class LeadersInArray {

    public int printLeaders(int array[]) {
        int sizeOfArray = array.length;
        int max_element_from_right = array[sizeOfArray - 1];

        System.out.print(max_element_from_right + " ");

        for (int i = sizeOfArray - 2; i >= 0; i--) {
            if (max_element_from_right < array[i]) {
                max_element_from_right = array[i];
                System.out.print(max_element_from_right + " ");
            }
        }
        return max_element_from_right;
    }

}
