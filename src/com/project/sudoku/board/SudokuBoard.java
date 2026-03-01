package com.project.sudoku.board;

public class SudokuBoard {
    /*
     * Defines the structure and core behavior of a Sudoku board.
     * Provides the grid representation and basic board operations.
     * Puzzle generation must be implemented by subclasses.
     */


    /*
     * board
     * 2D array representing the Sudoku grid.
     * Values range from 1–9.
     * A value of 0 represents an empty cell.
     */


    /*
     * generateBoard()
     * Abstract method that must be implemented by subclasses.
     * Responsible for generating or loading a valid Sudoku puzzle.
     */

    /*
     * display()
     * ----------
     * Prints the board in a formatted layout.
     * Includes row and column labels and separators
     * for every 3x3 subgrid.
     */

    /*
     * isComplete()
     * -------------
     * Checks if the board has no empty cells.
     * Returns true if all cells are filled (no 0 values),
     * otherwise returns false.
     * Note: Does not check if the solution is correct.
     */

    /*
     * getBoard()
     * -----------
     * Returns the entire 2D board array.
     * Allows other classes (e.g., Solver or Game)
     * to access the current board state.
     */

    /*
     * setNumber(row, col, num)
     * -------------------------
     * Sets a number in a specific cell.
     * Does not validate whether the move is legal.
     * Validation should be handled in the Game or Solver class.
     */
}
