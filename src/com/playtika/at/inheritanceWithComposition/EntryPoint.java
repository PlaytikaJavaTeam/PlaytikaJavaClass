package com.playtika.at.inheritanceWithComposition;

public class EntryPoint  {

    public static void main(String[] args) {

        Keyboard keyboard = new Keyboard();
        keyboard.setBrand("Logitech");
        keyboard.setWireless(true);

        Monitor monitor = new Monitor();
        monitor.setScreenSize(21);
        monitor.setBrand("LG");

        Mouse mouse = new Mouse();
        mouse.setBrand("Microsoft");
        mouse.setWireless(true);

        Tower tower = new Tower();
        tower.setVideoCard("Nvidia");
        tower.setHardDrive(500);
        tower.setRam(8);
        tower.setProcessor("Intel");

        ComputerInstance instance = new ComputerInstance();
        instance.setKeyboard(keyboard);
        instance.setMonitor(monitor);
        instance.setMouse(mouse);
        instance.setTower(tower);
    }
}
