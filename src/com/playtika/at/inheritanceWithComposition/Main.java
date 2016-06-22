package com.playtika.at.inheritanceWithComposition;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();

        car.left.openDoor();
        car.engine.start();
        car.left.openWindow();
        car.right.closeWindow();

        car.wheels[0].inflate(20);
        car.wheels[2].inflate(35);
        car.left.closeDoor();

        car.moveForward();
        car.stop();
        car.engine.stop();
    }
}
