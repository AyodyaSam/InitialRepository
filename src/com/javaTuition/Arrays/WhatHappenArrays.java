package com.javaTuition.Arrays;

/**
 * The purpose this program is to see what happens to the array in the homework exercise
 * @author Ayodya
 */
public class WhatHappenArrays {
    public static void main(String[] args) {
        int[] arr = new int[10] ;
        for (int i = 0; i < 10; i++)
        {
            arr[i] = i ;
            System.out.println(arr[i]);
            // prints all numbers from 0 to 9
        }

    }
}
