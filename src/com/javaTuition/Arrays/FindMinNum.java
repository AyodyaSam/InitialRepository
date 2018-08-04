package com.javaTuition.Arrays;

/**
 * The porpose os this program is to find the minimum number in the array
 * @author Ayodya
 */
public class FindMinNum {
    public static void main(String[] args) {
        int[] values = {4, 6, 2, 3, 7};
        int smallest = values[0];

        /*for(int i = 1;i < values.length; i++ ){
            if(values[i] < smallest){
                smallest = values[i];
            }
        }*/

        for(int i:values){
            if(i < smallest){
                smallest = i;
            }
        }

        System.out.println("Smallest value in values: "+smallest);

    }
}
