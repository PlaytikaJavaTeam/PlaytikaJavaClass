package com.playtika.at.inheritanceWithComposition;

public class EntryPoint  {

    public static void main(String[] args) {

        Keyboard keyboard = new Keyboard("Logitech" , true);
        Monitor monitor = new Monitor("LG", 21);
        Mouse mouse = new Mouse("Microsoft", true);
        Tower tower = new Tower("Nvidia", 8, "Intel", 500);

        ComputerInstance instance = new ComputerInstance(keyboard, monitor, mouse, tower);
    }
}
