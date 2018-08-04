package com.javaTuition.Arrays;

import java.util.Scanner;

/**
 * The purpose of this program is to search an array for the input given
 * @author Ayodya
 */
public class LinearSearchData {
    public static void main(String[] args) {
        final int NUMBER = 10;
        int[] numbers = new int[NUMBER];

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 10 numbers");
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Enter a number: ");
            while (!input.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer (Number without decimals): ");
                input.next();
            }
            int n = input.nextInt();
            numbers[i] = n;
        }

        System.out.print("Enter number to be found: ");
        while (!input.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer (Number without decimals): ");
            input.next();
        }
        int numberSearch = input.nextInt();
        boolean getOffLoop = false;
//        for(int j = 0; j < numbers.length;j++){
//            if(numberSearch == numbers[j]){
//                System.out.println("Found at position "+j);
//                getOffLoop = true;
//            }
//            if(numberSearch != numbers[j]){
//                getOffLoop = true;
//            }
//        }

        int count = 0;
        while(!getOffLoop && count < numbers.length){
            if(numberSearch == numbers[count]){
                getOffLoop = true;
            }else{
                count++;

            }

        }

        if(getOffLoop = true){
            System.out.println("Number found at position "+count);
        }else{
            System.out.println("-Number not found-");
        }
    }
}
