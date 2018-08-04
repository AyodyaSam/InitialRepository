package com.javaTuition.Arrays;

import java.util.Arrays;

/**
 * The purpose of this program is to increase the size of an array
 * @author Ayodya
 */
public class CopyArraySize {
    public static void main(String[] args) {
        String[] name = {"Hey", "Ayodya","this","is", "you","in","an", "array", "!"};

        String[] newName = Arrays.copyOf(name,3*(name.length));

        name = newName;

    }
}
