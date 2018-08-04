package com.javaTuition.Arrays;

import java.util.Arrays;

/**
 * The purpose of this program is to print out an array with an undefined size
 * @author Ayodya
 */
public class DisplayArray {
    public static void main(String[] args) {
        display(2);
        display(2,4,5,6);
        display(3,4);
    }

    public static void display(int... values){
        System.out.println(Arrays.toString(values));
    }
}
