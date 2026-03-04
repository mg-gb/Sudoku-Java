package com.project.sudoku.game;

/*
Player class
-stores player info and statistics
 */

public class Player {
    private String name;
    private int mistakes;
    private int hintsUsed;

    public Player(String name) {
        this.name = name;
        this.mistakes = 0;
        this.hintsUsed = 0;
    }

    public String getName() {
        return name;
    }

    public int getMistakes() {
        return mistakes;
    }

    public int getHintsUsed() {
        return hintsUsed;
    }

    public void addMistake() {
        mistakes++;
    }

    public void useHint() {
        hintsUsed++;
    }

    public void displayStats() {
        System.out.println("\n===== Player Stats =====");
        System.out.println("Name: " + name);
        System.out.println("Mistakes: " + mistakes);
        System.out.println("Hints Used: " + hintsUsed);
    }
}
