package com.playtika.at.inheritanceWithComposition;

public class Wheel {

    private int bar;
    private int wheelNumber;

    public void inflate(int bar) {
        this.bar = bar;
        System.out.println("wheel " + wheelNumber +
                " inflated up to " + this.bar + " bar.");
    }

    public Wheel(int wheelNumber) {
        this.wheelNumber = wheelNumber + 1;
    }
}
