package com.project.sudoku.board;

public abstract class SudokuBoard {

    final static int GRID_SIZE = 9;
    protected int[][] board;
    public SudokuBoard(){
        board = new int[GRID_SIZE][GRID_SIZE];
    }

    // generate og board na naay proper layout
    public abstract void generateBoard();
    public void display(){
        System.out.println("      1  2  3     4  5  6     7  8  9");
        for(int i = 0;i < 9;i++){

            if(i % 3 == 0) {
                System.out.println("----------------------------------------------");
            }
            for(int j = 0;j < 9;j++){
                if(j == 0) System.out.print(i + 1 + " ");
                if(j % 3 == 0) System.out.print(" | ");
                System.out.print(" " + board[i][j] + " ");
            }
            System.out.print(" | ");
            System.out.println();
        }
        System.out.println("----------------------------------------------");
    }

    // return true of complete
    public boolean isComplete(){
        for(int i = 0;i < GRID_SIZE;i++){
            for(int j = 0;j < GRID_SIZE;j++){
                if(board[i][j] == 0) return false;
            }
        }
        return true;
    }

    public int[][] getBoard(){ return this.board;}
    public void setNumber(int row, int col, int num){
        this.board[row][col] = num;
    }
}
