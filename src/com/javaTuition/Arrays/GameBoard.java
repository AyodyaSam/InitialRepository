package com.javaTuition.Arrays;

import java.util.Arrays;

/**
 * The purpose of this program is to print a game board
 * @author Ayodya
 */
public class GameBoard {
    public static void main(String[] args) {
        final int ROWS = 8;
        final int COLUMNS = 8;

        int[][] board = new int [ROWS][COLUMNS];

        for(int i = 1; i < ROWS;i++){
            for(int j = 0; j < COLUMNS;j++){
                if(board[i][j] == (i+j) % 2){
                    board[i][j] = 0;
                }else{
                    board[i][j] = 1;
                }
                System.out.print(board[i][j] + "   ");
            }
            System.out.println();
        }


    }
}
