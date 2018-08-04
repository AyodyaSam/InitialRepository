package com.javaTuition.Arrays;

import java.util.Arrays;

/**
 * The purpose of this program is to print the sum of all scores.
 * @author Ayodya
 */
public class SumScores {
    public static void main(String[] args) {
        double[] scores = {5,9.5,6,7,9,3,10,5.5};

        Arrays.sort(scores);

        double total = 0;

        for(int i = 1;i < (scores.length);i++){
            total = total + scores[i];
            //System.out.println(scores[i]);
        }

        System.out.println("Final quiz score = "+total);

        System.out.println(Arrays.toString(scores));
    }
}
