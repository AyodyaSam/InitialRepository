package com.javaTuition.Arrays;

import java.util.Arrays;

/**
 * The purpose of this program is to binary sort an array
 * @author Ayodya
 */
public class BinarySortArray {
    public static void main(String[] args) {
        int [] values = {5, 6, 12, 8, 1, 9};

        Arrays.sort(values);

        int low = 0;
        int high = values.length - 1;
        int position = 0;
        int searchValue = 12;
        boolean found = false;

        while(low <= high && !found){
            position = (low + high)/2;
            if(values[position] == searchValue){
                found = true;
            }else if(values[position] < searchValue){
                position = low ++;
            }else{
                position = high--;
            }
        }

        if(!found){
            System.out.println("Value NOT found.");
        }else{
            System.out.println("Value FOUND!!");
        }
    }
}
