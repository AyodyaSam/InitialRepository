package com.javaTuition.Arrays;

import java.util.Arrays;

/**
 *The purpose of this program is to learn about arrays and methods.
 * @author Ayodya
 */
public class ArrayMethod {
    public static void main(String[] args) {
        int[] scores = {2, 3, 4, 5, 6, 7};
        fill(scores,10);
        System.out.println(Arrays.toString(scores));
    }

    public static void fill(int[] scores, int n){
        for(int i = 0; i < scores.length;i++){
            scores[i] = n;
        }
    }
}
