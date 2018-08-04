package com.javaTuition.Arrays;

import java.util.ArrayList;

/**
 * The purpose of this program is to print prime numbers below
 * @author  Ayodya
 */
public class DynamicArrays {
    public static void main(String[] args) {
        ArrayList<Integer> prime = new ArrayList<>();

        prime.add(2);
        prime.add(3);
        prime.add(5);
        prime.add(7);
        prime.add(11);

        System.out.println("The first 5 prime numbers are: "+prime);

        System.out.println("I made a change");


        System.out.println("The size of this list is = "+prime.size());
    }
}
