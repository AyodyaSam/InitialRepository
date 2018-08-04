package com.javaTuition.Arrays;

import java.util.Scanner;

/**
 * Monthly rainfall figures in mm for a given location
 * declare a suitable array to hold the data specified,
 * and write a for statement which will print out all the data in the array.
 * @author Ayodya
 */
public class RainfallArray {
    public static void main(String[] args) {
        final int MONTH_NUMBER = 12;
        int[] rainFall = new int[MONTH_NUMBER];

        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};

        Scanner input = new Scanner(System.in);

        //this loop will ask input from the user for what the rainfall will be and append it to the list

        System.out.println("To the nearest WHOLE NUMBER");

        for(int i = 0; i < rainFall.length;i++){
            System.out.println("Enter the average rainfall for "+months[i]+" : ");
            int rain = input.nextInt();
            rainFall[i] = rain;
        }

        System.out.println("Rainfall for the year: ");
        for(int j = 0; j < rainFall.length; j++){
            System.out.print(months[j]);
            System.out.print("   --------------   ");
            System.out.println(rainFall[j]);
        }

    }
}
