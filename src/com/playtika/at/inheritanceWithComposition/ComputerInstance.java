package com.playtika.at.inheritanceWithComposition;

public class ComputerInstance extends ComputerTasks {

    Keyboard keyboard;
    Monitor monitor;
    Mouse mouse;
    Tower tower;

    ComputerInstance(){

        keyboard = new Keyboard();
        monitor = new Monitor();
        mouse = new Mouse();
        tower = new Tower();
    }
}
