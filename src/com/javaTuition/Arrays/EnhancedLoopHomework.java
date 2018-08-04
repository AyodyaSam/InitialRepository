package com.javaTuition.Arrays;

public class EnhancedLoopHomework {
    public static void main(String[] args) {
        int [] values = {2, 3, 5};

        int n = 1;

        for(int i: values ){
            System.out.println("Element "+n+" = "+i);
            n++;
        }
    }
}
