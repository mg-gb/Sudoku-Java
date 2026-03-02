package com.project.sudoku.board;
import java.util.*;

public class EasyBoard extends SudokuBoard{

    @Override
    public void generateBoard() {
        fillBoard();
        removeNumbers(40);
    }

    private int[] getRandomNumbers(){
        int numbers[] = {1,2,3,4,5,6,7,8,9};
        Random rand = new Random();
        for(int i = numbers.length - 1;i > 0;i--){
            int j = rand.nextInt(i + 1);
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }
        return numbers;
    }

    private boolean fillBoard(){
        MoveValidator validator = new MoveValidator();
        for(int i = 0;i < GRID_SIZE;i++){
            for(int j = 0;j < GRID_SIZE;j++){
                if(board[i][j] == 0){
                    int[] numbers = getRandomNumbers();
                    for(int num : numbers){
                        if(validator.isValidMove(board, i, j, num)) {
                            board[i][j] = num;

                            if(fillBoard()) return true;
                            board[i][j] = 0;
                        }
                    }
                    return false;
                }
            }

        }
        return true;
    }

    private void removeNumbers(int zeroes){
        Random rand = new Random();
        int i = 0;

        while(i < zeroes){
            int rows = rand.nextInt(GRID_SIZE);
            int cols = rand.nextInt(GRID_SIZE);

            if(board[rows][cols] != 0) {
                board[rows][cols] = 0;
                i++;
            }
        }

    }
}
