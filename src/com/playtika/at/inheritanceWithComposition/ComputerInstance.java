package com.playtika.at.inheritanceWithComposition;

public class ComputerInstance {

    private Keyboard keyboard;
    private Monitor monitor;
    private Mouse mouse;
    private Tower tower;

    public ComputerInstance(Keyboard keyboard, Monitor monitor, Mouse mouse, Tower tower) {
        this.keyboard = keyboard;
        this.monitor = monitor;
        this.mouse = mouse;
        this.tower = tower;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Tower getTower() {
        return tower;
    }
}
