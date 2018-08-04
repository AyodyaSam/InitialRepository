package com.javaTuition.Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * The grades (A-F) gained in a piece of coursework by the 30 students in a given class.
 * @author Ayodya
 */
public class GradesList {
    public static void main(String[] args) {
        final int STUDENTS = 30;

        String[] grades = new String[STUDENTS];

        Scanner input = new Scanner(System.in);

        for(int i = 0;i < grades.length;i++){
            System.out.println("Enter your grade: ");
            String score = input.nextLine();
            score.toUpperCase();
            grades[i] = score;
        }

        for(int j = 0; j < grades.length;j++){
            System.out.print(grades[j]);
            if(j < (grades.length -1)) {
                System.out.print("|");
            }
        }

        System.out.println();
        System.out.println(Arrays.toString(grades));
    }
}
