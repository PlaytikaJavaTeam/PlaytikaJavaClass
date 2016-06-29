package com.playtika.at.inheritanceWithComposition;

class Mouse {

    private String brand;
    private boolean wireless;

    Mouse(String brand, boolean wireless) {

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
