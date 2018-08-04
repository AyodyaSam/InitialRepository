package com.javaTuition.Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * The purpose of this program is to find coursework grades
 */
public class CourseworkMarker {
    public static void main(String[] args) {
        final int MARK = 6;
        Scanner input = new Scanner(System.in);
        int[] marks = new int[MARK];
        int count = 0;

        while (count < marks.length) {
            System.out.println("What was your coursework grade: ");
            while (!input.hasNextInt()) {
                System.out.println("Invalid input. Please enter a an integer between 0 and 100: ");
                input.next();
            }
            int grade = input.nextInt();
            if(grade < 0 || grade > 100){
                System.out.println("**Invalid Grade** Please enter again");
            }else{
                marks[count] = grade;
                count++;
            }
        }

        //calculate the total + highest mark
        int total = 0;
        int max = marks[0];
        for(int i = 0;i<marks.length;i++){
            total = total + marks[i];
            if (marks[i] > max){
                max = marks[i];
            }
        }

        //calculate average
        int average = total/marks.length;

        System.out.println("Highest mark = "+max);
        System.out.println("Average = "+average);




        System.out.println(Arrays.toString(marks));
    }
}
