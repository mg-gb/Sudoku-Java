package com.project.sudoku.solver;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HintSystem {
    private final Random rand = new Random();
    
    public Hint getHint(int[][] board, int[][] solvedBoard){
        List<int[]> emptyCells = collectEmptyCells(board);

        if(emptyCells.isEmpty()) return null;

        int index = rand.nextInt(emptyCells.size());
        int pos[] = emptyCells.get(index);
        int hintRow = pos[0];
        int hintCol = pos[1];
        int hintNum = solvedBoard[hintRow][hintCol];

        return new Hint(hintRow, hintCol, hintNum);

    }

    private List<int[]> collectEmptyCells(int[][] board){
        List<int[]> emptyCells = new ArrayList<>();

        for(int i = 0;i < board.length;i++){
            for(int j = 0;j < board[i].length;j++){
                if(board[i][j] == 0) emptyCells.add(new int[]{i, j});
            }
        }
        return emptyCells;
    }

}
