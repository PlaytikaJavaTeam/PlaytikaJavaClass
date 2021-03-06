package com.playtika.at.inheritanceWithComposition;

class Monitor {

    private String brand;
    private int screenSize;

    public Monitor(String brand, int screenSize) {
        this.brand = brand;
        this.screenSize = screenSize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
}
