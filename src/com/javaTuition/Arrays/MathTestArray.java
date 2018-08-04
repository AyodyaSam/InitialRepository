package com.javaTuition.Arrays;

import java.util.Scanner;

/**
 * The purpose of this program is to find out the actual number of students who sat an exam
 * @author Ayodya
 */
public class MathTestArray {
    public static void main(String[] args) {
        final int STUDENTS = 50;

        int [] mathStudents = new int[STUDENTS];

        int actualNumber = 0;

        Scanner input = new Scanner(System.in);


        System.out.println("What was your exam grade: ");
        while(input.hasNextInt()){
            System.out.println("Enter your exam grade: ");
            if(actualNumber < mathStudents.length){
                mathStudents[actualNumber] = input.nextInt();
                actualNumber++;
            }
        }

        for(int i = 0;i < mathStudents.length;i++){
            if(mathStudents[i] > 0){
                System.out.println("Student " + (i+1)+ " marks: "+mathStudents[i]);
            }

        }

        System.out.println(016);




    }
}
