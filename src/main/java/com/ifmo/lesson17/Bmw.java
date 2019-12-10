package com.ifmo.lesson17;

public class Bmw implements Car {

    @Override
    public int power() {
        return 120;
    }

    @Override
    public int maxSpeed() {
        return 250;
    }
}
