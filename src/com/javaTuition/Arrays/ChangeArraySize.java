package com.javaTuition.Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * The purpose of this program is to stop the companion variable problem
 * @author Ayodya
 */
public class ChangeArraySize {
    public static void main(String[] args) {
        final int NUMBER = 20;

        double[] values = new double[NUMBER];

        Scanner input = new Scanner(System.in);

        int companionVariable = 0;

        while(input.hasNextDouble() && companionVariable < values.length){
            System.out.println("Enter Number");
            //values = input.nextDouble();
            companionVariable ++;
            if(companionVariable >= values.length){
                //int newValues[] = Arrays.copyOf(values,2*values);
            }
        }



    }
}
