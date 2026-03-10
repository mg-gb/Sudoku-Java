package com.project.sudoku.board;

public class MoveValidator {

    public boolean isValidMove(int[][] board, int[][] solvedBoard, int row, int col, int num){
        if (!isWithinBounds(row, col, num)) return false;

        if (board[row][col] != 0) return false;

        if(!isSafe(board, row, col, num)) return false;

        return solvedBoard[row][col] == num;
    }

    public boolean isSafe(int[][] board, int row, int col, int num) {
        for(int c = 0; c < SudokuBoard.GRID_SIZE; ++c) {
            if (board[row][c] == num) {
                return false;
            }
        }

        for(int r = 0; r < SudokuBoard.GRID_SIZE; ++r) {
            if (board[r][col] == num) {
                return false;
            }
        }

        int startRow = row - row % 3;
        int startCol = col - col % 3;

        for(int r = startRow; r < startRow + 3; ++r) {
            for(int c = startCol; c < startCol + 3; ++c) {
                if (board[r][c] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean solveBoard(int[][] board) {
        int n = board.length;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (board[row][col] == 0) {
                    for (int num = 1; num <= n; num++) {
                        if (isSafe(board, row, col, num)) {
                            board[row][col] = num;
                            if (solveBoard(board)) return true;
                            board[row][col] = 0;
                        }
                    }
                    return false;
                }
            }
        }

        return true;
    }

    private boolean isWithinBounds(int row, int col, int num) {
        return row >= 0 && row < SudokuBoard.GRID_SIZE
                && col >= 0 && col < SudokuBoard.GRID_SIZE
                && num >= 1 && num <= 9;
    }

}
