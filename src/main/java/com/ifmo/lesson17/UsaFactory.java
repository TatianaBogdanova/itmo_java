package com.ifmo.lesson17;

public class UsaFactory extends Factory {
    @Override
    public Car createCar() {
        return new Bmw() {
            @Override
            public int power() {
                return 110;
            }

            @Override
            public int maxSpeed() {
                return 220;
            }
        };
    }
}
