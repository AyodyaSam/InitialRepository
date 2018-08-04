package com.javaTuition.Arrays;

/**
 * The purpose of this program is to print out seperators for the elements of the array
 * @author Ayodya
 */
public class SeperateArrayElements {
    public static void main(String[] args) {
        int[] values = {4, 6, 2, 3, 7};

        for(int i = 0; i < values.length; i++){
            if(i > 0){
                System.out.print("|");
            }
            System.out.print(values[i]);

        }

        /*for(int i = 0; i < values.length; i++){
            System.out.print(values[i]);
            if(i < (values.length -1)){
                System.out.print("|");
            }
        }*/
    }
}
