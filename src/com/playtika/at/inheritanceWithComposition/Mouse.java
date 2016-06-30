package com.playtika.at.inheritanceWithComposition;

class Mouse {

    private String brand;
    private boolean wireless;

    public String getBrand() {
        return brand;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    @Override
    public String toString(){
        return "Mouse: " + brand;
    }
}
