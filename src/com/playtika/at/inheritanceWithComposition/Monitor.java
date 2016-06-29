package com.playtika.at.inheritanceWithComposition;

class Monitor {

    private String brand;
    private int screenSize;

    Monitor(String brand, int screenSize) {

        this.brand = brand;
        this.screenSize = screenSize;
    }

    public String getBrand() {
        return brand;
    }

    public int getScreenSize() {
        return screenSize;
    }
}
