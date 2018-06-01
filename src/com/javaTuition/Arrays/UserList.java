package com.javaTuition.Arrays;

/**
 * The purpose of this program is to run through an array for the usernames
 * @author Ayodya
 */
public class UserList {
    public static void main(String[] args) {
        String [] userNames = {"Mark33","Bill61", "Elon46"};

        //this for loop will run through the array to print out the names in the array
        for(int i = 0;i < userNames.length ; i++){
            System.out.println("User "+(i+1)+" = "+userNames[i]);
        }

    }
}
