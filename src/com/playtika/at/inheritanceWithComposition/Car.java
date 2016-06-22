package com.playtika.at.inheritanceWithComposition;

public class Car implements Movable {

    Engine engine = new Engine();
    Wheel[] wheels = new Wheel[4];
    public Door left = new Door("left");
    public Door right = new Door("right");

    public Car() {
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel(i);
        }
    }

    @Override
    public void stop() {
        System.out.println("car stopped.");
    }

    @Override
    public void moveForward() {
        System.out.println("car moving....");
    }
}
