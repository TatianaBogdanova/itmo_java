package com.ifmo.lesson17;

public class JanapFactory extends Factory {
    @Override
    public Car createCar() {
        return new Car() {
            @Override
            public int power() {
                return 1000;
            }

            @Override
            public int maxSpeed() {
                return 2000;
            }
        };
    }
}
