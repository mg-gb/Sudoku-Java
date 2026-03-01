package com.project.sudoku.board;

public class EasyBoard {
    /*
     * generateBoard()
     * Main method to generate an easy puzzle.
     * Steps:
     * 1. Fill the board completely with valid numbers
     * 2. Remove 40 numbers to create empty cells (zeros)
     */

    /*
     * getRandomNumbers()
     * ------------------
     * Returns a shuffled array of numbers 1–9.
     * Used to randomize number placement for variety.
     */

    /*
     * fillBoard()
     * ------------
     * Recursively fills the board with valid numbers.
     * Uses backtracking:
     * - Picks a cell
     * - Tries numbers in random order
     * - Validates using MoveValidator
     * - Recursively continues until board is full
     *
     * Returns true if board is completely filled, false otherwise.
     */

    /*
     * removeNumbers(int zeroes)
     * --------------------------
     * Removes a number of cells to create empty spots (zeros).
     * - Chooses random row and column
     * - Sets the cell to 0 if it isn’t already
     * - Repeats until desired number of zeros is reached
     *
     * Parameter:
     * zeroes - number of cells to remove
     */
}
