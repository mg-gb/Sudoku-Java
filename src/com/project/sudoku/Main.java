package com.project.sudoku;

import com.project.sudoku.game.GameController;

public class Main {
    public static void main(String[] args){
        GameController controller = new GameController();
        //starts the game
        controller.startGame();
    }
}
