package com.javaTuition.Arrays;

import java.util.Arrays;

/**
 * The purpose of this program is to remove an element from an array
 * @author Ayodya
 */
public class RemoveAnArray {
    public static void main(String[] args) {
        int[] values = {50, 90, 25, 45, 62};

        int currentSize = values.length;
        //25
        for(int i = 3;i < values.length;i++){
            values[i - 1] = values[i];
        }
        currentSize--;


        System.out.println(Arrays.toString(values));


    }
}
