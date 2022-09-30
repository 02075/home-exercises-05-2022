package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = new char[3][3];
    static Scanner keyboard = new Scanner(System.in);
    static int sign = 1;
    public static void main(String[] args) {
        int row, column;

        initBoard();
        do {
            displayBoard();
            System.out.println("choose your location (row, column):");
            row = keyboard.nextInt();
            column = keyboard.nextInt();
            makeAMove(row, column, sign);
        } while (true);
    }
    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }
    public static void makeAMove(int row, int column, int sign){
            if (board[row][column] == ' ') {
                if (sign == 1) {
                    board[row][column] = 'O';
                    TicTacToe.sign *= -1;
                } else{
                    board[row][column] = 'X';
                    TicTacToe.sign *= -1;
                }
            } else {
                System.out.println("Illegal move.");
            }
            for (int i = 0; i < 3; i++) {
                if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
                    System.out.println(board[i][0] + " wins!");
                    System.exit(0);
                } else if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][1] != ' ') {
                    System.out.println(board[i][0] + " wins!");
                    System.exit(0);
                } else if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
                    System.out.println(board[0][0] + " wins!");
                    System.exit(0);
                } else if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[1][1] != ' ') {
                    System.out.println(board[0][2] + " wins!");
                    System.exit(0);
                }
            }
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }
}