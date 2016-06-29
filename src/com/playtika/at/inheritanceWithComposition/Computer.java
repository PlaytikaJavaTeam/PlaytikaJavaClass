package com.playtika.at.inheritanceWithComposition;

abstract class Computer implements Actions {

    private Monitor monitor;
    private Mouse mouse;
    private Tower tower;
    private Keyboard keyboard;
    MFU mfu;

    Computer() {
        monitor = new Monitor();
        mouse = new Mouse();
        tower = new Tower();
        keyboard = new Keyboard();
        mfu = new MFU();
    }

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
