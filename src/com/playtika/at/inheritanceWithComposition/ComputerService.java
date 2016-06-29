package com.playtika.at.inheritanceWithComposition;

public class ComputerService extends Computer {

    public ComputerService(Keyboard keyboard, Monitor monitor, Mouse mouse, Tower tower, Computer computer) {
        keyboard.getBrand();
        monitor.getBrand();
    }

    private void Computer(Computer computer) {

    }
}
