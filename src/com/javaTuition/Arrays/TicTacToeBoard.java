package com.javaTuition.Arrays;

/**
 *The purpose of this program is to print a tic-tac-toe board
 * @author Ayodya
 */
public class TicTacToeBoard {
    public static void main(String[] args) {
        final int ROWS = 3;
        final int COLUMNS = 3;

        String[][] ticTacToe = new String[ROWS][COLUMNS];

        ticTacToe[0][2] = "x";

        for(int i = 0;i < ROWS;i++){
            for(int j = 0;j < COLUMNS;j++){
                System.out.print(ticTacToe[i][j]+" ");
            }
            System.out.println();
        }


    }
}
