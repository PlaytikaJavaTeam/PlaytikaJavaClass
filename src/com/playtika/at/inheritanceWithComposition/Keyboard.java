package com.playtika.at.inheritanceWithComposition;

class Keyboard {

    private String brand;
    private boolean wireless;

    Keyboard(String brand, boolean wireless) {
        this.brand = brand;
        this.wireless = wireless;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isWireless() {
        return wireless;
    }
}
