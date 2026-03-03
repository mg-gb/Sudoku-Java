package com.project.sudoku.board;

public abstract class SudokuBoard {
    protected int[][] board = new int[9][9];

    public abstract void generateBoard();

    public void display() {
        System.out.println("    1 2 3   4 5 6   7 8 9");
        System.out.println("  +-------+-------+-------+");

        for(int row = 0; row < 9; ++row) {
            System.out.print(row + 1 + " | ");

            for(int col = 0; col < 9; ++col) {
                if (this.board[row][col] == 0) {
                    System.out.print(". ");
                } else {
                    System.out.print(this.board[row][col] + " ");
                }

                if ((col + 1) % 3 == 0) {
                    System.out.print("| ");
                }
            }

            System.out.println();
            if ((row + 1) % 3 == 0) {
                System.out.println("  +-------+-------+-------+");
            }
        }

    }

    public boolean isComplete() {
        for(int row = 0; row < 9; ++row) {
            for(int col = 0; col < 9; ++col) {
                if (this.board[row][col] == 0) {
                    return false;
                }
            }
        }

        return true;
    }

    public int[][] getBoard() {
        return this.board;
    }

    public void setNumber(int row, int col, int num) {
        this.board[row][col] = num;
    }
}
