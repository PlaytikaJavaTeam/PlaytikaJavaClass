package com.playtika.at.inheritanceWithComposition;

public class Window {

    private String window;

    public Window(String window) {
        this.window = window;
    }
    public void openWindow(){
        System.out.println(window + " window opened.");
    }
    public void closeWindow(){
        System.out.println(window + " window closed.");
    }
}
