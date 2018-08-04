package com.javaTuition.Arrays;

/**
 * The purpose of this program is to do a linear search using a for loop
 * @author  Ayodya
 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] values = {50, 90, 25, 45, 62};

        int searchValue = 45;

        int pos;

        boolean found = false;

        for(pos = 0; pos < values.length && !found; pos++){
            if(values[pos] == searchValue){
                found = true;

            }


        }

        System.out.println("Found it!!! Value = "+values[pos-1]);


    }
}
