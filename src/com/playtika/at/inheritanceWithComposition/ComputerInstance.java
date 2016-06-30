package com.playtika.at.inheritanceWithComposition;

public class ComputerInstance implements Actions {

    private Keyboard keyboard;
    private Monitor monitor;
    private Mouse mouse;
    private Tower tower;

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Tower getTower() {
        return tower;
    }

    public void setTower(Tower tower) {
        this.tower = tower;
    }

    @Override
    public void calculate() {
        System.out.println("1 + 1 = " + 2);
    }

    @Override
    public void playGames() {
        System.out.println("Playing Need for Speed");
    }

    @Override
    public void playMovies() {
        System.out.println("watching Star Wars");
    }

    @Override
    public void inputText() {
        System.out.println("Input some text . ... ");
    }
}
