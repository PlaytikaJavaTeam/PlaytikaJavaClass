package com.playtika.at.inheritanceWithComposition;

class MFU {

    private String brand;

    public String getBrand() {
        return brand;
    }

    public MFU(String brand){
        this.brand = brand;
    }

    void print() {
        System.out.println("Printing some papers...");
    }

    void scan() {
        System.out.println("Scanning some pictures...");
    }
}
