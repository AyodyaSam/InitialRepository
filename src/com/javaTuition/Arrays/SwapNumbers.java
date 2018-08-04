package com.javaTuition.Arrays;

import java.util.Arrays;

/**
 * The purpose of this program is to swap 2 elements in an array
 * @author Ayodya
 */
public class SwapNumbers {
    public static void main(String[] args) {
        int[] numbers = {5, 6, 7, 8};

        //After swapping -> {6, 5, 7, 8}

        swap(numbers,0,1);

        System.out.println(Arrays.toString(numbers));


    }

    public static void swap(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
