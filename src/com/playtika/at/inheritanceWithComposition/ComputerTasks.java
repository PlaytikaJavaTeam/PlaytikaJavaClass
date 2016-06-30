package com.playtika.at.inheritanceWithComposition;

class ComputerTasks implements Actions {

    @Override
    public void calculate() {
        System.out.println("Make some calculation.....result.");
    }

    @Override
    public void playGames() {
        System.out.println("Playing Tetris...");
    }

    @Override
    public void playMovies() {
        System.out.println("Playing Rambo 3.");
    }

    @Override
    public void inputText() {
        System.out.println("Input some text....");
    }
}
