package com.playtika.at.inheritanceWithComposition;

public class Door extends Window {

    public Door(String door) {
        super(door);
    }

    public void openDoor(){
        System.out.println("Door opened.");
    }
    public void closeDoor(){
        System.out.println("Door closed.");
    }
}
