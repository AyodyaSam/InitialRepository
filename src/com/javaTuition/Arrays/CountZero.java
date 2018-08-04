package com.javaTuition.Arrays;

/**
 * The purpose of the program is to print out how many zeros is there in the array
 * @author Ayodya
 */
public class CountZero {
    public static void main(String[] args) {
        String[] numbers = {"one", "two", "Zero", "three", "zero", "Four", "Zero"};

        int count = 0;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] .equals("Zero")){
                count ++;
            }
        }

        System.out.println("Number of Zeros in numbers = "+count);
    }
}
