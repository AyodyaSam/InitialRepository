package com.javaTuition.Arrays;

import java.util.Arrays;

/**
 * The purpose of this program is to add a new element to an array
 */
public class HowToInsertAnElement {
    public static void main(String[] args) {

        int[] values = {45, 78, 90, 23, 14, 0};

        int currentSize = 5;

        currentSize ++;

        int current = currentSize - 3;

        for(int i = currentSize-1;i > current;i--){
            values[i] = values[i-1];
            currentSize--;
        }

        values[current] = 67;

        System.out.println(Arrays.toString(values));




    }
}
