package com.javaTuition.Arrays;

/**
 * The purpose of this program is to print the sum of numbers in an array
 * @author Ayodya
 */
public class SumArrayNum {
    public static void main(String[] args) {
        //Array = numbers
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};



        int total = 0;

        for(int i = 0; i < numbers.length;i++){
            int mark = numbers[i];
            System.out.print(" "+numbers[i]);
             total += mark;

        }

        System.out.println();

        System.out.println("The total is "+total);
    }
}
