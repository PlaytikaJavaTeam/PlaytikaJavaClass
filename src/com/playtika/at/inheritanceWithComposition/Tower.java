package com.playtika.at.inheritanceWithComposition;

class Tower {

    private String processor;
    private int ram;
    private String videoCard;
    private int hardDrive;

    Tower(String processor, int ram, String videoCard, int hardDrive) {

        this.processor = processor;
        this.ram = ram;
        this.videoCard = videoCard;
        this.hardDrive = hardDrive;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public int getHardDrive() {
        return hardDrive;
    }
}
